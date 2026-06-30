package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes8.dex */
public class r extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16472xf5823d43 f230005d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16472xf5823d43 activityC16472xf5823d43, com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.p pVar) {
        this.f230005d = activityC16472xf5823d43;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f230005d.f229769m).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s) ((java.util.ArrayList) this.f230005d.f229769m).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s) ((java.util.ArrayList) this.f230005d.f229769m).get(i17)).f230010a;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16472xf5823d43 activityC16472xf5823d43 = this.f230005d;
        if (view == null) {
            int itemViewType = getItemViewType(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.u(activityC16472xf5823d43, null);
            if (itemViewType == 1) {
                view2 = android.view.LayoutInflater.from(activityC16472xf5823d43.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bvv, viewGroup, false);
                ((android.view.ViewGroup) view2).getChildAt(0).setId(com.p314xaae8f345.mm.R.id.m7j);
                uVar.f230027a = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view2.findViewById(com.p314xaae8f345.mm.R.id.jil);
                uVar.f230028b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.jin);
                uVar.f230029c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.jij);
                uVar.f230030d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) view2.findViewById(com.p314xaae8f345.mm.R.id.jim);
                uVar.f230031e = view2.findViewById(com.p314xaae8f345.mm.R.id.jik);
                uVar.f230033g = view2.findViewById(com.p314xaae8f345.mm.R.id.jii);
                uVar.f230032f = (android.view.ViewGroup) view2;
                uVar.f230027a.m75397xc185581c(true);
            } else {
                view2 = android.view.LayoutInflater.from(activityC16472xf5823d43.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bvw, viewGroup, false);
                uVar.f230028b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.jio);
                uVar.f230032f = (android.view.ViewGroup) view2;
            }
            view2.setTag(uVar);
        } else {
            view2 = view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s) ((java.util.ArrayList) activityC16472xf5823d43.f229769m).get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.u uVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.u) view2.getTag();
        uVar2.getClass();
        int i18 = sVar.f230010a;
        if (i18 == 1) {
            r45.y55 y55Var = sVar.f230011b;
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                java.lang.String str = y55Var.f472342n;
                if (str != null) {
                    uVar2.f230027a.m75396xca029dad(str);
                } else {
                    java.lang.String str2 = y55Var.f472338g;
                    if (str2 != null) {
                        uVar2.f230027a.m75396xca029dad(str2);
                    }
                }
            } else {
                java.lang.String str3 = y55Var.f472338g;
                if (str3 != null) {
                    uVar2.f230027a.m75396xca029dad(str3);
                }
            }
            java.lang.String str4 = y55Var.f472337f;
            if (str4 != null) {
                uVar2.f230028b.setText(str4);
            }
            java.lang.String str5 = y55Var.f472339h;
            if (str5 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                uVar2.f230029c.setVisibility(8);
            } else {
                uVar2.f230029c.setText(y55Var.f472339h);
                uVar2.f230029c.setVisibility(0);
            }
            int i19 = y55Var.f472336e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16472xf5823d43 activityC16472xf5823d432 = uVar2.f230034h;
            if (i19 == 0) {
                uVar2.f230030d.m81392x52cfa5c6(true);
                uVar2.f230030d.setEnabled(true);
                uVar2.f230028b.setTextColor(activityC16472xf5823d432.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f_));
                android.view.View view3 = uVar2.f230033g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i19 == 1) {
                uVar2.f230030d.m81392x52cfa5c6(false);
                uVar2.f230030d.setEnabled(true);
                uVar2.f230028b.setTextColor(activityC16472xf5823d432.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f_));
                android.view.View view4 = uVar2.f230033g;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i19 == 2) {
                uVar2.f230030d.m81392x52cfa5c6(false);
                uVar2.f230030d.setEnabled(false);
                android.view.View view5 = uVar2.f230033g;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            uVar2.f230030d.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t(uVar2, y55Var));
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) uVar2.f230031e.getLayoutParams();
            if (sVar.f230013d) {
                layoutParams.leftMargin = 0;
            } else {
                layoutParams.leftMargin = activityC16472xf5823d432.f229764e;
            }
            uVar2.f230031e.setLayoutParams(layoutParams);
        } else if (i18 == 0) {
            uVar2.f230028b.setText(sVar.f230012c);
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}

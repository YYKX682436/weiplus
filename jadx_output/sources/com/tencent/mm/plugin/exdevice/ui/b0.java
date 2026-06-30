package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes4.dex */
public final class b0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f99405d;

    public b0(java.util.ArrayList arrayList) {
        this.f99405d = arrayList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f99405d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.ArrayList arrayList = this.f99405d;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        return (java.lang.String) arrayList.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.exdevice.ui.a0 a0Var;
        android.view.View view2 = null;
        java.util.ArrayList arrayList = this.f99405d;
        if (arrayList != null && arrayList.size() > 0) {
            java.lang.String str = (arrayList == null || arrayList.size() <= 0) ? null : (java.lang.String) arrayList.get(i17);
            if (view == null) {
                a0Var = new com.tencent.mm.plugin.exdevice.ui.a0(null);
                view2 = android.view.View.inflate(viewGroup.getContext(), com.tencent.mm.R.layout.a9h, null);
                a0Var.f99394b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.cgo);
                a0Var.f99393a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ni9);
                a0Var.f99395c = view2.findViewById(com.tencent.mm.R.id.of8);
                a0Var.f99396d = view2.findViewById(com.tencent.mm.R.id.atf);
                view2.setTag(a0Var);
            } else {
                a0Var = (com.tencent.mm.plugin.exdevice.ui.a0) view.getTag();
                view2 = view;
            }
            a0Var.f99393a.setText(java.lang.Integer.toString(i17 + 1));
            a0Var.f99394b.setText(str);
            if (i17 == 0 && arrayList.size() == 1) {
                android.view.View view3 = a0Var.f99395c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = a0Var.f99396d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i17 == 0) {
                android.view.View view5 = a0Var.f99395c;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(4);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view6 = a0Var.f99396d;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i17 == arrayList.size() - 1) {
                android.view.View view7 = a0Var.f99396d;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList6.add(4);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view8 = a0Var.f99395c;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return view2;
    }
}

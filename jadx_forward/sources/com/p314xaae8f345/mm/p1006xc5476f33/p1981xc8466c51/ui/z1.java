package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class z1 implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf f237143d;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf) {
        this.f237143d = activityC16972xc3ec91bf;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgImageUI$5", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf = this.f237143d;
        activityC16972xc3ec91bf.A++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShowImageUI", "onItemSelected() called with: parent = [" + adapterView + "], view = [" + view + "], position = [" + i17 + "], id = [" + j17 + "]");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = activityC16972xc3ec91bf.f236848i.getItem(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = activityC16972xc3ec91bf.B;
        if (viewOnClickListenerC13625xe5fb4505 != null) {
            viewOnClickListenerC13625xe5fb4505.e();
        }
        if (item.k() == 2) {
            if (bt3.g2.K(item.n(), activityC16972xc3ec91bf.f236851o, activityC16972xc3ec91bf.f236850n)) {
                activityC16972xc3ec91bf.mo54450xbf7c1df6(java.lang.String.format("%d/%d", java.lang.Integer.valueOf(i17 + 1), java.lang.Integer.valueOf(((java.util.LinkedList) activityC16972xc3ec91bf.f236843d).size())));
                activityC16972xc3ec91bf.m78501x43e00957(true);
            } else {
                activityC16972xc3ec91bf.m78501x43e00957(false);
            }
        } else if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb45052 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505) view;
            if ((activityC16972xc3ec91bf.f236848i.getItemViewType(i17) == 15 || activityC16972xc3ec91bf.f236848i.getItemViewType(i17) == 4) && !viewOnClickListenerC13625xe5fb45052.d()) {
                if (i17 != activityC16972xc3ec91bf.f236849m || activityC16972xc3ec91bf.f236862z) {
                    viewOnClickListenerC13625xe5fb45052.m55411x903960f9(false);
                } else {
                    viewOnClickListenerC13625xe5fb45052.m55411x903960f9(true);
                    activityC16972xc3ec91bf.f236862z = true;
                }
                viewOnClickListenerC13625xe5fb45052.f();
                activityC16972xc3ec91bf.B = viewOnClickListenerC13625xe5fb45052;
            }
        }
        android.view.View findViewById = activityC16972xc3ec91bf.findViewById(com.p314xaae8f345.mm.R.id.f566847u40);
        if (findViewById != null && ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(6, 1)) {
            findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), i65.a.b(activityC16972xc3ec91bf.mo55332x76847179(), 16) + com.p314xaae8f345.mm.ui.bl.c(activityC16972xc3ec91bf.mo55332x76847179()));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgImageUI", "setSearchBtnVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/record/ui/RecordMsgImageUI", "setSearchBtnVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (activityC16972xc3ec91bf.I != i17) {
                activityC16972xc3ec91bf.I = i17;
                ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ri(6, 1, tg0.e1.f500594d);
            }
            findViewById.findViewById(com.p314xaae8f345.mm.R.id.gib).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.u1(activityC16972xc3ec91bf));
        } else if (findViewById != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgImageUI", "setSearchBtnVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/record/ui/RecordMsgImageUI", "setSearchBtnVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgImageUI$5", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
    }
}

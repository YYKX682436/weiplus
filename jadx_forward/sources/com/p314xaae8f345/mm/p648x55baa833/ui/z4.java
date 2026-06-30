package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public class z4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc f146242d;

    public z4(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc activityC10348x266bd9bc) {
        this.f146242d = activityC10348x266bd9bc;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc activityC10348x266bd9bc = this.f146242d;
        int i17 = activityC10348x266bd9bc.f145359p;
        if (i17 != 1) {
            if (i17 == 2) {
                java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o(activityC10348x266bd9bc.f145350d.getText().toString().trim());
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(activityC10348x266bd9bc.f145358o, true);
                com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a p17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(activityC10348x266bd9bc.f145358o).p(activityC10348x266bd9bc.f145358o, o17);
                p17.f273781d = new com.p314xaae8f345.mm.p648x55baa833.ui.d5(activityC10348x266bd9bc, n17, o17, p17);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o17) || !o17.equals(n17.P0())) {
                    p17.c(activityC10348x266bd9bc.mo55332x76847179(), activityC10348x266bd9bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC10348x266bd9bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcr), false, false, null);
                } else {
                    db5.e1.u(activityC10348x266bd9bc, activityC10348x266bd9bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574418i45), "", new com.p314xaae8f345.mm.p648x55baa833.ui.u4(activityC10348x266bd9bc, p17), null);
                }
            } else if (i17 == 3) {
                java.lang.String o18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o(activityC10348x266bd9bc.f145350d.getText().toString().trim());
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 4L, 1L, true);
                com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a n18 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(activityC10348x266bd9bc.f145358o).n(activityC10348x266bd9bc.f145358o, c01.z1.r(), o18 != null ? o18 : "");
                n18.f273781d = new com.p314xaae8f345.mm.p648x55baa833.ui.c5(activityC10348x266bd9bc, o18, n18);
                n18.c(activityC10348x266bd9bc, activityC10348x266bd9bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC10348x266bd9bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcr), false, false, null);
            }
        } else {
            java.lang.String o19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o(activityC10348x266bd9bc.f145350d.getText().toString().trim());
            com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a i18 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(activityC10348x266bd9bc.f145358o).i(activityC10348x266bd9bc.f145358o, o19);
            i18.f273781d = new com.p314xaae8f345.mm.p648x55baa833.ui.b5(activityC10348x266bd9bc, o19, i18);
            i18.c(activityC10348x266bd9bc.mo55332x76847179(), activityC10348x266bd9bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC10348x266bd9bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcr), false, false, null);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

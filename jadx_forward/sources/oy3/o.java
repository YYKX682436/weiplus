package oy3;

/* loaded from: classes13.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 f431570d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4) {
        this.f431570d = activityC17256xc70b42d4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4 = this.f431570d;
        activityC17256xc70b42d4.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "save privacy flag");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINOF_WATCH_READ_PRIVACY_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        activityC17256xc70b42d4.D.mo77785xc570fb34(new oy3.v(activityC17256xc70b42d4));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC17256xc70b42d4.f240134s)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosWatchLoginUI", "mac address is empty");
        } else {
            fy3.e eVar = (fy3.e) i95.n0.c(fy3.e.class);
            java.lang.String scanMac = activityC17256xc70b42d4.f240134s;
            my3.q qVar = (my3.q) eVar;
            qVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanMac, "scanMac");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "startLogin scanMac ".concat(scanMac));
            qVar.Ri(fy3.i.f348783i);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274590e, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), iy3.f.class, new my3.m(qVar, scanMac));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

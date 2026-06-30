package my3;

/* loaded from: classes13.dex */
public final class n implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.q f414349d;

    public n(my3.q qVar) {
        this.f414349d = qVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        fy3.i iVar = fy3.i.f348782h;
        my3.q qVar = this.f414349d;
        qVar.Ri(iVar);
        boolean z17 = qVar.f414355e.length() > 0;
        hy3.a aVar = hy3.b.f367604a;
        if (!z17) {
            if (!(qVar.f414354d.length() > 0)) {
                fy3.f fVar = qVar.f414366s;
                if (fVar == null) {
                    qVar.Ri(fy3.i.f348778d);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onStartService");
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4.E;
                com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4 = ((oy3.t) fVar).f431577a;
                activityC17256xc70b42d4.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "handleScanResult");
                fy3.e eVar = (fy3.e) i95.n0.c(fy3.e.class);
                java.lang.String deviceMac = activityC17256xc70b42d4.f240134s;
                java.lang.String avatar = activityC17256xc70b42d4.f240138w;
                my3.q qVar2 = (my3.q) eVar;
                qVar2.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceMac, "deviceMac");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatar, "avatar");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "deviceMac sha256=".concat(deviceMac));
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                if (aVar.b(context)) {
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    java.lang.String a17 = aVar.a(context2, deviceMac);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "handleScanInfo watch newmac=" + a17 + ", avatar is " + avatar);
                    android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                    if (aVar.c(context3, a17)) {
                        qVar2.ij(a17, avatar, true);
                    } else {
                        qVar2.Ri(fy3.i.f348779e);
                        fy3.f fVar2 = qVar2.f414366s;
                        if (fVar2 != null) {
                            ((oy3.t) fVar2).b(9);
                        }
                    }
                } else {
                    qVar2.Ri(fy3.i.f348779e);
                    fy3.f fVar3 = qVar2.f414366s;
                    if (fVar3 != null) {
                        ((oy3.t) fVar3).b(13);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1904, 60);
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1904, 61);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "init callback status " + qVar.f414365r);
        fy3.i iVar2 = qVar.f414365r;
        fy3.i iVar3 = fy3.i.f348783i;
        if (iVar2 == iVar3 || iVar2 == fy3.i.f348784m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosServiceImpl", "logging in");
            return;
        }
        qVar.Ri(iVar3);
        java.lang.String str = qVar.f414354d;
        java.lang.String str2 = qVar.f414355e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "startConnectWatchAndAutoLogin mac:%s username:%s", str, str2);
        android.content.Context context4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        if (!aVar.b(context4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "bluetooth is not enable");
            qVar.nj(str, str2);
            return;
        }
        android.content.Context context5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
        java.lang.String a18 = aVar.a(context5, str);
        android.content.Context context6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context6, "getContext(...)");
        if (aVar.c(context6, a18)) {
            qVar.nj(str, str2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "unBonded need logout and clearBindInfo");
        qVar.Zi(4);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274590e, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), iy3.u.class);
    }
}

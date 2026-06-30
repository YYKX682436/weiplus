package my3;

/* loaded from: classes13.dex */
public final class p implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.q f414351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414353f;

    public p(my3.q qVar, java.lang.String str, java.lang.String str2) {
        this.f414351d = qVar;
        this.f414352e = str;
        this.f414353f = str2;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        int i17 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) obj).f149937d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "try auto login errorCode " + i17);
        if (i17 == -3) {
            rk0.c.a("MicroMsg.Rtos.UnbindReport", "reportUnbindReason: 8", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26126, 3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 8, 0);
            return;
        }
        my3.q qVar = this.f414351d;
        if (i17 == 0) {
            qVar.f414357g.f395150d = 1;
        } else if (i17 != 1) {
            qVar.f414357g.f395150d = 8;
        } else {
            qVar.f414357g.f395150d = 1;
        }
        if (qVar.f414357g.f395150d == 1) {
            java.lang.String str = this.f414352e;
            my3.q.Bi(qVar, str, this.f414353f);
            qVar.Ri(fy3.i.f348784m);
            qVar.mj();
            fy3.f fVar = qVar.f414366s;
            if (fVar != null) {
                ((oy3.t) fVar).c();
            }
            hy3.a aVar = hy3.b.f367604a;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (aVar.b(context)) {
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                qVar.ij(aVar.a(context2, str), "", false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "bluetooth is not enable");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "try auto login fail, clear");
            if (i17 == -2) {
                qVar.Zi(9);
            } else if (i17 != -1) {
                qVar.Zi(5);
            } else {
                qVar.Zi(7);
            }
        }
        qVar.hj(qVar.f414357g);
    }
}

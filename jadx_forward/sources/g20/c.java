package g20;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g20.g f349299d;

    public c(g20.g gVar) {
        this.f349299d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g20.g gVar = this.f349299d;
        boolean Vi = gVar.Vi();
        x02.h Bi = gVar.Bi();
        if (Bi != null) {
            p3380x6a61f93.p3384xf5161200.C30567x21b1f1a0.m169975x21b8999a(((x02.i) Bi).m105978x2737f10(), Vi);
        }
        gVar.f349309g = java.lang.Boolean.valueOf(Vi);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ECS_HAS_REPORT_POI_BOOLEAN_SYNC;
        if (c17.o(u3Var, false)) {
            return;
        }
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
        boolean Ri = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.G);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("0,0,");
        stringBuffer.append(Ri ? 1 : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(37693, stringBuffer);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOrderService", "onAccountInitialized report37693 first time,rptValue:" + ((java.lang.Object) stringBuffer));
    }
}

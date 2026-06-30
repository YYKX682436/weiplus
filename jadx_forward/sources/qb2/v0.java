package qb2;

/* loaded from: classes8.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.r1 f442834d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(qb2.r1 r1Var) {
        super(0);
        this.f442834d = r1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        i50.o oVar = (i50.o) i95.n0.c(i50.o.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((h50.i) oVar).getClass();
        boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(context);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(ip.b.u());
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(ip.b.s());
        qb2.r1 r1Var = this.f442834d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalPushNewXmlConsumer", "[onAppForeground] %s %s %s %s", valueOf, valueOf2, java.lang.Boolean.valueOf(r1Var.n()), java.lang.Boolean.valueOf(Ui));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_APP_PUSH_REPORT_ENABLE_TIME_LONG, java.lang.Long.valueOf(c01.id.c()));
        boolean v17 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().v();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        vd2.t3 t3Var = vd2.t3.f517454a;
        boolean g17 = t3Var.g();
        boolean z17 = !qb2.r1.a(r1Var, 70368744177664L);
        boolean z18 = !qb2.r1.a(r1Var, 9007199254740992L);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        boolean f17 = t3Var.f();
        boolean E = ((c61.l7) i95.n0.c(c61.l7.class)).nk().E();
        boolean z19 = !qb2.r1.a(r1Var, 34359738368L);
        boolean el6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        boolean f07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().f0();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        objArr[1] = java.lang.Integer.valueOf(!ip.b.u() ? 1 : 0);
        objArr[2] = java.lang.Integer.valueOf(!ip.b.s() ? 1 : 0);
        objArr[3] = java.lang.Integer.valueOf(!r1Var.n() ? 1 : 0);
        objArr[4] = java.lang.Integer.valueOf((z19 && el6 && f07) ? 0 : 1);
        java.lang.Object obj = "";
        objArr[5] = (z18 && f17 && E) ? 0 : z18 ? 1 : "";
        if (!f17 && v17 && g17 && z17) {
            obj = 0;
        } else if (!f17 && g17) {
            obj = 1;
        }
        objArr[6] = obj;
        objArr[7] = java.lang.Integer.valueOf(!Ui ? 1 : 0);
        g0Var.d(23497, objArr);
        return jz5.f0.f384359a;
    }
}

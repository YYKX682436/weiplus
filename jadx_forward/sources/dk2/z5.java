package dk2;

/* loaded from: classes3.dex */
public final class z5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f315950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.xf f315951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.k6 f315952f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.s f315953g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f315954h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(gk2.e eVar, dk2.xf xfVar, dk2.k6 k6Var, yz5.s sVar, int i17) {
        super(0);
        this.f315950d = eVar;
        this.f315951e = xfVar;
        this.f315952f = k6Var;
        this.f315953g = sVar;
        this.f315954h = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dk2.xa xaVar = dk2.xa.f315877a;
        gk2.e eVar = this.f315950d;
        xaVar.i(eVar);
        xaVar.j(eVar, null, null);
        xaVar.g(eVar);
        xaVar.d(eVar);
        dk2.xf xfVar = this.f315951e;
        if (xfVar != null) {
            dk2.xf.g(xfVar, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.e1) eVar.a(mm2.e1.class)).f410525v, 2, null, 16, null);
        }
        ((mm2.c1) eVar.a(mm2.c1.class)).f410394p2 = android.os.SystemClock.elapsedRealtimeNanos();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5440x181ea454().e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n8.f183942b = 3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1552L, 20L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorFlowStats", "reportExtrenalSuccLive");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184134c = c01.id.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184132a, this.f315950d, 20, 0, "externalSuccLive", null, 16, null);
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar2 = this.f315950d;
        zl2.r4 r4Var = zl2.r4.f555483a;
        efVar.p0(eVar2, r4Var.w1(), qo0.b.f446919n, null, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
        r4Var.I0().putInt("live_status_flag", 1);
        dk2.k6 k6Var = this.f315952f;
        r45.wp1 wp1Var = k6Var.f315217b;
        r45.kc1 kc1Var = ((mm2.c1) eVar.a(mm2.c1.class)).f410373m;
        wp1Var.set(2, kc1Var != null ? kc1Var.m75945x2fec8307(0) : null);
        ya2.g gVar = ya2.h.f542017a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ya2.b2 b17 = gVar.b(xy2.c.e(context));
        k6Var.f315217b.set(0, java.lang.Integer.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75939xb282bd08(4)));
        k6Var.f315217b.set(3, b17 != null ? b17.w0() : null);
        k6Var.f315217b.set(4, b17 != null ? b17.m176700xe5e0d2a0() : null);
        this.f315953g.v(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(this.f315954h), 0, null, null);
        return jz5.f0.f384359a;
    }
}

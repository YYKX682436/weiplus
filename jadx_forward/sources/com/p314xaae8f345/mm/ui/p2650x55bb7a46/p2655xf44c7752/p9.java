package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class p9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f282804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja f282805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282806f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(0);
        this.f282804d = c0Var;
        this.f282805e = jaVar;
        this.f282806f = f9Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f282804d.f391645d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar = this.f282805e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282806f;
        if (z17 && jaVar.S()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video.tp", "will auto download video [" + f9Var.m124847x74d37ac6() + "].");
            jaVar.f282419d.f282625g.v7(f9Var, false);
        }
        if (jaVar.S()) {
            ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).mj(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), f9Var.Q0());
        }
        return jz5.f0.f384359a;
    }
}

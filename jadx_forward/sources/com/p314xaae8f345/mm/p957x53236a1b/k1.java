package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes8.dex */
public final class k1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152894d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f152895e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f152896f;

    /* renamed from: g, reason: collision with root package name */
    public int f152897g;

    public k1(java.lang.String str, int i17) {
        jz5.g b17 = jz5.h.b(com.p314xaae8f345.mm.p957x53236a1b.j1.f152885d);
        this.f152896f = "";
        if (str == null) {
            return;
        }
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        r45.wz5 wz5Var = new r45.wz5();
        wz5Var.f471136d = currentTimeMillis;
        wz5Var.f471138f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(str);
        wz5Var.f471137e = i17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) b17).mo141623x754a37bb();
        wz5Var.f471139g = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(o4Var != null ? o4Var.j(str) : null);
        com.p314xaae8f345.mm.p957x53236a1b.i1 i1Var = new com.p314xaae8f345.mm.p957x53236a1b.i1();
        this.f152895e = i1Var;
        o45.zg mo47979x2d63726f = i1Var.mo47979x2d63726f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo47979x2d63726f, "null cannot be cast to non-null type com.tencent.mm.protocal.MMTypingSend.Req");
        o45.ni niVar = (o45.ni) mo47979x2d63726f;
        byte[] mo14344x5f01b1f6 = wz5Var.mo14344x5f01b1f6();
        iz5.a.g(null, mo14344x5f01b1f6 != null);
        niVar.f424519a = mo14344x5f01b1f6;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s autoAuth, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(autoAuth, "autoAuth");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        autoAuth.toString();
        this.f152894d = callback;
        return mo9409x10f9447a(autoAuth, this.f152895e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 100017;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f152894d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: uniqueInNetsceneQueue */
    public boolean mo48023x99a7e80c() {
        return true;
    }

    public k1(o45.ah resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        jz5.h.b(com.p314xaae8f345.mm.p957x53236a1b.j1.f152885d);
        this.f152896f = "";
        o45.oi oiVar = (o45.oi) resp;
        java.lang.String str = oiVar.f424525a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getSender(...)");
        this.f152896f = str;
        this.f152897g = oiVar.f424526b;
    }
}

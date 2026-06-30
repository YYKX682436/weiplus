package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public final class u1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33827x366c91de = 1319;

    /* renamed from: NAME */
    public static final java.lang.String f33828x24728b = "operateTingAudio";

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11991xd822b749 f160821g;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y service = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String mo48798x74292566 = service.mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiOperateTingAudio", "operateTingAudio appId:%s", mo48798x74292566);
        if (this.f160821g == null) {
            this.f160821g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11991xd822b749(this, service, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11991xd822b749 c11991xd822b749 = this.f160821g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11991xd822b749);
        c11991xd822b749.R(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11991xd822b749 c11991xd822b7492 = this.f160821g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11991xd822b7492);
        c11991xd822b7492.O(mo48798x74292566);
        if (this.f160821g != null) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 E0 = service.t3().E0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(E0, "getSysConfig(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11991xd822b749 c11991xd822b7493 = this.f160821g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11991xd822b7493);
            c11991xd822b7493.Y(E0.f387385r.f156932d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11991xd822b749 c11991xd822b7494 = this.f160821g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11991xd822b7494);
            c11991xd822b7494.Q(E0.f387374d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11991xd822b749 c11991xd822b7495 = this.f160821g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11991xd822b7495);
            c11991xd822b7495.P(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.a(service));
            java.lang.String a17 = c01.n2.a("AppBrandService#" + service.hashCode());
            c01.l2 c17 = c01.n2.d().c(a17, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
            synchronized (c17) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0) c17.c("AppBrandLifeCycle.Listener", null)) == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.t1 t1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.t1(c17, this, a17);
                    c17.i("AppBrandLifeCycle.Listener", t1Var);
                    c17.i("appId", service.mo48798x74292566());
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11991xd822b749 c11991xd822b7496 = this.f160821g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11991xd822b7496);
                    c11991xd822b7496.X(t1Var);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11982xa07146f8 c11982xa07146f8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11982xa07146f8(this, service, i17);
        c11982xa07146f8.I(i17);
        c11982xa07146f8.H(mo48798x74292566);
        c11982xa07146f8.K(data.toString());
        c11982xa07146f8.d();
    }
}

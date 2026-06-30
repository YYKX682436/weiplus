package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public class e1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33787x366c91de = 47;

    /* renamed from: NAME */
    public static final java.lang.String f33788x24728b = "operateMusicPlayer";

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11980xcda6ee93 f160712g;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11980xcda6ee93 c11980xcda6ee93;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        this.f160712g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11980xcda6ee93(this, c0Var, i17);
        c01.l2 c17 = c01.n2.d().c(c01.n2.a("AppBrandService#" + c0Var.hashCode()), true);
        synchronized (c17) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.w) c17.c("StickyBannerChangeListener", null)) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.t0(this, c17, c0Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = c0Var.t3().E0();
                if (E0 != null) {
                    c17.i("pkgType", java.lang.Integer.valueOf(E0.f387385r.f156932d));
                }
                c17.i("StickyBannerChangeListener", t0Var);
                c17.i("appId", c0Var.mo48798x74292566());
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0) c17.c("AppBrandLifeCycle.Listener", null)) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u0(this, c17, c0Var);
                c17.i("AppBrandLifeCycle.Listener", u0Var);
                this.f160712g.f160572g = u0Var;
            }
            c11980xcda6ee93 = this.f160712g;
            c11980xcda6ee93.getClass();
            c11980xcda6ee93.f160571f = c17;
        }
        c11980xcda6ee93.f160576n = jSONObject.toString();
        this.f160712g.f160577o = c0Var.mo48798x74292566();
        this.f160712g.d();
    }
}

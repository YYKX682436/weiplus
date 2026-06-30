package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class x7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1 f163674a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f163675b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f163676c;

    /* renamed from: d, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s1 f163677d;

    public x7(yz5.a runtimeProvider, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1 r1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtimeProvider, "runtimeProvider");
        this.f163674a = r1Var;
        this.f163675b = "MicroMsg.AppBrand.WxaAudioFocusComponent#" + hashCode();
        this.f163676c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w7(runtimeProvider, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q1
    public boolean a() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t1) ((jz5.n) this.f163676c).mo141623x754a37bb()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f163675b, "abandonFocus, service is null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s1 s1Var = this.f163677d;
        if (s1Var == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t1 t1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t1) ((jz5.n) this.f163676c).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t1Var);
        boolean b37 = t1Var.b3(s1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f163675b, "abandonFocus, abandoned: " + b37);
        if (b37) {
            this.f163677d = null;
        }
        return b37;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q1
    /* renamed from: requestFocus */
    public boolean mo51100x4c4bb389() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t1) ((jz5.n) this.f163676c).mo141623x754a37bb()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f163675b, "requestFocus, service is null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t1 t1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t1) ((jz5.n) this.f163676c).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s1 Gd = t1Var.Gd(this.f163674a);
        boolean a17 = Gd.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f163675b, "requestFocus, gainFocus: " + a17);
        if (a17) {
            this.f163677d = Gd;
        }
        return a17;
    }
}

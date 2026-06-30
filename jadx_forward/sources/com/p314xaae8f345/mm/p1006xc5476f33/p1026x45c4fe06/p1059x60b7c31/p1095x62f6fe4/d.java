package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e8 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f163284g = "MicroMsg.AppBrandAudioFocusService#" + hashCode();

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f163285h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a(this));

    /* renamed from: i, reason: collision with root package name */
    public final f25.g f163286i = f25.g.f340627c;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f163287m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c(this));

    /* renamed from: n, reason: collision with root package name */
    public volatile f25.m0 f163288n;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e8
    public boolean a() {
        f25.m0 m0Var;
        if (((f25.n0) ((jz5.n) this.f163285h).mo141623x754a37bb()) == null || (m0Var = this.f163288n) == null) {
            return false;
        }
        f25.n0 n0Var = (f25.n0) ((jz5.n) this.f163285h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n0Var);
        boolean yg6 = n0Var.yg(m0Var);
        if (yg6) {
            this.f163288n = null;
        }
        return yg6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e8
    public java.lang.String c() {
        return this.f163284g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e8
    public boolean g() {
        if (((f25.n0) ((jz5.n) this.f163285h).mo141623x754a37bb()) == null) {
            return false;
        }
        if (this.f163288n != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f163284g, "requestAudioFocus, requestSession not null");
            return true;
        }
        f25.n0 n0Var = (f25.n0) ((jz5.n) this.f163285h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n0Var);
        f25.m0 m96 = n0Var.m9(this.f163286i, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.b) ((jz5.n) this.f163287m).mo141623x754a37bb());
        g25.e eVar = (g25.e) m96;
        if (eVar.f349513c) {
            this.f163288n = m96;
        }
        return eVar.f349513c;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km5.b f161240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 f161241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.l24 f161242g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f161243h;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, km5.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 w2Var, r45.l24 l24Var, int i17) {
        this.f161239d = yVar;
        this.f161240e = bVar;
        this.f161241f = w2Var;
        this.f161242g = l24Var;
        this.f161243h = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f161239d;
        boolean mo50262x39e05d35 = yVar.mo50262x39e05d35();
        km5.b bVar = this.f161240e;
        if (!mo50262x39e05d35) {
            bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.s.f161257d);
            return;
        }
        int i17 = this.f161243h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 w2Var = this.f161241f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.q2(i17, w2Var, bVar, yVar);
        fl1.g2 mo50353x784fb1e3 = yVar.mo50353x784fb1e3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50353x784fb1e3);
        android.content.Context b17 = w2Var.b(yVar);
        r45.l24 l24Var = this.f161242g;
        mo50353x784fb1e3.c(new fl1.k(b17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0.I(l24Var.f460621f), l24Var.f460622g, l24Var.f460623h, q2Var));
    }
}

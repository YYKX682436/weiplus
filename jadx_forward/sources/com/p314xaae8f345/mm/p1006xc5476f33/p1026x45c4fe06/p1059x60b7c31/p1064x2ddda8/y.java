package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f161320a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f161321b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f161322c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f161323d;

    public y(java.lang.String scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f161320a = scope;
        this.f161323d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.x.f161307d);
    }

    public final void a(boolean z17, int i17) {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f161323d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        java.lang.String str = this.f161320a;
        ((ch1.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) mo141623x754a37bb)).c(24877, str, java.lang.Integer.valueOf(this.f161321b ? 1 : 0), java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(this.f161322c ? 1 : 0), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AuthorizeReport", "scope=" + str + ", userUserAgreementVisible=" + this.f161321b + ", userUserAgreementChecked=" + z17 + ",  hadTriggerUserUserAgreementAlert=" + this.f161322c + ", action=" + i17);
    }
}

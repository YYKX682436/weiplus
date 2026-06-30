package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f167270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.C12410xc56fbdc6 f167271e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.C12410xc56fbdc6 c12410xc56fbdc6) {
        this.f167270d = o6Var;
        this.f167271e = c12410xc56fbdc6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = this.f167270d.C0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.C12410xc56fbdc6 c12410xc56fbdc6 = this.f167271e;
        if (C0 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.c();
            cVar.s("appId", c12410xc56fbdc6.f167265f);
            java.lang.String name = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.b(c12410xc56fbdc6.f167266g).name();
            java.util.Locale ENGLISH = java.util.Locale.ENGLISH;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ENGLISH, "ENGLISH");
            java.lang.String lowerCase = name.toLowerCase(ENGLISH);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
            cVar.s("envVersion", lowerCase);
            C0.p(cVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0.f165835a.a(c12410xc56fbdc6.f167265f, c12410xc56fbdc6.f167266g);
    }
}

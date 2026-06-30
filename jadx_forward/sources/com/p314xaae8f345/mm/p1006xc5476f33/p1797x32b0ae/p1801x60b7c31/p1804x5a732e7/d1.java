package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e1 f225080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f225081e;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e1 e1Var, int i17) {
        this.f225080d = e1Var;
        this.f225081e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean wi6 = ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).wi(24, 384);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).wi(a17, 24, false, 384);
        a17.putExtra("ftsneedkeyboard", !wi6);
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsInitToSearch", true);
        a17.putExtra("ftsNeedShowCamera", false);
        j45.l.y(this.f225080d.c(), a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13054, java.lang.Integer.valueOf(this.f225081e), 0, "");
    }
}

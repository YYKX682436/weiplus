package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f220935a = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.e.class, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "getSessionId()Ljava/lang/String;", 0)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.e.class, "timeStamp", "getTimeStamp()J", 0))};

    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g a() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220940e == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.class) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220940e == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220940e = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g(null);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220940e;
        if (gVar != null) {
            return gVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("instance");
        throw null;
    }

    public final long b() {
        return ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220939d.b(this, f220935a[1])).longValue();
    }

    public final void c() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220940e == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.class) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220940e == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220940e = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g(null);
                    return;
                }
            }
        }
        if (!(java.lang.System.currentTimeMillis() - b() > 300000 && com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f220945d.getInt("existNum", 0) == 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220939d.c(this, f220935a[1], java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            return;
        }
        m53.p1 p1Var = new m53.p1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220940e;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("instance");
            throw null;
        }
        p1Var.f405492d = gm0.j1.a() ? gm0.j1.b().h() : ((java.lang.Number) ((jz5.n) gVar.f220941a).mo141623x754a37bb()).intValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        p1Var.f405493e = currentTimeMillis;
        nf.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220939d;
        f06.v[] vVarArr = f220935a;
        rVar.c(this, vVarArr[1], java.lang.Long.valueOf(currentTimeMillis));
        java.lang.String encodeToString = android.util.Base64.encodeToString(p1Var.mo14344x5f01b1f6(), 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220938c.c(this, vVarArr[0], encodeToString);
    }
}

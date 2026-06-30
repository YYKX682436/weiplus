package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes7.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f263372a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f263373b = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.b1(this));

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f263374c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.g1.f263369d);

    public h1(long j17) {
        this.f263372a = j17;
    }

    public static final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1 h1Var, java.lang.String str) {
        h1Var.getClass();
        if (str == null) {
            return "";
        }
        if (str.length() > 1000) {
            str = str.substring(0, 1000);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
        }
        java.lang.String encode = java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
        return encode;
    }

    public final long b() {
        return ((java.lang.Number) ((jz5.n) this.f263373b).mo141623x754a37bb()).longValue();
    }

    public final void c(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, int i19, boolean z17) {
        if (d() && str2 != null) {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.d1(str2, i17, this, str, z17, str3, i18, i19), "MicroMsg.WebPageErrorMonitor");
        }
    }

    public final boolean d() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if ((com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1 && z65.c.a()) || b() == 0 || b() == -1) {
            return true;
        }
        if (b() > 0) {
            jz5.g gVar = this.f263374c;
            return ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).longValue() > 0 && b() % ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).longValue() == 0;
        }
        return false;
    }
}

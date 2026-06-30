package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes7.dex */
public final class n1 {

    /* renamed from: c, reason: collision with root package name */
    public static java.util.regex.Pattern f263426c;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f263428e;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.n1 f263424a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.n1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f263425b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i1.f263382d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f263427d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m1.f263417d);

    public final java.lang.String a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (f263426c == null) {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile((java.lang.String) ((jz5.n) f263425b).mo141623x754a37bb());
            if (compile == null) {
                return null;
            }
            f263426c = compile;
        }
        java.util.regex.Pattern pattern = f263426c;
        java.util.regex.Matcher matcher = pattern != null ? pattern.matcher(str) : null;
        if (matcher != null && matcher.find()) {
            java.lang.String u17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f263427d).mo141623x754a37bb()).u("AdWUID", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "decodeString(...)");
            if (!r26.n0.N(u17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewAdHelper", "getCustomHeaders wuid=" + u17 + ", url=" + str);
                b(6L);
                return "Wuid:".concat(u17);
            }
            b(7L);
            if (!f263428e) {
                f263428e = true;
                b(0L);
                java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
                com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.k1.f263392d, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.l1.f263400d);
            }
        }
        return null;
    }

    public final void b(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1931L, j17, 1L, false);
    }
}

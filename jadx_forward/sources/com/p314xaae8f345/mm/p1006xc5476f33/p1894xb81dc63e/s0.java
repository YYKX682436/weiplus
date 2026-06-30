package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

/* loaded from: classes8.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0 f232034a = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0();

    public static final java.lang.String b(java.lang.String str, int i17) {
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "%s#%d", java.util.Arrays.copyOf(new java.lang.Object[]{str, java.lang.Integer.valueOf(i17)}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }

    public static final java.lang.String c(java.lang.String str) {
        java.lang.String format = java.lang.String.format("%s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(format.getBytes());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getMD5String(...)");
        return b17;
    }

    public static final java.lang.String d(java.lang.String str) {
        java.lang.String format = java.lang.String.format("%s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(format.getBytes());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getMD5String(...)");
        return b17;
    }

    public final java.lang.String a(java.lang.String path, o11.g imageLoaderOptions) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageLoaderOptions, "imageLoaderOptions");
        if (imageLoaderOptions.f423657v) {
            path = path + "round" + imageLoaderOptions.f423658w;
        }
        java.lang.String str = imageLoaderOptions.f423655t;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            path = path + str;
        }
        return path + "size" + imageLoaderOptions.f423644i + imageLoaderOptions.f423645j;
    }

    public final int e(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        return g(c16601x7ed0e40c) ? com.p314xaae8f345.mm.R.raw.f79988xcf60daef : com.p314xaae8f345.mm.R.raw.f81145x7eddd49a;
    }

    public final java.lang.String f(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (h()) {
            java.lang.String m9713x2fec8307 = g(c16601x7ed0e40c) ? b3.l.m9713x2fec8307(context, com.p314xaae8f345.mm.R.C30867xcad56011.oa7) : b3.l.m9713x2fec8307(context, com.p314xaae8f345.mm.R.C30867xcad56011.c0x);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m9713x2fec8307);
            return m9713x2fec8307;
        }
        java.lang.String m9713x2fec83072 = b3.l.m9713x2fec8307(context, com.p314xaae8f345.mm.R.C30867xcad56011.h0u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m9713x2fec83072);
        return m9713x2fec83072;
    }

    public final boolean g(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        if (!h() || c16601x7ed0e40c == null) {
            return false;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ri(c16601x7ed0e40c);
    }

    public final boolean h() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai();
    }
}

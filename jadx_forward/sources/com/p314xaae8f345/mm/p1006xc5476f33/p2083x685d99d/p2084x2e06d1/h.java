package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: b */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.g f243946b = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.g(null);

    /* renamed from: c */
    public static final java.lang.Object f243947c = new java.lang.Object();

    /* renamed from: a */
    public final int f243948a;

    public h(int i17) {
        this.f243948a = i17;
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h a(int i17, int i18, int i19, float f17, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar;
        synchronized (f243947c) {
            hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69196xa9b2bf97(i17, i18, true, i19, f17, z17 ? 5 : 1, 8, 2, 23.0f, 0, 0, true, z17, z18, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.b()));
        }
        return hVar;
    }

    public static /* synthetic */ void e(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar, java.nio.ByteBuffer byteBuffer, int i17, long j17, int i18, int i19, int i27, int i28, java.lang.Object obj) {
        hVar.d(byteBuffer, i17, j17, (i28 & 8) != 0 ? -1 : i18, (i28 & 16) != 0 ? -1 : i19, (i28 & 32) != 0 ? -1 : i27);
    }

    public final int b(java.lang.String str, int i17, float f17, boolean z17, int i18, int i19) {
        synchronized (f243947c) {
            try {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                try {
                    int m69209x39cbde8b = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69209x39cbde8b(this.f243948a, kk.w.a(str, false), i17, f17, z17, i18, i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.f(m69209x39cbde8b, elapsedRealtime);
                    return m69209x39cbde8b;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
    }

    public final void c() {
        synchronized (f243947c) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69224x213cc94e(this.f243948a);
        }
    }

    public final void d(java.nio.ByteBuffer byteBuffer, int i17, long j17, int i18, int i19, int i27) {
        synchronized (f243947c) {
            if (i18 == -1 && i19 == -1) {
                if (i27 == -1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69254x1f9475ae(this.f243948a, byteBuffer, i17, j17);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69256x2491bf76(this.f243948a, byteBuffer, i17, j17, i18, i19, i27);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69256x2491bf76(this.f243948a, byteBuffer, i17, j17, i18, i19, i27);
        }
    }

    public final void f(long j17) {
        synchronized (f243947c) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69258x17f2b74e(this.f243948a, j17);
        }
    }

    /* renamed from: toString */
    public java.lang.String m69270x9616526c() {
        java.lang.String format = java.lang.String.format("bufId:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f243948a)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}

package com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce;

/* renamed from: com.tencent.map.geolocation.sapp.TencentLocationUtils */
/* loaded from: classes13.dex */
public class C4223x8502b2d7 {
    private C4223x8502b2d7() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: contains */
    public static boolean m34965xde2d761f(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa, double d17, com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa2) {
        if (interfaceC4218x687499fa == null || interfaceC4218x687499fa2 == null) {
            throw null;
        }
        return m34967x69db0a53(interfaceC4218x687499fa, interfaceC4218x687499fa2) <= d17;
    }

    /* renamed from: distanceBetween */
    public static double m34967x69db0a53(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa, com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa2) {
        if (interfaceC4218x687499fa != null && interfaceC4218x687499fa2 != null) {
            return c.t.m.p134x35c0ce.c.q.a(interfaceC4218x687499fa.m34899x2605e9e2(), interfaceC4218x687499fa.m34900x79d7af9(), interfaceC4218x687499fa2.m34899x2605e9e2(), interfaceC4218x687499fa2.m34900x79d7af9());
        }
        throw null;
    }

    /* renamed from: isFromGps */
    public static boolean m34968xba043016(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa) {
        if (interfaceC4218x687499fa == null) {
            return false;
        }
        return "gps".equals(interfaceC4218x687499fa.m34904x40fe4367());
    }

    /* renamed from: isFromNetwork */
    public static boolean m34969x1d6e639a(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa) {
        if (interfaceC4218x687499fa == null) {
            return false;
        }
        return "network".equals(interfaceC4218x687499fa.m34904x40fe4367());
    }

    /* renamed from: isSupportGps */
    public static boolean m34970x5cd34f25(android.content.Context context) {
        context.getClass();
        return (c.t.m.p134x35c0ce.c.q.f(context) & 16) == 0;
    }

    /* renamed from: wgs84ToGcj02 */
    public static boolean m34971xde5778f6(double[] dArr, double[] dArr2) {
        if (dArr != null && dArr2 != null) {
            try {
                if (dArr.length == 2 && dArr2.length == 2) {
                    return com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.m35007xde5778f6(dArr, dArr2);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: distanceBetween */
    public static double m34966x69db0a53(double d17, double d18, double d19, double d27) {
        return c.t.m.p134x35c0ce.c.q.a(d17, d18, d19, d27);
    }
}

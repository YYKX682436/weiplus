package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzaax */
/* loaded from: classes13.dex */
final class C2141x6f02118 {

    /* renamed from: zzbtt */
    private static final java.lang.Class<?> f6289x6f02722 = m18861x394dd3();

    /* renamed from: zzbtu */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2153x6f02129<?, ?> f6290x6f02723 = zzu(false);

    /* renamed from: zzbtv */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2153x6f02129<?, ?> f6291x6f02724 = zzu(true);

    /* renamed from: zzbtw */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2153x6f02129<?, ?> f6292x6f02725 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2155x6f0212b();

    public static void zzh(java.lang.Class<?> cls) {
        java.lang.Class<?> cls2;
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77.class.isAssignableFrom(cls) && (cls2 = f6289x6f02722) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    private static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2153x6f02129<?, ?> zzu(boolean z17) {
        try {
            java.lang.Class<?> m18862x394dd4 = m18862x394dd4();
            if (m18862x394dd4 == null) {
                return null;
            }
            return (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2153x6f02129) m18862x394dd4.getConstructor(java.lang.Boolean.TYPE).newInstance(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* renamed from: zzue */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2153x6f02129<?, ?> m18858x394dd0() {
        return f6290x6f02723;
    }

    /* renamed from: zzuf */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2153x6f02129<?, ?> m18859x394dd1() {
        return f6291x6f02724;
    }

    /* renamed from: zzug */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2153x6f02129<?, ?> m18860x394dd2() {
        return f6292x6f02725;
    }

    /* renamed from: zzuh */
    private static java.lang.Class<?> m18861x394dd3() {
        try {
            int i17 = com.p176xb6135e39.p283xc50a8b8b.f5.f126610d;
            return com.p176xb6135e39.p283xc50a8b8b.f5.class;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* renamed from: zzui */
    private static java.lang.Class<?> m18862x394dd4() {
        return com.p176xb6135e39.p283xc50a8b8b.za.class;
    }
}

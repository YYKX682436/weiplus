package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzaat */
/* loaded from: classes13.dex */
final class C2137x6f02114 {

    /* renamed from: zzbtq */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2137x6f02114 f6286x6f0271f = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2137x6f02114();

    /* renamed from: zzbtr */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2140x6f02117 f6287x6f02720;

    /* renamed from: zzbts */
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2139x6f02116<?>> f6288x6f02721 = new java.util.concurrent.ConcurrentHashMap();

    private C2137x6f02114() {
        java.lang.String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2140x6f02117 interfaceC2140x6f02117 = null;
        for (int i17 = 0; i17 <= 0; i17++) {
            interfaceC2140x6f02117 = m18855x394c06(strArr[0]);
            if (interfaceC2140x6f02117 != null) {
                break;
            }
        }
        this.f6287x6f02720 = interfaceC2140x6f02117 == null ? new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2121x6f02104() : interfaceC2140x6f02117;
    }

    /* renamed from: zzfl */
    private static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2140x6f02117 m18855x394c06(java.lang.String str) {
        try {
            return (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2140x6f02117) java.lang.Class.forName(str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* renamed from: zzud */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2137x6f02114 m18856x394dcf() {
        return f6286x6f0271f;
    }

    public final <T> com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2139x6f02116<T> zzt(T t17) {
        java.lang.Class<?> cls = t17.getClass();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2404x394e78.zza(cls, "messageType");
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2139x6f02116<T> interfaceC2139x6f02116 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2139x6f02116) this.f6288x6f02721.get(cls);
        if (interfaceC2139x6f02116 != null) {
            return interfaceC2139x6f02116;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2139x6f02116<T> zzg = this.f6287x6f02720.zzg(cls);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2404x394e78.zza(cls, "messageType");
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2404x394e78.zza(zzg, "schema");
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2139x6f02116<T> interfaceC2139x6f021162 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2139x6f02116) this.f6288x6f02721.putIfAbsent(cls, zzg);
        return interfaceC2139x6f021162 != null ? interfaceC2139x6f021162 : zzg;
    }
}

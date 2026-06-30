package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzzp */
/* loaded from: classes13.dex */
final class C2402x394e76 implements com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2128x6f0210b {

    /* renamed from: zzbrx */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2402x394e76 f7240x6f026e8 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2402x394e76();

    private C2402x394e76() {
    }

    /* renamed from: zztl */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2402x394e76 m19404x394db8() {
        return f7240x6f026e8;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2128x6f0210b
    public final boolean zzd(java.lang.Class<?> cls) {
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77.class.isAssignableFrom(cls);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2128x6f0210b
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2127x6f0210a zze(java.lang.Class<?> cls) {
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77.class.isAssignableFrom(cls)) {
            java.lang.String name = cls.getName();
            throw new java.lang.IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new java.lang.String("Unsupported message type: "));
        }
        try {
            return (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2127x6f0210a) com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77.zzf(cls.asSubclass(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77.class)).zza(3, (java.lang.Object) null, (java.lang.Object) null);
        } catch (java.lang.Exception e17) {
            java.lang.String name2 = cls.getName();
            throw new java.lang.RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new java.lang.String("Unable to get message info for "), e17);
        }
    }
}

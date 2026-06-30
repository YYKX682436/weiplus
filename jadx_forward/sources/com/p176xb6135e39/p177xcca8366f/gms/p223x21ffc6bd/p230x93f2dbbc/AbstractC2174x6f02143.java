package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzace */
/* loaded from: classes16.dex */
public abstract class AbstractC2174x6f02143 {

    /* renamed from: zzbxh */
    protected volatile int f6401x6f02792 = -1;

    private static final <T extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143> T zzb(T t17, byte[] bArr, int i17, int i18) {
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 zza = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135.zza(bArr, 0, i18);
            t17.zzb(zza);
            zza.m18901x394b69(0);
            return t17;
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142 e17) {
            throw e17;
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException("Reading from a byte array threw an IOException (should never happen).", e18);
        }
    }

    /* renamed from: toString */
    public java.lang.String m18951x9616526c() {
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2175x6f02144.zzc(this);
    }

    public int zza() {
        return 0;
    }

    public abstract com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135);

    @Override // 
    /* renamed from: zzvf, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 mo18921x5a5dd5d() {
        return (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143) super.clone();
    }

    /* renamed from: zzvl */
    public final int m18952x394df6() {
        if (this.f6401x6f02792 < 0) {
            m18953x394df7();
        }
        return this.f6401x6f02792;
    }

    /* renamed from: zzvm */
    public final int m18953x394df7() {
        int zza = zza();
        this.f6401x6f02792 = zza;
        return zza;
    }

    public static final <T extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143> T zza(T t17, byte[] bArr) {
        return (T) zzb(t17, bArr, 0, bArr.length);
    }

    public void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
    }

    public static final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 abstractC2174x6f02143, byte[] bArr, int i17, int i18) {
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(bArr, 0, i18);
            abstractC2174x6f02143.zza(zzb);
            zzb.m18920x394def();
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e17);
        }
    }
}

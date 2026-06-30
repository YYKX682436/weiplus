package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzze */
/* loaded from: classes13.dex */
public abstract class AbstractC2391x394e6b {

    /* renamed from: zzbrg */
    private static volatile boolean f7217x6f026d7;

    /* renamed from: zzbrd */
    int f7218x6f026d4;

    /* renamed from: zzbre */
    private int f7219x6f026d5;

    /* renamed from: zzbrf */
    private boolean f7220x6f026d6;

    private AbstractC2391x394e6b() {
        this.f7218x6f026d4 = 100;
        this.f7219x6f026d5 = Integer.MAX_VALUE;
        this.f7220x6f026d6 = false;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2391x394e6b zza(byte[] bArr, int i17, int i18, boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2393x394e6d c2393x394e6d = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2393x394e6d(bArr, i17, i18);
        try {
            c2393x394e6d.m19382x394b65(i18);
            return c2393x394e6d;
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2406x394e7a e17) {
            throw new java.lang.IllegalArgumentException(e17);
        }
    }

    /* renamed from: zzsz */
    public abstract int mo19380x394da7();
}

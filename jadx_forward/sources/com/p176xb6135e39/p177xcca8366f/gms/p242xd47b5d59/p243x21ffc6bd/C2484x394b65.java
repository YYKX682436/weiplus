package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzaf */
/* loaded from: classes13.dex */
final class C2484x394b65 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1787x70ddf858<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener> {

    /* renamed from: zzba */
    private final android.content.IntentFilter[] f7545x394b7f;

    /* renamed from: zzby */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener f7546x394b97;

    /* renamed from: zzbz */
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener> f7547x394b98;

    private C2484x394b65(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener onCapabilityChangedListener, android.content.IntentFilter[] intentFilterArr, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener> c1781xefedf3a0) {
        super(c1781xefedf3a0);
        this.f7546x394b97 = onCapabilityChangedListener;
        this.f7545x394b7f = intentFilterArr;
        this.f7547x394b98 = c1781xefedf3a0;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1787x70ddf858
    /* renamed from: registerListener */
    public final /* synthetic */ void mo17936x42780477(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f c2667x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc) {
        c2667x394c3f.zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2642x394c21(c2440x4f4de6dc), this.f7546x394b97, this.f7547x394b98, this.f7545x394b7f);
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.wearable.internal.zzcv */
/* loaded from: classes13.dex */
public final class C2552x394bb3 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1787x70ddf858<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.OnDataChangedListener> {

    /* renamed from: zzba */
    private final android.content.IntentFilter[] f7638x394b7f;

    /* renamed from: zzbz */
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener> f7639x394b98;

    /* renamed from: zzdk */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.OnDataChangedListener f7640x394bc7;

    private C2552x394bb3(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.OnDataChangedListener onDataChangedListener, android.content.IntentFilter[] intentFilterArr, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.OnDataChangedListener> c1781xefedf3a0) {
        super(c1781xefedf3a0);
        this.f7640x394bc7 = onDataChangedListener;
        this.f7638x394b7f = intentFilterArr;
        this.f7639x394b98 = c1781xefedf3a0;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1787x70ddf858
    /* renamed from: registerListener */
    public final /* synthetic */ void mo17936x42780477(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f c2667x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc) {
        c2667x394c3f.zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2642x394c21(c2440x4f4de6dc), this.f7640x394bc7, this.f7639x394b98, this.f7638x394b7f);
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzfc */
/* loaded from: classes13.dex */
final class C2611x394bfd extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1787x70ddf858<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92.OnMessageReceivedListener> {

    /* renamed from: zzba */
    private final android.content.IntentFilter[] f7718x394b7f;

    /* renamed from: zzbz */
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener> f7719x394b98;

    /* renamed from: zzej */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92.OnMessageReceivedListener f7720x394be5;

    private C2611x394bfd(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92.OnMessageReceivedListener onMessageReceivedListener, android.content.IntentFilter[] intentFilterArr, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92.OnMessageReceivedListener> c1781xefedf3a0) {
        super(c1781xefedf3a0);
        this.f7720x394be5 = onMessageReceivedListener;
        this.f7718x394b7f = intentFilterArr;
        this.f7719x394b98 = c1781xefedf3a0;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1787x70ddf858
    /* renamed from: registerListener */
    public final /* synthetic */ void mo17936x42780477(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f c2667x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc) {
        c2667x394c3f.zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2642x394c21(c2440x4f4de6dc), this.f7720x394be5, this.f7719x394b98, this.f7718x394b7f);
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzan */
/* loaded from: classes13.dex */
final class C2492x394b6d extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzn<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> {

    /* renamed from: zzce */
    private final java.lang.String f7558x394ba2;

    /* renamed from: zzcf */
    private com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener f7559x394ba3;

    public C2492x394b6d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener channelListener, java.lang.String str) {
        super(abstractC1748xd28d482c);
        this.f7559x394ba3 = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(channelListener);
        this.f7558x394ba2 = str;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523
    /* renamed from: createFailedResult */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d mo17567xe8a1c1d6(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        this.f7559x394ba3 = null;
        return c1763x9432bc12;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl
    /* renamed from: doExecute */
    public final /* synthetic */ void mo17568x9ef606a(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f c2667x394c3f) {
        c2667x394c3f.zza(this, this.f7559x394ba3, this.f7558x394ba2);
        this.f7559x394ba3 = null;
    }
}

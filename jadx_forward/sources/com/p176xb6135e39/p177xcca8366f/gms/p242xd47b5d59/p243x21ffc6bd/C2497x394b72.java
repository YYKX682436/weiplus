package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzas */
/* loaded from: classes13.dex */
public final class C2497x394b72 implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener {

    /* renamed from: zzch */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback f7564x394ba5;

    public C2497x394b72(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback channelCallback) {
        this.f7564x394ba5 = channelCallback;
    }

    /* renamed from: equals */
    public final boolean m19894xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2497x394b72.class != obj.getClass()) {
            return false;
        }
        return this.f7564x394ba5.equals(((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2497x394b72) obj).f7564x394ba5);
    }

    /* renamed from: hashCode */
    public final int m19895x8cdac1b() {
        return this.f7564x394ba5.hashCode();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener
    /* renamed from: onChannelClosed */
    public final void mo19675x6cf620b0(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3, int i17, int i18) {
        this.f7564x394ba5.mo19692x6cf620b0(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2493x394b6e.zzb(interfaceC2453x8f4414e3), i17, i18);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener
    /* renamed from: onChannelOpened */
    public final void mo19676x81a407ad(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3) {
        this.f7564x394ba5.mo19693x81a407ad(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2493x394b6e.zzb(interfaceC2453x8f4414e3));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener
    /* renamed from: onInputClosed */
    public final void mo19677xee922e77(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3, int i17, int i18) {
        this.f7564x394ba5.mo19694xee922e77(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2493x394b6e.zzb(interfaceC2453x8f4414e3), i17, i18);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener
    /* renamed from: onOutputClosed */
    public final void mo19678x51bded4c(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3, int i17, int i18) {
        this.f7564x394ba5.mo19695x51bded4c(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2493x394b6e.zzb(interfaceC2453x8f4414e3), i17, i18);
    }
}

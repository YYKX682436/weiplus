package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzgc */
/* loaded from: classes13.dex */
final class C2637x394c1c implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener {

    /* renamed from: zzce */
    private final java.lang.String f7755x394ba2;

    /* renamed from: zzeq */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener f7756x394bec;

    public C2637x394c1c(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener channelListener) {
        this.f7755x394ba2 = (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        this.f7756x394bec = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(channelListener);
    }

    /* renamed from: equals */
    public final boolean m19952xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2637x394c1c)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2637x394c1c c2637x394c1c = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2637x394c1c) obj;
        return this.f7756x394bec.equals(c2637x394c1c.f7756x394bec) && this.f7755x394ba2.equals(c2637x394c1c.f7755x394ba2);
    }

    /* renamed from: hashCode */
    public final int m19953x8cdac1b() {
        return (this.f7755x394ba2.hashCode() * 31) + this.f7756x394bec.hashCode();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener
    /* renamed from: onChannelClosed */
    public final void mo19675x6cf620b0(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3, int i17, int i18) {
        this.f7756x394bec.mo19675x6cf620b0(interfaceC2453x8f4414e3, i17, i18);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener
    /* renamed from: onChannelOpened */
    public final void mo19676x81a407ad(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3) {
        this.f7756x394bec.mo19676x81a407ad(interfaceC2453x8f4414e3);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener
    /* renamed from: onInputClosed */
    public final void mo19677xee922e77(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3, int i17, int i18) {
        this.f7756x394bec.mo19677xee922e77(interfaceC2453x8f4414e3, i17, i18);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener
    /* renamed from: onOutputClosed */
    public final void mo19678x51bded4c(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3, int i17, int i18) {
        this.f7756x394bec.mo19678x51bded4c(interfaceC2453x8f4414e3, i17, i18);
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzae */
/* loaded from: classes13.dex */
final class C2483x394b64 implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener {

    /* renamed from: zzbc */
    private final java.lang.String f7543x394b81;

    /* renamed from: zzby */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener f7544x394b97;

    public C2483x394b64(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener onCapabilityChangedListener, java.lang.String str) {
        this.f7544x394b97 = onCapabilityChangedListener;
        this.f7543x394b81 = str;
    }

    /* renamed from: equals */
    public final boolean m19885xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2483x394b64.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2483x394b64 c2483x394b64 = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2483x394b64) obj;
        if (this.f7544x394b97.equals(c2483x394b64.f7544x394b97)) {
            return this.f7543x394b81.equals(c2483x394b64.f7543x394b81);
        }
        return false;
    }

    /* renamed from: hashCode */
    public final int m19886x8cdac1b() {
        return (this.f7544x394b97.hashCode() * 31) + this.f7543x394b81.hashCode();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener
    /* renamed from: onCapabilityChanged */
    public final void mo19646x6da6365d(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2452xeb6b7e06 interfaceC2452xeb6b7e06) {
        this.f7544x394b97.mo19646x6da6365d(interfaceC2452xeb6b7e06);
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* loaded from: classes13.dex */
final class zzv implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener {

    /* renamed from: zzbc */
    private final java.lang.String f7830x394b81;

    /* renamed from: zzbs */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener f7831x394b91;

    public zzv(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener capabilityListener, java.lang.String str) {
        this.f7831x394b91 = capabilityListener;
        this.f7830x394b81 = str;
    }

    /* renamed from: equals */
    public final boolean m19965xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzv.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzv zzvVar = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzv) obj;
        if (this.f7831x394b91.equals(zzvVar.f7831x394b91)) {
            return this.f7830x394b81.equals(zzvVar.f7830x394b81);
        }
        return false;
    }

    /* renamed from: hashCode */
    public final int m19966x8cdac1b() {
        return (this.f7831x394b91.hashCode() * 31) + this.f7830x394b81.hashCode();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener
    /* renamed from: onCapabilityChanged */
    public final void mo19646x6da6365d(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2452xeb6b7e06 interfaceC2452xeb6b7e06) {
        this.f7831x394b91.mo19646x6da6365d(interfaceC2452xeb6b7e06);
    }
}

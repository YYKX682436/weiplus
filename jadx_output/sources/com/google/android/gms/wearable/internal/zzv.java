package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzv implements com.google.android.gms.wearable.CapabilityApi.CapabilityListener {
    private final java.lang.String zzbc;
    private final com.google.android.gms.wearable.CapabilityApi.CapabilityListener zzbs;

    public zzv(com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener, java.lang.String str) {
        this.zzbs = capabilityListener;
        this.zzbc = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.gms.wearable.internal.zzv.class != obj.getClass()) {
            return false;
        }
        com.google.android.gms.wearable.internal.zzv zzvVar = (com.google.android.gms.wearable.internal.zzv) obj;
        if (this.zzbs.equals(zzvVar.zzbs)) {
            return this.zzbc.equals(zzvVar.zzbc);
        }
        return false;
    }

    public final int hashCode() {
        return (this.zzbs.hashCode() * 31) + this.zzbc.hashCode();
    }

    @Override // com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public final void onCapabilityChanged(com.google.android.gms.wearable.CapabilityInfo capabilityInfo) {
        this.zzbs.onCapabilityChanged(capabilityInfo);
    }
}

package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzae implements com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener {
    private final java.lang.String zzbc;
    private final com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener zzby;

    public zzae(com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, java.lang.String str) {
        this.zzby = onCapabilityChangedListener;
        this.zzbc = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.gms.wearable.internal.zzae.class != obj.getClass()) {
            return false;
        }
        com.google.android.gms.wearable.internal.zzae zzaeVar = (com.google.android.gms.wearable.internal.zzae) obj;
        if (this.zzby.equals(zzaeVar.zzby)) {
            return this.zzbc.equals(zzaeVar.zzbc);
        }
        return false;
    }

    public final int hashCode() {
        return (this.zzby.hashCode() * 31) + this.zzbc.hashCode();
    }

    @Override // com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener, com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public final void onCapabilityChanged(com.google.android.gms.wearable.CapabilityInfo capabilityInfo) {
        this.zzby.onCapabilityChanged(capabilityInfo);
    }
}

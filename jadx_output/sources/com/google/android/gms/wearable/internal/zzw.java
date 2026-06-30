package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzw implements com.google.android.gms.wearable.CapabilityInfo {
    private final java.lang.String name;
    private final java.util.Set<com.google.android.gms.wearable.Node> zzbt;

    public zzw(com.google.android.gms.wearable.CapabilityInfo capabilityInfo) {
        this(capabilityInfo.getName(), capabilityInfo.getNodes());
    }

    @Override // com.google.android.gms.wearable.CapabilityInfo
    public final java.lang.String getName() {
        return this.name;
    }

    @Override // com.google.android.gms.wearable.CapabilityInfo
    public final java.util.Set<com.google.android.gms.wearable.Node> getNodes() {
        return this.zzbt;
    }

    private zzw(java.lang.String str, java.util.Set<com.google.android.gms.wearable.Node> set) {
        this.name = str;
        this.zzbt = set;
    }
}

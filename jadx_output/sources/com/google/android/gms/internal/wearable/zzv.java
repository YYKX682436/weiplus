package com.google.android.gms.internal.wearable;

/* loaded from: classes16.dex */
final class zzv {
    final int tag;
    final byte[] zzhm;

    public zzv(int i17, byte[] bArr) {
        this.tag = i17;
        this.zzhm = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.wearable.zzv)) {
            return false;
        }
        com.google.android.gms.internal.wearable.zzv zzvVar = (com.google.android.gms.internal.wearable.zzv) obj;
        return this.tag == zzvVar.tag && java.util.Arrays.equals(this.zzhm, zzvVar.zzhm);
    }

    public final int hashCode() {
        return ((this.tag + com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX) * 31) + java.util.Arrays.hashCode(this.zzhm);
    }
}

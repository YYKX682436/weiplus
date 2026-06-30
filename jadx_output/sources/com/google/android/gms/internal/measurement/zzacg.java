package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzacg {
    final int tag;
    final byte[] zzbrc;

    public zzacg(int i17, byte[] bArr) {
        this.tag = i17;
        this.zzbrc = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzacg)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzacg zzacgVar = (com.google.android.gms.internal.measurement.zzacg) obj;
        return this.tag == zzacgVar.tag && java.util.Arrays.equals(this.zzbrc, zzacgVar.zzbrc);
    }

    public final int hashCode() {
        return ((this.tag + com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX) * 31) + java.util.Arrays.hashCode(this.zzbrc);
    }
}

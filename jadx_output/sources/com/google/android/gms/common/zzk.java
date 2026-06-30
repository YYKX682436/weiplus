package com.google.android.gms.common;

/* loaded from: classes13.dex */
final class zzk extends com.google.android.gms.common.zzj {
    private final byte[] zza;

    public zzk(byte[] bArr) {
        super(java.util.Arrays.copyOfRange(bArr, 0, 25));
        this.zza = bArr;
    }

    @Override // com.google.android.gms.common.zzj
    public final byte[] zzf() {
        return this.zza;
    }
}

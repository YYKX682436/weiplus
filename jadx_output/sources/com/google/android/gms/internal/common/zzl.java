package com.google.android.gms.internal.common;

/* loaded from: classes13.dex */
final class zzl extends com.google.android.gms.internal.common.zzk {
    private final char zza;

    public zzl(char c17) {
        this.zza = c17;
    }

    public final java.lang.String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i17 = this.zza;
        for (int i18 = 0; i18 < 4; i18++) {
            cArr[5 - i18] = "0123456789ABCDEF".charAt(i17 & 15);
            i17 >>= 4;
        }
        return "CharMatcher.is('" + java.lang.String.copyValueOf(cArr) + "')";
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c17) {
        return c17 == this.zza;
    }
}

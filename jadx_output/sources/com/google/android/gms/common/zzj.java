package com.google.android.gms.common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public abstract class zzj extends com.google.android.gms.common.internal.zzz {
    private final int zza;

    public zzj(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(bArr.length == 25);
        this.zza = java.util.Arrays.hashCode(bArr);
    }

    public static byte[] zze(java.lang.String str) {
        try {
            return str.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.gms.dynamic.IObjectWrapper zzd;
        if (obj != null && (obj instanceof com.google.android.gms.common.internal.zzaa)) {
            try {
                com.google.android.gms.common.internal.zzaa zzaaVar = (com.google.android.gms.common.internal.zzaa) obj;
                if (zzaaVar.zzc() == this.zza && (zzd = zzaaVar.zzd()) != null) {
                    return java.util.Arrays.equals(zzf(), (byte[]) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzd));
                }
                return false;
            } catch (android.os.RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final com.google.android.gms.dynamic.IObjectWrapper zzd() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(zzf());
    }

    public abstract byte[] zzf();
}

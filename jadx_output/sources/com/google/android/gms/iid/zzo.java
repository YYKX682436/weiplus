package com.google.android.gms.iid;

/* loaded from: classes13.dex */
final class zzo {
    private final java.security.KeyPair zzbw;
    private final long zzbx;

    public zzo(java.security.KeyPair keyPair, long j17) {
        this.zzbw = keyPair;
        this.zzbx = j17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String zzo() {
        return android.util.Base64.encodeToString(this.zzbw.getPublic().getEncoded(), 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String zzp() {
        return android.util.Base64.encodeToString(this.zzbw.getPrivate().getEncoded(), 11);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.iid.zzo)) {
            return false;
        }
        com.google.android.gms.iid.zzo zzoVar = (com.google.android.gms.iid.zzo) obj;
        return this.zzbx == zzoVar.zzbx && this.zzbw.getPublic().equals(zzoVar.zzbw.getPublic()) && this.zzbw.getPrivate().equals(zzoVar.zzbw.getPrivate());
    }

    public final long getCreationTime() {
        return this.zzbx;
    }

    public final java.security.KeyPair getKeyPair() {
        return this.zzbw;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzbw.getPublic(), this.zzbw.getPrivate(), java.lang.Long.valueOf(this.zzbx));
    }
}

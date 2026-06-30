package com.google.android.gms.internal.gcm;

/* loaded from: classes13.dex */
final class zzj extends com.google.android.gms.internal.gcm.zzg {
    private final com.google.android.gms.internal.gcm.zzh zzdi = new com.google.android.gms.internal.gcm.zzh();

    @Override // com.google.android.gms.internal.gcm.zzg
    public final void zzd(java.lang.Throwable th6, java.lang.Throwable th7) {
        if (th7 == th6) {
            throw new java.lang.IllegalArgumentException("Self suppression is not allowed.", th7);
        }
        if (th7 == null) {
            throw new java.lang.NullPointerException("The suppressed exception cannot be null.");
        }
        this.zzdi.zzd(th6, true).add(th7);
    }
}

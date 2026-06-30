package com.google.android.gms.internal.firebase_messaging;

/* loaded from: classes13.dex */
final class zzl extends com.google.android.gms.internal.firebase_messaging.zzi {
    private final com.google.android.gms.internal.firebase_messaging.zzj zzk = new com.google.android.gms.internal.firebase_messaging.zzj();

    @Override // com.google.android.gms.internal.firebase_messaging.zzi
    public final void zza(java.lang.Throwable th6, java.lang.Throwable th7) {
        if (th7 == th6) {
            throw new java.lang.IllegalArgumentException("Self suppression is not allowed.", th7);
        }
        if (th7 == null) {
            throw new java.lang.NullPointerException("The suppressed exception cannot be null.");
        }
        this.zzk.zza(th6, true).add(th7);
    }
}

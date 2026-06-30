package com.google.android.gms.internal.firebase_messaging;

/* loaded from: classes13.dex */
final class zzk extends java.lang.ref.WeakReference<java.lang.Throwable> {
    private final int zzj;

    public zzk(java.lang.Throwable th6, java.lang.ref.ReferenceQueue<java.lang.Throwable> referenceQueue) {
        super(th6, referenceQueue);
        if (th6 == null) {
            throw new java.lang.NullPointerException("The referent cannot be null");
        }
        this.zzj = java.lang.System.identityHashCode(th6);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && obj.getClass() == com.google.android.gms.internal.firebase_messaging.zzk.class) {
            if (this == obj) {
                return true;
            }
            com.google.android.gms.internal.firebase_messaging.zzk zzkVar = (com.google.android.gms.internal.firebase_messaging.zzk) obj;
            if (this.zzj == zzkVar.zzj && get() == zzkVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzj;
    }
}

package com.google.android.gms.internal.gcm;

/* loaded from: classes13.dex */
final class zzi extends java.lang.ref.WeakReference<java.lang.Throwable> {
    private final int zzdh;

    public zzi(java.lang.Throwable th6, java.lang.ref.ReferenceQueue<java.lang.Throwable> referenceQueue) {
        super(th6, referenceQueue);
        if (th6 == null) {
            throw new java.lang.NullPointerException("The referent cannot be null");
        }
        this.zzdh = java.lang.System.identityHashCode(th6);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && obj.getClass() == com.google.android.gms.internal.gcm.zzi.class) {
            if (this == obj) {
                return true;
            }
            com.google.android.gms.internal.gcm.zzi zziVar = (com.google.android.gms.internal.gcm.zzi) obj;
            if (this.zzdh == zziVar.zzdh && get() == zziVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzdh;
    }
}

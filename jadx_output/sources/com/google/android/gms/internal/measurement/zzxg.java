package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzxg extends java.lang.ref.WeakReference<java.lang.Throwable> {
    private final int zzboc;

    public zzxg(java.lang.Throwable th6, java.lang.ref.ReferenceQueue<java.lang.Throwable> referenceQueue) {
        super(th6, null);
        if (th6 == null) {
            throw new java.lang.NullPointerException("The referent cannot be null");
        }
        this.zzboc = java.lang.System.identityHashCode(th6);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && obj.getClass() == com.google.android.gms.internal.measurement.zzxg.class) {
            if (this == obj) {
                return true;
            }
            com.google.android.gms.internal.measurement.zzxg zzxgVar = (com.google.android.gms.internal.measurement.zzxg) obj;
            if (this.zzboc == zzxgVar.zzboc && get() == zzxgVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzboc;
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc;

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

    /* renamed from: equals */
    public final boolean m18824xb2c87fbf(java.lang.Object obj) {
        if (obj != null && obj.getClass() == com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc.zzk.class) {
            if (this == obj) {
                return true;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc.zzk zzkVar = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc.zzk) obj;
            if (this.zzj == zzkVar.zzj && get() == zzkVar.get()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public final int m18825x8cdac1b() {
        return this.zzj;
    }
}

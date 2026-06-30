package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm;

/* loaded from: classes13.dex */
final class zzi extends java.lang.ref.WeakReference<java.lang.Throwable> {

    /* renamed from: zzdh */
    private final int f6270x394bc4;

    public zzi(java.lang.Throwable th6, java.lang.ref.ReferenceQueue<java.lang.Throwable> referenceQueue) {
        super(th6, referenceQueue);
        if (th6 == null) {
            throw new java.lang.NullPointerException("The referent cannot be null");
        }
        this.f6270x394bc4 = java.lang.System.identityHashCode(th6);
    }

    /* renamed from: equals */
    public final boolean m18832xb2c87fbf(java.lang.Object obj) {
        if (obj != null && obj.getClass() == com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm.zzi.class) {
            if (this == obj) {
                return true;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm.zzi zziVar = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm.zzi) obj;
            if (this.f6270x394bc4 == zziVar.f6270x394bc4 && get() == zziVar.get()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public final int m18833x8cdac1b() {
        return this.f6270x394bc4;
    }
}

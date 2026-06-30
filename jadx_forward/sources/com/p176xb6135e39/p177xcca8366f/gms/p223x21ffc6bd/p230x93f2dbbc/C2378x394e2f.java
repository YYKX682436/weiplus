package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzxg */
/* loaded from: classes13.dex */
final class C2378x394e2f extends java.lang.ref.WeakReference<java.lang.Throwable> {

    /* renamed from: zzboc */
    private final int f7202x6f02676;

    public C2378x394e2f(java.lang.Throwable th6, java.lang.ref.ReferenceQueue<java.lang.Throwable> referenceQueue) {
        super(th6, null);
        if (th6 == null) {
            throw new java.lang.NullPointerException("The referent cannot be null");
        }
        this.f7202x6f02676 = java.lang.System.identityHashCode(th6);
    }

    /* renamed from: equals */
    public final boolean m19364xb2c87fbf(java.lang.Object obj) {
        if (obj != null && obj.getClass() == com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2378x394e2f.class) {
            if (this == obj) {
                return true;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2378x394e2f c2378x394e2f = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2378x394e2f) obj;
            if (this.f7202x6f02676 == c2378x394e2f.f7202x6f02676 && get() == c2378x394e2f.get()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public final int m19365x8cdac1b() {
        return this.f7202x6f02676;
    }
}

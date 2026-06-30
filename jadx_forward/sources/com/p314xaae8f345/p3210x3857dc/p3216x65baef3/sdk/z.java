package com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk;

/* loaded from: classes13.dex */
public class z implements com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f302034a;

    /* renamed from: b, reason: collision with root package name */
    public by5.i0 f302035b;

    /* renamed from: c, reason: collision with root package name */
    public by5.i0 f302036c;

    public z(java.lang.Object obj) {
        this.f302034a = obj;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.y
    public void a() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f302036c;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f302034a, "deleteAllData", new java.lang.Class[0]);
                    this.f302036c = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.y
    public void b(java.lang.String str) {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f302035b;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f302034a, "deleteOrigin", java.lang.String.class);
                    this.f302035b = i0Var;
                }
            }
            i0Var.b(str);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }
}

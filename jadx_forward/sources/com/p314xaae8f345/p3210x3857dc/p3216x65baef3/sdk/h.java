package com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk;

/* loaded from: classes13.dex */
public class h implements com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f301976a;

    /* renamed from: b, reason: collision with root package name */
    public by5.i0 f301977b;

    public h(java.lang.Object obj) {
        this.f301976a = obj;
    }

    public void a() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f301977b;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f301976a, "cancel", new java.lang.Class[0]);
                    this.f301977b = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }
}

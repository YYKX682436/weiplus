package com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk;

/* loaded from: classes13.dex */
public class t implements com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f302001a;

    /* renamed from: b, reason: collision with root package name */
    public by5.i0 f302002b;

    /* renamed from: c, reason: collision with root package name */
    public by5.i0 f302003c;

    public t(java.lang.Object obj) {
        this.f302001a = obj;
    }

    public java.lang.CharSequence a() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f302003c;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f302001a, "getDescription", new java.lang.Class[0]);
                    this.f302003c = i0Var;
                }
            }
            return (java.lang.CharSequence) i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }

    public int b() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f302002b;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f302001a, "getErrorCode", new java.lang.Class[0]);
                    this.f302002b = i0Var;
                }
            }
            return ((java.lang.Integer) i0Var.b(new java.lang.Object[0])).intValue();
        } catch (java.lang.UnsupportedOperationException unused) {
            return 0;
        }
    }
}

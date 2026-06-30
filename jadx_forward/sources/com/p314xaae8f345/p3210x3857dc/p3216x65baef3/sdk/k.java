package com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk;

/* loaded from: classes13.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f301982a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f301983b;

    /* renamed from: c, reason: collision with root package name */
    public by5.i0 f301984c;

    /* renamed from: d, reason: collision with root package name */
    public by5.i0 f301985d;

    /* renamed from: e, reason: collision with root package name */
    public by5.i0 f301986e;

    public k(java.lang.Object obj) {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1 m120281x9cf0d20b = com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1.m120281x9cf0d20b();
        if (m120281x9cf0d20b == null) {
            return;
        }
        if (m120281x9cf0d20b.m120198xfefc2a39("Profile").isInstance(obj)) {
            this.f301982a = obj;
        } else {
            by5.c4.c("Profile", "Object must be an instance of Profile");
        }
    }

    public final java.lang.String a() {
        by5.i0 i0Var;
        java.lang.String str = this.f301983b;
        if (str == null || str.isEmpty()) {
            java.lang.String str2 = "";
            try {
                synchronized (this) {
                    i0Var = this.f301984c;
                    if (i0Var == null) {
                        i0Var = new by5.i0(this.f301982a, "getName", new java.lang.Class[0]);
                        this.f301984c = i0Var;
                    }
                }
                str2 = (java.lang.String) i0Var.b(new java.lang.Object[0]);
            } catch (java.lang.UnsupportedOperationException unused) {
            }
            this.f301983b = str2;
        }
        return this.f301983b;
    }
}

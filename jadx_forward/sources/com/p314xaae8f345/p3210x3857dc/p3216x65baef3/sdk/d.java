package com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk;

/* loaded from: classes13.dex */
public class d implements com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f301911a;

    /* renamed from: b, reason: collision with root package name */
    public by5.i0 f301912b;

    /* renamed from: c, reason: collision with root package name */
    public by5.i0 f301913c;

    /* renamed from: d, reason: collision with root package name */
    public by5.i0 f301914d;

    /* renamed from: e, reason: collision with root package name */
    public by5.i0 f301915e;

    /* renamed from: f, reason: collision with root package name */
    public by5.i0 f301916f;

    /* renamed from: g, reason: collision with root package name */
    public by5.i0 f301917g;

    public d(java.lang.Object obj) {
        this.f301911a = obj;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c
    public java.lang.String a(java.lang.String str) {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f301913c;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f301911a, "getCookie", java.lang.String.class);
                    this.f301913c = i0Var;
                }
            }
            return (java.lang.String) i0Var.b(str);
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c
    public void b(java.lang.String str, java.lang.String str2) {
        try {
            f().b(str, str2);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c
    public void c() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f301915e;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f301911a, "removeSessionCookie", new java.lang.Class[0]);
                    this.f301915e = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c
    public void d(boolean z17) {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f301916f;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f301911a, "setAcceptCookie", java.lang.Boolean.TYPE);
                    this.f301916f = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c
    public void e() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f301914d;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f301911a, "removeAllCookie", new java.lang.Class[0]);
                    this.f301914d = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    public final synchronized by5.i0 f() {
        by5.i0 i0Var;
        i0Var = this.f301917g;
        if (i0Var == null) {
            i0Var = new by5.i0(this.f301911a, "setCookie", java.lang.String.class, java.lang.String.class);
            this.f301917g = i0Var;
        }
        return i0Var;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c
    /* renamed from: flush */
    public void mo120463x5d03b04() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f301912b;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f301911a, "flush", new java.lang.Class[0]);
                    this.f301912b = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }
}

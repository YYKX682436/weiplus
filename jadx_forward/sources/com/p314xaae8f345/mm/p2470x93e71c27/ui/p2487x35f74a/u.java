package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f272820a;

    /* renamed from: b, reason: collision with root package name */
    public final int f272821b;

    /* renamed from: c, reason: collision with root package name */
    public final int f272822c;

    /* renamed from: d, reason: collision with root package name */
    public int f272823d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5);

    /* renamed from: e, reason: collision with root package name */
    public int f272824e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77841x66d62781);

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.t f272825f;

    public u(java.lang.Object obj, int i17, int i18) {
        this.f272820a = obj;
        this.f272821b = i17;
        this.f272822c = i18;
    }

    public final int a() {
        return this.f272824e;
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.t b() {
        return this.f272825f;
    }

    public final int c() {
        return this.f272823d;
    }

    public final int d() {
        return this.f272822c;
    }

    public final int e() {
        return this.f272821b;
    }

    /* renamed from: equals */
    public boolean m75722xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u)) {
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u uVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f272820a, uVar.f272820a) && this.f272821b == uVar.f272821b && this.f272822c == uVar.f272822c;
    }

    public final void f(int i17) {
        this.f272824e = i17;
    }

    public final void g(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.t tVar) {
        this.f272825f = tVar;
    }

    public final void h(int i17) {
        this.f272823d = i17;
    }

    /* renamed from: hashCode */
    public int m75723x8cdac1b() {
        java.lang.Object obj = this.f272820a;
        return ((((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Integer.hashCode(this.f272821b)) * 31) + java.lang.Integer.hashCode(this.f272822c);
    }

    /* renamed from: toString */
    public java.lang.String m75724x9616526c() {
        return "LinkSpanObj(content=" + this.f272820a + ", start=" + this.f272821b + ", end=" + this.f272822c + ')';
    }
}

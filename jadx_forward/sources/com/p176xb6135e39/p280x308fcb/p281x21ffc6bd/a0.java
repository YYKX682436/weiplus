package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd;

/* loaded from: classes16.dex */
public abstract class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 f126230d;

    /* renamed from: e, reason: collision with root package name */
    public com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 f126231e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f126232f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.c0 f126233g;

    public a0(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.c0 c0Var) {
        this.f126233g = c0Var;
        this.f126230d = c0Var.f126338h.f126238g;
        this.f126232f = c0Var.f126337g;
    }

    public final com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 a() {
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var = this.f126230d;
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.c0 c0Var = this.f126233g;
        if (b0Var == c0Var.f126338h) {
            throw new java.util.NoSuchElementException();
        }
        if (c0Var.f126337g != this.f126232f) {
            throw new java.util.ConcurrentModificationException();
        }
        this.f126230d = b0Var.f126238g;
        this.f126231e = b0Var;
        return b0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f126230d != this.f126233g.f126338h;
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var = this.f126231e;
        if (b0Var == null) {
            throw new java.lang.IllegalStateException();
        }
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.c0 c0Var = this.f126233g;
        c0Var.d(b0Var, true);
        this.f126231e = null;
        this.f126232f = c0Var.f126337g;
    }
}

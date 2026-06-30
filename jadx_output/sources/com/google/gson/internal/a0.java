package com.google.gson.internal;

/* loaded from: classes16.dex */
public abstract class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public com.google.gson.internal.b0 f44697d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.gson.internal.b0 f44698e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f44699f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.internal.c0 f44700g;

    public a0(com.google.gson.internal.c0 c0Var) {
        this.f44700g = c0Var;
        this.f44697d = c0Var.f44805h.f44705g;
        this.f44699f = c0Var.f44804g;
    }

    public final com.google.gson.internal.b0 a() {
        com.google.gson.internal.b0 b0Var = this.f44697d;
        com.google.gson.internal.c0 c0Var = this.f44700g;
        if (b0Var == c0Var.f44805h) {
            throw new java.util.NoSuchElementException();
        }
        if (c0Var.f44804g != this.f44699f) {
            throw new java.util.ConcurrentModificationException();
        }
        this.f44697d = b0Var.f44705g;
        this.f44698e = b0Var;
        return b0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44697d != this.f44700g.f44805h;
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.gson.internal.b0 b0Var = this.f44698e;
        if (b0Var == null) {
            throw new java.lang.IllegalStateException();
        }
        com.google.gson.internal.c0 c0Var = this.f44700g;
        c0Var.d(b0Var, true);
        this.f44698e = null;
        this.f44699f = c0Var.f44804g;
    }
}

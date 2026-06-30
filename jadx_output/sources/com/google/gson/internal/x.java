package com.google.gson.internal;

/* loaded from: classes16.dex */
public class x extends java.util.AbstractSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.internal.c0 f44826d;

    public x(com.google.gson.internal.c0 c0Var) {
        this.f44826d = c0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f44826d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return (obj instanceof java.util.Map.Entry) && this.f44826d.b((java.util.Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new com.google.gson.internal.w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        com.google.gson.internal.c0 c0Var;
        com.google.gson.internal.b0 b17;
        if (!(obj instanceof java.util.Map.Entry) || (b17 = (c0Var = this.f44826d).b((java.util.Map.Entry) obj)) == null) {
            return false;
        }
        c0Var.d(b17, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f44826d.f44803f;
    }
}

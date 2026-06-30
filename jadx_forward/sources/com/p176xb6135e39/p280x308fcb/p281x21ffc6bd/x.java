package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd;

/* loaded from: classes16.dex */
public class x extends java.util.AbstractSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.c0 f126359d;

    public x(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.c0 c0Var) {
        this.f126359d = c0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f126359d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return (obj instanceof java.util.Map.Entry) && this.f126359d.b((java.util.Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.c0 c0Var;
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b17;
        if (!(obj instanceof java.util.Map.Entry) || (b17 = (c0Var = this.f126359d).b((java.util.Map.Entry) obj)) == null) {
            return false;
        }
        c0Var.d(b17, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f126359d.f126336f;
    }
}

package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes14.dex */
public class cb extends java.util.AbstractList implements com.p176xb6135e39.p283xc50a8b8b.g7, java.util.RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.g7 f126522d;

    public cb(com.p176xb6135e39.p283xc50a8b8b.g7 g7Var) {
        this.f126522d = g7Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g7
    public java.lang.Object J(int i17) {
        return this.f126522d.J(i17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g7
    public com.p176xb6135e39.p283xc50a8b8b.g7 b() {
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g7
    public java.util.List c() {
        return this.f126522d.c();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g7
    public com.p176xb6135e39.p283xc50a8b8b.y f(int i17) {
        return this.f126522d.f(i17);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        return (java.lang.String) this.f126522d.get(i17);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return new com.p176xb6135e39.p283xc50a8b8b.bb(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i17) {
        return new com.p176xb6135e39.p283xc50a8b8b.ab(this, i17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g7
    public void q(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f126522d.size();
    }
}

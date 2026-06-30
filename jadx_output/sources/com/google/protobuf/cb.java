package com.google.protobuf;

/* loaded from: classes14.dex */
public class cb extends java.util.AbstractList implements com.google.protobuf.g7, java.util.RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.g7 f44989d;

    public cb(com.google.protobuf.g7 g7Var) {
        this.f44989d = g7Var;
    }

    @Override // com.google.protobuf.g7
    public java.lang.Object J(int i17) {
        return this.f44989d.J(i17);
    }

    @Override // com.google.protobuf.g7
    public com.google.protobuf.g7 b() {
        return this;
    }

    @Override // com.google.protobuf.g7
    public java.util.List c() {
        return this.f44989d.c();
    }

    @Override // com.google.protobuf.g7
    public com.google.protobuf.y f(int i17) {
        return this.f44989d.f(i17);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        return (java.lang.String) this.f44989d.get(i17);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return new com.google.protobuf.bb(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i17) {
        return new com.google.protobuf.ab(this, i17);
    }

    @Override // com.google.protobuf.g7
    public void q(com.google.protobuf.y yVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f44989d.size();
    }
}

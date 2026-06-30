package com.google.protobuf;

/* loaded from: classes13.dex */
public class y7 implements java.util.Collection {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.z8 f45740d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Collection f45741e;

    public y7(com.google.protobuf.z8 z8Var, java.util.Collection collection) {
        this.f45740d = z8Var;
        this.f45741e = collection;
    }

    @Override // java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        ((com.google.protobuf.d8) this.f45740d).c();
        this.f45741e.clear();
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f45741e.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        return this.f45741e.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        return this.f45741e.equals(obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f45741e.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f45741e.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new com.google.protobuf.z7(this.f45740d, this.f45741e.iterator());
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        ((com.google.protobuf.d8) this.f45740d).c();
        return this.f45741e.remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        ((com.google.protobuf.d8) this.f45740d).c();
        return this.f45741e.removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        ((com.google.protobuf.d8) this.f45740d).c();
        return this.f45741e.retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return this.f45741e.size();
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return this.f45741e.toArray();
    }

    public java.lang.String toString() {
        return this.f45741e.toString();
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.f45741e.toArray(objArr);
    }
}

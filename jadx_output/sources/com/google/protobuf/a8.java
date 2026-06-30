package com.google.protobuf;

/* loaded from: classes13.dex */
public class a8 implements java.util.Set {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.z8 f44869d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f44870e;

    public a8(com.google.protobuf.z8 z8Var, java.util.Set set) {
        this.f44869d = z8Var;
        this.f44870e = set;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(java.lang.Object obj) {
        ((com.google.protobuf.d8) this.f44869d).c();
        return this.f44870e.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        ((com.google.protobuf.d8) this.f44869d).c();
        return this.f44870e.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        ((com.google.protobuf.d8) this.f44869d).c();
        this.f44870e.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f44870e.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        return this.f44870e.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(java.lang.Object obj) {
        return this.f44870e.equals(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f44870e.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f44870e.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new com.google.protobuf.z7(this.f44869d, this.f44870e.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        ((com.google.protobuf.d8) this.f44869d).c();
        return this.f44870e.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        ((com.google.protobuf.d8) this.f44869d).c();
        return this.f44870e.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        ((com.google.protobuf.d8) this.f44869d).c();
        return this.f44870e.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f44870e.size();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        return this.f44870e.toArray();
    }

    public java.lang.String toString() {
        return this.f44870e.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.f44870e.toArray(objArr);
    }
}

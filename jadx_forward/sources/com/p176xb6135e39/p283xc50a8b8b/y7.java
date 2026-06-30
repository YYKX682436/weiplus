package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes13.dex */
public class y7 implements java.util.Collection {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.z8 f127273d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Collection f127274e;

    public y7(com.p176xb6135e39.p283xc50a8b8b.z8 z8Var, java.util.Collection collection) {
        this.f127273d = z8Var;
        this.f127274e = collection;
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
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f127273d).c();
        this.f127274e.clear();
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f127274e.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        return this.f127274e.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        return this.f127274e.equals(obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f127274e.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f127274e.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new com.p176xb6135e39.p283xc50a8b8b.z7(this.f127273d, this.f127274e.iterator());
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f127273d).c();
        return this.f127274e.remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f127273d).c();
        return this.f127274e.removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f127273d).c();
        return this.f127274e.retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return this.f127274e.size();
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return this.f127274e.toArray();
    }

    /* renamed from: toString */
    public java.lang.String m20965x9616526c() {
        return this.f127274e.toString();
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.f127274e.toArray(objArr);
    }
}

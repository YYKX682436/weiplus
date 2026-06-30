package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes13.dex */
public class a8 implements java.util.Set {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.z8 f126402d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f126403e;

    public a8(com.p176xb6135e39.p283xc50a8b8b.z8 z8Var, java.util.Set set) {
        this.f126402d = z8Var;
        this.f126403e = set;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(java.lang.Object obj) {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f126402d).c();
        return this.f126403e.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f126402d).c();
        return this.f126403e.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f126402d).c();
        this.f126403e.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f126403e.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        return this.f126403e.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(java.lang.Object obj) {
        return this.f126403e.equals(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f126403e.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f126403e.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new com.p176xb6135e39.p283xc50a8b8b.z7(this.f126402d, this.f126403e.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f126402d).c();
        return this.f126403e.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f126402d).c();
        return this.f126403e.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f126402d).c();
        return this.f126403e.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f126403e.size();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        return this.f126403e.toArray();
    }

    /* renamed from: toString */
    public java.lang.String m20554x9616526c() {
        return this.f126403e.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.f126403e.toArray(objArr);
    }
}

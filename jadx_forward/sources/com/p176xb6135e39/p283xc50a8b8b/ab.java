package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes14.dex */
public class ab implements java.util.ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ListIterator f126405d;

    public ab(com.p176xb6135e39.p283xc50a8b8b.cb cbVar, int i17) {
        this.f126405d = cbVar.f126522d.listIterator(i17);
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f126405d.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f126405d.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        return (java.lang.String) this.f126405d.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f126405d.nextIndex();
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        return (java.lang.String) this.f126405d.previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f126405d.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}

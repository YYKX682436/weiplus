package com.google.protobuf;

/* loaded from: classes14.dex */
public class ab implements java.util.ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ListIterator f44872d;

    public ab(com.google.protobuf.cb cbVar, int i17) {
        this.f44872d = cbVar.f44989d.listIterator(i17);
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f44872d.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f44872d.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        return (java.lang.String) this.f44872d.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f44872d.nextIndex();
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        return (java.lang.String) this.f44872d.previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f44872d.previousIndex();
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

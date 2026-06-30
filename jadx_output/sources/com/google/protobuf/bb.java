package com.google.protobuf;

/* loaded from: classes14.dex */
public class bb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f44936d;

    public bb(com.google.protobuf.cb cbVar) {
        this.f44936d = cbVar.f44989d.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f44936d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return (java.lang.String) this.f44936d.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}

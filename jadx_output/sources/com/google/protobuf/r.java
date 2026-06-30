package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class r implements java.util.Iterator {
    @Override // java.util.Iterator
    public java.lang.Object next() {
        com.google.protobuf.q qVar = (com.google.protobuf.q) this;
        int i17 = qVar.f45417d;
        if (i17 >= qVar.f45418e) {
            throw new java.util.NoSuchElementException();
        }
        qVar.f45417d = i17 + 1;
        return java.lang.Byte.valueOf(qVar.f45419f.k(i17));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}

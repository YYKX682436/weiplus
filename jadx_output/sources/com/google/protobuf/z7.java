package com.google.protobuf;

/* loaded from: classes13.dex */
public class z7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.z8 f45803d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Iterator f45804e;

    public z7(com.google.protobuf.z8 z8Var, java.util.Iterator it) {
        this.f45803d = z8Var;
        this.f45804e = it;
    }

    public boolean equals(java.lang.Object obj) {
        return this.f45804e.equals(obj);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f45804e.hasNext();
    }

    public int hashCode() {
        return this.f45804e.hashCode();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return this.f45804e.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        ((com.google.protobuf.d8) this.f45803d).c();
        this.f45804e.remove();
    }

    public java.lang.String toString() {
        return this.f45804e.toString();
    }
}

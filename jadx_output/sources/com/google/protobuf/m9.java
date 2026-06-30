package com.google.protobuf;

/* loaded from: classes16.dex */
public class m9 extends java.util.AbstractList implements java.util.List {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.p9 f45330d;

    public m9(com.google.protobuf.p9 p9Var) {
        this.f45330d = p9Var;
    }

    public void d() {
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        return this.f45330d.k(i17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f45330d.l();
    }
}

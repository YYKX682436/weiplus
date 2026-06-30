package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class o9 extends java.util.AbstractList implements java.util.List {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.p9 f126901d;

    public o9(com.p176xb6135e39.p283xc50a8b8b.p9 p9Var) {
        this.f126901d = p9Var;
    }

    public void d() {
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        return this.f126901d.n(i17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f126901d.l();
    }
}

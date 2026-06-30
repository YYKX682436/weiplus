package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f181273d = 0;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.b0 b0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f181273d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f181273d;
        this.f181273d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

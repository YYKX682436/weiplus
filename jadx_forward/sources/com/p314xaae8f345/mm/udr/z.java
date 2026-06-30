package com.p314xaae8f345.mm.udr;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278061d = 0;

    public z(com.p314xaae8f345.mm.udr.a0 a0Var, com.p314xaae8f345.mm.udr.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278061d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278061d;
        this.f278061d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.udr.h1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

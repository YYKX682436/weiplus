package com.p314xaae8f345.mm.udr;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278038d = 0;

    public r(com.p314xaae8f345.mm.udr.s sVar, com.p314xaae8f345.mm.udr.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278038d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278038d;
        this.f278038d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.udr.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

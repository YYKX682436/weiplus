package com.p314xaae8f345.mm.udr;

/* loaded from: classes.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278035d = 0;

    public n(com.p314xaae8f345.mm.udr.o oVar, com.p314xaae8f345.mm.udr.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278035d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278035d;
        this.f278035d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.udr.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

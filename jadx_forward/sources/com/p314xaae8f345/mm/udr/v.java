package com.p314xaae8f345.mm.udr;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278047d = 0;

    public v(com.p314xaae8f345.mm.udr.w wVar, com.p314xaae8f345.mm.udr.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278047d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278047d;
        this.f278047d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.udr.f1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

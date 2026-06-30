package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f153040d = 0;

    public g(com.p314xaae8f345.mm.p959x883644fd.h hVar, com.p314xaae8f345.mm.p959x883644fd.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f153040d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f153040d;
        this.f153040d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p959x883644fd.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

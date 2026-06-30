package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f178872d = 0;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a0 a0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f178872d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f178872d;
        this.f178872d = i17 + 1;
        if (i17 == 0) {
            return n02.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

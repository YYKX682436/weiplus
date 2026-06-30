package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f240653d = 0;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f240653d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f240653d;
        this.f240653d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

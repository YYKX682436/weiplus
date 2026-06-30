package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f240671d = 0;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f240671d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f240671d;
        this.f240671d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

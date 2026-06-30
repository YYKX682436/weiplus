package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f152931d = 0;

    public q(com.p314xaae8f345.mm.p957x53236a1b.r rVar, com.p314xaae8f345.mm.p957x53236a1b.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f152931d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f152931d;
        this.f152931d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p957x53236a1b.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

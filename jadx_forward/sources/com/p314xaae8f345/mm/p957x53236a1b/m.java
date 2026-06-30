package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f152903d = 0;

    public m(com.p314xaae8f345.mm.p957x53236a1b.n nVar, com.p314xaae8f345.mm.p957x53236a1b.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f152903d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f152903d;
        this.f152903d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p957x53236a1b.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

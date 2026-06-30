package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes6.dex */
public class o2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f152646d = 0;

    public o2(com.p314xaae8f345.mm.p947xba6de98f.p2 p2Var, com.p314xaae8f345.mm.p947xba6de98f.n2 n2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f152646d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f152646d;
        this.f152646d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p947xba6de98f.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

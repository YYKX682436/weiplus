package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes6.dex */
public class k2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f152564d = 0;

    public k2(com.p314xaae8f345.mm.p947xba6de98f.l2 l2Var, com.p314xaae8f345.mm.p947xba6de98f.j2 j2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f152564d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f152564d;
        this.f152564d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p947xba6de98f.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

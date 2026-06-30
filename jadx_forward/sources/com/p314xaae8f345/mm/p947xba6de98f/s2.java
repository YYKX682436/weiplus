package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes6.dex */
public class s2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f152667d = 0;

    public s2(com.p314xaae8f345.mm.p947xba6de98f.t2 t2Var, com.p314xaae8f345.mm.p947xba6de98f.r2 r2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f152667d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f152667d;
        this.f152667d = i17 + 1;
        if (i17 == 0) {
            return bz4.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

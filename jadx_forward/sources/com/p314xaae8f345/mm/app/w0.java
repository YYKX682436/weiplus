package com.p314xaae8f345.mm.app;

/* loaded from: classes6.dex */
public class w0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f135426d = 0;

    public w0(com.p314xaae8f345.mm.app.x0 x0Var, com.p314xaae8f345.mm.app.v0 v0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f135426d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f135426d;
        this.f135426d = i17 + 1;
        if (i17 == 0) {
            return bt.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

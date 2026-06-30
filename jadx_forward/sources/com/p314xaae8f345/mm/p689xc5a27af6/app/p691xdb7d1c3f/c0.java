package com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f;

/* loaded from: classes6.dex */
public class c0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f146520d = 0;

    public c0(com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.d0 d0Var, com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.b0 b0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f146520d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f146520d;
        this.f146520d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.c1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

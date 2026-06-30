package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148581d = 0;

    public z(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.a0 a0Var, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148581d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148581d;
        this.f148581d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.x4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

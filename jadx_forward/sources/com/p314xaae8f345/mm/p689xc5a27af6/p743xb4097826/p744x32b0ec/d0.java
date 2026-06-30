package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes6.dex */
public class d0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148182d = 0;

    public d0(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.e0 e0Var, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.c0 c0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148182d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148182d;
        this.f148182d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.c5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148366d = 0;

    public n(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.o oVar, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148366d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148366d;
        this.f148366d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

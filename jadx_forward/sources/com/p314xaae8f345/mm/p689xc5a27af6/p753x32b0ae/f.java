package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148683d = 0;

    public f(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.g gVar, com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148683d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148683d;
        this.f148683d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.v1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

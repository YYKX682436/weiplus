package com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f149377d = 0;

    public f(com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.g gVar, com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f149377d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f149377d;
        this.f149377d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

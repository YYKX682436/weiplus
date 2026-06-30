package com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f149374d = 0;

    public b(com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.c cVar, com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f149374d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f149374d;
        this.f149374d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

package com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f146720d = 0;

    public z(com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.a0 a0Var, com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f146720d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f146720d;
        this.f146720d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

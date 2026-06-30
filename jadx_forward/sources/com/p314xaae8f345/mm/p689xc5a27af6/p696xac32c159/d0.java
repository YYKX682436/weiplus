package com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159;

/* loaded from: classes6.dex */
public class d0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f146679d = 0;

    public d0(com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.e0 e0Var, com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.c0 c0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f146679d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f146679d;
        this.f146679d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

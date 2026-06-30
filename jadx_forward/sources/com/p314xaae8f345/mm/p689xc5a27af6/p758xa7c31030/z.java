package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f149314d = 0;

    public z(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.a0 a0Var, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f149314d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f149314d;
        this.f149314d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

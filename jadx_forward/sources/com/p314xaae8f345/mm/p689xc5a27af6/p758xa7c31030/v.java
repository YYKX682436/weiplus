package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f149275d = 0;

    public v(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w wVar, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f149275d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f149275d;
        this.f149275d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

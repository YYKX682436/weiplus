package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes6.dex */
public class t0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f274907d = 0;

    public t0(com.p314xaae8f345.mm.p2614xca6eae71.u0 u0Var, com.p314xaae8f345.mm.p2614xca6eae71.s0 s0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f274907d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f274907d;
        this.f274907d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2614xca6eae71.v1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

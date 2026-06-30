package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes6.dex */
public class f0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f151978d = 0;

    public f0(com.p314xaae8f345.mm.p943x351df9c2.g0 g0Var, com.p314xaae8f345.mm.p943x351df9c2.e0 e0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f151978d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f151978d;
        this.f151978d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p943x351df9c2.f1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

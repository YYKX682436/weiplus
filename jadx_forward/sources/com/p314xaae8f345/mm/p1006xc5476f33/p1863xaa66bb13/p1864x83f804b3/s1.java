package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3;

/* loaded from: classes6.dex */
public class s1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f230256d = 0;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.t1 t1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.r1 r1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f230256d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f230256d;
        this.f230256d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.p2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

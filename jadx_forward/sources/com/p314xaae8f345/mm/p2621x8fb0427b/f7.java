package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes6.dex */
public class f7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f275458d = 0;

    public f7(com.p314xaae8f345.mm.p2621x8fb0427b.g7 g7Var, com.p314xaae8f345.mm.p2621x8fb0427b.e7 e7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f275458d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f275458d;
        this.f275458d = i17 + 1;
        if (i17 == 0) {
            return sv.f.INSTANCE;
        }
        if (i17 == 1) {
            return gj1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}

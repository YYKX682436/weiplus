package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes6.dex */
public class b0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f151957d = 0;

    public b0(com.p314xaae8f345.mm.p943x351df9c2.c0 c0Var, com.p314xaae8f345.mm.p943x351df9c2.a0 a0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f151957d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f151957d;
        this.f151957d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p943x351df9c2.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

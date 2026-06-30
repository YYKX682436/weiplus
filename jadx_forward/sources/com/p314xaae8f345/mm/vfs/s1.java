package com.p314xaae8f345.mm.vfs;

/* loaded from: classes6.dex */
public class s1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f294704d = 0;

    public s1(com.p314xaae8f345.mm.vfs.t1 t1Var, com.p314xaae8f345.mm.vfs.r1 r1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f294704d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f294704d;
        this.f294704d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.vfs.j7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

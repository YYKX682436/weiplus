package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes6.dex */
public class n3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f170257d = 0;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o3 o3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.m3 m3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f170257d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f170257d;
        this.f170257d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p957x53236a1b.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

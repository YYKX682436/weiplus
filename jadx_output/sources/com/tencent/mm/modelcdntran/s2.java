package com.tencent.mm.modelcdntran;

/* loaded from: classes6.dex */
public class s2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f71134d = 0;

    public s2(com.tencent.mm.modelcdntran.t2 t2Var, com.tencent.mm.modelcdntran.r2 r2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71134d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f71134d;
        this.f71134d = i17 + 1;
        if (i17 == 0) {
            return bz4.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

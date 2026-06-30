package com.tencent.mm.modelcdntran;

/* loaded from: classes6.dex */
public class k2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f71031d = 0;

    public k2(com.tencent.mm.modelcdntran.l2 l2Var, com.tencent.mm.modelcdntran.j2 j2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71031d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f71031d;
        this.f71031d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.modelcdntran.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

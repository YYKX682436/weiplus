package com.tencent.mm.modelcdntran;

/* loaded from: classes6.dex */
public class o2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f71113d = 0;

    public o2(com.tencent.mm.modelcdntran.p2 p2Var, com.tencent.mm.modelcdntran.n2 n2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71113d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f71113d;
        this.f71113d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.modelcdntran.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

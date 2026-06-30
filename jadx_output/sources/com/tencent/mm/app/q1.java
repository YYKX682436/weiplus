package com.tencent.mm.app;

/* loaded from: classes6.dex */
public class q1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f53718d = 0;

    public q1(com.tencent.mm.app.r1 r1Var, com.tencent.mm.app.p1 p1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f53718d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f53718d;
        this.f53718d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.app.g5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

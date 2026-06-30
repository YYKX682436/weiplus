package com.tencent.mm.app;

/* loaded from: classes6.dex */
public class u1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f53820d = 0;

    public u1(com.tencent.mm.app.v1 v1Var, com.tencent.mm.app.t1 t1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f53820d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f53820d;
        this.f53820d = i17 + 1;
        if (i17 == 0) {
            return z33.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

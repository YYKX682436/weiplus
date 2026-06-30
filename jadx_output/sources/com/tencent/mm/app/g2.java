package com.tencent.mm.app;

/* loaded from: classes6.dex */
public class g2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f53425d = 0;

    public g2(com.tencent.mm.app.h2 h2Var, com.tencent.mm.app.f2 f2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f53425d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f53425d;
        this.f53425d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.app.p7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

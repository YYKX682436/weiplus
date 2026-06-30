package com.p314xaae8f345.mm.app;

/* loaded from: classes6.dex */
public class g2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f134958d = 0;

    public g2(com.p314xaae8f345.mm.app.h2 h2Var, com.p314xaae8f345.mm.app.f2 f2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f134958d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f134958d;
        this.f134958d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.app.p7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

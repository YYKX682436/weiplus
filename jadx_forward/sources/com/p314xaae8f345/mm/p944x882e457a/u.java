package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f152345d = 0;

    public u(com.p314xaae8f345.mm.p944x882e457a.v vVar, com.p314xaae8f345.mm.p944x882e457a.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f152345d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f152345d;
        this.f152345d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.app.p7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

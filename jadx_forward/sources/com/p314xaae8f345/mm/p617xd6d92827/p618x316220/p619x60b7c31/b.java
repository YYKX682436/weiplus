package com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f134701d = 0;

    public b(com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.c cVar, com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f134701d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f134701d;
        this.f134701d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

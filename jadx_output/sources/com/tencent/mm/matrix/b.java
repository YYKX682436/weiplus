package com.tencent.mm.matrix;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f68688d = 0;

    public b(com.tencent.mm.matrix.c cVar, com.tencent.mm.matrix.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68688d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f68688d;
        this.f68688d = i17 + 1;
        if (i17 == 0) {
            return kh.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

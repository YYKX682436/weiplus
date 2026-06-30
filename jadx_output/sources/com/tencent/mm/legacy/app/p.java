package com.tencent.mm.legacy.app;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f68511d = 0;

    public p(com.tencent.mm.legacy.app.q qVar, com.tencent.mm.legacy.app.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68511d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f68511d;
        this.f68511d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.legacy.app.a1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

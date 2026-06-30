package com.tencent.mm.modelstat;

/* loaded from: classes.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f71507d = 0;

    public g(com.tencent.mm.modelstat.h hVar, com.tencent.mm.modelstat.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71507d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f71507d;
        this.f71507d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.modelstat.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

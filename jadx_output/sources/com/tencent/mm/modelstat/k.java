package com.tencent.mm.modelstat;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f71530d = 0;

    public k(com.tencent.mm.modelstat.l lVar, com.tencent.mm.modelstat.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71530d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f71530d;
        this.f71530d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.modelstat.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

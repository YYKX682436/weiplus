package com.tencent.mm.insane_statistic;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f68297d = 0;

    public h(com.tencent.mm.insane_statistic.i iVar, com.tencent.mm.insane_statistic.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68297d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f68297d;
        this.f68297d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.insane_statistic.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

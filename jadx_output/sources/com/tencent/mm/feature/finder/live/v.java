package com.tencent.mm.feature.finder.live;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66965d = 0;

    public v(com.tencent.mm.feature.finder.live.w wVar, com.tencent.mm.feature.finder.live.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66965d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66965d;
        this.f66965d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

package com.tencent.mm.feature.finder.live;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66778d = 0;

    public j(com.tencent.mm.feature.finder.live.k kVar, com.tencent.mm.feature.finder.live.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66778d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66778d;
        this.f66778d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

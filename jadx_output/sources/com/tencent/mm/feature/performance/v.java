package com.tencent.mm.feature.performance;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f67742d = 0;

    public v(com.tencent.mm.feature.performance.w wVar, com.tencent.mm.feature.performance.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f67742d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f67742d;
        this.f67742d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

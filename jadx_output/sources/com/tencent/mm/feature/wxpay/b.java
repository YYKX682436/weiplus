package com.tencent.mm.feature.wxpay;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f67841d = 0;

    public b(com.tencent.mm.feature.wxpay.c cVar, com.tencent.mm.feature.wxpay.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f67841d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f67841d;
        this.f67841d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.wxpay.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

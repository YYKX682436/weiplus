package com.tencent.mm.feature.lite;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f67150d = 0;

    public f(com.tencent.mm.feature.lite.g gVar, com.tencent.mm.feature.lite.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f67150d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f67150d;
        this.f67150d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.lite.v1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

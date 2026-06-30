package com.tencent.mm.feature.sight.api;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f67828d = 0;

    public f(com.tencent.mm.feature.sight.api.g gVar, com.tencent.mm.feature.sight.api.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f67828d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f67828d;
        this.f67828d = i17 + 1;
        if (i17 == 0) {
            return be0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

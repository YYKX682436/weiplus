package com.tencent.mm.feature.sight.api;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f67825d = 0;

    public b(com.tencent.mm.feature.sight.api.c cVar, com.tencent.mm.feature.sight.api.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f67825d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f67825d;
        this.f67825d = i17 + 1;
        if (i17 == 0) {
            return kt3.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

package com.tencent.mm.feature.app.extension;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f64992d = 0;

    public e(com.tencent.mm.feature.app.extension.f fVar, com.tencent.mm.feature.app.extension.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f64992d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f64992d;
        this.f64992d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.app.extension.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

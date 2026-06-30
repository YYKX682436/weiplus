package com.tencent.mm.feature.app.extension;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65007d = 0;

    public m(com.tencent.mm.feature.app.extension.n nVar, com.tencent.mm.feature.app.extension.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65007d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65007d;
        this.f65007d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.app.extension.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

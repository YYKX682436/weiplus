package com.tencent.mm.feature.app.extension;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65025d = 0;

    public u(com.tencent.mm.feature.app.extension.v vVar, com.tencent.mm.feature.app.extension.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65025d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65025d;
        this.f65025d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.app.extension.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

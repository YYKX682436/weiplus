package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66097d = 0;

    public k(com.tencent.mm.feature.emoji.api.l lVar, com.tencent.mm.feature.emoji.api.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66097d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66097d;
        this.f66097d = i17 + 1;
        if (i17 == 0) {
            return g30.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

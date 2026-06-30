package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66076d = 0;

    public g(com.tencent.mm.feature.emoji.api.h hVar, com.tencent.mm.feature.emoji.api.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66076d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66076d;
        this.f66076d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

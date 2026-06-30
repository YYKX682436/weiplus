package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66151d = 0;

    public w(com.tencent.mm.feature.emoji.api.x xVar, com.tencent.mm.feature.emoji.api.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66151d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66151d;
        this.f66151d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

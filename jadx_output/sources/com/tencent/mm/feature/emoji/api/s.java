package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66133d = 0;

    public s(com.tencent.mm.feature.emoji.api.t tVar, com.tencent.mm.feature.emoji.api.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66133d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66133d;
        this.f66133d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class w3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66157d = 0;

    public w3(com.tencent.mm.feature.emoji.api.x3 x3Var, com.tencent.mm.feature.emoji.api.v3 v3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66157d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66157d;
        this.f66157d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.m4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

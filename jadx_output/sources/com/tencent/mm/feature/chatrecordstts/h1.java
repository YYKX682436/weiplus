package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes6.dex */
public class h1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65449d = 0;

    public h1(com.tencent.mm.feature.chatrecordstts.i1 i1Var, com.tencent.mm.feature.chatrecordstts.g1 g1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65449d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65449d;
        this.f65449d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.chatrecordstts.d1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

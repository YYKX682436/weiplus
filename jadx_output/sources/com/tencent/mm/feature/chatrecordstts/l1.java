package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes6.dex */
public class l1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65500d = 0;

    public l1(com.tencent.mm.feature.chatrecordstts.m1 m1Var, com.tencent.mm.feature.chatrecordstts.k1 k1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65500d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65500d;
        this.f65500d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.chatrecordstts.z1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class s1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66136d = 0;

    public s1(com.tencent.mm.feature.emoji.api.t1 t1Var, com.tencent.mm.feature.emoji.api.r1 r1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66136d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66136d;
        this.f66136d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

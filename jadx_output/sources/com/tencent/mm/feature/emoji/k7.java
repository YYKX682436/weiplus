package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class k7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66363d = 0;

    public k7(com.tencent.mm.feature.emoji.l7 l7Var, com.tencent.mm.feature.emoji.j7 j7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66363d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66363d;
        this.f66363d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

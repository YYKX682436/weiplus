package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class u8 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66505d = 0;

    public u8(com.tencent.mm.feature.emoji.v8 v8Var, com.tencent.mm.feature.emoji.t8 t8Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66505d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66505d;
        this.f66505d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.o2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

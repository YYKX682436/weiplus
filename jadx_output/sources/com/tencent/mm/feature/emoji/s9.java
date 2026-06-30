package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class s9 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66478d = 0;

    public s9(com.tencent.mm.feature.emoji.t9 t9Var, com.tencent.mm.feature.emoji.r9 r9Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66478d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66478d;
        this.f66478d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.o4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

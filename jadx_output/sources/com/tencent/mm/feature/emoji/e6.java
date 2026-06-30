package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class e6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66245d = 0;

    public e6(com.tencent.mm.feature.emoji.f6 f6Var, com.tencent.mm.feature.emoji.d6 d6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66245d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66245d;
        this.f66245d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

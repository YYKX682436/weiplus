package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class ma implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66398d = 0;

    public ma(com.tencent.mm.feature.emoji.na naVar, com.tencent.mm.feature.emoji.la laVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66398d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66398d;
        this.f66398d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.fb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

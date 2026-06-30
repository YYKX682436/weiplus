package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class qa implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66451d = 0;

    public qa(com.tencent.mm.feature.emoji.ra raVar, com.tencent.mm.feature.emoji.pa paVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66451d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66451d;
        this.f66451d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.hb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

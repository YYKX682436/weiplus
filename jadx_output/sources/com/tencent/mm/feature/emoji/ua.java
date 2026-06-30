package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class ua implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66508d = 0;

    public ua(com.tencent.mm.feature.emoji.va vaVar, com.tencent.mm.feature.emoji.ta taVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66508d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66508d;
        this.f66508d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.jb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

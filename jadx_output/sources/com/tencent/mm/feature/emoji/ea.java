package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class ea implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66251d = 0;

    public ea(com.tencent.mm.feature.emoji.fa faVar, com.tencent.mm.feature.emoji.da daVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66251d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66251d;
        this.f66251d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.bb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

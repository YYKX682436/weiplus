package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f159378d = 0;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f159378d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f159378d;
        this.f159378d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

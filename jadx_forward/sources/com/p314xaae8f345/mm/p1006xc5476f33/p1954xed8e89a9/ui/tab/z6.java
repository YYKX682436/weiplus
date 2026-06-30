package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes6.dex */
public class z6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f236247d = 0;

    public z6(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.a7 a7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.y6 y6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f236247d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f236247d;
        this.f236247d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

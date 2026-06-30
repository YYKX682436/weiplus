package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes6.dex */
public class y0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f102703d = 0;

    public y0(com.tencent.mm.plugin.finder.assist.z0 z0Var, com.tencent.mm.plugin.finder.assist.x0 x0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102703d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f102703d;
        this.f102703d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.assist.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

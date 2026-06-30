package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes6.dex */
public class g1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f102185d = 0;

    public g1(com.tencent.mm.plugin.finder.assist.h1 h1Var, com.tencent.mm.plugin.finder.assist.f1 f1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102185d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f102185d;
        this.f102185d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.assist.f3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

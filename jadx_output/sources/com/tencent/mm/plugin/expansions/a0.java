package com.tencent.mm.plugin.expansions;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f99740d = 0;

    public a0(com.tencent.mm.plugin.expansions.b0 b0Var, com.tencent.mm.plugin.expansions.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99740d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f99740d;
        this.f99740d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.expansions.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

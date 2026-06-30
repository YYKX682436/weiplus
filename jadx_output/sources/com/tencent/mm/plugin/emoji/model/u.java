package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f97605d = 0;

    public u(com.tencent.mm.plugin.emoji.model.v vVar, com.tencent.mm.plugin.emoji.model.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f97605d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f97605d;
        this.f97605d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.emoji.model.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

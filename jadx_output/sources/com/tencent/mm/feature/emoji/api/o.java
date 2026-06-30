package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66115d = 0;

    public o(com.tencent.mm.feature.emoji.api.p pVar, com.tencent.mm.feature.emoji.api.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66115d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66115d;
        this.f66115d = i17 + 1;
        if (i17 == 0) {
            return h30.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

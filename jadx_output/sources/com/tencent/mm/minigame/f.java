package com.tencent.mm.minigame;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f69067d = 0;

    public f(com.tencent.mm.minigame.g gVar, com.tencent.mm.minigame.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f69067d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f69067d;
        this.f69067d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.minigame.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

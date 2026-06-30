package com.tencent.mm.minigame;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f69082d = 0;

    public j(com.tencent.mm.minigame.k kVar, com.tencent.mm.minigame.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f69082d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f69082d;
        this.f69082d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.minigame.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

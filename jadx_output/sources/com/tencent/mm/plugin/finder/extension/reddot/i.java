package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105575d = 0;

    public i(com.tencent.mm.plugin.finder.extension.reddot.j jVar, com.tencent.mm.plugin.finder.extension.reddot.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105575d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105575d;
        this.f105575d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.extension.reddot.y1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

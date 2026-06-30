package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f101363d = 0;

    public r(com.tencent.mm.plugin.fav.ui.s sVar, com.tencent.mm.plugin.fav.ui.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f101363d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f101363d;
        this.f101363d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.fav.ui.rc.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

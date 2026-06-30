package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f101187d = 0;

    public j(com.tencent.mm.plugin.fav.ui.k kVar, com.tencent.mm.plugin.fav.ui.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f101187d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f101187d;
        this.f101187d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.fav.ui.ma.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

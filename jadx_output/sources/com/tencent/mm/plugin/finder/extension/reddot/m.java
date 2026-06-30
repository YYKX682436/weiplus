package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105697d = 0;

    public m(com.tencent.mm.plugin.finder.extension.reddot.n nVar, com.tencent.mm.plugin.finder.extension.reddot.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105697d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105697d;
        this.f105697d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.extension.reddot.n2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

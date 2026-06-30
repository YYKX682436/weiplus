package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f96874d = 0;

    public t(com.tencent.mm.plugin.dbbackup.u uVar, com.tencent.mm.plugin.dbbackup.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f96874d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f96874d;
        this.f96874d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.dbbackup.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

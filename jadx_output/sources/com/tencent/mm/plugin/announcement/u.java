package com.tencent.mm.plugin.announcement;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f74707d = 0;

    public u(com.tencent.mm.plugin.announcement.v vVar, com.tencent.mm.plugin.announcement.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f74707d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f74707d;
        this.f74707d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.announcement.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

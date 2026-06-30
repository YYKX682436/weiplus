package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f92580d = 0;

    public d(com.tencent.mm.plugin.backup.roambackup.e eVar, com.tencent.mm.plugin.backup.roambackup.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f92580d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f92580d;
        this.f92580d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.backup.roambackup.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

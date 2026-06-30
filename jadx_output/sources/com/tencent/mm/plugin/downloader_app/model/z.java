package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f97339d = 0;

    public z(com.tencent.mm.plugin.downloader_app.model.a0 a0Var, com.tencent.mm.plugin.downloader_app.model.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f97339d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f97339d;
        this.f97339d = i17 + 1;
        if (i17 == 0) {
            return n02.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

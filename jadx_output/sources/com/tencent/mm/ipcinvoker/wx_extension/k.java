package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f68435d = 0;

    public k(com.tencent.mm.ipcinvoker.wx_extension.l lVar, com.tencent.mm.ipcinvoker.wx_extension.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68435d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f68435d;
        this.f68435d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ipcinvoker.wx_extension.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

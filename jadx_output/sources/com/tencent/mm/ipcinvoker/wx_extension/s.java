package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f68448d = 0;

    public s(com.tencent.mm.ipcinvoker.wx_extension.t tVar, com.tencent.mm.ipcinvoker.wx_extension.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68448d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f68448d;
        this.f68448d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ipcinvoker.wx_extension.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

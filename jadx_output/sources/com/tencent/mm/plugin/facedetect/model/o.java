package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f100025d = 0;

    public o(com.tencent.mm.plugin.facedetect.model.p pVar, com.tencent.mm.plugin.facedetect.model.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f100025d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f100025d;
        this.f100025d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.facedetect.model.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

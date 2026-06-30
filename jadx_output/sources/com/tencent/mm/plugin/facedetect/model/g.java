package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f100002d = 0;

    public g(com.tencent.mm.plugin.facedetect.model.h hVar, com.tencent.mm.plugin.facedetect.model.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f100002d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f100002d;
        this.f100002d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.facedetect.model.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

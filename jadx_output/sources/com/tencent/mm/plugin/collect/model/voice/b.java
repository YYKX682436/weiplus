package com.tencent.mm.plugin.collect.model.voice;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f96152d = 0;

    public b(com.tencent.mm.plugin.collect.model.voice.c cVar, com.tencent.mm.plugin.collect.model.voice.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f96152d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f96152d;
        this.f96152d = i17 + 1;
        if (i17 == 0) {
            return ww1.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

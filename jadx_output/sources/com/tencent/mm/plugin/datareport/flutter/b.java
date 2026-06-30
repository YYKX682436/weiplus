package com.tencent.mm.plugin.datareport.flutter;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f96690d = 0;

    public b(com.tencent.mm.plugin.datareport.flutter.c cVar, com.tencent.mm.plugin.datareport.flutter.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f96690d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f96690d;
        this.f96690d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.datareport.flutter.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

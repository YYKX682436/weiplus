package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88889d = 0;

    public c(com.tencent.mm.plugin.appbrand.skyline.nativeview.d dVar, com.tencent.mm.plugin.appbrand.skyline.nativeview.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88889d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88889d;
        this.f88889d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.skyline.nativeview.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}

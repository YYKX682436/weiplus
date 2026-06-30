package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class ss extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = ya.b.LEVEL)
    public int[] f51530a;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "districts")
    public java.util.List<com.tencent.mapsdk.internal.st> f51531b;

    private void a(int[] iArr) {
        this.f51530a = iArr;
    }

    private java.util.List<com.tencent.mapsdk.internal.st> b() {
        return this.f51531b;
    }

    private void a(java.util.List<com.tencent.mapsdk.internal.st> list) {
        this.f51531b = list;
    }

    private int[] a() {
        return this.f51530a;
    }
}

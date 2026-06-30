package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class ek extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "layers")
    public java.util.List<com.tencent.mapsdk.internal.ej> f49290a;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "enable")
    private int f49291b;

    private java.util.List<com.tencent.mapsdk.internal.ej> b() {
        return this.f49290a;
    }

    public final boolean a() {
        return this.f49291b == 1;
    }

    public java.lang.String toString() {
        return "DataLayerInfo{enable=" + this.f49291b + ", layers=" + this.f49290a + '}';
    }
}

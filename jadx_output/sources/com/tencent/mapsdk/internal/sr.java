package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sr extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: a, reason: collision with root package name */
    public static final int f51525a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f51526b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f51527c = 3;

    /* renamed from: d, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "scenetype")
    public int f51528d;

    /* renamed from: e, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "tilesrc")
    public com.tencent.mapsdk.internal.sx f51529e;

    private int a() {
        return this.f51528d;
    }

    private com.tencent.mapsdk.internal.sx b() {
        return this.f51529e;
    }

    private void c() {
        this.f51528d = 1;
    }

    private void a(com.tencent.mapsdk.internal.sx sxVar) {
        this.f51529e = sxVar;
    }
}

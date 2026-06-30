package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sv extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: a, reason: collision with root package name */
    public static int f51546a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f51547b = 1000;

    /* renamed from: c, reason: collision with root package name */
    public static int f51548c = 100;

    /* renamed from: d, reason: collision with root package name */
    public static final int f51549d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f51550e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f51551f = 7;

    /* renamed from: g, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "version")
    public int f51552g;

    /* renamed from: h, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "frontier")
    public com.tencent.mapsdk.internal.su f51553h;

    /* renamed from: i, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "ver_data")
    public java.util.List<com.tencent.mapsdk.internal.sr> f51554i;

    /* renamed from: j, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "detail")
    public java.util.List<com.tencent.mapsdk.internal.ss> f51555j;

    private int a() {
        return this.f51552g;
    }

    private com.tencent.mapsdk.internal.su b() {
        return this.f51553h;
    }

    private java.util.List<com.tencent.mapsdk.internal.sr> c() {
        return this.f51554i;
    }

    private java.util.List<com.tencent.mapsdk.internal.ss> d() {
        return this.f51555j;
    }

    private void a(int i17) {
        this.f51552g = i17;
    }

    private void b(java.util.List<com.tencent.mapsdk.internal.ss> list) {
        this.f51555j = list;
    }

    private void a(com.tencent.mapsdk.internal.su suVar) {
        this.f51553h = suVar;
    }

    private void a(java.util.List<com.tencent.mapsdk.internal.sr> list) {
        this.f51554i = list;
    }
}

package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class st extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: i, reason: collision with root package name */
    private static final java.lang.String f51532i = "default";

    /* renamed from: k, reason: collision with root package name */
    private static final int f51533k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int f51534l = 1;

    /* renamed from: e, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "logo_night")
    public java.lang.String f51539e;

    /* renamed from: f, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(ignore = true)
    public android.graphics.Bitmap f51540f;

    /* renamed from: g, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(ignore = true)
    public android.graphics.Bitmap f51541g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f51542h;

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "rule")
    public int f51535a = 0;

    /* renamed from: j, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY)
    private int f51543j = 0;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "frontier")
    public java.lang.String f51536b = "default";

    /* renamed from: c, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "logo_name")
    public java.lang.String f51537c = "";

    /* renamed from: d, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "logo")
    public java.lang.String f51538d = "";

    private boolean b() {
        return this.f51542h;
    }

    private void c() {
        this.f51542h = true;
    }

    private void d() {
        this.f51535a = 1;
    }

    private java.lang.String e() {
        return this.f51537c;
    }

    private java.lang.String f() {
        return this.f51538d;
    }

    private java.lang.String g() {
        return this.f51539e;
    }

    public final int a() {
        return (this.f51535a * 10) + this.f51543j;
    }

    private void b(java.lang.String str) {
        this.f51537c = str;
    }

    private void c(java.lang.String str) {
        this.f51538d = str;
    }

    private void d(java.lang.String str) {
        this.f51539e = str;
    }

    public final boolean a(com.tencent.mapsdk.internal.gb gbVar) {
        boolean b17;
        int i17 = this.f51535a;
        if (i17 != 0) {
            b17 = i17 != 1 ? false : c(gbVar);
        } else {
            b17 = b(gbVar);
        }
        return this.f51542h ? !b17 : b17;
    }

    private void b(android.graphics.Bitmap bitmap) {
        this.f51541g = bitmap;
    }

    private boolean c(com.tencent.mapsdk.internal.gb gbVar) {
        if ("default".equals(this.f51536b)) {
            return true;
        }
        if (gbVar == null) {
            return false;
        }
        com.tencent.mapsdk.internal.sm.a();
        com.tencent.mapsdk.internal.gc[] c17 = com.tencent.mapsdk.internal.sm.c(this.f51536b);
        com.tencent.mapsdk.internal.gc[] gcVarArr = gbVar.f49561b;
        if (gcVarArr == null || c17 == null) {
            return true;
        }
        return com.tencent.mapsdk.internal.sm.a(gcVarArr, c17);
    }

    private boolean b(com.tencent.mapsdk.internal.gb gbVar) {
        if ("default".equals(this.f51536b)) {
            return true;
        }
        if (gbVar == null) {
            return false;
        }
        com.tencent.mapsdk.internal.gc gcVar = gbVar.f49560a;
        com.tencent.mapsdk.internal.sm.a();
        return com.tencent.mapsdk.internal.sm.a(gcVar, com.tencent.mapsdk.internal.sm.c(this.f51536b));
    }

    private void a(int i17) {
        this.f51543j = i17;
    }

    private void a(java.lang.String str) {
        this.f51536b = str;
    }

    public final android.graphics.Bitmap a(boolean z17) {
        return z17 ? this.f51541g : this.f51540f;
    }

    private void a(android.graphics.Bitmap bitmap) {
        this.f51540f = bitmap;
    }
}

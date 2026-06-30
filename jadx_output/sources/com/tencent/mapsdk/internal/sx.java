package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sx extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)
    public java.lang.String f51558a;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "style")
    public int f51559b;

    /* renamed from: c, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)
    public int f51560c;

    /* renamed from: d, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "version")
    public int f51561d;

    /* renamed from: e, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "url")
    public java.lang.String f51562e;

    /* renamed from: f, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "range")
    public int[] f51563f;

    private java.lang.String a() {
        return this.f51558a;
    }

    private int b() {
        return this.f51559b;
    }

    private int c() {
        return this.f51560c;
    }

    private int d() {
        return this.f51561d;
    }

    private java.lang.String e() {
        return this.f51562e;
    }

    private int[] f() {
        return this.f51563f;
    }

    public final java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("WorldMapTileSrc{mName='");
        stringBuffer.append(this.f51558a);
        stringBuffer.append("', mStyle=");
        stringBuffer.append(this.f51559b);
        stringBuffer.append(", mScene=");
        stringBuffer.append(this.f51560c);
        stringBuffer.append(", mVersion=");
        stringBuffer.append(this.f51561d);
        stringBuffer.append(", mUrl='");
        stringBuffer.append(this.f51562e);
        stringBuffer.append("', mRanges=");
        if (this.f51563f == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append('[');
            int i17 = 0;
            while (i17 < this.f51563f.length) {
                stringBuffer.append(i17 == 0 ? "" : ", ");
                stringBuffer.append(this.f51563f[i17]);
                i17++;
            }
            stringBuffer.append(']');
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    private void a(java.lang.String str) {
        this.f51558a = str;
    }

    private void b(int i17) {
        this.f51560c = i17;
    }

    private void c(int i17) {
        this.f51561d = i17;
    }

    private void a(int i17) {
        this.f51559b = i17;
    }

    private void b(java.lang.String str) {
        this.f51562e = str;
    }

    private void a(int[] iArr) {
        this.f51563f = iArr;
    }

    private java.lang.String a(int i17, int i18, int i19, java.lang.String str) {
        java.lang.String replaceFirst;
        java.lang.String str2 = this.f51562e;
        int[] iArr = this.f51563f;
        if (iArr.length == 0) {
            replaceFirst = str2.replaceFirst("\\{range\\}", "");
        } else {
            replaceFirst = str2.replaceFirst("\\{range\\}", java.lang.Integer.toString(a(i17 + i18, iArr.length)));
        }
        return replaceFirst.replaceFirst("\\{z\\}", java.lang.Integer.toString(i19)).replaceFirst("\\{x\\}", java.lang.Integer.toString(i17)).replaceFirst("\\{y\\}", java.lang.Integer.toString(i18)).replaceFirst("\\{style\\}", java.lang.Integer.toString(this.f51559b)).replaceFirst("\\{scene\\}", java.lang.Integer.toString(this.f51560c)).replaceFirst("\\{version\\}", java.lang.Integer.toString(this.f51561d)).replaceFirst("\\{ch\\}", str);
    }

    public static int a(int i17, int i18) {
        int i19 = i17 % i18;
        return i19 * i18 < 0 ? i19 + i18 : i19;
    }
}

package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class bz extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(ignore = true)
    public java.lang.String f49075a;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "md5")
    public java.lang.String f49076b;

    /* renamed from: c, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "pinyin")
    public java.lang.String f49077c;

    /* renamed from: d, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "size")
    public int f49078d;

    /* renamed from: e, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "ver")
    public int f49079e;

    private boolean a(com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem) {
        return offlineItem.getPinyin().equals(this.f49077c);
    }

    private java.lang.String b() {
        return this.f49077c + ".zip";
    }

    private java.lang.String c() {
        return this.f49075a + java.io.File.separator + this.f49077c + this.f49079e + ".zip";
    }

    public final java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OfflineMapConfigCity{url='");
        stringBuffer.append(this.f49075a);
        stringBuffer.append("', md5='");
        stringBuffer.append(this.f49076b);
        stringBuffer.append("', pinyin='");
        stringBuffer.append(this.f49077c);
        stringBuffer.append("', size=");
        stringBuffer.append(this.f49078d);
        stringBuffer.append(", version=");
        stringBuffer.append(this.f49079e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    private void b(com.tencent.mapsdk.internal.mv mvVar) {
        if (mvVar != null) {
            mvVar.a(this.f49077c + "-md5", this.f49076b);
            mvVar.a(this.f49077c + "-version", this.f49079e);
        }
    }

    public final java.lang.String a() {
        return this.f49077c + ".dat";
    }

    private boolean a(com.tencent.mapsdk.internal.mv mvVar) {
        if (mvVar == null) {
            return false;
        }
        java.lang.String a17 = mvVar.a(this.f49077c + "-md5");
        if (this.f49079e == mvVar.b(this.f49077c + "-version", -1)) {
            return (a17 == null || a17.equals(this.f49076b)) ? false : true;
        }
        return true;
    }
}

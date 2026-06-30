package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class z implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.JsApiGetLastLocationCacheWC$LocationData f81516d;

    public z(com.tencent.mm.plugin.appbrand.jsapi.lbs.a0 a0Var, com.tencent.mm.plugin.appbrand.jsapi.lbs.JsApiGetLastLocationCacheWC$LocationData jsApiGetLastLocationCacheWC$LocationData) {
        this.f81516d = jsApiGetLastLocationCacheWC$LocationData;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.appbrand.jsapi.lbs.JsApiGetLastLocationCacheWC$LocationData jsApiGetLastLocationCacheWC$LocationData = this.f81516d;
        jsApiGetLastLocationCacheWC$LocationData.f81384d = f18;
        jsApiGetLastLocationCacheWC$LocationData.f81385e = f17;
        return false;
    }
}

package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes12.dex */
public class qa implements g32.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.ra f82872a;

    public qa(com.tencent.mm.plugin.appbrand.jsapi.ra raVar) {
        this.f82872a = raVar;
    }

    public void a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.appbrand.jsapi.ra raVar = this.f82872a;
        raVar.f82900d.f78589i = z17 && z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWeRunSetting", "After getUserState requestOk %b, hasStep %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting.B(raVar.f82900d);
    }
}

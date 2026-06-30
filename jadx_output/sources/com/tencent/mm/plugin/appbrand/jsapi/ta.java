package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes12.dex */
public class ta implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting f83470a;

    public ta(com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting jsApiOpenWeRunSetting$OpenWeRunSetting) {
        this.f83470a = jsApiOpenWeRunSetting$OpenWeRunSetting;
    }

    @Override // nf.j
    public void onResult(int i17, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting jsApiOpenWeRunSetting$OpenWeRunSetting = this.f83470a;
        if (i17 == -1) {
            jsApiOpenWeRunSetting$OpenWeRunSetting.f78587g.a(jsApiOpenWeRunSetting$OpenWeRunSetting.f78588h, jsApiOpenWeRunSetting$OpenWeRunSetting.f78586f.o("ok"));
            jsApiOpenWeRunSetting$OpenWeRunSetting.x();
        } else if (i17 == 0) {
            jsApiOpenWeRunSetting$OpenWeRunSetting.f78587g.a(jsApiOpenWeRunSetting$OpenWeRunSetting.f78588h, jsApiOpenWeRunSetting$OpenWeRunSetting.f78586f.o("cancel"));
            jsApiOpenWeRunSetting$OpenWeRunSetting.x();
        } else {
            jsApiOpenWeRunSetting$OpenWeRunSetting.f78587g.a(jsApiOpenWeRunSetting$OpenWeRunSetting.f78588h, jsApiOpenWeRunSetting$OpenWeRunSetting.f78586f.o("fail"));
            jsApiOpenWeRunSetting$OpenWeRunSetting.x();
        }
    }
}

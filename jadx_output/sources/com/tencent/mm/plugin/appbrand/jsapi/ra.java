package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes12.dex */
public class ra implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting f82900d;

    public ra(com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting jsApiOpenWeRunSetting$OpenWeRunSetting) {
        this.f82900d = jsApiOpenWeRunSetting$OpenWeRunSetting;
    }

    @Override // java.lang.Runnable
    public void run() {
        ve4.e eVar = (ve4.e) i95.n0.c(ve4.e.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((ue4.w) eVar).getClass();
        boolean a17 = com.tencent.mm.plugin.sport.model.c0.a(context);
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting jsApiOpenWeRunSetting$OpenWeRunSetting = this.f82900d;
        jsApiOpenWeRunSetting$OpenWeRunSetting.f78589i = a17;
        if (!jsApiOpenWeRunSetting$OpenWeRunSetting.f78591n || jsApiOpenWeRunSetting$OpenWeRunSetting.f78589i) {
            com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting.B(jsApiOpenWeRunSetting$OpenWeRunSetting);
            return;
        }
        g32.d0 d0Var = (g32.d0) i95.n0.c(g32.d0.class);
        com.tencent.mm.plugin.appbrand.jsapi.qa qaVar = new com.tencent.mm.plugin.appbrand.jsapi.qa(this);
        g32.h hVar = (g32.h) d0Var;
        hVar.getClass();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cs3();
        lVar.f70665b = new r45.ds3();
        lVar.f70666c = "/cgi-bin/mmoc-bin/hardware/getwerunuserstate";
        lVar.f70667d = 1926;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.z2.d(lVar.a(), new g32.g(hVar, qaVar), true);
    }
}

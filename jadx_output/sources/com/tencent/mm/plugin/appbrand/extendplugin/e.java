package com.tencent.mm.plugin.appbrand.extendplugin;

/* loaded from: classes7.dex */
public class e implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf.e f78034d;

    public e(com.tencent.mm.plugin.appbrand.extendplugin.b bVar, sf.e eVar) {
        this.f78034d = eVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        sf.e eVar = this.f78034d;
        if (eVar != null) {
            eVar.onDestroy();
        }
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public class i implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f80965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.fakenative.h f80967f;

    public i(com.tencent.mm.plugin.appbrand.jsapi.fakenative.h hVar, com.tencent.mm.plugin.appbrand.y yVar, int i17) {
        this.f80967f = hVar;
        this.f80965d = yVar;
        this.f80966e = i17;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram, user canceled");
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.h hVar = this.f80967f;
        hVar.f80954g = true;
        hVar.D(this.f80965d, this.f80966e, -3, "fail cancel");
    }
}

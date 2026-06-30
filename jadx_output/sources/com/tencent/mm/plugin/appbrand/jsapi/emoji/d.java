package com.tencent.mm.plugin.appbrand.jsapi.emoji;

/* loaded from: classes13.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f80838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v75 f80839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.emoji.g f80840f;

    public d(com.tencent.mm.ui.widget.dialog.u3 u3Var, r45.v75 v75Var, com.tencent.mm.plugin.appbrand.jsapi.emoji.g gVar) {
        this.f80838d = u3Var;
        this.f80839e = v75Var;
        this.f80840f = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f80838d;
        if (u3Var.isShowing()) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.appbrand.jsapi.emoji.g gVar = this.f80840f;
        r45.v75 v75Var = this.f80839e;
        if (v75Var != null) {
            int i17 = v75Var.f387964d;
            java.lang.String str = v75Var.f387965e;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String str3 = v75Var.f387966f;
            java.lang.String str4 = str3 == null ? "" : str3;
            java.lang.String str5 = v75Var.f387967g;
            java.lang.String str6 = str5 == null ? "" : str5;
            java.lang.String str7 = v75Var.f387970m;
            java.lang.String str8 = str7 == null ? "" : str7;
            java.lang.String str9 = v75Var.f387969i;
            java.lang.String str10 = str9 == null ? "" : str9;
            java.lang.String str11 = v75Var.f387968h;
            if (str11 == null) {
                str11 = "";
            }
            com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$DesignerResult jsApiOpenDesignerProfile$DesignerResult = new com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$DesignerResult(i17, str2, str4, str6, str8, str10, str11);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenDesignerProfile.FetchDesignerProxyTask", "handleRequest, getDesignerInfo success");
            com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyResult fetchDesignerProxyResult = new com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyResult();
            fetchDesignerProxyResult.f80813d = true;
            fetchDesignerProxyResult.f80814e = jsApiOpenDesignerProfile$DesignerResult;
            gVar.finishProcess(fetchDesignerProxyResult);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOpenDesignerProfile.FetchDesignerProxyTask", "handleRequest, getDesignerInfo result is null");
            com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyResult fetchDesignerProxyResult2 = new com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyResult();
            fetchDesignerProxyResult2.f80813d = false;
            gVar.finishProcess(fetchDesignerProxyResult2);
        }
    }
}

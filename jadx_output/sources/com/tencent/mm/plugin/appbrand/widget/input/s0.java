package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class s0 implements com.tencent.mm.plugin.appbrand.widget.input.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f91648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.f f91649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f91650c;

    public s0(com.tencent.mm.plugin.appbrand.widget.input.w0 w0Var, java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.appbrand.widget.input.f fVar, java.lang.String str) {
        this.f91648a = weakReference;
        this.f91649b = fVar;
        this.f91650c = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.r4
    public boolean a(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.appbrand.widget.input.f fVar = this.f91649b;
        if (i17 != 67) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f91648a.get();
        if (v5Var == null) {
            return true;
        }
        try {
            int i18 = fVar.f91433f;
            qc1.u uVar = new qc1.u();
            uVar.f82374f = new org.json.JSONObject().put("value", fVar.n().getText().toString()).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.f91650c).put("cursor", 0).put("inputId", i18).put("keyCode", 8).toString();
            v5Var.i(uVar, null);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandInputJsApiHandler", "onKeyUpPostIme DEL, e = %s", e17);
            return true;
        }
    }
}

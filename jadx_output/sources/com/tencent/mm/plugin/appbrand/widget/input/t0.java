package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class t0 implements com.tencent.mm.plugin.appbrand.widget.input.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f91655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.f f91656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f91657c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f91658d;

    public t0(com.tencent.mm.plugin.appbrand.widget.input.w0 w0Var, java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.appbrand.widget.input.f fVar, int i17, java.lang.String str) {
        this.f91655a = weakReference;
        this.f91656b = fVar;
        this.f91657c = i17;
        this.f91658d = str;
    }

    public void a(java.lang.String str, int i17, com.tencent.mm.plugin.appbrand.widget.input.z4 z4Var) {
        try {
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f91655a.get();
            if (v5Var == null) {
                return;
            }
            org.json.JSONObject put = new org.json.JSONObject().put("value", str).put("keyCode", (int) ((com.tencent.mm.plugin.appbrand.widget.input.e4) ((com.tencent.mm.plugin.appbrand.widget.input.t4) this.f91656b.n())).getLastKeyPressed()).put("inputId", this.f91657c).put("cursor", i17);
            java.lang.String str2 = null;
            if (com.tencent.mm.plugin.appbrand.widget.input.z4.CHANGED.equals(z4Var)) {
                qc1.u uVar = new qc1.u();
                uVar.f82374f = put.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.f91658d).toString();
                v5Var.i(uVar, null);
                return;
            }
            int ordinal = z4Var.ordinal();
            if (ordinal == 0) {
                str2 = "onKeyboardComplete";
            } else if (ordinal == 1) {
                str2 = "onKeyboardConfirm";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            v5Var.g(str2, put.toString());
        } catch (java.lang.Exception unused) {
        }
    }
}

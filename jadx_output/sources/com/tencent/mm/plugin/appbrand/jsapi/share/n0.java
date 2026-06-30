package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class n0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.q0 f83189e;

    public n0(com.tencent.mm.plugin.appbrand.jsapi.share.q0 q0Var, android.app.Activity activity) {
        this.f83189e = q0Var;
        this.f83188d = activity;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.share.q0 q0Var = this.f83189e;
        if (i17 != q0Var.f83213i.f83225g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, requestCode: %d is not match", java.lang.Integer.valueOf(i17));
            return;
        }
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, resultCode is not RESULT_OK: " + i18);
            q0Var.f83205a.a(q0Var.f83206b, q0Var.f83213i.o("cancel"));
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent == null ? null : intent.getStringArrayListExtra("SendMsgUsernames");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, toUsers is empty");
            q0Var.f83205a.a(q0Var.f83206b, q0Var.f83213i.o("fail:selected user is empty"));
            return;
        }
        android.app.Activity activity = this.f83188d;
        com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.fw6), null, activity, null, null);
        j91.d dVar = (j91.d) q0Var.f83205a.getRuntime().K1(j91.d.class);
        if (dVar != null) {
            com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar;
            if (tVar.f()) {
                tVar.l();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, toUser: " + java.util.Arrays.toString(stringArrayListExtra.toArray()));
        q0Var.f83205a.a(q0Var.f83206b, q0Var.f83213i.o("ok"));
    }
}

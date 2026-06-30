package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class w0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.x0 f79765d;

    public w0(com.tencent.mm.plugin.appbrand.jsapi.auth.x0 x0Var) {
        this.f79765d = x0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask = this.f79765d.f79775d;
        jsApiAuthorize$AuthorizeTask.f79330f.F(jsApiAuthorize$AuthorizeTask.f79331g, jsApiAuthorize$AuthorizeTask.f79333i, "fail:risk intercepted", jsApiAuthorize$AuthorizeTask.D());
    }
}

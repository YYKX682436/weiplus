package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class r7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f82895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.x7 f82897f;

    public r7(com.tencent.mm.plugin.appbrand.jsapi.x7 x7Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f82897f = x7Var;
        this.f82895d = e9Var;
        this.f82896e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "fail:user canceled install");
        com.tencent.mm.plugin.appbrand.jsapi.x7 x7Var = this.f82897f;
        x7Var.getClass();
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f82895d;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.p7(x7Var, e9Var));
        e9Var.a(this.f82896e, x7Var.o("fail:user canceled install"));
    }
}

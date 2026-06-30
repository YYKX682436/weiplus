package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qo3 f80563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.j0 f80564e;

    public i0(com.tencent.mm.plugin.appbrand.jsapi.contact.j0 j0Var, r45.qo3 qo3Var) {
        this.f80564e = j0Var;
        this.f80563d = qo3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.contact.j0 j0Var = this.f80564e;
        com.tencent.mm.plugin.appbrand.jsapi.contact.n0 n0Var = j0Var.f80567c;
        n0Var.f80583q = this.f80563d.f384147d;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = j0Var.f80566b;
        com.tencent.mm.plugin.appbrand.jsapi.contact.m0 m0Var = j0Var.f80565a;
        n0Var.getClass();
        com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask jsApiChattingTask = new com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask();
        java.lang.String str = n0Var.f80582p;
        jsApiChattingTask.f80485g = str;
        java.lang.String str2 = n0Var.f80583q;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str = str2;
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPrivateEnterContact", "username & subBusinessUsername is null, err");
            str = "";
        }
        jsApiChattingTask.f80486h = str;
        jsApiChattingTask.f80484f = n0Var.f80576g;
        jsApiChattingTask.f80488m = new com.tencent.mm.plugin.appbrand.jsapi.contact.l0(n0Var, jsApiChattingTask, n7Var, m0Var);
        jsApiChattingTask.d();
    }
}

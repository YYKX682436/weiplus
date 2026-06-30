package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes15.dex */
public class w6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.x6 f82121d;

    public w6(com.tencent.mm.plugin.appbrand.jsapi.media.x6 x6Var) {
        this.f82121d = x6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "do cancel upload in 2G/3G/4G network");
        com.tencent.mm.plugin.appbrand.jsapi.media.x6 x6Var = this.f82121d;
        x6Var.f82138h.a(x6Var.f82139i, x6Var.f82140m.o("cancel"));
        x6Var.f82137g.x();
    }
}

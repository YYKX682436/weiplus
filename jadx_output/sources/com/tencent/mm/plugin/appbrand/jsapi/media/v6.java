package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes15.dex */
public class v6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.x6 f82108d;

    public v6(com.tencent.mm.plugin.appbrand.jsapi.media.x6 x6Var) {
        this.f82108d = x6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "do confirm upload in 2G/3G/4G network");
        com.tencent.mm.plugin.appbrand.jsapi.media.x6 x6Var = this.f82108d;
        x6Var.f82137g.getClass();
        x6Var.f82137g.d();
    }
}

package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class l1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.a f97079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97080e;

    public l1(com.tencent.mm.plugin.downloader_app.model.a aVar, vz.z1 z1Var) {
        this.f97079d = aVar;
        this.f97080e = z1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGameDownloadManager", "new style, not wifi, reserve download task for wifi");
        com.tencent.mm.plugin.downloader.model.j1.d(this.f97079d, this.f97080e, true, true);
    }
}

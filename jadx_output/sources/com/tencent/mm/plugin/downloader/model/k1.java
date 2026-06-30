package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class k1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.a f97075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97076e;

    public k1(com.tencent.mm.plugin.downloader_app.model.a aVar, vz.z1 z1Var) {
        this.f97075d = aVar;
        this.f97076e = z1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGameDownloadManager", "new style, not wifi, but download straight");
        com.tencent.mm.plugin.downloader.model.j1.d(this.f97075d, this.f97076e, false, true);
    }
}

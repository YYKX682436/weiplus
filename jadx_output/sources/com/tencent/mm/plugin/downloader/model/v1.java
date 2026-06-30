package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class v1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f97185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f97186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97187f;

    public v1(h02.a aVar, boolean z17, vz.z1 z1Var) {
        this.f97185d = aVar;
        this.f97186e = z17;
        this.f97187f = z1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGameDownloadManager", "resume, new style, not wifi, reserve download task for wifi");
        com.tencent.mm.plugin.downloader.model.j1.g(this.f97185d, true, this.f97186e, true, this.f97187f);
    }
}

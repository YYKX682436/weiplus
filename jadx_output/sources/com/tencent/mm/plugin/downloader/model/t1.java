package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class t1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f97176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f97177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97178f;

    public t1(h02.a aVar, boolean z17, vz.z1 z1Var) {
        this.f97176d = aVar;
        this.f97177e = z17;
        this.f97178f = z1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGameDownloadManager", "resume, new style, not wifi, but download straight");
        com.tencent.mm.plugin.downloader.model.j1.g(this.f97176d, false, this.f97177e, true, this.f97178f);
    }
}

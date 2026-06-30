package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class f2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f97035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.a f97036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97037f;

    public f2(com.tencent.mm.pointers.PBool pBool, com.tencent.mm.plugin.downloader_app.model.a aVar, vz.z1 z1Var) {
        this.f97035d = pBool;
        this.f97036e = aVar;
        this.f97037f = z1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f97035d.value = true;
        com.tencent.mm.plugin.downloader_app.model.a aVar = this.f97036e;
        com.tencent.mm.plugin.downloader.model.j1.d(aVar, this.f97037f, true, false);
        g02.b.c(11, new g02.c(aVar.f97237d, aVar.f97244k, -1L, "", null, 1));
    }
}

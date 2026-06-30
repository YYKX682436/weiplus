package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class e2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f97024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.a f97025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97026f;

    public e2(com.tencent.mm.pointers.PBool pBool, com.tencent.mm.plugin.downloader_app.model.a aVar, vz.z1 z1Var) {
        this.f97024d = pBool;
        this.f97025e = aVar;
        this.f97026f = z1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f97024d.value = true;
        com.tencent.mm.plugin.downloader_app.model.a aVar = this.f97025e;
        com.tencent.mm.plugin.downloader.model.j1.d(aVar, this.f97026f, true, false);
        g02.b.c(11, new g02.c(aVar.f97237d, aVar.f97244k, -1L, "", null, 1));
    }
}

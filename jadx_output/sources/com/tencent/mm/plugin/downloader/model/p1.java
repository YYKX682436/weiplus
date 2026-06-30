package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class p1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f97111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h02.a f97112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f97113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97114g;

    public p1(com.tencent.mm.pointers.PBool pBool, h02.a aVar, boolean z17, vz.z1 z1Var) {
        this.f97111d = pBool;
        this.f97112e = aVar;
        this.f97113f = z17;
        this.f97114g = z1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f97111d.value = true;
        h02.a aVar = this.f97112e;
        com.tencent.mm.plugin.downloader.model.j1.g(aVar, true, this.f97113f, false, this.f97114g);
        g02.b.c(11, new g02.c(aVar.field_appId, aVar.field_scene, aVar.field_downloadId, "", null, 1));
    }
}

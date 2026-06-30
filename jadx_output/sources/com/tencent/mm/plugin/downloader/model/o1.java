package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class o1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f97095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h02.a f97096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f97097f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97098g;

    public o1(com.tencent.mm.pointers.PBool pBool, h02.a aVar, boolean z17, vz.z1 z1Var) {
        this.f97095d = pBool;
        this.f97096e = aVar;
        this.f97097f = z17;
        this.f97098g = z1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f97095d.value = true;
        h02.a aVar = this.f97096e;
        com.tencent.mm.plugin.downloader.model.j1.g(aVar, true, this.f97097f, false, this.f97098g);
        g02.b.c(11, new g02.c(aVar.field_appId, aVar.field_scene, aVar.field_downloadId, "", null, 1));
    }
}

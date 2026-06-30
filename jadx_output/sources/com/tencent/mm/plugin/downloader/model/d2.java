package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class d2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f97017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.a f97018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97019f;

    public d2(com.tencent.mm.pointers.PBool pBool, com.tencent.mm.plugin.downloader_app.model.a aVar, vz.z1 z1Var) {
        this.f97017d = pBool;
        this.f97018e = aVar;
        this.f97019f = z1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f97017d.value = true;
        com.tencent.mm.plugin.downloader.model.j1.d(this.f97018e, this.f97019f, false, false);
    }
}

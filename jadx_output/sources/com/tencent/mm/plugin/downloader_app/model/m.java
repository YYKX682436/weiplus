package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f97302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m02.b f97303e;

    public m(h02.a aVar, m02.b bVar) {
        this.f97302d = aVar;
        this.f97303e = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        h02.a aVar = this.f97302d;
        aVar.field_status = 4;
        com.tencent.mm.plugin.downloader.model.m0.l(aVar);
        com.tencent.mm.plugin.downloader_app.model.x.a(aVar.field_downloadId);
        m02.a aVar2 = m02.a.FAIL;
        m02.b bVar = this.f97303e;
        if (bVar != null) {
            bVar.a(aVar2, aVar.field_downloadId);
        }
        if (bVar != null) {
            bVar.a(aVar2, aVar.field_downloadId);
        }
    }
}

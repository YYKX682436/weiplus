package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.a f97274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m02.b f97275e;

    public h(com.tencent.mm.plugin.downloader_app.model.a aVar, m02.b bVar) {
        this.f97274d = aVar;
        this.f97275e = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.downloader_app.model.a aVar = this.f97274d;
        h02.a d17 = com.tencent.mm.plugin.downloader.model.m0.d(aVar.f97237d);
        if (d17 != null) {
            d17.field_status = 4;
            com.tencent.mm.plugin.downloader.model.m0.l(d17);
        } else {
            d17 = new h02.a();
            d17.field_downloadId = java.lang.System.currentTimeMillis();
            d17.field_appId = aVar.f97237d;
            d17.field_downloadUrl = aVar.f97234a;
            d17.field_status = 4;
            com.tencent.mm.plugin.downloader.model.m0.a(d17);
        }
        com.tencent.mm.plugin.downloader_app.model.x.a(d17.field_downloadId);
        m02.b bVar = this.f97275e;
        if (bVar != null) {
            bVar.a(m02.a.FAIL, d17.field_downloadId);
        }
    }
}

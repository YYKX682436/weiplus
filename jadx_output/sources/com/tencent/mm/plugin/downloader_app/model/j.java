package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public class j implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m02.b f97284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.a f97285b;

    public j(m02.b bVar, com.tencent.mm.plugin.downloader_app.model.a aVar) {
        this.f97284a = bVar;
        this.f97285b = aVar;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        m02.b bVar = this.f97284a;
        if (bVar == null || jSONObject == null || !jSONObject.optBoolean("show_wifi_download_btn", false)) {
            return;
        }
        long optLong = jSONObject.optLong("download_id", -1L);
        com.tencent.mm.plugin.downloader_app.model.a aVar = this.f97285b;
        g02.c cVar = new g02.c(aVar.f97237d, aVar.f97244k, optLong, "", null, 1);
        if (jSONObject.optInt("reserve_for_wifi", 0) == 1) {
            g02.b.c(12, cVar);
            bVar.a(m02.a.WAIT_FOR_WIFI, optLong);
        } else {
            g02.b.c(1, cVar);
            bVar.a(optLong > 0 ? m02.a.OK : m02.a.FAIL, optLong);
        }
    }
}

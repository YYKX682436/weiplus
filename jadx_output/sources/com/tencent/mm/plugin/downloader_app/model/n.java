package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public class n implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m02.b f97304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h02.a f97305b;

    public n(m02.b bVar, h02.a aVar) {
        this.f97304a = bVar;
        this.f97305b = aVar;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        m02.b bVar = this.f97304a;
        if (bVar == null) {
            return;
        }
        h02.a aVar = this.f97305b;
        if (str != null || jSONObject == null || !jSONObject.optBoolean("show_wifi_download_btn", false)) {
            bVar.a(m02.a.FAIL, aVar.field_downloadId);
            return;
        }
        g02.c cVar = new g02.c();
        cVar.a(aVar);
        if (jSONObject.optInt("reserve_for_wifi", 0) == 1) {
            g02.b.c(12, cVar);
            bVar.a(m02.a.WAIT_FOR_WIFI, aVar.field_downloadId);
        } else {
            g02.b.c(1, cVar);
            bVar.a(m02.a.OK, aVar.field_downloadId);
        }
    }
}

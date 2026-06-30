package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes8.dex */
public class j implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m02.b f178817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a f178818b;

    public j(m02.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar) {
        this.f178817a = bVar;
        this.f178818b = aVar;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        m02.b bVar = this.f178817a;
        if (bVar == null || jSONObject == null || !jSONObject.optBoolean("show_wifi_download_btn", false)) {
            return;
        }
        long optLong = jSONObject.optLong("download_id", -1L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar = this.f178818b;
        g02.c cVar = new g02.c(aVar.f178770d, aVar.f178777k, optLong, "", null, 1);
        if (jSONObject.optInt("reserve_for_wifi", 0) == 1) {
            g02.b.c(12, cVar);
            bVar.a(m02.a.WAIT_FOR_WIFI, optLong);
        } else {
            g02.b.c(1, cVar);
            bVar.a(optLong > 0 ? m02.a.OK : m02.a.FAIL, optLong);
        }
    }
}

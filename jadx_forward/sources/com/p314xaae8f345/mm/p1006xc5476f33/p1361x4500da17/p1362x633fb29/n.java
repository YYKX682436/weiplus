package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes8.dex */
public class n implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m02.b f178837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h02.a f178838b;

    public n(m02.b bVar, h02.a aVar) {
        this.f178837a = bVar;
        this.f178838b = aVar;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        m02.b bVar = this.f178837a;
        if (bVar == null) {
            return;
        }
        h02.a aVar = this.f178838b;
        if (str != null || jSONObject == null || !jSONObject.optBoolean("show_wifi_download_btn", false)) {
            bVar.a(m02.a.FAIL, aVar.f68408x32b20428);
            return;
        }
        g02.c cVar = new g02.c();
        cVar.a(aVar);
        if (jSONObject.optInt("reserve_for_wifi", 0) == 1) {
            g02.b.c(12, cVar);
            bVar.a(m02.a.WAIT_FOR_WIFI, aVar.f68408x32b20428);
        } else {
            g02.b.c(1, cVar);
            bVar.a(m02.a.OK, aVar.f68408x32b20428);
        }
    }
}

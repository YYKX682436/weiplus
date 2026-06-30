package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class m1 implements m02.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a f178615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f178616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f178617c;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar, boolean z17, vz.z1 z1Var) {
        this.f178615a = aVar;
        this.f178616b = z17;
        this.f178617c = z1Var;
    }

    @Override // m02.b
    public void a(m02.a aVar, long j17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        m02.a aVar2 = m02.a.OK;
        boolean z17 = this.f178616b;
        vz.z1 z1Var = this.f178617c;
        if (aVar == aVar2) {
            ((kn4.t) ((pf0.q) i95.n0.c(pf0.q.class))).wi("LuggageGameWebViewUI_addGameDownloadTask");
            try {
                jSONObject.put("download_id", j17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.a(this.f178615a.f178787u, jSONObject);
                if (z17) {
                    jSONObject.put("show_wifi_download_btn", true);
                }
                z1Var.a(null, jSONObject);
                return;
            } catch (org.json.JSONException unused) {
                z1Var.a(null, null);
                return;
            }
        }
        if (aVar != m02.a.WAIT_FOR_WIFI) {
            if (aVar == m02.a.CANCEL) {
                z1Var.a("cancel", null);
                return;
            } else {
                if (aVar == m02.a.FAIL) {
                    z1Var.a("fail", null);
                    return;
                }
                return;
            }
        }
        try {
            jSONObject.put("download_id", j17);
            jSONObject.put("reserve_for_wifi", 1);
            if (z17) {
                jSONObject.put("show_wifi_download_btn", true);
            }
            z1Var.a(null, jSONObject);
        } catch (org.json.JSONException unused2) {
            z1Var.a(null, null);
        }
    }
}

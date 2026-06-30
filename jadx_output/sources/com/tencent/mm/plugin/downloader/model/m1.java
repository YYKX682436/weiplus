package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class m1 implements m02.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.a f97082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f97083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97084c;

    public m1(com.tencent.mm.plugin.downloader_app.model.a aVar, boolean z17, vz.z1 z1Var) {
        this.f97082a = aVar;
        this.f97083b = z17;
        this.f97084c = z1Var;
    }

    @Override // m02.b
    public void a(m02.a aVar, long j17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        m02.a aVar2 = m02.a.OK;
        boolean z17 = this.f97083b;
        vz.z1 z1Var = this.f97084c;
        if (aVar == aVar2) {
            ((kn4.t) ((pf0.q) i95.n0.c(pf0.q.class))).wi("LuggageGameWebViewUI_addGameDownloadTask");
            try {
                jSONObject.put("download_id", j17);
                com.tencent.mm.plugin.downloader.model.j1.a(this.f97082a.f97254u, jSONObject);
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

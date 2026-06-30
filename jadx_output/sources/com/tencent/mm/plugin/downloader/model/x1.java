package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class x1 implements m02.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f97195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f97196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f97197c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97198d;

    public x1(boolean z17, boolean z18, boolean z19, vz.z1 z1Var) {
        this.f97195a = z17;
        this.f97196b = z18;
        this.f97197c = z19;
        this.f97198d = z1Var;
    }

    @Override // m02.b
    public void a(m02.a aVar, long j17) {
        m02.a aVar2 = m02.a.OK;
        vz.z1 z1Var = this.f97198d;
        if (aVar != aVar2) {
            if (aVar == m02.a.CANCEL) {
                if (z1Var != null) {
                    z1Var.a("cancel", null);
                    return;
                }
                return;
            } else {
                if (z1Var != null) {
                    z1Var.a("fail", null);
                    return;
                }
                return;
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("download_id", j17);
            com.tencent.mm.plugin.downloader.model.j1.a(this.f97195a, jSONObject);
            if (this.f97196b && !com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                jSONObject.put("reserve_for_wifi", 1);
            }
            if (this.f97197c) {
                jSONObject.put("show_wifi_download_btn", true);
            }
        } catch (org.json.JSONException unused) {
        }
        if (z1Var != null) {
            z1Var.a(null, jSONObject);
        }
    }
}

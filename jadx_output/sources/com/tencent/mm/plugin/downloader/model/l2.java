package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes.dex */
public class l2 implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.m2 f97081a;

    public l2(com.tencent.mm.plugin.downloader.model.m2 m2Var) {
        this.f97081a = m2Var;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.downloader.model.m2 m2Var = this.f97081a;
        if (str != null) {
            m2Var.f97087f.d(com.tencent.mm.plugin.downloader.model.t2.a(str), str);
            return;
        }
        if (jSONObject == null) {
            m2Var.f97087f.d(809, "fail");
            return;
        }
        long optLong = jSONObject.optLong("download_id", -1L);
        if (optLong <= 0) {
            m2Var.f97087f.d(809, "fail");
        } else {
            m2Var.f97087f.d(0, java.lang.String.valueOf(optLong));
        }
    }
}

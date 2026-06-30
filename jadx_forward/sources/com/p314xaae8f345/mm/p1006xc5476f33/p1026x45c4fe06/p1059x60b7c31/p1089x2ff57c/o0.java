package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f162645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.p0 f162646f;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.p0 p0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f162646f = p0Var;
        this.f162644d = lVar;
        this.f162645e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162644d;
        if (lVar.mo50262x39e05d35()) {
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t1> mo49622x91aa142b = lVar.mo50354x59eafec1().mo49622x91aa142b();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (mo49622x91aa142b != null && mo49622x91aa142b.size() > 0) {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t1 t1Var : mo49622x91aa142b) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, t1Var.a());
                        jSONObject.put("size", t1Var.b());
                        jSONObject.put("createTime", java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(t1Var.mo49594x74c4037f()));
                        jSONArray.put(jSONObject);
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("fileList", jSONArray);
            lVar.a(this.f162645e, this.f162646f.p("ok", hashMap));
        }
    }
}

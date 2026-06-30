package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7;

/* loaded from: classes12.dex */
public class y implements tp3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.y f234487e = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.y();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f234488d = new java.util.HashMap();

    public void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.x xVar) {
        if (android.text.TextUtils.isEmpty(str) || xVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReportLogic", "tag or reporter should not be null");
        } else {
            ((java.util.HashMap) this.f234488d).put(str, xVar);
        }
    }

    @Override // tp3.c
    public java.lang.String b() {
        return ".cmd.diagnostic.report";
    }

    @Override // tp3.c
    public void c(java.util.Map map) {
        for (java.util.Map.Entry entry : ((java.util.HashMap) this.f234488d).entrySet()) {
            if (map.containsKey(".cmd.diagnostic.report." + ((java.lang.String) entry.getKey()))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.x) entry.getValue());
                if (dVar.h().e()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.i iVar = dVar.f234448d;
                    iVar.getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    iVar.f234468c.j();
                    android.content.Intent intent = new android.content.Intent(iVar.f234466a);
                    intent.putExtra("PARAM_KEY_TOKEN", currentTimeMillis);
                    intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXApp.f32839x928a5f8c);
                }
            }
        }
    }

    @Override // tp3.c
    public void d() {
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes.dex */
public class j2 implements vz.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vz.n1 f178601a;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.k2 k2Var, vz.n1 n1Var) {
        this.f178601a = n1Var;
    }

    @Override // vz.i1
    public void Z(int i17, long j17) {
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (c17 != null) {
            try {
                jSONObject.put("downloadId", c17.f68408x32b20428);
                jSONObject.put("appId", c17.f68404x28d45f97);
                jSONObject.put("taskSize", c17.f68443x78351860);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ListenerManager", "toJsonObject: " + e17.getMessage());
            }
            if (i17 != 9) {
                switch (i17) {
                    case 1:
                        try {
                            jSONObject.put("state", "download_started");
                            if (c17.f68443x78351860 != 0) {
                                jSONObject.put("progress", (((float) c17.f68413xf432b5ad) / ((float) r2)) * 100.0f);
                                jSONObject.put("progressFloat", (((float) c17.f68413xf432b5ad) * 100.0f) / ((float) c17.f68443x78351860));
                                break;
                            }
                        } catch (org.json.JSONException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ListenerManager", "toJsonObject: " + e18.getMessage());
                            break;
                        }
                        break;
                    case 2:
                        try {
                            if (!c17.f68409xc4f9be67 || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                                jSONObject.put("state", "download_paused");
                            } else {
                                jSONObject.put("state", "download_wait_wifi");
                            }
                            if (c17.f68443x78351860 != 0) {
                                jSONObject.put("progress", (((float) c17.f68413xf432b5ad) / ((float) r0)) * 100.0f);
                                jSONObject.put("progressFloat", (((float) c17.f68413xf432b5ad) * 100.0f) / ((float) c17.f68443x78351860));
                                break;
                            }
                        } catch (org.json.JSONException unused) {
                            break;
                        }
                        break;
                    case 3:
                        try {
                            jSONObject.put("state", "download_succ");
                            jSONObject.put("progress", 100);
                            break;
                        } catch (org.json.JSONException e19) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ListenerManager", "toJsonObject: " + e19.getMessage());
                            break;
                        }
                    case 4:
                        try {
                            jSONObject.put("state", "download_removed");
                            break;
                        } catch (org.json.JSONException e27) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ListenerManager", "toJsonObject: " + e27.getMessage());
                            break;
                        }
                    case 5:
                        try {
                            if (!c17.f68409xc4f9be67 || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                                jSONObject.put("state", "download_failed");
                            } else {
                                jSONObject.put("state", "download_wait_wifi");
                            }
                            break;
                        } catch (org.json.JSONException e28) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ListenerManager", "toJsonObject: " + e28.getMessage());
                            break;
                        }
                        break;
                    case 6:
                        try {
                            jSONObject.put("state", "download_progress_changed");
                            if (c17.f68443x78351860 != 0) {
                                jSONObject.put("progress", (((float) c17.f68413xf432b5ad) / ((float) r2)) * 100.0f);
                                jSONObject.put("progressFloat", (((float) c17.f68413xf432b5ad) * 100.0f) / ((float) c17.f68443x78351860));
                            }
                        } catch (org.json.JSONException e29) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ListenerManager", "toJsonObject: " + e29.getMessage());
                        }
                        vz.n1 n1Var = this.f178601a;
                        long j18 = c17.f68413xf432b5ad;
                        long j19 = c17.f68443x78351860;
                        n1Var.a((((float) j18) * 100.0f) / ((float) j19), j18, j19);
                        break;
                }
            } else {
                try {
                    jSONObject.put("state", "download_task_installed");
                } catch (org.json.JSONException e37) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ListenerManager", "toJsonObject: " + e37.getMessage());
                }
            }
            this.f178601a.b(jSONObject);
        }
    }
}

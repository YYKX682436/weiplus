package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1744xb1584af1;

/* loaded from: classes.dex */
public class k implements vz.k1 {
    @Override // vz.k1
    public void Z(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1744xb1584af1.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1744xb1584af1.o.f221331a;
        try {
            switch (i17) {
                case 1:
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                    if (c17 == null) {
                        return;
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("appid", c17.f68404x28d45f97);
                    jSONObject.put("download_id", c17.f68408x32b20428);
                    jSONObject.put("state", "download_start");
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "wxdownload:state_change");
                    bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject.toString());
                    ((h80.k) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class))).getClass();
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle, tw4.a.class, null);
                    nVar.a(bundle);
                    return;
                case 2:
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    h02.a c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                    if (c18 == null) {
                        return;
                    }
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("appid", c18.f68404x28d45f97);
                    jSONObject2.put("download_id", c18.f68408x32b20428);
                    if (c18.f68423x7e6ed12a && c18.f68409xc4f9be67 && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                        jSONObject2.put("state", "download_wait_for_wifi");
                    } else {
                        jSONObject2.put("state", "download_pause");
                    }
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "wxdownload:state_change");
                    bundle2.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject2.toString());
                    ((h80.k) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class))).getClass();
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle2, tw4.a.class, null);
                    nVar.a(bundle2);
                    return;
                case 3:
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    h02.a c19 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                    if (c19 == null) {
                        return;
                    }
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("appid", c19.f68404x28d45f97);
                    jSONObject3.put("download_id", c19.f68408x32b20428);
                    jSONObject3.put("state", "download_succ");
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "wxdownload:state_change");
                    bundle3.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject3.toString());
                    ((h80.k) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class))).getClass();
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle3, tw4.a.class, null);
                    nVar.a(bundle3);
                    return;
                case 4:
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    h02.a c27 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                    if (c27 == null) {
                        return;
                    }
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    jSONObject4.put("appid", c27.f68404x28d45f97);
                    jSONObject4.put("download_id", c27.f68408x32b20428);
                    jSONObject4.put("state", "download_removed");
                    android.os.Bundle bundle4 = new android.os.Bundle();
                    bundle4.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "wxdownload:state_change");
                    bundle4.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject4.toString());
                    ((h80.k) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class))).getClass();
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle4, tw4.a.class, null);
                    nVar.a(bundle4);
                    return;
                case 5:
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    h02.a c28 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                    if (c28 == null) {
                        return;
                    }
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    jSONObject5.put("appid", c28.f68404x28d45f97);
                    jSONObject5.put("download_id", c28.f68408x32b20428);
                    jSONObject5.put("state", "download_fail");
                    android.os.Bundle bundle5 = new android.os.Bundle();
                    bundle5.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "wxdownload:state_change");
                    bundle5.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject5.toString());
                    ((h80.k) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class))).getClass();
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle5, tw4.a.class, null);
                    nVar.a(bundle5);
                    return;
                case 6:
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    h02.a c29 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                    if (c29 != null) {
                        long j18 = c29.f68443x78351860;
                        if (j18 != 0) {
                            long j19 = c29.f68413xf432b5ad;
                            int i18 = (int) ((j19 / j18) * 100.0d);
                            float f17 = (((float) j19) / ((float) j18)) * 100.0f;
                            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                            jSONObject6.put("appid", c29.f68404x28d45f97);
                            jSONObject6.put("download_id", c29.f68408x32b20428);
                            jSONObject6.put("progress", i18);
                            jSONObject6.put("progress_float", f17);
                            android.os.Bundle bundle6 = new android.os.Bundle();
                            bundle6.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "wxdownload:progress_change");
                            bundle6.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject6.toString());
                            ((h80.k) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class))).getClass();
                            com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle6, tw4.a.class, null);
                            nVar.a(bundle6);
                            return;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsDownloadEventDispatch", "loadDownloadProgress failed");
                    return;
                case 7:
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    h02.a c37 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                    if (c37 == null) {
                        return;
                    }
                    org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                    jSONObject7.put("appid", c37.f68404x28d45f97);
                    jSONObject7.put("download_id", c37.f68408x32b20428);
                    jSONObject7.put("state", "download_resumed");
                    android.os.Bundle bundle7 = new android.os.Bundle();
                    bundle7.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "wxdownload:state_change");
                    bundle7.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject7.toString());
                    ((h80.k) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class))).getClass();
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle7, tw4.a.class, null);
                    nVar.a(bundle7);
                    return;
                default:
                    return;
            }
        } catch (org.json.JSONException unused) {
        }
    }
}

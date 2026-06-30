package tz2;

/* loaded from: classes14.dex */
public class i extends tz2.e {
    public e72.e F = new e72.e();
    public java.lang.String G = "";

    @Override // tz2.e, tz2.u
    public void b(android.widget.TextView textView) {
        wz2.a.j(textView, i65.a.r(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c7h));
    }

    @Override // tz2.e
    public int e() {
        return 1;
    }

    @Override // tz2.e
    public int g() {
        return 0;
    }

    @Override // tz2.e
    public int h() {
        return 0;
    }

    @Override // tz2.e
    public java.lang.String m(java.lang.String str, boolean z17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            r45.mi miVar = new r45.mi();
            byte[] d17 = tz2.s.d(jSONObject, java.lang.String.valueOf(this.f504798g));
            miVar.f462066e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(d17);
            miVar.f462065d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(tz2.s.b(java.lang.String.valueOf(this.f504798g), d17, false));
            java.lang.String concat = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.h().concat("/release_out.fd");
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.l(miVar.mo14344x5f01b1f6(), concat);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumber", "save verify result to bioId:%s file:%s  fileSize:%s", java.lang.String.valueOf(this.f504798g), concat, java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(concat)));
            return concat;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e17, "number get yt result data error", new java.lang.Object[0]);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tz2.e, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof c72.a0) && !(m1Var instanceof c72.b0)) {
            super.mo815x76e0bfae(i17, i18, str, m1Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumber", "[cgi-ret]NetSceneGetBioConfig errType:%s errCode:%s errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        this.f504812x = java.lang.System.currentTimeMillis();
        vz2.c.k("rspCfg", java.lang.Integer.valueOf(i18));
        vz2.c.b().f137727s = java.lang.System.currentTimeMillis();
        vz2.c.b().f137715g = i18;
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (i17 == 0 && i18 == 0) {
            c72.b bVar = (c72.b) m1Var;
            this.f504798g = bVar.g();
            java.lang.String m55290x5bf1598d = com.p314xaae8f345.mm.p1006xc5476f33.p1409x9e7e39d6.p1410x4e42091.C13537xa00bccff.m55290x5bf1598d(this.f504798g + "", bVar.c(), bVar.c().length);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumber", "mBioId:%s decryptConfig:%s", java.lang.Long.valueOf(this.f504798g), m55290x5bf1598d);
            try {
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, 0);
                jSONObject.put("errormsg", "OK");
                jSONObject.put("type", 1);
                org.json.JSONArray optJSONArray = new org.json.JSONObject(m55290x5bf1598d).optJSONArray("face_action_seq");
                if (optJSONArray != null) {
                    for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
                        org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i19);
                        if (optJSONObject != null && optJSONObject.optInt("action_id", 0) == 4) {
                            java.lang.String optString = optJSONObject.optString("action_data");
                            this.G = optString;
                            java.lang.String replaceAll = optString.replaceAll("(.)", "$1,");
                            jSONObject.put("action_data", replaceAll.substring(0, replaceAll.length() - 1));
                        }
                    }
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e17, "reflect get config error", new java.lang.Object[0]);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerError", "get mBioId failed");
            vz2.c.b().B = 3;
            try {
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, 90036);
                jSONObject.put("errormsg", "WeChat face get config error!");
                jSONObject.put("err_feedback", this.f504803o);
                jSONObject.put("err_msg", i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81517x9a9e6cc4));
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e18, "reflect get config error2", new java.lang.Object[0]);
            }
        }
        hashMap.put("response", jSONObject.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumber", "set ytsdk number config:%s", hashMap);
        this.f504795d.mo120776xd218dbca(hashMap, null);
    }

    public void p() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumber", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b);
        this.F.b();
        e72.e eVar = this.F;
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceVoiceRecordLogic", "hy: recycling voice.");
        eVar.f331424a = null;
        e72.e eVar2 = this.F;
        tl.c f17 = h72.s.e().f();
        synchronized (eVar2.f331429f) {
            eVar2.f331429f.remove(f17);
        }
    }

    @Override // tz2.e, tz2.u
    /* renamed from: release */
    public void mo63481x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumber", "release");
        super.mo63481x41012807();
        e72.e eVar = this.F;
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceVoiceRecordLogic", "hy: recycling voice.");
        eVar.f331424a = null;
        com.p314xaae8f345.mm.vfs.w6.h(this.F.f331426c);
    }

    @Override // tz2.e, tz2.u
    /* renamed from: reset */
    public void mo167283x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumber", "reset");
        super.mo167283x6761d4f();
        p();
        e72.e eVar = this.F;
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceVoiceRecordLogic", "hy: recycling voice.");
        eVar.f331424a = null;
        com.p314xaae8f345.mm.vfs.w6.h(this.F.f331426c);
        this.F = new e72.e();
    }
}

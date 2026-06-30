package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312;

/* loaded from: classes7.dex */
public class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.q f167197a;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.q qVar) {
        this.f167197a = qVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t tVar = this.f167197a.f167198b;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t.f167201r3;
        tVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(tVar.f156336n), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.v.class);
        int i18 = 1;
        if (c11813xf952a195 != null) {
            c11813xf952a195.f387385r = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6();
            c11813xf952a195.f387385r.f156932d = tVar.u0().f158814g;
            c11813xf952a195.f387385r.f33456x1c82a56c = tVar.u0().L;
            c11813xf952a195.f387385r.f156934f = true;
            c11813xf952a195.A = new com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3900x5df21f9b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54.f168925g, null, null, false, false, null, false, 0, null, 224, null);
        } else {
            c11813xf952a195 = null;
        }
        int i19 = 0;
        if (c11813xf952a195 == null) {
            tVar.l0();
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m2) tVar.E).add(c11813xf952a195);
            java.lang.String str = tVar.f156336n;
            java.lang.String str2 = tVar.f156336n;
            nf.y yVar = nf.x.f418149b;
            k91.r h17 = k91.r.h(str, "{}", "{}", false, yVar != null ? yVar.i(str2) : false);
            h17.f387269J = tVar.u0().f158816i;
            tVar.L1(h17);
            tVar.X1 = new si1.g(new si1.b1(tVar), -1, true);
            tVar.K0(true);
            tVar.s3();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t tVar2 = this.f167197a.f167198b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = tVar2.u0();
        if (u07 == null || (c11812xa040dc98 = u07.D) == null || c11812xa040dc98.f158855d != 7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenSdkJsApiProcessor", "initConfig is null or lanunchScene is err, return");
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(!android.text.TextUtils.isEmpty(u07.S) ? u07.S : u07.D.f158865q);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.getString("args"));
                ik1.b0 b0Var = new ik1.b0();
                if (tVar2.mo48802x59eafec1().mo49624x5d68c543(b0Var) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
                    java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        java.lang.Object obj2 = jSONObject2.get(next);
                        if (obj2 instanceof java.lang.String) {
                            java.lang.String str3 = (java.lang.String) obj2;
                            if (((str3 == null || !str3.startsWith("content://")) ? i19 : i18) != 0) {
                                jSONObject2.put(next, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c4.a(tVar2, (java.lang.String) b0Var.f373357a, (java.lang.String) obj2));
                            }
                        }
                        if (obj2 instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray = (org.json.JSONArray) obj2;
                            for (int i27 = i19; i27 < jSONArray.length(); i27++) {
                                java.lang.Object obj3 = jSONArray.get(i27);
                                if (obj3 instanceof java.lang.String) {
                                    java.lang.String str4 = (java.lang.String) obj3;
                                    if (str4 != null && str4.startsWith("content://")) {
                                        jSONArray.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c4.a(tVar2, (java.lang.String) b0Var.f373357a, (java.lang.String) obj3));
                                    }
                                }
                            }
                            jSONObject2.put(next, jSONArray);
                            i18 = 1;
                            i19 = 0;
                        }
                    }
                    jSONObject.put("args", jSONObject2.toString());
                    java.lang.String jSONObject3 = jSONObject.toString();
                    if (android.text.TextUtils.isEmpty(u07.S)) {
                        u07.D.f158865q = jSONObject3;
                    } else {
                        u07.S = jSONObject3;
                    }
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.OpenSdkJsApiProcessor", "", e17);
            }
        }
        return null;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class c2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34185x366c91de = 51;

    /* renamed from: NAME */
    public static final java.lang.String f34186x24728b = "saveFile";

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0 C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("tempFilePath");
        java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString);
        jc1.d dVar = jc1.e.f380444g;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSaveFile", "temp localId is null or nil");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0(dVar, new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = lVar.mo50354x59eafec1().mo49620x1d537609(optString);
        if (mo49620x1d537609 == null || !mo49620x1d537609.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSaveFile", "fail tempFilePath file not exist");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0(dVar, new java.lang.Object[0]);
        }
        ik1.b0 b0Var = new ik1.b0();
        jc1.d D = D(lVar, mo49620x1d537609, optString2, b0Var);
        java.util.HashMap hashMap = new java.util.HashMap();
        if ("ok".equals(D.f380437b)) {
            hashMap.put("savedFilePath", b0Var.f373357a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0(D, new java.lang.Object[0]);
        ((java.util.HashMap) j0Var.f162852a).putAll(hashMap);
        return j0Var;
    }

    public static jc1.d D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, ik1.b0 b0Var) {
        boolean z17;
        if (r6Var == null || !r6Var.m()) {
            return jc1.e.f380438a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49303x5fd6f23 = lVar.mo50354x59eafec1().mo49303x5fd6f23(str);
        if (mo49303x5fd6f23 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
            try {
                ik1.b0 b0Var2 = new ik1.b0();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49631x84702499 = lVar.mo50354x59eafec1().mo49631x84702499(r6Var, str, b0Var2);
                if (b0Var != null) {
                    b0Var.f373357a = b0Var2.f373357a;
                }
                z17 = false;
                mo49303x5fd6f23 = mo49631x84702499;
            } catch (java.lang.Exception e17) {
                return new jc1.d(-1, "fail:saveFile exception: " + e17.toString());
            }
        } else {
            z17 = true;
        }
        int ordinal = mo49303x5fd6f23.ordinal();
        if (ordinal == 0) {
            return z17 ? new jc1.d(1301003, java.lang.String.format("%s, \"%s\"", "fail:illegal operation on a directory", str)) : jc1.f.f380445a;
        }
        if (ordinal == 9) {
            return new jc1.d(1301003, java.lang.String.format("%s, \"%s\"", "fail:illegal operation on a directory", str));
        }
        if (ordinal == 15) {
            return jc1.e.f380442e;
        }
        if (ordinal == 17) {
            return jc1.e.f380441d;
        }
        if (ordinal == 3) {
            return new jc1.d(1300002, java.lang.String.format("%s, \"%s\"", "fail:No such file or directory", str));
        }
        if (ordinal == 4) {
            return jc1.e.f380440c;
        }
        return new jc1.d(-1, "fail " + mo49303x5fd6f23.name());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l.f162622h.execute(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b2(this, lVar, jSONObject, i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}

package yd1;

/* loaded from: classes7.dex */
public abstract class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (c0Var.Z0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: no page context");
        } else if (jSONObject == null) {
            c0Var.a(i17, o("fail:data is null or nil"));
        } else {
            F(c0Var, jSONObject, i17);
        }
    }

    public yd1.j C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, java.lang.String str, boolean z17) {
        java.lang.String D = D(c0Var, str);
        if (D == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: can not generate!");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: creating file: %s", D);
        if (com.p314xaae8f345.mm.vfs.w6.j(D)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: file already exists, auto delete: %b", java.lang.Boolean.valueOf(z17));
            if (!z17) {
                return null;
            }
            com.p314xaae8f345.mm.vfs.w6.h(D);
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(D));
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(D));
        try {
            if (!r6Var.k()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: create file failed!");
                return null;
            }
            return new yd1.j(this, r6Var.o(), "wxfile://clientdata/" + str, null);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameRecord.JsApiScreenRecorderBase", e17, "hy: create file failed!", new java.lang.Object[0]);
            return null;
        }
    }

    public final java.lang.String D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, java.lang.String str) {
        if (c0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(c0Var == null);
            objArr[1] = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: param error %b, %s", objArr);
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2) c0Var.mo50354x59eafec1();
        if (l2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: fs is null");
            return null;
        }
        java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3) l2Var.a("wxfile://clientdata")).f157758d;
        if (!str2.endsWith("/")) {
            str2 = str2.concat("/");
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str2 + ".nomedia");
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: no nomedia file. trigger new");
            try {
                r6Var.k();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameRecord.JsApiScreenRecorderBase", e17, "hy: create no media file failed!", new java.lang.Object[0]);
            }
        }
        return str2 + str;
    }

    public ta1.q0 E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        return ta1.q0.b("1234", c0Var);
    }

    public abstract void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject, int i17);

    public yd1.j G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: request saveFileToClientData: %s, %b, %b", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: src file not exists!");
            return null;
        }
        java.lang.String D = D(c0Var, str2);
        if (D == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: can not generate dest file!");
            return null;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(D)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: file already exists, auto delete: %b", java.lang.Boolean.valueOf(z17));
            if (!z17) {
                return null;
            }
            com.p314xaae8f345.mm.vfs.w6.h(D);
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(D);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        if (z18) {
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str4 = a18.f294812f;
            if (str4 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l18)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                }
            }
            if (!com.p314xaae8f345.mm.vfs.w6.v(a18.m82499x9616526c(), a17.m82499x9616526c())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: rename failed!");
                return null;
            }
        } else if (com.p314xaae8f345.mm.vfs.w6.d(str, D, false) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: copy failed!");
            return null;
        }
        return new yd1.j(this, D, "wxfile://clientdata/" + str2, null);
    }
}

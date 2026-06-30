package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public class k3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        java.io.InputStream byteArrayInputStream;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0 a0Var;
        boolean optBoolean = jSONObject.optBoolean("append", false);
        java.lang.String optString = jSONObject.optString("encoding");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.c(lVar.mo50357xcd94f799(), null, jSONObject, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) lVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class));
        java.lang.Object opt = jSONObject.opt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        if (opt instanceof java.lang.String) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                a0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.z.f162678a).get("utf8");
            } else {
                a0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.z.f162678a).get(optString.toLowerCase());
                if (a0Var == null) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail invalid encoding", new java.lang.Object[0]);
                }
            }
            try {
                byteArrayInputStream = new nf.a(a0Var.mo50953xb06291ee((java.lang.String) opt));
            } catch (java.lang.Exception e17) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail " + e17.getMessage(), new java.lang.Object[0]);
            }
        } else if (opt instanceof java.nio.ByteBuffer) {
            byteArrayInputStream = new nf.a((java.nio.ByteBuffer) opt);
        } else {
            if (opt != null) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail invalid data", new java.lang.Object[0]);
            }
            if (optBoolean) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("ok", new java.lang.Object[0]);
            }
            byteArrayInputStream = new java.io.ByteArrayInputStream(new byte[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49635xac26b9fb = lVar.mo50354x59eafec1().mo49635xac26b9fb(str, byteArrayInputStream, optBoolean);
        int ordinal = mo49635xac26b9fb.ordinal();
        if (ordinal == 0) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("ok", new java.lang.Object[0]);
        }
        if (ordinal == 10) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail \"%s\" is not a regular file", str);
        }
        if (ordinal == 15) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail the maximum size of the file storage limit is exceeded", new java.lang.Object[0]);
        }
        if (ordinal == 3) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail no such file or directory, open \"%s\"", str);
        }
        if (ordinal == 4) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail permission denied, open \"%s\"", str);
        }
        if (ordinal == 5) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail illegal operation on a directory, open \"%s\"", str);
        }
        if (ordinal == 6) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail no such file \"%s\"", str);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail " + mo49635xac26b9fb.name(), new java.lang.Object[0]);
    }
}

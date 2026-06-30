package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public class d3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0 a0Var;
        long optLong;
        long j17;
        java.lang.String optString = jSONObject.optString("encoding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.UnitReadFile", "call, path %s, encoding %s", str, optString);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            a0Var = null;
        } else {
            a0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.z.f162678a).get(optString.toLowerCase());
            if (a0Var == null) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail invalid encoding", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0 a0Var2 = a0Var;
        if (jSONObject.has("position") || jSONObject.has("length")) {
            long optLong2 = jSONObject.optLong("position", 0L);
            optLong = jSONObject.optLong("length", com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
            j17 = optLong2;
        } else {
            j17 = Long.MIN_VALUE;
            optLong = Long.MIN_VALUE;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc440832 = (j17 == Long.MIN_VALUE || optLong == Long.MIN_VALUE) ? lVar.mo50354x59eafec1().mo49307xcc440832(str, b0Var) : lVar.mo50354x59eafec1().mo49306xcc440832(str, j17, optLong, b0Var);
        if (mo49307xcc440832 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
            java.lang.Object obj = b0Var.f373357a;
            if (a0Var2 != null) {
                obj = a0Var2.a((java.nio.ByteBuffer) obj);
            }
            if (!(obj instanceof java.nio.ByteBuffer)) {
                nf.a.a((java.nio.ByteBuffer) b0Var.f373357a);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("ok", new java.lang.Object[0]);
            ((java.util.HashMap) b0Var2.f162852a).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, obj);
            return b0Var2;
        }
        int ordinal = mo49307xcc440832.ordinal();
        if (ordinal == 4) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail permission denied, open \"%s\"", str);
        }
        if (ordinal == 6) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail no such file \"%s\"", str);
        }
        switch (ordinal) {
            case 10:
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail \"%s\" is not a regular file", str);
            case 11:
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail the value of \"position\" is out of range", new java.lang.Object[0]);
            case 12:
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail the value of \"length\" is out of range", new java.lang.Object[0]);
            default:
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail " + mo49307xcc440832.name(), new java.lang.Object[0]);
        }
    }
}

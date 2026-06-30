package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public class h3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n {
    public static java.util.Map d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11700x155a0685 c11700x155a0685, java.util.Map map) {
        map.put("mode", java.lang.Integer.valueOf(c11700x155a0685.f33488x8eccb8c1));
        map.put("size", java.lang.Long.valueOf(c11700x155a0685.f33490x8ecf5f1f));
        map.put("lastAccessedTime", java.lang.Long.valueOf(c11700x155a0685.f33486x4a239f50));
        map.put("lastModifiedTime", java.lang.Long.valueOf(c11700x155a0685.f33489x4accb95c));
        return map;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("recursive", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11700x155a0685 c11700x155a0685 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11700x155a0685();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49310x360654 = lVar.mo50354x59eafec1().mo49310x360654(str, c11700x155a0685);
        int ordinal = mo49310x360654.ordinal();
        if (ordinal != 0) {
            if (ordinal == 6 || ordinal == 3) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail no such file or directory \"%s\"", str);
            }
            if (ordinal == 4) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail permission denied, open \"%s\"", str);
            }
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail " + mo49310x360654.name(), new java.lang.Object[0]);
        }
        if (!c11700x155a0685.m49608xcdd6063() || !optBoolean) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("ok", new java.lang.Object[0]);
            java.util.HashMap hashMap = new java.util.HashMap();
            d(c11700x155a0685, hashMap);
            b0Var.a(hashMap);
            return b0Var;
        }
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h2> linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49311x8eeb7599 = lVar.mo50354x59eafec1().mo49311x8eeb7599(str, linkedList);
        if (mo49311x8eeb7599.ordinal() != 0) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail " + mo49311x8eeb7599.name(), new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("ok", new java.lang.Object[0]);
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h2 h2Var : linkedList) {
            java.lang.String str2 = h2Var.f157727d;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            d(h2Var, hashMap2);
            ((java.util.HashMap) b0Var2.f162852a).put(str2, hashMap2);
        }
        return b0Var2;
    }
}

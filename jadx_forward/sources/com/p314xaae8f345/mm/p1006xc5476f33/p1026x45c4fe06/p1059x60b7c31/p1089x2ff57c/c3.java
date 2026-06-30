package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public class c3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49305x40654317 = lVar.mo50354x59eafec1().mo49305x40654317(str, b0Var);
        nf.c.b(linkedList, (java.util.List) b0Var.f373357a);
        int ordinal = mo49305x40654317.ordinal();
        if (ordinal == 0) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h1) it.next()).f157726a);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("ok", new java.lang.Object[0]);
            ((java.util.HashMap) b0Var2.f162852a).put("files", jSONArray);
            return b0Var2;
        }
        if (ordinal != 6) {
            if (ordinal == 8) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail not a directory \"%s\"", str);
            }
            if (ordinal == 10) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail \"%s\" is not a regular file", str);
            }
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail permission denied, open \"%s\"", str);
                }
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail " + mo49305x40654317.name(), new java.lang.Object[0]);
            }
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail no such file or directory \"%s\"", str);
    }
}

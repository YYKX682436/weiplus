package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class f3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = lVar.mo50354x59eafec1();
        if (mo50354x59eafec1 == null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail:internal error", new java.lang.Object[0]);
        }
        java.lang.String optString = jSONObject.optString("newPath");
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String format = java.lang.String.format(locale, "fail no such file or directory, rename \"%s\" -> \"%s\"", str, optString);
        java.lang.String format2 = java.lang.String.format(locale, "fail permission denied, rename \"%s\" -> \"%s\"", str, optString);
        if (!mo50354x59eafec1.mo49615x4d74a9ca(str)) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0(format2, new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.vfs.r6 mo49301x1d537609 = lVar.mo50354x59eafec1().mo49301x1d537609(str, true);
        if (mo49301x1d537609 == null || !mo49301x1d537609.m()) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0(format, new java.lang.Object[0]);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.a(mo49301x1d537609)) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail \"%s\" not a regular file", str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49618xaf40b0d0 = lVar.mo50354x59eafec1().mo49618xaf40b0d0(optString, mo49301x1d537609, true);
        int ordinal = mo49618xaf40b0d0.ordinal();
        if (ordinal == 0) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("ok", new java.lang.Object[0]);
        }
        if (ordinal == 2) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail sdcard not mounted", new java.lang.Object[0]);
        }
        if (ordinal == 3) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0(format, new java.lang.Object[0]);
        }
        if (ordinal == 4) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0(format2, new java.lang.Object[0]);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail " + mo49618xaf40b0d0.name(), new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n
    public java.lang.String c(org.json.JSONObject jSONObject) {
        return jSONObject.optString("oldPath");
    }
}

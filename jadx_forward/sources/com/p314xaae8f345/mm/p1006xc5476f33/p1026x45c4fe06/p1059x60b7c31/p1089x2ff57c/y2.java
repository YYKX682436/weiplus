package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class y2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49635xac26b9fb;
        java.lang.String optString = jSONObject.optString("destPath");
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String format = java.lang.String.format(locale, "fail no such file or directory, copyFile \"%s\" -> \"%s\"", str, optString);
        java.lang.String format2 = java.lang.String.format(locale, "fail permission denied, copyFile \"%s\" -> \"%s\"", str, optString);
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = lVar.mo50354x59eafec1().mo49620x1d537609(str);
        boolean mo49616x4d737b83 = lVar.mo50354x59eafec1().mo49616x4d737b83(str);
        if (mo49620x1d537609 != null && mo49620x1d537609.m() && mo49620x1d537609.A()) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.a(mo49620x1d537609)) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail \"%s\" not a regular file", str);
            }
            mo49635xac26b9fb = lVar.mo50354x59eafec1().mo49618xaf40b0d0(optString, mo49620x1d537609, false);
        } else {
            if (!mo49616x4d737b83) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0(format2, new java.lang.Object[0]);
            }
            ik1.b0 b0Var = new ik1.b0();
            lVar.mo50354x59eafec1().mo49307xcc440832(str, b0Var);
            if (b0Var.f373357a == null) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0(format, new java.lang.Object[0]);
            }
            nf.a aVar = new nf.a((java.nio.ByteBuffer) b0Var.f373357a);
            mo49635xac26b9fb = lVar.mo50354x59eafec1().mo49635xac26b9fb(optString, aVar, false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(aVar);
        }
        int ordinal = mo49635xac26b9fb.ordinal();
        if (ordinal == 0) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("ok", new java.lang.Object[0]);
        }
        if (ordinal == 10) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail \"%s\" is not a regular file", optString);
        }
        if (ordinal == 15) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail the maximum size of the file storage limit is exceeded", new java.lang.Object[0]);
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
        if (ordinal == 5) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail illegal operation on a directory, open \"%s\"", optString);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail " + mo49635xac26b9fb.name(), new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n
    public java.lang.String c(org.json.JSONObject jSONObject) {
        return jSONObject.optString("srcPath");
    }
}

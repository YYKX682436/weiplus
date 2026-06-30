package q81;

/* loaded from: classes4.dex */
public class n extends q81.a {
    public static boolean g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6 m6Var, java.lang.String str, java.lang.String str2, int i17, q81.m mVar) {
        int i18 = mVar.ordinal() != 0 ? 127 : 131;
        r81.f fVar = r81.f.INSTANCE;
        fVar.b(i17, i18);
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e9.f(m6Var.f67842x28d45f97, m6Var.f67846x8987ca93);
        int m75979x70731c5a = com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75979x70731c5a(m6Var.f67844x55b471cc, f17, str.getBytes());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "decryptPkgAndSave, appId(%s), version(%d), ret %d", m6Var.f67842x28d45f97, java.lang.Integer.valueOf(m6Var.f67846x8987ca93), java.lang.Integer.valueOf(m75979x70731c5a));
        boolean z17 = false;
        if (m75979x70731c5a != 0) {
            fVar.b(i17, mVar.ordinal() != 0 ? 129 : 133);
            return false;
        }
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(f17);
        if (!p17.equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "decryptPkgAndSave, file_md5(%s) expect_md5(%s) mismatch", p17, str2);
            fVar.b(i17, mVar.ordinal() != 0 ? 130 : 134);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().l(m6Var.f67842x28d45f97, 0, m6Var.f67846x8987ca93, str2, null);
        boolean F = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().F(m6Var.f67842x28d45f97, 0, m6Var.f67846x8987ca93, f17);
        fVar.b(i17, mVar.ordinal() != 0 ? F ? com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd : 144 : F ? 147 : 148);
        com.p314xaae8f345.mm.vfs.w6.h(m6Var.f67844x55b471cc);
        fVar.b(i17, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6.class)).mo9951xb06685ab(m6Var, new java.lang.String[0]) ? 139 : 140);
        if (mVar != q81.m.ISSUE_DECRYPT) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p6 p6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p6.class);
            java.lang.String str3 = m6Var.f67842x28d45f97;
            int i19 = m6Var.f67846x8987ca93;
            p6Var.getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o6 o6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o6();
                o6Var.f68192x28d45f97 = str3;
                o6Var.f68193x119cf7dc = i19;
                z17 = p6Var.mo9951xb06685ab(o6Var, new java.lang.String[0]);
            }
            fVar.b(i17, z17 ? 141 : com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf);
        }
        fVar.b(i17, mVar.ordinal() != 0 ? 128 : 132);
        return true;
    }

    public static boolean h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6 m6Var, q81.m mVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p6 p6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p6.class);
        java.lang.String str = m6Var.f67842x28d45f97;
        int i17 = m6Var.f67846x8987ca93;
        p6Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o6 o6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o6();
        o6Var.f68192x28d45f97 = str;
        o6Var.f68193x119cf7dc = i17;
        if (!p6Var.get(o6Var, new java.lang.String[0])) {
            o6Var = null;
        }
        if (o6Var != null) {
            return g(m6Var, o6Var.f68194x344c79f7, o6Var.f68195xb05c6f7, o6Var.f68196x44eeb14, mVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "decryptPkgAndSave get null key with %s", m6Var.t0());
        return false;
    }

    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        r45.lf7 lf7Var = (r45.lf7) obj;
        int i17 = lf7Var.f460972f;
        java.lang.String str3 = lf7Var.f460971e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "call appId(%s) version(%d) key nil", str2, java.lang.Integer.valueOf(i17));
            r81.f.INSTANCE.b(lf7Var.f460970d.f453064f, 124);
            return java.lang.Boolean.FALSE;
        }
        boolean z17 = false;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.EnumC11664x177167f4.b(str2, 0, i17, null).first == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l9.APP_READY) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "call, normal pkg ok appId(%s), version(%d)", str2, java.lang.Integer.valueOf(i17));
            r81.f.INSTANCE.b(lf7Var.f460970d.f453064f, 125);
            return java.lang.Boolean.FALSE;
        }
        boolean z18 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6 D0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6.class)).D0(str2, 1, i17);
        if (D0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "call, null encrypt pkg info with %s, %d", str2, java.lang.Integer.valueOf(i17));
            r81.f.INSTANCE.b(lf7Var.f460970d.f453064f, 126);
        } else {
            z18 = true ^ g(D0, lf7Var.f460971e, lf7Var.f460973g, lf7Var.f460970d.f453064f, q81.m.ISSUE_DECRYPT);
        }
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p6 p6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p6.class);
            java.lang.String str4 = lf7Var.f460973g;
            int i18 = lf7Var.f460970d.f453064f;
            p6Var.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.PushWxaPkgDecryptKeyStorage", "setDecryptKey, invalid appId[%s], decryptKey[%s]", str2, str3);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o6 o6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o6();
                o6Var.f68192x28d45f97 = str2;
                o6Var.f68193x119cf7dc = i17;
                boolean z19 = p6Var.get(o6Var, new java.lang.String[0]);
                o6Var.f68194x344c79f7 = str3;
                o6Var.f68196x44eeb14 = i18;
                o6Var.f68195xb05c6f7 = str4;
                z17 = z19 ? p6Var.mo9952xce0038c9(o6Var, new java.lang.String[0]) : p6Var.mo880xb970c2b9(o6Var);
            }
            r81.f.INSTANCE.b(lf7Var.f460970d.f453064f, z17 ? 135 : 136);
        }
        return java.lang.Boolean.TRUE;
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        return ((r45.lf7) obj).f460970d;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdIssueDecryptKey";
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public final class b0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e
    public void a(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("appId");
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            return;
        }
        int intExtra = intent.getIntExtra("versionType", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 C = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C();
        java.util.Objects.requireNonNull(stringExtra);
        C.s(stringExtra, intExtra);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y9
    public boolean b(java.lang.String str, java.util.Map map) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!z65.c.a()) {
                return false;
            }
        }
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.AppBrandForceKill.AppId");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.AppBrandForceKill.VersionType"), 0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().s(str3, P);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e
    /* renamed from: name */
    public java.lang.String mo50165x337a8b() {
        return "ForceKillAppNotify";
    }
}

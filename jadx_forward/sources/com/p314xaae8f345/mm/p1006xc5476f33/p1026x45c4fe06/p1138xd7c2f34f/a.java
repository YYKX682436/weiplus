package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public abstract class a implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x {
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0116, code lost:
    
        if (r0 == null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.content.Context r11, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc r12) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a.a(android.content.Context, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel):boolean");
    }

    public final boolean b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98, com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9 c11105x57aff1b9) {
        return c(context, str, str2, str3, i17, i18, c12559xbdae8559, c11812xa040dc98, c11105x57aff1b9, "", "");
    }

    public boolean c(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98, com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9 c11105x57aff1b9, java.lang.String str4, java.lang.String str5) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc();
        c12362x460991bc.f166434d = str;
        c12362x460991bc.f166435e = str2;
        c12362x460991bc.f166439i = str3 == null ? null : str3.trim();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(i17) || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(i17)) {
            c12362x460991bc.f166437g = i17;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Precondition.AbstractLaunchEntry", "start with invalid versionType[%d], use 0 instead, stack=%s", java.lang.Integer.valueOf(i17), android.util.Log.getStackTraceString(new java.lang.Throwable()));
            c12362x460991bc.f166437g = 0;
        }
        c12362x460991bc.f166436f = i18;
        c12362x460991bc.f166443o = c12559xbdae8559;
        c12362x460991bc.f166444p = c11812xa040dc98;
        c12362x460991bc.f166447q = c11105x57aff1b9;
        if (c11105x57aff1b9 != null && c11105x57aff1b9.f151952h != 0) {
            c12362x460991bc.F = 1;
        }
        c12362x460991bc.D = str4;
        c12362x460991bc.E = str5;
        return a(context, c12362x460991bc);
    }

    public abstract boolean d(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc);
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class n1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34229x366c91de = 99;

    /* renamed from: NAME */
    private static final java.lang.String f34230x24728b = "openDocument";

    /* renamed from: n, reason: collision with root package name */
    public static long f162633n = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f162634g;

    /* renamed from: h, reason: collision with root package name */
    public rh1.a f162635h;

    /* renamed from: i, reason: collision with root package name */
    public final kk3.b f162636i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l1(this);

    /* renamed from: m, reason: collision with root package name */
    public final kk3.b f162637m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.m1(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f162633n < 1000) {
            lVar.a(i17, o("fail:document viewer already starting"));
            return;
        }
        f162633n = currentTimeMillis;
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null || !(mo50352x76847179 instanceof android.app.Activity)) {
            lVar.a(i17, o("fail"));
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("showMenu");
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = lVar.mo50354x59eafec1().mo49620x1d537609(optString);
        if (mo49620x1d537609 == null) {
            lVar.a(i17, o("fail:file doesn't exist"));
            return;
        }
        this.f162634g = lVar.mo48798x74292566();
        java.lang.String c17 = s46.c.c(optString);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9 c12105x9a9f8a9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9();
        java.lang.String str = null;
        if (mo49620x1d537609 != null && lVar.mo50354x59eafec1() != null) {
            java.lang.String o17 = mo49620x1d537609.o();
            if (!(o17 == null ? "" : o17).endsWith(c17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenDocument", "create new temp file for suffix");
                com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5 = lVar.mo50354x59eafec1().mo49614x6665a5c5(java.lang.String.format("%s.%s", mo49620x1d537609.m82467xfb82e301(), c17));
                if (mo49614x6665a5c5 != null) {
                    if (!mo49614x6665a5c5.m()) {
                        try {
                            mo49614x6665a5c5.k();
                        } catch (java.io.IOException unused) {
                        }
                    }
                    com.p314xaae8f345.mm.vfs.w6.c(o17, mo49614x6665a5c5.o());
                    if (mo49614x6665a5c5.m() && mo49614x6665a5c5.C() == mo49620x1d537609.C()) {
                        str = mo49614x6665a5c5.o();
                    }
                }
            }
            str = mo49620x1d537609.o();
        }
        c12105x9a9f8a9.f162552d = str;
        c12105x9a9f8a9.f162553e = c17;
        c12105x9a9f8a9.f162554f = this.f162634g;
        c12105x9a9f8a9.f162555g = optBoolean;
        java.lang.String optString2 = jSONObject.optString("fileType");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            c12105x9a9f8a9.f162553e = optString2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.b(mo50352x76847179, c12105x9a9f8a9, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.j1(this, lVar, mo50352x76847179, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(lVar.mo48798x74292566(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.k1(this, lVar));
    }
}

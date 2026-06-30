package com.p314xaae8f345.mm.p1006xc5476f33.ext.p1398xb4b53790.p1399xc52405f1;

/* renamed from: com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi */
/* loaded from: classes12.dex */
public class C13498x68291483 extends com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba {

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f181392t = {"retCode", "selfId"};

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f181393u = {"retCode", "sportConfig"};

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f181394v = {com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5857xdf813330, "avatar"};

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f181395w = {"voiceType", "sampleRateInHz", "channelConfig", "audioFormat", com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1};

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f181396x = {dm.i4.f66875xa013b0d5, "appId", "versionType", "nickname", "shortNickname", "iconURL", "collection", "runningFlag", "wechatPkg", "action", "intentInfo"};

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.String[] f181397y = {"token", "nickname", "iconURL"};

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f181398o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String[] f181399p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f181400q;

    /* renamed from: r, reason: collision with root package name */
    public final int f181401r;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f181402s;

    public C13498x68291483(java.lang.String[] strArr, int i17, android.content.Context context, java.lang.String str) {
        this.f181399p = null;
        this.f181400q = "";
        this.f181401r = -1;
        this.f181399p = strArr;
        this.f181401r = i17;
        this.f181402s = context;
        this.f181400q = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.Cursor n(java.lang.String[] r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.ext.p1398xb4b53790.p1399xc52405f1.C13498x68291483.n(java.lang.String[], boolean):android.database.Cursor");
    }

    public final android.database.Cursor o(java.lang.String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlProviderOpenApi", "hy: invalid arg length!");
            return v25.a.a(2);
        }
        try {
            int parseInt = java.lang.Integer.parseInt(strArr[0]);
            java.lang.String str = this.f181400q;
            if (1 == parseInt) {
                try {
                    int parseInt2 = java.lang.Integer.parseInt(strArr[1]);
                    if (1 != parseInt2 && 2 != parseInt2 && parseInt2 != 0) {
                        return v25.a.a(2);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.z5 z5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.z5.class);
                    android.content.Context context = this.f181402s;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p1) z5Var).getClass();
                    int i17 = 1 == parseInt2 ? 15 : (2 == parseInt2 || parseInt2 == 0) ? 14 : -1;
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12644x463f8168.class);
                    intent.putExtra(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.f39353x639dcc24, true);
                    intent.putExtra("extra_enter_scene", i17);
                    intent.putExtra("extra_enter_scene_note", str);
                    intent.putExtra("KEY_MODE", 1);
                    intent.addFlags(context instanceof android.app.Activity ? 0 : 268435456);
                    intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                    intent.addFlags(134217728);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/utils/ExtOpenWxaDesktopFavoriteHelperImpl", "openWxaDesktop", "(Landroid/content/Context;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/appbrand/utils/ExtOpenWxaDesktopFavoriteHelperImpl", "openWxaDesktop", "(Landroid/content/Context;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.NumberFormatException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExtControlProviderOpenApi", e17, "", new java.lang.Object[0]);
                    return v25.a.a(2);
                }
            } else {
                if (2 != parseInt) {
                    return v25.a.a(2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.z5 z5Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.z5.class);
                android.content.Context context2 = this.f181402s;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p1) z5Var2).getClass();
                android.content.Intent intent2 = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12644x463f8168.class);
                intent2.putExtra(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.f39353x639dcc24, true);
                intent2.putExtra("extra_enter_scene", 4);
                intent2.putExtra("extra_enter_scene_note", str);
                intent2.putExtra("KEY_MODE", 2);
                intent2.addFlags(context2 instanceof android.app.Activity ? 0 : 268435456);
                intent2.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                intent2.addFlags(134217728);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/utils/ExtOpenWxaDesktopFavoriteHelperImpl", "openWxaMyFavorite", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/appbrand/utils/ExtOpenWxaDesktopFavoriteHelperImpl", "openWxaMyFavorite", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            return v25.a.a(1);
        } catch (java.lang.NumberFormatException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExtControlProviderOpenApi", e18, "", new java.lang.Object[0]);
            return v25.a.a(2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public boolean onCreate() {
        this.f181398o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.Cursor p(java.lang.String[] r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.ext.p1398xb4b53790.p1399xc52405f1.C13498x68291483.p(java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public final void q() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 Ai = n62.k.Ai();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_SPORT_PKGNAME_STRING;
        java.lang.String str = (java.lang.String) Ai.m(u3Var, null);
        java.lang.String d17 = d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderOpenApi", "setSportBroadPkg: pkgNames: %s, pkg: %s", str, d17);
        if (str == null) {
            n62.k.Ai().x(u3Var, d());
            return;
        }
        if (yo.a.b(str.split(";"), d17)) {
            return;
        }
        n62.k.Ai().x(u3Var, str + ";" + d());
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0803 A[Catch: Exception -> 0x08b0, TryCatch #0 {Exception -> 0x08b0, blocks: (B:298:0x079e, B:300:0x07ac, B:302:0x07c6, B:304:0x07d2, B:308:0x0803, B:309:0x0808, B:311:0x0848, B:313:0x0861, B:330:0x0806, B:331:0x07eb, B:333:0x07f1, B:336:0x07fa, B:339:0x0850), top: B:297:0x079e }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0848 A[Catch: Exception -> 0x08b0, TryCatch #0 {Exception -> 0x08b0, blocks: (B:298:0x079e, B:300:0x07ac, B:302:0x07c6, B:304:0x07d2, B:308:0x0803, B:309:0x0808, B:311:0x0848, B:313:0x0861, B:330:0x0806, B:331:0x07eb, B:333:0x07f1, B:336:0x07fa, B:339:0x0850), top: B:297:0x079e }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0806 A[Catch: Exception -> 0x08b0, TryCatch #0 {Exception -> 0x08b0, blocks: (B:298:0x079e, B:300:0x07ac, B:302:0x07c6, B:304:0x07d2, B:308:0x0803, B:309:0x0808, B:311:0x0848, B:313:0x0861, B:330:0x0806, B:331:0x07eb, B:333:0x07f1, B:336:0x07fa, B:339:0x0850), top: B:297:0x079e }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x094e  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.database.Cursor query(android.net.Uri r25, java.lang.String[] r26, java.lang.String r27, java.lang.String[] r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 2436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.ext.p1398xb4b53790.p1399xc52405f1.C13498x68291483.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}

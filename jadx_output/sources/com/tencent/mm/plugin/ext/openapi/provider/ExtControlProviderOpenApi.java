package com.tencent.mm.plugin.ext.openapi.provider;

/* loaded from: classes12.dex */
public class ExtControlProviderOpenApi extends com.tencent.mm.plugin.ext.provider.ExtContentProviderBase {

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f99859t = {"retCode", "selfId"};

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f99860u = {"retCode", "sportConfig"};

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f99861v = {com.google.android.gms.common.Scopes.OPEN_ID, "avatar"};

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f99862w = {"voiceType", "sampleRateInHz", "channelConfig", "audioFormat", com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH};

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f99863x = {dm.i4.COL_USERNAME, "appId", "versionType", "nickname", "shortNickname", "iconURL", "collection", "runningFlag", "wechatPkg", "action", "intentInfo"};

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.String[] f99864y = {"token", "nickname", "iconURL"};

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f99865o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String[] f99866p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f99867q;

    /* renamed from: r, reason: collision with root package name */
    public final int f99868r;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f99869s;

    public ExtControlProviderOpenApi(java.lang.String[] strArr, int i17, android.content.Context context, java.lang.String str) {
        this.f99866p = null;
        this.f99867q = "";
        this.f99868r = -1;
        this.f99866p = strArr;
        this.f99868r = i17;
        this.f99869s = context;
        this.f99867q = str;
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi.n(java.lang.String[], boolean):android.database.Cursor");
    }

    public final android.database.Cursor o(java.lang.String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtControlProviderOpenApi", "hy: invalid arg length!");
            return v25.a.a(2);
        }
        try {
            int parseInt = java.lang.Integer.parseInt(strArr[0]);
            java.lang.String str = this.f99867q;
            if (1 == parseInt) {
                try {
                    int parseInt2 = java.lang.Integer.parseInt(strArr[1]);
                    if (1 != parseInt2 && 2 != parseInt2 && parseInt2 != 0) {
                        return v25.a.a(2);
                    }
                    com.tencent.mm.plugin.appbrand.service.z5 z5Var = (com.tencent.mm.plugin.appbrand.service.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.z5.class);
                    android.content.Context context = this.f99869s;
                    ((com.tencent.mm.plugin.appbrand.utils.p1) z5Var).getClass();
                    int i17 = 1 == parseInt2 ? 15 : (2 == parseInt2 || parseInt2 == 0) ? 14 : -1;
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI.class);
                    intent.putExtra(com.tencent.mm.ui.MMFragmentActivity.EXTRA_USE_SYSTEM_DEFAULT_ENTER_EXIT_ANIM, true);
                    intent.putExtra("extra_enter_scene", i17);
                    intent.putExtra("extra_enter_scene_note", str);
                    intent.putExtra("KEY_MODE", 1);
                    intent.addFlags(context instanceof android.app.Activity ? 0 : 268435456);
                    intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                    intent.addFlags(134217728);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/utils/ExtOpenWxaDesktopFavoriteHelperImpl", "openWxaDesktop", "(Landroid/content/Context;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/appbrand/utils/ExtOpenWxaDesktopFavoriteHelperImpl", "openWxaDesktop", "(Landroid/content/Context;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.NumberFormatException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExtControlProviderOpenApi", e17, "", new java.lang.Object[0]);
                    return v25.a.a(2);
                }
            } else {
                if (2 != parseInt) {
                    return v25.a.a(2);
                }
                com.tencent.mm.plugin.appbrand.service.z5 z5Var2 = (com.tencent.mm.plugin.appbrand.service.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.z5.class);
                android.content.Context context2 = this.f99869s;
                ((com.tencent.mm.plugin.appbrand.utils.p1) z5Var2).getClass();
                android.content.Intent intent2 = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI.class);
                intent2.putExtra(com.tencent.mm.ui.MMFragmentActivity.EXTRA_USE_SYSTEM_DEFAULT_ENTER_EXIT_ANIM, true);
                intent2.putExtra("extra_enter_scene", 4);
                intent2.putExtra("extra_enter_scene_note", str);
                intent2.putExtra("KEY_MODE", 2);
                intent2.addFlags(context2 instanceof android.app.Activity ? 0 : 268435456);
                intent2.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
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
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExtControlProviderOpenApi", e18, "", new java.lang.Object[0]);
            return v25.a.a(2);
        }
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public boolean onCreate() {
        this.f99865o = new com.tencent.mm.sdk.platformtools.n3();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi.p(java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public final void q() {
        com.tencent.mm.storage.n3 Ai = n62.k.Ai();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_EXT_SPORT_PKGNAME_STRING;
        java.lang.String str = (java.lang.String) Ai.m(u3Var, null);
        java.lang.String d17 = d();
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderOpenApi", "setSportBroadPkg: pkgNames: %s, pkg: %s", str, d17);
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
    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.database.Cursor query(android.net.Uri r25, java.lang.String[] r26, java.lang.String r27, java.lang.String[] r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 2436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}

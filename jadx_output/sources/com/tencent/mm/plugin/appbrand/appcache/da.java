package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public class da {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.da f75492a = new com.tencent.mm.plugin.appbrand.appcache.da();

    /* renamed from: b, reason: collision with root package name */
    public static final android.net.Uri f75493b = android.net.Uri.parse("content://" + rf.a.f394606a + "/AppBrandWxaPkgManifestRecord");

    public boolean a(java.lang.String str, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("Luggage.DevPkgLaunchExtInfoContentResolver", "deleteModuleList appId:%s, pkgType:%d, pkgVersion:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("CONTENT_KEY_ACTION", "ACTION_DELETE_MODULE_LIST");
            contentValues.put("CONTENT_KEY_APPID", str);
            contentValues.put("CONTENT_KEY_PKG_TYPE", java.lang.Integer.valueOf(i17));
            contentValues.put("CONTENT_KEY_PKG_VERSION", java.lang.Integer.valueOf(i18));
            com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().update(f75493b, contentValues, null, null);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Luggage.DevPkgLaunchExtInfoContentResolver", "deleteModuleList failed, appId:%s, pkgType:%d, pkgVersion:%d, exception:%s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), e17);
            return true;
        }
    }

    public com.tencent.mm.plugin.appbrand.appcache.n9 b(java.lang.String str, int i17, java.lang.String... strArr) {
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.appcache.n9 n9Var = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        if (com.tencent.mm.plugin.appbrand.appcache.g0.b(i17)) {
            str2 = "version desc";
        } else {
            if (!com.tencent.mm.plugin.appbrand.appcache.g0.a(i17)) {
                throw new java.lang.RuntimeException("Illegal pkgType " + i17);
            }
            str2 = "createTime desc";
        }
        android.database.Cursor query = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().query(f75493b, com.tencent.mm.sdk.platformtools.t8.N0(strArr) ? null : strArr, java.lang.String.format(java.util.Locale.US, "%s=? and %s=?", "appId", "debugType"), new java.lang.String[]{str, java.lang.String.valueOf(i17)}, str2);
        if (query == null) {
            return null;
        }
        if (query.moveToFirst()) {
            n9Var = new com.tencent.mm.plugin.appbrand.appcache.n9();
            n9Var.convertFrom(query);
            n9Var.field_appId = str;
            n9Var.field_debugType = i17;
        }
        query.close();
        return n9Var;
    }

    public boolean c(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("Luggage.DevPkgLaunchExtInfoContentResolver", "updateModuleList appId:%s, pkgType:%d, pkgVersion:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("CONTENT_KEY_ACTION", "ACTION_UPDATE_MODULE_LIST");
            contentValues.put("CONTENT_KEY_APPID", str);
            contentValues.put("CONTENT_KEY_PKG_TYPE", java.lang.Integer.valueOf(i17));
            contentValues.put("CONTENT_KEY_PKG_VERSION", java.lang.Integer.valueOf(i18));
            contentValues.put("CONTENT_KEY_MODULE_LIST_JSON", str2);
            com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().insert(f75493b, contentValues);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Luggage.DevPkgLaunchExtInfoContentResolver", "updateModuleList failed appId:%s, pkgType:%d, pkgVersion:%d, exception:%s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), e17);
            return false;
        }
    }

    public void d(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("CONTENT_KEY_ACTION", "ACTION_UPDATE_PKG_INFO");
            contentValues.put("CONTENT_KEY_APPID", str);
            contentValues.put("CONTENT_KEY_MODULE_NAME", str2);
            contentValues.put("CONTENT_KEY_PKG_VERSION", java.lang.Integer.valueOf(i17));
            contentValues.put("CONTENT_KEY_CODE_TYPE", java.lang.Integer.valueOf(i18));
            contentValues.put("CONTENT_KEY_PKGINFO_LIST", str3);
            com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().insert(f75493b, contentValues);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.DevPkgLaunchExtInfoContentResolver", e17, "updatePkgInfoList", new java.lang.Object[0]);
        }
    }

    public void e(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, int i19) {
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("CONTENT_KEY_ACTION", "ACIION_UPDATE_WITHOUT_PLUGINCODE_INFO");
            contentValues.put("CONTENT_KEY_APPID", str);
            contentValues.put("CONTENT_KEY_MODULE_NAME", str2);
            contentValues.put("CONTENT_KEY_PKG_VERSION", java.lang.Integer.valueOf(i17));
            contentValues.put("CONTENT_KEY_CODE_TYPE", java.lang.Integer.valueOf(i18));
            contentValues.put("CONTENT_KEY_PKG_VERSION_MD5", str3);
            contentValues.put("CONTENT_KEY_PKG_TYPE", java.lang.Integer.valueOf(i19));
            com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().insert(f75493b, contentValues);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.DevPkgLaunchExtInfoContentResolver", e17, "updateWithoutPluginCodeInfo, appId[%s] module[%s], version[%d], codeType[%d], md5[%s], pkgType[%d]", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str3, java.lang.Integer.valueOf(i19));
        }
    }
}

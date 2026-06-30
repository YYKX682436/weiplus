package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes4.dex */
public class da {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.da f157025a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.da();

    /* renamed from: b, reason: collision with root package name */
    public static final android.net.Uri f157026b = android.net.Uri.parse("content://" + rf.a.f476139a + "/AppBrandWxaPkgManifestRecord");

    public boolean a(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.DevPkgLaunchExtInfoContentResolver", "deleteModuleList appId:%s, pkgType:%d, pkgVersion:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("CONTENT_KEY_ACTION", "ACTION_DELETE_MODULE_LIST");
            contentValues.put("CONTENT_KEY_APPID", str);
            contentValues.put("CONTENT_KEY_PKG_TYPE", java.lang.Integer.valueOf(i17));
            contentValues.put("CONTENT_KEY_PKG_VERSION", java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().update(f157026b, contentValues, null, null);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.DevPkgLaunchExtInfoContentResolver", "deleteModuleList failed, appId:%s, pkgType:%d, pkgVersion:%d, exception:%s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), e17);
            return true;
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 b(java.lang.String str, int i17, java.lang.String... strArr) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(i17)) {
            str2 = "version desc";
        } else {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(i17)) {
                throw new java.lang.RuntimeException("Illegal pkgType " + i17);
            }
            str2 = "createTime desc";
        }
        android.database.Cursor query = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().query(f157026b, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr) ? null : strArr, java.lang.String.format(java.util.Locale.US, "%s=? and %s=?", "appId", "debugType"), new java.lang.String[]{str, java.lang.String.valueOf(i17)}, str2);
        if (query == null) {
            return null;
        }
        if (query.moveToFirst()) {
            n9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9();
            n9Var.mo9015xbf5d97fd(query);
            n9Var.f67177x28d45f97 = str;
            n9Var.f67180x8ecd6328 = i17;
        }
        query.close();
        return n9Var;
    }

    public boolean c(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.DevPkgLaunchExtInfoContentResolver", "updateModuleList appId:%s, pkgType:%d, pkgVersion:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("CONTENT_KEY_ACTION", "ACTION_UPDATE_MODULE_LIST");
            contentValues.put("CONTENT_KEY_APPID", str);
            contentValues.put("CONTENT_KEY_PKG_TYPE", java.lang.Integer.valueOf(i17));
            contentValues.put("CONTENT_KEY_PKG_VERSION", java.lang.Integer.valueOf(i18));
            contentValues.put("CONTENT_KEY_MODULE_LIST_JSON", str2);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().insert(f157026b, contentValues);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.DevPkgLaunchExtInfoContentResolver", "updateModuleList failed appId:%s, pkgType:%d, pkgVersion:%d, exception:%s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), e17);
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
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().insert(f157026b, contentValues);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.DevPkgLaunchExtInfoContentResolver", e17, "updatePkgInfoList", new java.lang.Object[0]);
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
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().insert(f157026b, contentValues);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.DevPkgLaunchExtInfoContentResolver", e17, "updateWithoutPluginCodeInfo, appId[%s] module[%s], version[%d], codeType[%d], md5[%s], pkgType[%d]", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str3, java.lang.Integer.valueOf(i19));
        }
    }
}

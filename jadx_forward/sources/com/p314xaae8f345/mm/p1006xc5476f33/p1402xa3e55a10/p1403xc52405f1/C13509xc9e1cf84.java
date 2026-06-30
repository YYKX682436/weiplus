package com.p314xaae8f345.mm.p1006xc5476f33.p1402xa3e55a10.p1403xc52405f1;

/* renamed from: com.tencent.mm.plugin.extqlauncher.provider.ExtControlProviderQLauncher */
/* loaded from: classes12.dex */
public class C13509xc9e1cf84 extends com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f181464r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f181465s;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String[] f181466o;

    /* renamed from: p, reason: collision with root package name */
    public final int f181467p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f181468q;

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        uriMatcher.addURI("com.tencent.mm.plugin.extqlauncher", "openQRCodeScan", 18);
        uriMatcher.addURI("com.tencent.mm.plugin.extqlauncher", "batchAddShortcut", 19);
        uriMatcher.addURI("com.tencent.mm.plugin.extqlauncher", "getUnreadCount", 20);
        f181464r = new java.lang.String[]{"retCode"};
        f181465s = new java.lang.String[]{dm.i4.f66865x76d1ec5a, "count"};
    }

    public C13509xc9e1cf84(java.lang.String[] strArr, int i17, android.content.Context context) {
        this.f181467p = -1;
        this.f181466o = strArr;
        this.f181467p = i17;
        this.f181468q = context;
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        java.lang.String[] strArr3 = this.f181466o;
        android.content.Context context = this.f181468q;
        int i17 = this.f181467p;
        e(uri, context, i17, strArr3);
        if (uri == null) {
            k(3);
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f181408g) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d())) {
            k(3);
            return null;
        }
        if (!b()) {
            k(1);
            return this.f181405d;
        }
        if (!i(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlProviderQLauncher", "invalid appid ! return null");
            k(2);
            return null;
        }
        java.lang.String[] strArr4 = f181464r;
        switch (i17) {
            case 18:
                if (context == null) {
                    k(4);
                    return null;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("BaseScanUI_select_scan_mode", 1);
                intent.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
                intent.putExtra("key_scan_report_enter_scene", 22);
                java.lang.String callingPackage = getCallingPackage();
                if (callingPackage == null) {
                    callingPackage = "";
                }
                intent.putExtra("key_scan_shortcut_caller_string", callingPackage);
                j45.l.j(context, "scanner", ".ui.BaseScanUI", intent, null);
                android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(strArr4);
                matrixCursor.addRow(new java.lang.Object[]{1});
                k(0);
                return matrixCursor;
            case 19:
                if (context == null) {
                    k(4);
                    return null;
                }
                j45.l.j(context, "extqlauncher", ".ui.QLauncherCreateShortcutUI", new android.content.Intent(), null);
                android.database.MatrixCursor matrixCursor2 = new android.database.MatrixCursor(strArr4);
                matrixCursor2.addRow(new java.lang.Object[]{1});
                k(0);
                return matrixCursor2;
            case 20:
                if (context == null) {
                    k(4);
                    return null;
                }
                if (strArr2 == null || strArr2.length <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderQLauncher", "wrong args");
                    k(3);
                    return null;
                }
                android.database.MatrixCursor matrixCursor3 = new android.database.MatrixCursor(f181465s);
                for (int i18 = 0; i18 < strArr2.length && i18 < 10; i18++) {
                    try {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr2[i18])) {
                            if (strArr2[i18].equals("0")) {
                                matrixCursor3.addRow(new java.lang.Object[]{strArr2[i18], 0});
                            } else {
                                java.lang.String g17 = xp1.c.g(strArr2[i18]);
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(g17);
                                    if (p17 != null) {
                                        matrixCursor3.addRow(new java.lang.Object[]{strArr2[i18], java.lang.Integer.valueOf(p17.d1())});
                                    } else {
                                        matrixCursor3.addRow(new java.lang.Object[]{strArr2[i18], 0});
                                    }
                                }
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderQLauncher", "exception in updateShortcut, %s", e17.getMessage());
                        k(4);
                        matrixCursor3.close();
                        return null;
                    }
                }
                k(0);
                return matrixCursor3;
            default:
                k(3);
                return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    public C13509xc9e1cf84() {
        this.f181467p = -1;
    }
}

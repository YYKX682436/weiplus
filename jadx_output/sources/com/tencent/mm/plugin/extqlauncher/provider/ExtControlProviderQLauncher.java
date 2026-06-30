package com.tencent.mm.plugin.extqlauncher.provider;

/* loaded from: classes12.dex */
public class ExtControlProviderQLauncher extends com.tencent.mm.plugin.ext.provider.ExtContentProviderBase {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f99931r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f99932s;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String[] f99933o;

    /* renamed from: p, reason: collision with root package name */
    public final int f99934p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f99935q;

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        uriMatcher.addURI("com.tencent.mm.plugin.extqlauncher", "openQRCodeScan", 18);
        uriMatcher.addURI("com.tencent.mm.plugin.extqlauncher", "batchAddShortcut", 19);
        uriMatcher.addURI("com.tencent.mm.plugin.extqlauncher", "getUnreadCount", 20);
        f99931r = new java.lang.String[]{"retCode"};
        f99932s = new java.lang.String[]{dm.i4.COL_ID, "count"};
    }

    public ExtControlProviderQLauncher(java.lang.String[] strArr, int i17, android.content.Context context) {
        this.f99934p = -1;
        this.f99933o = strArr;
        this.f99934p = i17;
        this.f99935q = context;
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

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        java.lang.String[] strArr3 = this.f99933o;
        android.content.Context context = this.f99935q;
        int i17 = this.f99934p;
        e(uri, context, i17, strArr3);
        if (uri == null) {
            k(3);
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f99875g) || com.tencent.mm.sdk.platformtools.t8.K0(d())) {
            k(3);
            return null;
        }
        if (!b()) {
            k(1);
            return this.f99872d;
        }
        if (!i(context)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtControlProviderQLauncher", "invalid appid ! return null");
            k(2);
            return null;
        }
        java.lang.String[] strArr4 = f99931r;
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
                    com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderQLauncher", "wrong args");
                    k(3);
                    return null;
                }
                android.database.MatrixCursor matrixCursor3 = new android.database.MatrixCursor(f99932s);
                for (int i18 = 0; i18 < strArr2.length && i18 < 10; i18++) {
                    try {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(strArr2[i18])) {
                            if (strArr2[i18].equals("0")) {
                                matrixCursor3.addRow(new java.lang.Object[]{strArr2[i18], 0});
                            } else {
                                java.lang.String g17 = xp1.c.g(strArr2[i18]);
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                                    com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(g17);
                                    if (p17 != null) {
                                        matrixCursor3.addRow(new java.lang.Object[]{strArr2[i18], java.lang.Integer.valueOf(p17.d1())});
                                    } else {
                                        matrixCursor3.addRow(new java.lang.Object[]{strArr2[i18], 0});
                                    }
                                }
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderQLauncher", "exception in updateShortcut, %s", e17.getMessage());
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

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    public ExtControlProviderQLauncher() {
        this.f99934p = -1;
    }
}

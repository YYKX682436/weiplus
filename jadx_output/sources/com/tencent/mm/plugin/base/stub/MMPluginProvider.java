package com.tencent.mm.plugin.base.stub;

/* loaded from: classes8.dex */
public class MMPluginProvider extends android.content.ContentProvider {

    /* renamed from: e, reason: collision with root package name */
    public static final android.content.UriMatcher f93596e;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.base.stub.h f93597d = new com.tencent.mm.plugin.base.stub.h();

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        f93596e = uriMatcher;
        uriMatcher.addURI(com.tencent.mm.sdk.platformtools.x2.f193072b + ".sdk.plugin.provider", "sharedpref", 2);
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        java.util.Objects.toString(uri);
        if (f93596e.match(uri) == 2) {
            this.f93597d.getClass();
            return 0;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMPluginProvider", "Unknown URI " + uri);
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        f93596e.match(uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        java.util.Objects.toString(uri);
        if (f93596e.match(uri) == 2) {
            this.f93597d.getClass();
            return null;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMPluginProvider", "Unknown URI " + uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPluginProvider", "onCreate");
        getContext();
        this.f93597d.getClass();
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPluginProvider", "plugin query" + uri);
        int i17 = 2;
        if (f93596e.match(uri) != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMPluginProvider", "Unknown URI " + uri);
            return null;
        }
        this.f93597d.getClass();
        java.lang.String str3 = strArr2[0];
        java.lang.Object obj = ((java.util.HashMap) com.tencent.mm.plugin.base.stub.h.f93751a).get(str3);
        if (obj == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMPluginProviderSharedPrefImpl", "not found value for key: " + str3);
            return null;
        }
        if (obj instanceof java.lang.Integer) {
            i17 = 1;
        } else if (!(obj instanceof java.lang.Long)) {
            if (obj instanceof java.lang.String) {
                i17 = 3;
            } else if (obj instanceof java.lang.Boolean) {
                i17 = 4;
            } else if (obj instanceof java.lang.Float) {
                i17 = 5;
            } else if (obj instanceof java.lang.Double) {
                i17 = 6;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unresolve failed, unknown type=" + obj.getClass().toString());
                i17 = 0;
            }
        }
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(strArr);
        matrixCursor.addRow(new java.lang.Object[]{0, str3, java.lang.Integer.valueOf(i17), obj.toString()});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        java.util.Objects.toString(uri);
        if (f93596e.match(uri) == 2) {
            this.f93597d.getClass();
            return 0;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMPluginProvider", "Unknown URI " + uri);
        return 0;
    }
}

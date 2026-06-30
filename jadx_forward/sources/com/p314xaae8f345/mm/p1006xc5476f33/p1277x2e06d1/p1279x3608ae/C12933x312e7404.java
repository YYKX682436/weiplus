package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* renamed from: com.tencent.mm.plugin.base.stub.MMPluginProvider */
/* loaded from: classes8.dex */
public class C12933x312e7404 extends android.content.ContentProvider {

    /* renamed from: e, reason: collision with root package name */
    public static final android.content.UriMatcher f175129e;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.h f175130d = new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.h();

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        f175129e = uriMatcher;
        uriMatcher.addURI(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ".sdk.plugin.provider", "sharedpref", 2);
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        java.util.Objects.toString(uri);
        if (f175129e.match(uri) == 2) {
            this.f175130d.getClass();
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPluginProvider", "Unknown URI " + uri);
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        f175129e.match(uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        java.util.Objects.toString(uri);
        if (f175129e.match(uri) == 2) {
            this.f175130d.getClass();
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPluginProvider", "Unknown URI " + uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPluginProvider", "onCreate");
        getContext();
        this.f175130d.getClass();
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPluginProvider", "plugin query" + uri);
        int i17 = 2;
        if (f175129e.match(uri) != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPluginProvider", "Unknown URI " + uri);
            return null;
        }
        this.f175130d.getClass();
        java.lang.String str3 = strArr2[0];
        java.lang.Object obj = ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.h.f175284a).get(str3);
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMPluginProviderSharedPrefImpl", "not found value for key: " + str3);
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unresolve failed, unknown type=" + obj.getClass().toString());
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
        if (f175129e.match(uri) == 2) {
            this.f175130d.getClass();
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPluginProvider", "Unknown URI " + uri);
        return 0;
    }
}

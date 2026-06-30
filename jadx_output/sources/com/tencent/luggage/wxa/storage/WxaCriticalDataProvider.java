package com.tencent.luggage.wxa.storage;

/* loaded from: classes7.dex */
public abstract class WxaCriticalDataProvider extends android.content.ContentProvider {

    /* renamed from: f, reason: collision with root package name */
    public static final android.content.UriMatcher f47735f;

    /* renamed from: g, reason: collision with root package name */
    public static final android.util.SparseArray f47736g;

    /* renamed from: d, reason: collision with root package name */
    public volatile l75.k0 f47737d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f47738e = new java.util.HashMap();

    static {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        f47736g = sparseArray;
        sparseArray.put(1, "WxaAttributesTable");
        sparseArray.put(2, "LaunchWxaAppPBTable");
        sparseArray.put(4, "DevPkgLaunchExtInfo");
        sparseArray.put(5, "AppBrandWxaPkgManifestRecord");
        sparseArray.put(7, "PersistentWxaSyncInvalidContactCmd");
        f47735f = new android.content.UriMatcher(-1);
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray2 = f47736g;
            if (i17 >= sparseArray2.size()) {
                return;
            }
            f47735f.addURI(rf.a.f394606a, (java.lang.String) sparseArray2.valueAt(i17), sparseArray2.keyAt(i17));
            i17++;
        }
    }

    public final boolean b() {
        if (this.f47737d == null) {
            this.f47737d = d();
        }
        return this.f47737d != null;
    }

    public final java.lang.Object c(java.lang.Class cls) {
        return ((java.util.HashMap) this.f47738e).get(cls);
    }

    public abstract l75.k0 d();

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        if (!b()) {
            return -1;
        }
        if (f47735f.match(uri) != 7) {
            return 0;
        }
        if (strArr == null || strArr.length < 1) {
            return -1;
        }
        java.lang.String str2 = strArr[0];
        if (android.text.TextUtils.isEmpty(str2)) {
            return -1;
        }
        return ((t81.s) c(t81.s.class)).d(str2) ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x007d, code lost:
    
        if (r4.equals("ACTION_UPDATE_MODULE_LIST") == false) goto L39;
     */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.net.Uri insert(android.net.Uri r26, android.content.ContentValues r27) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.wxa.storage.WxaCriticalDataProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        if (!b()) {
            return null;
        }
        java.lang.String str3 = (java.lang.String) f47736g.get(f47735f.match(uri));
        if (android.text.TextUtils.isEmpty(str3)) {
            return null;
        }
        return this.f47737d.E(str3, strArr, str, strArr2, null, null, str2);
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        if (!b()) {
            return -1;
        }
        if (f47735f.match(uri) != 5) {
            return 0;
        }
        java.lang.String asString = contentValues.getAsString("CONTENT_KEY_ACTION");
        asString.getClass();
        if (!asString.equals("ACTION_DELETE_MODULE_LIST")) {
            return 0;
        }
        return ((com.tencent.mm.plugin.appbrand.appcache.qa) c(com.tencent.mm.plugin.appbrand.appcache.qa.class)).g(contentValues.getAsString("CONTENT_KEY_APPID"), contentValues.getAsInteger("CONTENT_KEY_PKG_TYPE").intValue(), contentValues.getAsInteger("CONTENT_KEY_PKG_VERSION").intValue());
    }
}

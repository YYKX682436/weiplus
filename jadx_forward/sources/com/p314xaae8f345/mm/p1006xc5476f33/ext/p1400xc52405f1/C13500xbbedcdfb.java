package com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1;

/* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderAccountSync */
/* loaded from: classes12.dex */
public class C13500xbbedcdfb extends com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba {

    /* renamed from: o, reason: collision with root package name */
    public static final android.content.UriMatcher f181411o;

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        f181411o = uriMatcher;
        uriMatcher.addURI(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ".plugin.ext.AccountSync", "accountSync", 1);
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
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        android.content.Context context = getContext();
        android.content.UriMatcher uriMatcher = f181411o;
        f(uri, context, uriMatcher);
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
        if (!i(getContext())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlAccountSyncProvider", "invalid appid ! return null");
            k(2);
            return null;
        }
        if (uriMatcher.match(uri) != 1) {
            k(3);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlAccountSyncProvider", "startContactSync()");
        if (new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5398x757ad680().e()) {
            k(0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlAccountSyncProvider", "AccountHelper == null");
            k(4);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}

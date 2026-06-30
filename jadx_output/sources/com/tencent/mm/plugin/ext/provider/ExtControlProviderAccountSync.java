package com.tencent.mm.plugin.ext.provider;

/* loaded from: classes12.dex */
public class ExtControlProviderAccountSync extends com.tencent.mm.plugin.ext.provider.ExtContentProviderBase {

    /* renamed from: o, reason: collision with root package name */
    public static final android.content.UriMatcher f99878o;

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        f99878o = uriMatcher;
        uriMatcher.addURI(com.tencent.mm.sdk.platformtools.x2.f193072b + ".plugin.ext.AccountSync", "accountSync", 1);
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
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        android.content.Context context = getContext();
        android.content.UriMatcher uriMatcher = f99878o;
        f(uri, context, uriMatcher);
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
        if (!i(getContext())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtControlAccountSyncProvider", "invalid appid ! return null");
            k(2);
            return null;
        }
        if (uriMatcher.match(uri) != 1) {
            k(3);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlAccountSyncProvider", "startContactSync()");
        if (new com.tencent.mm.autogen.events.ExtRequestAccountSyncEvent().e()) {
            k(0);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlAccountSyncProvider", "AccountHelper == null");
            k(4);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}

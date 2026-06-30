package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class AppForegroundDelegate$Provider extends android.content.ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f53218d = com.tencent.mm.sdk.platformtools.x2.f193072b + ".AppForegroundDelegate.Provider";

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (!str.equals("isAppForeground")) {
            return super.call(str, str2, bundle);
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
        bundle2.putString("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME", wVar.f53890o.f53776b.f53847a);
        bundle2.putBoolean("isAppForeground", wVar.f53889n);
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}

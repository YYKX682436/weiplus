package com.p314xaae8f345.p2833x33330b;

/* renamed from: com.tencent.mmkv.MMKVContentProvider */
/* loaded from: classes12.dex */
public class C22994x7f11caff extends android.content.ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static android.net.Uri f296704d;

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (str.equals("mmkvFromAshmemID") && bundle != null) {
            try {
                com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83992x1d216a8b = com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b.m83992x1d216a8b(getContext(), str2, bundle.getInt("KEY_SIZE"), bundle.getInt("KEY_MODE"), bundle.getString("KEY_CRYPT"));
                com.p314xaae8f345.p2833x33330b.C22995x3ecd368e c22995x3ecd368e = new com.p314xaae8f345.p2833x33330b.C22995x3ecd368e(m83992x1d216a8b);
                m83992x1d216a8b.m84038xd7662c9d();
                m83992x1d216a8b.m84039x370dba02();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putParcelable("KEY", c22995x3ecd368e);
                return bundle2;
            } catch (java.lang.Exception e17) {
                e17.getMessage();
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return getContext() != null;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        throw new java.lang.UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("Not implement in MMKV");
    }
}

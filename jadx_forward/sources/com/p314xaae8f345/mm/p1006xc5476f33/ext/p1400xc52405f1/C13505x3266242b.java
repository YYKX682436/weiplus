package com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1;

/* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderSearchContact */
/* loaded from: classes12.dex */
public class C13505x3266242b extends com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f181448p = {"userId", "nickname", "avatar", "content", "msgId", "msgType"};

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.List f181449q = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f181450o = null;

    static {
        for (java.lang.String str : c01.e2.f118665p) {
            f181449q.add(str);
        }
        java.util.List list = f181449q;
        list.add("officialaccounts");
        list.add("service_officialaccounts");
        list.add("BrandEcsTemplateMsg@fakeuser");
        list.add("helper_entry");
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
        android.content.Context context = getContext();
        this.f181408g = c(uri);
        g(context);
        this.f181410i = 16;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f181406e = android.os.SystemClock.elapsedRealtime();
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlProviderSearchContact", "invalid appid ! return null");
            k(2);
            return null;
        }
        if (strArr2 == null || strArr2.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderSearchContact", "invaild selections");
            k(3);
            return null;
        }
        java.lang.String trim = strArr2[0].trim();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderSearchContact", "filter should not be null or nil");
            k(3);
            return null;
        }
        android.database.Cursor c17 = c01.d9.b().z().c(trim, "@micromsg.no.verify.biz.qq.com", null, f181449q, false, false, false, 1, null);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderSearchContact", "cursor is null");
            k(3);
            return null;
        }
        v25.b bVar = new v25.b();
        bVar.b(4000L, new u62.m(this, c17, bVar));
        if (this.f181450o != null) {
            k(0);
        } else {
            k(4);
        }
        return this.f181450o;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}

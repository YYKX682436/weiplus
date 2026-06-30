package com.tencent.mm.plugin.ext.provider;

/* loaded from: classes12.dex */
public class ExtControlProviderSearchContact extends com.tencent.mm.plugin.ext.provider.ExtContentProviderBase {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f99915p = {"userId", "nickname", "avatar", "content", "msgId", "msgType"};

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.List f99916q = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f99917o = null;

    static {
        for (java.lang.String str : c01.e2.f37132p) {
            f99916q.add(str);
        }
        java.util.List list = f99916q;
        list.add("officialaccounts");
        list.add("service_officialaccounts");
        list.add("BrandEcsTemplateMsg@fakeuser");
        list.add("helper_entry");
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
        android.content.Context context = getContext();
        this.f99875g = c(uri);
        g(context);
        this.f99877i = 16;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f99873e = android.os.SystemClock.elapsedRealtime();
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
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtControlProviderSearchContact", "invalid appid ! return null");
            k(2);
            return null;
        }
        if (strArr2 == null || strArr2.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderSearchContact", "invaild selections");
            k(3);
            return null;
        }
        java.lang.String trim = strArr2[0].trim();
        if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderSearchContact", "filter should not be null or nil");
            k(3);
            return null;
        }
        android.database.Cursor c17 = c01.d9.b().z().c(trim, "@micromsg.no.verify.biz.qq.com", null, f99916q, false, false, false, 1, null);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderSearchContact", "cursor is null");
            k(3);
            return null;
        }
        v25.b bVar = new v25.b();
        bVar.b(4000L, new u62.m(this, c17, bVar));
        if (this.f99917o != null) {
            k(0);
        } else {
            k(4);
        }
        return this.f99917o;
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}

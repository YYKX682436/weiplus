package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1150x37bf4c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/wmpf/WMPFAccessibleProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFAccessibleProvider */
/* loaded from: classes7.dex */
public final class C12405x433a833 extends android.content.ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final android.content.UriMatcher f167206d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f167207e;

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        f167206d = uriMatcher;
        uriMatcher.addURI("com.tencent.mm.export.wmpf.provider", "detect_qrcode", 1);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        f167207e = z65.c.a();
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        if (f167207e && contentValues != null && f167206d.match(uri) == 1) {
            byte[] asByteArray = contentValues.getAsByteArray("CV_KEY_DETECT_QRCODE_BYTES");
            ((ku5.t0) ku5.t0.f394148d).g(new bh1.a(asByteArray, this));
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        return 0;
    }
}

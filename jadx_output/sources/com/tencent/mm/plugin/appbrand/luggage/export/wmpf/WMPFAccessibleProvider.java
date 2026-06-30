package com.tencent.mm.plugin.appbrand.luggage.export.wmpf;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/wmpf/WMPFAccessibleProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class WMPFAccessibleProvider extends android.content.ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final android.content.UriMatcher f85673d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f85674e;

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        f85673d = uriMatcher;
        uriMatcher.addURI("com.tencent.mm.export.wmpf.provider", "detect_qrcode", 1);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f85674e = z65.c.a();
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        kotlin.jvm.internal.o.g(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        kotlin.jvm.internal.o.g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        kotlin.jvm.internal.o.g(uri, "uri");
        if (f85674e && contentValues != null && f85673d.match(uri) == 1) {
            byte[] asByteArray = contentValues.getAsByteArray("CV_KEY_DETECT_QRCODE_BYTES");
            ((ku5.t0) ku5.t0.f312615d).g(new bh1.a(asByteArray, this));
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        kotlin.jvm.internal.o.g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        kotlin.jvm.internal.o.g(uri, "uri");
        return 0;
    }
}

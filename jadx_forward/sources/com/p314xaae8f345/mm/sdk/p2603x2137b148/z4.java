package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public final class z4 extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public long f274663a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f274664b;

    /* renamed from: c, reason: collision with root package name */
    public android.net.Uri f274665c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f274666d;

    public z4(android.content.Context context, android.os.Handler handler) {
        super(handler);
        this.f274666d = context;
    }

    public static void a(com.p314xaae8f345.mm.sdk.p2603x2137b148.z4 z4Var, android.content.Context context, android.net.Uri uri) {
        android.database.Cursor query;
        z4Var.getClass();
        android.database.Cursor cursor = null;
        try {
            try {
                if (android.os.Build.VERSION.SDK_INT < 30 || context.getApplicationInfo().targetSdkVersion < 30) {
                    query = context.getContentResolver().query(uri, com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273989d, null, null, "date_added DESC limit 1");
                } else {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("android:query-arg-limit", 1);
                    bundle.putStringArray("android:query-arg-sort-columns", new java.lang.String[]{"date_added"});
                    bundle.putInt("android:query-arg-sort-direction", 1);
                    query = context.getContentResolver().query(uri, com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273989d, bundle, null);
                }
                cursor = query;
                if (cursor != null && cursor.moveToFirst()) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273987b.post(new com.p314xaae8f345.mm.sdk.p2603x2137b148.y4(z4Var, context, cursor.getString(cursor.getColumnIndex("_data")), cursor.getLong(cursor.getColumnIndex("date_added")), java.lang.System.currentTimeMillis() / 1000));
                }
                if (cursor == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotUtil", "summerscreenshot fail e:" + e17.getMessage());
                if (cursor == null) {
                    return;
                }
            }
            cursor.close();
        } catch (java.lang.Throwable th6) {
            if (cursor != null) {
                cursor.close();
            }
            throw th6;
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17, android.net.Uri uri) {
        android.net.Uri uri2 = this.f274665c;
        if (uri2 != null && uri != null && uri2.getPath() != null && this.f274665c.getPath().equals(uri.getPath())) {
            super.onChange(z17, uri);
            return;
        }
        this.f274665c = uri;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273986a.mo50293x3498a0(new com.p314xaae8f345.mm.sdk.p2603x2137b148.x4(this, z17, uri));
        super.onChange(z17, uri);
    }
}

package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public final class h7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f274262d;

    public h7(android.net.Uri uri) {
        this.f274262d = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.database.Cursor query;
        java.lang.String str;
        boolean z17;
        int columnIndex;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 30 || context.getApplicationInfo().targetSdkVersion < 30) {
            query = context.getContentResolver().query(this.f274262d, com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274390b, null, null, "date_added DESC limit 1");
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("android:query-arg-limit", 1);
            bundle.putStringArray("android:query-arg-sort-columns", new java.lang.String[]{"date_added"});
            bundle.putInt("android:query-arg-sort-direction", 1);
            bundle.putString("android:query-arg-sql-selection", "is_pending = 0");
            query = context.getContentResolver().query(this.f274262d, com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274390b, bundle, null);
        }
        if (query == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "contentObserver onChange, mediaQuery failed");
            return;
        }
        if (!query.moveToFirst()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "contentObserver onChange, mediaQuery empty");
            return;
        }
        java.lang.String string = query.getString(query.getColumnIndex("_data"));
        long j17 = query.getLong(query.getColumnIndex("date_added")) * 1000;
        boolean z18 = i17 >= 29 && (columnIndex = query.getColumnIndex("is_pending")) >= 0 && query.getInt(columnIndex) == 1;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        query.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "contentObserver onChange, mediaQuery, path: " + string + ", dateAdded: " + j17 + ", currentTime: " + currentTimeMillis);
        r26.t tVar = com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274389a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(string));
            long j18 = currentTimeMillis - j17;
            if (java.lang.Math.abs(j18) > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d || java.lang.Math.abs(r6Var.B() - j17) > 5000 || !r6Var.m() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                str = "toLowerCase(...)";
            } else {
                java.lang.String lowerCase = string.toLowerCase(java.util.Locale.ROOT);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                str = "toLowerCase(...)";
                if ((r26.n0.B(lowerCase, "screenshot", false) || r26.n0.B(string, "截屏", false) || r26.n0.B(string, "截图", false)) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274394f)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274394f = string;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274395g.post(new com.p314xaae8f345.mm.sdk.p2603x2137b148.k7(string, j17, z18));
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "onContentChange, main process, report screenshot event");
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274391c != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotService", "onScreenShot, report");
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("trigger_screenshot", null, 36458);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("newFileLimit: ");
            sb6.append(java.lang.Math.abs(j18) <= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("lastModifiedLimit: ");
            sb7.append(java.lang.Math.abs(r6Var.B() - j17) <= 5000);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", sb7.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "fileExist: " + r6Var.m());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "nullFilePath: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string));
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("containPending: ");
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase2 = string.toLowerCase(locale);
            java.lang.String str2 = str;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase2, str2);
            sb8.append(r26.n0.B(lowerCase2, "pending", false));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("containScreenshot: ");
            java.lang.String lowerCase3 = string.toLowerCase(locale);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase3, str2);
            if (!r26.n0.B(lowerCase3, "screenshot", false) && !r26.n0.B(string, "截屏", false) && !r26.n0.B(string, "截图", false)) {
                z17 = false;
                sb9.append(z17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", sb9.toString());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "equalToLast: " + p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274394f));
            }
            z17 = true;
            sb9.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", sb9.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "equalToLast: " + p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274394f));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotUtil", "onContentChange, failed: " + th6.getMessage() + ", stackTrace: " + th6.getStackTrace());
        }
    }
}

package com.p314xaae8f345.p3210x3857dc;

/* renamed from: com.tencent.xweb.XWebCoreContentProvider */
/* loaded from: classes13.dex */
public class C27818xf002da6f extends android.content.ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f301735d = {"com.tencent.mm"};

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f301736e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f301737f = new java.util.concurrent.atomic.AtomicLong(0);

    public static android.net.Uri a(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        if (str2.isEmpty()) {
            str2 = " ";
        }
        if (i17 != 2) {
            return android.net.Uri.parse("content://" + str + ".sdk.xweb.XWebCoreProvider/" + str2 + "/" + i17);
        }
        return android.net.Uri.parse("content://" + str + ".sdk.xweb.XWebCoreProvider/" + str2 + "/" + i17 + "/" + i18 + "/" + str3);
    }

    public static void b(android.content.Context context, com.p314xaae8f345.p3210x3857dc.y1 y1Var) {
        if (y1Var == null) {
            return;
        }
        java.lang.String str = y1Var.f302161a + "," + (y1Var.f302162b.length() > 100 ? y1Var.f302162b.substring(0, 99) : y1Var.f302162b) + "," + y1Var.f302163c.f302176a + "," + (y1Var.f302163c.f302177b.length() > 100 ? y1Var.f302163c.f302177b.substring(0, 99) : y1Var.f302163c.f302177b) + "," + y1Var.f302163c.f302178c + "," + (y1Var.f302163c.f302179d.length() > 100 ? y1Var.f302163c.f302179d.substring(0, 99) : y1Var.f302163c.f302179d) + ",20260502," + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d();
        if (context != null && !"com.tencent.mm".equals(y1Var.f302162b)) {
            by5.c4.b("XWebCoreContentProvider", "doReport need post to mm " + str);
            android.content.ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                by5.c4.c("XWebCoreContentProvider", "doReport content resolver is null");
                return;
            }
            try {
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put(java.lang.String.valueOf(15625), str);
                contentResolver.insert(a("com.tencent.mm", y1Var.f302162b, 3, 0, ""), contentValues);
                return;
            } catch (java.lang.Throwable unused) {
                by5.c4.b("XWebCoreContentProvider", "doReport error post to mm");
                return;
            }
        }
        if (by5.s0.f118128c != null) {
            by5.c4.b("XWebCoreContentProvider", "doReport " + str);
            by5.s0.t(15625, str);
            return;
        }
        by5.c4.b("XWebCoreContentProvider", "doReport reporter not init, cache " + str);
        com.p314xaae8f345.p3210x3857dc.x1 x1Var = new com.p314xaae8f345.p3210x3857dc.x1();
        x1Var.f302151a = 15625;
        x1Var.f302152b = str;
        synchronized (com.p314xaae8f345.p3210x3857dc.w1.f302149b) {
            ((java.util.ArrayList) com.p314xaae8f345.p3210x3857dc.w1.f302148a).add(x1Var);
        }
    }

    public static boolean c(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            return f301735d[0].equals(str);
        }
        by5.c4.c("XWebCoreContentProvider", "isProvider, packageName is null or empty");
        return false;
    }

    public static void d() {
        by5.c4.f("XWebCoreContentProvider", "onXWebInitFinished");
        java.util.List list = com.p314xaae8f345.p3210x3857dc.w1.f302148a;
        by5.c4.f("XWebCoreContentProvider", "CachedInfoMgr process cached info");
        synchronized (com.p314xaae8f345.p3210x3857dc.w1.f302149b) {
            java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.p3210x3857dc.w1.f302148a).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3210x3857dc.x1 x1Var = (com.p314xaae8f345.p3210x3857dc.x1) it.next();
                by5.s0.t(x1Var.f302151a, x1Var.f302152b);
            }
            ((java.util.ArrayList) com.p314xaae8f345.p3210x3857dc.w1.f302148a).clear();
        }
        f301736e.set(true);
    }

    public static com.p314xaae8f345.p3210x3857dc.z1 e(android.net.Uri uri) {
        java.lang.String str;
        int i17;
        com.p314xaae8f345.p3210x3857dc.z1 z1Var = new com.p314xaae8f345.p3210x3857dc.z1();
        z1Var.f302176a = -1;
        java.lang.String uri2 = uri.toString();
        if (uri2.length() > 1000) {
            by5.c4.b("XWebCoreContentProvider", "parseUri exceed max length");
            return z1Var;
        }
        by5.c4.b("XWebCoreContentProvider", "parseUri ".concat(uri2));
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() < 2) {
            by5.c4.b("XWebCoreContentProvider", "parseUri strList invalid");
            return z1Var;
        }
        java.lang.String str2 = pathSegments.get(0);
        if (str2 == null || str2.isEmpty()) {
            by5.c4.b("XWebCoreContentProvider", "parseUri callerName invalid");
            return z1Var;
        }
        z1Var.f302177b = str2;
        try {
            int parseInt = java.lang.Integer.parseInt(pathSegments.get(1));
            if (parseInt == 1 || parseInt == 3) {
                if (pathSegments.size() == 2) {
                    z1Var.f302176a = parseInt;
                    by5.c4.b("XWebCoreContentProvider", "parseUri result: " + parseInt);
                } else {
                    by5.c4.b("XWebCoreContentProvider", "parseUri wrong params on test or report");
                }
                return z1Var;
            }
            if (parseInt != 2) {
                by5.c4.b("XWebCoreContentProvider", "parseUri invalid opType");
                return z1Var;
            }
            if (pathSegments.size() == 4) {
                str = pathSegments.get(3);
                try {
                    i17 = java.lang.Integer.parseInt(pathSegments.get(2));
                } catch (java.lang.Throwable th6) {
                    by5.c4.d("XWebCoreContentProvider", "parseUri error parse targetVersion, error", th6);
                }
                if (i17 != -1 || str == null || str.isEmpty()) {
                    by5.c4.b("XWebCoreContentProvider", "parseUri wrong params on get file");
                } else {
                    z1Var.f302176a = parseInt;
                    z1Var.f302178c = i17;
                    z1Var.f302179d = str;
                    by5.c4.b("XWebCoreContentProvider", "parseUri result: " + parseInt + " " + i17 + " " + str);
                }
                return z1Var;
            }
            str = "";
            i17 = -1;
            if (i17 != -1) {
            }
            by5.c4.b("XWebCoreContentProvider", "parseUri wrong params on get file");
            return z1Var;
        } catch (java.lang.Throwable th7) {
            by5.c4.d("XWebCoreContentProvider", "parseUri error parse opType, error", th7);
            return z1Var;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008e A[SYNTHETIC] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.net.Uri insert(android.net.Uri r7, android.content.ContentValues r8) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3210x3857dc.C27818xf002da6f.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01eb  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.ParcelFileDescriptor openFile(android.net.Uri r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3210x3857dc.C27818xf002da6f.openFile(android.net.Uri, java.lang.String):android.os.ParcelFileDescriptor");
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

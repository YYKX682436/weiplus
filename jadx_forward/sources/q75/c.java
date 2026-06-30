package q75;

/* loaded from: classes10.dex */
public abstract class c {
    public static java.lang.String a(java.lang.String str) {
        return d() + java.lang.String.format(java.util.Locale.US, "%s%d.%s", "mmexport", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str);
    }

    public static java.lang.String b(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT > 29) {
            return a(str);
        }
        return lp0.b.r() + java.lang.String.format(java.util.Locale.US, "%s%d.%s", "mmexport", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str);
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        try {
            str2 = new java.io.File(str).getCanonicalPath();
        } catch (java.lang.Throwable unused) {
            str2 = str;
        }
        int length = str2.startsWith(lp0.b.d0()) ? lp0.b.d0().length() : str2.startsWith(lp0.b.Y()) ? lp0.b.Y().length() : -1;
        if (length < 0) {
            return str;
        }
        java.lang.String substring = str.substring(length);
        return (substring.startsWith("/") ? "/sdcard" : "/sdcard/").concat(substring);
    }

    public static java.lang.String d() {
        java.lang.String m17 = lp0.b.m();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AndroidMediaUtil", "getSysCameraDirPath: " + m17);
        return m17;
    }

    public static java.lang.String e() {
        java.lang.String e07 = lp0.b.e0();
        java.lang.String absolutePath = e07.startsWith(lp0.b.d0()) ? new java.io.File(e07).getParentFile().getParentFile().getParentFile().getAbsolutePath() : lp0.b.Y();
        try {
            absolutePath = new java.io.File(absolutePath).getCanonicalPath();
        } catch (java.lang.Throwable unused) {
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(d(), true);
        int indexOf = i17.indexOf(absolutePath);
        if (indexOf < 0) {
            return i17;
        }
        java.lang.String substring = i17.substring(indexOf + absolutePath.length());
        return substring.startsWith("/") ? "/sdcard".concat(substring) : "/sdcard/".concat(substring);
    }

    public static void f(java.lang.String str, android.content.Context context) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
        if (i17 != null) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(i17);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null && m17.f294769f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AndroidMediaUtil", "refreshMediaScanner error for path isDirectory.%s", i17);
                return;
            }
            try {
                h(context, i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.AndroidMediaUtil", th6, "Cannot update media database", new java.lang.Object[0]);
            }
            try {
                context.sendBroadcast(new android.content.Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(context, new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(i17)))));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.AndroidMediaUtil", e17, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AndroidMediaUtil", "refreshing media scanner on path=%s", str);
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            context.sendBroadcast(new android.content.Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(context, new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)))).addFlags(1));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AndroidMediaUtil", "refreshing media scanner on path=%s", str);
        } else {
            try {
                android.media.MediaScannerConnection.scanFile(context.getApplicationContext(), new java.lang.String[]{i17}, new java.lang.String[]{q75.g.c(str)}, null);
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AndroidMediaUtil", "refresh by MediaScannerConnection, path = %s, thr = %s", str, th7);
            }
        }
    }

    public static void g(java.lang.String str, android.content.Context context) {
        ((ku5.t0) ku5.t0.f394148d).g(new q75.b(str, context));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[Catch: all -> 0x0185, TryCatch #2 {all -> 0x0185, blocks: (B:3:0x0005, B:7:0x000c, B:10:0x0024, B:17:0x0037, B:20:0x004b, B:22:0x0065, B:24:0x00c9, B:27:0x00d2, B:29:0x00d8, B:31:0x00de, B:32:0x00ec, B:34:0x00f2, B:36:0x00fa, B:38:0x010b, B:39:0x011e, B:40:0x00e1, B:42:0x00e7, B:43:0x00ea, B:47:0x0128, B:50:0x0135, B:52:0x013f, B:53:0x014e, B:56:0x015e, B:58:0x0159, B:60:0x006d, B:64:0x0084, B:65:0x0074, B:67:0x007c, B:73:0x0040, B:74:0x0043, B:70:0x0045, B:77:0x008c, B:79:0x0092, B:80:0x00c5), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(android.content.Context r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q75.c.h(android.content.Context, java.lang.String):void");
    }
}

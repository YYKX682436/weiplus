package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static r.a f274265a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C21001x5de75f9();

    public static android.net.Uri a(android.content.Context context, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        if (((java.lang.Boolean) f274265a.mo1850x58b836e(r6Var.o())).booleanValue()) {
            return b(context, r6Var);
        }
        throw new java.lang.IllegalArgumentException("Path cannot be exported: " + r6Var);
    }

    public static android.net.Uri b(android.content.Context context, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c && !c(r6Var.o())) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("WorkProfiles", com.p314xaae8f345.mm.sdk.p2603x2137b148.c7.c(context));
            linkedHashMap.put("DATA_ROOT", lp0.b.e());
            ap.a.a(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, "UriFile", new java.lang.Throwable(), linkedHashMap, "shareUnExportablePath", r6Var.o());
        }
        try {
            return com.p314xaae8f345.mm.vfs.C22768xca3066d0.m82352x706c42cf(context.getPackageName() + ".external.fileprovider", r6Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.VFSFileOp", e17.getMessage());
            return null;
        }
    }

    public static boolean c(java.lang.String str) {
        if (((java.lang.Boolean) f274265a.mo1850x58b836e(str)).booleanValue()) {
            return true;
        }
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        java.lang.String str2 = "/data/data/" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + "/";
        if (!str.startsWith(str2)) {
            return false;
        }
        return ((java.lang.Boolean) f274265a.mo1850x58b836e(str.replace(str2, lp0.b.X()))).booleanValue();
    }

    public static void d(android.content.Context context, android.content.Intent intent, android.net.Uri uri, java.lang.String str, boolean z17) {
        java.lang.String scheme = uri.getScheme();
        if (scheme == null || scheme.isEmpty() || scheme.equals("file") || scheme.equals("wcf")) {
            f(context, intent, new com.p314xaae8f345.mm.vfs.r6(uri.getPath()), str, z17);
            return;
        }
        intent.setDataAndType(uri, str);
        intent.addFlags(1);
        if (z17) {
            intent.addFlags(2);
        }
    }

    public static void e(android.content.Context context, android.content.Intent intent, com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, java.lang.String str2, boolean z17) {
        android.net.Uri b17 = b(context, r6Var);
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (b17 != null && !android.text.TextUtils.isEmpty(str)) {
            b17 = b17.buildUpon().appendQueryParameter("displayName", str).build();
        }
        intent.setDataAndType(b17, str2).addFlags(z17 ? 3 : 1);
    }

    public static void f(android.content.Context context, android.content.Intent intent, com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, boolean z17) {
        e(context, intent, r6Var, null, str, z17);
    }
}

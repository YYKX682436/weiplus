package p001xcca8366f.p003x91727fcf.v4.p006x38b73479;

@java.lang.Deprecated
/* renamed from: android.support.v4.content.FileProvider */
/* loaded from: classes12.dex */
public class C0031x835a77ad extends com.p314xaae8f345.mm.vfs.C22768xca3066d0 {

    /* renamed from: mFallback */
    private final p012xc85e97e9.p075x2eaf9f.p076x38b73479.C1088x835a77ad f63x525d4e6f = new p012xc85e97e9.p075x2eaf9f.p076x38b73479.C1088x835a77ad();

    /* renamed from: getOldUriActualPath */
    private static java.lang.String m2446x91b135ee(android.net.Uri uri) {
        java.lang.String path = uri.getPath();
        if (android.text.TextUtils.isEmpty(path)) {
            return null;
        }
        for (java.lang.String str : java.util.Arrays.asList("/root_path/", "/external/")) {
            if (path.startsWith(str)) {
                return "/" + path.substring(str.length());
            }
        }
        return null;
    }

    /* renamed from: getUriForFile */
    public static android.net.Uri m2447x706c42cf(android.content.Context context, java.lang.String str, java.io.File file) {
        try {
            return com.p314xaae8f345.mm.vfs.C22768xca3066d0.m82352x706c42cf(str, com.p314xaae8f345.mm.vfs.r6.j(file));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.VFSFileOp", e17.getMessage());
            return null;
        }
    }

    /* renamed from: isOldUri */
    private static boolean m2448xebb78b8f(android.net.Uri uri) {
        return !android.text.TextUtils.isEmpty(m2446x91b135ee(uri));
    }

    /* renamed from: simpleInjectionInspect */
    private static boolean m2449xe9ff430f(android.content.Context context, android.net.Uri uri) {
        java.lang.String path;
        java.lang.String str;
        if (uri == null || (path = uri.getPath()) == null || !path.startsWith("/root_path/")) {
            return true;
        }
        java.lang.String str2 = "/" + path.substring(11);
        java.lang.String str3 = "/" + context.getPackageName() + "/";
        if (!str2.contains(str3)) {
            return true;
        }
        java.lang.String substring = str2.substring(str2.indexOf(str3) + str3.length());
        if (!substring.contains("/")) {
            return false;
        }
        java.lang.String concat = "/".concat(substring);
        java.util.Iterator it = java.util.Arrays.asList("/shared_prefs/", "/databases/", "/files/mmkv/").iterator();
        while (it.hasNext()) {
            if (concat.startsWith((java.lang.String) it.next())) {
                return false;
            }
        }
        for (java.lang.String str4 : java.util.Arrays.asList("/MicroMsg/", "/WeChat/")) {
            if (concat.startsWith(str4)) {
                java.lang.String substring2 = concat.substring(str4.length());
                if (substring2.contains("/")) {
                    java.lang.String[] split = substring2.split("/");
                    if (split.length == 2 && (str = split[0]) != null && str.length() == 32) {
                        return false;
                    }
                } else {
                    continue;
                }
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.vfs.C22768xca3066d0, android.content.ContentProvider
    public void attachInfo(android.content.Context context, android.content.pm.ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        this.f63x525d4e6f.attachInfo(context, providerInfo);
    }

    @Override // com.p314xaae8f345.mm.vfs.C22768xca3066d0, android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return m2448xebb78b8f(uri) ? this.f63x525d4e6f.delete(uri, str, strArr) : super.delete(uri, str, strArr);
    }

    @Override // com.p314xaae8f345.mm.vfs.C22768xca3066d0, android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return m2448xebb78b8f(uri) ? this.f63x525d4e6f.getType(uri) : super.getType(uri);
    }

    @Override // com.p314xaae8f345.mm.vfs.C22768xca3066d0, android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        if (m2448xebb78b8f(uri)) {
            return this.f63x525d4e6f.insert(uri, contentValues);
        }
        super.insert(uri, contentValues);
        throw null;
    }

    @Override // com.p314xaae8f345.mm.vfs.C22768xca3066d0, android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) {
        java.lang.String m2446x91b135ee = m2446x91b135ee(uri);
        if (android.text.TextUtils.isEmpty(m2446x91b135ee)) {
            return super.openFile(uri, str);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.c(m2446x91b135ee)) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("WorkProfiles", com.p314xaae8f345.mm.sdk.p2603x2137b148.c7.c(getContext()));
            linkedHashMap.put("DATA_ROOT", lp0.b.e());
            ap.a.a(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, "UriFile", null, linkedHashMap, "openUnExportablePath", uri.toString(), m2446x91b135ee, getCallingPackage());
        }
        if (m2449xe9ff430f(getContext(), uri)) {
            return this.f63x525d4e6f.openFile(uri, str);
        }
        throw new java.lang.IllegalArgumentException("Illegal file-provider access: " + uri);
    }

    @Override // com.p314xaae8f345.mm.vfs.C22768xca3066d0, android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return m2448xebb78b8f(uri) ? this.f63x525d4e6f.query(uri, strArr, str, strArr2, str2) : super.query(uri, strArr, str, strArr2, str2);
    }

    @Override // com.p314xaae8f345.mm.vfs.C22768xca3066d0, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        if (m2448xebb78b8f(uri)) {
            return this.f63x525d4e6f.update(uri, contentValues, str, strArr);
        }
        super.update(uri, contentValues, str, strArr);
        throw null;
    }
}

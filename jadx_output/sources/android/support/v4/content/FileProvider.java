package android.support.v4.content;

@java.lang.Deprecated
/* loaded from: classes12.dex */
public class FileProvider extends com.tencent.mm.vfs.VFSFileProvider {
    private final androidx.core.content.FileProvider mFallback = new androidx.core.content.FileProvider();

    private static java.lang.String getOldUriActualPath(android.net.Uri uri) {
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

    public static android.net.Uri getUriForFile(android.content.Context context, java.lang.String str, java.io.File file) {
        try {
            return com.tencent.mm.vfs.VFSFileProvider.getUriForFile(str, com.tencent.mm.vfs.r6.j(file));
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.w("MicroMsg.VFSFileOp", e17.getMessage());
            return null;
        }
    }

    private static boolean isOldUri(android.net.Uri uri) {
        return !android.text.TextUtils.isEmpty(getOldUriActualPath(uri));
    }

    private static boolean simpleInjectionInspect(android.content.Context context, android.net.Uri uri) {
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

    @Override // com.tencent.mm.vfs.VFSFileProvider, android.content.ContentProvider
    public void attachInfo(android.content.Context context, android.content.pm.ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        this.mFallback.attachInfo(context, providerInfo);
    }

    @Override // com.tencent.mm.vfs.VFSFileProvider, android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return isOldUri(uri) ? this.mFallback.delete(uri, str, strArr) : super.delete(uri, str, strArr);
    }

    @Override // com.tencent.mm.vfs.VFSFileProvider, android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return isOldUri(uri) ? this.mFallback.getType(uri) : super.getType(uri);
    }

    @Override // com.tencent.mm.vfs.VFSFileProvider, android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        if (isOldUri(uri)) {
            return this.mFallback.insert(uri, contentValues);
        }
        super.insert(uri, contentValues);
        throw null;
    }

    @Override // com.tencent.mm.vfs.VFSFileProvider, android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) {
        java.lang.String oldUriActualPath = getOldUriActualPath(uri);
        if (android.text.TextUtils.isEmpty(oldUriActualPath)) {
            return super.openFile(uri, str);
        }
        if (!com.tencent.mm.sdk.platformtools.i1.c(oldUriActualPath)) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("WorkProfiles", com.tencent.mm.sdk.platformtools.c7.c(getContext()));
            linkedHashMap.put("DATA_ROOT", lp0.b.e());
            ap.a.a(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, "UriFile", null, linkedHashMap, "openUnExportablePath", uri.toString(), oldUriActualPath, getCallingPackage());
        }
        if (simpleInjectionInspect(getContext(), uri)) {
            return this.mFallback.openFile(uri, str);
        }
        throw new java.lang.IllegalArgumentException("Illegal file-provider access: " + uri);
    }

    @Override // com.tencent.mm.vfs.VFSFileProvider, android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return isOldUri(uri) ? this.mFallback.query(uri, strArr, str, strArr2, str2) : super.query(uri, strArr, str, strArr2, str2);
    }

    @Override // com.tencent.mm.vfs.VFSFileProvider, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        if (isOldUri(uri)) {
            return this.mFallback.update(uri, contentValues, str, strArr);
        }
        super.update(uri, contentValues, str, strArr);
        throw null;
    }
}

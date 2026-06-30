package androidx.core.content;

/* loaded from: classes12.dex */
public class FileProvider extends android.content.ContentProvider {
    private static final java.lang.String ATTR_NAME = "name";
    private static final java.lang.String ATTR_PATH = "path";
    private static final java.lang.String DISPLAYNAME_FIELD = "displayName";
    private static final java.lang.String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final java.lang.String TAG_CACHE_PATH = "cache-path";
    private static final java.lang.String TAG_EXTERNAL = "external-path";
    private static final java.lang.String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final java.lang.String TAG_EXTERNAL_FILES = "external-files-path";
    private static final java.lang.String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final java.lang.String TAG_FILES_PATH = "files-path";
    private static final java.lang.String TAG_ROOT_PATH = "root-path";
    private java.lang.String mAuthority;
    private b3.n mLocalPathStrategy;
    private int mResourceId;
    private static final java.lang.String[] COLUMNS = {"_display_name", "_size"};
    private static final java.io.File DEVICE_ROOT = new java.io.File("/");
    private static final java.util.HashMap<java.lang.String, b3.n> sCache = new java.util.HashMap<>();

    public FileProvider() {
        this.mResourceId = 0;
    }

    private static java.io.File buildPath(java.io.File file, java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (str != null) {
                file = new java.io.File(file, str);
            }
        }
        return file;
    }

    private static java.lang.String[] copyOf(java.lang.String[] strArr, int i17) {
        java.lang.String[] strArr2 = new java.lang.String[i17];
        java.lang.System.arraycopy(strArr, 0, strArr2, 0, i17);
        return strArr2;
    }

    public static android.content.res.XmlResourceParser getFileProviderPathsMetaData(android.content.Context context, java.lang.String str, android.content.pm.ProviderInfo providerInfo, int i17) {
        if (providerInfo == null) {
            throw new java.lang.IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i17 != 0) {
            android.os.Bundle bundle = new android.os.Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(META_DATA_FILE_PROVIDER_PATHS, i17);
        }
        android.content.res.XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new java.lang.IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    private b3.n getLocalPathStrategy() {
        b3.n nVar;
        synchronized (this) {
            if (this.mLocalPathStrategy == null) {
                this.mLocalPathStrategy = getPathStrategy(getContext(), this.mAuthority, this.mResourceId);
            }
            nVar = this.mLocalPathStrategy;
        }
        return nVar;
    }

    private static b3.n getPathStrategy(android.content.Context context, java.lang.String str, int i17) {
        b3.n nVar;
        java.util.HashMap<java.lang.String, b3.n> hashMap = sCache;
        synchronized (hashMap) {
            nVar = hashMap.get(str);
            if (nVar == null) {
                try {
                    try {
                        nVar = parsePathStrategy(context, str, i17);
                        hashMap.put(str, nVar);
                    } catch (org.xmlpull.v1.XmlPullParserException e17) {
                        throw new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e17);
                    }
                } catch (java.io.IOException e18) {
                    throw new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e18);
                }
            }
        }
        return nVar;
    }

    public static android.net.Uri getUriForFile(android.content.Context context, java.lang.String str, java.io.File file) {
        java.lang.String substring;
        b3.o oVar = (b3.o) getPathStrategy(context, str, 0);
        oVar.getClass();
        try {
            java.lang.String canonicalPath = file.getCanonicalPath();
            java.util.Map.Entry entry = null;
            for (java.util.Map.Entry entry2 : oVar.f17551b.entrySet()) {
                java.lang.String path = ((java.io.File) entry2.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((java.io.File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                java.lang.String path2 = ((java.io.File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    substring = canonicalPath.substring(path2.length());
                } else {
                    substring = canonicalPath.substring(path2.length() + 1);
                }
                return new android.net.Uri.Builder().scheme("content").authority(oVar.f17550a).encodedPath(android.net.Uri.encode((java.lang.String) entry.getKey()) + '/' + android.net.Uri.encode(substring, "/")).build();
            }
            throw new java.lang.IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    private static int modeToMode(java.lang.String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new java.lang.IllegalArgumentException("Invalid mode: " + str);
    }

    private static b3.n parsePathStrategy(android.content.Context context, java.lang.String str, int i17) {
        b3.o oVar = new b3.o(str);
        android.content.res.XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i17);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next == 1) {
                return oVar;
            }
            if (next == 2) {
                java.lang.String name = fileProviderPathsMetaData.getName();
                java.io.File file = null;
                java.lang.String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                java.lang.String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, "path");
                if (TAG_ROOT_PATH.equals(name)) {
                    file = DEVICE_ROOT;
                } else if (TAG_FILES_PATH.equals(name)) {
                    file = context.getFilesDir();
                } else if (TAG_CACHE_PATH.equals(name)) {
                    file = context.getCacheDir();
                } else if (TAG_EXTERNAL.equals(name)) {
                    file = android.os.Environment.getExternalStorageDirectory();
                } else if (TAG_EXTERNAL_FILES.equals(name)) {
                    java.io.File[] externalFilesDirs = b3.l.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    }
                } else if (TAG_EXTERNAL_CACHE.equals(name)) {
                    java.io.File[] externalCacheDirs = b3.l.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        file = externalCacheDirs[0];
                    }
                } else if (TAG_EXTERNAL_MEDIA.equals(name)) {
                    java.io.File[] a17 = b3.m.a(context);
                    if (a17.length > 0) {
                        file = a17[0];
                    }
                }
                if (file != null) {
                    java.io.File buildPath = buildPath(file, attributeValue2);
                    if (android.text.TextUtils.isEmpty(attributeValue)) {
                        throw new java.lang.IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        oVar.f17551b.put(attributeValue, buildPath.getCanonicalFile());
                    } catch (java.io.IOException e17) {
                        throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for " + buildPath, e17);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(android.content.Context context, android.content.pm.ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new java.lang.SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new java.lang.SecurityException("Provider must grant uri permissions");
        }
        this.mAuthority = providerInfo.authority.split(";")[0];
        java.util.HashMap<java.lang.String, b3.n> hashMap = sCache;
        synchronized (hashMap) {
            hashMap.remove(this.mAuthority);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return ((b3.o) getLocalPathStrategy()).a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        java.io.File a17 = ((b3.o) getLocalPathStrategy()).a(uri);
        int lastIndexOf = a17.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(a17.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public java.lang.String getTypeAnonymous(android.net.Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) {
        return android.os.ParcelFileDescriptor.open(((b3.o) getLocalPathStrategy()).a(uri), modeToMode(str));
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int i17;
        java.io.File a17 = ((b3.o) getLocalPathStrategy()).a(uri);
        java.lang.String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        java.lang.String[] strArr3 = new java.lang.String[strArr.length];
        java.lang.Object[] objArr = new java.lang.Object[strArr.length];
        int i18 = 0;
        for (java.lang.String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i18] = "_display_name";
                i17 = i18 + 1;
                objArr[i18] = queryParameter == null ? a17.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i18] = "_size";
                i17 = i18 + 1;
                objArr[i18] = java.lang.Long.valueOf(a17.length());
            }
            i18 = i17;
        }
        java.lang.String[] copyOf = copyOf(strArr3, i18);
        java.lang.Object[] copyOf2 = copyOf(objArr, i18);
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("No external updates");
    }

    public FileProvider(int i17) {
        this.mResourceId = i17;
    }

    private static java.lang.Object[] copyOf(java.lang.Object[] objArr, int i17) {
        java.lang.Object[] objArr2 = new java.lang.Object[i17];
        java.lang.System.arraycopy(objArr, 0, objArr2, 0, i17);
        return objArr2;
    }

    public static android.net.Uri getUriForFile(android.content.Context context, java.lang.String str, java.io.File file, java.lang.String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }
}

package p012xc85e97e9.p075x2eaf9f.p076x38b73479;

/* renamed from: androidx.core.content.FileProvider */
/* loaded from: classes12.dex */
public class C1088x835a77ad extends android.content.ContentProvider {

    /* renamed from: ATTR_NAME */
    private static final java.lang.String f2864xa81ae819 = "name";

    /* renamed from: ATTR_PATH */
    private static final java.lang.String f2865xa81bd1b3 = "path";

    /* renamed from: DISPLAYNAME_FIELD */
    private static final java.lang.String f2868x384eec48 = "displayName";

    /* renamed from: META_DATA_FILE_PROVIDER_PATHS */
    private static final java.lang.String f2869x2154c308 = "android.support.FILE_PROVIDER_PATHS";

    /* renamed from: TAG_CACHE_PATH */
    private static final java.lang.String f2870x2f94acc7 = "cache-path";

    /* renamed from: TAG_EXTERNAL */
    private static final java.lang.String f2871xdc3e8af0 = "external-path";

    /* renamed from: TAG_EXTERNAL_CACHE */
    private static final java.lang.String f2872x8f71b153 = "external-cache-path";

    /* renamed from: TAG_EXTERNAL_FILES */
    private static final java.lang.String f2873x8f9fbc48 = "external-files-path";

    /* renamed from: TAG_EXTERNAL_MEDIA */
    private static final java.lang.String f2874x900071b5 = "external-media-path";

    /* renamed from: TAG_FILES_PATH */
    private static final java.lang.String f2875xceb032f2 = "files-path";

    /* renamed from: TAG_ROOT_PATH */
    private static final java.lang.String f2876x9df386dd = "root-path";

    /* renamed from: mAuthority */
    private java.lang.String f2878xd2ab5156;

    /* renamed from: mLocalPathStrategy */
    private b3.n f2879x949e68d6;

    /* renamed from: mResourceId */
    private int f2880x8bfcfa16;

    /* renamed from: COLUMNS */
    private static final java.lang.String[] f2866x636723bd = {"_display_name", "_size"};

    /* renamed from: DEVICE_ROOT */
    private static final java.io.File f2867x261f252b = new java.io.File("/");

    /* renamed from: sCache */
    private static final java.util.HashMap<java.lang.String, b3.n> f2877xc81b0ecf = new java.util.HashMap<>();

    public C1088x835a77ad() {
        this.f2880x8bfcfa16 = 0;
    }

    /* renamed from: buildPath */
    private static java.io.File m7214xac7cb7b3(java.io.File file, java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (str != null) {
                file = new java.io.File(file, str);
            }
        }
        return file;
    }

    /* renamed from: copyOf */
    private static java.lang.String[] m7216xaf40b02c(java.lang.String[] strArr, int i17) {
        java.lang.String[] strArr2 = new java.lang.String[i17];
        java.lang.System.arraycopy(strArr, 0, strArr2, 0, i17);
        return strArr2;
    }

    /* renamed from: getFileProviderPathsMetaData */
    public static android.content.res.XmlResourceParser m7217xfe7f3d1a(android.content.Context context, java.lang.String str, android.content.pm.ProviderInfo providerInfo, int i17) {
        if (providerInfo == null) {
            throw new java.lang.IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i17 != 0) {
            android.os.Bundle bundle = new android.os.Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(f2869x2154c308, i17);
        }
        android.content.res.XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), f2869x2154c308);
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new java.lang.IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    /* renamed from: getLocalPathStrategy */
    private b3.n m7218x4af1690d() {
        b3.n nVar;
        synchronized (this) {
            if (this.f2879x949e68d6 == null) {
                this.f2879x949e68d6 = m7219x84d1092e(getContext(), this.f2878xd2ab5156, this.f2880x8bfcfa16);
            }
            nVar = this.f2879x949e68d6;
        }
        return nVar;
    }

    /* renamed from: getPathStrategy */
    private static b3.n m7219x84d1092e(android.content.Context context, java.lang.String str, int i17) {
        b3.n nVar;
        java.util.HashMap<java.lang.String, b3.n> hashMap = f2877xc81b0ecf;
        synchronized (hashMap) {
            nVar = hashMap.get(str);
            if (nVar == null) {
                try {
                    try {
                        nVar = m7223x8448710b(context, str, i17);
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

    /* renamed from: getUriForFile */
    public static android.net.Uri m7220x706c42cf(android.content.Context context, java.lang.String str, java.io.File file) {
        java.lang.String substring;
        b3.o oVar = (b3.o) m7219x84d1092e(context, str, 0);
        oVar.getClass();
        try {
            java.lang.String canonicalPath = file.getCanonicalPath();
            java.util.Map.Entry entry = null;
            for (java.util.Map.Entry entry2 : oVar.f99084b.entrySet()) {
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
                return new android.net.Uri.Builder().scheme("content").authority(oVar.f99083a).encodedPath(android.net.Uri.encode((java.lang.String) entry.getKey()) + '/' + android.net.Uri.encode(substring, "/")).build();
            }
            throw new java.lang.IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    /* renamed from: modeToMode */
    private static int m7222x55542641(java.lang.String str) {
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

    /* renamed from: parsePathStrategy */
    private static b3.n m7223x8448710b(android.content.Context context, java.lang.String str, int i17) {
        b3.o oVar = new b3.o(str);
        android.content.res.XmlResourceParser m7217xfe7f3d1a = m7217xfe7f3d1a(context, str, context.getPackageManager().resolveContentProvider(str, 128), i17);
        while (true) {
            int next = m7217xfe7f3d1a.next();
            if (next == 1) {
                return oVar;
            }
            if (next == 2) {
                java.lang.String name = m7217xfe7f3d1a.getName();
                java.io.File file = null;
                java.lang.String attributeValue = m7217xfe7f3d1a.getAttributeValue(null, "name");
                java.lang.String attributeValue2 = m7217xfe7f3d1a.getAttributeValue(null, "path");
                if (f2876x9df386dd.equals(name)) {
                    file = f2867x261f252b;
                } else if (f2875xceb032f2.equals(name)) {
                    file = context.getFilesDir();
                } else if (f2870x2f94acc7.equals(name)) {
                    file = context.getCacheDir();
                } else if (f2871xdc3e8af0.equals(name)) {
                    file = android.os.Environment.getExternalStorageDirectory();
                } else if (f2873x8f9fbc48.equals(name)) {
                    java.io.File[] m9709xded8805c = b3.l.m9709xded8805c(context, null);
                    if (m9709xded8805c.length > 0) {
                        file = m9709xded8805c[0];
                    }
                } else if (f2872x8f71b153.equals(name)) {
                    java.io.File[] m9708xb42f7e7 = b3.l.m9708xb42f7e7(context);
                    if (m9708xb42f7e7.length > 0) {
                        file = m9708xb42f7e7[0];
                    }
                } else if (f2874x900071b5.equals(name)) {
                    java.io.File[] a17 = b3.m.a(context);
                    if (a17.length > 0) {
                        file = a17[0];
                    }
                }
                if (file != null) {
                    java.io.File m7214xac7cb7b3 = m7214xac7cb7b3(file, attributeValue2);
                    if (android.text.TextUtils.isEmpty(attributeValue)) {
                        throw new java.lang.IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        oVar.f99084b.put(attributeValue, m7214xac7cb7b3.getCanonicalFile());
                    } catch (java.io.IOException e17) {
                        throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for " + m7214xac7cb7b3, e17);
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
        this.f2878xd2ab5156 = providerInfo.authority.split(";")[0];
        java.util.HashMap<java.lang.String, b3.n> hashMap = f2877xc81b0ecf;
        synchronized (hashMap) {
            hashMap.remove(this.f2878xd2ab5156);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return ((b3.o) m7218x4af1690d()).a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        java.io.File a17 = ((b3.o) m7218x4af1690d()).a(uri);
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
        return android.os.ParcelFileDescriptor.open(((b3.o) m7218x4af1690d()).a(uri), m7222x55542641(str));
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int i17;
        java.io.File a17 = ((b3.o) m7218x4af1690d()).a(uri);
        java.lang.String queryParameter = uri.getQueryParameter(f2868x384eec48);
        if (strArr == null) {
            strArr = f2866x636723bd;
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
        java.lang.String[] m7216xaf40b02c = m7216xaf40b02c(strArr3, i18);
        java.lang.Object[] m7215xaf40b02c = m7215xaf40b02c(objArr, i18);
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(m7216xaf40b02c, 1);
        matrixCursor.addRow(m7215xaf40b02c);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("No external updates");
    }

    public C1088x835a77ad(int i17) {
        this.f2880x8bfcfa16 = i17;
    }

    /* renamed from: copyOf */
    private static java.lang.Object[] m7215xaf40b02c(java.lang.Object[] objArr, int i17) {
        java.lang.Object[] objArr2 = new java.lang.Object[i17];
        java.lang.System.arraycopy(objArr, 0, objArr2, 0, i17);
        return objArr2;
    }

    /* renamed from: getUriForFile */
    public static android.net.Uri m7221x706c42cf(android.content.Context context, java.lang.String str, java.io.File file, java.lang.String str2) {
        return m7220x706c42cf(context, str, file).buildUpon().appendQueryParameter(f2868x384eec48, str2).build();
    }
}

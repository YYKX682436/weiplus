package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.VFSFileProvider */
/* loaded from: classes12.dex */
public class C22768xca3066d0 extends android.content.ContentProvider {

    /* renamed from: DISPLAYNAME_FIELD */
    private static final java.lang.String f39829x384eec48 = "displayName";

    /* renamed from: mAuthority */
    private java.lang.String f39831xd2ab5156;

    /* renamed from: COLUMNS */
    private static final java.lang.String[] f39828x636723bd = {"_display_name", "_size"};

    /* renamed from: PATH_SEPARATE */
    private static final java.util.regex.Pattern f39830x8e7221fd = java.util.regex.Pattern.compile("/");

    public static com.p314xaae8f345.mm.vfs.z7 a(android.net.Uri uri) {
        java.lang.String str;
        java.lang.String substring;
        java.lang.String str2;
        java.lang.String path = uri.getPath();
        if (path == null || path.isEmpty()) {
            return null;
        }
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        java.lang.String[] split = f39830x8e7221fd.split(path, 3);
        if (split.length < 2) {
            return null;
        }
        java.lang.String str3 = split[0];
        if (!str3.startsWith("@")) {
            str = "wcf";
            substring = path.substring(str3.length() + 1);
            str2 = str3;
        } else {
            if (split.length < 3) {
                return null;
            }
            str = str3.substring(1);
            str2 = split[1].equals("@") ? null : split[1];
            substring = split[2];
        }
        return new com.p314xaae8f345.mm.vfs.z7(str, str2, substring, null, null);
    }

    /* renamed from: getUriForFile */
    public static android.net.Uri m82353x706c42cf(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str2) {
        return m82352x706c42cf(str, r6Var).buildUpon().appendQueryParameter(f39829x384eec48, str2).build();
    }

    /* renamed from: vfsUriToContentUri */
    public static android.net.Uri m82354xedd95057(com.p314xaae8f345.mm.vfs.z7 z7Var, java.lang.String str) {
        java.lang.String sb6;
        java.lang.String str2 = z7Var.f294810d;
        if (str2 == null || str2.isEmpty() || str2.equals("file")) {
            return null;
        }
        boolean equals = str2.equals("wcf");
        java.lang.String str3 = z7Var.f294812f;
        java.lang.String str4 = z7Var.f294811e;
        if (equals) {
            sb6 = str4 + str3;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("@");
            sb7.append(str2);
            sb7.append('/');
            if (str4 == null || str4.isEmpty()) {
                str4 = "@";
            }
            sb7.append(str4);
            sb7.append(str3);
            sb6 = sb7.toString();
        }
        return new android.net.Uri.Builder().scheme("content").authority(str).path(sb6).build();
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
        this.f39831xd2ab5156 = providerInfo.authority;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        com.p314xaae8f345.mm.vfs.z7 a17 = a(uri);
        if (a17 == null) {
            throw new java.lang.IllegalArgumentException("No mapping found for " + uri);
        }
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        return (m17.a() && m17.f294799a.d(m17.f294800b)) ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        android.content.Context context;
        com.p314xaae8f345.mm.vfs.z7 a17 = a(uri);
        if (a17 == null) {
            throw new java.lang.IllegalArgumentException("No mapping found for " + uri);
        }
        java.lang.String str = a17.f294810d;
        if (str != null && str.equals("content") && (context = getContext()) != null) {
            return context.getContentResolver().getType(a17.h());
        }
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str3 = a17.f294812f;
        int lastIndexOf = str3.lastIndexOf("/");
        int lastIndexOf2 = (lastIndexOf < 0 ? str3 : str3.substring(lastIndexOf + 1)).lastIndexOf(46);
        if (lastIndexOf2 < 0) {
            return "application/octet-stream";
        }
        int lastIndexOf3 = str3.lastIndexOf("/");
        if (lastIndexOf3 >= 0) {
            str3 = str3.substring(lastIndexOf3 + 1);
        }
        java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(str3.substring(lastIndexOf2 + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
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
        com.p314xaae8f345.mm.vfs.z7 a17 = a(uri);
        if (a17 == null) {
            throw new java.io.FileNotFoundException("File not found: " + uri);
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            return m17.f294799a.x(m17.f294800b, str);
        }
        throw new java.io.FileNotFoundException("File not found: " + uri);
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int i17;
        com.p314xaae8f345.mm.vfs.x1 m17;
        java.lang.String str3;
        com.p314xaae8f345.mm.vfs.z7 a17 = a(uri);
        if (a17 == null) {
            throw new java.lang.IllegalArgumentException("No mapping found for " + uri);
        }
        java.lang.String queryParameter = uri.getQueryParameter(f39829x384eec48);
        java.lang.String str4 = a17.f294812f;
        if (str4 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        if (strArr == null) {
            strArr = f39828x636723bd;
        }
        java.lang.String[] strArr3 = new java.lang.String[strArr.length];
        java.lang.Object[] objArr = new java.lang.Object[strArr.length];
        com.p314xaae8f345.mm.vfs.z2 z2Var = null;
        int i18 = 0;
        for (java.lang.String str5 : strArr) {
            if ("_display_name".equals(str5)) {
                strArr3[i18] = "_display_name";
                i17 = i18 + 1;
                if (queryParameter == null) {
                    str3 = a17.f294812f;
                    int lastIndexOf = str3.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        str3 = str3.substring(lastIndexOf + 1);
                    }
                } else {
                    str3 = queryParameter;
                }
                objArr[i18] = str3;
            } else if ("_size".equals(str5)) {
                strArr3[i18] = "_size";
                i17 = i18 + 1;
                z2Var = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, z2Var);
                long j17 = 0;
                if (z2Var.a() && (m17 = z2Var.f294799a.m(z2Var.f294800b)) != null) {
                    j17 = m17.f294766c;
                }
                objArr[i18] = java.lang.Long.valueOf(j17);
            }
            i18 = i17;
        }
        java.lang.String[] strArr4 = (java.lang.String[]) java.util.Arrays.copyOf(strArr3, i18);
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, i18);
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(strArr4, 1);
        matrixCursor.addRow(copyOf);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("No external updates");
    }

    /* renamed from: getUriForFile */
    public static android.net.Uri m82352x706c42cf(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        com.p314xaae8f345.mm.vfs.z7 z7Var = r6Var.f294699d;
        com.p314xaae8f345.mm.vfs.z7 d17 = com.p314xaae8f345.mm.vfs.a3.f294314a.d(z7Var);
        if (d17 != null) {
            android.net.Uri m82354xedd95057 = m82354xedd95057(d17, str);
            if (m82354xedd95057 != null) {
                return m82354xedd95057;
            }
            throw new java.lang.IllegalArgumentException("Cannot convert export URI to content URI: " + d17);
        }
        throw new java.lang.IllegalArgumentException("Cannot get URI for export: " + z7Var);
    }
}

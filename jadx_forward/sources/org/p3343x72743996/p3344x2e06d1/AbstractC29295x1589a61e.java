package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.ContentUriUtils */
/* loaded from: classes12.dex */
public abstract class AbstractC29295x1589a61e {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73246x7118e671 = false;
    private static final java.lang.String TAG = "ContentUriUtils";

    /* renamed from: sFileProviderUtil */
    private static org.p3343x72743996.p3344x2e06d1.AbstractC29295x1589a61e.FileProviderUtil f73247x1943f7c2;

    /* renamed from: sLock */
    private static final java.lang.Object f73248x678c83e = new java.lang.Object();

    /* renamed from: org.chromium.base.ContentUriUtils$FileProviderUtil */
    /* loaded from: classes12.dex */
    public interface FileProviderUtil {
        /* renamed from: getContentUriFromFile */
        android.net.Uri m152343x8d2d198f(java.io.File file);
    }

    private AbstractC29295x1589a61e() {
    }

    /* renamed from: contentUriExists */
    public static boolean m152330xb2d1c86f(java.lang.String str) {
        android.content.res.AssetFileDescriptor m152332x6354a9e5 = m152332x6354a9e5(str);
        boolean z17 = m152332x6354a9e5 != null;
        if (m152332x6354a9e5 != null) {
            try {
                m152332x6354a9e5.close();
            } catch (java.io.IOException unused) {
            }
        }
        return z17;
    }

    /* renamed from: delete */
    public static boolean m152331xb06685ab(java.lang.String str) {
        return org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getContentResolver().delete(android.net.Uri.parse(str), null, null) > 0;
    }

    /* renamed from: getAssetFileDescriptor */
    private static android.content.res.AssetFileDescriptor m152332x6354a9e5(java.lang.String str) {
        android.content.ContentResolver contentResolver = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getContentResolver();
        android.net.Uri parse = android.net.Uri.parse(str);
        try {
            if (m152339x51278abc(parse)) {
                java.lang.String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
                if (streamTypes != null && streamTypes.length > 0) {
                    android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(parse, streamTypes[0], null);
                    if (openTypedAssetFileDescriptor == null || openTypedAssetFileDescriptor.getStartOffset() == 0) {
                        return openTypedAssetFileDescriptor;
                    }
                    try {
                        openTypedAssetFileDescriptor.close();
                    } catch (java.io.IOException unused) {
                    }
                    throw new java.lang.SecurityException("Cannot open files with non-zero offset type.");
                }
            } else {
                android.os.ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor != null) {
                    return new android.content.res.AssetFileDescriptor(openFileDescriptor, 0L, -1L);
                }
            }
        } catch (java.lang.Exception e17) {
            org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "Cannot open content uri: %s", str, e17);
        }
        return null;
    }

    /* renamed from: getContentUriFromFile */
    public static android.net.Uri m152333x8d2d198f(java.io.File file) {
        synchronized (f73248x678c83e) {
            org.p3343x72743996.p3344x2e06d1.AbstractC29295x1589a61e.FileProviderUtil fileProviderUtil = f73247x1943f7c2;
            if (fileProviderUtil == null) {
                return null;
            }
            return fileProviderUtil.m152343x8d2d198f(file);
        }
    }

    /* renamed from: getContentUriFromFilePath */
    public static java.lang.String m152334x96fd9254(java.lang.String str) {
        try {
            android.net.Uri m152333x8d2d198f = m152333x8d2d198f(new java.io.File(str));
            if (m152333x8d2d198f != null) {
                return m152333x8d2d198f.toString();
            }
            return null;
        } catch (java.lang.IllegalArgumentException e17) {
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Cannot retrieve content uri from file: %s", str, e17);
            return null;
        }
    }

    /* renamed from: getDisplayName */
    public static java.lang.String m152335x40021d37(android.net.Uri uri, android.content.Context context, java.lang.String str) {
        java.lang.String[] streamTypes;
        java.lang.String extensionFromMimeType;
        if (uri == null) {
            return "";
        }
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            android.database.Cursor query = contentResolver.query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() >= 1) {
                        query.moveToFirst();
                        int columnIndex = query.getColumnIndex(str);
                        if (columnIndex == -1) {
                            query.close();
                            return "";
                        }
                        java.lang.String string = query.getString(columnIndex);
                        if (m152337xbed4661d(query) && (streamTypes = contentResolver.getStreamTypes(uri, "*/*")) != null && streamTypes.length > 0 && (extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(streamTypes[0])) != null) {
                            string = string + "." + extensionFromMimeType;
                        }
                        query.close();
                        return string;
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (java.lang.NullPointerException unused) {
        }
        return "";
    }

    /* renamed from: getMimeType */
    public static java.lang.String m152336x28e02b04(java.lang.String str) {
        android.content.ContentResolver contentResolver = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getContentResolver();
        android.net.Uri parse = android.net.Uri.parse(str);
        if (!m152339x51278abc(parse)) {
            return contentResolver.getType(parse);
        }
        java.lang.String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
        if (streamTypes == null || streamTypes.length <= 0) {
            return null;
        }
        return streamTypes[0];
    }

    /* renamed from: hasVirtualFlag */
    private static boolean m152337xbed4661d(android.database.Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("flags");
        return columnIndex > -1 && (cursor.getLong(columnIndex) & 512) != 0;
    }

    /* renamed from: isContentUri */
    public static boolean m152338x912f96fd(java.lang.String str) {
        android.net.Uri parse;
        return (str == null || (parse = android.net.Uri.parse(str)) == null || !"content".equals(parse.getScheme())) ? false : true;
    }

    /* renamed from: isVirtualDocument */
    private static boolean m152339x51278abc(android.net.Uri uri) {
        if (uri == null || !android.provider.DocumentsContract.isDocumentUri(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), uri)) {
            return false;
        }
        try {
            android.database.Cursor query = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() >= 1) {
                        query.moveToFirst();
                        boolean m152337xbed4661d = m152337xbed4661d(query);
                        query.close();
                        return m152337xbed4661d;
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (java.lang.NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: maybeGetDisplayName */
    public static java.lang.String m152340xfeccffbf(java.lang.String str) {
        try {
            java.lang.String m152335x40021d37 = m152335x40021d37(android.net.Uri.parse(str), org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), "_display_name");
            if (android.text.TextUtils.isEmpty(m152335x40021d37)) {
                return null;
            }
            return m152335x40021d37;
        } catch (java.lang.Exception e17) {
            org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "Cannot open content uri: %s", str, e17);
            return null;
        }
    }

    /* renamed from: openContentUriForRead */
    public static int m152341x202db322(java.lang.String str) {
        android.content.res.AssetFileDescriptor m152332x6354a9e5 = m152332x6354a9e5(str);
        if (m152332x6354a9e5 != null) {
            return m152332x6354a9e5.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }

    /* renamed from: setFileProviderUtil */
    public static void m152342x5b05f5b1(org.p3343x72743996.p3344x2e06d1.AbstractC29295x1589a61e.FileProviderUtil fileProviderUtil) {
        synchronized (f73248x678c83e) {
            f73247x1943f7c2 = fileProviderUtil;
        }
    }
}

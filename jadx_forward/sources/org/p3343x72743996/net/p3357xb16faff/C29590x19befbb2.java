package org.p3343x72743996.net.p3357xb16faff;

/* renamed from: org.chromium.net.httpflags.HttpFlagsLoader */
/* loaded from: classes13.dex */
public final class C29590x19befbb2 {

    /* renamed from: FLAGS_FILE_DIR_NAME */
    static final java.lang.String f74436x4f4216a8 = "app_httpflags";

    /* renamed from: FLAGS_FILE_NAME */
    static final java.lang.String f74437x982aa796 = "flags.binarypb";

    /* renamed from: FLAGS_FILE_PROVIDER_INTENT_ACTION */
    static final java.lang.String f74438xe9ed93b6 = "android.net.http.FLAGS_FILE_PROVIDER";
    private static final java.lang.String TAG = "HttpFlagsLoader";

    private C29590x19befbb2() {
    }

    /* renamed from: getFlagsFileFromProvider */
    private static java.io.File m153985x33fc3e48(android.content.Context context, android.content.pm.ApplicationInfo applicationInfo) {
        return new java.io.File(new java.io.File(new java.io.File(applicationInfo.deviceProtectedDataDir), f74436x4f4216a8), f74437x982aa796);
    }

    /* renamed from: getProviderApplicationInfo */
    private static android.content.pm.ApplicationInfo m153986x4c3a0fb7(android.content.Context context) {
        android.content.pm.ResolveInfo resolveService = context.getPackageManager().resolveService(new android.content.Intent(f74438xe9ed93b6), 1048576);
        if (resolveService != null) {
            return resolveService.serviceInfo.applicationInfo;
        }
        org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "Unable to resolve the HTTP flags file provider package. This is expected if the host system is not set up to provide HTTP flags.");
        return null;
    }

    /* renamed from: load */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153987x32c4e6(android.content.Context context) {
        if (!org.p3343x72743996.net.p3358x316220.C29605x3f4fad2c.m154129x3a7f6ef6(context)) {
            org.p3343x72743996.p3344x2e06d1.Log.d(TAG, "Not loading HTTP flags because they are disabled in the manifest", new java.lang.Object[0]);
            return null;
        }
        try {
            android.content.pm.ApplicationInfo m153986x4c3a0fb7 = m153986x4c3a0fb7(context);
            if (m153986x4c3a0fb7 == null) {
                return null;
            }
            org.p3343x72743996.p3344x2e06d1.Log.d(TAG, "Found application exporting HTTP flags: %s", m153986x4c3a0fb7.packageName);
            java.io.File m153985x33fc3e48 = m153985x33fc3e48(context, m153986x4c3a0fb7);
            org.p3343x72743996.p3344x2e06d1.Log.d(TAG, "HTTP flags file path: %s", m153985x33fc3e48.getAbsolutePath());
            org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153988xebd03a5d = m153988xebd03a5d(m153985x33fc3e48);
            if (m153988xebd03a5d == null) {
                return null;
            }
            org.p3343x72743996.p3344x2e06d1.Log.d(TAG, "Successfully loaded HTTP flags: %s", m153988xebd03a5d);
            return m153988xebd03a5d;
        } catch (java.lang.RuntimeException e17) {
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Unable to load HTTP flags file", (java.lang.Throwable) e17);
            return null;
        }
    }

    /* renamed from: loadFlagsFile */
    private static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153988xebd03a5d(java.io.File file) {
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153959x4a829d50 = org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.m153959x4a829d50(fileInputStream);
                fileInputStream.close();
                return m153959x4a829d50;
            } catch (java.lang.Throwable th6) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } catch (java.io.FileNotFoundException unused) {
            org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "HTTP flags file `%s` is missing. This is expected if HTTP flags functionality is currently disabled in the host system.", file.getPath());
            return null;
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException("Unable to read HTTP flags file", e17);
        }
    }
}

package c8;

/* loaded from: classes12.dex */
public class b implements c8.d {
    public final void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public final c8.a b(android.content.Context context, java.lang.String[] strArr, java.lang.String str, c8.h hVar) {
        java.lang.String[] d17 = d(context);
        int length = d17.length;
        int i17 = 0;
        while (true) {
            java.util.zip.ZipFile zipFile = null;
            if (i17 >= length) {
                return null;
            }
            java.lang.String str2 = d17[i17];
            int i18 = 0;
            while (true) {
                int i19 = i18 + 1;
                if (i18 >= 5) {
                    break;
                }
                try {
                    zipFile = new java.util.zip.ZipFile(new java.io.File(str2), 1);
                    break;
                } catch (java.io.IOException unused) {
                    i18 = i19;
                }
            }
            if (zipFile != null) {
                int i27 = 0;
                while (true) {
                    int i28 = i27 + 1;
                    if (i27 < 5) {
                        for (java.lang.String str3 : strArr) {
                            java.lang.String str4 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428 + java.io.File.separatorChar + str3 + java.io.File.separatorChar + str;
                            hVar.c("Looking for %s in APK %s...", str4, str2);
                            java.util.zip.ZipEntry entry = zipFile.getEntry(str4);
                            if (entry != null) {
                                return new c8.a(zipFile, entry);
                            }
                        }
                        i27 = i28;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (java.io.IOException unused2) {
                        }
                    }
                }
            }
            i17++;
        }
    }

    public final java.lang.String[] c(android.content.Context context, java.lang.String str) {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428 + java.io.File.separatorChar + "([^\\" + java.io.File.separatorChar + "]*)" + java.io.File.separatorChar + str);
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str2 : d(context)) {
            try {
                java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = new java.util.zip.ZipFile(new java.io.File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    java.util.regex.Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (java.io.IOException unused) {
            }
        }
        return (java.lang.String[]) hashSet.toArray(new java.lang.String[hashSet.size()]);
    }

    public final java.lang.String[] d(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        java.lang.String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new java.lang.String[]{applicationInfo.sourceDir};
        }
        java.lang.String[] strArr2 = new java.lang.String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        java.lang.System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}

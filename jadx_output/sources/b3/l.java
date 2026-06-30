package b3;

/* loaded from: classes13.dex */
public abstract class l {
    private static final java.lang.String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final java.lang.String TAG = "ContextCompat";
    private static final java.lang.Object sLock = new java.lang.Object();
    private static final java.lang.Object sSync = new java.lang.Object();
    private static android.util.TypedValue sTempValue;
    private byte _hellAccFlag_;

    public static int checkSelfPermission(android.content.Context context, java.lang.String str) {
        if (str != null) {
            return (android.os.Build.VERSION.SDK_INT >= 33 || !android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid()) : new z2.n1(context).a() ? 0 : -1;
        }
        throw new java.lang.NullPointerException("permission must be non-null");
    }

    public static android.content.Context createDeviceProtectedStorageContext(android.content.Context context) {
        return b3.g.a(context);
    }

    public static java.lang.String getAttributionTag(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return b3.j.a(context);
        }
        return null;
    }

    public static java.io.File getCodeCacheDir(android.content.Context context) {
        return b3.e.a(context);
    }

    public static int getColor(android.content.Context context, int i17) {
        return b3.f.a(context, i17);
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, int i17) {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        d3.n nVar;
        android.content.res.Resources resources = context.getResources();
        android.content.res.Resources.Theme theme = context.getTheme();
        d3.o oVar = new d3.o(resources, theme);
        synchronized (d3.q.f226110c) {
            android.util.SparseArray sparseArray = (android.util.SparseArray) d3.q.f226109b.get(oVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (nVar = (d3.n) sparseArray.get(i17)) != null) {
                if (!nVar.f226100b.equals(resources.getConfiguration()) || (!(theme == null && nVar.f226101c == 0) && (theme == null || nVar.f226101c != theme.hashCode()))) {
                    sparseArray.remove(i17);
                } else {
                    colorStateList2 = nVar.f226099a;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        java.lang.ThreadLocal threadLocal = d3.q.f226108a;
        android.util.TypedValue typedValue = (android.util.TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new android.util.TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i17, typedValue, true);
        int i18 = typedValue.type;
        if (!(i18 >= 28 && i18 <= 31)) {
            try {
                colorStateList = d3.c.a(resources, resources.getXml(i17), theme);
            } catch (java.lang.Exception unused) {
            }
        }
        if (colorStateList == null) {
            return d3.m.b(resources, i17, theme);
        }
        synchronized (d3.q.f226110c) {
            java.util.WeakHashMap weakHashMap = d3.q.f226109b;
            android.util.SparseArray sparseArray2 = (android.util.SparseArray) weakHashMap.get(oVar);
            if (sparseArray2 == null) {
                sparseArray2 = new android.util.SparseArray();
                weakHashMap.put(oVar, sparseArray2);
            }
            sparseArray2.append(i17, new d3.n(colorStateList, oVar.f226102a.getConfiguration(), theme));
        }
        return colorStateList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        if (r2 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006f, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005c, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x006d, code lost:
    
        if (r2 != null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Context getContextForLanguage(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L22
            java.lang.String r0 = "locale"
            java.lang.Object r0 = r8.getSystemService(r0)
            if (r0 == 0) goto L1e
            android.os.LocaleList r0 = z2.a0.a(r0)
            j3.n r1 = new j3.n
            j3.p r2 = new j3.p
            r2.<init>(r0)
            r1.<init>(r2)
            goto Lb2
        L1e:
            j3.n r1 = j3.n.f297338b
            goto Lb2
        L22:
            java.lang.Object r0 = z2.o.f469506a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.io.FileNotFoundException -> L80 java.lang.Throwable -> Ld9
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6d
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6d
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6d
        L3a:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6d
            r6 = 1
            if (r5 == r6) goto L63
            r6 = 3
            if (r5 != r6) goto L4a
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6d
            if (r7 <= r4) goto L63
        L4a:
            if (r5 == r6) goto L3a
            r6 = 4
            if (r5 != r6) goto L50
            goto L3a
        L50:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6d
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6d
            if (r5 == 0) goto L3a
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6d
        L63:
            if (r2 == 0) goto L72
            goto L6f
        L66:
            r8 = move-exception
            if (r2 == 0) goto L6c
            r2.close()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> Ld9
        L6c:
            throw r8     // Catch: java.lang.Throwable -> Ld9
        L6d:
            if (r2 == 0) goto L72
        L6f:
            r2.close()     // Catch: java.io.IOException -> L72 java.lang.Throwable -> Ld9
        L72:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Ld9
            if (r2 != 0) goto L79
            goto L7e
        L79:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> Ld9
        L7e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld9
            goto L81
        L80:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld9
        L81:
            j3.n r0 = j3.n.f297338b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8c
            j3.n r1 = j3.n.f297338b
            goto Lb2
        L8c:
            java.lang.String r0 = ","
            r2 = -1
            java.lang.String[] r0 = r1.split(r0, r2)
            int r1 = r0.length
            java.util.Locale[] r2 = new java.util.Locale[r1]
            r3 = 0
        L97:
            if (r3 >= r1) goto La4
            r4 = r0[r3]
            java.util.Locale r4 = j3.l.a(r4)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L97
        La4:
            android.os.LocaleList r0 = j3.m.a(r2)
            j3.n r1 = new j3.n
            j3.p r2 = new j3.p
            r2.<init>(r0)
            r1.<init>(r2)
        Lb2:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 32
            if (r0 > r2) goto Ld8
            j3.o r0 = r1.f297339a
            j3.p r0 = (j3.p) r0
            android.os.LocaleList r0 = r0.f297340a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld8
            android.content.res.Configuration r0 = new android.content.res.Configuration
            android.content.res.Resources r2 = r8.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            r0.<init>(r2)
            j3.i.b(r0, r1)
            android.content.Context r8 = b3.c.a(r8, r0)
        Ld8:
            return r8
        Ld9:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld9
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.l.getContextForLanguage(android.content.Context):android.content.Context");
    }

    public static java.io.File getDataDir(android.content.Context context) {
        return b3.g.b(context);
    }

    public static android.view.Display getDisplayOrDefault(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 30 ? b3.j.b(context) : ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i17) {
        return b3.e.b(context, i17);
    }

    public static java.io.File[] getExternalCacheDirs(android.content.Context context) {
        return b3.d.a(context);
    }

    public static java.io.File[] getExternalFilesDirs(android.content.Context context, java.lang.String str) {
        return b3.d.b(context, str);
    }

    public static java.util.concurrent.Executor getMainExecutor(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? b3.i.a(context) : new j3.j(new android.os.Handler(context.getMainLooper()));
    }

    public static java.io.File getNoBackupFilesDir(android.content.Context context) {
        return b3.e.c(context);
    }

    public static java.io.File[] getObbDirs(android.content.Context context) {
        return b3.d.c(context);
    }

    public static java.lang.String getString(android.content.Context context, int i17) {
        return getContextForLanguage(context).getString(i17);
    }

    public static <T> T getSystemService(android.content.Context context, java.lang.Class<T> cls) {
        return (T) b3.f.b(context, cls);
    }

    public static java.lang.String getSystemServiceName(android.content.Context context, java.lang.Class<?> cls) {
        return b3.f.c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(android.content.Context context) {
        return b3.g.c(context);
    }

    public static java.lang.String obtainAndCheckReceiverPermission(android.content.Context context) {
        java.lang.String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (b3.r.b(context, str) == 0) {
            return str;
        }
        throw new java.lang.RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static android.content.Intent registerReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, int i17) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i17);
    }

    public static boolean startActivities(android.content.Context context, android.content.Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
        b3.b.b(context, intent, bundle);
    }

    public static void startForegroundService(android.content.Context context, android.content.Intent intent) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            b3.h.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static android.content.Intent registerReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i17) {
        int i18 = i17 & 1;
        if (i18 != 0 && (i17 & 4) != 0) {
            throw new java.lang.IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i18 != 0) {
            i17 |= 2;
        }
        int i19 = i17;
        int i27 = i19 & 2;
        if (i27 == 0 && (i19 & 4) == 0) {
            throw new java.lang.IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i27 != 0 && (i19 & 4) != 0) {
            throw new java.lang.IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i28 = android.os.Build.VERSION.SDK_INT;
        if (i28 >= 33) {
            return b3.k.a(context, broadcastReceiver, intentFilter, str, handler, i19);
        }
        if (i28 >= 26) {
            return b3.h.a(context, broadcastReceiver, intentFilter, str, handler, i19);
        }
        if ((i19 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static boolean startActivities(android.content.Context context, android.content.Intent[] intentArr, android.os.Bundle bundle) {
        b3.b.a(context, intentArr, bundle);
        return true;
    }
}

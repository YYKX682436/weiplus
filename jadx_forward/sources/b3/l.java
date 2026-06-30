package b3;

/* loaded from: classes13.dex */
public abstract class l {

    /* renamed from: DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX */
    private static final java.lang.String f4150x92951b11 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";

    /* renamed from: RECEIVER_EXPORTED */
    public static final int f4151xc36107a3 = 2;

    /* renamed from: RECEIVER_NOT_EXPORTED */
    public static final int f4152x55d03baf = 4;

    /* renamed from: RECEIVER_VISIBLE_TO_INSTANT_APPS */
    public static final int f4153x48bfe937 = 1;
    private static final java.lang.String TAG = "ContextCompat";

    /* renamed from: sLock */
    private static final java.lang.Object f4154x678c83e = new java.lang.Object();

    /* renamed from: sSync */
    private static final java.lang.Object f4155x67c1dae = new java.lang.Object();

    /* renamed from: sTempValue */
    private static android.util.TypedValue f4156xa95892ca;

    /* renamed from: _hellAccFlag_ */
    private byte f4157x7f11beae;

    /* renamed from: checkSelfPermission */
    public static int m9698x3fed0563(android.content.Context context, java.lang.String str) {
        if (str != null) {
            return (android.os.Build.VERSION.SDK_INT >= 33 || !android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid()) : new z2.n1(context).a() ? 0 : -1;
        }
        throw new java.lang.NullPointerException("permission must be non-null");
    }

    /* renamed from: createDeviceProtectedStorageContext */
    public static android.content.Context m9699xc24ec330(android.content.Context context) {
        return b3.g.a(context);
    }

    /* renamed from: getAttributionTag */
    public static java.lang.String m9700x81613f91(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return b3.j.a(context);
        }
        return null;
    }

    /* renamed from: getCodeCacheDir */
    public static java.io.File m9701xbf827d2e(android.content.Context context) {
        return b3.e.a(context);
    }

    /* renamed from: getColor */
    public static int m9702x7444d5ad(android.content.Context context, int i17) {
        return b3.f.a(context, i17);
    }

    /* renamed from: getColorStateList */
    public static android.content.res.ColorStateList m9703x441695a2(android.content.Context context, int i17) {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        d3.n nVar;
        android.content.res.Resources resources = context.getResources();
        android.content.res.Resources.Theme theme = context.getTheme();
        d3.o oVar = new d3.o(resources, theme);
        synchronized (d3.q.f307643c) {
            android.util.SparseArray sparseArray = (android.util.SparseArray) d3.q.f307642b.get(oVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (nVar = (d3.n) sparseArray.get(i17)) != null) {
                if (!nVar.f307633b.equals(resources.getConfiguration()) || (!(theme == null && nVar.f307634c == 0) && (theme == null || nVar.f307634c != theme.hashCode()))) {
                    sparseArray.remove(i17);
                } else {
                    colorStateList2 = nVar.f307632a;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        java.lang.ThreadLocal threadLocal = d3.q.f307641a;
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
        synchronized (d3.q.f307643c) {
            java.util.WeakHashMap weakHashMap = d3.q.f307642b;
            android.util.SparseArray sparseArray2 = (android.util.SparseArray) weakHashMap.get(oVar);
            if (sparseArray2 == null) {
                sparseArray2 = new android.util.SparseArray();
                weakHashMap.put(oVar, sparseArray2);
            }
            sparseArray2.append(i17, new d3.n(colorStateList, oVar.f307635a.getConfiguration(), theme));
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
    /* renamed from: getContextForLanguage */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Context m9704x68796c08(android.content.Context r8) {
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
            j3.n r1 = j3.n.f378871b
            goto Lb2
        L22:
            java.lang.Object r0 = z2.o.f551039a
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
            j3.n r0 = j3.n.f378871b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8c
            j3.n r1 = j3.n.f378871b
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
            j3.o r0 = r1.f378872a
            j3.p r0 = (j3.p) r0
            android.os.LocaleList r0 = r0.f378873a
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
        throw new UnsupportedOperationException("Method not decompiled: b3.l.m9704x68796c08(android.content.Context):android.content.Context");
    }

    /* renamed from: getDataDir */
    public static java.io.File m9705x93d2404d(android.content.Context context) {
        return b3.g.b(context);
    }

    /* renamed from: getDisplayOrDefault */
    public static android.view.Display m9706x52c6b3b2(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 30 ? b3.j.b(context) : ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* renamed from: getDrawable */
    public static android.graphics.drawable.Drawable m9707x4a96be14(android.content.Context context, int i17) {
        return b3.e.b(context, i17);
    }

    /* renamed from: getExternalCacheDirs */
    public static java.io.File[] m9708xb42f7e7(android.content.Context context) {
        return b3.d.a(context);
    }

    /* renamed from: getExternalFilesDirs */
    public static java.io.File[] m9709xded8805c(android.content.Context context, java.lang.String str) {
        return b3.d.b(context, str);
    }

    /* renamed from: getMainExecutor */
    public static java.util.concurrent.Executor m9710x77652c22(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? b3.i.a(context) : new j3.j(new android.os.Handler(context.getMainLooper()));
    }

    /* renamed from: getNoBackupFilesDir */
    public static java.io.File m9711xb657be0f(android.content.Context context) {
        return b3.e.c(context);
    }

    /* renamed from: getObbDirs */
    public static java.io.File[] m9712xda615adf(android.content.Context context) {
        return b3.d.c(context);
    }

    /* renamed from: getString */
    public static java.lang.String m9713x2fec8307(android.content.Context context, int i17) {
        return m9704x68796c08(context).getString(i17);
    }

    /* renamed from: getSystemService */
    public static <T> T m9714xac92a5d0(android.content.Context context, java.lang.Class<T> cls) {
        return (T) b3.f.b(context, cls);
    }

    /* renamed from: getSystemServiceName */
    public static java.lang.String m9715x34502c7b(android.content.Context context, java.lang.Class<?> cls) {
        return b3.f.c(context, cls);
    }

    /* renamed from: isDeviceProtectedStorage */
    public static boolean m9716x3434a32d(android.content.Context context) {
        return b3.g.c(context);
    }

    /* renamed from: obtainAndCheckReceiverPermission */
    public static java.lang.String m9717x6f1760f4(android.content.Context context) {
        java.lang.String str = context.getPackageName() + f4150x92951b11;
        if (b3.r.b(context, str) == 0) {
            return str;
        }
        throw new java.lang.RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    /* renamed from: registerReceiver */
    public static android.content.Intent m9718xc20729b2(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, int i17) {
        return m9719xc20729b2(context, broadcastReceiver, intentFilter, null, null, i17);
    }

    /* renamed from: startActivities */
    public static boolean m9720xeb5f49ef(android.content.Context context, android.content.Intent[] intentArr) {
        return m9721xeb5f49ef(context, intentArr, null);
    }

    /* renamed from: startActivity */
    public static void m9722xa4df9991(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
        b3.b.b(context, intent, bundle);
    }

    /* renamed from: startForegroundService */
    public static void m9723x47fd1fb0(android.content.Context context, android.content.Intent intent) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            b3.h.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    /* renamed from: registerReceiver */
    public static android.content.Intent m9719xc20729b2(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i17) {
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
            return context.registerReceiver(broadcastReceiver, intentFilter, m9717x6f1760f4(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    /* renamed from: startActivities */
    public static boolean m9721xeb5f49ef(android.content.Context context, android.content.Intent[] intentArr, android.os.Bundle bundle) {
        b3.b.a(context, intentArr, bundle);
        return true;
    }
}

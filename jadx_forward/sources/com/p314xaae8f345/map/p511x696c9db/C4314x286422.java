package com.p314xaae8f345.map.p511x696c9db;

/* renamed from: com.tencent.map.tools.Util */
/* loaded from: classes13.dex */
public class C4314x286422 {

    /* renamed from: DEBUG */
    private static final boolean f16899x3de9e33 = false;

    /* renamed from: DEFAUlT_GlEsVersion */
    private static final int f16900xa195df87 = 65537;

    /* renamed from: DUID_FILE_NAME */
    private static final java.lang.String f16901xef76a05b = "txlbs_duid";

    /* renamed from: DUID_KEY */
    private static final java.lang.String f16902xa8bdecec = "txlbs_key_duid";

    /* renamed from: META_NAME_API_KEY */
    public static final java.lang.String f16903x85cb2cc0 = "TencentMapSDK";

    /* renamed from: SMALL_SCREEN_THRESHOLD */
    public static final int f16904x3b405c90 = 400;

    /* renamed from: SUID_FILE_NAME */
    private static final java.lang.String f16905x2b7570ac = "txlbs_suid";

    /* renamed from: SUID_KEY */
    private static final java.lang.String f16906xbeef8dfd = "txlbs_key_suid";
    private static final java.lang.String TAG = "Util";

    /* renamed from: equals */
    public static boolean m35818xb2c87fbf(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: filterBuilder */
    public static java.lang.String m35819xe4166503(java.lang.String... strArr) {
        if (strArr == null) {
            return "";
        }
        java.lang.String str = "category=";
        for (int i17 = 0; i17 < strArr.length; i17++) {
            str = i17 == 0 ? str + strArr[i17] : str + "," + strArr[i17];
        }
        return str;
    }

    /* renamed from: findClass */
    public static java.lang.Class m35821x18146f3f(java.lang.String str, java.lang.ClassLoader classLoader) {
        try {
            return java.lang.Class.forName(str, false, classLoader);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: findField */
    public static java.lang.reflect.Field m35822x183d66c1(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            if (cls.getSuperclass() != java.lang.Object.class) {
                return m35822x183d66c1(cls.getSuperclass(), str);
            }
            return null;
        }
    }

    /* renamed from: findMethod */
    public static java.lang.reflect.Method m35823xfb2fc3fa(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException unused) {
            if (cls.getSuperclass() != java.lang.Object.class) {
                return m35823xfb2fc3fa(cls.getSuperclass(), str, clsArr);
            }
            return null;
        }
    }

    /* renamed from: foreach */
    public static <T> void m35824xd79b624a(java.lang.Iterable<T> iterable, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<T> interfaceC4308xf9968465) {
        if (iterable == null || interfaceC4308xf9968465 == null) {
            return;
        }
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            interfaceC4308xf9968465.mo35806xf5bc2045(it.next());
        }
    }

    /* renamed from: getAppName */
    public static java.lang.String m35826xe77ac16(android.content.Context context) {
        java.lang.String m35837x62720afa = m35837x62720afa(context);
        try {
            return java.net.URLEncoder.encode(m35837x62720afa, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.lang.Exception unused) {
            return m35837x62720afa;
        }
    }

    /* renamed from: getAppVersion */
    public static java.lang.String m35827x46b67b6d(android.content.Context context) {
        if (context == null) {
            return "";
        }
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionName + packageInfo.versionCode;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    /* renamed from: getDensity */
    public static float m35828x9a59d0b2(android.content.Context context) {
        if (context == null) {
            return 1.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: getDuid */
    public static java.lang.String m35829xfb7ea1e2(android.content.Context context) {
        return context == null ? "" : m35830xc42400e6(context);
    }

    /* renamed from: getDuidFromSharePrerences */
    private static java.lang.String m35830xc42400e6(android.content.Context context) {
        java.lang.String m35839xaed6afe4 = m35839xaed6afe4(context, f16901xef76a05b, f16902xa8bdecec);
        if (!android.text.TextUtils.isEmpty(m35839xaed6afe4)) {
            return m35839xaed6afe4;
        }
        java.lang.String a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tb.a(context);
        m35852x9ab10add(context, f16901xef76a05b, f16902xa8bdecec, a17);
        return a17;
    }

    /* renamed from: getField */
    public static java.lang.Object m35831x746c4744(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            return null;
        }
        try {
            java.lang.Class<?> cls = obj.getClass();
            if (obj instanceof java.lang.Class) {
                cls = (java.lang.Class) obj;
            }
            java.lang.reflect.Field m35822x183d66c1 = m35822x183d66c1(cls, str);
            if (m35822x183d66c1 != null) {
                m35822x183d66c1.setAccessible(true);
                return m35822x183d66c1.get(obj);
            }
        } catch (java.lang.IllegalAccessException unused) {
        }
        return null;
    }

    /* renamed from: getMD5String */
    public static java.lang.String m35832x40453099(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? "" : m35833x40453099(str.getBytes());
    }

    /* renamed from: getMetaKey */
    public static java.lang.String m35834x76bdd1e4(android.content.Context context, java.lang.String str) {
        android.content.pm.ApplicationInfo applicationInfo;
        android.os.Bundle bundle;
        if (context == null) {
            return "";
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? "" : bundle.getString(str);
    }

    /* renamed from: getOpenglesVersion */
    public static int m35835xabe80645(android.content.Context context) {
        android.content.pm.ConfigurationInfo deviceConfigurationInfo = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getDeviceConfigurationInfo();
        return deviceConfigurationInfo != null ? deviceConfigurationInfo.reqGlEsVersion : f16900xa195df87;
    }

    /* renamed from: getProcessName */
    public static java.lang.String m35836xe5e58464(int i17) {
        java.io.BufferedReader bufferedReader;
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.FileReader("/proc/" + i17 + "/cmdline"));
        } catch (java.lang.Throwable unused) {
            bufferedReader = null;
        }
        try {
            java.lang.String readLine = bufferedReader.readLine();
            if (!android.text.TextUtils.isEmpty(readLine)) {
                readLine = readLine.trim();
            }
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused2) {
            }
            return readLine;
        } catch (java.lang.Throwable unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (java.io.IOException unused4) {
                }
            }
            return null;
        }
    }

    /* renamed from: getRawAppName */
    public static java.lang.String m35837x62720afa(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo;
        if (context == null) {
            return "";
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (applicationInfo != null ? applicationInfo.loadLabel(packageManager) : "can't find app name").toString();
    }

    /* renamed from: getResolution */
    public static java.lang.String m35838x8ee230a2(android.content.Context context) {
        if (context == null) {
            return "";
        }
        try {
            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    /* renamed from: getSharePreference */
    public static java.lang.String m35839xaed6afe4(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return context == null ? "" : context.getSharedPreferences(str, 0).getString(str2, "");
    }

    /* renamed from: getSuid */
    public static java.lang.String m35840xfb857373(android.content.Context context) {
        return context == null ? "" : m35841xa5f9f037(context);
    }

    /* renamed from: getSuidFromSharePrerences */
    private static java.lang.String m35841xa5f9f037(android.content.Context context) {
        java.lang.String m35839xaed6afe4 = m35839xaed6afe4(context, f16905x2b7570ac, f16906xbeef8dfd);
        if (!android.text.TextUtils.isEmpty(m35839xaed6afe4)) {
            return m35839xaed6afe4;
        }
        java.lang.String m35842xfb85e011 = m35842xfb85e011();
        m35852x9ab10add(context, f16905x2b7570ac, f16906xbeef8dfd, m35842xfb85e011);
        return m35842xfb85e011;
    }

    /* renamed from: getUUID */
    public static java.lang.String m35842xfb85e011() {
        try {
            return java.util.UUID.randomUUID().toString();
        } catch (java.lang.Exception unused) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(java.lang.System.currentTimeMillis());
            return sb6.toString();
        }
    }

    /* renamed from: getWindowHeight */
    public static int m35843xae337ad(android.content.Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: getWindowWidth */
    public static int m35844x4b819e80(android.content.Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: hash */
    public static int m35845x30c10e(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }

    /* renamed from: invokeMethod */
    public static java.lang.Object m35847xd8c5c779(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) {
        if (obj == null) {
            return null;
        }
        int length = objArr.length;
        java.lang.Class[] clsArr = new java.lang.Class[length];
        for (int i17 = 0; i17 < length; i17++) {
            clsArr[i17] = objArr[i17].getClass();
        }
        try {
            java.lang.reflect.Method m35823xfb2fc3fa = m35823xfb2fc3fa(obj.getClass(), str, clsArr);
            if (m35823xfb2fc3fa != null) {
                m35823xfb2fc3fa.setAccessible(true);
                return m35823xfb2fc3fa.invoke(obj, objArr);
            }
        } catch (java.lang.IllegalAccessException unused) {
        } catch (java.lang.reflect.InvocationTargetException e17) {
            throw new java.lang.RuntimeException(e17.getTargetException());
        }
        return null;
    }

    /* renamed from: invokeStaticMethod */
    public static java.lang.Object m35848x8362587(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        if (cls == null) {
            return null;
        }
        try {
            java.lang.reflect.Method m35823xfb2fc3fa = m35823xfb2fc3fa(cls, str, clsArr);
            if (m35823xfb2fc3fa != null) {
                m35823xfb2fc3fa.setAccessible(true);
                return m35823xfb2fc3fa.invoke(cls, objArr);
            }
        } catch (java.lang.IllegalAccessException unused) {
        } catch (java.lang.reflect.InvocationTargetException e17) {
            throw new java.lang.RuntimeException(e17.getTargetException());
        }
        return null;
    }

    /* renamed from: isMatchClassTypes */
    private static boolean m35849xf5215efc(java.lang.Class<?>[] clsArr, java.lang.Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < clsArr.length; i18++) {
            if (clsArr[i18] == objArr[i18].getClass() || clsArr[i18].isAssignableFrom(objArr[i18].getClass())) {
                i17++;
            }
        }
        return i17 == clsArr.length;
    }

    /* renamed from: listWhere */
    public static <T> java.util.List<T> m35850xb693cee9(java.lang.Iterable<T> iterable, com.p314xaae8f345.map.p511x696c9db.AbstractC4310x441b8cfb<T> abstractC4310x441b8cfb) {
        java.util.List<T> emptyList = java.util.Collections.emptyList();
        if (iterable != null && abstractC4310x441b8cfb != null) {
            for (T t17 : iterable) {
                if (abstractC4310x441b8cfb.mo35807xf5bc2045((com.p314xaae8f345.map.p511x696c9db.AbstractC4310x441b8cfb<T>) t17).booleanValue()) {
                    emptyList.add(t17);
                }
            }
        }
        return emptyList;
    }

    /* renamed from: newInstance */
    public static <T> T m35851x6bff0255(java.lang.Class<T> cls, java.lang.Object... objArr) {
        if (cls != null && !cls.isEnum() && !cls.isInterface() && !cls.isAnnotation() && !cls.isArray()) {
            java.lang.reflect.Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            for (int i17 = 0; i17 < declaredConstructors.length; i17++) {
                if (m35849xf5215efc(declaredConstructors[i17].getParameterTypes(), objArr)) {
                    try {
                        declaredConstructors[i17].setAccessible(true);
                        return (T) declaredConstructors[i17].newInstance(objArr);
                    } catch (java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
                        continue;
                    } catch (java.lang.reflect.InvocationTargetException e17) {
                        throw new java.lang.RuntimeException(e17.getTargetException());
                    }
                }
            }
            try {
                return cls.newInstance();
            } catch (java.lang.IllegalAccessException unused2) {
            } catch (java.lang.InstantiationException e18) {
                throw new java.lang.RuntimeException(e18);
            }
        }
        return null;
    }

    /* renamed from: saveSharePreference */
    public static void m35852x9ab10add(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (context == null) {
            return;
        }
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
    }

    /* renamed from: setField */
    public static void m35853x52fa61b8(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj == null) {
            return;
        }
        try {
            java.lang.reflect.Field m35822x183d66c1 = m35822x183d66c1(obj.getClass(), str);
            if (m35822x183d66c1 != null) {
                m35822x183d66c1.setAccessible(true);
                m35822x183d66c1.set(obj, obj2);
            }
        } catch (java.lang.IllegalAccessException unused) {
        }
    }

    /* renamed from: singleWhere */
    public static <T> T m35854x9851b57f(java.lang.Iterable<T> iterable, com.p314xaae8f345.map.p511x696c9db.AbstractC4310x441b8cfb<T> abstractC4310x441b8cfb) {
        if (iterable != null && abstractC4310x441b8cfb != null) {
            for (T t17 : iterable) {
                if (abstractC4310x441b8cfb.mo35807xf5bc2045((com.p314xaae8f345.map.p511x696c9db.AbstractC4310x441b8cfb<T>) t17).booleanValue()) {
                    return t17;
                }
            }
        }
        return null;
    }

    /* renamed from: where */
    public static <T> boolean m35855x6bdbce7(java.lang.Iterable<T> iterable, com.p314xaae8f345.map.p511x696c9db.InterfaceC4313x73735db5<java.lang.Boolean, T> interfaceC4313x73735db5) {
        if (iterable != null && interfaceC4313x73735db5 != null) {
            java.util.Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                if (interfaceC4313x73735db5.mo35807xf5bc2045(it.next()).booleanValue()) {
                    return true;
                }
            }
            interfaceC4313x73735db5.mo35807xf5bc2045(null);
        }
        return false;
    }

    /* renamed from: findClass */
    public static <T> java.lang.Class<? extends T> m35820x18146f3f(java.lang.String str, java.lang.Class<T> cls, java.lang.ClassLoader classLoader) {
        try {
            java.lang.Class<? extends T> cls2 = (java.lang.Class<? extends T>) java.lang.Class.forName(str, false, classLoader);
            if (cls.isAssignableFrom(cls2)) {
                return cls2;
            }
            return null;
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: foreach */
    public static <T> void m35825xd79b624a(T[] tArr, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<T> interfaceC4308xf9968465) {
        if (tArr == null || interfaceC4308xf9968465 == null) {
            return;
        }
        for (T t17 : tArr) {
            interfaceC4308xf9968465.mo35806xf5bc2045(t17);
        }
    }

    /* renamed from: getMD5String */
    public static java.lang.String m35833x40453099(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[32];
            int i17 = 0;
            for (int i18 = 0; i18 < 16; i18++) {
                byte b17 = digest[i18];
                int i19 = i17 + 1;
                cArr2[i17] = cArr[(b17 >>> 4) & 15];
                i17 = i19 + 1;
                cArr2[i19] = cArr[b17 & 15];
            }
            return new java.lang.String(cArr2);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: where */
    public static <T> boolean m35856x6bdbce7(T[] tArr, com.p314xaae8f345.map.p511x696c9db.InterfaceC4313x73735db5<java.lang.Boolean, T> interfaceC4313x73735db5) {
        if (tArr != null && interfaceC4313x73735db5 != null) {
            for (T t17 : tArr) {
                if (interfaceC4313x73735db5.mo35807xf5bc2045(t17).booleanValue()) {
                    return true;
                }
            }
            interfaceC4313x73735db5.mo35807xf5bc2045(null);
        }
        return false;
    }

    /* renamed from: invokeMethod */
    public static java.lang.Object m35846xd8c5c779(java.lang.Object obj, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        if (obj == null) {
            return null;
        }
        try {
            java.lang.reflect.Method m35823xfb2fc3fa = m35823xfb2fc3fa(obj.getClass(), str, clsArr);
            if (m35823xfb2fc3fa != null) {
                m35823xfb2fc3fa.setAccessible(true);
                return m35823xfb2fc3fa.invoke(obj, objArr);
            }
        } catch (java.lang.IllegalAccessException unused) {
        } catch (java.lang.reflect.InvocationTargetException e17) {
            throw new java.lang.RuntimeException(e17.getTargetException());
        }
        return null;
    }
}

package com.tencent.map.tools;

/* loaded from: classes13.dex */
public class Util {
    private static final boolean DEBUG = false;
    private static final int DEFAUlT_GlEsVersion = 65537;
    private static final java.lang.String DUID_FILE_NAME = "txlbs_duid";
    private static final java.lang.String DUID_KEY = "txlbs_key_duid";
    public static final java.lang.String META_NAME_API_KEY = "TencentMapSDK";
    public static final int SMALL_SCREEN_THRESHOLD = 400;
    private static final java.lang.String SUID_FILE_NAME = "txlbs_suid";
    private static final java.lang.String SUID_KEY = "txlbs_key_suid";
    private static final java.lang.String TAG = "Util";

    public static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static java.lang.String filterBuilder(java.lang.String... strArr) {
        if (strArr == null) {
            return "";
        }
        java.lang.String str = "category=";
        for (int i17 = 0; i17 < strArr.length; i17++) {
            str = i17 == 0 ? str + strArr[i17] : str + "," + strArr[i17];
        }
        return str;
    }

    public static java.lang.Class findClass(java.lang.String str, java.lang.ClassLoader classLoader) {
        try {
            return java.lang.Class.forName(str, false, classLoader);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static java.lang.reflect.Field findField(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            if (cls.getSuperclass() != java.lang.Object.class) {
                return findField(cls.getSuperclass(), str);
            }
            return null;
        }
    }

    public static java.lang.reflect.Method findMethod(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException unused) {
            if (cls.getSuperclass() != java.lang.Object.class) {
                return findMethod(cls.getSuperclass(), str, clsArr);
            }
            return null;
        }
    }

    public static <T> void foreach(java.lang.Iterable<T> iterable, com.tencent.map.tools.Callback<T> callback) {
        if (iterable == null || callback == null) {
            return;
        }
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            callback.callback(it.next());
        }
    }

    public static java.lang.String getAppName(android.content.Context context) {
        java.lang.String rawAppName = getRawAppName(context);
        try {
            return java.net.URLEncoder.encode(rawAppName, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.lang.Exception unused) {
            return rawAppName;
        }
    }

    public static java.lang.String getAppVersion(android.content.Context context) {
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

    public static float getDensity(android.content.Context context) {
        if (context == null) {
            return 1.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static java.lang.String getDuid(android.content.Context context) {
        return context == null ? "" : getDuidFromSharePrerences(context);
    }

    private static java.lang.String getDuidFromSharePrerences(android.content.Context context) {
        java.lang.String sharePreference = getSharePreference(context, DUID_FILE_NAME, DUID_KEY);
        if (!android.text.TextUtils.isEmpty(sharePreference)) {
            return sharePreference;
        }
        java.lang.String a17 = com.tencent.mapsdk.internal.tb.a(context);
        saveSharePreference(context, DUID_FILE_NAME, DUID_KEY, a17);
        return a17;
    }

    public static java.lang.Object getField(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            return null;
        }
        try {
            java.lang.Class<?> cls = obj.getClass();
            if (obj instanceof java.lang.Class) {
                cls = (java.lang.Class) obj;
            }
            java.lang.reflect.Field findField = findField(cls, str);
            if (findField != null) {
                findField.setAccessible(true);
                return findField.get(obj);
            }
        } catch (java.lang.IllegalAccessException unused) {
        }
        return null;
    }

    public static java.lang.String getMD5String(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? "" : getMD5String(str.getBytes());
    }

    public static java.lang.String getMetaKey(android.content.Context context, java.lang.String str) {
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

    public static int getOpenglesVersion(android.content.Context context) {
        android.content.pm.ConfigurationInfo deviceConfigurationInfo = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getDeviceConfigurationInfo();
        return deviceConfigurationInfo != null ? deviceConfigurationInfo.reqGlEsVersion : DEFAUlT_GlEsVersion;
    }

    public static java.lang.String getProcessName(int i17) {
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

    public static java.lang.String getRawAppName(android.content.Context context) {
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

    public static java.lang.String getResolution(android.content.Context context) {
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

    public static java.lang.String getSharePreference(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return context == null ? "" : context.getSharedPreferences(str, 0).getString(str2, "");
    }

    public static java.lang.String getSuid(android.content.Context context) {
        return context == null ? "" : getSuidFromSharePrerences(context);
    }

    private static java.lang.String getSuidFromSharePrerences(android.content.Context context) {
        java.lang.String sharePreference = getSharePreference(context, SUID_FILE_NAME, SUID_KEY);
        if (!android.text.TextUtils.isEmpty(sharePreference)) {
            return sharePreference;
        }
        java.lang.String uuid = getUUID();
        saveSharePreference(context, SUID_FILE_NAME, SUID_KEY, uuid);
        return uuid;
    }

    public static java.lang.String getUUID() {
        try {
            return java.util.UUID.randomUUID().toString();
        } catch (java.lang.Exception unused) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(java.lang.System.currentTimeMillis());
            return sb6.toString();
        }
    }

    public static int getWindowHeight(android.content.Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getWindowWidth(android.content.Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int hash(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }

    public static java.lang.Object invokeMethod(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) {
        if (obj == null) {
            return null;
        }
        int length = objArr.length;
        java.lang.Class[] clsArr = new java.lang.Class[length];
        for (int i17 = 0; i17 < length; i17++) {
            clsArr[i17] = objArr[i17].getClass();
        }
        try {
            java.lang.reflect.Method findMethod = findMethod(obj.getClass(), str, clsArr);
            if (findMethod != null) {
                findMethod.setAccessible(true);
                return findMethod.invoke(obj, objArr);
            }
        } catch (java.lang.IllegalAccessException unused) {
        } catch (java.lang.reflect.InvocationTargetException e17) {
            throw new java.lang.RuntimeException(e17.getTargetException());
        }
        return null;
    }

    public static java.lang.Object invokeStaticMethod(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        if (cls == null) {
            return null;
        }
        try {
            java.lang.reflect.Method findMethod = findMethod(cls, str, clsArr);
            if (findMethod != null) {
                findMethod.setAccessible(true);
                return findMethod.invoke(cls, objArr);
            }
        } catch (java.lang.IllegalAccessException unused) {
        } catch (java.lang.reflect.InvocationTargetException e17) {
            throw new java.lang.RuntimeException(e17.getTargetException());
        }
        return null;
    }

    private static boolean isMatchClassTypes(java.lang.Class<?>[] clsArr, java.lang.Object[] objArr) {
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

    public static <T> java.util.List<T> listWhere(java.lang.Iterable<T> iterable, com.tencent.map.tools.Condition<T> condition) {
        java.util.List<T> emptyList = java.util.Collections.emptyList();
        if (iterable != null && condition != null) {
            for (T t17 : iterable) {
                if (condition.callback((com.tencent.map.tools.Condition<T>) t17).booleanValue()) {
                    emptyList.add(t17);
                }
            }
        }
        return emptyList;
    }

    public static <T> T newInstance(java.lang.Class<T> cls, java.lang.Object... objArr) {
        if (cls != null && !cls.isEnum() && !cls.isInterface() && !cls.isAnnotation() && !cls.isArray()) {
            java.lang.reflect.Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            for (int i17 = 0; i17 < declaredConstructors.length; i17++) {
                if (isMatchClassTypes(declaredConstructors[i17].getParameterTypes(), objArr)) {
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

    public static void saveSharePreference(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (context == null) {
            return;
        }
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
    }

    public static void setField(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj == null) {
            return;
        }
        try {
            java.lang.reflect.Field findField = findField(obj.getClass(), str);
            if (findField != null) {
                findField.setAccessible(true);
                findField.set(obj, obj2);
            }
        } catch (java.lang.IllegalAccessException unused) {
        }
    }

    public static <T> T singleWhere(java.lang.Iterable<T> iterable, com.tencent.map.tools.Condition<T> condition) {
        if (iterable != null && condition != null) {
            for (T t17 : iterable) {
                if (condition.callback((com.tencent.map.tools.Condition<T>) t17).booleanValue()) {
                    return t17;
                }
            }
        }
        return null;
    }

    public static <T> boolean where(java.lang.Iterable<T> iterable, com.tencent.map.tools.ReturnCallback<java.lang.Boolean, T> returnCallback) {
        if (iterable != null && returnCallback != null) {
            java.util.Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                if (returnCallback.callback(it.next()).booleanValue()) {
                    return true;
                }
            }
            returnCallback.callback(null);
        }
        return false;
    }

    public static <T> java.lang.Class<? extends T> findClass(java.lang.String str, java.lang.Class<T> cls, java.lang.ClassLoader classLoader) {
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

    public static <T> void foreach(T[] tArr, com.tencent.map.tools.Callback<T> callback) {
        if (tArr == null || callback == null) {
            return;
        }
        for (T t17 : tArr) {
            callback.callback(t17);
        }
    }

    public static java.lang.String getMD5String(byte[] bArr) {
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

    public static <T> boolean where(T[] tArr, com.tencent.map.tools.ReturnCallback<java.lang.Boolean, T> returnCallback) {
        if (tArr != null && returnCallback != null) {
            for (T t17 : tArr) {
                if (returnCallback.callback(t17).booleanValue()) {
                    return true;
                }
            }
            returnCallback.callback(null);
        }
        return false;
    }

    public static java.lang.Object invokeMethod(java.lang.Object obj, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        if (obj == null) {
            return null;
        }
        try {
            java.lang.reflect.Method findMethod = findMethod(obj.getClass(), str, clsArr);
            if (findMethod != null) {
                findMethod.setAccessible(true);
                return findMethod.invoke(obj, objArr);
            }
        } catch (java.lang.IllegalAccessException unused) {
        } catch (java.lang.reflect.InvocationTargetException e17) {
            throw new java.lang.RuntimeException(e17.getTargetException());
        }
        return null;
    }
}

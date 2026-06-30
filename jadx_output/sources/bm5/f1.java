package bm5;

/* loaded from: classes7.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f22579a = {null, null};

    public static java.lang.String a() {
        java.io.FileInputStream fileInputStream;
        java.lang.String byteArrayOutputStream;
        java.lang.String[] strArr = f22579a;
        if (strArr[0] == null) {
            synchronized (strArr) {
                if (strArr[0] == null) {
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        java.lang.String processName = android.app.Application.getProcessName();
                        if (!android.text.TextUtils.isEmpty(processName)) {
                            strArr[0] = processName;
                            return processName;
                        }
                    }
                    try {
                        java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new java.lang.Class[0]);
                        declaredMethod.setAccessible(true);
                        java.lang.String str = (java.lang.String) declaredMethod.invoke(null, new java.lang.Object[0]);
                        if (!android.text.TextUtils.isEmpty(str)) {
                            strArr[0] = str;
                            return str;
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                    try {
                        fileInputStream = new java.io.FileInputStream("/proc/self/cmdline");
                        try {
                            java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream(256);
                            byte[] bArr = new byte[256];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr, 0, read);
                            }
                            byteArrayOutputStream = byteArrayOutputStream2.toString(java.nio.charset.StandardCharsets.UTF_8.name());
                        } finally {
                        }
                    } catch (java.lang.Throwable unused2) {
                    }
                    if (android.text.TextUtils.isEmpty(byteArrayOutputStream)) {
                        fileInputStream.close();
                        throw new java.lang.IllegalStateException("Fail to get current process name.");
                    }
                    java.lang.String[] strArr2 = f22579a;
                    java.lang.String trim = byteArrayOutputStream.trim();
                    strArr2[0] = trim;
                    fileInputStream.close();
                    return trim;
                }
            }
        }
        return strArr[0];
    }

    public static java.lang.String b() {
        java.lang.String[] strArr = f22579a;
        if (strArr[1] == null) {
            synchronized (strArr) {
                if (strArr[1] == null) {
                    java.lang.String a17 = a();
                    int indexOf = a17.indexOf(58);
                    strArr[1] = indexOf >= 0 ? a17.substring(indexOf) : "";
                }
            }
        }
        return strArr[1];
    }
}

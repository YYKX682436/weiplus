package com.tencent.matrix.mallctl;

/* loaded from: classes12.dex */
public class MallCtl {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f52913a;

    static {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("matrix-mallctl");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/mallctl/MallCtl", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/matrix/mallctl/MallCtl", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            initNative();
            f52913a = true;
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.JeCtl", th6, "", new java.lang.Object[0]);
        }
    }

    public static synchronized void a(fi.b bVar) {
        java.io.BufferedReader bufferedReader;
        synchronized (com.tencent.matrix.mallctl.MallCtl.class) {
            if (bVar == null) {
                bVar = new fi.a();
            }
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^([0-9a-f]+)-([0-9a-f]+)\\s+([rwxps-]{4})\\s+[0-9a-f]+\\s+[0-9a-f]+:[0-9a-f]+\\s+\\d+\\s*(.*)$");
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/self/maps")));
            } catch (java.io.IOException e17) {
                oj.j.d("Matrix.JeCtl", e17, "", new java.lang.Object[0]);
            }
            try {
                for (java.lang.String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    java.util.regex.Matcher matcher = compile.matcher(readLine);
                    if (matcher.find()) {
                        java.lang.String group = matcher.group(1);
                        java.lang.String group2 = matcher.group(2);
                        java.lang.String group3 = matcher.group(3);
                        java.lang.String group4 = matcher.group(4);
                        if (group4 == null || group4.isEmpty()) {
                            group4 = "[no-name]";
                        }
                        if (bVar.a(group4, group3) && group != null && group2 != null) {
                            try {
                                long parseLong = java.lang.Long.parseLong(group, 16);
                                flushReadOnlyFilePagesNative(parseLong, java.lang.Long.parseLong(group2, 16) - parseLong);
                            } catch (java.lang.Throwable th6) {
                                oj.j.d("Matrix.JeCtl", th6, "%s-%s %s %s", group, group2, group3, group4);
                            }
                        }
                    }
                }
                bufferedReader.close();
            } catch (java.lang.Throwable th7) {
                try {
                    bufferedReader.close();
                } catch (java.lang.Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        }
    }

    public static synchronized boolean b(boolean z17) {
        boolean retainNative;
        synchronized (com.tencent.matrix.mallctl.MallCtl.class) {
            try {
                retainNative = setRetainNative(z17);
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.JeCtl", th6, "set retain failed", new java.lang.Object[0]);
                return false;
            }
        }
        return retainNative;
    }

    public static synchronized java.lang.String c() {
        synchronized (com.tencent.matrix.mallctl.MallCtl.class) {
            if (f52913a) {
                return getVersionNative();
            }
            oj.j.b("Matrix.JeCtl", "JeCtl init failed! check if so exists", new java.lang.Object[0]);
            return "VER_UNKNOWN";
        }
    }

    public static synchronized int d() {
        int malloptNative;
        synchronized (com.tencent.matrix.mallctl.MallCtl.class) {
            try {
                malloptNative = malloptNative();
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.JeCtl", th6, "mallopt failed", new java.lang.Object[0]);
                return -2;
            }
        }
        return malloptNative;
    }

    private static native int flushReadOnlyFilePagesNative(long j17, long j18);

    private static native java.lang.String getVersionNative();

    private static native void initNative();

    private static native int malloptNative();

    private static native boolean setRetainNative(boolean z17);
}

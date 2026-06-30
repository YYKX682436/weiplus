package com.p314xaae8f345.p552xbf8d97c1.p570x31b1d387;

/* renamed from: com.tencent.matrix.mallctl.MallCtl */
/* loaded from: classes12.dex */
public class C4693x94e9f347 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f134446a;

    static {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("matrix-mallctl");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/mallctl/MallCtl", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/matrix/mallctl/MallCtl", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            m41137x5dc9547();
            f134446a = true;
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.JeCtl", th6, "", new java.lang.Object[0]);
        }
    }

    public static synchronized void a(fi.b bVar) {
        java.io.BufferedReader bufferedReader;
        synchronized (com.p314xaae8f345.p552xbf8d97c1.p570x31b1d387.C4693x94e9f347.class) {
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
                                m41135x4ee7a379(parseLong, java.lang.Long.parseLong(group2, 16) - parseLong);
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
        boolean m41139x82b722fe;
        synchronized (com.p314xaae8f345.p552xbf8d97c1.p570x31b1d387.C4693x94e9f347.class) {
            try {
                m41139x82b722fe = m41139x82b722fe(z17);
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.JeCtl", th6, "set retain failed", new java.lang.Object[0]);
                return false;
            }
        }
        return m41139x82b722fe;
    }

    public static synchronized java.lang.String c() {
        synchronized (com.p314xaae8f345.p552xbf8d97c1.p570x31b1d387.C4693x94e9f347.class) {
            if (f134446a) {
                return m41136xe1f91359();
            }
            oj.j.b("Matrix.JeCtl", "JeCtl init failed! check if so exists", new java.lang.Object[0]);
            return "VER_UNKNOWN";
        }
    }

    public static synchronized int d() {
        int m41138x96ba6916;
        synchronized (com.p314xaae8f345.p552xbf8d97c1.p570x31b1d387.C4693x94e9f347.class) {
            try {
                m41138x96ba6916 = m41138x96ba6916();
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.JeCtl", th6, "mallopt failed", new java.lang.Object[0]);
                return -2;
            }
        }
        return m41138x96ba6916;
    }

    /* renamed from: flushReadOnlyFilePagesNative */
    private static native int m41135x4ee7a379(long j17, long j18);

    /* renamed from: getVersionNative */
    private static native java.lang.String m41136xe1f91359();

    /* renamed from: initNative */
    private static native void m41137x5dc9547();

    /* renamed from: malloptNative */
    private static native int m41138x96ba6916();

    /* renamed from: setRetainNative */
    private static native boolean m41139x82b722fe(boolean z17);
}

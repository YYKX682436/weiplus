package wo;

/* loaded from: classes12.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Map f529332a;

    public static java.util.HashMap a() {
        java.io.BufferedReader bufferedReader;
        java.io.IOException e17;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.io.BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/cpuinfo"), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            while (true) {
                try {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        java.lang.String[] split = readLine.split(":", 2);
                        if (split != null && split.length >= 2) {
                            java.lang.String trim = split[0].trim();
                            java.lang.String trim2 = split[1].trim();
                            if (hashMap.get(trim) == null) {
                                hashMap.put(trim, trim2);
                            }
                        }
                    } catch (java.io.IOException e18) {
                        e17 = e18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CpuFeatures", e17, "getCpu() failed.", new java.lang.Object[0]);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
                        return hashMap;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bufferedReader2 = bufferedReader;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader2);
                    throw th;
                }
            }
        } catch (java.io.IOException e19) {
            bufferedReader = null;
            e17 = e19;
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader2);
            throw th;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
        return hashMap;
    }

    public static java.lang.String b() {
        if (f529332a == null) {
            f529332a = a();
        }
        return h(f529332a, "Hardware");
    }

    public static java.util.Map c() {
        if (f529332a == null) {
            f529332a = a();
        }
        return f529332a;
    }

    public static int d() {
        try {
            return new java.io.File("/sys/devices/system/cpu/").listFiles(new wo.s()).length;
        } catch (java.lang.Exception unused) {
            return 1;
        }
    }

    public static boolean e() {
        if (f529332a == null) {
            f529332a = a();
        }
        java.util.Map map = f529332a;
        if (map == null) {
            return false;
        }
        java.lang.String h17 = h(map, "Features");
        if (h17 == null || !h17.contains("neon")) {
            return h17 != null && h17.contains("asimd");
        }
        return true;
    }

    public static boolean f() {
        java.lang.String str;
        int i17;
        if (f529332a == null) {
            f529332a = a();
        }
        java.util.Map map = f529332a;
        if (map != null && (str = (java.lang.String) ((java.util.HashMap) map).get("CPU architecture")) != null) {
            try {
                if (str.length() > 0) {
                    try {
                        if (str.length() > 0) {
                            while (true) {
                                char charAt = str.charAt(0);
                                if (charAt >= '0' && charAt <= '9') {
                                    break;
                                }
                                if (str.length() == 1) {
                                    str = null;
                                    break;
                                }
                                str = str.substring(1);
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CpuFeatures", e17, "", new java.lang.Object[0]);
                    }
                    int i18 = 0;
                    while (true) {
                        i17 = i18 + 1;
                        try {
                            char charAt2 = str.charAt(i18);
                            if (!(charAt2 >= '0' && charAt2 <= '9') || str.length() <= i17) {
                                break;
                            }
                            i18 = i17;
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CpuFeatures", e18, "", new java.lang.Object[0]);
                        }
                    }
                    int i19 = i17 - 1;
                    if (str.length() > i19 + 1 && i19 > 0) {
                        str = str.substring(0, i19);
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0) >= 6) {
                        return true;
                    }
                }
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CpuFeatures", e19, "", new java.lang.Object[0]);
            }
        }
        return false;
    }

    public static boolean g() {
        try {
            return e();
        } catch (java.lang.IncompatibleClassChangeError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Crash", e17, "May cause dvmFindCatchBlock crash!", new java.lang.Object[0]);
            throw ((java.lang.IncompatibleClassChangeError) new java.lang.IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(e17));
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static java.lang.String h(java.util.Map map, java.lang.String str) {
        return (java.lang.String) map.get(str);
    }
}

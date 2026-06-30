package ko3;

/* loaded from: classes13.dex */
public final class e implements ko3.q {

    /* renamed from: i, reason: collision with root package name */
    public static final ko3.b f391473i;

    /* renamed from: a, reason: collision with root package name */
    public long f391474a;

    /* renamed from: b, reason: collision with root package name */
    public long f391475b;

    /* renamed from: c, reason: collision with root package name */
    public long f391476c;

    /* renamed from: d, reason: collision with root package name */
    public long f391477d;

    /* renamed from: e, reason: collision with root package name */
    public long f391478e;

    /* renamed from: f, reason: collision with root package name */
    public int f391479f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f391480g = false;

    /* renamed from: h, reason: collision with root package name */
    public long f391481h = 0;

    static {
        ko3.b bVar = new ko3.b(null);
        f391473i = bVar;
        bVar.add("");
        bVar.add(":tools");
        bVar.add(":appbrand0");
        bVar.add(":appbrand1");
        bVar.add(":appbrand2");
        bVar.add(":appbrand3");
        bVar.add(":appbrand4");
    }

    public e(ko3.a aVar) {
        java.io.DataInputStream dataInputStream;
        this.f391474a = 0L;
        this.f391475b = 0L;
        this.f391476c = 0L;
        this.f391477d = 0L;
        this.f391478e = 0L;
        synchronized (this) {
            try {
                dataInputStream = new java.io.DataInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(new java.io.File(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir(), ko3.e0.b("ã\u0082ç\u0083ÜºÈ\u00adÜò\u0090ù\u0097")))));
                try {
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MircoMsg.AEDHLP", th, "[tomys] failure to load rec.", new java.lang.Object[0]);
                        this.f391474a = 0L;
                        this.f391475b = 0L;
                        this.f391476c = 0L;
                        this.f391477d = java.lang.System.currentTimeMillis();
                        this.f391478e = 0L;
                        e();
                    } finally {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(dataInputStream);
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                dataInputStream = null;
            }
            if (dataInputStream.readInt() != -606158847) {
                throw new java.lang.IllegalStateException("bad magic.");
            }
            this.f391474a = dataInputStream.readLong();
            this.f391475b = dataInputStream.readLong();
            this.f391476c = dataInputStream.readLong();
            this.f391477d = dataInputStream.readLong();
            long readLong = dataInputStream.readLong();
            if (readLong > 0 && this.f391478e <= 0) {
                this.f391478e = readLong;
            }
        }
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        return j62.e.g().a(str, str2, false, true);
    }

    public static java.lang.String b(int i17) {
        java.io.BufferedReader bufferedReader;
        java.lang.String readLine;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        if (activityManager == null) {
            return "";
        }
        try {
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == i17) {
                        return runningAppProcessInfo.processName;
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MircoMsg.AEDHLP", th6, "[tomys] failure on step1.", new java.lang.Object[0]);
        }
        try {
            java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(16384);
            if (runningServices != null) {
                for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                    if (runningServiceInfo.pid == i17) {
                        return runningServiceInfo.process;
                    }
                }
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MircoMsg.AEDHLP", th7, "[tomys] failure on step2.", new java.lang.Object[0]);
        }
        java.io.BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.FileReader(java.lang.String.format(java.util.Locale.ENGLISH, ko3.e0.b("Ãì\u009cî\u0081âÍè\u008c£À\u00adÉ¥Ì¢Ç"), java.lang.Integer.valueOf(i17))));
            try {
                readLine = bufferedReader.readLine();
            } catch (java.lang.Throwable th8) {
                th = th8;
                bufferedReader2 = bufferedReader;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MircoMsg.AEDHLP", th, "[tomys] failure on step3.", new java.lang.Object[0]);
                    return "";
                } finally {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader2);
                }
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
        }
        if (readLine == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
            return "";
        }
        java.lang.String trim = readLine.trim();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
        return trim;
    }

    public final synchronized void c(java.lang.Throwable th6) {
        java.io.PrintWriter printWriter;
        if (th6 == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f391476c > 86400000) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            try {
                printWriter = new java.io.PrintWriter(stringWriter);
                try {
                    th6.printStackTrace(printWriter);
                } catch (java.lang.Throwable unused) {
                }
            } catch (java.lang.Throwable unused2) {
                printWriter = null;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(printWriter);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.i("Normsg_AED_Errors", "error:" + stringWriter.toString(), null);
            this.f391476c = currentTimeMillis;
            e();
        }
    }

    public final synchronized void d() {
        if (!this.f391480g) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f391481h < 2000) {
                return;
            }
            this.f391481h = currentTimeMillis;
            this.f391480g = true;
            w04.l.INSTANCE.Nf(-2147483647);
        }
    }

    public final synchronized void e() {
        java.io.DataOutputStream dataOutputStream = null;
        try {
            java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(new java.io.File(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir(), ko3.e0.b("ã\u0082ç\u0083ÜºÈ\u00adÜò\u0090ù\u0097")))));
            try {
                dataOutputStream2.writeInt(-606158847);
                dataOutputStream2.writeLong(this.f391474a);
                dataOutputStream2.writeLong(this.f391475b);
                dataOutputStream2.writeLong(this.f391476c);
                dataOutputStream2.writeLong(this.f391477d);
                dataOutputStream2.writeLong(this.f391478e);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(dataOutputStream2);
            } catch (java.lang.Throwable th6) {
                th = th6;
                dataOutputStream = dataOutputStream2;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MircoMsg.AEDHLP", th, "[tomys] failure to save rec.", new java.lang.Object[0]);
                } finally {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(dataOutputStream);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}

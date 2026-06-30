package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class kz extends com.tencent.mapsdk.internal.kw {

    /* renamed from: g, reason: collision with root package name */
    private static java.io.File f50227g = null;

    /* renamed from: p, reason: collision with root package name */
    private static final int f50229p = -101;

    /* renamed from: q, reason: collision with root package name */
    private static final int f50230q = -102;

    /* renamed from: r, reason: collision with root package name */
    private static final int f50231r = -103;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.LogCallback f50233c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f50234d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.TencentMapOptions f50235e;

    /* renamed from: h, reason: collision with root package name */
    private final android.content.Context f50236h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f50237i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f50238j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f50239k;

    /* renamed from: l, reason: collision with root package name */
    private int f50240l;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String[] f50241m;

    /* renamed from: n, reason: collision with root package name */
    private final int f50242n;

    /* renamed from: o, reason: collision with root package name */
    private static final android.os.HandlerThread f50228o = new android.os.HandlerThread("core-log-thread");

    /* renamed from: f, reason: collision with root package name */
    public static android.os.Handler f50226f = null;

    /* renamed from: s, reason: collision with root package name */
    private static final android.os.Handler.Callback f50232s = new android.os.Handler.Callback() { // from class: com.tencent.mapsdk.internal.kz.3

        /* renamed from: a, reason: collision with root package name */
        public static final java.lang.String f50245a = "LOG-";

        /* renamed from: b, reason: collision with root package name */
        public final java.text.SimpleDateFormat f50246b = new java.text.SimpleDateFormat("yyyy_MM_dd", java.util.Locale.CHINA);

        /* renamed from: c, reason: collision with root package name */
        private android.util.Pair<java.lang.String, java.lang.StringBuilder> f50247c;

        private java.lang.String a() {
            return this.f50246b.format(new java.util.Date());
        }

        private static java.lang.String b() {
            return "###########\n" + (com.tencent.mapsdk.internal.tf.f51588j + ", " + com.tencent.mapsdk.internal.tf.f51587i + ", " + com.tencent.mapsdk.internal.tf.f51581c + ", " + com.tencent.mapsdk.internal.tf.f51580b + ", " + com.tencent.mapsdk.internal.tf.f51593o) + "\n###########\n" + (com.tencent.mapsdk.internal.hn.h() + ", " + com.tencent.mapsdk.internal.hn.d() + ", " + com.tencent.mapsdk.internal.hn.e() + ", " + com.tencent.mapsdk.internal.hn.l() + ", " + com.tencent.mapsdk.internal.hn.c() + ", " + com.tencent.mapsdk.internal.hn.j() + ", " + com.tencent.mapsdk.internal.hn.f() + ", " + com.tencent.mapsdk.internal.hn.g() + ", " + com.tencent.mapsdk.internal.hn.m() + ", " + com.tencent.mapsdk.internal.hn.k() + ", " + com.tencent.mapsdk.internal.hn.o() + ", " + com.tencent.mapsdk.internal.hn.b()) + "\n###########\n";
        }

        private java.lang.String c() {
            return f50245a.concat(java.lang.String.valueOf(a()));
        }

        private static void d() {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            java.util.Date date = new java.util.Date();
            calendar.setTime(date);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb6.append("(");
            sb7.append("(");
            for (int i17 = 2; i17 != 0; i17--) {
                calendar.add(2, -1);
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(calendar.get(1));
                java.lang.String sb9 = sb8.toString();
                java.lang.String format = java.lang.String.format(java.util.Locale.CHINA, "%02d", java.lang.Integer.valueOf(calendar.get(2) + 1));
                sb6.append(sb9);
                sb6.append("|");
                sb7.append(format);
                sb7.append("|");
                java.lang.String str = sb9 + "_" + format;
                java.io.File[] e17 = com.tencent.mapsdk.internal.ks.e(com.tencent.mapsdk.internal.kz.f50227g, "LOG.*" + str + ".*");
                if (e17 != null && e17.length > 0) {
                    com.tencent.mapsdk.internal.kv.a(e17, com.tencent.mapsdk.internal.kz.f50227g, "archive-".concat(java.lang.String.valueOf(str)));
                }
            }
            calendar.setTime(date);
            sb6.deleteCharAt(sb6.lastIndexOf("|")).append(")");
            sb7.deleteCharAt(sb7.lastIndexOf("|")).append(")");
            java.lang.String str2 = "archive-" + sb6.toString() + "_" + sb7.toString() + ".zip";
            java.io.File[] e18 = com.tencent.mapsdk.internal.ks.e(com.tencent.mapsdk.internal.kz.f50227g, "archive-.*.zip");
            if (e18 != null) {
                for (java.io.File file : e18) {
                    if (!file.getName().matches(str2)) {
                        com.tencent.mapsdk.internal.ks.b(file);
                    }
                }
            }
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("(");
            java.lang.String str3 = "(" + calendar.get(1) + ")";
            sb10.append(java.lang.String.format(java.util.Locale.CHINA, "%02d", java.lang.Integer.valueOf(calendar.get(2) + 1)));
            sb10.append(")");
            java.lang.String str4 = f50245a + str3 + "_" + ((java.lang.Object) sb10) + "_.*";
            java.io.File[] e19 = com.tencent.mapsdk.internal.ks.e(com.tencent.mapsdk.internal.kz.f50227g, "LOG.*");
            if (e19 == null || e19.length <= 0) {
                return;
            }
            for (java.io.File file2 : e19) {
                if (!file2.getName().matches(str4)) {
                    com.tencent.mapsdk.internal.ks.b(file2);
                }
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(android.os.Message message) {
            switch (message.what) {
                case -103:
                    break;
                case -102:
                    a(c());
                    break;
                case -101:
                    java.lang.Object obj = message.obj;
                    if (obj == null) {
                        return false;
                    }
                    com.tencent.mapsdk.internal.kz.b bVar = (com.tencent.mapsdk.internal.kz.b) obj;
                    java.lang.String c17 = c();
                    android.util.Pair<java.lang.String, java.lang.StringBuilder> pair = this.f50247c;
                    if (pair != null && !((java.lang.String) pair.first).equals(c17)) {
                        a((java.lang.String) this.f50247c.first);
                    }
                    if (this.f50247c == null) {
                        this.f50247c = new android.util.Pair<>(c17, new java.lang.StringBuilder());
                    }
                    java.lang.StringBuilder sb6 = (java.lang.StringBuilder) this.f50247c.second;
                    sb6.append(bVar.a());
                    sb6.append(bVar.f50255a);
                    sb6.append("\n");
                    if (sb6.length() < 10240) {
                        return false;
                    }
                    a(c17, sb6.toString());
                    this.f50247c = null;
                    return false;
                default:
                    return false;
            }
            if (com.tencent.mapsdk.internal.kz.f50227g == null) {
                return false;
            }
            d();
            return false;
        }

        private void a(com.tencent.mapsdk.internal.kz.b bVar) {
            java.lang.String c17 = c();
            android.util.Pair<java.lang.String, java.lang.StringBuilder> pair = this.f50247c;
            if (pair != null && !((java.lang.String) pair.first).equals(c17)) {
                a((java.lang.String) this.f50247c.first);
            }
            if (this.f50247c == null) {
                this.f50247c = new android.util.Pair<>(c17, new java.lang.StringBuilder());
            }
            java.lang.StringBuilder sb6 = (java.lang.StringBuilder) this.f50247c.second;
            sb6.append(bVar.a());
            sb6.append(bVar.f50255a);
            sb6.append("\n");
            if (sb6.length() >= 10240) {
                a(c17, sb6.toString());
                this.f50247c = null;
            }
        }

        private void a(java.lang.String str) {
            java.lang.Object obj;
            android.util.Pair<java.lang.String, java.lang.StringBuilder> pair = this.f50247c;
            if (pair == null || (obj = pair.second) == null || ((java.lang.StringBuilder) obj).length() == 0) {
                return;
            }
            java.lang.StringBuilder sb6 = (java.lang.StringBuilder) this.f50247c.second;
            sb6.append("\n====================================== \n");
            a(str, sb6.toString());
            this.f50247c = null;
        }

        private static void a(java.lang.String str, java.lang.String str2) {
            java.io.File file = new java.io.File(com.tencent.mapsdk.internal.kz.f50227g, str);
            if (!file.exists()) {
                com.tencent.mapsdk.internal.ks.a(file);
                str2 = b() + str2;
            }
            com.tencent.mapsdk.internal.ks.c(file, str2);
        }
    };

    /* renamed from: com.tencent.mapsdk.internal.kz$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass2 implements java.io.FileFilter {
        public AnonymousClass2() {
        }

        @Override // java.io.FileFilter
        public final boolean accept(java.io.File file) {
            return java.util.regex.Pattern.compile("log-.*.log").matcher(file.getName()).matches();
        }
    }

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f50248a = android.os.Process.myPid();

        /* renamed from: b, reason: collision with root package name */
        private final java.lang.String f50249b;

        /* renamed from: c, reason: collision with root package name */
        private final java.lang.String f50250c;

        /* renamed from: d, reason: collision with root package name */
        private final java.lang.String f50251d;

        /* renamed from: e, reason: collision with root package name */
        private final java.lang.Throwable f50252e;

        /* renamed from: f, reason: collision with root package name */
        private final int f50253f;

        public a(int i17, java.lang.String str, java.lang.String str2, java.lang.Throwable th6, int i18) {
            java.lang.String str3;
            switch (i17) {
                case 2:
                    str3 = "VERBOSE";
                    break;
                case 3:
                    str3 = "DEBUG";
                    break;
                case 4:
                    str3 = "INFO";
                    break;
                case 5:
                    str3 = "WARN";
                    break;
                case 6:
                    str3 = "ERROR";
                    break;
                case 7:
                    str3 = "ASSERT";
                    break;
                default:
                    str3 = "";
                    break;
            }
            this.f50249b = str3;
            this.f50250c = str;
            this.f50251d = str2;
            this.f50252e = th6;
            this.f50253f = i18;
        }

        private static java.lang.String a(int i17) {
            switch (i17) {
                case 2:
                    return "VERBOSE";
                case 3:
                    return "DEBUG";
                case 4:
                    return "INFO";
                case 5:
                    return "WARN";
                case 6:
                    return "ERROR";
                case 7:
                    return "ASSERT";
                default:
                    return "";
            }
        }

        private java.lang.String b() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f50248a);
            sb6.append('[');
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append('-');
            sb6.append(java.lang.Thread.currentThread().getId());
            sb6.append("][");
            sb6.append(this.f50253f);
            sb6.append("]|");
            sb6.append(this.f50249b);
            sb6.append('|');
            sb6.append(this.f50250c);
            sb6.append('|');
            sb6.append(this.f50251d);
            if (this.f50252e != null) {
                sb6.append('\n');
                sb6.append(android.util.Log.getStackTraceString(this.f50252e));
            }
            return sb6.toString();
        }

        public final com.tencent.mapsdk.internal.kz.b a() {
            com.tencent.mapsdk.internal.kz.b bVar = new com.tencent.mapsdk.internal.kz.b();
            bVar.f50255a = b();
            return bVar;
        }
    }

    /* loaded from: classes13.dex */
    public static class b {

        /* renamed from: b, reason: collision with root package name */
        private static final java.text.SimpleDateFormat f50254b = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.CHINA);

        /* renamed from: a, reason: collision with root package name */
        public java.lang.String f50255a;

        /* renamed from: c, reason: collision with root package name */
        private final long f50256c = java.lang.System.currentTimeMillis();

        public final java.lang.String a() {
            return f50254b.format(java.lang.Long.valueOf(this.f50256c)) + " : ";
        }
    }

    public kz(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions, int i17) {
        super(context, tencentMapOptions);
        com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig loggerConfig;
        this.f50238j = false;
        this.f50239k = false;
        this.f50240l = 6;
        this.f50241m = new java.lang.String[]{com.tencent.mapsdk.internal.la.a.f50260a, com.tencent.mapsdk.internal.la.a.f50261b, com.tencent.mapsdk.internal.la.a.f50262c, com.tencent.mapsdk.internal.la.a.f50263d, com.tencent.mapsdk.internal.la.a.f50264e, com.tencent.mapsdk.internal.la.a.f50265f, com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.la.a.f50267h, com.tencent.mapsdk.internal.kx.f50204e};
        this.f50233c = null;
        this.f50234d = true;
        this.f50236h = context;
        this.f50235e = tencentMapOptions;
        this.f50242n = i17;
        if (tencentMapOptions != null && (loggerConfig = tencentMapOptions.getLoggerConfig()) != null) {
            boolean isToFile = loggerConfig.isToFile();
            boolean isToConsole = loggerConfig.isToConsole();
            int level = loggerConfig.getLevel();
            java.lang.String[] tags = loggerConfig.getTags();
            com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.LogCallback logCallback = loggerConfig.getLogCallback();
            if (this.f50234d) {
                this.f50234d = false;
                java.io.File file = new java.io.File(com.tencent.mapsdk.internal.mz.a(context, this.f50235e).c().getAbsolutePath());
                if (com.tencent.mapsdk.internal.kk.a("5.10.0", "4.3.4", 3) < 0) {
                    com.tencent.mapsdk.internal.ks.a(file, new com.tencent.mapsdk.internal.kz.AnonymousClass2());
                }
                if (isToFile || isToConsole || logCallback != null) {
                    if (isToFile) {
                        f50227g = com.tencent.mapsdk.internal.ks.a(file, "logs");
                    }
                    this.f50238j = isToFile;
                    this.f50239k = isToConsole;
                    this.f50240l = level;
                    if (tags != null && tags.length > 0) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.addAll(java.util.Arrays.asList(this.f50241m));
                        arrayList.addAll(java.util.Arrays.asList(tags));
                        this.f50241m = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
                    }
                    this.f50233c = logCallback;
                    android.os.HandlerThread handlerThread = f50228o;
                    if (!handlerThread.isAlive()) {
                        handlerThread.start();
                    }
                    android.os.Handler handler = new android.os.Handler(handlerThread.getLooper(), f50232s);
                    f50226f = handler;
                    handler.sendEmptyMessage(-103);
                }
            }
        }
        if (com.tencent.mapsdk.internal.tf.f51582d) {
            java.lang.Thread.setDefaultUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() { // from class: com.tencent.mapsdk.internal.kz.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
                    com.tencent.mapsdk.internal.kw.a(6, com.tencent.mapsdk.internal.kx.f50203d, "UncaughtException: t[" + thread + "]", th6);
                    throw new java.lang.RuntimeException(th6);
                }
            });
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void a(android.content.Context context, com.tencent.mapsdk.internal.kp.a aVar) {
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void b(java.lang.String str) {
        if (a(3, com.tencent.mapsdk.internal.kx.f50203d)) {
            b(3, com.tencent.mapsdk.internal.kx.f50203d, str, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void c(java.lang.String str) {
        if (a(4, com.tencent.mapsdk.internal.kx.f50203d)) {
            b(4, com.tencent.mapsdk.internal.kx.f50203d, str, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void d(java.lang.String str) {
        if (a(5, com.tencent.mapsdk.internal.kx.f50203d)) {
            b(5, com.tencent.mapsdk.internal.kx.f50203d, str, null);
        }
    }

    private void a(boolean z17, boolean z18, int i17, java.lang.String[] strArr, com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.LogCallback logCallback) {
        if (this.f50234d) {
            this.f50234d = false;
            java.io.File file = new java.io.File(com.tencent.mapsdk.internal.mz.a(this.f50236h, this.f50235e).c().getAbsolutePath());
            if (com.tencent.mapsdk.internal.kk.a("5.10.0", "4.3.4", 3) < 0) {
                com.tencent.mapsdk.internal.ks.a(file, new com.tencent.mapsdk.internal.kz.AnonymousClass2());
            }
            if (z17 || z18 || logCallback != null) {
                if (z17) {
                    f50227g = com.tencent.mapsdk.internal.ks.a(file, "logs");
                }
                this.f50238j = z17;
                this.f50239k = z18;
                this.f50240l = i17;
                if (strArr != null && strArr.length > 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.addAll(java.util.Arrays.asList(this.f50241m));
                    arrayList.addAll(java.util.Arrays.asList(strArr));
                    this.f50241m = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
                }
                this.f50233c = logCallback;
                android.os.HandlerThread handlerThread = f50228o;
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                }
                android.os.Handler handler = new android.os.Handler(handlerThread.getLooper(), f50232s);
                f50226f = handler;
                handler.sendEmptyMessage(-103);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void e(java.lang.String str) {
        if (a(6, com.tencent.mapsdk.internal.kx.f50203d)) {
            b(6, com.tencent.mapsdk.internal.kx.f50203d, str, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void b(java.lang.String str, java.lang.Throwable th6) {
        if (a(3, com.tencent.mapsdk.internal.kx.f50203d)) {
            b(3, com.tencent.mapsdk.internal.kx.f50203d, str, th6);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void c(java.lang.String str, java.lang.Throwable th6) {
        if (a(4, com.tencent.mapsdk.internal.kx.f50203d)) {
            b(4, com.tencent.mapsdk.internal.kx.f50203d, str, th6);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void d(java.lang.String str, java.lang.Throwable th6) {
        if (a(5, com.tencent.mapsdk.internal.kx.f50203d)) {
            b(5, com.tencent.mapsdk.internal.kx.f50203d, str, th6);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void e(java.lang.String str, java.lang.Throwable th6) {
        if (a(6, com.tencent.mapsdk.internal.kx.f50203d)) {
            b(6, com.tencent.mapsdk.internal.kx.f50203d, str, th6);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void b(java.lang.String str, java.lang.String str2) {
        if (a(3, str)) {
            b(3, str, str2, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void c(java.lang.String str, java.lang.String str2) {
        if (a(4, str)) {
            b(4, str, str2, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void d(java.lang.String str, java.lang.String str2) {
        if (a(5, str)) {
            b(5, str, str2, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void e(java.lang.String str, java.lang.String str2) {
        if (a(6, str)) {
            b(6, str, str2, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void b(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(3, str)) {
            b(3, str, str2, th6);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void c(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(4, str)) {
            b(4, str, str2, th6);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(5, str)) {
            b(5, str, str2, th6);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(6, str)) {
            b(6, str, str2, th6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(int r7, java.lang.String r8, java.lang.String r9, java.lang.Throwable r10) {
        /*
            r6 = this;
            java.lang.String r0 = "TMS"
            boolean r1 = r0.equals(r8)
            if (r1 != 0) goto L1a
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto L10
            r2 = r0
            goto L1b
        L10:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "TMS-"
            java.lang.String r8 = r0.concat(r8)
        L1a:
            r2 = r8
        L1b:
            boolean r8 = r6.f50239k
            if (r8 == 0) goto L22
            r6.c(r7, r2, r9, r10)
        L22:
            com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig$LogCallback r8 = r6.f50233c
            if (r8 != 0) goto L2b
            boolean r8 = r6.f50238j
            if (r8 != 0) goto L2b
            return
        L2b:
            com.tencent.mapsdk.internal.kz$a r8 = new com.tencent.mapsdk.internal.kz$a
            int r5 = r6.f50242n
            r0 = r8
            r1 = r7
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.tencent.mapsdk.internal.kz$b r7 = r8.a()
            com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig$LogCallback r8 = r6.f50233c
            if (r8 == 0) goto L56
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r7.a()
            r9.append(r10)
            java.lang.String r10 = r7.f50255a
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.onLog(r9)
        L56:
            boolean r8 = r6.f50238j
            if (r8 == 0) goto L6b
            android.os.Message r8 = android.os.Message.obtain()
            r9 = -101(0xffffffffffffff9b, float:NaN)
            r8.what = r9
            r8.obj = r7
            android.os.Handler r7 = com.tencent.mapsdk.internal.kz.f50226f
            if (r7 == 0) goto L6b
            r7.sendMessage(r8)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.kz.b(int, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    private void c(int i17, java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (th6 != null) {
            switch (i17) {
                case 7:
                    android.util.Log.wtf(str, str2, th6);
                    break;
            }
        } else {
            android.util.Log.println(i17, str, str2);
        }
        if (this.f50237i) {
            if (th6 != null) {
                str2 = str2 + " [error]:" + th6.getMessage();
            }
            java.lang.System.out.println("[" + str + "]:" + str2);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void d() {
        if (this.f50234d) {
            return;
        }
        this.f50234d = true;
        this.f50233c = null;
        this.f50235e = null;
        android.os.Handler handler = f50226f;
        if (handler != null) {
            handler.sendEmptyMessage(-102);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final java.lang.String c() {
        return f50227g.getAbsolutePath();
    }

    private boolean a(java.lang.String str, int i17) {
        boolean z17 = false;
        for (java.lang.String str2 : this.f50241m) {
            if (str2.equals(str)) {
                z17 = true;
            }
        }
        return z17 && i17 >= this.f50240l;
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void a(java.lang.String str) {
        if (a(2, com.tencent.mapsdk.internal.kx.f50203d)) {
            b(2, com.tencent.mapsdk.internal.kx.f50203d, str, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void a(java.lang.String str, java.lang.Throwable th6) {
        if (a(2, com.tencent.mapsdk.internal.kx.f50203d)) {
            b(2, com.tencent.mapsdk.internal.kx.f50203d, str, th6);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void a(java.lang.String str, java.lang.String str2) {
        if (a(2, str)) {
            b(2, str, str2, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void a(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(2, str)) {
            b(2, str, str2, th6);
        }
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final void a(boolean z17) {
        this.f50237i = z17;
    }

    @Override // com.tencent.mapsdk.internal.kw, com.tencent.mapsdk.internal.ky
    public final boolean a(int i17, java.lang.String str) {
        boolean z17 = false;
        for (java.lang.String str2 : this.f50241m) {
            if (str2.equals(str)) {
                z17 = true;
            }
        }
        return (z17 && i17 >= this.f50240l) || this.f50195b || (com.tencent.mapsdk.internal.tf.f51582d && !com.tencent.mapsdk.internal.kw.f50193a.contains(str));
    }
}

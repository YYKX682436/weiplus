package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class kz extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw {

    /* renamed from: g, reason: collision with root package name */
    private static java.io.File f131760g = null;

    /* renamed from: p, reason: collision with root package name */
    private static final int f131762p = -101;

    /* renamed from: q, reason: collision with root package name */
    private static final int f131763q = -102;

    /* renamed from: r, reason: collision with root package name */
    private static final int f131764r = -103;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.LogCallback f131766c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f131767d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 f131768e;

    /* renamed from: h, reason: collision with root package name */
    private final android.content.Context f131769h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f131770i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f131771j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f131772k;

    /* renamed from: l, reason: collision with root package name */
    private int f131773l;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String[] f131774m;

    /* renamed from: n, reason: collision with root package name */
    private final int f131775n;

    /* renamed from: o, reason: collision with root package name */
    private static final android.os.HandlerThread f131761o = new android.os.HandlerThread("core-log-thread");

    /* renamed from: f, reason: collision with root package name */
    public static android.os.Handler f131759f = null;

    /* renamed from: s, reason: collision with root package name */
    private static final android.os.Handler.Callback f131765s = new android.os.Handler.Callback() { // from class: com.tencent.mapsdk.internal.kz.3

        /* renamed from: a, reason: collision with root package name */
        public static final java.lang.String f131778a = "LOG-";

        /* renamed from: b, reason: collision with root package name */
        public final java.text.SimpleDateFormat f131779b = new java.text.SimpleDateFormat("yyyy_MM_dd", java.util.Locale.CHINA);

        /* renamed from: c, reason: collision with root package name */
        private android.util.Pair<java.lang.String, java.lang.StringBuilder> f131780c;

        private java.lang.String a() {
            return this.f131779b.format(new java.util.Date());
        }

        private static java.lang.String b() {
            return "###########\n" + (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133121j + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133120i + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133114c + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133113b + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133126o) + "\n###########\n" + (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.h() + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.d() + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.e() + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.l() + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.c() + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.j() + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f() + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.g() + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.m() + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.k() + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() + ", " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.b()) + "\n###########\n";
        }

        private java.lang.String c() {
            return f131778a.concat(java.lang.String.valueOf(a()));
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
                java.io.File[] e17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz.f131760g, "LOG.*" + str + ".*");
                if (e17 != null && e17.length > 0) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kv.a(e17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz.f131760g, "archive-".concat(java.lang.String.valueOf(str)));
                }
            }
            calendar.setTime(date);
            sb6.deleteCharAt(sb6.lastIndexOf("|")).append(")");
            sb7.deleteCharAt(sb7.lastIndexOf("|")).append(")");
            java.lang.String str2 = "archive-" + sb6.toString() + "_" + sb7.toString() + ".zip";
            java.io.File[] e18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz.f131760g, "archive-.*.zip");
            if (e18 != null) {
                for (java.io.File file : e18) {
                    if (!file.getName().matches(str2)) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file);
                    }
                }
            }
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("(");
            java.lang.String str3 = "(" + calendar.get(1) + ")";
            sb10.append(java.lang.String.format(java.util.Locale.CHINA, "%02d", java.lang.Integer.valueOf(calendar.get(2) + 1)));
            sb10.append(")");
            java.lang.String str4 = f131778a + str3 + "_" + ((java.lang.Object) sb10) + "_.*";
            java.io.File[] e19 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz.f131760g, "LOG.*");
            if (e19 == null || e19.length <= 0) {
                return;
            }
            for (java.io.File file2 : e19) {
                if (!file2.getName().matches(str4)) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file2);
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
                    android.util.Pair<java.lang.String, java.lang.StringBuilder> pair = this.f131780c;
                    if (pair != null && !((java.lang.String) pair.first).equals(c17)) {
                        a((java.lang.String) this.f131780c.first);
                    }
                    if (this.f131780c == null) {
                        this.f131780c = new android.util.Pair<>(c17, new java.lang.StringBuilder());
                    }
                    java.lang.StringBuilder sb6 = (java.lang.StringBuilder) this.f131780c.second;
                    sb6.append(bVar.a());
                    sb6.append(bVar.f131788a);
                    sb6.append("\n");
                    if (sb6.length() < 10240) {
                        return false;
                    }
                    a(c17, sb6.toString());
                    this.f131780c = null;
                    return false;
                default:
                    return false;
            }
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz.f131760g == null) {
                return false;
            }
            d();
            return false;
        }

        private void a(com.tencent.mapsdk.internal.kz.b bVar) {
            java.lang.String c17 = c();
            android.util.Pair<java.lang.String, java.lang.StringBuilder> pair = this.f131780c;
            if (pair != null && !((java.lang.String) pair.first).equals(c17)) {
                a((java.lang.String) this.f131780c.first);
            }
            if (this.f131780c == null) {
                this.f131780c = new android.util.Pair<>(c17, new java.lang.StringBuilder());
            }
            java.lang.StringBuilder sb6 = (java.lang.StringBuilder) this.f131780c.second;
            sb6.append(bVar.a());
            sb6.append(bVar.f131788a);
            sb6.append("\n");
            if (sb6.length() >= 10240) {
                a(c17, sb6.toString());
                this.f131780c = null;
            }
        }

        private void a(java.lang.String str) {
            java.lang.Object obj;
            android.util.Pair<java.lang.String, java.lang.StringBuilder> pair = this.f131780c;
            if (pair == null || (obj = pair.second) == null || ((java.lang.StringBuilder) obj).length() == 0) {
                return;
            }
            java.lang.StringBuilder sb6 = (java.lang.StringBuilder) this.f131780c.second;
            sb6.append("\n====================================== \n");
            a(str, sb6.toString());
            this.f131780c = null;
        }

        private static void a(java.lang.String str, java.lang.String str2) {
            java.io.File file = new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz.f131760g, str);
            if (!file.exists()) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file);
                str2 = b() + str2;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(file, str2);
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
        private final int f131781a = android.os.Process.myPid();

        /* renamed from: b, reason: collision with root package name */
        private final java.lang.String f131782b;

        /* renamed from: c, reason: collision with root package name */
        private final java.lang.String f131783c;

        /* renamed from: d, reason: collision with root package name */
        private final java.lang.String f131784d;

        /* renamed from: e, reason: collision with root package name */
        private final java.lang.Throwable f131785e;

        /* renamed from: f, reason: collision with root package name */
        private final int f131786f;

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
            this.f131782b = str3;
            this.f131783c = str;
            this.f131784d = str2;
            this.f131785e = th6;
            this.f131786f = i18;
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
            sb6.append(this.f131781a);
            sb6.append('[');
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append('-');
            sb6.append(java.lang.Thread.currentThread().getId());
            sb6.append("][");
            sb6.append(this.f131786f);
            sb6.append("]|");
            sb6.append(this.f131782b);
            sb6.append('|');
            sb6.append(this.f131783c);
            sb6.append('|');
            sb6.append(this.f131784d);
            if (this.f131785e != null) {
                sb6.append('\n');
                sb6.append(android.util.Log.getStackTraceString(this.f131785e));
            }
            return sb6.toString();
        }

        public final com.tencent.mapsdk.internal.kz.b a() {
            com.tencent.mapsdk.internal.kz.b bVar = new com.tencent.mapsdk.internal.kz.b();
            bVar.f131788a = b();
            return bVar;
        }
    }

    /* loaded from: classes13.dex */
    public static class b {

        /* renamed from: b, reason: collision with root package name */
        private static final java.text.SimpleDateFormat f131787b = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.CHINA);

        /* renamed from: a, reason: collision with root package name */
        public java.lang.String f131788a;

        /* renamed from: c, reason: collision with root package name */
        private final long f131789c = java.lang.System.currentTimeMillis();

        public final java.lang.String a() {
            return f131787b.format(java.lang.Long.valueOf(this.f131789c)) + " : ";
        }
    }

    public kz(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7, int i17) {
        super(context, c25966x7e4576a7);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12 m99200x23248b68;
        this.f131771j = false;
        this.f131772k = false;
        this.f131773l = 6;
        this.f131774m = new java.lang.String[]{com.tencent.mapsdk.internal.la.a.f131793a, com.tencent.mapsdk.internal.la.a.f131794b, com.tencent.mapsdk.internal.la.a.f131795c, com.tencent.mapsdk.internal.la.a.f131796d, com.tencent.mapsdk.internal.la.a.f131797e, com.tencent.mapsdk.internal.la.a.f131798f, com.tencent.mapsdk.internal.la.a.f131799g, com.tencent.mapsdk.internal.la.a.f131800h, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131737e};
        this.f131766c = null;
        this.f131767d = true;
        this.f131769h = context;
        this.f131768e = c25966x7e4576a7;
        this.f131775n = i17;
        if (c25966x7e4576a7 != null && (m99200x23248b68 = c25966x7e4576a7.m99200x23248b68()) != null) {
            boolean m99606xf45cb461 = m99200x23248b68.m99606xf45cb461();
            boolean m99605x1bd18052 = m99200x23248b68.m99605x1bd18052();
            int m99602x74bf41ce = m99200x23248b68.m99602x74bf41ce();
            java.lang.String[] m99604xfb859c8f = m99200x23248b68.m99604xfb859c8f();
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.LogCallback m99603x3748ea73 = m99200x23248b68.m99603x3748ea73();
            if (this.f131767d) {
                this.f131767d = false;
                java.io.File file = new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(context, this.f131768e).c().getAbsolutePath());
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kk.a("5.10.0", "4.3.4", 3) < 0) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file, new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz.AnonymousClass2());
                }
                if (m99606xf45cb461 || m99605x1bd18052 || m99603x3748ea73 != null) {
                    if (m99606xf45cb461) {
                        f131760g = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file, "logs");
                    }
                    this.f131771j = m99606xf45cb461;
                    this.f131772k = m99605x1bd18052;
                    this.f131773l = m99602x74bf41ce;
                    if (m99604xfb859c8f != null && m99604xfb859c8f.length > 0) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.addAll(java.util.Arrays.asList(this.f131774m));
                        arrayList.addAll(java.util.Arrays.asList(m99604xfb859c8f));
                        this.f131774m = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
                    }
                    this.f131766c = m99603x3748ea73;
                    android.os.HandlerThread handlerThread = f131761o;
                    if (!handlerThread.isAlive()) {
                        handlerThread.start();
                    }
                    android.os.Handler handler = new android.os.Handler(handlerThread.getLooper(), f131765s);
                    f131759f = handler;
                    handler.sendEmptyMessage(-103);
                }
            }
        }
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133115d) {
            java.lang.Thread.setDefaultUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() { // from class: com.tencent.mapsdk.internal.kz.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw.a(6, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, "UncaughtException: t[" + thread + "]", th6);
                    throw new java.lang.RuntimeException(th6);
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void a(android.content.Context context, com.tencent.mapsdk.internal.kp.a aVar) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void b(java.lang.String str) {
        if (a(3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d)) {
            b(3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, str, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void c(java.lang.String str) {
        if (a(4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d)) {
            b(4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, str, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void d(java.lang.String str) {
        if (a(5, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d)) {
            b(5, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, str, null);
        }
    }

    private void a(boolean z17, boolean z18, int i17, java.lang.String[] strArr, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.LogCallback logCallback) {
        if (this.f131767d) {
            this.f131767d = false;
            java.io.File file = new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(this.f131769h, this.f131768e).c().getAbsolutePath());
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kk.a("5.10.0", "4.3.4", 3) < 0) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file, new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz.AnonymousClass2());
            }
            if (z17 || z18 || logCallback != null) {
                if (z17) {
                    f131760g = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file, "logs");
                }
                this.f131771j = z17;
                this.f131772k = z18;
                this.f131773l = i17;
                if (strArr != null && strArr.length > 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.addAll(java.util.Arrays.asList(this.f131774m));
                    arrayList.addAll(java.util.Arrays.asList(strArr));
                    this.f131774m = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
                }
                this.f131766c = logCallback;
                android.os.HandlerThread handlerThread = f131761o;
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                }
                android.os.Handler handler = new android.os.Handler(handlerThread.getLooper(), f131765s);
                f131759f = handler;
                handler.sendEmptyMessage(-103);
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void e(java.lang.String str) {
        if (a(6, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d)) {
            b(6, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, str, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void b(java.lang.String str, java.lang.Throwable th6) {
        if (a(3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d)) {
            b(3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, str, th6);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void c(java.lang.String str, java.lang.Throwable th6) {
        if (a(4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d)) {
            b(4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, str, th6);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void d(java.lang.String str, java.lang.Throwable th6) {
        if (a(5, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d)) {
            b(5, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, str, th6);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void e(java.lang.String str, java.lang.Throwable th6) {
        if (a(6, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d)) {
            b(6, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, str, th6);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void b(java.lang.String str, java.lang.String str2) {
        if (a(3, str)) {
            b(3, str, str2, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void c(java.lang.String str, java.lang.String str2) {
        if (a(4, str)) {
            b(4, str, str2, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void d(java.lang.String str, java.lang.String str2) {
        if (a(5, str)) {
            b(5, str, str2, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void e(java.lang.String str, java.lang.String str2) {
        if (a(6, str)) {
            b(6, str, str2, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void b(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(3, str)) {
            b(3, str, str2, th6);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void c(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(4, str)) {
            b(4, str, str2, th6);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(5, str)) {
            b(5, str, str2, th6);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
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
            boolean r8 = r6.f131772k
            if (r8 == 0) goto L22
            r6.c(r7, r2, r9, r10)
        L22:
            com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig$LogCallback r8 = r6.f131766c
            if (r8 != 0) goto L2b
            boolean r8 = r6.f131771j
            if (r8 != 0) goto L2b
            return
        L2b:
            com.tencent.mapsdk.internal.kz$a r8 = new com.tencent.mapsdk.internal.kz$a
            int r5 = r6.f131775n
            r0 = r8
            r1 = r7
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.tencent.mapsdk.internal.kz$b r7 = r8.a()
            com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig$LogCallback r8 = r6.f131766c
            if (r8 == 0) goto L56
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r7.a()
            r9.append(r10)
            java.lang.String r10 = r7.f131788a
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.mo99613x64f5ce5(r9)
        L56:
            boolean r8 = r6.f131771j
            if (r8 == 0) goto L6b
            android.os.Message r8 = android.os.Message.obtain()
            r9 = -101(0xffffffffffffff9b, float:NaN)
            r8.what = r9
            r8.obj = r7
            android.os.Handler r7 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz.f131759f
            if (r7 == 0) goto L6b
            r7.sendMessage(r8)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz.b(int, java.lang.String, java.lang.String, java.lang.Throwable):void");
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
        if (this.f131770i) {
            if (th6 != null) {
                str2 = str2 + " [error]:" + th6.getMessage();
            }
            java.lang.System.out.println("[" + str + "]:" + str2);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void d() {
        if (this.f131767d) {
            return;
        }
        this.f131767d = true;
        this.f131766c = null;
        this.f131768e = null;
        android.os.Handler handler = f131759f;
        if (handler != null) {
            handler.sendEmptyMessage(-102);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final java.lang.String c() {
        return f131760g.getAbsolutePath();
    }

    private boolean a(java.lang.String str, int i17) {
        boolean z17 = false;
        for (java.lang.String str2 : this.f131774m) {
            if (str2.equals(str)) {
                z17 = true;
            }
        }
        return z17 && i17 >= this.f131773l;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void a(java.lang.String str) {
        if (a(2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d)) {
            b(2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, str, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void a(java.lang.String str, java.lang.Throwable th6) {
        if (a(2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d)) {
            b(2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, str, th6);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void a(java.lang.String str, java.lang.String str2) {
        if (a(2, str)) {
            b(2, str, str2, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void a(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(2, str)) {
            b(2, str, str2, th6);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void a(boolean z17) {
        this.f131770i = z17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final boolean a(int i17, java.lang.String str) {
        boolean z17 = false;
        for (java.lang.String str2 : this.f131774m) {
            if (str2.equals(str)) {
                z17 = true;
            }
        }
        return (z17 && i17 >= this.f131773l) || this.f131728b || (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133115d && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw.f131726a.contains(str));
    }
}

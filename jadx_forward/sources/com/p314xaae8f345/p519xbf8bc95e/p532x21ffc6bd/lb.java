package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class lb implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la {

    /* renamed from: ac, reason: collision with root package name */
    private static final java.util.HashSet<java.lang.String> f131801ac = new java.util.HashSet<>();

    /* renamed from: ad, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.lk.g<com.tencent.mapsdk.internal.lb.a> f131802ad;

    /* renamed from: ae, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f131803ae;

    /* renamed from: af, reason: collision with root package name */
    private static final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c>> f131804af;

    /* renamed from: ag, reason: collision with root package name */
    private static final java.util.Map<java.lang.String, java.lang.StringBuilder> f131805ag;

    /* loaded from: classes13.dex */
    public static class a implements com.tencent.mapsdk.internal.lk.h {

        /* renamed from: a, reason: collision with root package name */
        int f131806a = 3;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f131807b = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131737e;

        private com.tencent.mapsdk.internal.lb.a a(java.lang.String str) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.f131803ae.incrementAndGet();
            this.f131807b = str;
            return this;
        }

        private com.tencent.mapsdk.internal.lb.a a(int i17) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.f131803ae.incrementAndGet();
            this.f131806a = i17;
            return this;
        }

        public final void a(java.lang.Object... objArr) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.f131803ae.incrementAndGet();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.b(this.f131806a, this.f131807b, objArr);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.f131802ad.a(this);
        }

        @Override // com.tencent.mapsdk.internal.lk.h
        public final com.tencent.mapsdk.internal.lk.l a() {
            return new com.tencent.mapsdk.internal.lk.d();
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes13.dex */
    public static class c {

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f131809b;

        /* renamed from: d, reason: collision with root package name */
        com.tencent.mapsdk.internal.lb.b f131811d;

        /* renamed from: f, reason: collision with root package name */
        java.lang.String f131813f;

        /* renamed from: g, reason: collision with root package name */
        java.lang.String f131814g;

        /* renamed from: h, reason: collision with root package name */
        private java.lang.String f131815h;

        /* renamed from: c, reason: collision with root package name */
        java.util.List<java.lang.Long> f131810c = new java.util.concurrent.CopyOnWriteArrayList();

        /* renamed from: a, reason: collision with root package name */
        java.util.concurrent.atomic.AtomicInteger f131808a = new java.util.concurrent.atomic.AtomicInteger(0);

        /* renamed from: e, reason: collision with root package name */
        final java.util.Map<java.lang.String, java.lang.Object> f131812e = new java.util.concurrent.ConcurrentHashMap();

        public c(java.lang.String str, java.lang.String str2) {
            this.f131815h = str;
            this.f131809b = str2;
        }

        /* renamed from: toString */
        public final java.lang.String m36818x9616526c() {
            return "TraceInfo{id='" + this.f131809b + "', values=" + this.f131812e + '}';
        }

        public final java.lang.Object b(java.lang.String str) {
            return this.f131812e.get(str);
        }

        public final boolean a(java.lang.String str) {
            return this.f131809b.equals(str);
        }

        public final void b() {
            this.f131808a.set(0);
            this.f131810c.clear();
            this.f131811d = null;
            this.f131812e.clear();
        }

        public final java.lang.String a() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
            if (!android.text.TextUtils.isEmpty(this.f131814g)) {
                sb6.append(this.f131814g);
            }
            if (!this.f131815h.equals(this.f131809b)) {
                sb6.append("|");
                sb6.append(this.f131815h);
                sb6.append("|");
                sb6.append(this.f131809b);
            } else {
                sb6.append("|");
                sb6.append(this.f131815h);
            }
            if (!android.text.TextUtils.isEmpty(this.f131813f)) {
                sb6.append("|");
                sb6.append(this.f131813f);
            }
            sb6.append("]");
            return sb6.toString();
        }

        public final void a(java.lang.String str, java.lang.Object obj) {
            if (android.text.TextUtils.isEmpty(str) || obj == null) {
                return;
            }
            this.f131812e.put(str, obj);
        }
    }

    static {
        b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131749q);
        b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131751s);
        b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131753u);
        f131802ad = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lk.a(30, new com.tencent.mapsdk.internal.lk.e<com.tencent.mapsdk.internal.lb.a>() { // from class: com.tencent.mapsdk.internal.lb.1
            private static com.tencent.mapsdk.internal.lb.a b() {
                return new com.tencent.mapsdk.internal.lb.a();
            }

            @Override // com.tencent.mapsdk.internal.lk.e
            public final /* synthetic */ com.tencent.mapsdk.internal.lb.a a() {
                return new com.tencent.mapsdk.internal.lb.a();
            }
        });
        f131803ae = new java.util.concurrent.atomic.AtomicInteger();
        f131804af = java.util.Collections.synchronizedMap(new java.util.Hashtable());
        f131805ag = new java.util.concurrent.ConcurrentHashMap();
    }

    private static java.lang.String c(java.lang.String str) {
        return str;
    }

    public static int d(java.lang.String str, java.lang.String str2, int i17) {
        if (e(str, i17) && e(str, i17)) {
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f131804af.get(str);
            com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str) : null;
            if (cVar != null) {
                java.lang.Object b17 = cVar.b(str2);
                if (b17 instanceof java.util.concurrent.atomic.AtomicInteger) {
                    return ((java.util.concurrent.atomic.AtomicInteger) b17).get();
                }
            }
        }
        return 0;
    }

    private static java.lang.String e(java.lang.String str) {
        return str;
    }

    private static java.lang.String f(java.lang.String str, int i17) {
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(str) || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133115d) {
            return str;
        }
        java.util.List<java.lang.String> d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.d(new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(), "kv"));
        if (d17 != null && !d17.isEmpty() && !android.text.TextUtils.isEmpty(d17.get(0))) {
            str2 = d17.get(0);
        } else {
            try {
                java.lang.String a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lc.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.a() + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133121j + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133120i + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133114c + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133113b);
                try {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(i17).b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131737e, a17);
                } catch (java.io.UnsupportedEncodingException | java.security.NoSuchAlgorithmException unused) {
                }
                str2 = a17;
            } catch (java.io.UnsupportedEncodingException | java.security.NoSuchAlgorithmException unused2) {
                str2 = null;
            }
        }
        try {
            if (!android.text.TextUtils.isEmpty(str2)) {
                return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lc.a(str2, str);
            }
        } catch (java.security.GeneralSecurityException unused3) {
        }
        return "";
    }

    private static int g(java.lang.String str, java.lang.String str2, int i17) {
        if (e(str, i17) && e(str, i17)) {
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f131804af.get(str);
            com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str) : null;
            if (cVar != null) {
                java.lang.Object b17 = cVar.b(str2);
                if (b17 instanceof java.util.concurrent.atomic.AtomicInteger) {
                    java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) b17;
                    int decrementAndGet = atomicInteger.decrementAndGet();
                    if (decrementAndGet >= 0) {
                        return decrementAndGet;
                    }
                    atomicInteger.set(0);
                    return 0;
                }
            }
        }
        return -1;
    }

    private static long h(java.lang.String str, java.lang.String str2, int i17) {
        if (e(str, i17)) {
            return a(str, str, str2, "", null, i17);
        }
        return 0L;
    }

    public static void b(java.lang.String str, int i17) {
        if (e(str, i17)) {
            a(str, str, (com.tencent.mapsdk.internal.lb.b) null, i17);
        }
    }

    private static boolean c() {
        return com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131737e);
    }

    private static boolean e(java.lang.String str, int i17) {
        return com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(i17).a(4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131737e) && !f131801ac.contains(str);
    }

    public static void a(java.lang.String str, int i17) {
        if (e(str, i17)) {
            a(str, str, (com.tencent.mapsdk.internal.lb.b) null, i17);
        }
    }

    public static java.lang.Object c(java.lang.String str, java.lang.String str2, int i17) {
        if (e(str, i17) && e(str, i17)) {
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f131804af.get(str);
            com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str) : null;
            if (cVar != null) {
                return cVar.b(str2);
            }
        }
        return null;
    }

    public static int e(java.lang.String str, java.lang.String str2, int i17) {
        if (e(str, i17) && e(str, i17)) {
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f131804af.get(str);
            com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str) : null;
            if (cVar != null) {
                java.lang.Object b17 = cVar.b(str2);
                if (b17 instanceof java.util.concurrent.atomic.AtomicInteger) {
                    return ((java.util.concurrent.atomic.AtomicInteger) b17).incrementAndGet();
                }
                cVar.a(str2, new java.util.concurrent.atomic.AtomicInteger(1));
                return 1;
            }
        }
        return -1;
    }

    public static void b(java.lang.String str, java.lang.String str2, int i17) {
        if (e(str, i17)) {
            a(str, str2, (com.tencent.mapsdk.internal.lb.b) null, i17);
        }
    }

    public static void a(java.lang.String str, java.lang.String str2, int i17) {
        if (e(str, i17)) {
            a(str, str2, (com.tencent.mapsdk.internal.lb.b) null, i17);
        }
    }

    private static int b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        if (!e(str, i17)) {
            return 0;
        }
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f131804af.get(str);
        com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str2) : null;
        if (cVar != null) {
            java.lang.Object b17 = cVar.b(str3);
            if (b17 instanceof java.util.concurrent.atomic.AtomicInteger) {
                return ((java.util.concurrent.atomic.AtomicInteger) b17).get();
            }
        }
        return 0;
    }

    private static void a(java.lang.String str, com.tencent.mapsdk.internal.lb.b bVar, int i17) {
        if (e(str, i17)) {
            a(str, str, bVar, i17);
        }
    }

    private static int c(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        if (!e(str, i17)) {
            return -1;
        }
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f131804af.get(str);
        com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str2) : null;
        if (cVar == null) {
            return -1;
        }
        java.lang.Object b17 = cVar.b(str3);
        if (b17 instanceof java.util.concurrent.atomic.AtomicInteger) {
            return ((java.util.concurrent.atomic.AtomicInteger) b17).incrementAndGet();
        }
        cVar.a(str3, new java.util.concurrent.atomic.AtomicInteger(1));
        return 1;
    }

    private static int d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        if (!e(str, i17)) {
            return -1;
        }
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f131804af.get(str);
        com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str2) : null;
        if (cVar != null) {
            java.lang.Object b17 = cVar.b(str3);
            if (b17 instanceof java.util.concurrent.atomic.AtomicInteger) {
                java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) b17;
                int decrementAndGet = atomicInteger.decrementAndGet();
                if (decrementAndGet >= 0) {
                    return decrementAndGet;
                }
                atomicInteger.set(0);
                return 0;
            }
        }
        return -1;
    }

    private static void a(java.lang.String str, java.lang.String str2, com.tencent.mapsdk.internal.lb.b bVar, int i17) {
        com.tencent.mapsdk.internal.lb.c cVar;
        if (e(str, i17)) {
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c>> map = f131804af;
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map2 = map.get(str);
            if (map2 == null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                cVar = new com.tencent.mapsdk.internal.lb.c(str, str2);
                hashMap.put(str2, cVar);
                map.put(str, hashMap);
            } else {
                cVar = map2.get(str2);
                if (cVar == null) {
                    cVar = new com.tencent.mapsdk.internal.lb.c(str, str2);
                    map2.put(str2, cVar);
                } else {
                    cVar.b();
                }
            }
            cVar.f131809b = str2;
            cVar.f131811d = bVar;
            cVar.f131810c.add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            cVar.f131814g = "Begin";
            a(cVar, i17);
        }
    }

    public static long b(java.lang.String str, java.lang.String str2, java.lang.Object obj, int i17) {
        if (e(str, i17)) {
            return a(str, str, "", str2, obj, i17);
        }
        return 0L;
    }

    private static boolean b(java.lang.String str, java.lang.String str2) {
        return a(str, str2) != null;
    }

    public static long f(java.lang.String str, java.lang.String str2, int i17) {
        if (!e(str, i17)) {
            return 0L;
        }
        com.tencent.mapsdk.internal.lb.c a17 = a(str, str2);
        if (a17 != null) {
            a17.f131814g = "End";
        }
        long a18 = a(a17, i17);
        if (a18 != -1) {
            f131804af.remove(str);
        }
        return a18;
    }

    public static void b(java.lang.String str) {
        f131801ac.add(str);
    }

    public static long c(java.lang.String str, int i17) {
        if (e(str, i17)) {
            return f(str, str, i17);
        }
        return 0L;
    }

    public static long d(java.lang.String str, int i17) {
        if (e(str, i17) && e(str, i17)) {
            return a(str, str, str, "", null, i17);
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i17, java.lang.String str, java.lang.Object... objArr) {
        java.lang.Class<?>[] clsArr;
        if (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131737e)) {
            if (f131801ac.contains(str)) {
                f131803ae.set(0);
                return;
            }
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            java.lang.StackTraceElement[] stackTrace = currentThread.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                java.util.concurrent.atomic.AtomicInteger atomicInteger = f131803ae;
                if (length <= atomicInteger.get() + 3) {
                    return;
                }
                java.lang.StackTraceElement stackTraceElement = stackTrace[atomicInteger.get() + 3];
                atomicInteger.set(0);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                try {
                    for (java.lang.reflect.Method method : java.lang.Class.forName(stackTraceElement.getClassName()).getDeclaredMethods()) {
                        if (method.getName().equals(stackTraceElement.getMethodName())) {
                            clsArr = method.getParameterTypes();
                            break;
                        }
                    }
                } catch (java.lang.ClassNotFoundException unused) {
                }
                clsArr = null;
                if (stackTraceElement.isNativeMethod()) {
                    sb6.append("(Native Method)");
                } else if (stackTraceElement.getFileName() != null) {
                    if (stackTraceElement.getLineNumber() >= 0) {
                        sb6.append("(");
                        sb6.append(stackTraceElement.getFileName());
                        sb6.append(":");
                        sb6.append(stackTraceElement.getLineNumber());
                        sb6.append(")");
                    } else {
                        sb6.append("(");
                        sb6.append(stackTraceElement.getFileName());
                        sb6.append(")");
                    }
                } else if (stackTraceElement.getLineNumber() >= 0) {
                    sb6.append("(Unknown Source:");
                    sb6.append(stackTraceElement.getLineNumber());
                    sb6.append(")");
                } else {
                    sb6.append("(Unknown Source)");
                }
                sb6.append("==");
                sb6.append(currentThread.getName());
                sb6.append(":");
                sb6.append(currentThread.getId());
                sb6.append("==#");
                sb6.append(stackTraceElement.getMethodName());
                sb6.append("(");
                if (clsArr != null && clsArr.length > 0) {
                    int i18 = 0;
                    for (java.lang.Class<?> cls : clsArr) {
                        sb6.append(cls.getSimpleName());
                        if (i18 != clsArr.length - 1) {
                            sb6.append(",");
                        }
                        i18++;
                    }
                }
                sb6.append(")");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                int i19 = 0;
                for (java.lang.Object obj : objArr) {
                    i19++;
                    sb7.append("[");
                    sb7.append(i19);
                    sb7.append("] ");
                    sb7.append(obj);
                }
                if (i19 > 0) {
                    sb6.append((java.lang.CharSequence) sb7);
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    str = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131737e;
                }
                if (i17 == 2) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(str, sb6.toString());
                    return;
                }
                if (i17 == 3) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(str, sb6.toString());
                    return;
                }
                if (i17 == 4) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str, sb6.toString());
                } else if (i17 != 5) {
                    if (i17 != 6) {
                        return;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.e(str, sb6.toString());
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(str, sb6.toString());
                }
            }
        }
    }

    private static boolean d(java.lang.String str) {
        return a(str, str) != null;
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Object obj, int i17) {
        if (e(str, i17)) {
            a(str, str, str2, obj, i17);
        }
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, int i17) {
        if (e(str, i17)) {
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f131804af.get(str);
            com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str2) : null;
            if (cVar != null) {
                cVar.a(str3, obj);
                cVar.f131814g = "Set";
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(i17).b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131737e, cVar.a() + ":" + str3 + "=>" + obj);
            }
        }
    }

    private static java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        if (!e(str, i17)) {
            return null;
        }
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f131804af.get(str);
        com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str2) : null;
        if (cVar != null) {
            return cVar.b(str3);
        }
        return null;
    }

    private static int a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        int i19 = -1;
        if (!e(str, i18)) {
            return -1;
        }
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f131804af.get(str);
        com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str2) : null;
        if (cVar != null) {
            java.lang.Object b17 = cVar.b(str3);
            i19 = 1;
            if (b17 instanceof java.util.concurrent.atomic.AtomicInteger) {
                if (i17 <= 0) {
                    i17 = 1;
                }
                java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) b17;
                int i27 = atomicInteger.get() + i17;
                atomicInteger.set(i27);
                return i27;
            }
            cVar.a(str3, new java.util.concurrent.atomic.AtomicInteger(1));
        }
        return i19;
    }

    private static long a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Object obj, int i17) {
        if (!e(str, i17)) {
            return 0L;
        }
        a(str, str2, str4, obj, i17);
        com.tencent.mapsdk.internal.lb.c a17 = a(str, str2);
        if (a17 != null) {
            a17.f131814g = "Log";
            a17.f131808a.incrementAndGet();
            a17.f131813f = str3;
            a17.f131810c.add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        return a(a17, i17);
    }

    private static long a(com.tencent.mapsdk.internal.lb.c cVar, int i17) {
        long j17;
        long j18 = -1;
        if (cVar != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (cVar.f131810c.size() > 0) {
                j18 = currentTimeMillis - cVar.f131810c.get(0).longValue();
                j17 = currentTimeMillis - cVar.f131810c.get(r4.size() - 1).longValue();
            } else {
                j17 = -1;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(cVar.a());
            if (cVar.f131808a.get() != 0) {
                sb6.append("$idx:");
                sb6.append(cVar.f131808a.get());
            }
            if (j18 > 0) {
                sb6.append("$ut:");
                sb6.append(j18);
                sb6.append("ms");
            }
            if (j17 > 0) {
                sb6.append("$it:");
                sb6.append(j17);
                sb6.append("ms");
            }
            java.util.Map<java.lang.String, java.lang.Object> map = cVar.f131812e;
            if (map != null && !map.isEmpty()) {
                sb6.append("$val:");
                sb6.append(cVar.f131812e);
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(i17).c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131737e, sb6.toString());
        }
        return j18;
    }

    private static com.tencent.mapsdk.internal.lb.c a(java.lang.String str, java.lang.String str2) {
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f131804af.get(str);
        com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str2) : null;
        if (cVar == null || !cVar.a(str2)) {
            return null;
        }
        return cVar;
    }

    private static com.tencent.mapsdk.internal.lb.a a(int i17) {
        f131803ae.incrementAndGet();
        com.tencent.mapsdk.internal.lb.a a17 = f131802ad.a();
        a17.f131806a = i17;
        return a17;
    }

    public static com.tencent.mapsdk.internal.lb.a a(java.lang.String str) {
        f131803ae.incrementAndGet();
        com.tencent.mapsdk.internal.lb.a a17 = f131802ad.a();
        a17.f131807b = str;
        return a17;
    }

    private static void a(java.lang.Throwable th6, int i17) {
        if (th6 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            try {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
                th6.printStackTrace(printWriter);
                for (java.lang.Throwable cause = th6.getCause(); cause != null; cause = cause.getCause()) {
                    cause.printStackTrace(printWriter);
                }
                printWriter.close();
                sb6.append(stringWriter.toString());
                sb6.append("\n =============== ");
            } catch (java.lang.Throwable unused) {
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(i17).e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131737e, sb6.toString());
        }
    }

    public static void a(java.lang.Object... objArr) {
        if (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131737e)) {
            f131803ae.incrementAndGet();
            b(3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131737e, objArr);
        }
    }

    private static int a(java.lang.String str, java.lang.String str2, int i17, int i18) {
        if (!e(str, i18)) {
            return -1;
        }
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f131804af.get(str);
        com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str) : null;
        if (cVar == null) {
            return -1;
        }
        java.lang.Object b17 = cVar.b(str2);
        if (b17 instanceof java.util.concurrent.atomic.AtomicInteger) {
            if (i17 <= 0) {
                i17 = 1;
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) b17;
            int i19 = atomicInteger.get() + i17;
            atomicInteger.set(i19);
            return i19;
        }
        cVar.a(str2, new java.util.concurrent.atomic.AtomicInteger(1));
        return 1;
    }
}

package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class lb implements com.tencent.mapsdk.internal.la {

    /* renamed from: ac, reason: collision with root package name */
    private static final java.util.HashSet<java.lang.String> f50268ac = new java.util.HashSet<>();

    /* renamed from: ad, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.lk.g<com.tencent.mapsdk.internal.lb.a> f50269ad;

    /* renamed from: ae, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f50270ae;

    /* renamed from: af, reason: collision with root package name */
    private static final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c>> f50271af;

    /* renamed from: ag, reason: collision with root package name */
    private static final java.util.Map<java.lang.String, java.lang.StringBuilder> f50272ag;

    /* loaded from: classes13.dex */
    public static class a implements com.tencent.mapsdk.internal.lk.h {

        /* renamed from: a, reason: collision with root package name */
        int f50273a = 3;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f50274b = com.tencent.mapsdk.internal.kx.f50204e;

        private com.tencent.mapsdk.internal.lb.a a(java.lang.String str) {
            com.tencent.mapsdk.internal.lb.f50270ae.incrementAndGet();
            this.f50274b = str;
            return this;
        }

        private com.tencent.mapsdk.internal.lb.a a(int i17) {
            com.tencent.mapsdk.internal.lb.f50270ae.incrementAndGet();
            this.f50273a = i17;
            return this;
        }

        public final void a(java.lang.Object... objArr) {
            com.tencent.mapsdk.internal.lb.f50270ae.incrementAndGet();
            com.tencent.mapsdk.internal.lb.b(this.f50273a, this.f50274b, objArr);
            com.tencent.mapsdk.internal.lb.f50269ad.a(this);
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
        java.lang.String f50276b;

        /* renamed from: d, reason: collision with root package name */
        com.tencent.mapsdk.internal.lb.b f50278d;

        /* renamed from: f, reason: collision with root package name */
        java.lang.String f50280f;

        /* renamed from: g, reason: collision with root package name */
        java.lang.String f50281g;

        /* renamed from: h, reason: collision with root package name */
        private java.lang.String f50282h;

        /* renamed from: c, reason: collision with root package name */
        java.util.List<java.lang.Long> f50277c = new java.util.concurrent.CopyOnWriteArrayList();

        /* renamed from: a, reason: collision with root package name */
        java.util.concurrent.atomic.AtomicInteger f50275a = new java.util.concurrent.atomic.AtomicInteger(0);

        /* renamed from: e, reason: collision with root package name */
        final java.util.Map<java.lang.String, java.lang.Object> f50279e = new java.util.concurrent.ConcurrentHashMap();

        public c(java.lang.String str, java.lang.String str2) {
            this.f50282h = str;
            this.f50276b = str2;
        }

        public final java.lang.String toString() {
            return "TraceInfo{id='" + this.f50276b + "', values=" + this.f50279e + '}';
        }

        public final java.lang.Object b(java.lang.String str) {
            return this.f50279e.get(str);
        }

        public final boolean a(java.lang.String str) {
            return this.f50276b.equals(str);
        }

        public final void b() {
            this.f50275a.set(0);
            this.f50277c.clear();
            this.f50278d = null;
            this.f50279e.clear();
        }

        public final java.lang.String a() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
            if (!android.text.TextUtils.isEmpty(this.f50281g)) {
                sb6.append(this.f50281g);
            }
            if (!this.f50282h.equals(this.f50276b)) {
                sb6.append("|");
                sb6.append(this.f50282h);
                sb6.append("|");
                sb6.append(this.f50276b);
            } else {
                sb6.append("|");
                sb6.append(this.f50282h);
            }
            if (!android.text.TextUtils.isEmpty(this.f50280f)) {
                sb6.append("|");
                sb6.append(this.f50280f);
            }
            sb6.append("]");
            return sb6.toString();
        }

        public final void a(java.lang.String str, java.lang.Object obj) {
            if (android.text.TextUtils.isEmpty(str) || obj == null) {
                return;
            }
            this.f50279e.put(str, obj);
        }
    }

    static {
        b(com.tencent.mapsdk.internal.kx.f50216q);
        b(com.tencent.mapsdk.internal.kx.f50218s);
        b(com.tencent.mapsdk.internal.kx.f50220u);
        f50269ad = com.tencent.mapsdk.internal.lk.a(30, new com.tencent.mapsdk.internal.lk.e<com.tencent.mapsdk.internal.lb.a>() { // from class: com.tencent.mapsdk.internal.lb.1
            private static com.tencent.mapsdk.internal.lb.a b() {
                return new com.tencent.mapsdk.internal.lb.a();
            }

            @Override // com.tencent.mapsdk.internal.lk.e
            public final /* synthetic */ com.tencent.mapsdk.internal.lb.a a() {
                return new com.tencent.mapsdk.internal.lb.a();
            }
        });
        f50270ae = new java.util.concurrent.atomic.AtomicInteger();
        f50271af = java.util.Collections.synchronizedMap(new java.util.Hashtable());
        f50272ag = new java.util.concurrent.ConcurrentHashMap();
    }

    private static java.lang.String c(java.lang.String str) {
        return str;
    }

    public static int d(java.lang.String str, java.lang.String str2, int i17) {
        if (e(str, i17) && e(str, i17)) {
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f50271af.get(str);
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
        if (android.text.TextUtils.isEmpty(str) || com.tencent.mapsdk.internal.tf.f51582d) {
            return str;
        }
        java.util.List<java.lang.String> d17 = com.tencent.mapsdk.internal.ks.d(new java.io.File(com.tencent.mapsdk.core.utils.log.LogUtil.a(), "kv"));
        if (d17 != null && !d17.isEmpty() && !android.text.TextUtils.isEmpty(d17.get(0))) {
            str2 = d17.get(0);
        } else {
            try {
                java.lang.String a17 = com.tencent.mapsdk.internal.lc.a(com.tencent.mapsdk.internal.hn.a() + com.tencent.mapsdk.internal.tf.f51588j + com.tencent.mapsdk.internal.tf.f51587i + com.tencent.mapsdk.internal.tf.f51581c + com.tencent.mapsdk.internal.tf.f51580b);
                try {
                    com.tencent.mapsdk.core.utils.log.LogUtil.a(i17).b(com.tencent.mapsdk.internal.kx.f50204e, a17);
                } catch (java.io.UnsupportedEncodingException | java.security.NoSuchAlgorithmException unused) {
                }
                str2 = a17;
            } catch (java.io.UnsupportedEncodingException | java.security.NoSuchAlgorithmException unused2) {
                str2 = null;
            }
        }
        try {
            if (!android.text.TextUtils.isEmpty(str2)) {
                return com.tencent.mapsdk.internal.lc.a(str2, str);
            }
        } catch (java.security.GeneralSecurityException unused3) {
        }
        return "";
    }

    private static int g(java.lang.String str, java.lang.String str2, int i17) {
        if (e(str, i17) && e(str, i17)) {
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f50271af.get(str);
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
        return com.tencent.mapsdk.core.utils.log.LogUtil.e(com.tencent.mapsdk.internal.kx.f50204e);
    }

    private static boolean e(java.lang.String str, int i17) {
        return com.tencent.mapsdk.core.utils.log.LogUtil.a(i17).a(4, com.tencent.mapsdk.internal.kx.f50204e) && !f50268ac.contains(str);
    }

    public static void a(java.lang.String str, int i17) {
        if (e(str, i17)) {
            a(str, str, (com.tencent.mapsdk.internal.lb.b) null, i17);
        }
    }

    public static java.lang.Object c(java.lang.String str, java.lang.String str2, int i17) {
        if (e(str, i17) && e(str, i17)) {
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f50271af.get(str);
            com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str) : null;
            if (cVar != null) {
                return cVar.b(str2);
            }
        }
        return null;
    }

    public static int e(java.lang.String str, java.lang.String str2, int i17) {
        if (e(str, i17) && e(str, i17)) {
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f50271af.get(str);
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
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f50271af.get(str);
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
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f50271af.get(str);
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
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f50271af.get(str);
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
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c>> map = f50271af;
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
            cVar.f50276b = str2;
            cVar.f50278d = bVar;
            cVar.f50277c.add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            cVar.f50281g = "Begin";
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
            a17.f50281g = "End";
        }
        long a18 = a(a17, i17);
        if (a18 != -1) {
            f50271af.remove(str);
        }
        return a18;
    }

    public static void b(java.lang.String str) {
        f50268ac.add(str);
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
        if (com.tencent.mapsdk.core.utils.log.LogUtil.e(com.tencent.mapsdk.internal.kx.f50204e)) {
            if (f50268ac.contains(str)) {
                f50270ae.set(0);
                return;
            }
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            java.lang.StackTraceElement[] stackTrace = currentThread.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                java.util.concurrent.atomic.AtomicInteger atomicInteger = f50270ae;
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
                    str = com.tencent.mapsdk.internal.kx.f50204e;
                }
                if (i17 == 2) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.a(str, sb6.toString());
                    return;
                }
                if (i17 == 3) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(str, sb6.toString());
                    return;
                }
                if (i17 == 4) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(str, sb6.toString());
                } else if (i17 != 5) {
                    if (i17 != 6) {
                        return;
                    }
                    com.tencent.mapsdk.core.utils.log.LogUtil.e(str, sb6.toString());
                } else {
                    com.tencent.mapsdk.core.utils.log.LogUtil.d(str, sb6.toString());
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
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f50271af.get(str);
            com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str2) : null;
            if (cVar != null) {
                cVar.a(str3, obj);
                cVar.f50281g = "Set";
                com.tencent.mapsdk.core.utils.log.LogUtil.a(i17).b(com.tencent.mapsdk.internal.kx.f50204e, cVar.a() + ":" + str3 + "=>" + obj);
            }
        }
    }

    private static java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        if (!e(str, i17)) {
            return null;
        }
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f50271af.get(str);
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
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f50271af.get(str);
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
            a17.f50281g = "Log";
            a17.f50275a.incrementAndGet();
            a17.f50280f = str3;
            a17.f50277c.add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        return a(a17, i17);
    }

    private static long a(com.tencent.mapsdk.internal.lb.c cVar, int i17) {
        long j17;
        long j18 = -1;
        if (cVar != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (cVar.f50277c.size() > 0) {
                j18 = currentTimeMillis - cVar.f50277c.get(0).longValue();
                j17 = currentTimeMillis - cVar.f50277c.get(r4.size() - 1).longValue();
            } else {
                j17 = -1;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(cVar.a());
            if (cVar.f50275a.get() != 0) {
                sb6.append("$idx:");
                sb6.append(cVar.f50275a.get());
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
            java.util.Map<java.lang.String, java.lang.Object> map = cVar.f50279e;
            if (map != null && !map.isEmpty()) {
                sb6.append("$val:");
                sb6.append(cVar.f50279e);
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.a(i17).c(com.tencent.mapsdk.internal.kx.f50204e, sb6.toString());
        }
        return j18;
    }

    private static com.tencent.mapsdk.internal.lb.c a(java.lang.String str, java.lang.String str2) {
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f50271af.get(str);
        com.tencent.mapsdk.internal.lb.c cVar = map != null ? map.get(str2) : null;
        if (cVar == null || !cVar.a(str2)) {
            return null;
        }
        return cVar;
    }

    private static com.tencent.mapsdk.internal.lb.a a(int i17) {
        f50270ae.incrementAndGet();
        com.tencent.mapsdk.internal.lb.a a17 = f50269ad.a();
        a17.f50273a = i17;
        return a17;
    }

    public static com.tencent.mapsdk.internal.lb.a a(java.lang.String str) {
        f50270ae.incrementAndGet();
        com.tencent.mapsdk.internal.lb.a a17 = f50269ad.a();
        a17.f50274b = str;
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
            com.tencent.mapsdk.core.utils.log.LogUtil.a(i17).e(com.tencent.mapsdk.internal.kx.f50204e, sb6.toString());
        }
    }

    public static void a(java.lang.Object... objArr) {
        if (com.tencent.mapsdk.core.utils.log.LogUtil.e(com.tencent.mapsdk.internal.kx.f50204e)) {
            f50270ae.incrementAndGet();
            b(3, com.tencent.mapsdk.internal.kx.f50204e, objArr);
        }
    }

    private static int a(java.lang.String str, java.lang.String str2, int i17, int i18) {
        if (!e(str, i18)) {
            return -1;
        }
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lb.c> map = f50271af.get(str);
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

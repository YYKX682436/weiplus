package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class lw {

    /* renamed from: b, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f131913b;

    /* renamed from: c, reason: collision with root package name */
    java.util.concurrent.ExecutorService f131914c;

    /* renamed from: e, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu f131916e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lw.a> f131912a = new java.util.Hashtable();

    /* renamed from: d, reason: collision with root package name */
    final java.util.Set<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv> f131915d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: com.tencent.mapsdk.internal.lw$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f131925a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.m36834xcee59d22().length];
            f131925a = iArr;
            try {
                iArr[com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f131925a[com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.CANCEL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f131925a[com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f131925a[com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.RUNNING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f131925a[com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.FINISH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Runnable f131926a;

        /* renamed from: b, reason: collision with root package name */
        java.util.concurrent.Future f131927b;

        /* renamed from: c, reason: collision with root package name */
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu f131928c;

        /* renamed from: d, reason: collision with root package name */
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx f131929d;

        private a() {
        }

        public /* synthetic */ a(byte b17) {
            this();
        }

        public final boolean a() {
            return this.f131929d == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.CANCEL;
        }

        public final synchronized void b() {
            if (this.f131929d == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.START) {
                this.f131929d = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.RUNNING;
            }
        }

        public final synchronized void c() {
            if (this.f131929d == null) {
                return;
            }
            java.util.concurrent.Future future = this.f131927b;
            if (future != null) {
                future.cancel(true);
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu luVar = this.f131928c;
            if (luVar != null) {
                luVar.a();
            }
            this.f131929d = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.CANCEL;
        }

        public final synchronized void d() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx lxVar = this.f131929d;
            if (lxVar != null && lxVar != com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.RUNNING) {
                c();
            }
        }

        public final synchronized void e() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx lxVar = this.f131929d;
            if (lxVar == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.RUNNING || lxVar == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.FINISH) {
                this.f131929d = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.FINISH;
            }
        }

        public final synchronized void f() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx lxVar = this.f131929d;
            if (lxVar != com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.FINISH && lxVar != com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.CANCEL) {
                this.f131929d = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.ERROR;
            }
        }

        /* renamed from: toString */
        public final java.lang.String m36831x9616526c() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RequestBody{runnable=");
            stringBuffer.append(this.f131926a);
            stringBuffer.append(", requestFuture=");
            stringBuffer.append(this.f131927b);
            stringBuffer.append(", executor=");
            stringBuffer.append(this.f131928c);
            stringBuffer.append(", status=");
            stringBuffer.append(this.f131929d);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        public final synchronized void a(java.util.concurrent.ExecutorService executorService) {
            if (this.f131929d == null && this.f131926a != null && executorService != null && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.a(executorService)) {
                this.f131929d = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.START;
                this.f131927b = executorService.submit(this.f131926a);
            }
        }
    }

    private java.lang.Runnable c(java.lang.String str) {
        com.tencent.mapsdk.internal.lw.a aVar = this.f131912a.get(str);
        if (aVar != null) {
            return aVar.f131926a;
        }
        return null;
    }

    private void a(java.util.concurrent.ExecutorService executorService) {
        this.f131913b = executorService;
    }

    public final void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv lvVar) {
        this.f131915d.remove(lvVar);
    }

    private synchronized void b() {
        this.f131916e = null;
        java.util.concurrent.ExecutorService executorService = this.f131913b;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f131913b = null;
        }
        java.util.concurrent.ExecutorService executorService2 = this.f131914c;
        if (executorService2 != null) {
            executorService2.shutdownNow();
            this.f131914c = null;
        }
        this.f131915d.clear();
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv lvVar) {
        if (lvVar != null) {
            this.f131915d.remove(lvVar);
            this.f131915d.add(lvVar);
        }
    }

    public final synchronized void a() {
        b();
    }

    public final synchronized void a(java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu luVar) {
        a(str, luVar, com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.NONE.m35289x754a37bb());
    }

    public final synchronized void a(final java.lang.String str, final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu luVar, final int i17) {
        if (luVar == null) {
            return;
        }
        java.util.concurrent.ExecutorService executorService = this.f131913b;
        if (executorService == null || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.a(executorService)) {
            this.f131913b = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.c();
        }
        try {
            if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.a(this.f131913b)) {
                com.tencent.mapsdk.internal.lw.a aVar = new com.tencent.mapsdk.internal.lw.a((byte) 0);
                this.f131912a.put(str, aVar);
                aVar.f131926a = new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.lw.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mapsdk.internal.lw.a aVar2;
                        byte[] f17;
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw lwVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw.this;
                        java.lang.String str2 = str;
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu luVar2 = luVar;
                        int i18 = i17;
                        try {
                            try {
                                if (com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.get(i18) != com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.NONE) {
                                    java.lang.Thread.currentThread().setPriority(com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.m35286x909a0ec4(i18));
                                }
                                aVar2 = lwVar.f131912a.get(str2);
                                try {
                                    if (aVar2 == null) {
                                        lwVar.a(str2, (byte[]) null, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.ERROR);
                                        return;
                                    }
                                    if (aVar2.a()) {
                                        lwVar.a(str2, (byte[]) null, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.CANCEL);
                                        return;
                                    }
                                    java.io.InputStream e17 = luVar2.e(str2);
                                    lwVar.a(str2, (byte[]) null, aVar2.f131929d);
                                    aVar2.b();
                                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx lxVar = aVar2.f131929d;
                                    if (e17 != null) {
                                        f17 = new byte[102400];
                                        while (f17.length != 0) {
                                            f17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(e17);
                                            if (f17 == null) {
                                                throw new java.lang.IllegalStateException("下载过程读取失败");
                                            }
                                            lwVar.a(str2, f17, lxVar);
                                            if (aVar2.a()) {
                                                lwVar.a(str2, (byte[]) null, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.CANCEL);
                                                return;
                                            }
                                        }
                                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) e17);
                                    } else {
                                        f17 = luVar2.f(str2);
                                        if (f17 != null && f17.length == 0) {
                                            f17 = null;
                                        }
                                    }
                                    if (aVar2.a()) {
                                        lwVar.a(str2, (byte[]) null, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.CANCEL);
                                    } else {
                                        aVar2.e();
                                        lwVar.a(str2, f17, aVar2.f131929d);
                                    }
                                } catch (java.lang.Exception unused) {
                                    if (aVar2 != null) {
                                        aVar2.f();
                                    }
                                    lwVar.a(str2, (byte[]) null, aVar2 != null ? aVar2.f131929d : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.ERROR);
                                }
                            } finally {
                                luVar2.b();
                            }
                        } catch (java.lang.Exception unused2) {
                            aVar2 = null;
                        }
                    }
                };
                aVar.f131928c = luVar;
                aVar.a(this.f131913b);
            }
        } catch (java.lang.IllegalMonitorStateException unused) {
        }
    }

    public final synchronized void b(java.lang.String str) {
        com.tencent.mapsdk.internal.lw.a remove = this.f131912a.remove(str);
        if (remove != null) {
            remove.c();
        }
    }

    private void b(java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu luVar, int i17) {
        com.tencent.mapsdk.internal.lw.a aVar;
        byte[] f17;
        try {
            try {
                if (com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.get(i17) != com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.NONE) {
                    java.lang.Thread.currentThread().setPriority(com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.m35286x909a0ec4(i17));
                }
                aVar = this.f131912a.get(str);
                try {
                    if (aVar == null) {
                        a(str, (byte[]) null, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.ERROR);
                        return;
                    }
                    if (aVar.a()) {
                        a(str, (byte[]) null, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.CANCEL);
                        return;
                    }
                    java.io.InputStream e17 = luVar.e(str);
                    a(str, (byte[]) null, aVar.f131929d);
                    aVar.b();
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx lxVar = aVar.f131929d;
                    if (e17 != null) {
                        f17 = new byte[102400];
                        while (f17.length != 0) {
                            f17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(e17);
                            if (f17 != null) {
                                a(str, f17, lxVar);
                                if (aVar.a()) {
                                    a(str, (byte[]) null, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.CANCEL);
                                    return;
                                }
                            } else {
                                throw new java.lang.IllegalStateException("下载过程读取失败");
                            }
                        }
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) e17);
                    } else {
                        f17 = luVar.f(str);
                        if (f17 != null && f17.length == 0) {
                            f17 = null;
                        }
                    }
                    if (aVar.a()) {
                        a(str, (byte[]) null, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.CANCEL);
                    } else {
                        aVar.e();
                        a(str, f17, aVar.f131929d);
                    }
                } catch (java.lang.Exception unused) {
                    if (aVar != null) {
                        aVar.f();
                    }
                    a(str, (byte[]) null, aVar != null ? aVar.f131929d : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.ERROR);
                }
            } catch (java.lang.Exception unused2) {
                aVar = null;
            }
        } finally {
            luVar.b();
        }
    }

    public final synchronized void a(java.lang.String str) {
        com.tencent.mapsdk.internal.lw.a remove = this.f131912a.remove(str);
        if (remove != null) {
            remove.d();
        }
    }

    public final void a(final java.lang.String str, final byte[] bArr, final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx lxVar) {
        if (this.f131915d.isEmpty() || lxVar == null) {
            return;
        }
        java.util.concurrent.ExecutorService executorService = this.f131914c;
        if (executorService == null || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.a(executorService)) {
            this.f131914c = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.b();
        }
        if (this.f131914c.isShutdown()) {
            return;
        }
        this.f131914c.execute(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.lw.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv lvVar : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw.this.f131915d) {
                        if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw.this.f131914c.isShutdown() && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw.this.f131914c.isTerminated()) {
                            lvVar.a(str, lxVar);
                            int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw.AnonymousClass3.f131925a[lxVar.ordinal()];
                            if (i17 == 1) {
                                lvVar.a(str);
                            } else if (i17 == 2) {
                                lvVar.b(str);
                                lvVar.a(str, bArr);
                            } else if (i17 == 3 || i17 == 4) {
                                if (bArr == null) {
                                    lvVar.d(str);
                                }
                                lvVar.a(str, bArr);
                            } else if (i17 == 5) {
                                if (bArr == null) {
                                    lvVar.d(str);
                                }
                                lvVar.a(str, bArr);
                                lvVar.c(str);
                            }
                        }
                        return;
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        });
    }

    private static /* synthetic */ void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw lwVar, java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu luVar, int i17) {
        com.tencent.mapsdk.internal.lw.a aVar;
        byte[] f17;
        try {
            try {
                if (com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.get(i17) != com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.NONE) {
                    java.lang.Thread.currentThread().setPriority(com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.m35286x909a0ec4(i17));
                }
                aVar = lwVar.f131912a.get(str);
                try {
                    if (aVar == null) {
                        lwVar.a(str, (byte[]) null, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.ERROR);
                        return;
                    }
                    if (aVar.a()) {
                        lwVar.a(str, (byte[]) null, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.CANCEL);
                        return;
                    }
                    java.io.InputStream e17 = luVar.e(str);
                    lwVar.a(str, (byte[]) null, aVar.f131929d);
                    aVar.b();
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx lxVar = aVar.f131929d;
                    if (e17 != null) {
                        f17 = new byte[102400];
                        while (f17.length != 0) {
                            f17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(e17);
                            if (f17 != null) {
                                lwVar.a(str, f17, lxVar);
                                if (aVar.a()) {
                                    lwVar.a(str, (byte[]) null, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.CANCEL);
                                    return;
                                }
                            } else {
                                throw new java.lang.IllegalStateException("下载过程读取失败");
                            }
                        }
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) e17);
                    } else {
                        f17 = luVar.f(str);
                        if (f17 != null && f17.length == 0) {
                            f17 = null;
                        }
                    }
                    if (aVar.a()) {
                        lwVar.a(str, (byte[]) null, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.CANCEL);
                    } else {
                        aVar.e();
                        lwVar.a(str, f17, aVar.f131929d);
                    }
                } catch (java.lang.Exception unused) {
                    if (aVar != null) {
                        aVar.f();
                    }
                    lwVar.a(str, (byte[]) null, aVar != null ? aVar.f131929d : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.ERROR);
                }
            } catch (java.lang.Exception unused2) {
                aVar = null;
            }
        } finally {
            luVar.b();
        }
    }
}

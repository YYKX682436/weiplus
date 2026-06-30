package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class lw {

    /* renamed from: b, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f50380b;

    /* renamed from: c, reason: collision with root package name */
    java.util.concurrent.ExecutorService f50381c;

    /* renamed from: e, reason: collision with root package name */
    private com.tencent.mapsdk.internal.lu f50383e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lw.a> f50379a = new java.util.Hashtable();

    /* renamed from: d, reason: collision with root package name */
    final java.util.Set<com.tencent.mapsdk.internal.lv> f50382d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: com.tencent.mapsdk.internal.lw$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50392a;

        static {
            int[] iArr = new int[com.tencent.mapsdk.internal.lx.values().length];
            f50392a = iArr;
            try {
                iArr[com.tencent.mapsdk.internal.lx.START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f50392a[com.tencent.mapsdk.internal.lx.CANCEL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f50392a[com.tencent.mapsdk.internal.lx.ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f50392a[com.tencent.mapsdk.internal.lx.RUNNING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f50392a[com.tencent.mapsdk.internal.lx.FINISH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Runnable f50393a;

        /* renamed from: b, reason: collision with root package name */
        java.util.concurrent.Future f50394b;

        /* renamed from: c, reason: collision with root package name */
        com.tencent.mapsdk.internal.lu f50395c;

        /* renamed from: d, reason: collision with root package name */
        com.tencent.mapsdk.internal.lx f50396d;

        private a() {
        }

        public /* synthetic */ a(byte b17) {
            this();
        }

        public final boolean a() {
            return this.f50396d == com.tencent.mapsdk.internal.lx.CANCEL;
        }

        public final synchronized void b() {
            if (this.f50396d == com.tencent.mapsdk.internal.lx.START) {
                this.f50396d = com.tencent.mapsdk.internal.lx.RUNNING;
            }
        }

        public final synchronized void c() {
            if (this.f50396d == null) {
                return;
            }
            java.util.concurrent.Future future = this.f50394b;
            if (future != null) {
                future.cancel(true);
            }
            com.tencent.mapsdk.internal.lu luVar = this.f50395c;
            if (luVar != null) {
                luVar.a();
            }
            this.f50396d = com.tencent.mapsdk.internal.lx.CANCEL;
        }

        public final synchronized void d() {
            com.tencent.mapsdk.internal.lx lxVar = this.f50396d;
            if (lxVar != null && lxVar != com.tencent.mapsdk.internal.lx.RUNNING) {
                c();
            }
        }

        public final synchronized void e() {
            com.tencent.mapsdk.internal.lx lxVar = this.f50396d;
            if (lxVar == com.tencent.mapsdk.internal.lx.RUNNING || lxVar == com.tencent.mapsdk.internal.lx.FINISH) {
                this.f50396d = com.tencent.mapsdk.internal.lx.FINISH;
            }
        }

        public final synchronized void f() {
            com.tencent.mapsdk.internal.lx lxVar = this.f50396d;
            if (lxVar != com.tencent.mapsdk.internal.lx.FINISH && lxVar != com.tencent.mapsdk.internal.lx.CANCEL) {
                this.f50396d = com.tencent.mapsdk.internal.lx.ERROR;
            }
        }

        public final java.lang.String toString() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RequestBody{runnable=");
            stringBuffer.append(this.f50393a);
            stringBuffer.append(", requestFuture=");
            stringBuffer.append(this.f50394b);
            stringBuffer.append(", executor=");
            stringBuffer.append(this.f50395c);
            stringBuffer.append(", status=");
            stringBuffer.append(this.f50396d);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        public final synchronized void a(java.util.concurrent.ExecutorService executorService) {
            if (this.f50396d == null && this.f50393a != null && executorService != null && !com.tencent.mapsdk.internal.ht.a(executorService)) {
                this.f50396d = com.tencent.mapsdk.internal.lx.START;
                this.f50394b = executorService.submit(this.f50393a);
            }
        }
    }

    private java.lang.Runnable c(java.lang.String str) {
        com.tencent.mapsdk.internal.lw.a aVar = this.f50379a.get(str);
        if (aVar != null) {
            return aVar.f50393a;
        }
        return null;
    }

    private void a(java.util.concurrent.ExecutorService executorService) {
        this.f50380b = executorService;
    }

    public final void b(com.tencent.mapsdk.internal.lv lvVar) {
        this.f50382d.remove(lvVar);
    }

    private synchronized void b() {
        this.f50383e = null;
        java.util.concurrent.ExecutorService executorService = this.f50380b;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f50380b = null;
        }
        java.util.concurrent.ExecutorService executorService2 = this.f50381c;
        if (executorService2 != null) {
            executorService2.shutdownNow();
            this.f50381c = null;
        }
        this.f50382d.clear();
    }

    public final void a(com.tencent.mapsdk.internal.lv lvVar) {
        if (lvVar != null) {
            this.f50382d.remove(lvVar);
            this.f50382d.add(lvVar);
        }
    }

    public final synchronized void a() {
        b();
    }

    public final synchronized void a(java.lang.String str, com.tencent.mapsdk.internal.lu luVar) {
        a(str, luVar, com.tencent.map.lib.models.DownloadPriority.NONE.getValue());
    }

    public final synchronized void a(final java.lang.String str, final com.tencent.mapsdk.internal.lu luVar, final int i17) {
        if (luVar == null) {
            return;
        }
        java.util.concurrent.ExecutorService executorService = this.f50380b;
        if (executorService == null || com.tencent.mapsdk.internal.ht.a(executorService)) {
            this.f50380b = com.tencent.mapsdk.internal.ht.c();
        }
        try {
            if (!com.tencent.mapsdk.internal.ht.a(this.f50380b)) {
                com.tencent.mapsdk.internal.lw.a aVar = new com.tencent.mapsdk.internal.lw.a((byte) 0);
                this.f50379a.put(str, aVar);
                aVar.f50393a = new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.lw.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mapsdk.internal.lw.a aVar2;
                        byte[] f17;
                        com.tencent.mapsdk.internal.lw lwVar = com.tencent.mapsdk.internal.lw.this;
                        java.lang.String str2 = str;
                        com.tencent.mapsdk.internal.lu luVar2 = luVar;
                        int i18 = i17;
                        try {
                            try {
                                if (com.tencent.map.lib.models.DownloadPriority.get(i18) != com.tencent.map.lib.models.DownloadPriority.NONE) {
                                    java.lang.Thread.currentThread().setPriority(com.tencent.map.lib.models.DownloadPriority.getThreadPriority(i18));
                                }
                                aVar2 = lwVar.f50379a.get(str2);
                                try {
                                    if (aVar2 == null) {
                                        lwVar.a(str2, (byte[]) null, com.tencent.mapsdk.internal.lx.ERROR);
                                        return;
                                    }
                                    if (aVar2.a()) {
                                        lwVar.a(str2, (byte[]) null, com.tencent.mapsdk.internal.lx.CANCEL);
                                        return;
                                    }
                                    java.io.InputStream e17 = luVar2.e(str2);
                                    lwVar.a(str2, (byte[]) null, aVar2.f50396d);
                                    aVar2.b();
                                    com.tencent.mapsdk.internal.lx lxVar = aVar2.f50396d;
                                    if (e17 != null) {
                                        f17 = new byte[102400];
                                        while (f17.length != 0) {
                                            f17 = com.tencent.mapsdk.internal.kt.a(e17);
                                            if (f17 == null) {
                                                throw new java.lang.IllegalStateException("下载过程读取失败");
                                            }
                                            lwVar.a(str2, f17, lxVar);
                                            if (aVar2.a()) {
                                                lwVar.a(str2, (byte[]) null, com.tencent.mapsdk.internal.lx.CANCEL);
                                                return;
                                            }
                                        }
                                        com.tencent.mapsdk.internal.kt.a((java.io.Closeable) e17);
                                    } else {
                                        f17 = luVar2.f(str2);
                                        if (f17 != null && f17.length == 0) {
                                            f17 = null;
                                        }
                                    }
                                    if (aVar2.a()) {
                                        lwVar.a(str2, (byte[]) null, com.tencent.mapsdk.internal.lx.CANCEL);
                                    } else {
                                        aVar2.e();
                                        lwVar.a(str2, f17, aVar2.f50396d);
                                    }
                                } catch (java.lang.Exception unused) {
                                    if (aVar2 != null) {
                                        aVar2.f();
                                    }
                                    lwVar.a(str2, (byte[]) null, aVar2 != null ? aVar2.f50396d : com.tencent.mapsdk.internal.lx.ERROR);
                                }
                            } finally {
                                luVar2.b();
                            }
                        } catch (java.lang.Exception unused2) {
                            aVar2 = null;
                        }
                    }
                };
                aVar.f50395c = luVar;
                aVar.a(this.f50380b);
            }
        } catch (java.lang.IllegalMonitorStateException unused) {
        }
    }

    public final synchronized void b(java.lang.String str) {
        com.tencent.mapsdk.internal.lw.a remove = this.f50379a.remove(str);
        if (remove != null) {
            remove.c();
        }
    }

    private void b(java.lang.String str, com.tencent.mapsdk.internal.lu luVar, int i17) {
        com.tencent.mapsdk.internal.lw.a aVar;
        byte[] f17;
        try {
            try {
                if (com.tencent.map.lib.models.DownloadPriority.get(i17) != com.tencent.map.lib.models.DownloadPriority.NONE) {
                    java.lang.Thread.currentThread().setPriority(com.tencent.map.lib.models.DownloadPriority.getThreadPriority(i17));
                }
                aVar = this.f50379a.get(str);
                try {
                    if (aVar == null) {
                        a(str, (byte[]) null, com.tencent.mapsdk.internal.lx.ERROR);
                        return;
                    }
                    if (aVar.a()) {
                        a(str, (byte[]) null, com.tencent.mapsdk.internal.lx.CANCEL);
                        return;
                    }
                    java.io.InputStream e17 = luVar.e(str);
                    a(str, (byte[]) null, aVar.f50396d);
                    aVar.b();
                    com.tencent.mapsdk.internal.lx lxVar = aVar.f50396d;
                    if (e17 != null) {
                        f17 = new byte[102400];
                        while (f17.length != 0) {
                            f17 = com.tencent.mapsdk.internal.kt.a(e17);
                            if (f17 != null) {
                                a(str, f17, lxVar);
                                if (aVar.a()) {
                                    a(str, (byte[]) null, com.tencent.mapsdk.internal.lx.CANCEL);
                                    return;
                                }
                            } else {
                                throw new java.lang.IllegalStateException("下载过程读取失败");
                            }
                        }
                        com.tencent.mapsdk.internal.kt.a((java.io.Closeable) e17);
                    } else {
                        f17 = luVar.f(str);
                        if (f17 != null && f17.length == 0) {
                            f17 = null;
                        }
                    }
                    if (aVar.a()) {
                        a(str, (byte[]) null, com.tencent.mapsdk.internal.lx.CANCEL);
                    } else {
                        aVar.e();
                        a(str, f17, aVar.f50396d);
                    }
                } catch (java.lang.Exception unused) {
                    if (aVar != null) {
                        aVar.f();
                    }
                    a(str, (byte[]) null, aVar != null ? aVar.f50396d : com.tencent.mapsdk.internal.lx.ERROR);
                }
            } catch (java.lang.Exception unused2) {
                aVar = null;
            }
        } finally {
            luVar.b();
        }
    }

    public final synchronized void a(java.lang.String str) {
        com.tencent.mapsdk.internal.lw.a remove = this.f50379a.remove(str);
        if (remove != null) {
            remove.d();
        }
    }

    public final void a(final java.lang.String str, final byte[] bArr, final com.tencent.mapsdk.internal.lx lxVar) {
        if (this.f50382d.isEmpty() || lxVar == null) {
            return;
        }
        java.util.concurrent.ExecutorService executorService = this.f50381c;
        if (executorService == null || com.tencent.mapsdk.internal.ht.a(executorService)) {
            this.f50381c = com.tencent.mapsdk.internal.ht.b();
        }
        if (this.f50381c.isShutdown()) {
            return;
        }
        this.f50381c.execute(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.lw.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    for (com.tencent.mapsdk.internal.lv lvVar : com.tencent.mapsdk.internal.lw.this.f50382d) {
                        if (!com.tencent.mapsdk.internal.lw.this.f50381c.isShutdown() && !com.tencent.mapsdk.internal.lw.this.f50381c.isTerminated()) {
                            lvVar.a(str, lxVar);
                            int i17 = com.tencent.mapsdk.internal.lw.AnonymousClass3.f50392a[lxVar.ordinal()];
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

    private static /* synthetic */ void a(com.tencent.mapsdk.internal.lw lwVar, java.lang.String str, com.tencent.mapsdk.internal.lu luVar, int i17) {
        com.tencent.mapsdk.internal.lw.a aVar;
        byte[] f17;
        try {
            try {
                if (com.tencent.map.lib.models.DownloadPriority.get(i17) != com.tencent.map.lib.models.DownloadPriority.NONE) {
                    java.lang.Thread.currentThread().setPriority(com.tencent.map.lib.models.DownloadPriority.getThreadPriority(i17));
                }
                aVar = lwVar.f50379a.get(str);
                try {
                    if (aVar == null) {
                        lwVar.a(str, (byte[]) null, com.tencent.mapsdk.internal.lx.ERROR);
                        return;
                    }
                    if (aVar.a()) {
                        lwVar.a(str, (byte[]) null, com.tencent.mapsdk.internal.lx.CANCEL);
                        return;
                    }
                    java.io.InputStream e17 = luVar.e(str);
                    lwVar.a(str, (byte[]) null, aVar.f50396d);
                    aVar.b();
                    com.tencent.mapsdk.internal.lx lxVar = aVar.f50396d;
                    if (e17 != null) {
                        f17 = new byte[102400];
                        while (f17.length != 0) {
                            f17 = com.tencent.mapsdk.internal.kt.a(e17);
                            if (f17 != null) {
                                lwVar.a(str, f17, lxVar);
                                if (aVar.a()) {
                                    lwVar.a(str, (byte[]) null, com.tencent.mapsdk.internal.lx.CANCEL);
                                    return;
                                }
                            } else {
                                throw new java.lang.IllegalStateException("下载过程读取失败");
                            }
                        }
                        com.tencent.mapsdk.internal.kt.a((java.io.Closeable) e17);
                    } else {
                        f17 = luVar.f(str);
                        if (f17 != null && f17.length == 0) {
                            f17 = null;
                        }
                    }
                    if (aVar.a()) {
                        lwVar.a(str, (byte[]) null, com.tencent.mapsdk.internal.lx.CANCEL);
                    } else {
                        aVar.e();
                        lwVar.a(str, f17, aVar.f50396d);
                    }
                } catch (java.lang.Exception unused) {
                    if (aVar != null) {
                        aVar.f();
                    }
                    lwVar.a(str, (byte[]) null, aVar != null ? aVar.f50396d : com.tencent.mapsdk.internal.lx.ERROR);
                }
            } catch (java.lang.Exception unused2) {
                aVar = null;
            }
        } finally {
            luVar.b();
        }
    }
}

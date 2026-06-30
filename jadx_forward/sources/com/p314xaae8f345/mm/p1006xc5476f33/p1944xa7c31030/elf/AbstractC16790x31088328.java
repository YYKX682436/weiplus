package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf;

/* renamed from: com.tencent.mm.plugin.performance.elf.AbstractProcessChecker */
/* loaded from: classes12.dex */
public abstract class AbstractC16790x31088328 extends android.content.BroadcastReceiver {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f234489j = 0;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f234490a;

    /* renamed from: b, reason: collision with root package name */
    public final xp3.c f234491b;

    /* renamed from: c, reason: collision with root package name */
    public int f234492c;

    /* renamed from: d, reason: collision with root package name */
    public long f234493d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f234494e;

    /* renamed from: f, reason: collision with root package name */
    public int f234495f;

    /* renamed from: g, reason: collision with root package name */
    public long f234496g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f234497h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f234498i;

    public AbstractC16790x31088328() {
        xp3.c cVar = new xp3.c(this, null);
        this.f234491b = cVar;
        this.f234492c = 0;
        this.f234493d = 0L;
        this.f234494e = null;
        this.f234495f = 0;
        this.f234496g = 0L;
        this.f234497h = null;
        this.f234498i = true;
        ((android.app.Application) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).registerActivityLifecycleCallbacks(cVar);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16791xed69d07.f234499a > 0) {
            k(android.os.Process.myPid(), com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16791xed69d07.f234499a);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(e(), "not processElf call up!");
        }
    }

    public static long b() {
        try {
            java.lang.String d17 = d(java.lang.String.format("/proc/%s/schedstat", java.lang.Integer.valueOf(android.os.Process.myPid())));
            if (d17 == null) {
                return -1L;
            }
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(d17.replaceAll("\n", "").split(" ")[2]);
        } catch (java.lang.Exception unused) {
            return -2L;
        }
    }

    public static java.lang.String d(java.lang.String str) {
        java.lang.Throwable th6;
        java.io.InputStream inputStream;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.io.BufferedReader bufferedReader = null;
        try {
            inputStream = com.p314xaae8f345.mm.vfs.w6.D(a17, com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null));
        } catch (java.lang.Throwable th7) {
            th6 = th7;
            inputStream = null;
        }
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb6.append(readLine);
                        sb6.append('\n');
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
                java.lang.String sb7 = sb6.toString();
                if (inputStream != null) {
                    inputStream.close();
                }
                return sb7;
            } catch (java.lang.Throwable th9) {
                th = th9;
            }
        } catch (java.lang.Throwable th10) {
            th6 = th10;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        r5 = r1[12];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long f() {
        /*
            java.lang.String r0 = "\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            int r1 = android.os.Process.myPid()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "/proc/%s/status"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r2 = 0
            java.lang.String r1 = d(r1)     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Exception -> L3e
            java.lang.String r3 = "\n"
            java.lang.String[] r1 = r1.split(r3)     // Catch: java.lang.Exception -> L3e
            int r3 = r1.length     // Catch: java.lang.Exception -> L3e
            r4 = r2
        L29:
            if (r4 >= r3) goto L39
            r5 = r1[r4]     // Catch: java.lang.Exception -> L3e
            java.lang.String r6 = "VmSize"
            boolean r6 = r5.startsWith(r6)     // Catch: java.lang.Exception -> L3e
            if (r6 == 0) goto L36
            goto L40
        L36:
            int r4 = r4 + 1
            goto L29
        L39:
            r3 = 12
            r5 = r1[r3]     // Catch: java.lang.Exception -> L3e
            goto L40
        L3e:
            java.lang.String r5 = ""
        L40:
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r1 = r0.find()
            if (r1 == 0) goto L57
            java.lang.String r0 = r0.group()
            int r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(r0, r2)
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            return r0
        L57:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328.f():long");
    }

    public abstract long a();

    public java.lang.String c() {
        long nativeHeapAllocatedSize = android.os.Debug.getNativeHeapAllocatedSize();
        if (nativeHeapAllocatedSize == 0) {
            nativeHeapAllocatedSize = android.os.Debug.getNativeHeapSize() - android.os.Debug.getNativeHeapFreeSize();
        }
        return java.lang.String.format("ProcessEfl found exception!kill process[%s] %s %s %s", java.lang.Integer.valueOf(android.os.Process.myPid()), java.lang.Long.valueOf(f()), java.lang.Long.valueOf(nativeHeapAllocatedSize), java.lang.Long.valueOf(java.lang.Runtime.getRuntime().totalMemory()));
    }

    public java.lang.String e() {
        return "AbstractProcessChecker";
    }

    public abstract boolean g();

    public boolean h() {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        if (activityManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbstractProcessChecker", "[isHighPriorityProcess] mActivityManager is null.");
            return false;
        }
        java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(50);
        if (runningServices != null) {
            for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (runningServiceInfo.foreground) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "foreground service:%s process:%s ", runningServiceInfo.service, runningServiceInfo.process);
                    return true;
                }
            }
        }
        return false;
    }

    public void i() {
        if (this.f234498i || this.f234491b.f537454f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AbstractProcessChecker", "pass this kill! app is on foreground!");
            jx3.f.INSTANCE.mo68477x336bdfd8(959L, 6L, 1L, true);
            o(false);
            return;
        }
        try {
            pb0.g.b(new yz5.p() { // from class: xp3.a$$a
                @Override // yz5.p
                /* renamed from: invoke */
                public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                    java.lang.String str = (java.lang.String) obj;
                    pb0.a aVar = (pb0.a) obj2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328 abstractC16790x31088328 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328.this;
                    abstractC16790x31088328.f234492c += aVar.size();
                    abstractC16790x31088328.f234493d += aVar.a();
                    if (abstractC16790x31088328.f234494e == null) {
                        abstractC16790x31088328.f234494e = str;
                        abstractC16790x31088328.f234495f = aVar.size();
                        abstractC16790x31088328.f234496g = aVar.a();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DUMP_BITMAP.kill", "count: %s, sum byte count: %s, %s\n trace: %s", java.lang.Integer.valueOf(aVar.size()), java.lang.Long.valueOf(aVar.a()), aVar, str);
                    return null;
                }
            });
            long freeMemory = java.lang.Runtime.getRuntime().totalMemory() - java.lang.Runtime.getRuntime().freeMemory();
            long nativeHeapAllocatedSize = android.os.Debug.getNativeHeapAllocatedSize();
            if (nativeHeapAllocatedSize == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AbstractProcessChecker", "fallback getting native heap");
                nativeHeapAllocatedSize = android.os.Debug.getNativeHeapSize() - android.os.Debug.getNativeHeapFreeSize();
            }
            lr0.b.f402159d.a(true, 400, new yz5.l() { // from class: xp3.a$$b
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328.f234489j;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328 abstractC16790x31088328 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328.this;
                    abstractC16790x31088328.getClass();
                    abstractC16790x31088328.f234497h = (java.lang.String) obj;
                    return null;
                }
            });
            xp3.j.a(freeMemory, nativeHeapAllocatedSize, this.f234492c, this.f234493d, this.f234494e, this.f234495f, this.f234496g, this.f234497h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DUMP_BITMAP.kill", "total bitmap count = %s, size = %s", java.lang.Integer.valueOf(this.f234492c), java.lang.Long.valueOf(this.f234493d));
            if (!ih.a.f(e42.d0.clicfg_matrix_memory_trigger_mem_hook_enable, true)) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
            vp3.c cVar = (vp3.c) tp3.a.INSTANCE.a(vp3.c.class);
            if (cVar.f520506g.e()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.triggers.MemoryHook", "MemoryHookTrigger: ");
                cVar.y(400);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AbstractProcessChecker", th6, "", new java.lang.Object[0]);
        }
        o(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbstractProcessChecker", "[MAPPINGS]");
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader("/proc/" + android.os.Process.myPid() + "/maps"), 1024);
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbstractProcessChecker", readLine);
                    }
                } finally {
                }
            }
            bufferedReader.close();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AbstractProcessChecker", e17, "Cannot print maps file.", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
        throw new java.lang.RuntimeException(c());
    }

    public void j(boolean z17) {
        this.f234498i = z17;
    }

    public void k(int i17, int i18) {
    }

    public abstract boolean l(long j17, long j18);

    public abstract void m();

    public abstract void n();

    public final void o(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16793x5e82fb2a c16793x5e82fb2a = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16793x5e82fb2a(g(), a(), z17, !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16795x1bcb461e), bm5.f1.a(), com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16791xed69d07.class.getName(), 1000L);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("processId", android.os.Process.myPid());
        c16793x5e82fb2a.f234509o = bundle;
        android.content.Intent intent = new android.content.Intent("ACTION_ELF_CHECK_RESPONSE");
        intent.putExtra("MicroMsg.ElfCheckResponse", c16793x5e82fb2a);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("ACTION_ELF_CHECK".equals(intent.getAction())) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f234490a;
            if (n3Var == null || n3Var.mo50287xb9a7fe99()) {
                this.f234490a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("ProcessChecker");
            }
            this.f234490a.mo50293x3498a0(new xp3.b(this, intent));
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            m();
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            n();
        }
    }
}

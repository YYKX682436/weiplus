package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes12.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.p0 f271215a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.b0 f271216b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.s f271217c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f271218d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f271219e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f271220f = null;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l0(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i0 r14) {
        /*
            r13 = this;
            r13.<init>()
            r14 = 0
            r13.f271220f = r14
            java.util.HashMap r0 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.m0.f271222a
            java.lang.String[] r0 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.p0.f271229e
            java.lang.String r0 = "MicroMsg.ResDownloaderStorage"
            r1 = 1
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L5e
            java.lang.String r3 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.p0.f271230f     // Catch: java.lang.Exception -> L5e
            r2.<init>(r3)     // Catch: java.lang.Exception -> L5e
            r2.mkdirs()     // Catch: java.lang.Exception -> L5e
            d95.b0 r2 = new d95.b0     // Catch: java.lang.Exception -> L5e
            r2.<init>()     // Catch: java.lang.Exception -> L5e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5e
            r4.<init>()     // Catch: java.lang.Exception -> L5e
            r4.append(r3)     // Catch: java.lang.Exception -> L5e
            java.lang.String r5 = "ResDown.db"
            r4.append(r5)     // Catch: java.lang.Exception -> L5e
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Exception -> L5e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5e
            r4.<init>()     // Catch: java.lang.Exception -> L5e
            r4.append(r3)     // Catch: java.lang.Exception -> L5e
            java.lang.String r3 = "EnResDown.db"
            r4.append(r3)     // Catch: java.lang.Exception -> L5e
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Exception -> L5e
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            java.lang.String r10 = wo.w0.g(r1)     // Catch: java.lang.Exception -> L5e
            java.util.HashMap r11 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.p0.f271231g     // Catch: java.lang.Exception -> L5e
            r12 = 1
            java.lang.String r7 = ""
            r4 = r2
            boolean r3 = r4.R(r5, r6, r7, r8, r10, r11, r12)     // Catch: java.lang.Exception -> L5e
            if (r3 != 0) goto L58
            java.lang.String r2 = "res downloader db init failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f(r0, r2)     // Catch: java.lang.Exception -> L5e
            goto L69
        L58:
            com.tencent.mm.pluginsdk.res.downloader.model.p0 r3 = new com.tencent.mm.pluginsdk.res.downloader.model.p0     // Catch: java.lang.Exception -> L5e
            r3.<init>(r2)     // Catch: java.lang.Exception -> L5e
            goto L6a
        L5e:
            r2 = move-exception
            java.lang.String r3 = "new storage failed, exception = %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3, r2)
        L69:
            r3 = r14
        L6a:
            r13.f271215a = r3
            if (r3 != 0) goto L78
            r0 = 0
            r13.f271219e = r0
            r13.f271216b = r14
            r13.f271218d = r14
            r13.f271217c = r14
            goto L95
        L78:
            r13.f271219e = r1
            com.tencent.mm.sdk.platformtools.n3 r14 = new com.tencent.mm.sdk.platformtools.n3
            java.lang.String r0 = "ResDownloader-EventThread"
            r14.<init>(r0)
            r13.f271218d = r14
            com.tencent.mm.pluginsdk.res.downloader.model.s r14 = new com.tencent.mm.pluginsdk.res.downloader.model.s
            com.tencent.mm.sdk.platformtools.n3 r1 = r13.b()
            r14.<init>(r1)
            r13.f271217c = r14
            com.tencent.mm.pluginsdk.res.downloader.model.b0 r1 = new com.tencent.mm.pluginsdk.res.downloader.model.b0
            r1.<init>(r0, r14)
            r13.f271216b = r1
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0.<init>(com.tencent.mm.pluginsdk.res.downloader.model.i0):void");
    }

    public int a(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u uVar) {
        if (!this.f271219e) {
            return -1;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uVar.f271250f);
        java.lang.String str = uVar.f271245a;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderCore", "request#%s with null url, ignore", str);
            return 3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderCore", "request#%s post to network worker", str);
        return this.f271216b.g(uVar);
    }

    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 b() {
        if (this.f271220f == null) {
            this.f271220f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("ResDownloader-WorkerThread");
            this.f271220f.m77789xc5a5549d(false);
        }
        return this.f271220f;
    }

    public boolean c(java.lang.String str) {
        if (this.f271219e) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.b0 b0Var = this.f271216b;
            if (((java.util.concurrent.ConcurrentHashMap) b0Var.f271225b).containsKey(str) || b0Var.d(str)) {
                return true;
            }
        }
        return false;
    }

    public void d(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        b().m77784x795fa299(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.k0(runnable, null));
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e(java.lang.String str) {
        if (!this.f271219e) {
            return null;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 z07 = this.f271215a.z0(str);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(z07 != null);
        objArr[2] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderCore", "doQuery: urlKey = %s, ret = %b, cost = %d", objArr);
        return z07;
    }

    public void f(int i17) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0> linkedList;
        java.util.Set newSetFromMap;
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, networkType = %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, networkType is unavailable");
            return;
        }
        boolean z17 = this.f271219e;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, core can not work");
            return;
        }
        if (z17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.database.Cursor mo78085xb5882a6b = this.f271215a.mo78085xb5882a6b();
            if (mo78085xb5882a6b != null) {
                if (mo78085xb5882a6b.getCount() <= 0) {
                    mo78085xb5882a6b.close();
                } else {
                    linkedList = new java.util.LinkedList();
                    mo78085xb5882a6b.moveToFirst();
                    do {
                        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0();
                        n0Var.mo9015xbf5d97fd(mo78085xb5882a6b);
                        linkedList.add(n0Var);
                    } while (mo78085xb5882a6b.moveToNext());
                    mo78085xb5882a6b.close();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderCore", "queryAll: cost = %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            }
            linkedList = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderCore", "queryAll: cost = %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } else {
            linkedList = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, no record stored, skip this resumeAll-op");
            return;
        }
        for (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var2 : linkedList) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n0Var2.f68781x3bf12d1c)) {
                int hashCode = n0Var2.f68781x3bf12d1c.hashCode();
                for (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.o oVar : com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.m0.a()) {
                    oVar.getClass();
                    if (hashCode == -1894509183) {
                        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.a0 a0Var = ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.n) oVar).f271160c;
                        a0Var.getClass();
                        long j17 = n0Var2.f68774x876650f1;
                        if (j17 != 0 && j17 <= com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "urlKey(%s) exceed expire time(%d), delete", n0Var2.f68798x13f2e555, java.lang.Long.valueOf(n0Var2.f68774x876650f1));
                            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
                            java.lang.String str = n0Var2.f68798x13f2e555;
                            if (l0Var.f271219e) {
                                l0Var.f271215a.d(str);
                            }
                            o35.a.a(n0Var2.f68777xf1e9b966);
                            o35.a.a(n0Var2.f68777xf1e9b966 + ".decompressed");
                            o35.a.a(n0Var2.f68777xf1e9b966 + ".decrypted");
                            java.lang.String str2 = n0Var2.f68798x13f2e555;
                            if (l0Var.f271219e) {
                                l0Var.f271216b.a(str2);
                            }
                        } else if (i17 == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "network unavailable, skip");
                        } else if (2 == i17 && 1 == n0Var2.f68787xf813eec3) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "network type = gprs, record network type = wifi, skip this ");
                        } else if (n0Var2.f68771xd0fcddd4) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "record(%s), should have been deleted", n0Var2.f68798x13f2e555);
                            o35.a.a(n0Var2.f68777xf1e9b966);
                            o35.a.a(n0Var2.f68777xf1e9b966 + ".decompressed");
                            o35.a.a(n0Var2.f68777xf1e9b966 + ".decrypted");
                        } else if (n0Var2.f68786xda09c2ad) {
                            int i19 = n0Var2.f68795x10a0fed7;
                            if (i19 == 2) {
                                long g17 = o35.a.g(n0Var2.f68777xf1e9b966);
                                if (n0Var2.f68769x590f923a > g17 && !com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.a0.b(n0Var2)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "%d.%d content-length(%d) > fileSize(%d), resume download", java.lang.Integer.valueOf(n0Var2.f68792xb5ef19b5), java.lang.Integer.valueOf(n0Var2.f68796x5334f55), java.lang.Long.valueOf(n0Var2.f68769x590f923a), java.lang.Long.valueOf(g17));
                                    if (0 == g17) {
                                        if (!n0Var2.f68786xda09c2ad) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "no need retry, resType %d, subType %d, version %s", java.lang.Integer.valueOf(n0Var2.f68792xb5ef19b5), java.lang.Integer.valueOf(n0Var2.f68796x5334f55), n0Var2.f68780xf1e133f7);
                                        } else if (1 != i17) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "fileSize = 0, completed file may be deleted by user, skip this because it's not wifi");
                                        } else {
                                            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p c17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c();
                                            synchronized (c17.f271165a) {
                                                newSetFromMap = java.util.Collections.newSetFromMap(new x.b(c17.f271165a.size()));
                                                newSetFromMap.addAll(c17.f271165a);
                                            }
                                            java.util.Iterator it = newSetFromMap.iterator();
                                            if (it.hasNext()) {
                                                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                                                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(n0Var2.f68780xf1e133f7, 0);
                                                throw null;
                                            }
                                            n0Var2.f68779xcef2f7da = true;
                                            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p c18 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c();
                                            int i27 = n0Var2.f68792xb5ef19b5;
                                            int i28 = n0Var2.f68796x5334f55;
                                            java.lang.String str3 = n0Var2.f68782x3bf12d1d;
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            c18.i(i27, i28, 0, str3.equals("NewXml"));
                                            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.g(n0Var2, true);
                                        }
                                    }
                                    com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.e(n0Var2.f68792xb5ef19b5, n0Var2.f68796x5334f55, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(n0Var2.f68780xf1e133f7, 0), (int) n0Var2.f68791x44eeb14, 76);
                                    com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.a(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t.d(n0Var2));
                                } else if (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.a0.b(n0Var2)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 check ok, file download complete, throw event to do decrypt");
                                    a0Var.c(n0Var2);
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "file invalid, re-download");
                                    a0Var.a(n0Var2, 1 == i17);
                                }
                            } else if (i19 == 1 || i19 == 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "db status: downloading or waiting, db content-length %d", java.lang.Long.valueOf(n0Var2.f68769x590f923a));
                                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var2 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
                                if (l0Var2.c(n0Var2.f68798x13f2e555)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "request already in downloading queue");
                                } else if (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.a0.b(n0Var2)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 match, request complete, throw event to do decrypt");
                                    n0Var2.f68795x10a0fed7 = 2;
                                    n0Var2.f68769x590f923a = o35.a.g(n0Var2.f68777xf1e9b966);
                                    l0Var2.g(n0Var2, true);
                                    a0Var.c(n0Var2);
                                } else {
                                    if (0 == o35.a.g(n0Var2.f68777xf1e9b966)) {
                                        n0Var2.f68779xcef2f7da = true;
                                        l0Var2.g(n0Var2, true);
                                        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p c19 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c();
                                        int i29 = n0Var2.f68792xb5ef19b5;
                                        int i37 = n0Var2.f68796x5334f55;
                                        java.lang.String str4 = n0Var2.f68782x3bf12d1d;
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        i18 = 0;
                                        c19.i(i29, i37, 0, str4.equals("NewXml"));
                                    } else {
                                        i18 = 0;
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 not match,  download");
                                    com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.e(n0Var2.f68792xb5ef19b5, n0Var2.f68796x5334f55, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(n0Var2.f68780xf1e133f7, i18), (int) n0Var2.f68791x44eeb14, 76);
                                    l0Var2.a(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t.d(n0Var2));
                                }
                            } else if (i19 == 4 || i19 == 3) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "file invalid, re-download");
                                n0Var2.f68795x10a0fed7 = 0;
                                a0Var.a(n0Var2, true);
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "no need retry, resType %d, subType %d, version %s", java.lang.Integer.valueOf(n0Var2.f68792xb5ef19b5), java.lang.Integer.valueOf(n0Var2.f68796x5334f55), n0Var2.f68780xf1e133f7);
                        }
                    }
                }
            }
        }
    }

    public void g(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var, boolean z17) {
        boolean z18;
        if (this.f271219e) {
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String str = n0Var.f68798x13f2e555;
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.p0 p0Var = this.f271215a;
            if (p0Var.z0(str) != null) {
                p0Var.J0(n0Var);
                z18 = false;
            } else {
                p0Var.mo880xb970c2b9(n0Var);
                z18 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderCore", "doUpdate: urlKey = %s, opIsInsert(%b) cost = %d", n0Var.f68798x13f2e555, java.lang.Boolean.valueOf(z18), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }
}

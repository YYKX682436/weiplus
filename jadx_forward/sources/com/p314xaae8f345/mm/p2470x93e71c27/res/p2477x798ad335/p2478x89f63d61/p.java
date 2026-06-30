package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f271164c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f271165a = java.util.Collections.newSetFromMap(new x.b(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.f271093c.length));

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.h0 f271166b = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.h0();

    public p(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c cVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e eVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e(this);
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
        if (l0Var.f271219e) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.s sVar = l0Var.f271217c;
            sVar.getClass();
            java.util.Objects.toString(eVar);
            synchronized (sVar.f271241c) {
                java.util.List list = (java.util.List) sVar.f271240b.get(-1894509183);
                list = list == null ? new java.util.LinkedList() : list;
                list.add(eVar);
                sVar.f271240b.put(-1894509183, list);
            }
        }
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p c() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.o.f271163a;
        }
        iz5.a.h("Inaccessible in child process.");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r5 >= 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f68798x13f2e555
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.h0 r0 = r6.f271166b
            r0.getClass()
            java.lang.String r1 = r7.f68798x13f2e555
            boolean r1 = r0.d(r1)
            java.lang.String r2 = "URLKey(%s) is already decrypting, skip repeated task"
            java.lang.String r3 = "MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor"
            if (r1 == 0) goto L17
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            goto L67
        L17:
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a r7 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.a.b(r7)
            java.lang.String r1 = r7.f271065a
            boolean r4 = r0.d(r1)
            if (r4 == 0) goto L2b
            java.lang.Object[] r7 = new java.lang.Object[]{r1}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2, r7)
            goto L67
        L2b:
            boolean r2 = r7.f271071g
            if (r2 == 0) goto L37
            int r4 = r7.f271068d
            int r5 = r7.f271074j
            if (r4 != r5) goto L37
            if (r5 >= 0) goto L3d
        L37:
            if (r2 != 0) goto L3f
            boolean r2 = r7.f271072h
            if (r2 == 0) goto L3f
        L3d:
            r2 = 1
            goto L40
        L3f:
            r2 = 0
        L40:
            if (r2 != 0) goto L43
            goto L67
        L43:
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r4 = "request#URLKey(%s) posted to decryptWorker"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r2)
            r0.f(r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L51
            goto L67
        L51:
            r2 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2}
            java.lang.String r4 = "submitRequest(%s) get rejected[%s]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r4, r2)
            r0.a(r1)
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.g0 r0 = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.g0
            r0.<init>(r7)
            r0.run()
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.a(com.tencent.mm.pluginsdk.res.downloader.model.n0):void");
    }

    public java.lang.String b(int i17, int i18) {
        java.lang.String str;
        if (!f271164c) {
            java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s("wcf://PublicResource/CheckResUpdate", false);
            if (s17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckResUpdate", "Directory %s exists, start migration");
                int i19 = 0;
                int i27 = 0;
                for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                    if (com.p314xaae8f345.mm.vfs.w6.x("wcf://PublicResource/CheckResUpdate/" + x1Var.f294765b, "wcf://CheckResUpdate/" + x1Var.f294765b, false)) {
                        i27++;
                    } else {
                        i19++;
                    }
                }
                if (i19 == 0) {
                    com.p314xaae8f345.mm.vfs.w6.g("wcf://PublicResource/CheckResUpdate", false);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckResUpdate", "Migration done, success: %d, failure: %d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19));
            }
            f271164c = true;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.e(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.c(i17, i18));
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, get null info, return", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return null;
        }
        boolean z17 = e17.f68771xd0fcddd4;
        java.lang.String str2 = e17.f68777xf1e9b966;
        if (str2 != null && str2.contains("/files/public/CheckResUpdate/")) {
            if (!com.p314xaae8f345.mm.vfs.w6.j(e17.f68777xf1e9b966)) {
                if (!com.p314xaae8f345.mm.vfs.w6.j(e17.f68777xf1e9b966 + ".decompressed")) {
                    if (!com.p314xaae8f345.mm.vfs.w6.j(e17.f68777xf1e9b966 + ".decrypted")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "Found old location, fix record: %s", e17.f68777xf1e9b966);
                        e17.f68777xf1e9b966 = e17.f68777xf1e9b966.replace("/files/public/CheckResUpdate/", "/MicroMsg/CheckResUpdate/");
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ResDownloader.CheckResUpdateHelper", "Old location exists, migration failed???");
        }
        boolean z18 = e17.f68775x9cdeb823;
        if (!z18 && !e17.f68776x7d1f4984) {
            if (!e17.f68771xd0fcddd4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f68777xf1e9b966)) {
                java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(e17.f68777xf1e9b966);
                if ((p17 != null ? p17 : "").equals(e17.f68785x4b6e68b9)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, not need decrypt and file valid, return path(%s)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), e17.f68777xf1e9b966);
                    return e17.f68777xf1e9b966;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, not need decrypt and file invalid, return null", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return null;
        }
        if (z18) {
            str = e17.f68777xf1e9b966 + ".decompressed";
        } else if (e17.f68776x7d1f4984) {
            str = e17.f68777xf1e9b966 + ".decrypted";
        } else {
            str = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, need decrypt or decompress, filePath invalid return null ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f68788xd2f45e28)) {
            java.lang.String p18 = com.p314xaae8f345.mm.vfs.w6.p(str);
            if ((p18 != null ? p18 : "").equals(e17.f68788xd2f45e28)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, need decrypt or decompress, file valid, ret = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                return str;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, needDecrypt(%b) needDecompress(%b), file invalid, return null ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(e17.f68776x7d1f4984), java.lang.Boolean.valueOf(e17.f68775x9cdeb823));
        return null;
    }

    public void d(int i17, int i18, int i19, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.d(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c(this, i17, i18, i19, z17));
    }

    public void e(int i17, r45.vr5 vr5Var, boolean z17) {
        int i18;
        int i19;
        byte[] bArr;
        int i27;
        java.lang.String str;
        java.lang.String c17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.c(i17, vr5Var.f470001d);
        if (vr5Var.f470002e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveCacheOperation(%s), resource.Info = null, return", c17);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[9];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(vr5Var.f470001d);
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = java.lang.Integer.valueOf(vr5Var.f470002e.f452559e);
        java.util.LinkedList linkedList = vr5Var.f470002e.f452562h;
        objArr[4] = linkedList == null ? "null" : java.lang.String.valueOf(linkedList.size());
        objArr[5] = java.lang.Integer.valueOf(vr5Var.f470005h);
        objArr[6] = vr5Var.f470006i;
        r45.bs5 bs5Var = vr5Var.f470002e;
        objArr[7] = bs5Var.f452560f;
        objArr[8] = bs5Var.f452563i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive cache-op, urlKey = %d.%d,  fromNewXml = %b, file version = %d, eccSignatureList.size = %s, reportId = %s, sampleId = %s, url = %s, data = %s", objArr);
        java.util.LinkedList linkedList2 = vr5Var.f470002e.f452562h;
        if (linkedList2 != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                r45.y56 y56Var = (r45.y56) it.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "cache-op, sigInfo: version(%d), signature(%s) ", java.lang.Integer.valueOf(y56Var.f472343d), y56Var.f472344e.i());
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(vr5Var.f470005h, 2L);
        if (!z17) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(vr5Var.f470005h, 1L);
        }
        int i28 = vr5Var.f470007m;
        if (i28 != 0 && i28 <= com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "recourse(%s) is expired before do download, expireTime = %d, fileVersion = %d", c17, java.lang.Integer.valueOf(vr5Var.f470007m), java.lang.Integer.valueOf(vr5Var.f470002e.f452559e));
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(vr5Var.f470005h, 14L);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(vr5Var.f470005h, 44L);
            int i29 = vr5Var.f470001d;
            r45.bs5 bs5Var2 = vr5Var.f470002e;
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.c(i17, i29, bs5Var2.f452560f, bs5Var2.f452559e, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.d0.FILE_EXPIRED, false, z17, false, vr5Var.f470006i);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vr5Var.f470002e.f452560f) && vr5Var.f470002e.f452563i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "cache-op, invalid cache operation, url and data is null or nil, skip");
            return;
        }
        r45.bs5 bs5Var3 = vr5Var.f470002e;
        java.lang.String str2 = bs5Var3.f452560f;
        int i37 = vr5Var.f470001d;
        long j17 = vr5Var.f470007m;
        int i38 = bs5Var3.f452559e;
        java.lang.String str3 = bs5Var3.f452558d;
        int i39 = bs5Var3.f452561g;
        boolean z18 = (i39 & 2) > 0;
        boolean z19 = (i39 & 1) > 0;
        long j18 = vr5Var.f470005h;
        java.lang.String str4 = vr5Var.f470006i;
        int i47 = vr5Var.f470008n;
        int i48 = i47 > 0 ? i47 : 3;
        int i49 = vr5Var.f470009o;
        int i57 = vr5Var.f470010p;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(bs5Var3.f452562h)) {
            i18 = i49;
            i19 = 0;
            bArr = null;
        } else {
            i18 = i49;
            i19 = 0;
            bArr = ((r45.y56) vr5Var.f470002e.f452562h.get(0)).f472344e.f273689a;
        }
        r45.as5 as5Var = vr5Var.f470003f;
        if (as5Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(as5Var.f451777e)) {
            i27 = i19;
            str = null;
        } else {
            r45.as5 as5Var2 = vr5Var.f470003f;
            java.lang.String str5 = as5Var2.f451777e;
            i27 = as5Var2.f451776d;
            str = str5;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = vr5Var.f470002e.f452563i;
        byte[] g17 = (gVar == null || gVar.f273689a.length <= 0) ? null : gVar.g();
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.z zVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.z(str2, c17, i38, i57, i48, j17, str3, i17, i37, j18, str4, bArr, vr5Var.f470002e.f452564m, z18, z19, str, i27, i18, g17, r2.f452565n, z17, false, vr5Var.f470012r);
        zVar.mo75308x9616526c();
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.d(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.g(this, c17, zVar));
    }

    public void f(int i17, r45.vr5 vr5Var, boolean z17, boolean z18) {
        java.lang.String c17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.c(i17, vr5Var.f470001d);
        r45.as5 as5Var = vr5Var.f470003f;
        if (as5Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(as5Var.f451777e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveDecryptOperation(), resource.Key invalid, resource=%d.%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(vr5Var.f470001d));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive decrypt-op, fromNewXml(%b), %d.%d, key version (%d)", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(vr5Var.f470001d), java.lang.Integer.valueOf(vr5Var.f470003f.f451776d));
        java.lang.String str = vr5Var.f470003f.f451777e;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(vr5Var.f470005h, 4L);
        java.lang.String str2 = vr5Var.f470002e.f452564m;
        r45.as5 as5Var2 = vr5Var.f470003f;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.h hVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.h(this, c17, str2, as5Var2.f451777e, as5Var2.f451776d, vr5Var.f470005h, vr5Var.f470006i, z18);
        if (z18) {
            hVar.run();
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.d(hVar);
        }
    }

    public void g(int i17, r45.vr5 vr5Var, boolean z17) {
        java.lang.String c17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.c(i17, vr5Var.f470001d);
        if (vr5Var.f470002e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveDeleteOperation(), resource.Info = null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive delete-op, fromNewXml(%b), %d.%d, file version (%d)", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(vr5Var.f470001d), java.lang.Integer.valueOf(vr5Var.f470002e.f452559e));
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(vr5Var.f470005h, 3L);
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.d(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.f(this, c17, i17, vr5Var.f470001d, vr5Var.f470002e.f452559e, vr5Var.f470005h, vr5Var.f470006i, z17));
    }

    public void h(int i17, int i18, java.lang.String str, int i19, java.lang.String str2) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.d(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.i(this, i17, i18, str, i19, str2));
    }

    public void i(int i17, int i18, int i19, boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.f271218d;
        if (n3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.ResDownloader.CheckResUpdateHelper", "sendEventPreOperation: get null eventThread ");
        } else {
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.b(this, i19, i17, i18, z17));
        }
    }
}

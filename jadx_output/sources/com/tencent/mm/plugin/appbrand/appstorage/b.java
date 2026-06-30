package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class b extends c01.i8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f76140a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.f f76141b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.g0 f76142c;

    /* renamed from: d, reason: collision with root package name */
    public final long f76143d;

    public b(java.lang.String appid, java.lang.String encryptMMKVStorageSecretKey) {
        kotlin.jvm.internal.o.g(appid, "appid");
        kotlin.jvm.internal.o.g(encryptMMKVStorageSecretKey, "encryptMMKVStorageSecretKey");
        this.f76140a = appid;
        this.f76141b = com.tencent.mm.plugin.appbrand.appstorage.f.f76162i.b(new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(appid)).longValue(), appid, encryptMMKVStorageSecretKey, null);
        this.f76142c = com.tencent.mm.plugin.appbrand.appstorage.g0.f76181h.a(new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(appid)).longValue());
        this.f76143d = new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(appid)).longValue();
    }

    @Override // c01.i8
    public java.lang.String a() {
        return "MicroMsg.AppBrandEncryptKVStorageTransfer";
    }

    @Override // c01.i8
    public boolean b(int i17) {
        android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
        java.lang.String appId = this.f76140a;
        kotlin.jvm.internal.o.g(appId, "appId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("keyHadFinishTransfer");
        sb6.append('#');
        long j17 = this.f76143d;
        sb6.append(j17);
        sb6.append('#');
        sb6.append(appId);
        boolean z17 = false;
        if (d17.getBoolean(sb6.toString(), false)) {
            kotlin.jvm.internal.o.g(appId, "appId");
            if (!com.tencent.mm.sdk.platformtools.o4.L().getBoolean("keyHadFinishTransferToEncryptMMKV#" + j17 + '#' + appId, false)) {
                z17 = true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "needTransfer " + z17);
        return z17;
    }

    @Override // c01.i8
    public void c(int i17) {
        boolean z17;
        char c17;
        boolean z18;
        boolean z19;
        int i18;
        int i19;
        char c18;
        com.tencent.mm.plugin.appbrand.appstorage.a aVar;
        boolean z27;
        com.tencent.mm.plugin.appbrand.appstorage.c cVar = com.tencent.mm.plugin.appbrand.appstorage.c.f76149a;
        synchronized (cVar) {
            com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
            com.tencent.mm.plugin.appbrand.app.r9.mj();
            z17 = com.tencent.mm.plugin.appbrand.appstorage.c.f76150b;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] isNeedTransfer = false");
            return;
        }
        synchronized (cVar) {
            com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
            com.tencent.mm.plugin.appbrand.app.r9.mj();
            c17 = 0;
            z18 = com.tencent.mm.plugin.appbrand.appstorage.c.f76151c == 2;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "rollback phases, clear [had transfer to encrypt mmkv] flag");
            long j17 = this.f76143d;
            java.lang.String appId = this.f76140a;
            kotlin.jvm.internal.o.g(appId, "appId");
            com.tencent.mm.sdk.platformtools.o4.L().putBoolean("hadTransferToEncryptMMKV#" + j17 + '#' + appId, false);
            this.f76141b.a(this.f76140a);
            return;
        }
        long j18 = this.f76143d;
        java.lang.String appId2 = this.f76140a;
        kotlin.jvm.internal.o.g(appId2, "appId");
        boolean z28 = com.tencent.mm.sdk.platformtools.o4.L().getBoolean("hadTransferToEncryptMMKV#" + j18 + '#' + appId2, false);
        if (z28) {
            synchronized (cVar) {
                com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
                com.tencent.mm.plugin.appbrand.app.r9.mj();
                z27 = com.tencent.mm.plugin.appbrand.appstorage.c.f76151c == 3;
            }
            if (z27) {
                d();
                long j19 = this.f76143d;
                java.lang.String appId3 = this.f76140a;
                kotlin.jvm.internal.o.g(appId3, "appId");
                com.tencent.mm.sdk.platformtools.o4.L().putBoolean("keyHadFinishTransferToEncryptMMKV#" + j19 + '#' + appId3, true);
                return;
            }
        }
        if (z28) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] had transfer to encrypt mmkv, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "start transfer");
        long j27 = 0;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1817L, 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "clear MMKV");
        this.f76141b.a(this.f76140a);
        com.tencent.mm.plugin.appbrand.appstorage.g0 g0Var = this.f76142c;
        java.lang.String appId4 = this.f76140a;
        g0Var.getClass();
        kotlin.jvm.internal.o.g(appId4, "appId");
        int[] f17 = com.tencent.mm.plugin.appbrand.appstorage.a2.f(appId4, g0Var.f76185f, g0Var.f76186g);
        int K = this.f76142c.K(this.f76140a);
        int length = f17.length;
        int i27 = 0;
        int i28 = 0;
        long j28 = 0;
        while (i28 < length) {
            int i29 = f17[i28];
            com.tencent.mm.plugin.appbrand.appstorage.g0 g0Var2 = this.f76142c;
            java.lang.String str = this.f76140a;
            int[] iArr = f17;
            java.lang.Object obj = g0Var2.t(i29, str)[c17];
            java.util.ArrayList arrayList = obj instanceof java.util.ArrayList ? (java.util.ArrayList) obj : null;
            if (arrayList == null) {
                aVar = new com.tencent.mm.plugin.appbrand.appstorage.a(0L, 0L, 0);
            } else if (arrayList.size() == 0) {
                aVar = new com.tencent.mm.plugin.appbrand.appstorage.a(0L, 0L, 0);
            } else {
                i18 = length;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] key size = " + arrayList.size());
                java.util.Iterator it = arrayList.iterator();
                long j29 = 0;
                long j37 = 0;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    java.util.Iterator it6 = it;
                    java.lang.String str2 = next instanceof java.lang.String ? (java.lang.String) next : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    java.lang.Object[] o17 = g0Var2.o(i29, str, str2);
                    long currentTimeMillis3 = j29 + (java.lang.System.currentTimeMillis() - currentTimeMillis2);
                    com.tencent.mm.plugin.appbrand.appstorage.g0 g0Var3 = g0Var2;
                    java.lang.Object obj2 = o17[1];
                    java.lang.String str3 = str;
                    java.lang.Object obj3 = o17[2];
                    int i37 = K;
                    if (!kotlin.jvm.internal.o.b(str2, "") && o17[0] == com.tencent.mm.plugin.appbrand.appstorage.o1.NONE && (obj2 instanceof java.lang.String) && (obj3 instanceof java.lang.String)) {
                        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                        this.f76141b.l(i29, this.f76140a, str2, (java.lang.String) obj2, (java.lang.String) obj3);
                        j37 += java.lang.System.currentTimeMillis() - currentTimeMillis4;
                    }
                    it = it6;
                    j29 = currentTimeMillis3;
                    g0Var2 = g0Var3;
                    str = str3;
                    K = i37;
                }
                i19 = K;
                c18 = 2;
                aVar = new com.tencent.mm.plugin.appbrand.appstorage.a(j29, j37, arrayList.size());
                j27 += aVar.f76133a;
                j28 += aVar.f76134b;
                i27 += aVar.f76135c;
                i28++;
                f17 = iArr;
                length = i18;
                K = i19;
                c17 = 0;
            }
            i19 = K;
            i18 = length;
            c18 = 2;
            j27 += aVar.f76133a;
            j28 += aVar.f76134b;
            i27 += aVar.f76135c;
            i28++;
            f17 = iArr;
            length = i18;
            K = i19;
            c17 = 0;
        }
        int i38 = K;
        long currentTimeMillis5 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        if (5000 < currentTimeMillis5) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1817L, 10L);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1817L, 9L);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "finish transfer, cost total time= " + currentTimeMillis5 + " ms read time = " + j27 + " ms, write time = " + j28 + " ms");
        int K2 = this.f76141b.K(this.f76140a);
        com.tencent.mm.plugin.appbrand.appstorage.f fVar = this.f76141b;
        java.lang.String appId5 = this.f76140a;
        fVar.getClass();
        kotlin.jvm.internal.o.g(appId5, "appId");
        int e17 = fVar.f76168g.e(appId5);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "newbytes =" + K2 + " oldbytes =" + i38 + "  newsize =" + e17 + "  oldsize =" + i27 + ' ');
        boolean z29 = K2 == i38;
        boolean z37 = e17 == i27;
        if (z29 && z37) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1817L, 1L);
        } else if (!z29 && !z37) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1817L, 4L);
        } else if (!z29) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1817L, 3L);
        } else if (!z37) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1817L, 2L);
        }
        if (e17 != i27) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("tansfer failed ");
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z19 = false;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandEncryptKVStorageTransfer", illegalStateException, "transfer failed", new java.lang.Object[0]);
        } else {
            z19 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "finish transfer, prev ");
        java.lang.String appId6 = this.f76140a;
        kotlin.jvm.internal.o.g(appId6, "appId");
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hadTransferToEncryptMMKV#");
        long j38 = this.f76143d;
        sb6.append(j38);
        sb6.append('#');
        sb6.append(appId6);
        L.putBoolean(sb6.toString(), true);
        synchronized (com.tencent.mm.plugin.appbrand.appstorage.c.f76149a) {
            com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
            com.tencent.mm.plugin.appbrand.app.r9.mj();
            if (com.tencent.mm.plugin.appbrand.appstorage.c.f76151c == 3) {
                z19 = true;
            }
        }
        if (z19) {
            d();
            com.tencent.mm.sdk.platformtools.o4.L().putBoolean("keyHadFinishTransferToEncryptMMKV#" + j38 + '#' + appId6, true);
        }
    }

    public final void d() {
        java.lang.String appId = this.f76140a;
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("keyHadCleanNoEncryptMMKVData#");
        long j17 = this.f76143d;
        sb6.append(j17);
        sb6.append('#');
        sb6.append(appId);
        if (L.getBoolean(sb6.toString(), false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] had clear old scheme data, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] clear old scheme data");
        this.f76142c.a(appId);
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.sdk.platformtools.o4.L().putBoolean("keyHadCleanNoEncryptMMKVData#" + j17 + '#' + appId, true);
    }
}

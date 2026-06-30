package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class s extends c01.i8 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appstorage.q f76312e = new com.tencent.mm.plugin.appbrand.appstorage.q(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f76313a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.g0 f76314b;

    /* renamed from: c, reason: collision with root package name */
    public final long f76315c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f76316d;

    public s(java.lang.String appid) {
        kotlin.jvm.internal.o.g(appid, "appid");
        this.f76313a = appid;
        this.f76314b = com.tencent.mm.plugin.appbrand.appstorage.g0.f76181h.a(new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(appid)).longValue());
        this.f76315c = new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(appid)).longValue();
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("AppBrandKVStorageTransfer");
        kotlin.jvm.internal.o.f(R, "getSingleMMKV(...)");
        this.f76316d = R;
    }

    @Override // c01.i8
    public java.lang.String a() {
        return "MicroMsg.AppBrandKVStorageTransfer";
    }

    @Override // c01.i8
    public boolean b(int i17) {
        android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
        com.tencent.mm.plugin.appbrand.appstorage.q qVar = f76312e;
        kotlin.jvm.internal.o.d(d17);
        boolean z17 = !qVar.b(d17, this.f76315c, this.f76313a);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKVStorageTransfer", "needTransfer " + z17);
        return z17;
    }

    @Override // c01.i8
    public void c(int i17) {
        boolean z17;
        boolean z18;
        boolean z19;
        int i18;
        android.content.SharedPreferences sharedPreferences;
        int i19;
        com.tencent.mm.plugin.appbrand.appstorage.r rVar;
        boolean z27;
        com.tencent.mm.plugin.appbrand.appstorage.t tVar = com.tencent.mm.plugin.appbrand.appstorage.t.f76321a;
        synchronized (tVar) {
            com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
            com.tencent.mm.plugin.appbrand.app.r9.mj();
            z17 = com.tencent.mm.plugin.appbrand.appstorage.t.f76322b;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] isNeedTransfer = false");
            return;
        }
        android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
        char c17 = 0;
        if (tVar.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKVStorageTransfer", "rollback phases, clear [had transfer to mmkv] flag");
            kotlin.jvm.internal.o.d(d17);
            f(d17, false);
            this.f76314b.a(this.f76313a);
            return;
        }
        com.tencent.mm.plugin.appbrand.appstorage.q qVar = f76312e;
        kotlin.jvm.internal.o.d(d17);
        boolean c18 = qVar.c(d17, this.f76315c, this.f76313a);
        if (c18) {
            synchronized (tVar) {
                com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
                com.tencent.mm.plugin.appbrand.app.r9.mj();
                z27 = com.tencent.mm.plugin.appbrand.appstorage.t.f76323c == 3;
            }
            if (z27) {
                d(d17);
                e(d17);
                return;
            }
        }
        if (c18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] had transfer to mmkv, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKVStorageTransfer", "start transfer");
        long j17 = 0;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1016L, 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKVStorageTransfer", "clear MMKV");
        this.f76314b.a(this.f76313a);
        com.tencent.mm.plugin.appbrand.appstorage.o Bi = com.tencent.mm.plugin.appbrand.app.r9.Bi();
        int[] f17 = com.tencent.mm.plugin.appbrand.appstorage.a2.f(this.f76313a, Bi.f76286e, Bi.f76287f);
        int K = com.tencent.mm.plugin.appbrand.app.r9.Bi().K(this.f76313a);
        int length = f17.length;
        int i27 = 0;
        int i28 = 0;
        long j18 = 0;
        while (i27 < length) {
            int i29 = f17[i27];
            com.tencent.mm.plugin.appbrand.appstorage.o Bi2 = com.tencent.mm.plugin.appbrand.app.r9.Bi();
            int[] iArr = f17;
            java.lang.String str = this.f76313a;
            java.lang.Object obj = Bi2.t(i29, str)[c17];
            java.util.ArrayList arrayList = obj instanceof java.util.ArrayList ? (java.util.ArrayList) obj : null;
            if (arrayList == null) {
                rVar = new com.tencent.mm.plugin.appbrand.appstorage.r(0L, 0L, 0);
            } else if (arrayList.size() == 0) {
                rVar = new com.tencent.mm.plugin.appbrand.appstorage.r(0L, 0L, 0);
            } else {
                i18 = length;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] key size = " + arrayList.size());
                java.util.Iterator it = arrayList.iterator();
                long j19 = 0;
                long j27 = 0;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    java.util.Iterator it6 = it;
                    java.lang.String str2 = next instanceof java.lang.String ? (java.lang.String) next : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    android.content.SharedPreferences sharedPreferences2 = d17;
                    java.lang.Object[] o17 = com.tencent.mm.plugin.appbrand.app.r9.Bi().o(i29, str, str2);
                    java.lang.String str3 = str;
                    kotlin.jvm.internal.o.f(o17, "get(...)");
                    long currentTimeMillis3 = j19 + (java.lang.System.currentTimeMillis() - currentTimeMillis2);
                    int i37 = K;
                    java.lang.Object obj2 = o17[1];
                    java.lang.Object obj3 = o17[2];
                    if (!kotlin.jvm.internal.o.b(str2, "") && o17[0] == com.tencent.mm.plugin.appbrand.appstorage.o1.NONE && (obj2 instanceof java.lang.String) && (obj3 instanceof java.lang.String)) {
                        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                        this.f76314b.l(i29, this.f76313a, str2, (java.lang.String) obj2, (java.lang.String) obj3);
                        j27 += java.lang.System.currentTimeMillis() - currentTimeMillis4;
                    }
                    it = it6;
                    d17 = sharedPreferences2;
                    str = str3;
                    j19 = currentTimeMillis3;
                    K = i37;
                }
                sharedPreferences = d17;
                i19 = K;
                rVar = new com.tencent.mm.plugin.appbrand.appstorage.r(j19, j27, arrayList.size());
                j17 += rVar.f76309a;
                j18 += rVar.f76310b;
                i28 += rVar.f76311c;
                i27++;
                f17 = iArr;
                length = i18;
                d17 = sharedPreferences;
                K = i19;
                c17 = 0;
            }
            sharedPreferences = d17;
            i19 = K;
            i18 = length;
            j17 += rVar.f76309a;
            j18 += rVar.f76310b;
            i28 += rVar.f76311c;
            i27++;
            f17 = iArr;
            length = i18;
            d17 = sharedPreferences;
            K = i19;
            c17 = 0;
        }
        android.content.SharedPreferences sharedPreferences3 = d17;
        int i38 = K;
        long currentTimeMillis5 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        if (5000 < currentTimeMillis5) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1016L, 12L);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1016L, 11L);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKVStorageTransfer", "finish transfer, cost total time= " + currentTimeMillis5 + " ms read time = " + j17 + " ms, write time = " + j18 + " ms");
        int K2 = this.f76314b.K(this.f76313a);
        int e17 = this.f76314b.e(this.f76313a);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKVStorageTransfer", "newbytes =" + K2 + " oldbytes =" + i38 + "  newsize =" + e17 + "  oldsize =" + i28 + ' ');
        boolean z28 = K2 == i38;
        boolean z29 = e17 == i28;
        if (z28 && z29) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1016L, 1L);
        } else if (!z28 && !z29) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1016L, 4L);
        } else if (!z28) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1016L, 3L);
        } else if (!z29) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1016L, 2L);
        }
        if (e17 != i28) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("tansfer failed ");
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z18 = false;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandKVStorageTransfer", illegalStateException, "transfer failed", new java.lang.Object[0]);
        } else {
            z18 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKVStorageTransfer", "finish transfer, prev ");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16335, this.f76313a, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(K2), java.lang.Integer.valueOf(this.f76314b.e(this.f76313a)));
        f(sharedPreferences3, true);
        synchronized (com.tencent.mm.plugin.appbrand.appstorage.t.f76321a) {
            com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
            com.tencent.mm.plugin.appbrand.app.r9.mj();
            z19 = com.tencent.mm.plugin.appbrand.appstorage.t.f76323c == 3 ? true : z18;
        }
        if (z19) {
            d(sharedPreferences3);
            e(sharedPreferences3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.SharedPreferences r12) {
        /*
            r11 = this;
            com.tencent.mm.plugin.appbrand.appstorage.q r0 = com.tencent.mm.plugin.appbrand.appstorage.s.f76312e
            java.lang.String r1 = "keyHadCleanOldScheme"
            long r2 = r11.f76315c
            java.lang.String r4 = r11.f76313a
            java.lang.String r5 = r0.a(r1, r2, r4)
            com.tencent.mm.sdk.platformtools.o4 r6 = r11.f76316d
            r7 = 0
            boolean r8 = r6.getBoolean(r5, r7)
            r9 = 1
            if (r8 != 0) goto L2a
            boolean r8 = r12.getBoolean(r5, r7)
            if (r8 == 0) goto L25
            boolean r10 = r6.getBoolean(r5, r7)
            if (r10 != 0) goto L25
            r6.putBoolean(r5, r8)
        L25:
            if (r8 == 0) goto L28
            goto L2a
        L28:
            r5 = r7
            goto L2b
        L2a:
            r5 = r9
        L2b:
            java.lang.String r8 = "MicroMsg.AppBrandKVStorageTransfer"
            if (r5 == 0) goto L35
            java.lang.String r12 = "[transfer] had clear old scheme data, return"
            com.tencent.mars.xlog.Log.i(r8, r12)
            return
        L35:
            java.lang.String r5 = "[transfer] clear old scheme data"
            com.tencent.mars.xlog.Log.i(r8, r5)
            com.tencent.mm.plugin.appbrand.appstorage.o r5 = com.tencent.mm.plugin.appbrand.app.r9.Bi()
            r5.getClass()
        L41:
            int r8 = com.tencent.mm.plugin.appbrand.appstorage.a2.f76137a
            if (r7 > r8) goto L4b
            r5.k(r7, r4)
            int r7 = r7 + 1
            goto L41
        L4b:
            java.lang.String r0 = r0.a(r1, r2, r4)
            android.content.SharedPreferences$Editor r12 = r12.edit()
            android.content.SharedPreferences$Editor r12 = r12.putBoolean(r0, r9)
            r12.apply()
            r6.putBoolean(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appstorage.s.d(android.content.SharedPreferences):void");
    }

    public final void e(android.content.SharedPreferences sharedPreferences) {
        java.lang.String a17 = f76312e.a("keyHadFinishTransfer", this.f76315c, this.f76313a);
        sharedPreferences.edit().putBoolean(a17, true).apply();
        this.f76316d.putBoolean(a17, true);
    }

    public final void f(android.content.SharedPreferences sharedPreferences, boolean z17) {
        java.lang.String a17 = f76312e.a("hadTransferToMMKV", this.f76315c, this.f76313a);
        sharedPreferences.edit().putBoolean(a17, z17).apply();
        this.f76316d.putBoolean(a17, z17);
    }
}

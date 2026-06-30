package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class s extends c01.i8 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q f157845e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f157846a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0 f157847b;

    /* renamed from: c, reason: collision with root package name */
    public final long f157848c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f157849d;

    public s(java.lang.String appid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        this.f157846a = appid;
        this.f157847b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0.f157714h.a(new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(appid)).longValue());
        this.f157848c = new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(appid)).longValue();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("AppBrandKVStorageTransfer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSingleMMKV(...)");
        this.f157849d = R;
    }

    @Override // c01.i8
    public java.lang.String a() {
        return "MicroMsg.AppBrandKVStorageTransfer";
    }

    @Override // c01.i8
    public boolean b(int i17) {
        android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q qVar = f157845e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        boolean z17 = !qVar.b(d17, this.f157848c, this.f157846a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKVStorageTransfer", "needTransfer " + z17);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r rVar;
        boolean z27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t tVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t.f157854a;
        synchronized (tVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.wi().getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
            z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t.f157855b;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] isNeedTransfer = false");
            return;
        }
        android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        char c17 = 0;
        if (tVar.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKVStorageTransfer", "rollback phases, clear [had transfer to mmkv] flag");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
            f(d17, false);
            this.f157847b.a(this.f157846a);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q qVar = f157845e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        boolean c18 = qVar.c(d17, this.f157848c, this.f157846a);
        if (c18) {
            synchronized (tVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.wi().getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
                z27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t.f157856c == 3;
            }
            if (z27) {
                d(d17);
                e(d17);
                return;
            }
        }
        if (c18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] had transfer to mmkv, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKVStorageTransfer", "start transfer");
        long j17 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1016L, 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKVStorageTransfer", "clear MMKV");
        this.f157847b.a(this.f157846a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Bi();
        int[] f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.f(this.f157846a, Bi.f157819e, Bi.f157820f);
        int K = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Bi().K(this.f157846a);
        int length = f17.length;
        int i27 = 0;
        int i28 = 0;
        long j18 = 0;
        while (i27 < length) {
            int i29 = f17[i27];
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o Bi2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Bi();
            int[] iArr = f17;
            java.lang.String str = this.f157846a;
            java.lang.Object obj = Bi2.t(i29, str)[c17];
            java.util.ArrayList arrayList = obj instanceof java.util.ArrayList ? (java.util.ArrayList) obj : null;
            if (arrayList == null) {
                rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r(0L, 0L, 0);
            } else if (arrayList.size() == 0) {
                rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r(0L, 0L, 0);
            } else {
                i18 = length;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] key size = " + arrayList.size());
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
                    java.lang.Object[] o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Bi().o(i29, str, str2);
                    java.lang.String str3 = str;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "get(...)");
                    long currentTimeMillis3 = j19 + (java.lang.System.currentTimeMillis() - currentTimeMillis2);
                    int i37 = K;
                    java.lang.Object obj2 = o17[1];
                    java.lang.Object obj3 = o17[2];
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "") && o17[0] == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.NONE && (obj2 instanceof java.lang.String) && (obj3 instanceof java.lang.String)) {
                        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                        this.f157847b.l(i29, this.f157846a, str2, (java.lang.String) obj2, (java.lang.String) obj3);
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
                rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r(j19, j27, arrayList.size());
                j17 += rVar.f157842a;
                j18 += rVar.f157843b;
                i28 += rVar.f157844c;
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
            j17 += rVar.f157842a;
            j18 += rVar.f157843b;
            i28 += rVar.f157844c;
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
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1016L, 12L);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1016L, 11L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKVStorageTransfer", "finish transfer, cost total time= " + currentTimeMillis5 + " ms read time = " + j17 + " ms, write time = " + j18 + " ms");
        int K2 = this.f157847b.K(this.f157846a);
        int e17 = this.f157847b.e(this.f157846a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKVStorageTransfer", "newbytes =" + K2 + " oldbytes =" + i38 + "  newsize =" + e17 + "  oldsize =" + i28 + ' ');
        boolean z28 = K2 == i38;
        boolean z29 = e17 == i28;
        if (z28 && z29) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1016L, 1L);
        } else if (!z28 && !z29) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1016L, 4L);
        } else if (!z28) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1016L, 3L);
        } else if (!z29) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1016L, 2L);
        }
        if (e17 != i28) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("tansfer failed ");
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z18 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandKVStorageTransfer", illegalStateException, "transfer failed", new java.lang.Object[0]);
        } else {
            z18 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKVStorageTransfer", "finish transfer, prev ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16335, this.f157846a, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(K2), java.lang.Integer.valueOf(this.f157847b.e(this.f157846a)));
        f(sharedPreferences3, true);
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t.f157854a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.wi().getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
            z19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t.f157856c == 3 ? true : z18;
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
            com.tencent.mm.plugin.appbrand.appstorage.q r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.s.f157845e
            java.lang.String r1 = "keyHadCleanOldScheme"
            long r2 = r11.f157848c
            java.lang.String r4 = r11.f157846a
            java.lang.String r5 = r0.a(r1, r2, r4)
            com.tencent.mm.sdk.platformtools.o4 r6 = r11.f157849d
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r12)
            return
        L35:
            java.lang.String r5 = "[transfer] clear old scheme data"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r5)
            com.tencent.mm.plugin.appbrand.appstorage.o r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Bi()
            r5.getClass()
        L41:
            int r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.f157670a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.s.d(android.content.SharedPreferences):void");
    }

    public final void e(android.content.SharedPreferences sharedPreferences) {
        java.lang.String a17 = f157845e.a("keyHadFinishTransfer", this.f157848c, this.f157846a);
        sharedPreferences.edit().putBoolean(a17, true).apply();
        this.f157849d.putBoolean(a17, true);
    }

    public final void f(android.content.SharedPreferences sharedPreferences, boolean z17) {
        java.lang.String a17 = f157845e.a("hadTransferToMMKV", this.f157848c, this.f157846a);
        sharedPreferences.edit().putBoolean(a17, z17).apply();
        this.f157849d.putBoolean(a17, z17);
    }
}

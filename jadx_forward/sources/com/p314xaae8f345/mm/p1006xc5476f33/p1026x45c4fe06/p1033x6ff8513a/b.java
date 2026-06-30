package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class b extends c01.i8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f157673a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.f f157674b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0 f157675c;

    /* renamed from: d, reason: collision with root package name */
    public final long f157676d;

    public b(java.lang.String appid, java.lang.String encryptMMKVStorageSecretKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptMMKVStorageSecretKey, "encryptMMKVStorageSecretKey");
        this.f157673a = appid;
        this.f157674b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.f.f157695i.b(new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(appid)).longValue(), appid, encryptMMKVStorageSecretKey, null);
        this.f157675c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0.f157714h.a(new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(appid)).longValue());
        this.f157676d = new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(appid)).longValue();
    }

    @Override // c01.i8
    public java.lang.String a() {
        return "MicroMsg.AppBrandEncryptKVStorageTransfer";
    }

    @Override // c01.i8
    public boolean b(int i17) {
        android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        java.lang.String appId = this.f157673a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("keyHadFinishTransfer");
        sb6.append('#');
        long j17 = this.f157676d;
        sb6.append(j17);
        sb6.append('#');
        sb6.append(appId);
        boolean z17 = false;
        if (d17.getBoolean(sb6.toString(), false)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("keyHadFinishTransferToEncryptMMKV#" + j17 + '#' + appId, false)) {
                z17 = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "needTransfer " + z17);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a aVar;
        boolean z27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.c.f157682a;
        synchronized (cVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.wi().getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
            z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.c.f157683b;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] isNeedTransfer = false");
            return;
        }
        synchronized (cVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.wi().getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
            c17 = 0;
            z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.c.f157684c == 2;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "rollback phases, clear [had transfer to encrypt mmkv] flag");
            long j17 = this.f157676d;
            java.lang.String appId = this.f157673a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("hadTransferToEncryptMMKV#" + j17 + '#' + appId, false);
            this.f157674b.a(this.f157673a);
            return;
        }
        long j18 = this.f157676d;
        java.lang.String appId2 = this.f157673a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId2, "appId");
        boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("hadTransferToEncryptMMKV#" + j18 + '#' + appId2, false);
        if (z28) {
            synchronized (cVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.wi().getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
                z27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.c.f157684c == 3;
            }
            if (z27) {
                d();
                long j19 = this.f157676d;
                java.lang.String appId3 = this.f157673a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId3, "appId");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("keyHadFinishTransferToEncryptMMKV#" + j19 + '#' + appId3, true);
                return;
            }
        }
        if (z28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] had transfer to encrypt mmkv, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "start transfer");
        long j27 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1817L, 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "clear MMKV");
        this.f157674b.a(this.f157673a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0 g0Var = this.f157675c;
        java.lang.String appId4 = this.f157673a;
        g0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId4, "appId");
        int[] f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.f(appId4, g0Var.f157718f, g0Var.f157719g);
        int K = this.f157675c.K(this.f157673a);
        int length = f17.length;
        int i27 = 0;
        int i28 = 0;
        long j28 = 0;
        while (i28 < length) {
            int i29 = f17[i28];
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0 g0Var2 = this.f157675c;
            java.lang.String str = this.f157673a;
            int[] iArr = f17;
            java.lang.Object obj = g0Var2.t(i29, str)[c17];
            java.util.ArrayList arrayList = obj instanceof java.util.ArrayList ? (java.util.ArrayList) obj : null;
            if (arrayList == null) {
                aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a(0L, 0L, 0);
            } else if (arrayList.size() == 0) {
                aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a(0L, 0L, 0);
            } else {
                i18 = length;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] key size = " + arrayList.size());
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
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0 g0Var3 = g0Var2;
                    java.lang.Object obj2 = o17[1];
                    java.lang.String str3 = str;
                    java.lang.Object obj3 = o17[2];
                    int i37 = K;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "") && o17[0] == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.NONE && (obj2 instanceof java.lang.String) && (obj3 instanceof java.lang.String)) {
                        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                        this.f157674b.l(i29, this.f157673a, str2, (java.lang.String) obj2, (java.lang.String) obj3);
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
                aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a(j29, j37, arrayList.size());
                j27 += aVar.f157666a;
                j28 += aVar.f157667b;
                i27 += aVar.f157668c;
                i28++;
                f17 = iArr;
                length = i18;
                K = i19;
                c17 = 0;
            }
            i19 = K;
            i18 = length;
            c18 = 2;
            j27 += aVar.f157666a;
            j28 += aVar.f157667b;
            i27 += aVar.f157668c;
            i28++;
            f17 = iArr;
            length = i18;
            K = i19;
            c17 = 0;
        }
        int i38 = K;
        long currentTimeMillis5 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        if (5000 < currentTimeMillis5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1817L, 10L);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1817L, 9L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "finish transfer, cost total time= " + currentTimeMillis5 + " ms read time = " + j27 + " ms, write time = " + j28 + " ms");
        int K2 = this.f157674b.K(this.f157673a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.f fVar = this.f157674b;
        java.lang.String appId5 = this.f157673a;
        fVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId5, "appId");
        int e17 = fVar.f157701g.e(appId5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "newbytes =" + K2 + " oldbytes =" + i38 + "  newsize =" + e17 + "  oldsize =" + i27 + ' ');
        boolean z29 = K2 == i38;
        boolean z37 = e17 == i27;
        if (z29 && z37) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1817L, 1L);
        } else if (!z29 && !z37) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1817L, 4L);
        } else if (!z29) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1817L, 3L);
        } else if (!z37) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1817L, 2L);
        }
        if (e17 != i27) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("tansfer failed ");
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z19 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandEncryptKVStorageTransfer", illegalStateException, "transfer failed", new java.lang.Object[0]);
        } else {
            z19 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "finish transfer, prev ");
        java.lang.String appId6 = this.f157673a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId6, "appId");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hadTransferToEncryptMMKV#");
        long j38 = this.f157676d;
        sb6.append(j38);
        sb6.append('#');
        sb6.append(appId6);
        L.putBoolean(sb6.toString(), true);
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.c.f157682a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.wi().getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.c.f157684c == 3) {
                z19 = true;
            }
        }
        if (z19) {
            d();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("keyHadFinishTransferToEncryptMMKV#" + j38 + '#' + appId6, true);
        }
    }

    public final void d() {
        java.lang.String appId = this.f157673a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("keyHadCleanNoEncryptMMKVData#");
        long j17 = this.f157676d;
        sb6.append(j17);
        sb6.append('#');
        sb6.append(appId);
        if (L.getBoolean(sb6.toString(), false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] had clear old scheme data, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] clear old scheme data");
        this.f157675c.a(appId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("keyHadCleanNoEncryptMMKVData#" + j17 + '#' + appId, true);
    }
}

package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class AccInfo extends com.tencent.mm.network.q implements com.tencent.mm.network.o, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.network.AccInfo> CREATOR = new com.tencent.mm.network.a();
    public java.util.List A;
    public java.util.Map B;
    public java.util.Map C;
    public com.tencent.mm.network.i D;
    public java.lang.String E;
    public boolean F;
    public boolean G;
    public java.util.Map H;
    public boolean I;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f71895e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f71896f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f71897g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f71898h;

    /* renamed from: i, reason: collision with root package name */
    public long f71899i;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f71900m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f71901n;

    /* renamed from: o, reason: collision with root package name */
    public int f71902o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.network.f f71903p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f71904q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f71905r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f71906s;

    /* renamed from: t, reason: collision with root package name */
    public byte[] f71907t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f71908u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.Map f71909v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.Map f71910w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.Map f71911x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.Map f71912y;

    /* renamed from: z, reason: collision with root package name */
    public int f71913z;

    public AccInfo(android.os.Parcel parcel) {
        this.f71903p = null;
        this.f71905r = false;
        this.f71909v = new java.util.concurrent.ConcurrentHashMap();
        this.f71910w = new java.util.concurrent.ConcurrentHashMap();
        this.f71911x = new java.util.concurrent.ConcurrentHashMap();
        this.f71912y = new java.util.concurrent.ConcurrentHashMap();
        this.f71913z = -1;
        this.A = new java.util.ArrayList();
        this.B = new java.util.concurrent.ConcurrentHashMap();
        this.C = new java.util.concurrent.ConcurrentHashMap();
        this.D = new com.tencent.mm.network.i();
        this.F = false;
        this.G = false;
        this.H = new java.util.concurrent.ConcurrentHashMap();
        this.I = false;
        this.f71895e = parcel.readString();
        this.f71896f = parcel.createByteArray();
        this.f71897g = parcel.createByteArray();
        this.f71898h = parcel.createByteArray();
        this.f71900m = parcel.createByteArray();
        this.f71901n = parcel.createByteArray();
        this.f71902o = parcel.readInt();
        this.f71904q = parcel.createByteArray();
        this.f71905r = parcel.readByte() != 0;
        this.I = parcel.readByte() != 0;
        this.f71906s = parcel.readString();
        this.f71907t = parcel.createByteArray();
        this.f71908u = parcel.createByteArray();
        int readInt = parcel.readInt();
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f71909v.put(parcel.readString(), parcel.createByteArray());
        }
        try {
            int readInt2 = parcel.readInt();
            for (int i18 = 0; i18 < readInt2; i18++) {
                this.f71910w.put(java.lang.Integer.valueOf(parcel.readInt()), (r45.kx3) new r45.kx3().parseFrom(parcel.createByteArray()));
            }
            int readInt3 = parcel.readInt();
            for (int i19 = 0; i19 < readInt3; i19++) {
                this.f71911x.put((r45.hx3) new r45.hx3().parseFrom(parcel.createByteArray()), (com.tencent.mm.network.AxAuthData) parcel.readParcelable(com.tencent.mm.network.AxAuthData.class.getClassLoader()));
            }
            this.A = parcel.createStringArrayList();
            int readInt4 = parcel.readInt();
            for (int i27 = 0; i27 < readInt4; i27++) {
                this.B.put(parcel.readString(), java.lang.Integer.valueOf(parcel.readInt()));
            }
            int readInt5 = parcel.readInt();
            for (int i28 = 0; i28 < readInt5; i28++) {
                this.C.put(parcel.readString(), java.lang.Integer.valueOf(parcel.readInt()));
            }
            int readInt6 = parcel.readInt();
            for (int i29 = 0; i29 < readInt6; i29++) {
                this.H.put(parcel.readString(), java.lang.Integer.valueOf(parcel.readInt()));
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AccInfo", e17, "", new java.lang.Object[0]);
        }
        this.F = parcel.readByte() != 0;
        this.G = parcel.readByte() != 0;
        this.D.f72023b = parcel.readString();
        this.D.f72022a = parcel.readString();
        this.E = parcel.readString();
        this.f71899i = parcel.readLong();
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public void E(byte[] bArr, byte[] bArr2, byte[] bArr3, int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "summerauth update session info: session single[%s] cli[%s], svr[%s] uin:%d -> %d timestamp:%s stack:[%s]", com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(bArr)), com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(bArr2)), com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(bArr3)), java.lang.Integer.valueOf(this.f71902o), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), new com.tencent.mm.sdk.platformtools.z3());
        if (bArr == null || bArr2 == null || bArr3 == null || bArr.length == 0 || bArr2.length == 0 || bArr3.length == 0) {
            this.I = false;
        }
        this.f71899i = j17;
        this.f71896f = bArr;
        this.f71897g = bArr2;
        this.f71898h = bArr3;
        this.f71902o = i17;
        this.f71912y.clear();
        com.tencent.mm.network.f fVar = this.f71903p;
        if (fVar != null) {
            isLogin();
            fVar.getClass();
        }
    }

    public boolean F0(java.lang.String str) {
        boolean isEmpty;
        if ("axhost".equals(str)) {
            return this.f71910w.isEmpty();
        }
        synchronized (this.A) {
            isEmpty = this.A.isEmpty();
        }
        return isEmpty;
    }

    public void G0(java.lang.String str, java.lang.String str2) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "saveBackUpCgiSignKeys " + str.length() + " " + str2.length());
            com.tencent.mm.network.i iVar = this.D;
            iVar.f72023b = str;
            iVar.f72022a = str2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AccInfo", e17.getLocalizedMessage());
        }
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public void I0(boolean z17) {
        this.f71905r = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "somr accinfo setForeground :%b", java.lang.Boolean.valueOf(z17));
    }

    public java.lang.String[] K() {
        java.lang.String[] strArr = new java.lang.String[2];
        com.tencent.mm.network.i iVar = this.D;
        if (iVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AccInfo", "no find cgi sign keys");
            return strArr;
        }
        strArr[0] = iVar.f72023b;
        strArr[1] = iVar.f72022a;
        return strArr;
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public byte[] L0(java.lang.String str) {
        r45.uc ucVar;
        r45.cu5 cu5Var;
        if (str != null && str.length() != 0) {
            java.util.Iterator it = this.f71911x.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ucVar = null;
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (str.equals(((r45.hx3) entry.getKey()).f376536e)) {
                    ucVar = ((com.tencent.mm.network.AxAuthData) entry.getValue()).f71922d;
                    break;
                }
            }
            if (ucVar != null && (cu5Var = ucVar.f387206e) != null && cu5Var.f371839d > 0) {
                try {
                    return cu5Var.f371841f.f192156a;
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
        }
        return null;
    }

    public void M() {
        if (!j62.e.g().l("clicfg_reuse_session", true, true, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "clicfg_reuse_session false");
        } else {
            if (!isLogin()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AccInfo", "ready to backup, but not login");
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.network.AccInfo$$c
                @Override // java.lang.Runnable
                public final void run() {
                    android.os.Parcelable.Creator<com.tencent.mm.network.AccInfo> creator = com.tencent.mm.network.AccInfo.CREATOR;
                    com.tencent.mm.network.AccInfo accInfo = com.tencent.mm.network.AccInfo.this;
                    accInfo.E = accInfo.t0();
                    try {
                        com.tencent.mm.network.x2.c().f72001v.Z8(accInfo);
                    } catch (android.os.RemoteException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AccInfo", e17, "", new java.lang.Object[0]);
                    } catch (java.lang.NullPointerException e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AccInfo", e18, "", new java.lang.Object[0]);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "backup accInfo hash:%s", accInfo.E);
                }
            }, "MicroMsg.AccInfo");
        }
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public int O(java.lang.String str) {
        if (this.B.containsKey(str)) {
            return ((java.lang.Integer) this.B.get(str)).intValue();
        }
        return 0;
    }

    public void R1(int i17, byte[] bArr, byte[] bArr2, long j17) {
        java.lang.Integer num;
        java.util.LinkedList linkedList;
        byte[] bArr3;
        byte[] bArr4;
        long j18 = this.f71899i;
        if (j17 != j18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AccInfo", "timestamp mismatch, need:%s, income:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return;
        }
        r45.kx3 kx3Var = (r45.kx3) this.f71910w.get(java.lang.Integer.valueOf(i17));
        if (kx3Var != null) {
            java.util.LinkedList linkedList2 = kx3Var.f379024e;
            if (linkedList2.size() != 0) {
                r45.uc ucVar = new r45.uc();
                try {
                    ucVar.parseFrom(bArr);
                    com.tencent.mm.network.AxAuthData axAuthData = new com.tencent.mm.network.AxAuthData();
                    axAuthData.f71922d = ucVar;
                    axAuthData.f71923e = bArr2;
                    r45.cu5 cu5Var = ucVar.f387205d;
                    java.lang.String G1 = (cu5Var == null || cu5Var.f371839d <= 0 || (bArr4 = cu5Var.f371841f.f192156a) == null) ? "" : com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(bArr4));
                    r45.cu5 cu5Var2 = ucVar.f387206e;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "setAxAuthSessionKey bussType[%s] ClientSessionKey[%s], ServerSessionKey:[%s], cookies[%s] timestamp[%s]", java.lang.Integer.valueOf(i17), G1, (cu5Var2 == null || cu5Var2.f371839d <= 0 || (bArr3 = cu5Var2.f371841f.f192156a) == null) ? "" : com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(bArr3)), com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(bArr2)), java.lang.Long.valueOf(j17));
                    java.util.Iterator it = linkedList2.iterator();
                    while (it.hasNext()) {
                        r45.hx3 hx3Var = (r45.hx3) it.next();
                        java.util.Iterator it6 = this.f71911x.entrySet().iterator();
                        while (it6.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
                            if (((r45.hx3) entry.getKey()).f376535d != null && ((r45.hx3) entry.getKey()).f376536e != null && ((r45.hx3) entry.getKey()).f376535d.equals(hx3Var.f376535d) && ((r45.hx3) entry.getKey()).f376536e.equals(hx3Var.f376536e)) {
                                it6.remove();
                            }
                        }
                        this.f71911x.put(hx3Var, axAuthData);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "receive axauth host " + hx3Var.f376536e);
                    }
                    r45.jx3 jx3Var = ucVar.f387207f;
                    if (jx3Var != null && jx3Var.f378197d > 0 && (linkedList = jx3Var.f378198e) != null && linkedList.size() > 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "sm4gcm hostalgo size %d", java.lang.Integer.valueOf(ucVar.f387207f.f378197d));
                        this.C.clear();
                        java.util.Iterator it7 = ucVar.f387207f.f378198e.iterator();
                        while (it7.hasNext()) {
                            r45.ix3 ix3Var = (r45.ix3) it7.next();
                            this.C.put(ix3Var.f377389d, java.lang.Integer.valueOf(ix3Var.f377390e));
                            jx3.f.INSTANCE.d(26782, java.lang.Integer.valueOf(ix3Var.f377390e), ix3Var.f377389d, 1, 0, "");
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "mmpack updateAxSessionKey process:%s", bm5.f1.a());
                    ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).updateAxSessionKey(i17, ucVar.f387205d.f371841f.f192156a, ucVar.f387206e.f371841f.f192156a, bArr2);
                    ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).updateAxHostAlgo(i17, ucVar.f387207f.getData());
                    if (i17 == 2) {
                        r45.cu5 cu5Var3 = ucVar.f387208g;
                        this.G = false;
                        this.F = false;
                        this.H.clear();
                        boolean l17 = j62.e.g().l("clicfg_pay_mmtls_switch_android", false, true, true);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "paymmtls: AccInfo clicfg_pay_mmtls_switch_android: %b", java.lang.Boolean.valueOf(l17));
                        if (l17) {
                            if (cu5Var3 == null || cu5Var3.f371839d <= 0) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.AccInfo", "paymmtls: PayLoginBusinessData is empty");
                                return;
                            }
                            r45.s65 s65Var = new r45.s65();
                            try {
                                byte[] bArr5 = cu5Var3.f371841f.f192156a;
                                int length = bArr5.length;
                                s65Var.parseFrom(bArr5);
                                this.G = true;
                                this.F = !s65Var.f385530d;
                                java.util.LinkedList linkedList3 = s65Var.f385531e;
                                java.util.Iterator it8 = linkedList3.iterator();
                                while (it8.hasNext()) {
                                    r45.jf0 jf0Var = (r45.jf0) it8.next();
                                    if (!this.H.containsKey(jf0Var.f377778d) || (num = (java.lang.Integer) this.H.get(jf0Var.f377778d)) == null || num.equals(java.lang.Integer.valueOf(jf0Var.f377779e))) {
                                        this.H.put(jf0Var.f377778d, java.lang.Integer.valueOf(jf0Var.f377779e));
                                        com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "paymmtls: put payMMTlsHostMap key:%s, value:%d", jf0Var.f377778d, java.lang.Integer.valueOf(jf0Var.f377779e));
                                    } else {
                                        this.H.put(jf0Var.f377778d, 1);
                                        com.tencent.mars.xlog.Log.w("MicroMsg.AccInfo", "paymmtls: repeated pay domain detected: %s, new mmtls_type:%d, fallback to MM_MMTLS1", jf0Var.f377778d, java.lang.Integer.valueOf(jf0Var.f377779e));
                                    }
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "paymmtls: PayLoginBusinessData parsed, usePayMMTls: %b, domain_strategies size: %d payMMTlsHostMap size: %d", java.lang.Boolean.valueOf(this.F), java.lang.Integer.valueOf(linkedList3.size()), java.lang.Integer.valueOf(this.H.size()));
                                return;
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.AccInfo", "paymmtls: PayLoginBusinessData parseBuf exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (java.lang.Exception e18) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AccInfo", "can not get host list , buss type " + i17);
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public int U0(java.lang.String str) {
        if (this.C.containsKey(str)) {
            return ((java.lang.Integer) this.C.get(str)).intValue();
        }
        return 0;
    }

    public void U1(byte[] bArr) {
        java.lang.String l17 = bArr == null ? "" : com.tencent.mm.sdk.platformtools.t8.l(bArr);
        this.f71900m = bArr;
        com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "oreh setCookie %s", l17);
    }

    public void Y0(int i17, boolean z17, long j17) {
        long j18 = this.f71899i;
        if (j17 != j18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AccInfo", "setAxAuthRequesting timestamp mismatch, need:%s, income:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "setAxAuthRequesting, bussType:%s, requesting:%s, axAuthRequestingCount:%s, timestamp:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f71913z), java.lang.Long.valueOf(j17));
        if (z17) {
            ((java.util.concurrent.ConcurrentHashMap) this.f71912y).put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
            com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "after %s will reset axAuthRequesting %s", 900000L, java.lang.Integer.valueOf(i17));
            ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.network.AccInfo$$d(this, i17, 0, 5, 180000L, j17), 180000L, "MicroMsg.AccInfo");
            return;
        }
        synchronized (this) {
            if (((java.util.concurrent.ConcurrentHashMap) this.f71912y).containsKey(java.lang.Integer.valueOf(i17))) {
                this.f71913z--;
                ((java.util.concurrent.ConcurrentHashMap) this.f71912y).remove(java.lang.Integer.valueOf(i17));
                if (this.f71913z == 0) {
                    M();
                }
            }
        }
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public void a(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f71902o);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "summerauth setuin [%d -> %d], stack[%s]", valueOf, valueOf2, new com.tencent.mm.sdk.platformtools.z3());
        this.f71902o = i17;
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public byte[] c1(java.lang.String str) {
        r45.uc ucVar;
        r45.cu5 cu5Var;
        if (str != null && str.length() != 0) {
            java.util.Iterator it = this.f71911x.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ucVar = null;
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (str.equals(((r45.hx3) entry.getKey()).f376536e)) {
                    ucVar = ((com.tencent.mm.network.AxAuthData) entry.getValue()).f71922d;
                    break;
                }
            }
            if (ucVar != null && (cu5Var = ucVar.f387205d) != null && cu5Var.f371839d > 0) {
                try {
                    return cu5Var.f371841f.f192156a;
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
        }
        return null;
    }

    public void d(int i17, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "addAxAuthHostList");
        r45.kx3 kx3Var = new r45.kx3();
        try {
            kx3Var.parseFrom(bArr);
            this.f71910w.put(java.lang.Integer.valueOf(i17), kx3Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "add host " + i17 + " host " + ((r45.hx3) kx3Var.f379024e.get(0)).f376535d);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.AccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(java.lang.String str, int i17) {
        this.B.put(str, java.lang.Integer.valueOf(i17));
        jx3.f.INSTANCE.d(26782, java.lang.Integer.valueOf(i17), str, 2, 0, "");
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public byte[] f0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        for (java.util.Map.Entry entry : this.f71911x.entrySet()) {
            if (str.equals(((r45.hx3) entry.getKey()).f376536e)) {
                return ((com.tencent.mm.network.AxAuthData) entry.getValue()).f71923e;
            }
        }
        return null;
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public int getUin() {
        return this.f71902o;
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public java.lang.String getUsername() {
        return this.f71895e;
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public void i0() {
        this.f71911x.clear();
        this.C.clear();
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public boolean isForeground() {
        return this.f71905r;
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public boolean isLogin() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        return this.I && (bArr = this.f71896f) != null && (bArr2 = this.f71897g) != null && (bArr3 = this.f71898h) != null && bArr.length > 0 && bArr2.length > 0 && bArr3.length > 0;
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public void l1(java.lang.String str, byte[] bArr) {
        this.f71909v.put(str, bArr);
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public byte[] o() {
        return this.f71900m;
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public java.lang.String q() {
        return this.f71906s;
    }

    @Override // com.tencent.mm.network.r
    public byte[] qh() {
        return this.f71908u;
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public byte[] r(int i17) {
        if (i17 == 1) {
            return this.f71896f;
        }
        if (i17 == 2) {
            return this.f71897g;
        }
        if (i17 != 3) {
            return null;
        }
        return this.f71898h;
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public void reset() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "reset accinfo");
        this.f71895e = "";
        this.f71896f = null;
        this.f71900m = com.tencent.mm.sdk.platformtools.t8.h(c01.h9.a().getString("server_id", ""));
        java.lang.String string = c01.h9.a().getString("server_index_buffer", "");
        this.f71901n = com.tencent.mm.sdk.platformtools.t8.K0(string) ? null : com.tencent.mm.sdk.platformtools.t8.h(string);
        this.f71902o = 0;
        this.I = false;
        this.f71897g = null;
        this.f71898h = null;
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public byte[] s() {
        return this.f71904q;
    }

    @Override // com.tencent.mm.network.r
    public void setUsername(java.lang.String str) {
        this.f71895e = str;
    }

    public java.lang.String t0() {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f71895e);
            sb6.append(com.tencent.mm.sdk.platformtools.t8.j(this.f71896f));
            sb6.append(com.tencent.mm.sdk.platformtools.t8.j(this.f71897g));
            sb6.append(com.tencent.mm.sdk.platformtools.t8.j(this.f71898h));
            sb6.append(com.tencent.mm.sdk.platformtools.t8.j(this.f71900m));
            sb6.append(this.f71902o);
            sb6.append(com.tencent.mm.sdk.platformtools.t8.j(this.f71904q));
            sb6.append(this.f71905r);
            sb6.append(this.I);
            sb6.append(this.f71906s);
            sb6.append(this.D.f72022a);
            sb6.append(this.D.f72023b);
            sb6.append(com.tencent.mm.sdk.platformtools.t8.j(this.f71907t));
            sb6.append(com.tencent.mm.sdk.platformtools.t8.j(this.f71908u));
            java.util.LinkedList<java.util.Map.Entry> linkedList = new java.util.LinkedList(this.f71909v.entrySet());
            java.util.Collections.sort(linkedList, new com.tencent.mm.network.b(this));
            for (java.util.Map.Entry entry : linkedList) {
                sb6.append((java.lang.String) entry.getKey());
                sb6.append(com.tencent.mm.sdk.platformtools.t8.j((byte[]) entry.getValue()));
            }
            java.util.LinkedList<java.util.Map.Entry> linkedList2 = new java.util.LinkedList(this.f71910w.entrySet());
            java.util.Collections.sort(linkedList2, new com.tencent.mm.network.c(this));
            for (java.util.Map.Entry entry2 : linkedList2) {
                sb6.append(((java.lang.Integer) entry2.getKey()).intValue());
                sb6.append(com.tencent.mm.sdk.platformtools.t8.j(((r45.kx3) entry2.getValue()).toByteArray()));
            }
            java.util.LinkedList<java.util.Map.Entry> linkedList3 = new java.util.LinkedList(this.f71911x.entrySet());
            java.util.Collections.sort(linkedList3, new com.tencent.mm.network.AccInfo$$b());
            for (java.util.Map.Entry entry3 : linkedList3) {
                sb6.append(com.tencent.mm.sdk.platformtools.t8.j(((r45.hx3) entry3.getKey()).toByteArray()));
                sb6.append(com.tencent.mm.sdk.platformtools.t8.j(((com.tencent.mm.network.AxAuthData) entry3.getValue()).f71922d.toByteArray()));
                sb6.append(com.tencent.mm.sdk.platformtools.t8.j(((com.tencent.mm.network.AxAuthData) entry3.getValue()).f71923e));
            }
            java.util.Iterator it = this.A.iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
            }
            java.util.LinkedList<java.util.Map.Entry> linkedList4 = new java.util.LinkedList(this.B.entrySet());
            java.util.Collections.sort(linkedList4, new com.tencent.mm.network.d(this));
            for (java.util.Map.Entry entry4 : linkedList4) {
                sb6.append((java.lang.String) entry4.getKey());
                sb6.append(((java.lang.Integer) entry4.getValue()).intValue());
            }
            java.util.LinkedList<java.util.Map.Entry> linkedList5 = new java.util.LinkedList(this.C.entrySet());
            java.util.Collections.sort(linkedList4, new com.tencent.mm.network.e(this));
            for (java.util.Map.Entry entry5 : linkedList5) {
                sb6.append((java.lang.String) entry5.getKey());
                sb6.append(((java.lang.Integer) entry5.getValue()).intValue());
            }
            return com.tencent.mm.sdk.platformtools.t8.j(messageDigest.digest(sb6.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AccInfo", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    public java.lang.String toString() {
        return ((((((((("AccInfo:\n|-uin     =" + this.f71902o + "\n") + "|-user    =" + this.f71895e + "\n") + "|-wxuser  =" + this.f71906s + "\n") + "|-jwtdata =" + com.tencent.mm.sdk.platformtools.t8.j(this.f71907t) + "\n") + "|-ilinkbuf =" + com.tencent.mm.sdk.platformtools.t8.j(this.f71908u) + "\n") + "|-singlesession =" + com.tencent.mm.sdk.platformtools.t8.j(r(1)) + "\n") + "|-clientsession =" + com.tencent.mm.sdk.platformtools.t8.j(r(2)) + "\n") + "|-serversession =" + com.tencent.mm.sdk.platformtools.t8.j(r(3)) + "\n") + "|-ecdhkey =" + com.tencent.mm.sdk.platformtools.t8.j(this.f71904q) + "\n") + "`-cookie  =" + com.tencent.mm.sdk.platformtools.t8.j(this.f71900m);
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public byte[] v(java.lang.String str) {
        return (byte[]) this.f71909v.get(str);
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public void v0(com.tencent.mm.network.AccInfo accInfo) {
        if (accInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "recoveryAccInfo ignore. empty accinfo.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "recoveryAccInfo CgiKeyLength:[%d,%d]", java.lang.Integer.valueOf(accInfo.D.f72022a.length()), java.lang.Integer.valueOf(accInfo.D.f72023b.length()));
        this.f71895e = accInfo.f71895e;
        this.f71896f = accInfo.f71896f;
        this.f71897g = accInfo.f71897g;
        this.f71898h = accInfo.f71898h;
        this.f71900m = accInfo.f71900m;
        this.f71902o = accInfo.f71902o;
        this.f71904q = accInfo.f71904q;
        this.f71905r = accInfo.f71905r;
        this.I = accInfo.I;
        this.f71906s = accInfo.f71906s;
        this.f71909v = accInfo.f71909v;
        this.f71910w = accInfo.f71910w;
        this.f71911x = accInfo.f71911x;
        this.A = accInfo.A;
        this.B = accInfo.B;
        this.C = accInfo.C;
        this.D = accInfo.D;
        this.f71901n = accInfo.f71901n;
        this.F = accInfo.F;
        this.G = accInfo.G;
        this.H = accInfo.H;
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.network.AccInfo$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.os.Parcelable.Creator<com.tencent.mm.network.AccInfo> creator = com.tencent.mm.network.AccInfo.CREATOR;
                com.tencent.mm.network.AccInfo accInfo2 = com.tencent.mm.network.AccInfo.this;
                com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "recovery, calHash:%s, hash:%s", accInfo2.t0(), accInfo2.E);
                com.tencent.mm.network.x2.c().k();
            }
        }, "MicroMsg.AccInfo");
    }

    public void w0() {
        this.I = false;
        if (this.f71897g == null && this.f71898h == null && this.f71911x.isEmpty()) {
            return;
        }
        this.f71897g = null;
        this.f71898h = null;
        this.f71911x.clear();
        this.B.clear();
        this.C.clear();
        this.f71912y.clear();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f71895e);
        parcel.writeByteArray(this.f71896f);
        parcel.writeByteArray(this.f71897g);
        parcel.writeByteArray(this.f71898h);
        parcel.writeByteArray(this.f71900m);
        parcel.writeByteArray(this.f71901n);
        parcel.writeInt(this.f71902o);
        parcel.writeByteArray(this.f71904q);
        parcel.writeByte(this.f71905r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.I ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f71906s);
        parcel.writeByteArray(this.f71907t);
        parcel.writeByteArray(this.f71908u);
        parcel.writeInt(this.f71909v.size());
        for (java.util.Map.Entry entry : this.f71909v.entrySet()) {
            parcel.writeString((java.lang.String) entry.getKey());
            parcel.writeByteArray((byte[]) entry.getValue());
        }
        try {
            parcel.writeInt(this.f71910w.size());
            for (java.util.Map.Entry entry2 : this.f71910w.entrySet()) {
                parcel.writeInt(((java.lang.Integer) entry2.getKey()).intValue());
                parcel.writeByteArray(((r45.kx3) entry2.getValue()).toByteArray());
            }
            parcel.writeInt(this.f71911x.size());
            for (java.util.Map.Entry entry3 : this.f71911x.entrySet()) {
                parcel.writeByteArray(((r45.hx3) entry3.getKey()).toByteArray());
                parcel.writeParcelable((android.os.Parcelable) entry3.getValue(), i17);
            }
            parcel.writeStringList(this.A);
            parcel.writeInt(this.B.size());
            for (java.util.Map.Entry entry4 : this.B.entrySet()) {
                parcel.writeString((java.lang.String) entry4.getKey());
                parcel.writeInt(((java.lang.Integer) entry4.getValue()).intValue());
            }
            parcel.writeInt(this.C.size());
            for (java.util.Map.Entry entry5 : this.C.entrySet()) {
                parcel.writeString((java.lang.String) entry5.getKey());
                parcel.writeInt(((java.lang.Integer) entry5.getValue()).intValue());
            }
            parcel.writeInt(this.H.size());
            for (java.util.Map.Entry entry6 : this.H.entrySet()) {
                parcel.writeString((java.lang.String) entry6.getKey());
                parcel.writeInt(((java.lang.Integer) entry6.getValue()).intValue());
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AccInfo", e17, "", new java.lang.Object[0]);
        }
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
        parcel.writeString(this.D.f72023b);
        parcel.writeString(this.D.f72022a);
        parcel.writeString(this.E);
        parcel.writeLong(this.f71899i);
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public boolean x(java.lang.String str) {
        java.util.LinkedList linkedList;
        if (str != null && str.length() != 0) {
            java.util.Iterator it = this.f71910w.entrySet().iterator();
            while (it.hasNext()) {
                r45.kx3 kx3Var = (r45.kx3) ((java.util.Map.Entry) it.next()).getValue();
                if (kx3Var != null && (linkedList = kx3Var.f379024e) != null) {
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        r45.hx3 hx3Var = (r45.hx3) it6.next();
                        if (hx3Var != null && str.equals(hx3Var.f376536e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.network.r
    public byte[] xb() {
        return this.f71907t;
    }

    @Override // com.tencent.mm.network.r, com.tencent.mm.network.o
    public byte[] y0() {
        return this.f71901n;
    }

    public AccInfo(com.tencent.mm.network.f fVar) {
        this.f71903p = null;
        this.f71905r = false;
        this.f71909v = new java.util.concurrent.ConcurrentHashMap();
        this.f71910w = new java.util.concurrent.ConcurrentHashMap();
        this.f71911x = new java.util.concurrent.ConcurrentHashMap();
        this.f71912y = new java.util.concurrent.ConcurrentHashMap();
        this.f71913z = -1;
        this.A = new java.util.ArrayList();
        this.B = new java.util.concurrent.ConcurrentHashMap();
        this.C = new java.util.concurrent.ConcurrentHashMap();
        this.D = new com.tencent.mm.network.i();
        this.F = false;
        this.G = false;
        this.H = new java.util.concurrent.ConcurrentHashMap();
        this.I = false;
        this.f71903p = fVar;
        this.f71900m = com.tencent.mm.sdk.platformtools.t8.h(c01.h9.a().getString("server_id", ""));
        java.lang.String string = c01.h9.a().getString("server_index_buffer", "");
        this.f71901n = com.tencent.mm.sdk.platformtools.t8.K0(string) ? null : com.tencent.mm.sdk.platformtools.t8.h(string);
    }
}

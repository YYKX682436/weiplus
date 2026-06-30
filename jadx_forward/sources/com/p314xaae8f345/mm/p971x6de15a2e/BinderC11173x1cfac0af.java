package com.p314xaae8f345.mm.p971x6de15a2e;

/* renamed from: com.tencent.mm.network.AccInfo */
/* loaded from: classes12.dex */
public class BinderC11173x1cfac0af extends com.p314xaae8f345.mm.p971x6de15a2e.q implements com.p314xaae8f345.mm.p971x6de15a2e.o, android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af> f32586x681a0c0c = new com.p314xaae8f345.mm.p971x6de15a2e.a();
    public java.util.List A;
    public java.util.Map B;
    public java.util.Map C;
    public com.p314xaae8f345.mm.p971x6de15a2e.i D;
    public java.lang.String E;
    public boolean F;
    public boolean G;
    public java.util.Map H;
    public boolean I;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f153428e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f153429f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f153430g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f153431h;

    /* renamed from: i, reason: collision with root package name */
    public long f153432i;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f153433m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f153434n;

    /* renamed from: o, reason: collision with root package name */
    public int f153435o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.f f153436p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f153437q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f153438r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f153439s;

    /* renamed from: t, reason: collision with root package name */
    public byte[] f153440t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f153441u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.Map f153442v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.Map f153443w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.Map f153444x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.Map f153445y;

    /* renamed from: z, reason: collision with root package name */
    public int f153446z;

    public BinderC11173x1cfac0af(android.os.Parcel parcel) {
        this.f153436p = null;
        this.f153438r = false;
        this.f153442v = new java.util.concurrent.ConcurrentHashMap();
        this.f153443w = new java.util.concurrent.ConcurrentHashMap();
        this.f153444x = new java.util.concurrent.ConcurrentHashMap();
        this.f153445y = new java.util.concurrent.ConcurrentHashMap();
        this.f153446z = -1;
        this.A = new java.util.ArrayList();
        this.B = new java.util.concurrent.ConcurrentHashMap();
        this.C = new java.util.concurrent.ConcurrentHashMap();
        this.D = new com.p314xaae8f345.mm.p971x6de15a2e.i();
        this.F = false;
        this.G = false;
        this.H = new java.util.concurrent.ConcurrentHashMap();
        this.I = false;
        this.f153428e = parcel.readString();
        this.f153429f = parcel.createByteArray();
        this.f153430g = parcel.createByteArray();
        this.f153431h = parcel.createByteArray();
        this.f153433m = parcel.createByteArray();
        this.f153434n = parcel.createByteArray();
        this.f153435o = parcel.readInt();
        this.f153437q = parcel.createByteArray();
        this.f153438r = parcel.readByte() != 0;
        this.I = parcel.readByte() != 0;
        this.f153439s = parcel.readString();
        this.f153440t = parcel.createByteArray();
        this.f153441u = parcel.createByteArray();
        int readInt = parcel.readInt();
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f153442v.put(parcel.readString(), parcel.createByteArray());
        }
        try {
            int readInt2 = parcel.readInt();
            for (int i18 = 0; i18 < readInt2; i18++) {
                this.f153443w.put(java.lang.Integer.valueOf(parcel.readInt()), (r45.kx3) new r45.kx3().mo11468x92b714fd(parcel.createByteArray()));
            }
            int readInt3 = parcel.readInt();
            for (int i19 = 0; i19 < readInt3; i19++) {
                this.f153444x.put((r45.hx3) new r45.hx3().mo11468x92b714fd(parcel.createByteArray()), (com.p314xaae8f345.mm.p971x6de15a2e.C11178xdfeb52e9) parcel.readParcelable(com.p314xaae8f345.mm.p971x6de15a2e.C11178xdfeb52e9.class.getClassLoader()));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AccInfo", e17, "", new java.lang.Object[0]);
        }
        this.F = parcel.readByte() != 0;
        this.G = parcel.readByte() != 0;
        this.D.f153556b = parcel.readString();
        this.D.f153555a = parcel.readString();
        this.E = parcel.readString();
        this.f153432i = parcel.readLong();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public void E(byte[] bArr, byte[] bArr2, byte[] bArr3, int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "summerauth update session info: session single[%s] cli[%s], svr[%s] uin:%d -> %d timestamp:%s stack:[%s]", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr)), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr2)), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr3)), java.lang.Integer.valueOf(this.f153435o), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (bArr == null || bArr2 == null || bArr3 == null || bArr.length == 0 || bArr2.length == 0 || bArr3.length == 0) {
            this.I = false;
        }
        this.f153432i = j17;
        this.f153429f = bArr;
        this.f153430g = bArr2;
        this.f153431h = bArr3;
        this.f153435o = i17;
        this.f153445y.clear();
        com.p314xaae8f345.mm.p971x6de15a2e.f fVar = this.f153436p;
        if (fVar != null) {
            mo9865x7b0e9c5f();
            fVar.getClass();
        }
    }

    public boolean F0(java.lang.String str) {
        boolean isEmpty;
        if ("axhost".equals(str)) {
            return this.f153443w.isEmpty();
        }
        synchronized (this.A) {
            isEmpty = this.A.isEmpty();
        }
        return isEmpty;
    }

    public void G0(java.lang.String str, java.lang.String str2) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "saveBackUpCgiSignKeys " + str.length() + " " + str2.length());
            com.p314xaae8f345.mm.p971x6de15a2e.i iVar = this.D;
            iVar.f153556b = str;
            iVar.f153555a = str2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccInfo", e17.getLocalizedMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public void I0(boolean z17) {
        this.f153438r = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "somr accinfo setForeground :%b", java.lang.Boolean.valueOf(z17));
    }

    public java.lang.String[] K() {
        java.lang.String[] strArr = new java.lang.String[2];
        com.p314xaae8f345.mm.p971x6de15a2e.i iVar = this.D;
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccInfo", "no find cgi sign keys");
            return strArr;
        }
        strArr[0] = iVar.f153556b;
        strArr[1] = iVar.f153555a;
        return strArr;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] L0(java.lang.String str) {
        r45.uc ucVar;
        r45.cu5 cu5Var;
        if (str != null && str.length() != 0) {
            java.util.Iterator it = this.f153444x.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ucVar = null;
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (str.equals(((r45.hx3) entry.getKey()).f458069e)) {
                    ucVar = ((com.p314xaae8f345.mm.p971x6de15a2e.C11178xdfeb52e9) entry.getValue()).f153455d;
                    break;
                }
            }
            if (ucVar != null && (cu5Var = ucVar.f468739e) != null && cu5Var.f453372d > 0) {
                try {
                    return cu5Var.f453374f.f273689a;
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
        }
        return null;
    }

    public void M() {
        if (!j62.e.g().l("clicfg_reuse_session", true, true, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "clicfg_reuse_session false");
        } else {
            if (!mo9865x7b0e9c5f()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccInfo", "ready to backup, but not login");
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.network.AccInfo$$c
                @Override // java.lang.Runnable
                public final void run() {
                    android.os.Parcelable.Creator<com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af> creator = com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af.f32586x681a0c0c;
                    com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af.this;
                    binderC11173x1cfac0af.E = binderC11173x1cfac0af.t0();
                    try {
                        com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153534v.Z8(binderC11173x1cfac0af);
                    } catch (android.os.RemoteException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AccInfo", e17, "", new java.lang.Object[0]);
                    } catch (java.lang.NullPointerException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AccInfo", e18, "", new java.lang.Object[0]);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "backup accInfo hash:%s", binderC11173x1cfac0af.E);
                }
            }, "MicroMsg.AccInfo");
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
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
        long j18 = this.f153432i;
        if (j17 != j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AccInfo", "timestamp mismatch, need:%s, income:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return;
        }
        r45.kx3 kx3Var = (r45.kx3) this.f153443w.get(java.lang.Integer.valueOf(i17));
        if (kx3Var != null) {
            java.util.LinkedList linkedList2 = kx3Var.f460557e;
            if (linkedList2.size() != 0) {
                r45.uc ucVar = new r45.uc();
                try {
                    ucVar.mo11468x92b714fd(bArr);
                    com.p314xaae8f345.mm.p971x6de15a2e.C11178xdfeb52e9 c11178xdfeb52e9 = new com.p314xaae8f345.mm.p971x6de15a2e.C11178xdfeb52e9();
                    c11178xdfeb52e9.f153455d = ucVar;
                    c11178xdfeb52e9.f153456e = bArr2;
                    r45.cu5 cu5Var = ucVar.f468738d;
                    java.lang.String G1 = (cu5Var == null || cu5Var.f453372d <= 0 || (bArr4 = cu5Var.f453374f.f273689a) == null) ? "" : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr4));
                    r45.cu5 cu5Var2 = ucVar.f468739e;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "setAxAuthSessionKey bussType[%s] ClientSessionKey[%s], ServerSessionKey:[%s], cookies[%s] timestamp[%s]", java.lang.Integer.valueOf(i17), G1, (cu5Var2 == null || cu5Var2.f453372d <= 0 || (bArr3 = cu5Var2.f453374f.f273689a) == null) ? "" : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr3)), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr2)), java.lang.Long.valueOf(j17));
                    java.util.Iterator it = linkedList2.iterator();
                    while (it.hasNext()) {
                        r45.hx3 hx3Var = (r45.hx3) it.next();
                        java.util.Iterator it6 = this.f153444x.entrySet().iterator();
                        while (it6.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
                            if (((r45.hx3) entry.getKey()).f458068d != null && ((r45.hx3) entry.getKey()).f458069e != null && ((r45.hx3) entry.getKey()).f458068d.equals(hx3Var.f458068d) && ((r45.hx3) entry.getKey()).f458069e.equals(hx3Var.f458069e)) {
                                it6.remove();
                            }
                        }
                        this.f153444x.put(hx3Var, c11178xdfeb52e9);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "receive axauth host " + hx3Var.f458069e);
                    }
                    r45.jx3 jx3Var = ucVar.f468740f;
                    if (jx3Var != null && jx3Var.f459730d > 0 && (linkedList = jx3Var.f459731e) != null && linkedList.size() > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "sm4gcm hostalgo size %d", java.lang.Integer.valueOf(ucVar.f468740f.f459730d));
                        this.C.clear();
                        java.util.Iterator it7 = ucVar.f468740f.f459731e.iterator();
                        while (it7.hasNext()) {
                            r45.ix3 ix3Var = (r45.ix3) it7.next();
                            this.C.put(ix3Var.f458922d, java.lang.Integer.valueOf(ix3Var.f458923e));
                            jx3.f.INSTANCE.d(26782, java.lang.Integer.valueOf(ix3Var.f458923e), ix3Var.f458922d, 1, 0, "");
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "mmpack updateAxSessionKey process:%s", bm5.f1.a());
                    ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37573x557a8ae9(i17, ucVar.f468738d.f453374f.f273689a, ucVar.f468739e.f453374f.f273689a, bArr2);
                    ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37572xb54bc71b(i17, ucVar.f468740f.m75960xfb7e5820());
                    if (i17 == 2) {
                        r45.cu5 cu5Var3 = ucVar.f468741g;
                        this.G = false;
                        this.F = false;
                        this.H.clear();
                        boolean l17 = j62.e.g().l("clicfg_pay_mmtls_switch_android", false, true, true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "paymmtls: AccInfo clicfg_pay_mmtls_switch_android: %b", java.lang.Boolean.valueOf(l17));
                        if (l17) {
                            if (cu5Var3 == null || cu5Var3.f453372d <= 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AccInfo", "paymmtls: PayLoginBusinessData is empty");
                                return;
                            }
                            r45.s65 s65Var = new r45.s65();
                            try {
                                byte[] bArr5 = cu5Var3.f453374f.f273689a;
                                int length = bArr5.length;
                                s65Var.mo11468x92b714fd(bArr5);
                                this.G = true;
                                this.F = !s65Var.f467063d;
                                java.util.LinkedList linkedList3 = s65Var.f467064e;
                                java.util.Iterator it8 = linkedList3.iterator();
                                while (it8.hasNext()) {
                                    r45.jf0 jf0Var = (r45.jf0) it8.next();
                                    if (!this.H.containsKey(jf0Var.f459311d) || (num = (java.lang.Integer) this.H.get(jf0Var.f459311d)) == null || num.equals(java.lang.Integer.valueOf(jf0Var.f459312e))) {
                                        this.H.put(jf0Var.f459311d, java.lang.Integer.valueOf(jf0Var.f459312e));
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "paymmtls: put payMMTlsHostMap key:%s, value:%d", jf0Var.f459311d, java.lang.Integer.valueOf(jf0Var.f459312e));
                                    } else {
                                        this.H.put(jf0Var.f459311d, 1);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AccInfo", "paymmtls: repeated pay domain detected: %s, new mmtls_type:%d, fallback to MM_MMTLS1", jf0Var.f459311d, java.lang.Integer.valueOf(jf0Var.f459312e));
                                    }
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "paymmtls: PayLoginBusinessData parsed, usePayMMTls: %b, domain_strategies size: %d payMMTlsHostMap size: %d", java.lang.Boolean.valueOf(this.F), java.lang.Integer.valueOf(linkedList3.size()), java.lang.Integer.valueOf(this.H.size()));
                                return;
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccInfo", "paymmtls: PayLoginBusinessData parseBuf exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (java.lang.Exception e18) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AccInfo", "can not get host list , buss type " + i17);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public int U0(java.lang.String str) {
        if (this.C.containsKey(str)) {
            return ((java.lang.Integer) this.C.get(str)).intValue();
        }
        return 0;
    }

    public void U1(byte[] bArr) {
        java.lang.String l17 = bArr == null ? "" : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(bArr);
        this.f153433m = bArr;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "oreh setCookie %s", l17);
    }

    public void Y0(int i17, boolean z17, long j17) {
        long j18 = this.f153432i;
        if (j17 != j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AccInfo", "setAxAuthRequesting timestamp mismatch, need:%s, income:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "setAxAuthRequesting, bussType:%s, requesting:%s, axAuthRequestingCount:%s, timestamp:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f153446z), java.lang.Long.valueOf(j17));
        if (z17) {
            ((java.util.concurrent.ConcurrentHashMap) this.f153445y).put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "after %s will reset axAuthRequesting %s", 900000L, java.lang.Integer.valueOf(i17));
            ((ku5.t0) ku5.t0.f394148d).l(new com.p314xaae8f345.mm.p971x6de15a2e.RunnableC11177x605d58d5(this, i17, 0, 5, 180000L, j17), 180000L, "MicroMsg.AccInfo");
            return;
        }
        synchronized (this) {
            if (((java.util.concurrent.ConcurrentHashMap) this.f153445y).containsKey(java.lang.Integer.valueOf(i17))) {
                this.f153446z--;
                ((java.util.concurrent.ConcurrentHashMap) this.f153445y).remove(java.lang.Integer.valueOf(i17));
                if (this.f153446z == 0) {
                    M();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public void a(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f153435o);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "summerauth setuin [%d -> %d], stack[%s]", valueOf, valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        this.f153435o = i17;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] c1(java.lang.String str) {
        r45.uc ucVar;
        r45.cu5 cu5Var;
        if (str != null && str.length() != 0) {
            java.util.Iterator it = this.f153444x.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ucVar = null;
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (str.equals(((r45.hx3) entry.getKey()).f458069e)) {
                    ucVar = ((com.p314xaae8f345.mm.p971x6de15a2e.C11178xdfeb52e9) entry.getValue()).f153455d;
                    break;
                }
            }
            if (ucVar != null && (cu5Var = ucVar.f468738d) != null && cu5Var.f453372d > 0) {
                try {
                    return cu5Var.f453374f.f273689a;
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
        }
        return null;
    }

    public void d(int i17, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "addAxAuthHostList");
        r45.kx3 kx3Var = new r45.kx3();
        try {
            kx3Var.mo11468x92b714fd(bArr);
            this.f153443w.put(java.lang.Integer.valueOf(i17), kx3Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "add host " + i17 + " host " + ((r45.hx3) kx3Var.f460557e.get(0)).f458068d);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
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

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] f0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        for (java.util.Map.Entry entry : this.f153444x.entrySet()) {
            if (str.equals(((r45.hx3) entry.getKey()).f458069e)) {
                return ((com.p314xaae8f345.mm.p971x6de15a2e.C11178xdfeb52e9) entry.getValue()).f153456e;
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    /* renamed from: getUin */
    public int mo9862xb5887524() {
        return this.f153435o;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    /* renamed from: getUsername */
    public java.lang.String mo9863x6c03c64c() {
        return this.f153428e;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public void i0() {
        this.f153444x.clear();
        this.C.clear();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    /* renamed from: isForeground */
    public boolean mo9864xf7b3660d() {
        return this.f153438r;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    /* renamed from: isLogin */
    public boolean mo9865x7b0e9c5f() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        return this.I && (bArr = this.f153429f) != null && (bArr2 = this.f153430g) != null && (bArr3 = this.f153431h) != null && bArr.length > 0 && bArr2.length > 0 && bArr3.length > 0;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public void l1(java.lang.String str, byte[] bArr) {
        this.f153442v.put(str, bArr);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] o() {
        return this.f153433m;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public java.lang.String q() {
        return this.f153439s;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r
    public byte[] qh() {
        return this.f153441u;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] r(int i17) {
        if (i17 == 1) {
            return this.f153429f;
        }
        if (i17 == 2) {
            return this.f153430g;
        }
        if (i17 != 3) {
            return null;
        }
        return this.f153431h;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    /* renamed from: reset */
    public void mo9866x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "reset accinfo");
        this.f153428e = "";
        this.f153429f = null;
        this.f153433m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(c01.h9.a().getString("server_id", ""));
        java.lang.String string = c01.h9.a().getString("server_index_buffer", "");
        this.f153434n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) ? null : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(string);
        this.f153435o = 0;
        this.I = false;
        this.f153430g = null;
        this.f153431h = null;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] s() {
        return this.f153437q;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r
    /* renamed from: setUsername */
    public void mo48332x66bc2758(java.lang.String str) {
        this.f153428e = str;
    }

    public java.lang.String t0() {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f153428e);
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f153429f));
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f153430g));
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f153431h));
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f153433m));
            sb6.append(this.f153435o);
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f153437q));
            sb6.append(this.f153438r);
            sb6.append(this.I);
            sb6.append(this.f153439s);
            sb6.append(this.D.f153555a);
            sb6.append(this.D.f153556b);
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f153440t));
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f153441u));
            java.util.LinkedList<java.util.Map.Entry> linkedList = new java.util.LinkedList(this.f153442v.entrySet());
            java.util.Collections.sort(linkedList, new com.p314xaae8f345.mm.p971x6de15a2e.b(this));
            for (java.util.Map.Entry entry : linkedList) {
                sb6.append((java.lang.String) entry.getKey());
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j((byte[]) entry.getValue()));
            }
            java.util.LinkedList<java.util.Map.Entry> linkedList2 = new java.util.LinkedList(this.f153443w.entrySet());
            java.util.Collections.sort(linkedList2, new com.p314xaae8f345.mm.p971x6de15a2e.c(this));
            for (java.util.Map.Entry entry2 : linkedList2) {
                sb6.append(((java.lang.Integer) entry2.getKey()).intValue());
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(((r45.kx3) entry2.getValue()).mo14344x5f01b1f6()));
            }
            java.util.LinkedList<java.util.Map.Entry> linkedList3 = new java.util.LinkedList(this.f153444x.entrySet());
            java.util.Collections.sort(linkedList3, new com.p314xaae8f345.mm.p971x6de15a2e.C11175x605d58d3());
            for (java.util.Map.Entry entry3 : linkedList3) {
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(((r45.hx3) entry3.getKey()).mo14344x5f01b1f6()));
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(((com.p314xaae8f345.mm.p971x6de15a2e.C11178xdfeb52e9) entry3.getValue()).f153455d.mo14344x5f01b1f6()));
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(((com.p314xaae8f345.mm.p971x6de15a2e.C11178xdfeb52e9) entry3.getValue()).f153456e));
            }
            java.util.Iterator it = this.A.iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
            }
            java.util.LinkedList<java.util.Map.Entry> linkedList4 = new java.util.LinkedList(this.B.entrySet());
            java.util.Collections.sort(linkedList4, new com.p314xaae8f345.mm.p971x6de15a2e.d(this));
            for (java.util.Map.Entry entry4 : linkedList4) {
                sb6.append((java.lang.String) entry4.getKey());
                sb6.append(((java.lang.Integer) entry4.getValue()).intValue());
            }
            java.util.LinkedList<java.util.Map.Entry> linkedList5 = new java.util.LinkedList(this.C.entrySet());
            java.util.Collections.sort(linkedList4, new com.p314xaae8f345.mm.p971x6de15a2e.e(this));
            for (java.util.Map.Entry entry5 : linkedList5) {
                sb6.append((java.lang.String) entry5.getKey());
                sb6.append(((java.lang.Integer) entry5.getValue()).intValue());
            }
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(messageDigest.digest(sb6.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AccInfo", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    /* renamed from: toString */
    public java.lang.String m48333x9616526c() {
        return ((((((((("AccInfo:\n|-uin     =" + this.f153435o + "\n") + "|-user    =" + this.f153428e + "\n") + "|-wxuser  =" + this.f153439s + "\n") + "|-jwtdata =" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f153440t) + "\n") + "|-ilinkbuf =" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f153441u) + "\n") + "|-singlesession =" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(r(1)) + "\n") + "|-clientsession =" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(r(2)) + "\n") + "|-serversession =" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(r(3)) + "\n") + "|-ecdhkey =" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f153437q) + "\n") + "`-cookie  =" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f153433m);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] v(java.lang.String str) {
        return (byte[]) this.f153442v.get(str);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public void v0(com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af) {
        if (binderC11173x1cfac0af == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "recoveryAccInfo ignore. empty accinfo.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "recoveryAccInfo CgiKeyLength:[%d,%d]", java.lang.Integer.valueOf(binderC11173x1cfac0af.D.f153555a.length()), java.lang.Integer.valueOf(binderC11173x1cfac0af.D.f153556b.length()));
        this.f153428e = binderC11173x1cfac0af.f153428e;
        this.f153429f = binderC11173x1cfac0af.f153429f;
        this.f153430g = binderC11173x1cfac0af.f153430g;
        this.f153431h = binderC11173x1cfac0af.f153431h;
        this.f153433m = binderC11173x1cfac0af.f153433m;
        this.f153435o = binderC11173x1cfac0af.f153435o;
        this.f153437q = binderC11173x1cfac0af.f153437q;
        this.f153438r = binderC11173x1cfac0af.f153438r;
        this.I = binderC11173x1cfac0af.I;
        this.f153439s = binderC11173x1cfac0af.f153439s;
        this.f153442v = binderC11173x1cfac0af.f153442v;
        this.f153443w = binderC11173x1cfac0af.f153443w;
        this.f153444x = binderC11173x1cfac0af.f153444x;
        this.A = binderC11173x1cfac0af.A;
        this.B = binderC11173x1cfac0af.B;
        this.C = binderC11173x1cfac0af.C;
        this.D = binderC11173x1cfac0af.D;
        this.f153434n = binderC11173x1cfac0af.f153434n;
        this.F = binderC11173x1cfac0af.F;
        this.G = binderC11173x1cfac0af.G;
        this.H = binderC11173x1cfac0af.H;
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.network.AccInfo$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.os.Parcelable.Creator<com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af> creator = com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af.f32586x681a0c0c;
                com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af2 = com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "recovery, calHash:%s, hash:%s", binderC11173x1cfac0af2.t0(), binderC11173x1cfac0af2.E);
                com.p314xaae8f345.mm.p971x6de15a2e.x2.c().k();
            }
        }, "MicroMsg.AccInfo");
    }

    public void w0() {
        this.I = false;
        if (this.f153430g == null && this.f153431h == null && this.f153444x.isEmpty()) {
            return;
        }
        this.f153430g = null;
        this.f153431h = null;
        this.f153444x.clear();
        this.B.clear();
        this.C.clear();
        this.f153445y.clear();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f153428e);
        parcel.writeByteArray(this.f153429f);
        parcel.writeByteArray(this.f153430g);
        parcel.writeByteArray(this.f153431h);
        parcel.writeByteArray(this.f153433m);
        parcel.writeByteArray(this.f153434n);
        parcel.writeInt(this.f153435o);
        parcel.writeByteArray(this.f153437q);
        parcel.writeByte(this.f153438r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.I ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f153439s);
        parcel.writeByteArray(this.f153440t);
        parcel.writeByteArray(this.f153441u);
        parcel.writeInt(this.f153442v.size());
        for (java.util.Map.Entry entry : this.f153442v.entrySet()) {
            parcel.writeString((java.lang.String) entry.getKey());
            parcel.writeByteArray((byte[]) entry.getValue());
        }
        try {
            parcel.writeInt(this.f153443w.size());
            for (java.util.Map.Entry entry2 : this.f153443w.entrySet()) {
                parcel.writeInt(((java.lang.Integer) entry2.getKey()).intValue());
                parcel.writeByteArray(((r45.kx3) entry2.getValue()).mo14344x5f01b1f6());
            }
            parcel.writeInt(this.f153444x.size());
            for (java.util.Map.Entry entry3 : this.f153444x.entrySet()) {
                parcel.writeByteArray(((r45.hx3) entry3.getKey()).mo14344x5f01b1f6());
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AccInfo", e17, "", new java.lang.Object[0]);
        }
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
        parcel.writeString(this.D.f153556b);
        parcel.writeString(this.D.f153555a);
        parcel.writeString(this.E);
        parcel.writeLong(this.f153432i);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public boolean x(java.lang.String str) {
        java.util.LinkedList linkedList;
        if (str != null && str.length() != 0) {
            java.util.Iterator it = this.f153443w.entrySet().iterator();
            while (it.hasNext()) {
                r45.kx3 kx3Var = (r45.kx3) ((java.util.Map.Entry) it.next()).getValue();
                if (kx3Var != null && (linkedList = kx3Var.f460557e) != null) {
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        r45.hx3 hx3Var = (r45.hx3) it6.next();
                        if (hx3Var != null && str.equals(hx3Var.f458069e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r
    public byte[] xb() {
        return this.f153440t;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] y0() {
        return this.f153434n;
    }

    public BinderC11173x1cfac0af(com.p314xaae8f345.mm.p971x6de15a2e.f fVar) {
        this.f153436p = null;
        this.f153438r = false;
        this.f153442v = new java.util.concurrent.ConcurrentHashMap();
        this.f153443w = new java.util.concurrent.ConcurrentHashMap();
        this.f153444x = new java.util.concurrent.ConcurrentHashMap();
        this.f153445y = new java.util.concurrent.ConcurrentHashMap();
        this.f153446z = -1;
        this.A = new java.util.ArrayList();
        this.B = new java.util.concurrent.ConcurrentHashMap();
        this.C = new java.util.concurrent.ConcurrentHashMap();
        this.D = new com.p314xaae8f345.mm.p971x6de15a2e.i();
        this.F = false;
        this.G = false;
        this.H = new java.util.concurrent.ConcurrentHashMap();
        this.I = false;
        this.f153436p = fVar;
        this.f153433m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(c01.h9.a().getString("server_id", ""));
        java.lang.String string = c01.h9.a().getString("server_index_buffer", "");
        this.f153434n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) ? null : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(string);
    }
}

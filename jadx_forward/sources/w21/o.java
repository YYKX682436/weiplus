package w21;

/* loaded from: classes12.dex */
public class o extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 A;
    public final com.p314xaae8f345.mm.p947xba6de98f.q0 B;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f523963d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f523964e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f523965f;

    /* renamed from: g, reason: collision with root package name */
    public long f523966g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f523967h;

    /* renamed from: i, reason: collision with root package name */
    public final int f523968i;

    /* renamed from: m, reason: collision with root package name */
    public long f523969m;

    /* renamed from: n, reason: collision with root package name */
    public int f523970n;

    /* renamed from: o, reason: collision with root package name */
    public int f523971o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f523972p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f523973q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f523974r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f523975s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f523976t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f523977u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f523978v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f523979w;

    /* renamed from: x, reason: collision with root package name */
    public int f523980x;

    /* renamed from: y, reason: collision with root package name */
    public long f523981y;

    /* renamed from: z, reason: collision with root package name */
    public long f523982z;

    public o(java.lang.String str, boolean z17) {
        this(str, 0);
        this.f523972p = z17;
    }

    public final void H(int i17, java.lang.String str) {
        if (this.f523977u) {
            w21.u.c(this.f523965f, 3, i17, this.f523982z, this.f523978v, str);
        } else if (this.f523972p) {
            w21.u.c(this.f523965f, 2, i17, this.f523982z, this.f523978v, str);
        } else {
            w21.u.c(this.f523965f, 1, i17, this.f523982z, this.f523978v, str);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        int mo173141x19771aed;
        w21.t d17;
        int i17;
        int i18;
        int i19;
        r15.b Bi;
        com.p314xaae8f345.mm.p944x882e457a.g1 g1Var;
        this.f523963d = u0Var;
        this.f523979w = false;
        java.lang.String str = this.f523965f;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "doScene:  filename null!");
            this.f523970n = fp.k.a() + 10000;
            return -1;
        }
        w21.w0 j17 = w21.x0.j(str);
        if (j17 == null || !j17.d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "Get info Failed file:" + this.f523965f);
            this.f523970n = fp.k.a() + 10000;
            return -1;
        }
        this.f523966g = j17.f524029m;
        this.f523967h = j17.f524019c;
        if (!w21.x0.c(this.f523965f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "checkVoiceNetTimes Failed file:" + this.f523965f);
            w21.x0.s(this.f523965f);
            this.f523970n = fp.k.a() + 10000;
            return -1;
        }
        this.f523978v = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(j17.f524019c);
        w21.t tVar = new w21.t();
        int i27 = j17.f524025i;
        if (i27 == 8) {
            this.f523980x = 0;
            w21.x0.b(j17.f524018b);
            mo173141x19771aed = 0;
            d17 = tVar;
            i17 = 1;
        } else {
            if (i27 == 3) {
                this.f523979w = true;
            }
            w21.j i28 = w21.x0.i(null, this.f523965f);
            if (i28 == null) {
                this.f523970n = fp.k.a() + 10000;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "doScene: fileOp is null, fileName:%s", this.f523965f);
                return -1;
            }
            mo173141x19771aed = i28.mo173141x19771aed();
            d17 = i28.d(j17.f524022f, 6000);
            if (d17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 242L, 1L, false);
                this.f523970n = fp.k.a() + 10000;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "doScene: readRes is null, fileName:%s", this.f523965f);
                return -1;
            }
            fp.k.a();
            if (d17.f524000d < 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 241L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.f523965f + "] read ret:" + d17.f524000d + " readlen:" + d17.f523998b + " newOff:" + d17.f523999c + " netOff:" + j17.f524022f);
                w21.x0.s(this.f523965f);
                this.f523970n = fp.k.a() + 10000;
                return -1;
            }
            int i29 = d17.f523999c;
            this.f523971o = i29;
            if (i29 < j17.f524022f || i29 >= 469000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 240L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.f523965f + "] newOff:" + this.f523971o + " OldtOff:" + j17.f524022f);
                w21.x0.s(this.f523965f);
                this.f523970n = fp.k.a() + 10000;
                return -1;
            }
            this.f523980x = 0;
            int i37 = d17.f523998b;
            if (i37 == 0 && !this.f523979w) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "doScene:  file:" + this.f523965f + " No Data temperature , will be retry");
                this.f523970n = fp.k.a() + 10000;
                return -1;
            }
            if (this.f523979w) {
                int i38 = j17.f524024h;
                if (i38 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.f523965f + "] read totalLen:" + j17.f524024h);
                    w21.x0.s(this.f523965f);
                    this.f523970n = fp.k.a() + 10000;
                    return -1;
                }
                if (i38 > i29 && i37 < 6000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.f523965f + "] readlen:" + d17.f523998b + " newOff:" + d17.f523999c + " netOff:" + j17.f524022f + " totalLen:" + j17.f524024h);
                    w21.x0.s(this.f523965f);
                    this.f523970n = fp.k.a() + 10000;
                    return -1;
                }
                if (i38 <= i29) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(j17.f524019c, j17.f524029m);
                    java.lang.Integer num = (java.lang.Integer) w21.x0.f524045b.get(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(Li, this.f523965f, false));
                    if (num != null && num.intValue() != 0) {
                        int intValue = ((java.lang.Integer) w21.x0.f524046c.get(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(Li, this.f523965f, false))).intValue();
                        w21.t d18 = i28.d(0, intValue);
                        int f17 = w21.x0.f(num.intValue() & 255, d18.f523997a, 0, d18.f523998b);
                        if (num.intValue() != f17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "Checksum error file. realChecksum:%d, tempChecksum:%d, total:%d, rr.length:%d", java.lang.Integer.valueOf(f17), num, java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(d18.f523998b));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "Checksum error file[" + this.f523965f + "] readlen:" + d17.f523998b + " newOff:" + d17.f523999c + " netOff:" + j17.f524022f + " totalLen:" + j17.f524024h);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                            g0Var.mo68477x336bdfd8(111L, 173L, 1L, false);
                            w21.x0.f524045b.put(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(Li, this.f523965f, false), java.lang.Integer.valueOf(f17));
                            java.lang.Integer num2 = (java.lang.Integer) w21.x0.f524047d.get(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(Li, this.f523965f, false));
                            if (num2 != null && num2.intValue() != 0) {
                                byte[] bArr = d18.f523997a;
                                int i39 = d18.f523998b;
                                synchronized (w21.x0.class) {
                                    if (bArr != null) {
                                        if (bArr.length != 0) {
                                            i18 = 0;
                                            for (int i47 = 0; i47 < i39; i47++) {
                                                i18 += bArr[0 + i47];
                                            }
                                        }
                                    }
                                    i18 = 0;
                                }
                                if (num2.intValue() != i18) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "Checksum error file. cacheSimpleChecksum:%d, realSimpleChecksum:%d", num2, java.lang.Integer.valueOf(i18));
                                    w21.x0.s(this.f523965f);
                                    this.f523970n = fp.k.a() + 10000;
                                    g0Var.mo68477x336bdfd8(111L, 174L, 1L, false);
                                    return -1;
                                }
                            }
                        }
                    }
                    this.f523980x = 1;
                }
            }
            i17 = 0;
        }
        int i48 = j17.f524028l;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVoice", "info.getVoiceLength: %s", java.lang.Integer.valueOf(i48));
        if (i48 == 0) {
            java.lang.String str2 = this.f523965f;
            java.util.HashMap hashMap = w21.x0.f524044a;
            synchronized (hashMap) {
                i48 = (hashMap.get(str2) == null || (g1Var = (com.p314xaae8f345.mm.p944x882e457a.g1) ((java.lang.ref.WeakReference) hashMap.get(str2)).get()) == null) ? -1 : (int) g1Var.c();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVoice", "getCurrentRecordFileLen: %s", java.lang.Integer.valueOf(i48));
            if (i48 < 0) {
                i48 = ((this.f523971o - 6) / 32) * 20;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVoice", "getMinTimeByOffset: %s", java.lang.Integer.valueOf(i48));
            }
        }
        if (!this.f523977u && this.f523972p) {
            m48011xbb66a70e(sVar);
            if (!this.f523979w) {
                this.A.c(500L, 500L);
                return 0;
            }
            this.A.d();
            if (!this.f523973q) {
                jx3.f.INSTANCE.mo68477x336bdfd8(111L, 50L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVoice", "start voice cdn upload");
                dn.m mVar = new dn.m();
                mVar.f69592xf1ebe47b = 15;
                mVar.f69595x6d25b0d9 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f104290j, this.f523965f, false);
                mVar.f69601xaca5bdda = "VoiceData" + this.f523965f;
                mVar.f69620xeb1a61d6 = com.p314xaae8f345.mm.vfs.w6.k(mVar.f69595x6d25b0d9);
                if (this.f523978v) {
                    mVar.f69586x737ec037 = 1;
                } else {
                    mVar.f69586x737ec037 = 0;
                }
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                this.f523981y = android.os.SystemClock.elapsedRealtime();
                if (((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ui(mVar, new java.lang.ref.WeakReference(this.B)) == null) {
                    return -1;
                }
                this.f523973q = true;
                return 0;
            }
            if (!this.f523974r) {
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVoice", "start voice cgi");
            this.f523971o = (int) com.p314xaae8f345.mm.vfs.w6.k(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f104290j, this.f523965f, false));
            this.f523980x = 1;
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.cv6();
            lVar.f152198b = new r45.dv6();
            lVar.f152199c = "/cgi-bin/micromsg-bin/uploadvoice";
            lVar.f152200d = 127;
            lVar.f152201e = 19;
            lVar.f152202f = 1000000019;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            this.f523964e = a17;
            r45.cv6 cv6Var = (r45.cv6) a17.f152243a.f152217a;
            cv6Var.set(0, c01.z1.r());
            cv6Var.set(1, j17.f524019c);
            cv6Var.set(2, java.lang.Integer.valueOf(j17.f524022f));
            cv6Var.set(4, j17.f524020d);
            cv6Var.set(6, java.lang.Integer.valueOf(i48));
            cv6Var.set(8, java.lang.Integer.valueOf(this.f523980x));
            cv6Var.set(15, java.lang.Long.valueOf(j17.f524021e));
            cv6Var.set(10, java.lang.Integer.valueOf(i17));
            cv6Var.set(14, java.lang.Integer.valueOf(this.f523968i));
            cv6Var.set(11, c01.ia.f(null));
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(j17.f524019c)) {
                cv6Var.set(17, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(j17.f524019c));
            }
            cv6Var.set(11, ((aq1.d1) po.a.f438812a).b(j17.f524019c, (int) j17.f524029m));
            cv6Var.set(12, java.lang.Integer.valueOf(mo173141x19771aed));
            cv6Var.set(18, this.f523975s);
            cv6Var.set(19, this.f523976t);
            cv6Var.set(2, 0);
            cv6Var.set(3, java.lang.Integer.valueOf(this.f523971o));
            ui3.b Ni = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Ni(j17.f524040x, j17.f524029m);
            if (Ni != null && (Bi = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Bi(Ni, true)) != null) {
                cv6Var.set(20, Bi.m126747x696739c());
            }
            return mo9409x10f9447a(sVar, this.f523964e, this);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152197a = new r45.cv6();
        lVar2.f152198b = new r45.dv6();
        lVar2.f152199c = "/cgi-bin/micromsg-bin/uploadvoice";
        lVar2.f152200d = 127;
        lVar2.f152201e = 19;
        lVar2.f152202f = 1000000019;
        com.p314xaae8f345.mm.p944x882e457a.o a18 = lVar2.a();
        this.f523964e = a18;
        r45.cv6 cv6Var2 = (r45.cv6) a18.f152243a.f152217a;
        cv6Var2.set(0, c01.z1.r());
        cv6Var2.set(1, j17.f524019c);
        cv6Var2.set(2, java.lang.Integer.valueOf(j17.f524022f));
        cv6Var2.set(4, j17.f524020d);
        cv6Var2.set(6, java.lang.Integer.valueOf(i48));
        cv6Var2.set(8, java.lang.Integer.valueOf(this.f523980x));
        cv6Var2.set(15, java.lang.Long.valueOf(j17.f524021e));
        cv6Var2.set(10, java.lang.Integer.valueOf(i17));
        cv6Var2.set(14, java.lang.Integer.valueOf(this.f523968i));
        cv6Var2.set(11, c01.ia.f(null));
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(j17.f524019c)) {
            cv6Var2.set(17, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(j17.f524019c));
        }
        cv6Var2.set(11, ((aq1.d1) po.a.f438812a).b(j17.f524019c, (int) j17.f524029m));
        cv6Var2.set(12, java.lang.Integer.valueOf(mo173141x19771aed));
        if (i17 != 1) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.e(d17.f523997a, 0, d17.f523998b);
            cv6Var2.set(7, cu5Var);
            cv6Var2.set(3, java.lang.Integer.valueOf(d17.f523998b));
        } else {
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.c(com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[1]));
            cv6Var2.set(7, cu5Var2);
            cv6Var2.set(3, 1);
        }
        ui3.b Ni2 = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Ni(j17.f524040x, j17.f524029m);
        if (Ni2 != null) {
            i19 = 1;
            r15.b Bi2 = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Bi(Ni2, true);
            if (Bi2 != null) {
                cv6Var2.set(20, Bi2.m126747x696739c());
            }
        } else {
            i19 = 1;
        }
        cv6Var2.m75942xfb822ef2(15);
        cv6Var2.m75945x2fec8307(i19);
        cv6Var2.m75939xb282bd08(2);
        int i49 = ((r45.cu5) cv6Var2.m75936x14adae67(7)).f453372d;
        cv6Var2.m75939xb282bd08(8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVoice", "doScene MsgId:" + j17.f524021e + " voiceFormat:" + mo173141x19771aed + " file:" + this.f523965f + " readBytes:" + d17.f523998b + " neTTTOff:" + j17.f524022f + " neWWWOff:" + this.f523971o + " endFlag:" + this.f523980x + " cancelFlag:" + i17 + " status:" + j17.f524025i + " voiceLen:" + i48 + " ExtCommonInfoXml:" + cv6Var2.m75945x2fec8307(20));
        this.f523969m = java.lang.System.currentTimeMillis();
        this.f523981y = android.os.SystemClock.elapsedRealtime();
        return mo9409x10f9447a(sVar, this.f523964e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getDispatchInterceptRet */
    public int mo47996x4facbe8f(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        return w11.c1.a(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(this.f523966g, this.f523967h), this) ? org.p3343x72743996.net.InterfaceC29524x4f65168b.f74071xb0bfc305 : super.mo47996x4facbe8f(sVar, v0Var, l0Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 127;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0325  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r36, int r37, int r38, java.lang.String r39, com.p314xaae8f345.mm.p971x6de15a2e.v0 r40, byte[] r41) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.o.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 60;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCountReach */
    public boolean mo48014x3a8bbc5f() {
        boolean mo48014x3a8bbc5f = super.mo48014x3a8bbc5f();
        if (mo48014x3a8bbc5f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 239L, 1L, false);
        }
        return mo48014x3a8bbc5f;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.cv6 cv6Var = (r45.cv6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152243a.f152217a;
        if (!this.f523972p) {
            cv6Var.m75942xfb822ef2(15);
            cv6Var.m75939xb282bd08(2);
            int i17 = ((r45.cu5) cv6Var.m75936x14adae67(7)).f453372d;
            cv6Var.m75939xb282bd08(8);
            if ((cv6Var.m75942xfb822ef2(15) == 0 && cv6Var.m75939xb282bd08(2) != 0) || ((((r45.cu5) cv6Var.m75936x14adae67(7)) == null || ((r45.cu5) cv6Var.m75936x14adae67(7)).f453372d == 0) && cv6Var.m75939xb282bd08(8) != 1 && cv6Var.m75939xb282bd08(10) != 1)) {
                return com.p314xaae8f345.mm.p944x882e457a.o1.EFailed;
            }
        }
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 238L, 1L, false);
        w21.x0.s(this.f523965f);
    }

    public o(java.lang.String str, int i17) {
        this.f523970n = 0;
        this.f523971o = 0;
        this.f523972p = false;
        this.f523973q = false;
        this.f523974r = false;
        this.f523975s = "";
        this.f523976t = "";
        this.f523977u = false;
        this.f523978v = false;
        this.f523979w = false;
        this.f523980x = 0;
        this.f523981y = 0L;
        this.f523982z = 0L;
        this.A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new w21.p(this), true);
        this.B = new com.p314xaae8f345.mm.p947xba6de98f.q0() { // from class: w21.o$$a
            @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
            public final void a(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
                w21.o oVar = w21.o.this;
                oVar.getClass();
                com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var = n1Var.f152636a;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(n1Var.f152638c);
                java.lang.String str2 = oVar.f523965f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVoice", "CdnPLCJavaHelperListener fileName:%s %s %s", str2, m1Var, valueOf);
                com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var2 = n1Var.f152636a;
                int ordinal = m1Var2.ordinal();
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(111L, 51L, 1L, false);
                        dn.h hVar = n1Var.f152641f;
                        if (hVar != null) {
                            java.lang.String str3 = hVar.f69502xf11df5f5;
                            oVar.f523975s = str3;
                            java.lang.String str4 = hVar.f69522xf9dbbe9c;
                            oVar.f523976t = str4;
                            long j17 = hVar.f69523x17c343e7;
                            oVar.f523974r = true;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVoice", "onUploadVoiceSuccess cdnAesKey:%s cdnVoiceUrl:%s cdnFileLength:%s", str3, str4, java.lang.Long.valueOf(j17));
                            gm0.j1.e().j(new w21.r(oVar));
                            return;
                        }
                        return;
                    }
                    if (ordinal == 5) {
                        dn.g gVar = n1Var.f152640e;
                        if (gVar != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVoice", "onUploadVoiceProgress fileName:%s %s/%s", str2, java.lang.Long.valueOf(gVar.f69496x83ec3dd), java.lang.Long.valueOf(n1Var.f152640e.f69500x8ab84c59));
                            return;
                        }
                        return;
                    }
                    if (ordinal != 12 && ordinal != 14 && ordinal != 16) {
                        return;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "cdn upload failed, fallback to cgi %s", m1Var2.name());
                oVar.f523977u = true;
                java.lang.String str5 = oVar.f523965f;
                int ordinal2 = m1Var2.ordinal();
                int i18 = ordinal2 != 3 ? ordinal2 != 12 ? ordinal2 != 14 ? ordinal2 != 16 ? 330 : 334 : 332 : 331 : 333;
                long j18 = oVar.f523981y;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                w21.u.c(str5, 2, i18, android.os.SystemClock.elapsedRealtime() - j18, oVar.f523978v, null);
                gm0.j1.e().j(new w21.q(oVar));
            }
        };
        iz5.a.g(null, str != null);
        this.f523965f = str;
        this.f523968i = i17;
    }
}

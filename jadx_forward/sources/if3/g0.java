package if3;

/* loaded from: classes12.dex */
public class g0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f372703d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f372704e;

    /* renamed from: f, reason: collision with root package name */
    public final if3.y f372705f;

    /* renamed from: g, reason: collision with root package name */
    public final int f372706g;

    /* renamed from: h, reason: collision with root package name */
    public final fp.j f372707h;

    /* renamed from: i, reason: collision with root package name */
    public int f372708i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f372709m = false;

    public g0(if3.y yVar, boolean z17, int i17) {
        this.f372705f = null;
        this.f372707h = null;
        this.f372708i = 0;
        this.f372705f = yVar;
        this.f372706g = i17;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        yVar.f372746f = java.lang.System.currentTimeMillis();
        int i18 = yVar.f372752o;
        if (i18 == 43) {
            yVar.f372745e = 104;
            yVar.f372757t = t21.w2.t(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, yVar.d(), false));
            yVar.f372755r = t21.w2.t(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, yVar.d(), false));
            this.f372708i = 2500;
            if (yVar.f372758u == 2) {
                this.f372708i = 2500;
            }
        } else if (i18 == 34) {
            this.f372708i = 40;
            yVar.f372745e = 104;
            yVar.f372755r = w21.v0.d(null, yVar.d());
            yVar.f372757t = 0;
        } else {
            int i19 = 1;
            if (i18 == 3) {
                this.f372708i = 40;
                if (i17 == 1) {
                    this.f372708i = 1250;
                } else {
                    i19 = 0;
                }
                yVar.f372759v = i19;
                yVar.f372745e = 104;
                yVar.f372757t = 0;
                yVar.f372755r = (int) com.p314xaae8f345.mm.vfs.w6.k(if3.f0.a() + yVar.d());
            } else if (i18 == 49) {
                this.f372708i = 1;
                yVar.f372745e = 104;
                yVar.f372755r = yVar.d().getBytes().length;
                yVar.f372757t = 0;
            } else if (i18 == 47) {
                this.f372708i = 1;
                yVar.f372745e = 104;
                byte[] bArr = yVar.f372762y;
                yVar.f372755r = (bArr == null ? new byte[0] : bArr).length;
                yVar.f372757t = 0;
            } else if (i18 == 1) {
                this.f372708i = 1;
                yVar.f372745e = 104;
                yVar.f372755r = yVar.d().getBytes().length;
                yVar.f372757t = 0;
            } else {
                iz5.a.g("error msgtype:" + yVar.f372752o, false);
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ri4();
        lVar.f152198b = new r45.si4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/masssend";
        lVar.f152200d = 193;
        lVar.f152201e = 84;
        lVar.f152202f = 1000000084;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f372704e = a17;
        r45.ri4 ri4Var = (r45.ri4) a17.f152243a.f152217a;
        ri4Var.f466452e = kk.k.g(yVar.e().getBytes());
        ri4Var.f466464t = yVar.f372751n;
        ri4Var.f466451d = yVar.e();
        yVar.f372744d = "" + java.lang.System.currentTimeMillis();
        ri4Var.f466453f = yVar.c();
        ri4Var.f466454g = yVar.f372752o;
        ri4Var.f466455h = yVar.f372753p;
        ri4Var.f466465u = z17 ? 1 : 0;
        ri4Var.f466466v = i17;
        this.f372707h = new fp.j();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        this.f372709m = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0381 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02e6 A[RETURN] */
    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s r17, com.p314xaae8f345.mm.p944x882e457a.u0 r18) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: if3.g0.mo807x6c193ac1(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 193;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.cu5 cu5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.cu5 cu5Var2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        m48024x6b3684de(i17);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd FAILED errtype:" + i18 + " errCode:" + i19);
            fp.k.a();
            this.f372703d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        if3.y yVar = this.f372705f;
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd Get INFO FAILED :");
            fp.k.a();
            this.f372703d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        int i27 = yVar.f372745e;
        if (i27 != 104 && i27 != 103) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd STATUS ERR: status:" + yVar.f372745e);
            fp.k.a();
            this.f372703d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f372704e;
        r45.si4 si4Var = (r45.si4) oVar.f152244b.f152233a;
        r45.ri4 ri4Var = (r45.ri4) oVar.f152243a.f152217a;
        if (ri4Var.f466459o > 0 && (cu5Var2 = ri4Var.f466461q) != null && (gVar2 = cu5Var2.f453374f) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(gVar2.g()) && ri4Var.f466460p != si4Var.f467294e - ri4Var.f466461q.f453372d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneMasSend", "onGYNetEnd Err Thumb ");
            fp.k.a();
            this.f372703d.mo815x76e0bfae(3, -1, "doScene failed", this);
            return;
        }
        if (ri4Var.f466458n > 0 && (cu5Var = ri4Var.f466456i) != null && (gVar = cu5Var.f453374f) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(gVar.g()) && ri4Var.f466457m != si4Var.f467293d - ri4Var.f466456i.f453372d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneMasSend", "onGYNetEnd Err Data ");
            fp.k.a();
            this.f372703d.mo815x76e0bfae(3, -1, "doScene failed", this);
            return;
        }
        yVar.f372747g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        int i28 = yVar.f372745e;
        if (i28 == 103) {
            int i29 = ri4Var.f466460p + ri4Var.f466461q.f453372d;
            yVar.f372756s = i29;
            if (i29 >= yVar.f372757t) {
                yVar.f372745e = 199;
            }
        } else {
            if (i28 != 104) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneMasSend", "onGYNetEnd ERROR STATUS:" + i28);
                fp.k.a();
                this.f372703d.mo815x76e0bfae(3, -1, "doScene failed", this);
                return;
            }
            int i37 = ri4Var.f466457m + ri4Var.f466456i.f453372d;
            yVar.f372754q = i37;
            if (i37 >= yVar.f372755r) {
                if (yVar.f372757t > 0) {
                    yVar.f372745e = 103;
                } else {
                    yVar.f372745e = 199;
                }
            }
        }
        if (yVar.f372745e != 199) {
            if (mo807x6c193ac1(m47995xb7ba1aa7(), this.f372703d) == -1) {
                fp.k.a();
                this.f372703d.mo815x76e0bfae(3, -1, "doScene failed", this);
                return;
            }
            return;
        }
        yVar.f372760w = java.lang.Long.toString(si4Var.f467296g);
        if3.z Ai = if3.k0.Ai();
        Ai.getClass();
        yVar.f372763z = -1;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((yVar.f372763z & 1) != 0) {
            contentValues.put("clientid", yVar.c());
        }
        if ((yVar.f372763z & 2) != 0) {
            contentValues.put("status", java.lang.Integer.valueOf(yVar.f372745e));
        }
        if ((yVar.f372763z & 4) != 0) {
            contentValues.put("createtime", java.lang.Long.valueOf(yVar.f372746f));
        }
        if ((yVar.f372763z & 8) != 0) {
            contentValues.put("lastmodifytime", java.lang.Long.valueOf(yVar.f372747g));
        }
        if ((yVar.f372763z & 16) != 0) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37650x1214b17, yVar.d());
        }
        if ((yVar.f372763z & 32) != 0) {
            java.lang.String str2 = yVar.f372749i;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("thumbfilename", str2);
        }
        if ((yVar.f372763z & 64) != 0) {
            contentValues.put("tolist", yVar.e());
        }
        if ((yVar.f372763z & 128) != 0) {
            contentValues.put("tolistcount", java.lang.Integer.valueOf(yVar.f372751n));
        }
        if ((yVar.f372763z & 256) != 0) {
            contentValues.put("msgtype", java.lang.Integer.valueOf(yVar.f372752o));
        }
        if ((yVar.f372763z & 512) != 0) {
            contentValues.put("mediatime", java.lang.Integer.valueOf(yVar.f372753p));
        }
        if ((yVar.f372763z & 1024) != 0) {
            contentValues.put("datanetoffset", java.lang.Integer.valueOf(yVar.f372754q));
        }
        if ((yVar.f372763z & 2048) != 0) {
            contentValues.put("datalen", java.lang.Integer.valueOf(yVar.f372755r));
        }
        if ((yVar.f372763z & 4096) != 0) {
            contentValues.put("thumbnetoffset", java.lang.Integer.valueOf(yVar.f372756s));
        }
        if ((yVar.f372763z & 8192) != 0) {
            contentValues.put("thumbtotallen", java.lang.Integer.valueOf(yVar.f372757t));
        }
        if ((yVar.f372763z & 16384) != 0) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(yVar.f372758u));
        }
        if ((yVar.f372763z & 32768) != 0) {
            contentValues.put("reserved2", java.lang.Integer.valueOf(yVar.f372759v));
        }
        if ((yVar.f372763z & 65536) != 0) {
            java.lang.String str3 = yVar.f372760w;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("reserved3", str3);
        }
        if ((yVar.f372763z & 131072) != 0) {
            java.lang.String str4 = yVar.f372761x;
            contentValues.put("reserved4", str4 != null ? str4 : "");
        }
        if (((int) Ai.f372765d.l("massendinfo", "clientid", contentValues)) != -1) {
            boolean z17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p("masssendapp") == null;
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
            l4Var.b2("masssendapp");
            l4Var.l1(Ai.y0(yVar));
            l4Var.n1(yVar.f372746f);
            l4Var.M1(0);
            l4Var.Y1(0);
            l4Var.T1(null);
            if (z17) {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).G(l4Var);
            } else {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).W(l4Var, "masssendapp");
            }
            Ai.m145262xf35bbb4();
        }
        fp.j jVar = this.f372707h;
        if (jVar != null) {
            jVar.a();
        }
        this.f372703d.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 2500;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
    }
}

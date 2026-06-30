package h11;

/* loaded from: classes14.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, hv.f {

    /* renamed from: m, reason: collision with root package name */
    public static h11.c f359603m;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f359604d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f359605e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f359606f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f359607g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f359608h;

    /* renamed from: i, reason: collision with root package name */
    public int f359609i;

    public e(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4) {
        this(str, i17, str2, i18, str3);
        ((o45.eh) this.f359604d.mo47979x2d63726f()).f424455a.f454021m = str4;
    }

    public int H() {
        return ((h11.d) this.f359604d).f359602b.f424458a.f455061z;
    }

    public int I() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((h11.d) this.f359604d).f359602b.f424458a.f455057v;
        if (w56Var == null || (linkedList = w56Var.f470438e) == null || linkedList.size() <= 0) {
            return 30;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gg6 gg6Var = (r45.gg6) it.next();
            if (gg6Var.f456770d == 4) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(gg6Var.f456771e, 30);
            }
        }
        return 30;
    }

    public int J() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((h11.d) this.f359604d).f359602b.f424458a.f455057v;
        if (w56Var == null || (linkedList = w56Var.f470438e) == null || linkedList.size() <= 0) {
            return 0;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gg6 gg6Var = (r45.gg6) it.next();
            if (gg6Var.f456770d == 5) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(gg6Var.f456771e, 0);
            }
        }
        return 0;
    }

    public boolean K() {
        int i17;
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((h11.d) this.f359604d).f359602b.f424458a.f455057v;
        if (w56Var != null && (linkedList = w56Var.f470438e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f456770d == 7) {
                    i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(gg6Var.f456771e, 0);
                    break;
                }
            }
        }
        i17 = 0;
        return i17 > 0;
    }

    public int L() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((h11.d) this.f359604d).f359602b.f424458a.f455057v;
        if (w56Var == null || (linkedList = w56Var.f470438e) == null || linkedList.size() <= 0) {
            return 3;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gg6 gg6Var = (r45.gg6) it.next();
            if (gg6Var.f456770d == 6) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(gg6Var.f456771e, 3);
            }
        }
        return 3;
    }

    public int M() {
        return ((o45.eh) this.f359604d.mo47979x2d63726f()).f424455a.f454017f;
    }

    public java.lang.String N() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((h11.d) this.f359604d).f359602b.f424458a.f455057v;
        if (w56Var != null && (linkedList = w56Var.f470438e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f456770d == 14) {
                    return gg6Var.f456771e;
                }
            }
        }
        return null;
    }

    public java.lang.String O() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((h11.d) this.f359604d).f359602b.f424458a.f455057v;
        if (w56Var != null && (linkedList = w56Var.f470438e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f456770d == 15) {
                    return gg6Var.f456771e;
                }
            }
        }
        return null;
    }

    public java.lang.String P() {
        return ((h11.d) this.f359604d).f359602b.f424458a.f455045g;
    }

    public java.lang.String Q() {
        return ((h11.d) this.f359604d).f359602b.f424458a.f455046h;
    }

    public void R(r45.k57 k57Var) {
        if (k57Var != null) {
            try {
                r45.di diVar = ((o45.eh) this.f359604d.mo47979x2d63726f()).f424455a;
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(k57Var.mo14344x5f01b1f6());
                diVar.f454033y = cu5Var;
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public void S(java.lang.String str) {
        ((o45.eh) this.f359604d.mo47979x2d63726f()).f424455a.f454031w = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        java.lang.String str;
        this.f359605e = u0Var;
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f359604d;
        o45.eh ehVar = (o45.eh) v0Var.mo47979x2d63726f();
        java.lang.String str2 = ehVar.f424455a.f454016e;
        r45.di diVar = ehVar.f424455a;
        if (str2 == null || str2.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBindMobileForReg", "doScene getMobile Error: " + diVar.f454016e);
            return -1;
        }
        int i17 = diVar.f454017f;
        if ((i17 == 6 || i17 == 9) && ((str = diVar.f454018g) == null || str.length() <= 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBindMobileForReg", "doScene getVerifyCode Error: " + diVar.f454016e);
            return -1;
        }
        diVar.G = this.f359606f;
        diVar.H = this.f359607g;
        diVar.I = this.f359608h;
        return mo9409x10f9447a(sVar, v0Var, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 145;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.ei eiVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindMobileForReg", "dkidc onGYNetEnd  errType:%d errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        o45.fh fhVar = (o45.fh) v0Var.mo13821x7f35c2d1();
        if (fhVar == null || (eiVar = fhVar.f424458a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindMobileForReg", "summerauth mmtls bindopreg not set as ret:%s", fhVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindMobileForReg", "summerauth mmtls bindopreg json:%s", eiVar.mo12245xcc313de3());
            int i27 = fhVar.f424458a.f455058w;
            gm0.j1.i();
            gm0.j1.u().f354681a.f(47, java.lang.Integer.valueOf(i27));
            com.p314xaae8f345.mm.p971x6de15a2e.s sVar = gm0.j1.n().f354821b.f152297d;
            if (sVar != null) {
                sVar.n1((i27 & 1) == 0);
            }
        }
        if (i18 == 4 && i19 == -301) {
            r45.ei eiVar2 = fhVar.f424458a;
            c01.f9.d(eiVar2.f455048m, eiVar2.f455049n, eiVar2.f455047i, true, eiVar2.D);
            int i28 = this.f359609i - 1;
            this.f359609i = i28;
            if (i28 <= 0) {
                this.f359605e.mo815x76e0bfae(3, -1, "", this);
                return;
            } else {
                mo807x6c193ac1(m47995xb7ba1aa7(), this.f359605e);
                return;
            }
        }
        if (i18 == 4 && i19 == -240) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindMobileForReg", "summerauth bindopreg MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", java.lang.Integer.valueOf(this.f359609i));
            int i29 = this.f359609i - 1;
            this.f359609i = i29;
            if (i29 <= 0) {
                this.f359605e.mo815x76e0bfae(3, -1, "", this);
                return;
            } else {
                mo807x6c193ac1(m47995xb7ba1aa7(), this.f359605e);
                return;
            }
        }
        if (i18 == 4 && i19 == -102) {
            gm0.j1.e().j(new h11.b(this, v0Var.mo47979x2d63726f().m150614x960aaed8().f424532c));
            return;
        }
        if (i18 == 4 && (i19 == -305 || i19 == -306)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindMobileForReg", "summerauth bindmobilereg MM_ERR_CERT_SWITCH or MM_ERR_ECDHFAIL_ROLLBACK errCode:%d ver:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(o45.ag.a()));
            mo807x6c193ac1(m47995xb7ba1aa7(), this.f359605e);
        } else {
            if (i18 != 0 || i19 != 0) {
                this.f359605e.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            r45.ei eiVar3 = fhVar.f424458a;
            c01.f9.d(eiVar3.f455048m, eiVar3.f455049n, eiVar3.f455047i, false, 0);
            this.f359605e.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 3;
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

    public e(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3) {
        this(str, i17, str2, i18, str3, 0);
    }

    public e(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, int i19) {
        this(str, i17, str2, i18, str3, i19, null, null);
    }

    public e(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, int i19, r45.cu5 cu5Var, r45.c66 c66Var) {
        java.lang.String string;
        this.f359605e = null;
        java.lang.String str4 = "";
        this.f359606f = "";
        this.f359607g = "";
        this.f359608h = "";
        this.f359609i = 2;
        h11.d dVar = new h11.d();
        this.f359604d = dVar;
        o45.eh ehVar = (o45.eh) dVar.mo47979x2d63726f();
        r45.di diVar = ehVar.f424455a;
        diVar.f454017f = i17;
        diVar.f454016e = str;
        diVar.f454018g = str2;
        diVar.f454030v = i19;
        diVar.f454019h = i18;
        diVar.f454020i = str3;
        diVar.f454026r = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        java.lang.String e17 = gm0.m.e();
        r45.di diVar2 = ehVar.f424455a;
        diVar2.f454029u = e17;
        diVar2.f454014J = cu5Var;
        diVar2.K = c66Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(diVar2.f454023o) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(diVar2.f454024p)) {
            h11.c cVar = f359603m;
            if (cVar != null) {
                ((aq1.g1) cVar).getClass();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273981k) {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7d);
                } else {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7c);
                }
                str4 = string;
            }
            diVar2.f454023o = str4;
            diVar2.f454024p = o45.wf.f424559d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindMobileForReg", "req json %s", diVar2.mo12245xcc313de3());
    }
}

package z21;

/* loaded from: classes12.dex */
public class h extends z21.a implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f551109d;

    /* renamed from: h, reason: collision with root package name */
    public final z21.a0 f551113h;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f551122t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.du5 f551123u;

    /* renamed from: v, reason: collision with root package name */
    public final int f551124v;

    /* renamed from: w, reason: collision with root package name */
    public final int f551125w;

    /* renamed from: x, reason: collision with root package name */
    public final int f551126x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f551127y;

    /* renamed from: e, reason: collision with root package name */
    public int f551110e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f551111f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f551112g = 120;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f551114i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public boolean f551115m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Long f551116n = 0L;

    /* renamed from: o, reason: collision with root package name */
    public boolean f551117o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f551118p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f551119q = true;

    /* renamed from: r, reason: collision with root package name */
    public int f551120r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f551121s = 0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String[] f551128z = new java.lang.String[0];
    public int A = 0;
    public java.util.LinkedList B = new java.util.LinkedList();
    public int C = 3960;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 D = new z21.g(this, gm0.j1.e().a());

    public h(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, boolean z17) {
        this.f551122t = null;
        this.f551123u = null;
        this.f551125w = 0;
        this.f551126x = 0;
        this.f551127y = false;
        this.f551122t = str;
        this.f551113h = new z21.a0(str2);
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = str3;
        du5Var.f454290e = true;
        this.f551123u = du5Var;
        this.f551124v = i17;
        this.f551125w = i18;
        this.f551126x = i19;
        this.f551127y = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewVoiceInput", "NetSceneNewVoiceInput filename:%s,session:%s,vadVersion:%s, langType:%d, scene:%s, removeVad:%s", str, str2, str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
    }

    @Override // z21.a
    public int H() {
        return this.f551111f;
    }

    @Override // z21.a
    public int I() {
        return this.f551110e;
    }

    @Override // z21.a
    public java.lang.String[] J() {
        return this.f551128z;
    }

    @Override // z21.a
    public long K() {
        return 0L;
    }

    @Override // z21.a
    public java.util.List L() {
        return this.f551113h.e();
    }

    @Override // z21.a
    public void M() {
        this.f551115m = true;
    }

    public void N() {
        fp.k.c();
        if (this.f551118p) {
            return;
        }
        this.f551118p = true;
        Q();
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        int hashCode = hashCode();
        d17.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.NetSceneQueue", "cancelAllImp sceneHashCode:%d", java.lang.Integer.valueOf(hashCode));
        com.p314xaae8f345.mm.p944x882e457a.e2 e2Var = new com.p314xaae8f345.mm.p944x882e457a.e2(d17, hashCode);
        x51.q1 q1Var = d17.f152308r;
        q1Var.getClass();
        q1Var.a(e2Var, 0L, true);
        z21.z h17 = this.f551113h.h(this.f551120r);
        if (h17 != null) {
            this.f551121s = 0;
            gm0.j1.e().j(new z21.f(this, h17));
        }
    }

    public boolean O() {
        return this.f551113h.g() || this.f551111f != 0;
    }

    public boolean P() {
        this.D.mo50303x856b99f0(291);
        if ((O() && this.f551115m) || this.f551117o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewVoiceInput", "preDoScene return");
            return false;
        }
        z21.z h17 = this.f551113h.h(this.f551120r);
        if (h17 == null) {
            this.D.mo50307xb9e94560(291, this.f551112g * 2);
            return true;
        }
        long min = java.lang.Math.min(com.p314xaae8f345.mm.vfs.w6.k(this.f551122t), h17.f551238d);
        if (min <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneNewVoiceInput", "nowMarkLen <= 0 read failed :%s", this.f551122t);
            this.f551110e = fp.k.a() + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171;
            this.f551121s = 0;
            N();
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f551109d;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(3, -1, "ReadFileLengthError", this);
            }
            return false;
        }
        int i17 = (int) (min - this.f551120r);
        this.f551121s = i17;
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewVoiceInput", "canReadLen < 0 length:%s ", java.lang.Integer.valueOf(i17));
            this.f551110e = fp.k.a() + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171;
            this.D.mo50307xb9e94560(291, this.f551112g * 2);
            return false;
        }
        if (this.f551121s >= 500 || h17.f551239e <= 5) {
            this.D.mo50307xb9e94560(291, this.f551112g);
        } else {
            this.D.mo50307xb9e94560(291, this.f551112g * 2);
        }
        return true;
    }

    public final void Q() {
        fp.k.c();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.D;
        if (n3Var != null) {
            n3Var.mo50303x856b99f0(291);
        }
        this.f551117o = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f551109d = u0Var;
        if ((this.f551125w >= 15) == true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewVoiceInput", "doScene MM_VOICE_TRANSSCENE_INPUTBOX  goNewCgi!  fileName:%s", this.f551122t);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.p17();
            lVar.f152198b = new r45.r17();
            lVar.f152199c = "/cgi-bin/micromsg-bin/voice_recognize";
            lVar.f152200d = 12220;
            int i17 = this.A;
            if (i17 > 0) {
                lVar.f152205i = i17 * 1000;
            }
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            a17.mo47979x2d63726f().m150631x81f65d35(false);
            r45.p17 p17Var = (r45.p17) a17.f152243a.f152217a;
            z21.z h17 = this.f551113h.h(this.f551120r);
            p17Var.f464202e = this.f551125w;
            if (h17 == null) {
                p17Var.f464201d = "0";
                p17Var.f464203f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[0]);
                p17Var.f464204g = 2;
                p17Var.f464205h = true;
                p17Var.f464206i = 0;
                p17Var.f464207m = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[0]);
                ((java.util.HashMap) this.f551114i).put(java.lang.Integer.valueOf(p17Var.f464206i), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                java.lang.System.currentTimeMillis();
                return mo9409x10f9447a(sVar, a17, this);
            }
            h17.f551236b = true;
            if (this.f551118p) {
                h17.f551237c = true;
                p17Var.f464203f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewVoiceInput", "send last packet");
            } else {
                int i18 = this.f551121s;
                int i19 = this.C;
                if (i18 > i19) {
                    this.f551121s = i19;
                    h17.f551237c = false;
                } else if (i18 <= i19 && (h17.f551238d != Integer.MAX_VALUE || this.f551115m)) {
                    h17.f551237c = true;
                }
                p17Var.f464203f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(com.p314xaae8f345.mm.vfs.w6.N(this.f551122t, this.f551120r, this.f551121s));
            }
            p17Var.f464201d = h17.f551235a;
            p17Var.f464205h = h17.f551237c;
            p17Var.f464204g = 2;
            int i27 = h17.f551239e + 1;
            h17.f551239e = i27;
            p17Var.f464206i = i27;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f551113h.f551084b;
            if (gVar == null) {
                gVar = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[0]);
            }
            p17Var.f464207m = gVar;
            ((java.util.HashMap) this.f551114i).put(java.lang.Integer.valueOf(p17Var.f464206i), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewVoiceInput", " goNewCgi voice_id: %s, is_end:%s", p17Var.f464201d, java.lang.Boolean.valueOf(p17Var.f464205h));
            int length = this.f551120r + p17Var.f464203f.f273689a.length;
            this.f551120r = length;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewVoiceInput", "clientId %s oldReadOffset %s", h17.f551235a, java.lang.Integer.valueOf(length));
            if (h17.f551239e == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewVoiceInput", "time flee send seq 1 time = %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
            java.lang.System.currentTimeMillis();
            return mo9409x10f9447a(sVar, a17, this);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152197a = new r45.w17();
        lVar2.f152198b = new r45.y17();
        lVar2.f152199c = "/cgi-bin/micromsg-bin/voicetrans";
        lVar2.f152200d = 235;
        lVar2.f152201e = 381;
        lVar2.f152202f = 1000000381;
        com.p314xaae8f345.mm.p944x882e457a.o a18 = lVar2.a();
        a18.mo47979x2d63726f().m150631x81f65d35(false);
        r45.w17 w17Var = (r45.w17) a18.f152243a.f152217a;
        z21.z h18 = this.f551113h.h(this.f551120r);
        w17Var.f470329q = this.f551125w;
        if (h18 == null) {
            w17Var.f470319d = new r45.cu5();
            w17Var.f470320e = this.f551120r;
            w17Var.f470321f = "0";
            w17Var.f470322g = 1;
            w17Var.f470323h = 2;
            w17Var.f470324i = 0;
            java.util.LinkedList d17 = this.f551113h.d();
            w17Var.f470326n = d17;
            w17Var.f470325m = d17.size();
            w17Var.f470327o = this.f551123u;
            w17Var.f470328p = this.f551124v;
            w17Var.f470330r = this.f551127y ? 1 : 0;
            java.util.Iterator it = w17Var.f470326n.iterator();
            while (it.hasNext()) {
                java.lang.String str = ((r45.du5) it.next()).f454289d;
            }
            java.lang.System.currentTimeMillis();
            return mo9409x10f9447a(sVar, a18, this);
        }
        h18.f551236b = true;
        if (this.f551118p) {
            h18.f551237c = true;
            w17Var.f470319d = new r45.cu5();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewVoiceInput", "send last packet");
        } else {
            int i28 = this.f551121s;
            int i29 = this.C;
            if (i28 > i29) {
                this.f551121s = i29;
                h18.f551237c = false;
            } else if (i28 <= i29 && (h18.f551238d != Integer.MAX_VALUE || this.f551115m)) {
                h18.f551237c = true;
            }
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(this.f551122t, this.f551120r, this.f551121s);
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(N);
            w17Var.f470319d = cu5Var;
        }
        w17Var.f470320e = this.f551120r;
        w17Var.f470321f = h18.f551235a;
        w17Var.f470322g = h18.f551237c ? 1 : 0;
        w17Var.f470323h = 2;
        int i37 = h18.f551239e + 1;
        h18.f551239e = i37;
        w17Var.f470324i = i37;
        java.util.LinkedList d18 = this.f551113h.d();
        w17Var.f470326n = d18;
        w17Var.f470325m = d18.size();
        w17Var.f470327o = this.f551123u;
        w17Var.f470328p = this.f551124v;
        w17Var.f470330r = this.f551127y ? 1 : 0;
        fp.k.c();
        int i38 = this.f551120r + w17Var.f470319d.f453372d;
        this.f551120r = i38;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewVoiceInput", "clientId %s oldReadOffset %s", h18.f551235a, java.lang.Integer.valueOf(i38));
        if (h18.f551239e == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewVoiceInput", "time flee send seq 1 time = %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        java.lang.System.currentTimeMillis();
        return mo9409x10f9447a(sVar, a18, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return this.f551125w >= 15 ? 12220 : 235;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: isSupportConcurrent */
    public boolean mo48008x768cf6dc() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02bb  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r26, int r27, int r28, java.lang.String r29, com.p314xaae8f345.mm.p971x6de15a2e.v0 r30, byte[] r31) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z21.h.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 2000;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneNewVoiceInput", fp.k.c() + " setSecurityCheckError e: %s", n1Var);
        if (n1Var == com.p314xaae8f345.mm.p944x882e457a.n1.EReachMaxLimit) {
            N();
            this.f551109d.mo815x76e0bfae(3, -1, "SecurityCheckError", this);
        }
    }
}

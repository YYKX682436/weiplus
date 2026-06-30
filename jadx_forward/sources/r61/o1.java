package r61;

/* loaded from: classes4.dex */
public class o1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f474463d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474464e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f474465f;

    /* renamed from: g, reason: collision with root package name */
    public final int f474466g;

    /* renamed from: h, reason: collision with root package name */
    public int f474467h;

    /* renamed from: i, reason: collision with root package name */
    public int f474468i;

    /* renamed from: m, reason: collision with root package name */
    public int f474469m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f474470n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f474471o;

    public o1(java.util.ArrayList arrayList, int i17, java.util.HashMap hashMap, java.lang.String str) {
        this.f474470n = new java.util.HashMap();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.e74();
        lVar.f152198b = new r45.f74();
        lVar.f152199c = "/cgi-bin/micromsg-bin/listgooglecontact";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.z.f34775x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f474463d = lVar.a();
        this.f474465f = arrayList;
        this.f474466g = i17;
        this.f474467h = 0;
        this.f474469m = 1;
        this.f474470n = hashMap;
        this.f474471o = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doScene");
        this.f474464e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f474463d;
        r45.e74 e74Var = (r45.e74) oVar.f152243a.f152217a;
        java.util.ArrayList arrayList = this.f474465f;
        if (arrayList != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            this.f474468i = arrayList.size();
            for (int i17 = this.f474467h; i17 < this.f474468i && i17 < this.f474467h + 500; i17++) {
                r45.yt3 yt3Var = new r45.yt3();
                yt3Var.f472886d = ((r61.s0) arrayList.get(i17)).f65887x58397040;
                linkedList.add(yt3Var);
            }
            e74Var.f454607e = linkedList;
            e74Var.f454606d = linkedList.size();
            int i18 = this.f474467h + 500;
            int i19 = this.f474468i;
            if (i18 > i19) {
                this.f474469m = 0;
            } else {
                this.f474469m = 1;
            }
            e74Var.f454608f = this.f474469m;
            e74Var.f454609g = this.f474466g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doscene mTotalSize:%d, mStarIndex:%d, mContinueFlag:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f474467h), java.lang.Integer.valueOf(this.f474469m));
        }
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.z.f34775x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            this.f474464e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.f74 f74Var = (r45.f74) this.f474463d.f152244b.f152233a;
        synchronized (this) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "handleListGoogleContactCGIResponse Count:%d", java.lang.Integer.valueOf(f74Var.f455607d));
            java.util.LinkedList linkedList = f74Var.f455608e;
            if (linkedList != null && linkedList.size() > 0) {
                int size = f74Var.f455608e.size();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                for (int i28 = 0; i28 < size; i28++) {
                    r45.xt3 xt3Var = (r45.xt3) f74Var.f455608e.get(i28);
                    if (android.text.TextUtils.isEmpty(xt3Var.f471925e)) {
                        i27 = 1;
                    } else {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(xt3Var.f471925e, true);
                        i27 = (n17 == null || !n17.r2()) ? 0 : 2;
                    }
                    java.util.HashMap hashMap = this.f474470n;
                    if (hashMap != null && hashMap.containsKey(xt3Var.f471924d)) {
                        r61.s0 s0Var = (r61.s0) this.f474470n.get(xt3Var.f471924d);
                        s0Var.f65898xdec927b = xt3Var.f471925e;
                        java.lang.String str2 = xt3Var.f471929i;
                        s0Var.f65893x21f9b213 = str2;
                        s0Var.f65899x4511edc4 = x51.k.b(str2);
                        s0Var.f65894x8a558772 = x51.k.a(xt3Var.f471929i);
                        s0Var.f65895x4b6e7bdc = xt3Var.f471928h;
                        s0Var.f65896x39e2d932 = xt3Var.f471927g;
                        s0Var.f65884x6dba9f6b = xt3Var.f471926f;
                        s0Var.f65897x10a0fed7 = i27;
                        s0Var.f65886xba0f6d59 = 2;
                        if (i27 != 2 && i27 != 0) {
                            s0Var.f65885x41d6e899 = "google";
                            s0Var.f65891xba42d072 = x51.k.b(s0Var.f65890x5db248a9);
                            arrayList.add(s0Var);
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).fj(s0Var.f65888x9c77cab9, s0Var.f65892x7b1b111b, this.f474471o);
                            ((us.a) ((vs.e) i95.n0.c(vs.e.class))).getClass();
                            com.p314xaae8f345.mm.p2621x8fb0427b.h hVar = new com.p314xaae8f345.mm.p2621x8fb0427b.h();
                            hVar.f67762xdde069b = xt3Var.f471925e;
                            hVar.f67760x29cbf907 = 58;
                            hVar.f67761x11bb99f1 = xt3Var.f471930m;
                            linkedList2.add(hVar);
                        }
                        s0Var.f65885x41d6e899 = "weixin" + i28;
                        s0Var.f65891xba42d072 = x51.k.b(s0Var.f65890x5db248a9);
                        arrayList.add(s0Var);
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).fj(s0Var.f65888x9c77cab9, s0Var.f65892x7b1b111b, this.f474471o);
                        ((us.a) ((vs.e) i95.n0.c(vs.e.class))).getClass();
                        com.p314xaae8f345.mm.p2621x8fb0427b.h hVar2 = new com.p314xaae8f345.mm.p2621x8fb0427b.h();
                        hVar2.f67762xdde069b = xt3Var.f471925e;
                        hVar2.f67760x29cbf907 = 58;
                        hVar2.f67761x11bb99f1 = xt3Var.f471930m;
                        linkedList2.add(hVar2);
                    }
                }
                ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                m61.k.Di().z0(arrayList);
                ((us.a) ((vs.e) i95.n0.c(vs.e.class))).wi(linkedList2);
            }
        }
        if (this.f474469m == 1) {
            this.f474467h += 500;
            if (mo807x6c193ac1(m47995xb7ba1aa7(), this.f474464e) < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doScene again failed");
                this.f474464e.mo815x76e0bfae(3, -1, "", this);
            }
        }
        this.f474464e.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 20;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}

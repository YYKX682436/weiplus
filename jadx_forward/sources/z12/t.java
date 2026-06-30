package z12;

/* loaded from: classes12.dex */
public class t extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550893d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550894e;

    /* renamed from: f, reason: collision with root package name */
    public final int f550895f;

    /* renamed from: g, reason: collision with root package name */
    public final int f550896g;

    /* renamed from: h, reason: collision with root package name */
    public int f550897h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f550898i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f550899m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f550900n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f550901o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f550902p;

    public t(int i17, int i18) {
        this(i17, null, i18, false);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s I(r45.we3 we3Var) {
        java.lang.Object[] array;
        if (we3Var == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s();
        sVar.f179132a = we3Var.f470618e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = we3Var.f470619f;
        if (linkedList != null && !linkedList.isEmpty() && (array = linkedList.toArray()) != null && array.length > 0) {
            for (java.lang.Object obj : array) {
                if (obj != null && (obj instanceof r45.zj0)) {
                    r45.zj0 zj0Var = (r45.zj0) obj;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zj0Var.f473661d)) {
                        j12.i iVar = new j12.i(zj0Var);
                        iVar.f378709k = java.lang.Long.toString(we3Var.f470635y);
                        arrayList.add(iVar);
                    }
                }
            }
        }
        sVar.f179133b = arrayList;
        sVar.f179134c = we3Var.f470620g;
        sVar.f179135d = we3Var.f470622i;
        java.util.LinkedList linkedList2 = we3Var.f470630t;
        if (sVar.f179137f == null) {
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            sVar.f179137f = linkedList3;
            linkedList3.addAll(linkedList2);
        }
        sVar.f179136e = we3Var.f470626p;
        return sVar;
    }

    public final void H() {
        java.util.LinkedList linkedList;
        r45.we3 J2 = J();
        if (J2 == null || (linkedList = J2.f470619f) == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.NetSceneGetEmotionList", "addSummaryList faild. response is null or emotion list is empty.");
        } else {
            this.f550901o.addAll(linkedList);
        }
    }

    public r45.we3 J() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550893d;
        if (oVar == null) {
            return null;
        }
        return (r45.we3) oVar.f152244b.f152233a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f550894e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550893d;
        r45.ve3 ve3Var = (r45.ve3) oVar.f152243a.f152217a;
        byte[] bArr = this.f550902p;
        if (bArr != null) {
            ve3Var.f469687d = x51.j1.a(bArr);
        } else {
            ve3Var.f469687d = new r45.cu5();
        }
        byte[] bArr2 = this.f550898i;
        if (bArr2 != null) {
            ve3Var.f469691h = x51.j1.a(bArr2);
        } else {
            ve3Var.f469691h = new r45.cu5();
        }
        r45.cu5 cu5Var = ve3Var.f469687d;
        if (cu5Var != null) {
            cu5Var.m161592x9616526c();
        }
        int i17 = this.f550895f;
        ve3Var.f469688e = i17;
        ve3Var.f469689f = this.f550896g;
        ve3Var.f469692i = this.f550899m;
        if (i17 == 7) {
            ve3Var.f469690g = this.f550897h;
        }
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 411;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (this.f550895f == 8) {
            if (i18 == 0 && i19 == 0) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_DOWNLOAD_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } else {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_DOWNLOAD_LONG, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - 86400000) + 3600000));
            }
        }
        if (this.f550895f == 11) {
            if (i18 == 0 && i19 == 0) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_RECOMMEND_LAST_UPDATE_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } else {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_RECOMMEND_LAST_UPDATE_TIME_LONG, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - 28800000) + 600000));
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().e().J0(this.f550895f, J());
        }
        if (i18 != 0 && i18 != 4) {
            this.f550894e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) v0Var;
        r45.cu5 cu5Var = ((r45.we3) oVar.f152244b.f152233a).f470617d;
        if (cu5Var != null) {
            this.f550902p = x51.j1.d(cu5Var);
        }
        if (this.f550895f == 8) {
            if (i19 == 0) {
                H();
                ((ku5.t0) ku5.t0.f394148d).g(new z12.s(this));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_DOWNLOAD_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } else if (i19 == 2) {
                H();
                ((r45.ve3) oVar.f152243a.f152217a).f469687d = ((r45.we3) oVar.f152244b.f152233a).f470617d;
                mo807x6c193ac1(m47995xb7ba1aa7(), this.f550894e);
            } else if (i19 == 3) {
                java.util.ArrayList arrayList = this.f550901o;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ((r45.ve3) oVar.f152243a.f152217a).f469687d = new r45.cu5();
                mo807x6c193ac1(m47995xb7ba1aa7(), this.f550894e);
            }
        }
        int i27 = this.f550895f;
        if (i27 == 1 || i27 == 9) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a();
            java.lang.String str2 = J().f470631u;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(a17.f179119b, str2)) {
                a17.f179119b = str2;
                a17.b();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_EXPT_CONFIG_STRING, str2);
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5323x54b61078().e();
            }
        } else if (i27 == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a();
            java.lang.String str3 = J().f470631u;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(a18.f179118a, str3)) {
                a18.f179118a = str3;
                a18.b();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_EXPT_MAIN_TAB_CONFIG_STRING, str3);
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5323x54b61078().e();
            }
        }
        this.f550894e.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 100;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    public t(int i17, byte[] bArr, int i18, boolean z17) {
        this.f550898i = null;
        this.f550899m = null;
        this.f550900n = false;
        this.f550901o = new java.util.ArrayList();
        this.f550902p = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ve3();
        lVar.f152198b = new r45.we3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getemotionlist";
        lVar.f152200d = 411;
        lVar.f152201e = 210;
        lVar.f152202f = 1000000210;
        this.f550893d = lVar.a();
        this.f550902p = bArr;
        this.f550898i = null;
        this.f550895f = i17;
        this.f550896g = i18;
        this.f550900n = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneGetEmotionList", "NetSceneGetEmotionList: %s, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
    }
}

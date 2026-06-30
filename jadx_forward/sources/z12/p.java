package z12;

/* loaded from: classes11.dex */
public class p extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550877d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550878e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f550879f;

    /* renamed from: g, reason: collision with root package name */
    public final a22.d f550880g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f550881h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5870x9faf102d f550882i;

    public p(java.lang.String str) {
        this.f550879f = "";
        this.f550881h = false;
        this.f550882i = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pe3();
        lVar.f152198b = new r45.qe3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getemotiondesc";
        lVar.f152200d = 521;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f550877d = lVar.a();
        this.f550879f = str;
        this.f550882i = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5870x9faf102d();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        java.lang.String str = this.f550879f;
        this.f550878e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550877d;
        ((r45.pe3) oVar.f152243a.f152217a).f464514d = str;
        if (!android.text.TextUtils.isEmpty(str)) {
            return mo9409x10f9447a(sVar, oVar, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.NetSceneGetEmotionDesc", "get emoji desc faild. product id is null.");
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 521;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        boolean z17 = this.f550881h;
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550877d;
            if (!z17) {
                java.util.LinkedList linkedList = ((r45.qe3) oVar.f152244b.f152233a).f465419e;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                z85.k a17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().a();
                java.lang.String str2 = this.f550879f;
                int i27 = ((r45.qe3) oVar.f152244b.f152233a).f465420f;
                int i28 = ((r45.qe3) oVar.f152244b.f152233a).f465422h;
                android.content.SharedPreferences sharedPreferences = a17.f552339e;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong("274544" + str2, java.lang.System.currentTimeMillis()).commit();
                }
                if (linkedList != null && linkedList.size() > 0) {
                    l75.k0 k0Var = a17.f552338d;
                    long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())) : -1L;
                    k0Var.mo70514xb06685ab("EmojiInfoDesc", "groupId=?", new java.lang.String[]{str2});
                    z85.j jVar = new z85.j();
                    jVar.f68949x861009b5 = str2;
                    jVar.f68946x8ad25c28 = i27;
                    jVar.f68948x7b2a3a3e = i28;
                    java.util.Iterator it = linkedList.iterator();
                    loop0: while (true) {
                        if (!it.hasNext()) {
                            k0Var.m("EmojiInfoDesc", "md5_lang", jVar.mo9763xeb27878e());
                            k0Var.w(java.lang.Long.valueOf(F));
                            break;
                        }
                        r45.oj0 oj0Var = (r45.oj0) it.next();
                        jVar.f68951x4b6e68b9 = oj0Var.f463831d;
                        java.util.Iterator it6 = oj0Var.f463833f.iterator();
                        while (it6.hasNext()) {
                            r45.j54 j54Var = (r45.j54) it6.next();
                            jVar.f68947x225aa2b6 = j54Var.f459128e;
                            jVar.f68950x225e3613 = j54Var.f459127d;
                            jVar.f68952x62706db4 = jVar.f68951x4b6e68b9 + jVar.f68950x225e3613;
                            if (k0Var.m("EmojiInfoDesc", "md5_lang", jVar.mo9763xeb27878e()) < 0) {
                                k0Var.w(java.lang.Long.valueOf(F));
                                break loop0;
                            }
                        }
                    }
                }
                if (linkedList != null && linkedList.size() > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "end getEmojiDesc, productId: %s ", this.f550879f);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5870x9faf102d c5870x9faf102d = this.f550882i;
                    c5870x9faf102d.f136178g.f88890a = this.f550879f;
                    c5870x9faf102d.e();
                }
            } else if ((((r45.qe3) oVar.f152244b.f152233a).f465422h & 1) == 1) {
                a22.e.b(this.f550880g);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "new emotion is can't download. ignore");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "end getEmojiDesc, & errType:%d, errCode:%d, productId: %s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), this.f550879f);
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "new emotion get des failed. ignore");
            }
        }
        this.f550878e.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 50;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    public p(java.lang.String str, a22.d dVar) {
        this.f550879f = "";
        this.f550881h = false;
        this.f550882i = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pe3();
        lVar.f152198b = new r45.qe3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getemotiondesc";
        lVar.f152200d = 521;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f550877d = lVar.a();
        this.f550879f = str;
        this.f550880g = dVar;
        this.f550881h = true;
        this.f550882i = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5870x9faf102d();
    }
}

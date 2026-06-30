package wt1;

/* loaded from: classes15.dex */
public class i implements com.p314xaae8f345.mm.p944x882e457a.u0, wt1.e0, tt1.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f530820d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f530821e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f530822f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f530823g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f530824h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public tt1.j f530825i = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f530826m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f530827n;

    @Override // wt1.e0
    public void L1(xt1.k kVar) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "onChange()");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "card msg card id is " + kVar.f68121x95970a65);
        if (this.f530825i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumedMgr", "onChange(), do nothing, mCardInfo == null");
            a();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "card msg card id is " + kVar.f68121x95970a65);
        if (this.f530825i.B() && (str2 = kVar.f68121x95970a65) != null && str2.equals(this.f530825i.g()) && kVar.H1 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "it is card type, don't do NetSceneGetShareCardConsumedInfo! finish UI");
            a();
            return;
        }
        if (!this.f530825i.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "it is not card type, don't update share card data!");
            a();
            return;
        }
        if (kVar.H1 == 3 || !((str = kVar.f68121x95970a65) == null || !str.equals(this.f530825i.g()) || android.text.TextUtils.isEmpty(kVar.f68124x6170a301))) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "consumed share card msg,  update share card data!");
            java.lang.String str3 = kVar.f68121x95970a65;
            if (str3 != null && str3.equals(this.f530825i.g())) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd y07 = xt1.t0.nj().y0(this.f530825i.g());
                if (y07 != null && y07.i0() != null) {
                    int i17 = this.f530825i.i0().f466714d;
                    int i18 = y07.i0().f466714d;
                    int i19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd) this.f530825i).f66687x10a0fed7;
                    if (y07.i0().f466714d != i17) {
                        c();
                    } else if (i17 != 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "share card oldState status is " + i17);
                        r45.rt i07 = this.f530825i.i0();
                        i07.f466714d = 1;
                        tt1.j jVar = this.f530825i;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd) jVar).f66687x10a0fed7 = 1;
                        jVar.G(i07);
                        lu1.a0.M(this.f530825i);
                    }
                }
            } else if (kVar.f68121x95970a65 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd y08 = xt1.t0.nj().y0(kVar.f68121x95970a65);
                if (y08 == null || y08.i0() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CardConsumedMgr", "tempCard is null");
                } else {
                    int i27 = y08.i0().f466714d;
                    if (y08.i0().f466714d != 1) {
                        r45.rt i08 = y08.i0();
                        i08.f466714d = 1;
                        y08.f66687x10a0fed7 = 1;
                        y08.G(i08);
                        lu1.a0.M(y08);
                    }
                }
            }
            b(this.f530825i);
            java.util.HashMap hashMap = this.f530823g;
            java.lang.Boolean bool = (java.lang.Boolean) hashMap.get(this.f530825i.g());
            if (bool == null || !bool.booleanValue()) {
                android.content.Context context = (android.content.Context) this.f530820d.get();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "consume share card, card id is " + this.f530825i.g());
                eu1.f.p(context, this.f530825i);
                hashMap.put(this.f530825i.g(), java.lang.Boolean.TRUE);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c344.m40330x4c144dd(281);
                c4582x424c344.m40331x936762bd(30);
                c4582x424c344.m40332x57b2b64f(1L);
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3442.m40330x4c144dd(281);
                c4582x424c3442.m40331x936762bd(31);
                c4582x424c3442.m40332x57b2b64f((int) (currentTimeMillis2 - currentTimeMillis));
                arrayList.add(c4582x424c344);
                arrayList.add(c4582x424c3442);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "consumed:" + bool.booleanValue());
            }
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    @Override // tt1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W0() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wt1.i.W0():void");
    }

    public final void a() {
        wt1.h hVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "doFinishUI()");
        if (this.f530821e == null) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f530821e).size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f530821e).get(i17);
            if (weakReference != null && (hVar = (wt1.h) weakReference.get()) != null) {
                hVar.x4();
            }
        }
    }

    public final void b(tt1.j jVar) {
        wt1.h hVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "doUpdateCardInfo()");
        if (this.f530821e == null) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f530821e).size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f530821e).get(i17);
            if (weakReference != null && (hVar = (wt1.h) weakReference.get()) != null) {
                hVar.y2(jVar);
            }
        }
    }

    public final void c() {
        wt1.h hVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "doVibrate()");
        if (this.f530821e == null) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f530821e).size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f530821e).get(i17);
            if (weakReference != null && (hVar = (wt1.h) weakReference.get()) != null) {
                hVar.x3();
            }
        }
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "needDoConsumedInfo(), need to do NetSceneGetShareCardConsumedInfo. ");
        synchronized (this) {
            if (this.f530826m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "isDoingConsumedInfo is true, is doing NetSceneGetShareCardConsumedInfo. return");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "isDoingConsumedInfo is false, do NetSceneGetShareCardConsumedInfo. ");
            this.f530826m = true;
            gm0.j1.n().f354821b.g(new fu1.c(this.f530825i.g(), 20, "", ""));
        }
    }

    public void e(wt1.h hVar, boolean z17) {
        if (this.f530822f == null) {
            this.f530822f = new java.util.HashMap();
        }
        this.f530822f.put(hVar, java.lang.Boolean.valueOf(z17));
    }

    public void f(wt1.h hVar) {
        wt1.h hVar2;
        if (this.f530821e == null || hVar == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f530821e.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f530821e.get(i17);
            if (weakReference != null && (hVar2 = (wt1.h) weakReference.get()) != null && hVar2.equals(hVar)) {
                this.f530821e.remove(weakReference);
                return;
            }
        }
    }

    @Override // wt1.e0
    /* renamed from: onChange */
    public void mo54452x3dcbea6f() {
        c();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "onSceneEnd, errType = " + i17 + " errCode = " + i18);
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof fu1.c) {
                this.f530826m = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumedMgr", "do NetSceneGetShareCardConsumedInfo failed! finish UI!");
                a();
                return;
            }
            return;
        }
        if (m1Var instanceof fu1.c) {
            fu1.c cVar = (fu1.c) m1Var;
            if (android.text.TextUtils.isEmpty(cVar.f348356f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumedMgr", "consumed return json is empty!");
            } else {
                java.lang.String str2 = cVar.f348356f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "startConsumedSuccUI()");
                if (this.f530821e != null) {
                    boolean z17 = false;
                    for (int i19 = 0; i19 < ((java.util.ArrayList) this.f530821e).size(); i19++) {
                        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f530821e).get(i19);
                        if (weakReference != null) {
                            wt1.h hVar = (wt1.h) weakReference.get();
                            java.lang.Boolean bool = (java.lang.Boolean) this.f530822f.get(hVar);
                            if (hVar != null && bool != null && bool.booleanValue()) {
                                hVar.t5(str2);
                                z17 = true;
                            }
                        }
                    }
                    java.lang.Boolean bool2 = (java.lang.Boolean) this.f530823g.get(this.f530825i.g());
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "onStartConsumedSuccUI is handled!");
                        this.f530827n = "";
                    } else if (bool2 != null && bool2.booleanValue()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumedMgr", "add to launch pending list!");
                        this.f530827n = str2;
                        this.f530824h.put(this.f530825i.g(), java.lang.Boolean.TRUE);
                    }
                }
            }
            this.f530826m = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumedMgr", "do NetSceneGetShareCardConsumedInfo ok! finish UI!");
            a();
        }
    }
}

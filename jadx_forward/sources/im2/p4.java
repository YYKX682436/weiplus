package im2;

/* loaded from: classes2.dex */
public final class p4 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p944x882e457a.u0, zy2.m8 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f374020d;

    /* renamed from: e, reason: collision with root package name */
    public final int f374021e;

    /* renamed from: f, reason: collision with root package name */
    public final int f374022f;

    /* renamed from: g, reason: collision with root package name */
    public final int f374023g;

    /* renamed from: h, reason: collision with root package name */
    public final int f374024h;

    /* renamed from: i, reason: collision with root package name */
    public r45.lk2 f374025i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f374026m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.r f374027n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f374028o;

    /* renamed from: p, reason: collision with root package name */
    public zy2.l8 f374029p;

    /* renamed from: q, reason: collision with root package name */
    public final yl2.g1 f374030q;

    /* renamed from: r, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.f1 f374031r;

    /* renamed from: s, reason: collision with root package name */
    public android.content.Intent f374032s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f374020d = "FinderLivePostUIC";
        this.f374021e = 10001;
        this.f374022f = 10002;
        this.f374023g = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6;
        this.f374024h = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261;
        this.f374026m = "";
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        this.f374030q = new yl2.g1((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) m158354x19263085, 0, 0L, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void O6(im2.p4 r38, int r39, int r40, yl2.k r41) {
        /*
            Method dump skipped, instructions count: 1105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.p4.O6(im2.p4, int, int, yl2.k):void");
    }

    public static final void P6(im2.p4 p4Var) {
        p3325xe03a0797.p3326xc267989b.f1 f1Var = p4Var.f374031r;
        if (f1Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(f1Var, null, 1, null);
        }
        p4Var.f374031r = p3325xe03a0797.p3326xc267989b.l.b(p4Var.m158345xefc66565(), null, null, new im2.o4(p4Var, null), 3, null);
    }

    public final boolean Q6(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_router_to_profile", false);
        intent.putExtra("key_create_scene", 3);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).qj(m80379x76847179(), m158359x1e885992());
        return false;
    }

    public void R6(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374020d, "FinderLive.entrance,live btn click ignoreSheet=true");
        this.f374032s = intent;
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(m158354x19263085())) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(m158354x19263085());
            u1Var.g(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dls));
            u1Var.n(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            u1Var.l(im2.n4.f373989a);
            u1Var.q(false);
            return;
        }
        if (Q6(xy2.c.e(m80379x76847179()))) {
            m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
            if (I1 != null && I1.v0()) {
                zl2.q4.f555466a.Q();
            } else {
                pf5.e.m158344xbe96bc24(this, null, null, new im2.m4(this, intent != null ? intent.getIntExtra("POST_BTN_CLICK_SCENE_KEY", 0) : 0, null), 3, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S6(r45.lk2 r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L47
            r1 = 20
            java.util.LinkedList r1 = r6.m75941xfb821914(r1)
            if (r1 == 0) goto L47
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            r3 = r2
            r45.ac5 r3 = (r45.ac5) r3
            r4 = 1
            com.tencent.mm.protobuf.f r3 = r3.m75936x14adae67(r4)
            com.tencent.mm.protocal.protobuf.FinderContact r3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) r3
            if (r3 == 0) goto L2a
            java.lang.String r3 = r3.m76197x6c03c64c()
            goto L2b
        L2a:
            r3 = r0
        L2b:
            android.app.Activity r4 = r5.m80379x76847179()
            java.lang.String r4 = xy2.c.e(r4)
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r4)
            if (r3 == 0) goto Lf
            goto L3b
        L3a:
            r2 = r0
        L3b:
            r45.ac5 r2 = (r45.ac5) r2
            if (r2 == 0) goto L47
            r1 = 5
            com.tencent.mm.protobuf.f r1 = r2.m75936x14adae67(r1)
            r45.c33 r1 = (r45.c33) r1
            goto L48
        L47:
            r1 = r0
        L48:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "setPrepareResp wxaShopInfo appId:"
            r2.<init>(r3)
            if (r1 == 0) goto L56
            r0 = 0
            java.lang.String r0 = r1.m75945x2fec8307(r0)
        L56:
            r2.append(r0)
            r0 = 44
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = r5.f374020d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r5.f374025i = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.p4.S6(r45.lk2):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        gm0.j1.d().a(6653, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374020d, "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        yz5.r rVar = this.f374027n;
        if (rVar != null) {
            rVar.C(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var instanceof db2.f5 ? (db2.f5) m1Var : null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        gm0.j1.d().q(6653, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f374020d = "FinderLivePostUIC";
        this.f374021e = 10001;
        this.f374022f = 10002;
        this.f374023g = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6;
        this.f374024h = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261;
        this.f374026m = "";
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        this.f374030q = new yl2.g1((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) m158354x19263085, 0, 0L, 6, null);
    }
}

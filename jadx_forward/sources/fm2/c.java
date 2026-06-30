package fm2;

/* loaded from: classes3.dex */
public abstract class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 {

    /* renamed from: liveCore */
    private co0.s f69786x54787eab;

    /* renamed from: liveEndUIC */
    private um2.g f69787x1ba88980;

    /* renamed from: livePrepareUIC */
    private um2.b6 f69788x91649fd4;

    /* renamed from: livingUIC */
    private um2.x5 f69789x43c498e6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.util.AttributeSet attributeSet) {
        super(context, componentCallbacksC1101xa17d4670, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.f69788x91649fd4 = new um2.b6(abstractActivityC21394xb3d2c0cf);
        this.f69789x43c498e6 = new um2.x5(abstractActivityC21394xb3d2c0cf);
        this.f69787x1ba88980 = new um2.g(abstractActivityC21394xb3d2c0cf);
    }

    /* renamed from: getLiveCore */
    public final co0.s m129740xd052bc21() {
        return co0.b.f125242e2.c(m57663xfb7e5820().f390662d.f150070e);
    }

    /* renamed from: getLiveEndUIC */
    public final um2.g m129741x9e94176() {
        return this.f69787x1ba88980;
    }

    /* renamed from: getLivePrepareUIC */
    public final um2.b6 m129742x7ffc6cca() {
        return this.f69788x91649fd4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a, qo0.c
    /* renamed from: getLiveRole */
    public abstract /* synthetic */ int mo11219xd0598cf8();

    /* renamed from: getLivingUIC */
    public final um2.x5 m129743x43320a30() {
        return this.f69789x43c498e6;
    }

    /* renamed from: getPrepareUIC */
    public final um2.b6 m129744xa16801be() {
        return this.f69788x91649fd4;
    }

    /* renamed from: getStartUIC */
    public final um2.x5 m129745xca56ce03() {
        return this.f69789x43c498e6;
    }

    /* renamed from: prepareToStart */
    public void m129746xe466bfa0(boolean z17) {
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e;
        hm2.a aVar;
        hn0.r rVar;
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        co0.s E;
        kn0.p pVar;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p833x36756d.C10844x4ce18327 renderRatioLayout;
        dk2.xf h17;
        um2.x5 x5Var = this.f69789x43c498e6;
        if (x5Var != null) {
            kz2.b bVar = kz2.b.f395391a;
            java.lang.String str = x5Var.f510565f;
            bVar.d(str, "startLive " + z17);
            boolean z18 = false;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = x5Var.f101138b;
            if (z17) {
                if (zl2.q4.f555466a.g() && (h17 = x5Var.h()) != null) {
                    ((dk2.r4) h17).q(null);
                }
                fm2.c cVar = x5Var.f101139c;
                if (cVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57627xbbf42674(cVar, false, 1, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10 f10Var = x5Var.f510610u;
                if (f10Var != null) {
                    f10Var.u1("");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.be beVar = x5Var.f510613v;
                if (beVar != null) {
                    beVar.t1();
                }
                um2.x5.A(x5Var, true, false, false, 6, null);
                if (((mm2.c1) x5Var.c(mm2.c1.class)).a8()) {
                    um2.x5.p(x5Var, null, false, 3, null);
                }
                mm2.f6 f6Var = (mm2.f6) x5Var.c(mm2.f6.class);
                so2.j5 j5Var = ((mm2.f6) x5Var.f101142a.a(mm2.f6.class)).f410582w;
                c61.bc bcVar = j5Var instanceof c61.bc ? (c61.bc) j5Var : null;
                f6Var.f410583x = bcVar != null ? bcVar.c() : 0L;
                fm2.c cVar2 = x5Var.f101139c;
                if (cVar2 != null) {
                    zl2.r4.f555483a.E2(x5Var.f101142a, cVar2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0 dk0Var = x5Var.f510574i;
                if (dk0Var != null && (renderRatioLayout = dk0Var.f193832p.getRenderRatioLayout()) != null) {
                    renderRatioLayout.post(new um2.i2(x5Var));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar = x5Var.P0;
                if (naVar != null) {
                    naVar.C1();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0 le0Var = x5Var.Y;
                if (le0Var != null) {
                    le0Var.x1(((mm2.c1) x5Var.c(mm2.c1.class)).L9(), false);
                }
                fm2.c cVar3 = x5Var.f101139c;
                if (cVar3 != null) {
                    qo0.c.a(cVar3, qo0.b.C, null, 2, null);
                }
                um2.m.f510406a.b(x5Var);
                pm0.v.V(200L, new um2.j2(x5Var));
                ((we2.w) x5Var.c(we2.w.class)).N6();
                pm0.v.X(new um2.u4(x5Var, false));
                co0.s E2 = x5Var.E();
                if ((E2 != null && E2.X()) && (E = x5Var.E()) != null) {
                    zl2.r4 r4Var = zl2.r4.f555483a;
                    co0.s E3 = x5Var.E();
                    E.R0(E3 != null && (pVar = E3.D) != null && pVar.f391122i ? 5 : 2);
                }
                android.content.Intent intent = activity.getIntent();
                if (intent != null && intent.getBooleanExtra("intent_key_ignore_back", false)) {
                    z18 = true;
                }
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "remove INTENT_KEY_IGNORE_BACK");
                    intent.removeExtra("intent_key_ignore_back");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "joinLiveByMiniWin audienceMode:" + ((mm2.c1) x5Var.c(mm2.c1.class)).P6());
                x5Var.W(true);
                fm2.c cVar4 = x5Var.f101139c;
                if (cVar4 == null || (m57663xfb7e5820 = cVar4.m57663xfb7e5820()) == null || (c14197x319b1b9e = m57663xfb7e5820.f390664f) == null) {
                    return;
                }
                if2.z.f372686a.i(c14197x319b1b9e, new if2.w(c14197x319b1b9e));
                return;
            }
            int d17 = com.p314xaae8f345.mm.ui.bl.d(activity);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setNavigationBarVisibilityReportFlag navigationBarHeight:" + d17 + " navigationBarHeight=" + d17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a(activity).c(zy2.ra.class))).P6("system_navigat_height", java.lang.String.valueOf(d17));
            java.lang.String str2 = "joinLive " + ((mm2.e1) x5Var.c(mm2.e1.class)).X6() + ",liveMode:" + ((mm2.c1) x5Var.c(mm2.c1.class)).f410334f2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2);
            bVar.d(str, str2);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_LIVE_MMKV");
            java.lang.Long valueOf = M != null ? java.lang.Long.valueOf(M.getLong("VISITOR_GIFT_EFFECT_OFF_LIVE_ID", 0L)) : null;
            long m75942xfb822ef2 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            ((mm2.c1) x5Var.c(mm2.c1.class)).f410427u5 = (m75942xfb822ef2 == 0 || valueOf == null || m75942xfb822ef2 != valueOf.longValue()) ? false : true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initGiftEffectEnable giftEffectOffLiveId:" + valueOf + " curLiveId:" + m75942xfb822ef2);
            co0.s E4 = x5Var.E();
            if ((E4 == null || (rVar = E4.R1) == null) ? false : rVar.h()) {
                boolean z19 = ((mm2.w) x5Var.c(mm2.w.class)).O6() || (j65.e.b() && j65.e.g());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = x5Var.f510571h;
                if (ob0Var != null) {
                    ob0Var.E1(z19);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a, "RV_VISITOR_" + ((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184093f.f184073b, null, false, false, ((mm2.c1) x5Var.c(mm2.c1.class)).f410315b4, 28, null);
            dk2.u7.f315714a.i();
            dk2.tf tfVar = dk2.tf.f315666a;
            java.lang.String anchorUserName = ((mm2.c1) x5Var.c(mm2.c1.class)).f410385o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserName, "anchorUserName");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(anchorUserName)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLive.FinderLiveWatchTimeMgr", "joinLive anchorUserName nil");
            } else {
                ((java.util.Map) ((jz5.n) dk2.tf.f315667b).mo141623x754a37bb()).put(anchorUserName, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
            }
            te2.c4.f499452n.a(((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            java.lang.String str3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a(activity).c(zy2.ra.class))).f216921t;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a(activity).c(zy2.ra.class))).f216920s;
            if (str4 == null) {
                str4 = "";
            }
            r0Var.getClass();
            if (r26.n0.B(str3, ",", false)) {
                str3 = r26.i0.t(str3, ",", ";", false);
            }
            r0Var.M = str3;
            r0Var.f409415u = str4;
            long longExtra = activity.getIntent().getLongExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID", 0L);
            activity.getIntent().removeExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID");
            if (!activity.getIntent().hasExtra("key_ad_flag")) {
                mm2.e1 e1Var = (mm2.e1) x5Var.c(mm2.e1.class);
                km2.m mVar = x5Var.f101140d;
                e1Var.f410515i = (mVar == null || (c10828x8f239b6e = mVar.f390662d) == null) ? 0 : java.lang.Integer.valueOf(c10828x8f239b6e.X);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAdFlag from staticConfig:");
                java.lang.Integer num = ((mm2.e1) x5Var.c(mm2.e1.class)).f410515i;
                sb6.append(num != null ? num.intValue() : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            } else if (((mm2.e1) x5Var.c(mm2.e1.class)).f410515i == null) {
                ((mm2.e1) x5Var.c(mm2.e1.class)).f410515i = java.lang.Integer.valueOf(activity.getIntent().getIntExtra("key_ad_flag", 0));
                activity.getIntent().removeExtra("key_ad_flag");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setAdFlag from intent:");
                java.lang.Integer num2 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410515i;
                sb7.append(num2 != null ? num2.intValue() : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
            }
            if (longExtra != 0) {
                ((mm2.e1) x5Var.c(mm2.e1.class)).f410514h = longExtra;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "get fromObjectId:".concat(pm0.v.u(longExtra)));
            }
            java.lang.String stringExtra = activity.getIntent().getStringExtra("KEY_ENTER_LIVE_QRCODE_URL");
            if (stringExtra == null) {
                stringExtra = "";
            }
            ((mm2.c1) x5Var.c(mm2.c1.class)).M8(stringExtra);
            activity.getIntent().putExtra("KEY_ENTER_LIVE_QRCODE_URL", "");
            com.p314xaae8f345.mm.p2495xc50a8b8b.g Mj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Mj();
            dk2.xf j17 = dk2.ef.f314905a.j(x5Var.f101139c);
            if (j17 != null) {
                ((dk2.r4) j17).E(x5Var.f101138b, ((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0), 2, Mj, new um2.s(new java.lang.ref.SoftReference(x5Var), str));
            }
            fm2.c cVar5 = x5Var.f101139c;
            if (cVar5 == null || (aVar = (hm2.a) cVar5.m57635xbba4bfc0(hm2.a.class)) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveReportSlice", "markJoinStatusWaitResp");
            aVar.f363753f = 1;
        }
    }

    /* renamed from: setLiveCore */
    public final void m129747xcb0b1d2d(co0.s sVar) {
        this.f69786x54787eab = sVar;
    }

    /* renamed from: setLiveEndUIC */
    public final void m129748x380d8f82(um2.g gVar) {
        this.f69787x1ba88980 = gVar;
    }

    /* renamed from: setLivePrepareUIC */
    public final void m129749x47f2d4d6(um2.b6 b6Var) {
        this.f69788x91649fd4 = b6Var;
    }

    /* renamed from: setLivingUIC */
    public final void m129750x9f85caa4(um2.x5 x5Var) {
        this.f69789x43c498e6 = x5Var;
    }

    /* renamed from: startToEnd */
    public void m129751xa19de51e() {
    }
}

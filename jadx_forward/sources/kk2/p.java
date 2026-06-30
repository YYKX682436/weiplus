package kk2;

/* loaded from: classes3.dex */
public final class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: t, reason: collision with root package name */
    public static final kk2.e f390038t = new kk2.e(null);

    /* renamed from: h, reason: collision with root package name */
    public final jk2.a f390039h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.zd2 f390040i;

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f390041m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.p1519x5e23afc.p1520x6580a04.C14256x5ebdf472 f390042n;

    /* renamed from: o, reason: collision with root package name */
    public fg2.s1 f390043o;

    /* renamed from: p, reason: collision with root package name */
    public r45.es2 f390044p;

    /* renamed from: q, reason: collision with root package name */
    public long f390045q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f390046r;

    /* renamed from: s, reason: collision with root package name */
    public r45.fa2 f390047s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.tencent.mm.plugin.finder.live.model.guide.panel.LiveSquareGuidePanel$lifeObserver$1] */
    public p(jk2.a plugin, r45.zd2 guideData) {
        super(((df2.wv) plugin).f313256a.O6(), false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(guideData, "guideData");
        this.f390039h = plugin;
        this.f390040i = guideData;
        ae2.in.f85221a.r0();
        this.f390042n = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.live.model.guide.panel.LiveSquareGuidePanel$lifeObserver$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
            /* renamed from: onPause */
            public final void m56880xb01dfb57() {
                c50.m0 y17 = kk2.p.this.y();
                if (y17 != null) {
                    c50.m0.b(y17, null, 1, null);
                }
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
            /* renamed from: onResume */
            public final void m56881x57429eec() {
                kk2.p.this.B();
            }
        };
        this.f390046r = jz5.h.b(new kk2.l(this));
        fg2.s1 s1Var = this.f390043o;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 headerText = s1Var.f343831d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(headerText, "headerText");
        com.p314xaae8f345.mm.ui.fk.a(headerText);
        fg2.s1 s1Var2 = this.f390043o;
        if (s1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        s1Var2.f343833f.setOnClickListener(this);
        fg2.s1 s1Var3 = this.f390043o;
        if (s1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        s1Var3.f343832e.setOnClickListener(this);
        fg2.s1 s1Var4 = this.f390043o;
        if (s1Var4 != null) {
            s1Var4.f343830c.setOnClickListener(this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public void A(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadSquareData container: ");
        sb6.append(this.f390047s);
        sb6.append(" isShowing: ");
        sb6.append(q());
        sb6.append(" active: ");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f390041m;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSquareGuidePanel", sb6.toString());
        if (z()) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f390041m;
        boolean z18 = false;
        if (r2Var2 != null && r2Var2.a()) {
            z18 = true;
        }
        if (z18) {
            return;
        }
        if (q()) {
            pm0.v.X(new kk2.f(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = ((df2.wv) this.f390039h).f313256a.f372632e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) ubVar : null;
        yg2.b m57691xa0fa63f9 = c14353xe7c1f419 != null ? c14353xe7c1f419.m57691xa0fa63f9() : null;
        this.f390041m = m57691xa0fa63f9 != null ? p3325xe03a0797.p3326xc267989b.l.d(m57691xa0fa63f9, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new kk2.i(this, z17, null), 2, null) : null;
    }

    public final void B() {
        if (q()) {
            fg2.s1 s1Var = this.f390043o;
            if (s1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            s1Var.f343829b.post(new kk2.k(this));
        }
    }

    public final void C() {
        c50.m0 y17 = y();
        if (y17 != null) {
            c50.m0.b(y17, null, 1, null);
        }
        ((gp2.l0) y()).o();
    }

    public final void D(r45.fa2 fa2Var) {
        fg2.s1 s1Var = this.f390043o;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        s1Var.f343837j.setVisibility(4);
        fg2.s1 s1Var2 = this.f390043o;
        if (s1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        s1Var2.f343829b.setVisibility(0);
        fg2.s1 s1Var3 = this.f390043o;
        if (s1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        df2.wv wvVar = (df2.wv) this.f390039h;
        s1Var3.f343834g.m57229x46b194e1(wvVar.c());
        fg2.s1 s1Var4 = this.f390043o;
        if (s1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        s1Var4.f343836i.m57229x46b194e1(wvVar.c());
        fg2.s1 s1Var5 = this.f390043o;
        if (s1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        s1Var5.f343835h.m57229x46b194e1(wvVar.c());
        if (fa2Var.f455662h.size() > 0) {
            fg2.s1 s1Var6 = this.f390043o;
            if (s1Var6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            s1Var6.f343834g.post(new kk2.m(this, fa2Var));
        } else {
            fg2.s1 s1Var7 = this.f390043o;
            if (s1Var7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            s1Var7.f343834g.setVisibility(8);
        }
        java.util.LinkedList linkedList = fa2Var.f455662h;
        if (linkedList.size() > 1) {
            fg2.s1 s1Var8 = this.f390043o;
            if (s1Var8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            s1Var8.f343836i.setVisibility(0);
            fg2.s1 s1Var9 = this.f390043o;
            if (s1Var9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            s1Var9.f343836i.post(new kk2.n(this, fa2Var));
        } else {
            fg2.s1 s1Var10 = this.f390043o;
            if (s1Var10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            s1Var10.f343836i.setVisibility(8);
        }
        if (linkedList.size() > 2) {
            fg2.s1 s1Var11 = this.f390043o;
            if (s1Var11 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            s1Var11.f343835h.setVisibility(0);
            fg2.s1 s1Var12 = this.f390043o;
            if (s1Var12 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            s1Var12.f343835h.post(new kk2.o(this, fa2Var));
        } else {
            fg2.s1 s1Var13 = this.f390043o;
            if (s1Var13 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            s1Var13.f343835h.setVisibility(8);
        }
        this.f390047s = fa2Var;
        ((gp2.l0) y()).e(null);
        B();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadSquare flag: ");
        r45.zd2 zd2Var = this.f390040i;
        sb6.append(zd2Var.m75933x41a8a7f2(4));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSquareGuidePanel", sb6.toString());
        if (zd2Var.m75933x41a8a7f2(4)) {
            ys5.f fVar = (ys5.f) i95.n0.c(ys5.f.class);
            ys5.e eVar = ys5.e.f546793h;
            r45.es2 es2Var = this.f390044p;
            ((sq2.g) fVar).wi(eVar, 0.0f, new ws5.h("closeGuidePreload", 135, "", es2Var != null ? es2Var.m75934xbce7f2f(3) : null, null));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View b() {
        return h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dow;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/guide/panel/LiveSquareGuidePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.s1 s1Var = this.f390043o;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = s1Var.f343832e.getId();
        kk2.e eVar = f390038t;
        jk2.a aVar = this.f390039h;
        if (valueOf != null && valueOf.intValue() == id6) {
            eVar.a(2);
            ((df2.wv) aVar).a();
            java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(26, 2, 313);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSquareGuidePanel", "#gotoMoreLiveImpl contextId:" + Gj);
            uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
            android.content.Intent intent = new android.content.Intent();
            r45.es2 es2Var = this.f390044p;
            if (es2Var != null && (m75934xbce7f2f = es2Var.m75934xbce7f2f(3)) != null) {
                intent.putExtra("nearby_live_target_last_buffer_params_key", m75934xbce7f2f.f273689a);
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(Gj);
            intent.putExtra("key_context_id", Gj);
            ws5.j[] jVarArr = ws5.j.f530751d;
            intent.putExtra("nearby_live_enter_source_params_key", 2);
            intent.putExtra("nearby_live_forbid_enter_preload_params_key", true);
            intent.putExtra("nearby_live_disable_clean_red_params_key", true);
            intent.putExtra("nearby_live_preload_cache_business_params_key", "closeGuidePreload");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("ref_commenscene", 313);
            jSONObject.put("liveid", pm0.v.u(((mm2.e1) ((df2.wv) aVar).b().a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            intent.putExtra("NEARBY_LIVE_REPORT_REF_JSON_KEY", r26.i0.t(jSONObject2, ",", ";", false));
            ((v40.s) nVar).wi(this.f199914d, intent);
            C();
        } else {
            fg2.s1 s1Var2 = this.f390043o;
            if (s1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            int id7 = s1Var2.f343833f.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                eVar.a(3);
                a();
                ((df2.wv) aVar).a();
            } else {
                fg2.s1 s1Var3 = this.f390043o;
                if (s1Var3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                int id8 = s1Var3.f343830c.getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    eVar.a(4);
                    a();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("live_close_square_guide_forbid_tips", 1);
                    pm0.v.V(200L, new kk2.j(this));
                    ((df2.wv) aVar).a();
                    C();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/guide/panel/LiveSquareGuidePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.a4f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.a4f);
        if (c22699x3dcdb352 != null) {
            i17 = com.p314xaae8f345.mm.R.id.cgi;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.cgi);
            if (c22645x24069159 != null) {
                i17 = com.p314xaae8f345.mm.R.id.che;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.che);
                if (linearLayout != null) {
                    i17 = com.p314xaae8f345.mm.R.id.r_7;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.r_7);
                    if (textView != null) {
                        i17 = com.p314xaae8f345.mm.R.id.gz9;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a60 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.gz9);
                        if (c14296xe95b9a60 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.f566987ra1;
                            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566987ra1);
                            if (relativeLayout != null) {
                                i17 = com.p314xaae8f345.mm.R.id.ra6;
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.ra6);
                                if (c22661xa3a2b3c0 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.icl;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14366x19fff717 c14366x19fff717 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14366x19fff717) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.icl);
                                    if (c14366x19fff717 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.ifc;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14366x19fff717 c14366x19fff7172 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14366x19fff717) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.ifc);
                                        if (c14366x19fff7172 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.f567173ig2;
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14366x19fff717 c14366x19fff7173 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14366x19fff717) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f567173ig2);
                                            if (c14366x19fff7173 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.ihm;
                                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.ihm);
                                                if (linearLayout2 != null) {
                                                    i17 = com.p314xaae8f345.mm.R.id.imc;
                                                    android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.imc);
                                                    if (progressBar != null) {
                                                        this.f390043o = new fg2.s1((p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) rootView, c22699x3dcdb352, c22645x24069159, linearLayout, textView, c14296xe95b9a60, relativeLayout, c22661xa3a2b3c0, c14366x19fff717, c14366x19fff7172, c14366x19fff7173, linearLayout2, progressBar);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        super.t();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSquareGuidePanel", "onDismiss");
        C();
        android.content.Context context = this.f199914d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf == null || (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.c(this.f390042n);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        android.content.Context context = this.f199914d;
        jz5.f0 f0Var = null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null && (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf.mo273xed6858b4()) != null) {
            mo273xed6858b4.a(this.f390042n);
        }
        super.w();
        r45.fa2 fa2Var = this.f390047s;
        if (fa2Var != null) {
            D(fa2Var);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f390041m;
            if (!(r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a())) {
                A(false);
            }
        }
        f390038t.a(1);
    }

    public final c50.m0 y() {
        return (c50.m0) ((jz5.n) this.f390046r).mo141623x754a37bb();
    }

    public final boolean z() {
        long currentTimeMillis = (java.lang.System.currentTimeMillis() - this.f390045q) / 1000;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isCacheValid cacheTime: ");
        sb6.append(currentTimeMillis);
        sb6.append(" preload_interval_sec: ");
        r45.es2 es2Var = this.f390044p;
        sb6.append(es2Var != null ? java.lang.Integer.valueOf(es2Var.m75939xb282bd08(2)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSquareGuidePanel", sb6.toString());
        r45.es2 es2Var2 = this.f390044p;
        if (es2Var2 != null) {
            return currentTimeMillis <= ((long) (es2Var2 != null ? es2Var2.m75939xb282bd08(2) : 0));
        }
        return false;
    }
}

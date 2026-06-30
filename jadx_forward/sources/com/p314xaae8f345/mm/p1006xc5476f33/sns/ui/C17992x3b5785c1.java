package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.RangeWidget */
/* loaded from: classes4.dex */
public class C17992x3b5785c1 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17949x28e47a30 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f248131x = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f248132e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f248133f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18131x711b760 f248134g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f248135h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f248136i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f248137m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f248138n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f248139o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f248140p;

    /* renamed from: q, reason: collision with root package name */
    public int f248141q;

    /* renamed from: r, reason: collision with root package name */
    public wa4.x f248142r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f248143s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f248144t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f248145u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View.OnClickListener f248146v;

    /* renamed from: w, reason: collision with root package name */
    public int f248147w;

    public C17992x3b5785c1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f248141q = 0;
        this.f248142r = null;
        this.f248143s = "";
        this.f248144t = "";
        this.f248145u = "";
        this.f248146v = null;
        this.f248147w = 0;
        c(context);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17949x28e47a30
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18131x711b760 c18131x711b760) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initWidget", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        this.f248134g = c18131x711b760;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initWidget", "com.tencent.mm.plugin.sns.ui.RangeWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17949x28e47a30
    public boolean b(int i17, int i18, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17947x83d458f1 c17947x83d458f1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        this.f248141q = intent.getIntExtra("Ktag_range_index", 0);
        this.f248143s = intent.getStringExtra("Klabel_name_list");
        this.f248144t = intent.getStringExtra("Kother_user_name_list");
        this.f248145u = intent.getStringExtra("Kchat_room_name_list");
        int mo70683xec28675e = mo70683xec28675e();
        java.lang.String str = "";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f248145u)) {
            str = "" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(d(java.util.Arrays.asList(this.f248145u.split(","))), ",");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f248143s)) {
            if (str.length() > 0) {
                str = str + "," + this.f248143s;
            } else {
                str = str + this.f248143s;
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f248144t)) {
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(d(java.util.Arrays.asList(this.f248144t.split(","))), ",");
            if (str.length() > 0) {
                str = str + "," + c17;
            } else {
                str = str + c17;
            }
        }
        if (mo70683xec28675e != -1 && str != null && str.length() > mo70683xec28675e) {
            str = str.substring(0, mo70683xec28675e) + "...";
        }
        int i19 = this.f248141q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleRangeChoose", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        float textSize = this.f248137m.getTextSize();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f248135h;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f78394x96a3bec, com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
            this.f248136i.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
            this.f248137m.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18131x711b760 c18131x711b760 = this.f248134g;
        if (c18131x711b760 != null) {
            c18131x711b760.m70812x317629c3(false);
        }
        if (i19 == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f248135h;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.s(com.p314xaae8f345.mm.R.raw.f78393x368e0bdd, com.p314xaae8f345.mm.R.C30859x5a72f63.f560798ui);
                this.f248136i.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                this.f248137m.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
            }
            this.f248137m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jbq);
        } else if (i19 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18131x711b760 c18131x711b7602 = this.f248134g;
            if (c18131x711b7602 != null) {
                c18131x711b7602.m70812x317629c3(true);
            }
            if (c17947x83d458f1 != null && this.f248134g != null && c17947x83d458f1.m70552x11240267().size() > 0) {
                db5.e1.i(this.f248132e, com.p314xaae8f345.mm.R.C30867xcad56011.jfw, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                c17947x83d458f1.a();
            }
            this.f248137m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jbo);
        } else if (i19 == 2) {
            if (this.f248135h != null) {
                this.f248136i.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574783jg1));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(j17)) {
                    this.f248135h.s(com.p314xaae8f345.mm.R.raw.f78393x368e0bdd, com.p314xaae8f345.mm.R.C30859x5a72f63.f560798ui);
                    this.f248136i.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                    this.f248137m.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
                } else {
                    this.f248136i.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
                    this.f248137m.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
                }
            }
            this.f248137m.setText(j17);
        } else if (i19 == 3) {
            if (this.f248135h != null) {
                this.f248136i.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfj));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(j17)) {
                    this.f248135h.s(com.p314xaae8f345.mm.R.raw.f78393x368e0bdd, com.p314xaae8f345.mm.R.C30859x5a72f63.f560798ui);
                    this.f248136i.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                    this.f248137m.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
                } else {
                    this.f248135h.m82040x7541828(-65536);
                    this.f248136i.setTextColor(-65536);
                    this.f248137m.setTextColor(-65536);
                }
            }
            this.f248137m.setText(j17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleRangeChoose", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return true;
    }

    public final void c(android.content.Context context) {
        wa4.x xVar;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.RangeWidget");
        this.f248132e = (android.app.Activity) context;
        this.f248133f = android.view.View.inflate(context, mo70682x8e08264e(), this);
        this.f248142r = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().g();
        this.f248137m = (android.widget.TextView) this.f248133f.findViewById(com.p314xaae8f345.mm.R.id.nbu);
        this.f248136i = (android.widget.TextView) this.f248133f.findViewById(com.p314xaae8f345.mm.R.id.i0l);
        this.f248135h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f248133f.findViewById(com.p314xaae8f345.mm.R.id.f568048li0);
        this.f248138n = (android.widget.LinearLayout) this.f248133f.findViewById(com.p314xaae8f345.mm.R.id.nbs);
        this.f248139o = (android.widget.TextView) this.f248133f.findViewById(com.p314xaae8f345.mm.R.id.nbr);
        this.f248140p = this.f248133f.findViewById(com.p314xaae8f345.mm.R.id.f568051li3);
        this.f248133f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c8(this));
        android.widget.LinearLayout linearLayout = this.f248138n;
        if (linearLayout != null && this.f248139o != null && this.f248140p != null) {
            linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.d8(this));
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_last_range_enable, 1) == 1;
            this.f248140p.setBackground(null);
            this.f248138n.setVisibility(8);
            if (z17 && (xVar = this.f248142r) != null && (linkedList = xVar.f525832d) != null && !linkedList.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = this.f248142r.f525832d.iterator();
                while (it.hasNext()) {
                    wa4.y yVar = (wa4.y) it.next();
                    int i17 = yVar.f525839e;
                    if (i17 == 1) {
                        java.lang.String g17 = ((b93.b) c93.a.a()).g(yVar.f525838d);
                        if (g17 != null) {
                            arrayList.add(g17);
                        }
                    } else if (i17 == 2) {
                        gm0.j1.i();
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f525838d, true);
                        if (n17 != null && ((int) n17.E2) != 0) {
                            arrayList.add(yVar.f525838d);
                        }
                    } else {
                        arrayList.add(yVar.f525838d);
                    }
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
                    this.f248140p.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj));
                    this.f248138n.setVisibility(0);
                    java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(d(arrayList), ",");
                    android.widget.TextView textView = this.f248139o;
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context2 = getContext();
                    java.lang.String format = java.lang.String.format(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfk), c17);
                    float textSize = this.f248139o.getTextSize();
                    ((ke0.e) xVar2).getClass();
                    textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, format, textSize));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.B().f142772f = this.f248142r.f525834f ? 2 : 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Sj().execute(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.e8(this));
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.RangeWidget");
    }

    public final java.util.List d(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            return linkedList;
        }
        if (list == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            return linkedList;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 != null && ((int) n17.E2) != 0) {
                str = n17.g2();
            }
            linkedList.add(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return linkedList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17949x28e47a30
    /* renamed from: getLabelRange */
    public int mo70559x8b2fba9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLabelRange", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        int i17 = this.f248141q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLabelRange", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return i17;
    }

    /* renamed from: getLayoutResource */
    public int mo70682x8e08264e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutResource", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutResource", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cby;
    }

    /* renamed from: getMaxTagNameLen */
    public int mo70683xec28675e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17949x28e47a30
    /* renamed from: getSnsVisibilityData */
    public bw5.nk0 mo70560xbaf30cbe() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsVisibilityData", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        bw5.nk0 nk0Var = new bw5.nk0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsVisibilityData", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return nk0Var;
    }

    /* renamed from: setEnablePrivate */
    public void m70684x8031113e(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEnablePrivate", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEnablePrivate", "com.tencent.mm.plugin.sns.ui.RangeWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17949x28e47a30
    /* renamed from: setRangeTipClickListener */
    public void mo70561xb720519c(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRangeTipClickListener", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        this.f248146v = onClickListener;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRangeTipClickListener", "com.tencent.mm.plugin.sns.ui.RangeWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17949x28e47a30
    /* renamed from: setSnsRangeChangeComplexCallback */
    public void mo70562x8454105e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y0 y0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsRangeChangeComplexCallback", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsRangeChangeComplexCallback", "com.tencent.mm.plugin.sns.ui.RangeWidget");
    }

    public C17992x3b5785c1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f248141q = 0;
        this.f248142r = null;
        this.f248143s = "";
        this.f248144t = "";
        this.f248145u = "";
        this.f248146v = null;
        this.f248147w = 0;
        c(context);
    }
}

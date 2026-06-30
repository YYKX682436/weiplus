package com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388;

@db5.a(m123858x6ac9171 = 8192)
/* renamed from: com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI */
/* loaded from: classes10.dex */
public class ActivityC22349xe6f834c8 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int W = 0;
    public uf5.q1 C;
    public uf5.r1 D;
    public int E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String[] H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f288654J;
    public android.widget.ImageView K;
    public boolean L;
    public boolean M;
    public boolean T;
    public boolean U;
    public boolean N = true;
    public final java.util.Set P = new java.util.HashSet();
    public final java.util.Set Q = new java.util.HashSet();
    public final uf5.j1 R = new uf5.j1(this);
    public boolean S = false;
    public boolean V = false;

    public static void w7(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c8) {
        int i17;
        activityC22349xe6f834c8.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6382x96468eca c6382x96468eca = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6382x96468eca();
        int i18 = 2;
        if ("@sns.black.android".equals(activityC22349xe6f834c8.G)) {
            i17 = 1;
        } else if ("@sns.unlike.android".equals(activityC22349xe6f834c8.G)) {
            i17 = 2;
        } else {
            if ("@werun.black.android".equals(activityC22349xe6f834c8.G)) {
                i18 = 5;
            } else {
                int i19 = 4;
                if (!"@tophistory.black.android".equals(activityC22349xe6f834c8.G)) {
                    if (!"@tophistory.unlike.android".equals(activityC22349xe6f834c8.G)) {
                        i19 = 3;
                        if (!"@finder.block.his.liked.android".equals(activityC22349xe6f834c8.G)) {
                            if (!"@finder.block.my.liked.android".equals(activityC22349xe6f834c8.G)) {
                                if ("@social.black.android".equals(activityC22349xe6f834c8.G)) {
                                    i18 = 1;
                                } else {
                                    i17 = -1;
                                    i18 = 0;
                                }
                            }
                        }
                    }
                    i17 = 2;
                    i18 = i19;
                }
                i17 = 1;
                i18 = i19;
            }
            i17 = 0;
        }
        c6382x96468eca.f137287e = i18;
        c6382x96468eca.f137286d = activityC22349xe6f834c8.E != 16 ? 1L : 2L;
        c6382x96468eca.f137288f = i17;
        c6382x96468eca.f137289g = activityC22349xe6f834c8.getIntent().getIntExtra("privacy_menu_enter_type", 0);
        c6382x96468eca.f137290h = activityC22349xe6f834c8.getIntent().getIntExtra("privacy_select_chatroom_or_lebal_count", 0);
        c6382x96468eca.f137291i = (activityC22349xe6f834c8.C.f508818n != null ? r1.getCount() : 0) - ((java.util.HashSet) activityC22349xe6f834c8.P).size();
        c6382x96468eca.f137293k = ((java.util.LinkedList) activityC22349xe6f834c8.C.f508822r).size();
        c6382x96468eca.f137292j = activityC22349xe6f834c8.C.f508818n != null ? r7.getCount() : 0;
        c6382x96468eca.k();
        su4.k3.m(c6382x96468eca);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 != 1 || str == null) {
            return;
        }
        this.C.t(str);
        z7();
        this.C.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        return this.C;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return this.D;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx) : this.I;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    /* renamed from: getActivity */
    public android.app.Activity mo8774x19263085() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570892ca0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        j75.f m67437x4bd5310;
        int headerViewsCount = i17 - this.f287979d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPrivacyContactsFromRangeUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b7().getItem(headerViewsCount);
        if (item == null || !(item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) || p5(item)) {
            return;
        }
        java.lang.String str = item.f288383s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPrivacyContactsFromRangeUI", "ClickUser=%s", str);
        if (this.V && (m67437x4bd5310 = m67437x4bd5310()) != null && ((uf5.l) m67437x4bd5310.mo140437x75286adb()).f508799e) {
            this.C.t(str);
            m67437x4bd5310.B3(new uf5.c(str, ((java.util.LinkedList) this.C.f508822r).contains(str)));
            z7();
            return;
        }
        this.C.t(str);
        z7();
        if (b7() instanceof uf5.r1) {
            Y6();
            mo48674x36654fab();
        }
        if (this.U) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", str);
            intent.putExtra("Contact_Scene", 3);
            intent.putExtra("key_label_click_source", getIntent().getIntExtra("key_label_click_source", 0));
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 4);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            j45.l.j(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        boolean z17 = false;
        this.E = getIntent().getIntExtra("list_type", 0);
        this.F = getIntent().getStringExtra("filter_type");
        this.H = getIntent().getStringArrayExtra("already_select_contact");
        int intExtra = getIntent().getIntExtra("max_limit_num", 100);
        this.G = getIntent().getStringExtra("privacy_source_type");
        this.C = new uf5.q1(this, this, intExtra);
        boolean booleanExtra = getIntent().getBooleanExtra("only_show_contact", false);
        this.M = booleanExtra;
        this.C.f288611f = !booleanExtra;
        if (booleanExtra) {
            this.N = false;
        }
        if (!booleanExtra && ("@all.contact.android".equals(this.F) || "@all.contact.without.chatroom.without.openim".equals(this.F))) {
            com.p314xaae8f345.mm.p2621x8fb0427b.e8 pj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj();
            java.lang.String[] strArr = this.H;
            if (strArr != null && strArr.length != 0) {
                int length = strArr.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        break;
                    }
                    if (((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(strArr[i17], true).r2()) {
                        z17 = true;
                        break;
                    }
                    i17++;
                }
            }
            this.S = !z17;
        }
        uf5.r1 r1Var = new uf5.r1(this, this, this.C);
        this.D = r1Var;
        r1Var.f288611f = true;
        this.C.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean k7() {
        return this.N;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.List arrayList;
        super.onCreate(bundle);
        this.I = getIntent().getStringExtra("titile");
        this.U = getIntent().getBooleanExtra("can_go_to_profile", false);
        mo54450xbf7c1df6(g7());
        mo54448x9c8c0d33(new uf5.l1(this));
        if (!this.M) {
            m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new uf5.n1(this), null, this.E == 16 ? com.p314xaae8f345.mm.ui.fb.RED : com.p314xaae8f345.mm.ui.fb.GREEN);
            m78500x43e00957(1, false);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("need_show_all_selected", false);
        this.T = booleanExtra;
        if (booleanExtra) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.bsd);
            this.f288654J = findViewById;
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.bsc);
            this.K = imageView;
            imageView.setVisibility(0);
            this.L = true;
            y7();
            this.f288654J.setOnClickListener(new uf5.o1(this));
            if (!this.S) {
                gm0.j1.i();
                android.database.Cursor U = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(this.H, "", this.F, "", new java.util.ArrayList());
                java.util.Set set = this.Q;
                if (U != null) {
                    U.moveToFirst();
                    while (!U.isAfterLast()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                        z3Var.mo9015xbf5d97fd(U);
                        if (x7(z3Var)) {
                            ((java.util.HashSet) this.P).add(z3Var.d1());
                        } else {
                            ((java.util.HashSet) set).add(z3Var.d1());
                        }
                        U.moveToNext();
                    }
                    U.close();
                }
                ((java.util.LinkedList) this.C.f508822r).addAll(set);
                z7();
            }
        } else {
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.bsd);
            this.f288654J = findViewById2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/contact/privacy/SelectPrivacyContactsFromRangeUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/contact/privacy/SelectPrivacyContactsFromRangeUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int intExtra = getIntent().getIntExtra("last_page_source_type", 0);
        if (intExtra == 1) {
            b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), 5L, 0L, 0L, 0L);
        }
        boolean z17 = this.M && intExtra == 1 && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2533xb4860a9e.C20202x1e36d319()) == 1;
        this.V = z17;
        if (z17) {
            j75.f m67437x4bd5310 = m67437x4bd5310();
            if (m67437x4bd5310 != null) {
                uf5.l lVar = (uf5.l) m67437x4bd5310.mo140437x75286adb();
                java.util.List list = this.C.f508822r;
                lVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
                lVar.f508801g = list;
                lVar.f508802h = this.H;
            }
            j75.f m67437x4bd53102 = m67437x4bd5310();
            if (m67437x4bd53102 != null) {
                m67437x4bd53102.m3(this, new e75.a() { // from class: uf5.k1$$a
                    @Override // e75.a
                    /* renamed from: onChanged */
                    public final void mo2231x7bb163d5(java.lang.Object obj) {
                        final uf5.l lVar2 = (uf5.l) obj;
                        int i17 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.W;
                        final com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c8 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.this;
                        activityC22349xe6f834c8.getClass();
                        lVar2.b(uf5.x0.class, new j75.l() { // from class: uf5.k1$$b
                            @Override // j75.l
                            public final void a(j75.d dVar) {
                                com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c82 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.this;
                                activityC22349xe6f834c82.M = false;
                                uf5.q1 q1Var = activityC22349xe6f834c82.C;
                                q1Var.f288611f = true;
                                q1Var.notifyDataSetChanged();
                                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC22349xe6f834c82.f287979d.getLayoutParams();
                                layoutParams.addRule(2, com.p314xaae8f345.mm.R.id.shf);
                                activityC22349xe6f834c82.f287979d.setLayoutParams(layoutParams);
                            }
                        });
                        lVar2.b(uf5.y0.class, new j75.l() { // from class: uf5.k1$$c
                            @Override // j75.l
                            public final void a(j75.d dVar) {
                                com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c82 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.this;
                                activityC22349xe6f834c82.M = true;
                                ((java.util.LinkedList) activityC22349xe6f834c82.C.f508822r).clear();
                                uf5.q1 q1Var = activityC22349xe6f834c82.C;
                                q1Var.f288611f = false;
                                q1Var.notifyDataSetChanged();
                                activityC22349xe6f834c82.z7();
                                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC22349xe6f834c82.f287979d.getLayoutParams();
                                layoutParams.addRule(2, com.p314xaae8f345.mm.R.id.bsd);
                                activityC22349xe6f834c82.f287979d.setLayoutParams(layoutParams);
                            }
                        });
                        lVar2.b(uf5.c.class, new j75.l() { // from class: uf5.k1$$d
                            @Override // j75.l
                            public final void a(j75.d dVar) {
                                int i18 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.W;
                                com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.this.z7();
                            }
                        });
                        lVar2.b(uf5.d.class, new j75.l() { // from class: uf5.k1$$e
                            @Override // j75.l
                            public final void a(j75.d dVar) {
                                com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c82 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.this;
                                activityC22349xe6f834c82.M = true;
                                ((java.util.LinkedList) activityC22349xe6f834c82.C.f508822r).clear();
                                uf5.q1 q1Var = activityC22349xe6f834c82.C;
                                q1Var.f288611f = false;
                                activityC22349xe6f834c82.H = lVar2.f508802h;
                                q1Var.s();
                                activityC22349xe6f834c82.z7();
                                java.lang.String[] strArr = activityC22349xe6f834c82.H;
                                if (strArr == null || strArr.length <= 0) {
                                    activityC22349xe6f834c82.mo54450xbf7c1df6(activityC22349xe6f834c82.g7());
                                } else {
                                    java.lang.String str = activityC22349xe6f834c82.I;
                                    if (str != null && str.contains("(")) {
                                        str = str.substring(0, str.lastIndexOf("("));
                                    }
                                    activityC22349xe6f834c82.mo54450xbf7c1df6(str + "(" + activityC22349xe6f834c82.H.length + ")");
                                }
                                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC22349xe6f834c82.f287979d.getLayoutParams();
                                layoutParams.addRule(2, com.p314xaae8f345.mm.R.id.bsd);
                                activityC22349xe6f834c82.f287979d.setLayoutParams(layoutParams);
                            }
                        });
                        lVar2.b(uf5.c2.class, new j75.l() { // from class: uf5.k1$$f
                            @Override // j75.l
                            public final void a(j75.d dVar) {
                                uf5.c2 c2Var = (uf5.c2) dVar;
                                int i18 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.W;
                                com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c82 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.this;
                                activityC22349xe6f834c82.getClass();
                                java.util.Iterator it = c2Var.f508741b.iterator();
                                while (it.hasNext()) {
                                    ((java.util.LinkedList) activityC22349xe6f834c82.C.f508822r).remove((java.lang.String) it.next());
                                }
                                for (java.lang.String str : c2Var.f508742c) {
                                    if (!((java.util.LinkedList) activityC22349xe6f834c82.C.f508822r).contains(str)) {
                                        ((java.util.LinkedList) activityC22349xe6f834c82.C.f508822r).add(str);
                                    }
                                }
                                activityC22349xe6f834c82.C.notifyDataSetChanged();
                                activityC22349xe6f834c82.z7();
                            }
                        });
                        lVar2.b(uf5.a.class, new j75.l() { // from class: uf5.k1$$g
                            @Override // j75.l
                            public final void a(j75.d dVar) {
                                com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c82 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.this;
                                ((java.util.LinkedList) activityC22349xe6f834c82.C.f508822r).remove(((uf5.a) dVar).f508729b);
                                activityC22349xe6f834c82.C.notifyDataSetChanged();
                            }
                        });
                    }
                });
            }
            uf5.x xVar = (uf5.x) pf5.z.f435481a.a(this).e(uf5.x.class);
            if (xVar != null) {
                java.lang.String batchSetText = getString(com.p314xaae8f345.mm.R.C30867xcad56011.p_x);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batchSetText, "batchSetText");
                android.view.View findViewById3 = xVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.shf);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
                xVar.f508854d = findViewById3;
                android.view.View findViewById4 = xVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.she);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
                xVar.f508855e = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById4;
                android.view.View findViewById5 = xVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.shg);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
                xVar.f508856f = (android.widget.ImageView) findViewById5;
                android.view.View findViewById6 = xVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.shh);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
                xVar.f508857g = (android.widget.Button) findViewById6;
                j75.f Q6 = xVar.Q6();
                uf5.l lVar2 = Q6 != null ? (uf5.l) Q6.mo140437x75286adb() : null;
                if (lVar2 == null || (arrayList = lVar2.f508800f) == null) {
                    arrayList = new java.util.ArrayList();
                }
                uf5.u1 u1Var = new uf5.u1(arrayList, 4, new uf5.o(xVar));
                xVar.f508858h = u1Var;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = xVar.f508855e;
                if (c1163xf1deaba4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchAvatarRv");
                    throw null;
                }
                c1163xf1deaba4.mo7960x6cab2c8d(u1Var);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = xVar.f508855e;
                if (c1163xf1deaba42 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchAvatarRv");
                    throw null;
                }
                c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(xVar.m158354x19263085(), 0, false));
                android.widget.Button button = xVar.f508857g;
                if (button == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchSetBtn");
                    throw null;
                }
                button.setText(xVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575371pa4));
                android.widget.Button button2 = xVar.f508857g;
                if (button2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchSetBtn");
                    throw null;
                }
                button2.setEnabled(false);
                android.widget.Button button3 = xVar.f508857g;
                if (button3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchSetBtn");
                    throw null;
                }
                button3.setOnClickListener(new uf5.p(xVar));
                android.widget.ImageView imageView2 = xVar.f508856f;
                if (imageView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchExpandIcon");
                    throw null;
                }
                imageView2.setOnClickListener(new uf5.q(xVar));
                xVar.f508859i = new uf5.k(xVar.m158354x19263085(), new uf5.t(xVar), new uf5.u(xVar));
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = xVar.P6();
                if (P6 != null) {
                    P6.m78494xd9193382(2, batchSetText, new uf5.n(xVar), null, com.p314xaae8f345.mm.ui.fb.BLUE_TEXT_MEDIUM);
                }
                j75.f Q62 = xVar.Q6();
                if (Q62 != null) {
                    Q62.z3(xVar.m158354x19263085(), uf5.s.f508828d);
                }
                j75.f Q63 = xVar.Q6();
                if (Q63 != null) {
                    Q63.L2(xVar.m158354x19263085(), new uf5.r(xVar));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.C.k();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPrivacyContactsFromRangeUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.mo808xfb85f7b0());
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        return (dVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) && (z3Var = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) dVar).B) != null && this.E != 16 && x7(z3Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(uf5.m.class);
        hashSet.add(uf5.x.class);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        if (!(dVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            return false;
        }
        return ((java.util.LinkedList) this.C.f508822r).contains(((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) dVar).f288352z);
    }

    public final boolean x7(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        if (z3Var == null) {
            return false;
        }
        boolean z17 = this.E != 16;
        if ("@sns.black.android".equals(this.G)) {
            if (!z17 || !z3Var.x2()) {
                return false;
            }
        } else if ("@sns.unlike.android".equals(this.G)) {
            if (!z17) {
                return false;
            }
            if (!((z3Var.m124896xfb85f7b0() & 1048576) != 0)) {
                return false;
            }
        } else if ("@werun.black.android".equals(this.G)) {
            if (!z17) {
                return false;
            }
            if (!((z3Var.m124896xfb85f7b0() & 524288) != 0)) {
                return false;
            }
        } else if ("@tophistory.black.android".equals(this.G)) {
            if (!z17) {
                return false;
            }
            if (!((z3Var.m124896xfb85f7b0() & 131072) != 0)) {
                return false;
            }
        } else if ("@tophistory.unlike.android".equals(this.G)) {
            if (!z17) {
                return false;
            }
            if (!((z3Var.m124896xfb85f7b0() & 262144) != 0)) {
                return false;
            }
        } else if ("@social.black.android".equals(this.G)) {
            if (!z17 || !z3Var.y2()) {
                return false;
            }
        } else if ("@finder.block.his.liked.android".equals(this.G)) {
            if (!z17) {
                return false;
            }
            if (!((z3Var.m124896xfb85f7b0() & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) != 0)) {
                return false;
            }
        } else {
            if (!"@finder.block.my.liked.android".equals(this.G) || !z17) {
                return false;
            }
            if (!((z3Var.m124896xfb85f7b0() & 134217728) != 0)) {
                return false;
            }
        }
        return true;
    }

    public final void y7() {
        if (this.L) {
            l02.n.a(this.K, "checkbox_cell_on");
        } else {
            l02.n.a(this.K, "checkbox_cell_off");
        }
    }

    public final void z7() {
        if (this.M) {
            return;
        }
        if (((java.util.LinkedList) this.C.f508822r).size() > 0) {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5) + "(" + ((java.util.LinkedList) this.C.f508822r).size() + ")");
            m78500x43e00957(1, true);
        } else {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
            m78500x43e00957(1, false);
        }
        if (this.T) {
            int size = ((java.util.LinkedList) this.C.f508822r).size();
            android.database.Cursor cursor = this.C.f508818n;
            if (size == (cursor != null ? cursor.getCount() : 0)) {
                if (this.L) {
                    return;
                }
                this.L = true;
                y7();
                return;
            }
            if (this.L) {
                this.L = false;
                y7();
            }
        }
    }
}

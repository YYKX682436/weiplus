package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* renamed from: com.tencent.mm.ui.conversation.EnterpriseConversationUI */
/* loaded from: classes11.dex */
public class ActivityC22371xa262f838 extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2698xc90c42a8.AbstractActivityC22393x78692359 {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f288877f;

    /* renamed from: com.tencent.mm.ui.conversation.EnterpriseConversationUI$EnterpriseConversationFmUI */
    /* loaded from: classes11.dex */
    public static class EnterpriseConversationFmUI extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI implements l75.z0 {

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f288878d;

        /* renamed from: g, reason: collision with root package name */
        public android.widget.TextView f288881g;

        /* renamed from: h, reason: collision with root package name */
        public android.widget.ListView f288882h;

        /* renamed from: i, reason: collision with root package name */
        public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 f288883i;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f288884m;

        /* renamed from: o, reason: collision with root package name */
        public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f288886o;

        /* renamed from: v, reason: collision with root package name */
        public int f288893v;

        /* renamed from: w, reason: collision with root package name */
        public dg5.i f288894w;

        /* renamed from: x, reason: collision with root package name */
        public dg5.u f288895x;

        /* renamed from: e, reason: collision with root package name */
        public android.widget.LinearLayout f288879e = null;

        /* renamed from: f, reason: collision with root package name */
        public android.view.View f288880f = null;

        /* renamed from: n, reason: collision with root package name */
        public int f288885n = 0;

        /* renamed from: p, reason: collision with root package name */
        public boolean f288887p = false;

        /* renamed from: q, reason: collision with root package name */
        public long f288888q = 0;

        /* renamed from: r, reason: collision with root package name */
        public long f288889r = 0;

        /* renamed from: s, reason: collision with root package name */
        public int f288890s = -2;

        /* renamed from: t, reason: collision with root package name */
        public long f288891t = 0;

        /* renamed from: u, reason: collision with root package name */
        public java.lang.String f288892u = null;

        /* renamed from: y, reason: collision with root package name */
        public final r01.p f288896y = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h4(this);

        public static dg5.v l0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI enterpriseConversationFmUI, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 p7Var) {
            enterpriseConversationFmUI.getClass();
            if (p7Var == null) {
                return null;
            }
            int i17 = p7Var.f289496a;
            if (i17 == 0 && p7Var.f289499d != null) {
                if (enterpriseConversationFmUI.f288894w == null) {
                    enterpriseConversationFmUI.f288894w = new dg5.i(enterpriseConversationFmUI.f288820ui, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d4(enterpriseConversationFmUI));
                }
                return enterpriseConversationFmUI.f288894w;
            }
            if (i17 != 1 || p7Var.f289498c == null) {
                return null;
            }
            if (enterpriseConversationFmUI.f288895x == null) {
                enterpriseConversationFmUI.f288895x = new dg5.u(enterpriseConversationFmUI.f288820ui, enterpriseConversationFmUI.f288884m);
            }
            return enterpriseConversationFmUI.f288895x;
        }

        @Override // l75.z0
        public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
        /* renamed from: getLayoutId */
        public int getF153758d() {
            return com.p314xaae8f345.mm.R.C30864xbddafb2a.a9_;
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI
        /* renamed from: getUserName */
        public java.lang.String mo79363x6bf53a6c() {
            return this.f288884m;
        }

        public final void m0() {
            int a17 = com.p314xaae8f345.mm.ui.h4.a(mo7438x76847179(), this.f288884m);
            this.f288885n = a17;
            if (a17 == 2 && this.f288879e == null) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.atj);
                this.f288879e = linearLayout;
                android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.height = i65.a.h(mo7438x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561160b2);
                this.f288879e.setLayoutParams(layoutParams);
                this.f288880f = com.p314xaae8f345.mm.ui.id.b(mo7438x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a9a, (android.view.ViewGroup) this.f288879e, false);
                float q17 = i65.a.q(mo7438x76847179());
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) this.f288880f.findViewById(com.p314xaae8f345.mm.R.id.h6y);
                int i17 = (int) (q17 * c19659x677e0913.getLayoutParams().height);
                c19659x677e0913.getLayoutParams().height = i17;
                c19659x677e0913.getLayoutParams().width = i17;
                c19659x677e0913.requestLayout();
                android.widget.TextView textView = (android.widget.TextView) this.f288880f.findViewById(com.p314xaae8f345.mm.R.id.odf);
                r01.q bj6 = r01.q3.bj();
                r01.q3.bj();
                java.lang.String z07 = bj6.z0(0);
                if (z07 == null || z07.length() <= 0) {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c1o);
                } else {
                    textView.setText(z07);
                }
                int D0 = r01.q3.bj().D0();
                if (D0 != 0) {
                    textView.setTextColor(D0);
                }
                r01.q3.bj().getClass();
                if (r01.q.f449719g == null) {
                    r01.q.f449719g = new r45.ud();
                }
                java.lang.String str = r01.q.f449719g.f468784g;
                if (str != null && str.length() > 0) {
                    c19659x677e0913.m75396xca029dad(str);
                }
                com.p314xaae8f345.mm.ui.h4.e(this.f288884m, 1, 2);
                this.f288879e.addView(this.f288880f);
                this.f288880f.setOnClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.l4(this));
                android.app.Activity mo7438x76847179 = mo7438x76847179();
                java.lang.String str2 = this.f288884m;
                if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(mo7438x76847179, "com.tencent.wework")) {
                    com.p314xaae8f345.mm.ui.h4.f(str2, 4, 3);
                } else {
                    com.p314xaae8f345.mm.ui.h4.f(str2, 5, 3);
                }
                com.p314xaae8f345.mm.ui.h4.d(mo7438x76847179(), this.f288884m);
            }
            android.widget.LinearLayout linearLayout2 = this.f288879e;
            if (linearLayout2 != null) {
                if (this.f288885n != 2) {
                    linearLayout2.setVisibility(8);
                    return;
                }
                linearLayout2.setVisibility(0);
                r01.m y07 = r01.q3.bj().y0(this.f288884m);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13656, java.lang.Integer.valueOf(y07 != null ? y07.f66038x29b98d8d : 0), java.lang.Integer.valueOf(y07 != null ? y07.f66045x6bcd764a : 0), 6, 3, java.lang.Long.valueOf(y07 != null ? y07.f66046x771ad30a : 0L), java.lang.Long.valueOf(y07 != null ? y07.f66050x2a8d0441 : 0L));
            }
        }

        public final void n0() {
            if (this.f288883i == null) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f288886o;
            if (n3Var == null) {
                this.f288886o = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.g4(this);
            } else {
                n3Var.mo50303x856b99f0(1);
            }
            this.f288886o.mo50307xb9e94560(1, 500L);
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onActivityCreated */
        public void mo7495x78cb4fa(android.os.Bundle bundle) {
            super.mo7495x78cb4fa(bundle);
            this.f288884m = mo78409x676b27cd().getIntent().getStringExtra("enterprise_biz_name");
            this.f288878d = mo78409x676b27cd().getIntent().getStringExtra("enterprise_biz_display_name");
            this.f288893v = mo78409x676b27cd().getIntent().getIntExtra("enterprise_from_scene", 5);
            mo78695xbf7c1df6(this.f288878d);
            this.f288882h = (android.widget.ListView) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.odk);
            android.widget.TextView textView = (android.widget.TextView) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.dfo);
            this.f288881g = textView;
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c1a);
            mo78682x9c8c0d33(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i4(this));
            m78707x53c22598(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.j4(this));
            if (r01.z.b(this.f288884m) != null) {
                m0();
                if (this.f288884m != null) {
                    r01.q3.bj().b1(this.f288884m, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.k4(this));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnterpriseConversationUI", "update father attr from svr bizName:%s", this.f288884m);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnterpriseConversationUI", "bizName is null!!!");
                }
                m78623x84f07bce(1, com.p314xaae8f345.mm.R.C30867xcad56011.jzr, com.p314xaae8f345.mm.R.raw.f78356x618865ad, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m4(this));
                m78623x84f07bce(2, com.p314xaae8f345.mm.R.C30867xcad56011.f571350cl, com.p314xaae8f345.mm.R.raw.f78351x6c69febc, new dg5.n(this.f288820ui, this.f288884m));
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 q7Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7(mo78409x676b27cd(), this.f288884m, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n4(this));
                this.f288883i = q7Var;
                q7Var.f289556q.getClass();
                q7Var.f289557r.getClass();
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 q7Var2 = this.f288883i;
                q7Var2.f289556q.getClass();
                q7Var2.f289557r.getClass();
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 q7Var3 = this.f288883i;
                q7Var3.f289556q.getClass();
                q7Var3.f289557r.getClass();
                this.f288882h.setAdapter((android.widget.ListAdapter) this.f288883i);
                this.f288882h.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.c4(this));
                android.graphics.Point point = new android.graphics.Point();
                this.f288882h.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e4(this, point));
                this.f288882h.setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f4(this, point));
            }
            this.f288888q = java.lang.System.currentTimeMillis() / 1000;
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(this.f288884m);
            if (p17 != null) {
                int d17 = p17.d1();
                this.f288890s = d17;
                if (d17 == 0 && p17.f1() > 0) {
                    this.f288890s = -1;
                }
                this.f288891t = p17.w0() / 1000;
                this.f288892u = p17.Q0() == 1 ? null : p17.z0();
            }
            r01.q3.bj().f449721e.a(this.f288896y, mo78409x676b27cd().getMainLooper());
            ((l75.a1) c01.d9.b().r()).a(this);
            ((l75.a1) c01.d9.b().q()).a(this);
            n0();
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onActivityResult */
        public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
            super.mo7496x9d4787cb(i17, i18, intent);
            if (i17 == 1 && i18 == -1 && intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("be_send_card_name");
                java.lang.String stringExtra2 = intent.getStringExtra("received_card_name");
                boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
                java.lang.String stringExtra3 = intent.getStringExtra("custom_send_text");
                ((dk5.s5) tg3.t1.a()).Di(stringExtra, stringExtra2, booleanExtra, null);
                ((dk5.s5) tg3.t1.a()).Ui(stringExtra3, stringExtra2);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(mo7438x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_p), null, mo78409x676b27cd(), null, null);
            }
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onDestroy */
        public void mo7504xac79a11b() {
            r01.q bj6 = r01.q3.bj();
            r01.p pVar = this.f288896y;
            l75.v0 v0Var = bj6.f449721e;
            if (v0Var != null) {
                v0Var.j(pVar);
            }
            if (gm0.j1.a()) {
                ((l75.a1) c01.d9.b().r()).e(this);
                ((l75.a1) c01.d9.b().q()).e(this);
            }
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 q7Var = this.f288883i;
            if (q7Var != null) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4 b4Var = q7Var.f289556q;
                b4Var.C.d();
                java.util.HashMap hashMap = b4Var.f289001r;
                if (hashMap != null) {
                    hashMap.clear();
                    b4Var.f289001r = null;
                }
                b4Var.c();
                b4Var.f294144h = null;
                ((l75.a1) c01.d9.b().r()).e(b4Var);
                hb5.m mVar = q7Var.f289557r;
                java.util.HashMap hashMap2 = mVar.f361765z;
                if (hashMap2 != null) {
                    hashMap2.clear();
                    mVar.f361765z = null;
                }
                r01.q3.aj().mo49775xc84af884(mVar);
                l75.v0 v0Var2 = r01.q3.aj().f483405e;
                if (v0Var2 != null) {
                    v0Var2.j(mVar);
                }
                android.database.DataSetObserver dataSetObserver = q7Var.f289558s;
                b4Var.unregisterDataSetObserver(dataSetObserver);
                mVar.unregisterDataSetObserver(dataSetObserver);
            }
            dg5.u uVar = this.f288895x;
            if (uVar != null) {
                c01.d9.e().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.q0.f34310x366c91de, uVar);
            }
            long j17 = this.f288888q;
            if (j17 > 0) {
                long j18 = this.f288889r;
                if (j18 > 0) {
                    long j19 = j18 - j17;
                    r01.m y07 = r01.q3.bj().y0(this.f288884m);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13465, "", java.lang.Integer.valueOf(y07 != null ? y07.f66038x29b98d8d : 0), 0, java.lang.Integer.valueOf(y07 != null ? y07.f66045x6bcd764a : 0), 1, java.lang.Long.valueOf(j19));
                }
            }
            super.mo7504xac79a11b();
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onPause */
        public void mo7512xb01dfb57() {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).b0(this.f288884m);
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 q7Var = this.f288883i;
            if (q7Var != null) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4 b4Var = q7Var.f289556q;
                db5.c6 c6Var = b4Var.f289002s;
                if (c6Var != null) {
                    c6Var.c();
                }
                b4Var.f289006w = false;
                hb5.m mVar = q7Var.f289557r;
                db5.c6 c6Var2 = mVar.f361756q;
                if (c6Var2 != null) {
                    c6Var2.c();
                }
                mVar.A = false;
            }
            super.mo7512xb01dfb57();
            this.f288887p = true;
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onResume */
        public void mo7517x57429eec() {
            java.util.HashMap hashMap;
            dg5.i iVar = this.f288894w;
            if (iVar != null) {
                long j17 = iVar.f313905f;
                if (0 != j17) {
                    dg5.h hVar = iVar.f313904e;
                    if (hVar != null) {
                        try {
                            ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d4) hVar).f289163a.f288883i.f289557r.u(j17);
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                    iVar.f313905f = 0L;
                }
            }
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 q7Var = this.f288883i;
            if (q7Var != null) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4 b4Var = q7Var.f289556q;
                b4Var.f289006w = true;
                android.text.format.Time time = new android.text.format.Time();
                time.setToNow();
                java.lang.String charSequence = k35.s.a("MM/dd", time).toString();
                boolean z17 = !b4Var.f289008y.equals(charSequence);
                b4Var.f289008y = charSequence;
                if (z17 && (hashMap = b4Var.f289001r) != null) {
                    java.util.Iterator it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.z3) ((java.util.Map.Entry) it.next()).getValue()).f289827b = null;
                    }
                }
                if (b4Var.f289007x) {
                    b4Var.f();
                    b4Var.f289007x = false;
                }
                hb5.m mVar = q7Var.f289557r;
                mVar.A = true;
                if (mVar.B) {
                    mVar.f();
                    mVar.B = false;
                }
            }
            super.mo7517x57429eec();
            if (!c01.e2.J(this.f288884m)) {
                mo78641xb4098c93();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnterpriseConversationUI", "onResume needCheck:%s", java.lang.Boolean.valueOf(this.f288887p));
            if (this.f288887p) {
                n0();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI baseConversationFmUI = this.f39542x9c18d0aa;
        if (baseConversationFmUI != null && (baseConversationFmUI instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI)) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI enterpriseConversationFmUI = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI) baseConversationFmUI;
            enterpriseConversationFmUI.getClass();
            enterpriseConversationFmUI.f288889r = java.lang.System.currentTimeMillis() / 1000;
        }
        super.finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m80494xedaf7c43(this.f288877f);
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569762nn, (android.view.ViewGroup) null);
        this.f288877f = inflate;
        setContentView(inflate);
        this.f39542x9c18d0aa = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI();
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        m7630xb2c12e75.h(com.p314xaae8f345.mm.R.id.jmc, this.f39542x9c18d0aa, null, 1);
        m7630xb2c12e75.d();
        o25.n1.d(this, this.f288877f);
    }
}

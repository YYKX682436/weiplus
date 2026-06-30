package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* renamed from: com.tencent.mm.ui.bizchat.BizChatConversationUI */
/* loaded from: classes11.dex */
public class ActivityC21584xb440222 extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2698xc90c42a8.AbstractActivityC22393x78692359 {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f279428f;

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatConversationUI$BizChatConversationFmUI */
    /* loaded from: classes11.dex */
    public static class BizChatConversationFmUI extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI implements l75.z0, r01.w2 {

        /* renamed from: y, reason: collision with root package name */
        public static final /* synthetic */ int f279429y = 0;

        /* renamed from: d, reason: collision with root package name */
        public android.widget.TextView f279430d;

        /* renamed from: e, reason: collision with root package name */
        public android.widget.LinearLayout f279431e;

        /* renamed from: f, reason: collision with root package name */
        public android.widget.ListView f279432f;

        /* renamed from: g, reason: collision with root package name */
        public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f279433g;

        /* renamed from: h, reason: collision with root package name */
        public hb5.m f279434h;

        /* renamed from: i, reason: collision with root package name */
        public db5.t4 f279435i;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f279436m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f279437n;

        /* renamed from: o, reason: collision with root package name */
        public s01.a0 f279438o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f279439p;

        /* renamed from: u, reason: collision with root package name */
        public long f279444u;

        /* renamed from: q, reason: collision with root package name */
        public boolean f279440q = false;

        /* renamed from: r, reason: collision with root package name */
        public int f279441r = 0;

        /* renamed from: s, reason: collision with root package name */
        public int f279442s = 0;

        /* renamed from: t, reason: collision with root package name */
        public int f279443t = 0;

        /* renamed from: v, reason: collision with root package name */
        public final s01.f f279445v = new com.p314xaae8f345.mm.ui.p2646xfa354eeb.h(this);

        /* renamed from: w, reason: collision with root package name */
        public final s01.l f279446w = new com.p314xaae8f345.mm.ui.p2646xfa354eeb.i(this);

        /* renamed from: x, reason: collision with root package name */
        public final r01.p f279447x = new com.p314xaae8f345.mm.ui.p2646xfa354eeb.k(this);

        @Override // r01.w2
        public void K1(int i17, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
            r45.j53 j53Var;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f279433g;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f279433g = null;
            }
            if (m1Var.mo808xfb85f7b0() == 1355) {
                r45.v90 H = ((s01.g0) m1Var).H();
                if (i17 < 0 || H == null || (j53Var = H.f469533e) == null || j53Var.f459125d == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatConversationFmUI", "onBizChatSceneEnd createBizChatInfo failed, resCode=%d", java.lang.Integer.valueOf(i17));
                    dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.i48), 0).show();
                    return;
                }
                s01.h D0 = r01.q3.Ui().D0(H.f469533e.f459125d.f464618d);
                if (D0 == null) {
                    dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.i48), 0).show();
                } else {
                    m0(D0.f69168x92559640);
                }
            }
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
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279437n) ? this.f279436m : this.f279437n;
        }

        public final java.lang.String l0() {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279437n)) {
                this.f279437n = r01.q3.cj().b1(this.f279436m).y0();
            }
            return this.f279437n;
        }

        public final void m0(long j17) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("key_biz_chat_id", j17);
            bundle.putBoolean("finish_direct", false);
            bundle.putBoolean("key_need_send_video", false);
            bundle.putBoolean("key_is_biz_chat", true);
            this.f288820ui.m80491x5d4f20c8(this.f279436m, bundle, true);
        }

        public final void n0() {
            java.lang.String l07 = l0();
            int a17 = com.p314xaae8f345.mm.ui.h4.a(mo7438x76847179(), l07);
            this.f279441r = a17;
            if (a17 == 2 && this.f279431e == null) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.atj);
                this.f279431e = linearLayout;
                android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.height = i65.a.h(mo7438x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561160b2);
                this.f279431e.setLayoutParams(layoutParams);
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo7438x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a9a, (android.view.ViewGroup) this.f279431e, false);
                float q17 = i65.a.q(mo7438x76847179());
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) inflate.findViewById(com.p314xaae8f345.mm.R.id.h6y);
                int i17 = (int) (q17 * c19659x677e0913.getLayoutParams().height);
                c19659x677e0913.getLayoutParams().height = i17;
                c19659x677e0913.getLayoutParams().width = i17;
                c19659x677e0913.requestLayout();
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
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
                this.f279431e.addView(inflate);
                inflate.setOnClickListener(new com.p314xaae8f345.mm.ui.p2646xfa354eeb.l(this));
                android.app.Activity mo7438x76847179 = mo7438x76847179();
                java.lang.String str2 = this.f279436m;
                if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(mo7438x76847179, "com.tencent.wework")) {
                    com.p314xaae8f345.mm.ui.h4.f(str2, 4, 4);
                } else {
                    com.p314xaae8f345.mm.ui.h4.f(str2, 5, 4);
                }
                com.p314xaae8f345.mm.ui.h4.d(mo7438x76847179(), l07);
            }
            android.widget.LinearLayout linearLayout2 = this.f279431e;
            if (linearLayout2 != null) {
                if (this.f279441r == 2) {
                    linearLayout2.setVisibility(0);
                } else {
                    linearLayout2.setVisibility(8);
                }
            }
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onActivityCreated */
        public void mo7495x78cb4fa(android.os.Bundle bundle) {
            s01.a0 a0Var;
            super.mo7495x78cb4fa(bundle);
            this.f279436m = mo78409x676b27cd().getIntent().getStringExtra("Contact_User");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatConversationFmUI", "[registerListener]");
            r01.q3.aj().f483405e.a(this.f279445v, mo78409x676b27cd().getMainLooper());
            r01.q3.Ui().f483434e.a(this.f279446w, mo78409x676b27cd().getMainLooper());
            r01.q3.bj().f449721e.a(this.f279447x, mo78409x676b27cd().getMainLooper());
            ((l75.a1) c01.d9.b().r()).a(this);
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = this.f279436m;
            ((sg3.a) v0Var).getClass();
            mo78695xbf7c1df6(c01.a2.e(str));
            android.widget.TextView textView = (android.widget.TextView) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.dfo);
            this.f279430d = textView;
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gql);
            this.f279432f = (android.widget.ListView) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.odk);
            try {
                n0();
            } catch (java.lang.NullPointerException unused) {
            }
            hb5.m mVar = new hb5.m(mo78409x676b27cd(), new com.p314xaae8f345.mm.ui.p2646xfa354eeb.r(this), this.f279436m);
            this.f279434h = mVar;
            this.f279432f.setAdapter((android.widget.ListAdapter) mVar);
            this.f279435i = new com.p314xaae8f345.mm.ui.p2646xfa354eeb.n(this);
            rl5.r rVar = new rl5.r(mo78409x676b27cd());
            this.f279432f.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2646xfa354eeb.o(this));
            this.f279432f.setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2646xfa354eeb.p(this, rVar));
            this.f279432f.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2646xfa354eeb.q(this));
            mo78682x9c8c0d33(new com.p314xaae8f345.mm.ui.p2646xfa354eeb.a(this));
            m78623x84f07bce(1, com.p314xaae8f345.mm.R.C30867xcad56011.jzr, com.p314xaae8f345.mm.R.raw.f78356x618865ad, new com.p314xaae8f345.mm.ui.p2646xfa354eeb.b(this));
            m78623x84f07bce(2, com.p314xaae8f345.mm.R.C30867xcad56011.f571350cl, com.p314xaae8f345.mm.R.raw.f78351x6c69febc, new dg5.n(this.f288820ui, l0()));
            java.lang.String z07 = r01.q3.Vi().z0(this.f279436m);
            s01.a0 y07 = r01.q3.Vi().y0(z07);
            this.f279438o = y07;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = this.f279436m;
            objArr[1] = z07;
            objArr[2] = java.lang.Boolean.valueOf(y07 == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatConversationFmUI", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", objArr);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07) || (a0Var = this.f279438o) == null || a0Var.u0() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279438o.f65834x53f3fff9)) {
                r01.q3.Ni().h(this.f279436m, this);
                this.f279433g = db5.e1.Q(mo78409x676b27cd(), m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.p2646xfa354eeb.f(this));
            }
            gm0.j1.e().k(new com.p314xaae8f345.mm.ui.p2646xfa354eeb.g(this), 300L);
            java.lang.String l07 = l0();
            if (l07 != null) {
                r01.q3.bj().b1(l07, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizChatConversationFmUI", "update father attr from svr mainBizName:%s", l07);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizChatConversationFmUI", "mainBizName is null!!!");
            }
            r01.q3.bj().y0(l0());
            android.os.Looper.myQueue().addIdleHandler(new com.p314xaae8f345.mm.ui.p2646xfa354eeb.j(this));
            android.content.Intent intent = mo78409x676b27cd().getIntent();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(intent, "biz_chat_need_to_jump_to_chatting_ui", false)) {
                long longExtra = intent.getLongExtra("biz_chat_chat_id", -1L);
                if (longExtra != -1) {
                    m0(longExtra);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onActivityResult */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo7496x9d4787cb(int r7, int r8, android.content.Intent r9) {
            /*
                r6 = this;
                super.mo7496x9d4787cb(r7, r8, r9)
                r0 = -1
                if (r8 == r0) goto L7
                return
            L7:
                r8 = 1
                if (r7 == r8) goto Lb
                return
            Lb:
                java.lang.String r7 = "result_data"
                android.os.Bundle r7 = r9.getBundleExtra(r7)
                r9 = 0
                if (r7 == 0) goto L76
                java.lang.String r0 = "MicroMsg.BizChatConversationFmUI"
                java.lang.String r1 = "bundle != null"
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
                java.lang.String r0 = "enterprise_members"
                java.lang.String r7 = r7.getString(r0)
                r45.j53 r0 = new r45.j53
                r0.<init>()
                s01.h r1 = new s01.h
                r1.<init>()
                s01.a0 r2 = r6.f279438o
                r3 = 0
                if (r2 == 0) goto L33
                java.lang.String r2 = r2.f65834x53f3fff9
                goto L34
            L33:
                r2 = r3
            L34:
                r1.f69166x53f3fff9 = r2
                java.lang.String r2 = r6.f279436m
                r1.f69170x75756b18 = r2
                boolean r7 = s01.r.a(r1, r7, r3, r0)
                if (r7 == 0) goto L76
                long r1 = r1.f69168x92559640
                r3 = -1
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 == 0) goto L4c
                r6.m0(r1)
                goto L77
            L4c:
                s01.y r7 = r01.q3.Ni()
                java.lang.String r1 = r6.f279436m
                s01.g0 r7 = r7.e(r1, r0, r6)
                androidx.fragment.app.FragmentActivity r0 = r6.mo78409x676b27cd()
                r1 = 2131756315(0x7f10051b, float:1.9143534E38)
                java.lang.String r1 = r6.m7467x2fec8307(r1)
                r2 = 2131756354(0x7f100542, float:1.9143613E38)
                java.lang.String r2 = r6.m7467x2fec8307(r2)
                r3 = 1
                r4 = 1
                com.tencent.mm.ui.bizchat.c r5 = new com.tencent.mm.ui.bizchat.c
                r5.<init>(r6, r7)
                com.tencent.mm.ui.widget.dialog.u3 r7 = db5.e1.Q(r0, r1, r2, r3, r4, r5)
                r6.f279433g = r7
                goto L77
            L76:
                r8 = r9
            L77:
                if (r8 != 0) goto L8b
                androidx.fragment.app.FragmentActivity r7 = r6.mo78409x676b27cd()
                r8 = 2131774428(0x7f104bdc, float:1.9180272E38)
                java.lang.String r8 = r6.m7467x2fec8307(r8)
                android.widget.Toast r7 = dp.a.m125854x26a183b(r7, r8, r9)
                r7.show()
            L8b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI.mo7496x9d4787cb(int, int, android.content.Intent):void");
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
            android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
            s01.b bVar = (s01.b) this.f279434h.getItem(adapterContextMenuInfo.position);
            this.f279444u = bVar.f69064xa6206081;
            if (bVar.f69079xa35b5abb <= 0) {
                contextMenu.add(adapterContextMenuInfo.position, 1, 1, com.p314xaae8f345.mm.R.C30867xcad56011.gqe);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 2, 1, com.p314xaae8f345.mm.R.C30867xcad56011.gqc);
            }
            if (r01.q3.aj().f1(bVar)) {
                contextMenu.add(adapterContextMenuInfo.position, 3, 2, com.p314xaae8f345.mm.R.C30867xcad56011.gqf);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 3, 2, com.p314xaae8f345.mm.R.C30867xcad56011.gqd);
            }
            contextMenu.add(adapterContextMenuInfo.position, 0, 3, com.p314xaae8f345.mm.R.C30867xcad56011.gqi);
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onDestroy */
        public void mo7504xac79a11b() {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatConversationFmUI", "[unRegitListener]");
            s01.g aj6 = r01.q3.aj();
            s01.f fVar = this.f279445v;
            l75.v0 v0Var = aj6.f483405e;
            if (v0Var != null) {
                v0Var.j(fVar);
            }
            s01.m Ui = r01.q3.Ui();
            s01.l lVar = this.f279446w;
            l75.v0 v0Var2 = Ui.f483434e;
            if (v0Var2 != null) {
                v0Var2.j(lVar);
            }
            r01.q bj6 = r01.q3.bj();
            r01.p pVar = this.f279447x;
            l75.v0 v0Var3 = bj6.f449721e;
            if (v0Var3 != null) {
                v0Var3.j(pVar);
            }
            if (gm0.j1.a()) {
                ((l75.a1) c01.d9.b().r()).e(this);
            }
            this.f279434h.c();
            hb5.m mVar = this.f279434h;
            java.util.HashMap hashMap = mVar.f361765z;
            if (hashMap != null) {
                hashMap.clear();
                mVar.f361765z = null;
            }
            r01.q3.aj().mo49775xc84af884(mVar);
            l75.v0 v0Var4 = r01.q3.aj().f483405e;
            if (v0Var4 != null) {
                v0Var4.j(mVar);
            }
            super.mo7504xac79a11b();
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onPause */
        public void mo7512xb01dfb57() {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatConversationFmUI", "on pause");
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).b0(this.f279436m);
            s01.g aj6 = r01.q3.aj();
            java.lang.String str = this.f279436m;
            aj6.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizConversationStorage", "brandUserName is null");
            } else {
                aj6.f483404d.A("BizChatConversation", "update BizChatConversation set newUnReadCount = 0 where newUnReadCount != 0 and brandUserName = '" + str + "'");
            }
            hb5.m mVar = this.f279434h;
            if (mVar != null) {
                db5.c6 c6Var = mVar.f361756q;
                if (c6Var != null) {
                    c6Var.c();
                }
                mVar.A = false;
            }
            this.f279439p = false;
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145049b = "";
            super.mo7512xb01dfb57();
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onResume */
        public void mo7517x57429eec() {
            java.lang.String str;
            super.mo7517x57429eec();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f279436m, true);
            if (n17 == null || !n17.r2()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatConversationFmUI", "onResume is not contact now");
                mo78641xb4098c93();
                return;
            }
            qk.o b17 = r01.z.b(this.f279436m);
            if (b17 == null || (str = b17.f66739xdfb76cc2) == null || !c01.e2.J(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatConversationFmUI", "onResume enterpriseFather is invalid");
                mo78641xb4098c93();
                return;
            }
            if (c01.e2.P(n17)) {
                m78704xca3c3c9a(0);
            } else {
                m78704xca3c3c9a(8);
            }
            hb5.m mVar = this.f279434h;
            if (mVar != null) {
                mVar.A = true;
                if (mVar.B) {
                    mVar.f();
                    mVar.B = false;
                }
            }
            this.f279439p = true;
            hb5.m mVar2 = this.f279434h;
            if (mVar2.A) {
                mVar2.f();
            } else {
                mVar2.B = true;
            }
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145049b = this.f279436m;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o25.n1.d(this, this.f279428f);
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569762nn, (android.view.ViewGroup) null);
        this.f279428f = inflate;
        setContentView(inflate);
        m80494xedaf7c43(this.f279428f);
        this.f39542x9c18d0aa = new com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI();
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        m7630xb2c12e75.h(com.p314xaae8f345.mm.R.id.jmc, this.f39542x9c18d0aa, null, 1);
        m7630xb2c12e75.d();
        o25.n1.d(this, this.f279428f);
    }
}

package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public abstract class EmojiStoreV2BaseFragment extends com.tencent.mm.ui.MMFragment implements i12.q, android.widget.AdapterView.OnItemClickListener, android.widget.AbsListView.OnScrollListener, db5.l5, db5.k5, db5.j5, com.tencent.mm.modelbase.u0, com.tencent.mm.plugin.emoji.model.h0, com.tencent.mm.plugin.emoji.model.i0, ec0.e, l75.q0 {
    public z12.l A;
    public byte[] B;
    public int C;
    public boolean D;
    public long F;
    public com.tencent.mm.plugin.emoji.model.j0 L;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.j f98232d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.appcompat.app.b f98233e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f98234f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f98235g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView f98236h;

    /* renamed from: i, reason: collision with root package name */
    public h22.c f98237i;

    /* renamed from: m, reason: collision with root package name */
    public i22.b f98238m;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2HotBarView f98240o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMPullDownView f98241p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ListView f98242q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f98243r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f98244s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f98245t;

    /* renamed from: u, reason: collision with root package name */
    public j12.b f98246u;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.model.s f98248w;

    /* renamed from: z, reason: collision with root package name */
    public z12.t f98251z;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f98239n = java.lang.Boolean.TRUE;

    /* renamed from: v, reason: collision with root package name */
    public int f98247v = -1;

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f98249x = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f98250y = new java.util.LinkedList();
    public boolean E = false;
    public final com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct G = com.tencent.mm.plugin.emoji.model.EmojiLogic.b();
    public java.lang.String H = "";
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f98231J = false;
    public boolean K = false;
    public final com.tencent.mm.sdk.platformtools.n3 M = new com.tencent.mm.plugin.emoji.ui.v2.b(this);
    public final com.tencent.mm.sdk.event.IListener N = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EmotionStateChangeEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment.2
        {
            this.__eventId = 449099204;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.EmotionStateChangeEvent emotionStateChangeEvent) {
            j12.f fVar;
            com.tencent.mm.autogen.events.EmotionStateChangeEvent emotionStateChangeEvent2 = emotionStateChangeEvent;
            if (emotionStateChangeEvent2 == null) {
                return false;
            }
            am.t4 t4Var = emotionStateChangeEvent2.f54107g;
            java.lang.String str = t4Var.f7979a;
            int i17 = t4Var.f7980b;
            int i18 = t4Var.f7981c;
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment emojiStoreV2BaseFragment = com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment.this;
            j12.b bVar = emojiStoreV2BaseFragment.f98246u;
            if (bVar == null || (fVar = bVar.f297152e) == null) {
                return false;
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = emojiStoreV2BaseFragment.M;
            if (i17 == 6) {
                android.os.Message obtain = android.os.Message.obtain();
                obtain.getData().putString("product_id", str);
                obtain.getData().putInt("progress", i18);
                obtain.what = 131075;
                if (n3Var != null) {
                    n3Var.sendMessage(obtain);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "product status:%d", java.lang.Integer.valueOf(i17));
                android.os.Message obtain2 = android.os.Message.obtain();
                obtain2.getData().putString("product_id", str);
                obtain2.getData().putInt("status", i17);
                obtain2.what = 131076;
                if (n3Var != null) {
                    n3Var.sendMessage(obtain2);
                }
            }
            fVar.g(str);
            return false;
        }
    };
    public final android.view.MenuItem.OnMenuItemClickListener P = new com.tencent.mm.plugin.emoji.ui.v2.c(this);

    @Override // db5.j5
    public boolean A5() {
        return false;
    }

    @Override // db5.k5
    public boolean E0() {
        return false;
    }

    @Override // com.tencent.mm.plugin.emoji.model.h0
    public void E5(i12.c cVar) {
        if (cVar.f() == 9) {
            u0(getString(com.tencent.mm.R.string.f490583z4));
        }
        com.tencent.mm.plugin.emoji.model.j0 j0Var = this.L;
        j0Var.f97566k = this.G;
        j0Var.f97567l = q0() && com.tencent.mm.plugin.emoji.model.o.a().f97588d;
        if (q0()) {
            int i17 = cVar.f287172d;
            if (i17 >= 0 && i17 < this.f98246u.f()) {
                this.L.f97561f = 3;
            } else if (cVar.f287172d < this.f98246u.f() || cVar.f287172d >= this.f98246u.k() + this.f98246u.f()) {
                this.L.f97561f = 1;
            } else {
                this.L.f97561f = 19;
            }
        } else {
            this.L.f97561f = 2;
        }
        this.L.c(cVar);
    }

    @Override // com.tencent.mm.plugin.emoji.model.i0
    public void I0(boolean z17) {
        this.B = null;
        this.f98247v = -1;
        w0(z17, false);
    }

    @Override // db5.l5
    public boolean J6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[onBottomLoadData] startLoadRemoteEmoji.");
        w0(true, false);
        return true;
    }

    @Override // com.tencent.mm.ui.MMFragment
    public int getForceOrientation() {
        return 1;
    }

    @Override // ec0.e
    public void i3(java.util.ArrayList arrayList) {
        if (this.f98246u == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.M;
        if (n3Var != null) {
            n3Var.sendEmptyMessageDelayed(131074, 50L);
        }
        j12.c.a(arrayList, this.f98246u.f297152e);
    }

    public void l0(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void m0(int i17, int i18, com.tencent.mm.modelbase.m1 m1Var) {
        this.D = false;
        android.view.View view = this.f98243r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionList", "(IILcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionList", "(IILcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!(i17 == 0 || i17 == 4)) {
            if (this.E) {
                return;
            }
            android.view.View view2 = this.f98244s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionListErr", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionListErr", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f98241p.setVisibility(8);
            this.f98245t.setText(com.tencent.mm.R.string.f490500wu);
            return;
        }
        android.view.View view3 = this.f98244s;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionList", "(IILcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionList", "(IILcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f98241p.setVisibility(0);
        z12.t tVar = (z12.t) m1Var;
        com.tencent.mm.plugin.emoji.model.s I = z12.t.I(tVar.J());
        this.B = tVar.f469369p;
        if (i18 == 0) {
            r45.we3 J2 = tVar.J();
            x0(this.f98247v, I, false);
            if (J2 != null) {
                J2.f389102y = 0L;
            }
            if (this.f98247v == -1) {
                gm0.j1.e().j(new com.tencent.mm.plugin.emoji.ui.v2.h(this, J2));
            }
            this.f98247v = 0;
            return;
        }
        if (i18 == 2) {
            r45.we3 J3 = tVar.J();
            x0(this.f98247v, I, false);
            j12.c.b(this.f98246u.f297152e, this);
            if (J3 != null) {
                J3.f389102y = 0L;
            }
            if (this.f98247v == -1) {
                gm0.j1.e().j(new com.tencent.mm.plugin.emoji.ui.v2.h(this, J3));
            }
            this.f98247v = 2;
            return;
        }
        if (i18 == 3) {
            x0(this.f98247v, I, false);
            this.f98247v = 1;
            return;
        }
        android.view.View view4 = this.f98244s;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionListUnKnow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionListUnKnow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f98241p.setVisibility(8);
        this.f98245t.setText(com.tencent.mm.R.string.byu);
    }

    public abstract int n0();

    public final void o0(j12.i iVar, int i17) {
        int i18;
        int i19;
        if (iVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "item is null.");
            return;
        }
        boolean g17 = this.f98246u.g(i17);
        boolean z17 = false;
        if (iVar.f297166a == j12.h.cellset) {
            r45.kj0 kj0Var = iVar.f297169d;
            if (kj0Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "banner set is null. do nothing");
                return;
            } else {
                y12.m.a(getContext(), kj0Var, false);
                return;
            }
        }
        r45.zj0 zj0Var = iVar.f297167b;
        if (zj0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "summary is null. do nothing");
            return;
        }
        if (q0() && com.tencent.mm.plugin.emoji.model.o.a().f97588d) {
            z17 = true;
        }
        java.lang.String valueOf = java.lang.String.valueOf(i17 + 1);
        com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct emoticonStoreActionStruct = this.G;
        emoticonStoreActionStruct.p(valueOf);
        emoticonStoreActionStruct.u(zj0Var.f392128d);
        emoticonStoreActionStruct.q(z17 ? zj0Var.f392147z : zj0Var.f392145x);
        emoticonStoreActionStruct.f56072f = 3;
        emoticonStoreActionStruct.r(java.lang.String.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.l(zj0Var.D)));
        emoticonStoreActionStruct.t(java.lang.String.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.n(zj0Var.D)));
        emoticonStoreActionStruct.s(com.tencent.mm.plugin.emoji.model.EmojiLogic.m(zj0Var.D));
        emoticonStoreActionStruct.v(iVar.f297176k);
        emoticonStoreActionStruct.k();
        if (q0()) {
            if (i17 >= 0 && i17 < this.f98246u.f()) {
                i19 = 3;
            } else if (i17 < this.f98246u.f() || i17 >= this.f98246u.k() + this.f98246u.f()) {
                i19 = 1;
            } else {
                i18 = 19;
            }
            y12.m.d(getContext(), zj0Var, false, i19, iVar.f297171f, iVar.f297170e, thisActivity().getIntent().getStringExtra("to_talker_name"), 5, this.G, g17, this.H);
        }
        i18 = 2;
        i19 = i18;
        y12.m.d(getContext(), zj0Var, false, i19, iVar.f297171f, iVar.f297170e, thisActivity().getIntent().getStringExtra("to_talker_name"), 5, this.G, g17, this.H);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        this.K = true;
        j12.b r07 = r0();
        this.f98246u = r07;
        r07.f297153f = this;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.dez);
        this.f98244s = findViewById;
        this.f98245t = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.df9);
        android.view.View inflate = getActivityLayoutInflater().inflate(com.tencent.mm.R.layout.a7p, (android.view.ViewGroup) null);
        this.f98243r = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "initMoreBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "initMoreBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int a17 = ym5.x.a(getContext(), 12.0f);
        h22.f fVar = new h22.f(false, false, false, 0L, 0, 0, 0, 127, null);
        fVar.f278298c = true;
        fVar.f278301f = a17;
        fVar.f278296a = true;
        fVar.f278302g = a17;
        fVar.f278299d = 5000L;
        int a18 = ym5.x.a(getContext(), 19.04f);
        int a19 = ym5.x.a(getContext(), 24.0f);
        int a27 = ym5.x.a(getContext(), 176.0f);
        android.view.View inflate2 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.a8a, (android.view.ViewGroup) null, false);
        this.f98235g = inflate2;
        inflate2.setBackgroundResource(com.tencent.mm.R.color.BW_93);
        this.f98236h = (com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView) this.f98235g.findViewById(com.tencent.mm.R.id.de9);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, a27);
        layoutParams.setMargins(0, a18, 0, a19);
        this.f98236h.setLayoutParams(layoutParams);
        android.content.Context context = this.f98236h.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        h22.c cVar = new h22.c(context, new java.util.LinkedList());
        this.f98237i = cVar;
        this.f98236h.b(fVar, cVar);
        this.f98238m = new i22.b();
        android.widget.ListView listView = (android.widget.ListView) findViewById(android.R.id.list);
        this.f98242q = listView;
        listView.addHeaderView(this.f98235g);
        if (!q0()) {
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2HotBarView emojiStoreV2HotBarView = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2HotBarView(getContext());
            this.f98240o = emojiStoreV2HotBarView;
            emojiStoreV2HotBarView.setDesignerEmojiViewVisibility(8);
            this.f98240o.setDesignerCatalogViewPadding(false);
            this.f98242q.addHeaderView(this.f98240o);
        }
        this.f98242q.addFooterView(this.f98243r);
        this.f98242q.setAdapter((android.widget.ListAdapter) this.f98246u);
        if (q0()) {
            this.f98242q.setOnItemClickListener(this);
        } else {
            ((i12.s) this.f98246u).f287241r = this;
        }
        this.f98242q.setOnScrollListener(this);
        this.f98242q.setLongClickable(false);
        this.f98242q.setOnTouchListener(new com.tencent.mm.plugin.emoji.ui.v2.f(this));
        this.f98246u.getClass();
        com.tencent.mm.ui.base.MMPullDownView mMPullDownView = (com.tencent.mm.ui.base.MMPullDownView) findViewById(com.tencent.mm.R.id.ill);
        this.f98241p = mMPullDownView;
        if (mMPullDownView != null) {
            mMPullDownView.setTopViewVisible(false);
            this.f98241p.setAtTopCallBack(this);
            this.f98241p.setOnBottomLoadDataListener(this);
            this.f98241p.setAtBottomCallBack(this);
            this.f98241p.setBottomViewVisible(false);
            this.f98241p.setIsBottomShowAll(false);
            this.f98241p.setIsReturnSuperDispatchWhenCancel(true);
        }
        if (this.I) {
            p0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.emoji.model.j0 j0Var = this.L;
        if (j0Var != null) {
            j0Var.b(i17, i18, intent);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "mPayOrDownloadComponent have no init.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView emojiStoreV3BannerView = this.f98236h;
        if (emojiStoreV3BannerView != null) {
            emojiStoreV3BannerView.requestLayout();
        }
        setRequestedOrientation(1);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        if (!com.tencent.mm.plugin.emoji.model.EmojiLogic.a()) {
            this.f98233e = al5.p0.N(((androidx.appcompat.app.AppCompatActivity) thisActivity()).getSupportActionBar());
            android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f487908ba, (android.view.ViewGroup) null);
            this.f98232d = new com.tencent.mm.ui.j(inflate);
            inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            this.f98233e.I(new android.graphics.drawable.ColorDrawable(getResources().getColor(android.R.color.transparent)));
            this.f98233e.F(false);
            this.f98233e.B(false);
            this.f98233e.E(false);
            this.f98233e.D(true);
            this.f98233e.y(inflate);
            this.f98233e.L();
            if (com.tencent.mm.plugin.emoji.model.EmojiLogic.u().booleanValue()) {
                this.f98232d.f(com.tencent.mm.R.string.byw);
            } else {
                this.f98232d.f(com.tencent.mm.R.string.byb);
            }
            this.f98232d.c(new com.tencent.mm.plugin.emoji.ui.v2.d(this));
            showOptionMenu(true);
            addIconOptionMenu(0, com.tencent.mm.R.raw.actionbar_setting_icon, new com.tencent.mm.plugin.emoji.ui.v2.e(this));
        }
        this.N.alive();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().add(this);
        if (getBounceView() != null) {
            getBounceView().setStart2EndBgColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        setHasOptionsMenu(false);
        return onCreateView;
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        j12.b bVar = this.f98246u;
        if (bVar != null) {
            bVar.a();
            this.f98246u = null;
        }
        this.N.dead();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().remove(this);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        int headerViewsCount = i17 - this.f98242q.getHeaderViewsCount();
        if (headerViewsCount < 0 || headerViewsCount >= this.f98246u.getCount()) {
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        j12.i item = this.f98246u.getItem(headerViewsCount);
        o0(item, headerViewsCount);
        if (q0() && this.f98246u.k() > 0 && headerViewsCount >= this.f98246u.f() && headerViewsCount < this.f98246u.f() + this.f98246u.k() && item.f297167b != null) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            r45.zj0 zj0Var = item.f297167b;
            g0Var.d(13223, 1, zj0Var.f392128d, zj0Var.f392130f, 1, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        if (android.text.TextUtils.isEmpty(str) || !str.equals("delete_group") || (n3Var = this.M) == null) {
            return;
        }
        n3Var.sendEmptyMessageDelayed(131074, 50L);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        gm0.j1.n().f273288b.q(411, this);
        gm0.j1.n().f273288b.q(com.tencent.wxmm.v2helper.EMethodSetNgStrength, this);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        j12.f fVar;
        super.onResume();
        this.f98236h.c();
        this.f98237i.z();
        gm0.j1.n().f273288b.a(411, this);
        gm0.j1.n().f273288b.a(com.tencent.wxmm.v2helper.EMethodSetNgStrength, this);
        if (this.I) {
            j12.b bVar = this.f98246u;
            if (bVar != null && (fVar = bVar.f297152e) != null) {
                fVar.d();
                this.f98246u.m();
            }
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (((java.lang.Boolean) c17.l(208900, bool)).booleanValue()) {
                I0(false);
                gm0.j1.u().c().w(208900, bool);
            }
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        int i27;
        int i28;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onSceneEnd errType:%d,errCode:%d,errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.ProgressDialog progressDialog = this.f98234f;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f98234f.dismiss();
        }
        int type = m1Var.getType();
        if (type != 411) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreV2BaseFragment", "unknow scene type.");
            return;
        }
        if (m1Var instanceof z12.t) {
            z12.t tVar = (z12.t) m1Var;
            int n07 = n0();
            int i29 = tVar.f469362f;
            if (i29 == n07) {
                if (tVar.J() != null) {
                    if (this.f98246u.c() > 0 || !q0()) {
                        i19 = 0;
                    } else {
                        i19 = tVar.J().f389097t == null ? 0 : tVar.J().f389097t.size();
                        this.f98246u.o(i19);
                    }
                    i27 = tVar.J().f389094q;
                    i28 = tVar.J().f389095r;
                } else {
                    i19 = 0;
                    i27 = 0;
                    i28 = 0;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onSceneEnd setSize:%d hotcount:%d recentHotCount:%d type:%d getSceneType:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(type), java.lang.Integer.valueOf(i29));
                j12.b bVar = this.f98246u;
                if (bVar != null && bVar.k() <= 0 && q0()) {
                    j12.b bVar2 = this.f98246u;
                    bVar2.p(i27 + bVar2.c());
                    this.f98246u.q(i28);
                }
                m0(i17, i18, m1Var);
                if (q0()) {
                    if (tVar.J() != null && tVar.J().f389097t != null && tVar.J().f389097t.size() > 0) {
                        for (int i37 = 0; i37 < tVar.J().f389097t.size(); i37++) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13223, 0, java.lang.Integer.valueOf(((r45.kj0) tVar.J().f389097t.get(i37)).f378729g), ((r45.kj0) tVar.J().f389097t.get(i37)).f378727e, 0);
                        }
                    }
                    if (tVar.J().f389095r <= 0 || tVar.J().f389086f == null || tVar.J().f389086f.size() <= tVar.J().f389094q + tVar.J().f389095r) {
                        return;
                    }
                    for (int i38 = 0; i38 < tVar.J().f389095r; i38++) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13223, 0, ((r45.zj0) tVar.J().f389086f.get(tVar.J().f389094q + i38)).f392128d, ((r45.zj0) tVar.J().f389086f.get(tVar.J().f389094q + i38)).f392130f, 1);
                    }
                }
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
            if (this.f98247v == 0 || this.D) {
                yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            } else {
                w0(true, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[onScrollStateChanged] startLoadRemoteEmoji.");
            }
        }
        if (i17 == 0) {
            t0();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        h22.h hVar = this.f98236h.f98492h;
        if (hVar != null) {
            hVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void onVisibilityChanged(boolean z17) {
        super.onVisibilityChanged(z17);
        h22.c cVar = this.f98237i;
        if (cVar == null) {
            return;
        }
        cVar.f278287m = z17;
    }

    public void p0() {
        int i17;
        int i18;
        this.f98231J = true;
        this.F = java.lang.System.currentTimeMillis();
        r45.gd5 gd5Var = new r45.gd5();
        long j17 = this.F;
        gd5Var.f375141f = j17;
        this.G.f56070d = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "initeData: %s", java.lang.Long.valueOf(j17));
        try {
            this.B = gd5Var.toByteArray();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.EmojiStoreV2BaseFragment", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.emoji.model.j0 j0Var = new com.tencent.mm.plugin.emoji.model.j0();
        this.L = j0Var;
        j0Var.f97559d = thisActivity();
        com.tencent.mm.plugin.emoji.model.j0 j0Var2 = this.L;
        j0Var2.f97560e = this;
        j0Var2.f97556a = this.f98246u;
        if (q0()) {
            this.L.f97561f = 1;
        } else {
            this.L.f97561f = 2;
        }
        this.L.f97562g = this;
        this.C = thisActivity().getIntent().getIntExtra("preceding_scence", 5);
        n0();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        r45.we3 z07 = com.tencent.mm.storage.n5.f().e().z0(n0());
        if (z07 != null) {
            z07.f389102y = 0L;
        }
        com.tencent.mm.plugin.emoji.model.s I = z12.t.I(z07);
        n0();
        if (I != null && I.f97600b.size() > 0) {
            this.E = true;
            android.view.View view = this.f98244s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "loadCache", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "loadCache", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f98241p.setVisibility(0);
            x0(this.f98247v, I, true);
            if (z07 != null) {
                java.util.LinkedList linkedList = z07.f389097t;
                r3 = linkedList != null ? linkedList.size() : 0;
                int i19 = z07.f389094q;
                i18 = z07.f389095r;
                i17 = r3;
                r3 = i19;
            } else {
                i17 = 0;
                i18 = 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "load cache hotcount:%d type:%d", java.lang.Integer.valueOf(r3), java.lang.Integer.valueOf(n0()));
            if (this.f98246u != null && q0()) {
                this.f98246u.p(r3 + i17);
                this.f98246u.q(i18);
            }
            j12.c.b(this.f98246u.f297152e, this);
        }
        s0(this.B);
        gm0.j1.n().f273288b.g(this.f98251z);
    }

    public abstract boolean q0();

    public abstract j12.b r0();

    @Override // com.tencent.mm.plugin.emoji.model.i0
    public void s(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.A = new z12.l(str, str2, str3, null, str5);
        gm0.j1.n().f273288b.g(this.A);
    }

    public void s0(byte[] bArr) {
        int n07 = n0();
        int i17 = this.C;
        if (bArr != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[refreshNetSceneGetEmotionList] request buffer %s", bArr.toString());
            this.f98251z = new z12.t(n07, bArr, i17, false);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[refreshNetSceneGetEmotionList] request buffer is null.");
            this.f98251z = new z12.t(n07, i17);
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z17) {
        h22.h hVar;
        super.setUserVisibleHint(z17);
        this.I = z17;
        if (!this.f98231J && this.K) {
            p0();
        } else if (z17) {
            t0();
        }
        boolean z18 = this.I;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.M;
        if (z18) {
            if (n3Var != null) {
                n3Var.sendEmptyMessageDelayed(131077, 0L);
                return;
            }
            return;
        }
        if (n3Var != null) {
            n3Var.removeMessages(131077);
        }
        com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView emojiStoreV3BannerView = this.f98236h;
        if (emojiStoreV3BannerView == null || (hVar = emojiStoreV3BannerView.f98492h) == null) {
            return;
        }
        hVar.removeCallbacksAndMessages(null);
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean supportNavigationSwipeBack() {
        return false;
    }

    public void t0() {
    }

    public void u0(java.lang.String str) {
        if (isFinishing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[showLoadingDialog] acitivity is finished.");
        } else {
            this.f98234f = db5.e1.Q(thisActivity(), getString(com.tencent.mm.R.string.f490573yv), str, true, true, new com.tencent.mm.plugin.emoji.ui.v2.i(this));
        }
    }

    public void w0(boolean z17, boolean z18) {
        if (this.D) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "isLoading");
            return;
        }
        this.D = true;
        if (z17) {
            android.view.View view = this.f98243r;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "startLoadRemoteEmoji", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "startLoadRemoteEmoji", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        s0(this.B);
        gm0.j1.n().f273288b.g(this.f98251z);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[startLoadRemoteEmoji] doScene GetEmotionListNetScene");
        if (z17 || z18) {
            return;
        }
        u0(getString(com.tencent.mm.R.string.f490604zq));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x0(int r6, com.tencent.mm.plugin.emoji.model.s r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment.x0(int, com.tencent.mm.plugin.emoji.model.s, boolean):void");
    }
}

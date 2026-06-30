package com.tencent.mm.plugin.card.sharecard.ui;

/* loaded from: classes15.dex */
public class ShareCardListUI extends com.tencent.mm.plugin.card.base.CardBaseUI implements tt1.l, l75.q0 {
    public static final /* synthetic */ int T = 0;
    public java.lang.String A = null;
    public boolean B = true;
    public boolean C = false;
    public boolean D = true;
    public boolean E = true;
    public boolean F = false;
    public java.lang.String G = "";
    public boolean H = false;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f94720J = false;
    public int K = 0;
    public boolean L = false;
    public long M = 0;
    public long N = 0;
    public boolean P = false;
    public long Q = 0;
    public boolean R = false;
    public boolean S = false;

    /* renamed from: w, reason: collision with root package name */
    public gu1.n f94721w;

    /* renamed from: x, reason: collision with root package name */
    public gu1.m f94722x;

    /* renamed from: y, reason: collision with root package name */
    public gu1.s f94723y;

    /* renamed from: z, reason: collision with root package name */
    public eu1.f f94724z;

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public android.widget.BaseAdapter T6() {
        return new gu1.k(getContext());
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void V6() {
        setMMTitle(com.tencent.mm.R.string.f490805av3);
        eu1.f fVar = new eu1.f(this);
        this.f94724z = fVar;
        fVar.j();
        this.K = eu1.f.b() ? 1 : eu1.f.c() ? eu1.f.f256752c ? 3 : 4 : 0;
        if (this.f94723y == null) {
            gu1.s sVar = new gu1.s(this, getContentView());
            this.f94723y = sVar;
            android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f488358r4, null);
            sVar.f275914b = inflate;
            sVar.f275915c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483575ba4);
            sVar.f275916d = (android.widget.TextView) sVar.f275914b.findViewById(com.tencent.mm.R.id.ba_);
            sVar.a();
        }
        if (this.f94721w == null) {
            android.view.View contentView = getContentView();
            gu1.n nVar = new gu1.n(this, contentView);
            this.f94721w = nVar;
            nVar.f275906c = (android.widget.ImageView) contentView.findViewById(com.tencent.mm.R.id.kbw);
            nVar.f275908e = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.kby);
            nVar.f275907d = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.kbz);
            this.f94721w.getClass();
        }
        if (this.f94722x == null) {
            gu1.m mVar = new gu1.m(this, getContentView());
            this.f94722x = mVar;
            mVar.f275899b = this.f94724z;
            if (mVar.f275898a == null) {
                android.view.View inflate2 = android.view.View.inflate(this, com.tencent.mm.R.layout.f488347qt, null);
                mVar.f275898a = inflate2;
                mVar.f275900c = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.f482881qn);
                mVar.f275903f = (android.widget.TextView) mVar.f275898a.findViewById(com.tencent.mm.R.id.mvo);
                mVar.f275901d = (android.widget.LinearLayout) mVar.f275898a.findViewById(com.tencent.mm.R.id.im9);
                mVar.f275902e = (android.widget.LinearLayout) mVar.f275898a.findViewById(com.tencent.mm.R.id.f485680im1);
                mVar.f275901d.setVisibility(8);
                mVar.f275902e.setVisibility(8);
                android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
                mVar.f275900c.startAnimation(rotateAnimation);
            }
            mVar.a();
            gu1.m mVar2 = this.f94722x;
            gu1.p pVar = new gu1.p(this);
            android.view.View view = mVar2.f275898a;
            if (view != null) {
                view.setOnClickListener(pVar);
            }
        }
        android.widget.LinearLayout linearLayout = this.f94635h;
        if (linearLayout != null) {
            linearLayout.addView(this.f94723y.f275914b);
        }
        android.widget.LinearLayout linearLayout2 = this.f94636i;
        if (linearLayout2 != null) {
            linearLayout2.addView(this.f94722x.f275898a);
        }
        this.f94631d.setVisibility(0);
        this.f94631d.setOnScrollListener(new gu1.q(this));
        if (getIntent() == null || !getIntent().getBooleanExtra("KEY_IS_SHOW_SHARE_CARD_ENTRANCE_TIPS", true)) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_CARD_IS_SHOW_SHARE_CARD_ENTRANCE_TIP_INT_SYNC;
            java.lang.Integer num = (java.lang.Integer) c17.m(u3Var, 0);
            if (num != null && num.intValue() != 1) {
                gm0.j1.u().c().x(u3Var, 1);
            }
        } else {
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_CARD_IS_SHOW_SHARE_CARD_ENTRANCE_TIP_INT_SYNC;
            java.lang.Integer num2 = (java.lang.Integer) c18.m(u3Var2, 0);
            if (num2 == null || num2.intValue() != 1) {
                gm0.j1.u().c().x(u3Var2, 1);
                lu1.r.f(this, com.tencent.mm.R.layout.ra, com.tencent.mm.R.string.avc, "");
            }
        }
        this.A = getIntent().getStringExtra("KEY_CARD_TP_ID");
        java.lang.String stringExtra = getIntent().getStringExtra("key_layout_buff");
        this.G = stringExtra;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.B = false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.A)) {
            return;
        }
        this.C = true;
    }

    @Override // tt1.l
    public void W0() {
        this.f94724z.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long F = gm0.j1.u().f273153f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardDataMgr", "updateShareCardCategory()");
        java.util.ArrayList arrayList = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_local_city_category_info_list");
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_other_city_category_info_list");
        if (arrayList2 == null) {
            arrayList2 = new java.util.ArrayList();
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            fu1.f fVar = (fu1.f) arrayList.get(i17);
            xt1.t0.nj().b1(fVar.f266838a, 10, fVar.f266839b);
        }
        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
            fu1.f fVar2 = (fu1.f) arrayList2.get(i18);
            xt1.t0.nj().b1(fVar2.f266838a, 0, fVar2.f266839b);
        }
        gm0.j1.u().f273153f.w(java.lang.Long.valueOf(F));
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardDataMgr", "updateShareCardCategory  >> updateCategoryInfo use time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        this.B = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardListUI", "onDBchange() shouldRefreshDataOnDbChange %s  mIsActive %s hasLocationInfo %s", java.lang.Boolean.valueOf(this.C), java.lang.Boolean.valueOf(this.f94638n), java.lang.Boolean.valueOf(this.f94720J));
        if (this.C && this.f94638n && this.f94720J) {
            n7(false);
        } else {
            p7();
        }
        this.C = false;
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public boolean X6() {
        return true;
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void b7(tt1.j jVar, int i17) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardDetailUI.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardListUI", "card tp id:" + jVar.f());
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardListUI", "card id:" + jVar.g());
        intent.putExtra("key_card_id", xt1.t0.nj().J0(jVar.f()));
        intent.putExtra("key_card_tp_id", jVar.f());
        intent.putExtra("key_is_share_card", true);
        intent.putExtra("key_from_scene", 3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.String f17 = jVar.f();
        if (android.text.TextUtils.isEmpty(f17)) {
            return;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_other_city_top_info_list");
        if (arrayList2 == null) {
            arrayList2 = new java.util.ArrayList();
        }
        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
            fu1.n nVar = (fu1.n) arrayList2.get(i18);
            if (nVar != null && f17.equals(nVar.f266862a) && nVar.f266863b == 1) {
                arrayList2.set(i18, nVar);
                xt1.t0.Di().b("key_share_card_other_city_top_info_list", arrayList2);
                return;
            }
        }
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void d7(tt1.j jVar, int i17) {
        if (jVar != null) {
            eu1.f.r(jVar.f());
        }
        super.d7(jVar, i17);
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void e7(tt1.j jVar) {
        super.e7(jVar);
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void f7() {
        if (this.I || this.H) {
            i7();
            return;
        }
        this.I = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardListUI", "onLocationFail()");
        l7();
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void g7() {
        this.f94720J = true;
        if (!this.H) {
            this.H = true;
            l7();
            i7();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardListUI", "onLocationFinish, has do GetShareCardLayout,don't get again");
            if (this.L) {
                i7();
            }
        }
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void h7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardListUI", "onMPermissionGranted LocationPermissionGranted " + this.L);
        if (this.L) {
            return;
        }
        this.L = true;
        ((ku5.t0) ku5.t0.f312615d).h(new gu1.o(this), "MicroMsg.ShareCardListUI");
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 69, null, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardListUI", "checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(Di));
        this.L = Di;
        if (!Di) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardListUI", "location permission is denied, doGetLayout");
            l7();
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new gu1.o(this), "MicroMsg.ShareCardListUI");
        }
    }

    public final void l7() {
        if (this.f94724z.k() && this.f94724z.l()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardListUI", "doGetLayout() no data to load");
            this.E = true;
            return;
        }
        if (!this.f94724z.k() || !this.f94724z.l()) {
            this.D = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardListUI", "doGetLayout() >> doNetSceneGetCardsHomePageLayout()");
        m7();
        xt1.t0.ij().a("", "", 4);
    }

    public final void m7() {
        if (this.F) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardListUI", "doNetSceneGetCardsHomePageLayout, isDoingGetData is true");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.G) && !eu1.f.b() && !eu1.f.c() && !eu1.f.b() && !eu1.f.c()) {
            gu1.m mVar = this.f94722x;
            mVar.f275901d.setVisibility(0);
            mVar.f275902e.setVisibility(8);
            this.f94631d.setEmptyView(null);
            this.f94631d.invalidate();
            this.S = true;
        }
        if (this.D && !com.tencent.mm.sdk.platformtools.t8.K0(this.G)) {
            this.G = "";
        }
        this.F = true;
        gm0.j1.n().f273288b.g(new fu1.b(xt1.t0.ij().f449280d, xt1.t0.ij().f449281e, this.G));
    }

    public final void n7(boolean z17) {
        i11.e eVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardListUI", "doRefreshData() >> updateView() shouldGetLayout %s fromOnresume %s", java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(z17));
        if (this.B) {
            this.B = false;
            this.H = false;
            this.D = true;
            this.G = "";
            if (!z17) {
                m7();
            } else if (this.L && this.P && (eVar = this.f94641q) != null) {
                ((i11.h) eVar).k(this.f94645u, true);
                com.tencent.mm.plugin.report.service.b1.f(22, 10);
            }
        }
        p7();
    }

    public final void o7() {
        int intExtra = getIntent().getIntExtra("key_from_scene", 22);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean e17 = bk0.a.g().e(262152, 266256);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b17 = bk0.a.g().b(262152, 266256);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean f17 = bk0.a.g().f(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_NEW_CARD_REDDOT_WORDING_STRING_SYNC, com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_REDDOT_WORDING_STRING_SYNC);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean f18 = bk0.a.g().f(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_NEW_CARD_ICON_STRING_SYNC, com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_ICON_STRING_SYNC);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_REDOT_WORDING_STRING_SYNC, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (e17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "ShareCardListUI", 0, "", "", 2, java.lang.Integer.valueOf(intExtra), "", 0, str2);
            return;
        }
        if (b17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "ShareCardListUI", 0, "", "", 1, java.lang.Integer.valueOf(intExtra), "", 0, str2);
            return;
        }
        if (f17 && !f18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "ShareCardListUI", 0, "", "", 3, java.lang.Integer.valueOf(intExtra), "", 0, str2);
            return;
        }
        if (f17 && f18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "ShareCardListUI", 0, "", "", 4, java.lang.Integer.valueOf(intExtra), "", 0, str2);
        } else if (f18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "ShareCardListUI", 0, "", "", 5, java.lang.Integer.valueOf(intExtra), "", 0, str2);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "ShareCardListUI", 0, "", "", 0, java.lang.Integer.valueOf(intExtra), "", 0, str2);
        }
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.M = currentTimeMillis;
        this.N = currentTimeMillis;
        initView();
        this.f94721w.getClass();
        this.f94722x.getClass();
        this.f94723y.getClass();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.webview.x.CTRL_INDEX, this);
        xt1.t0.mj().c(this);
        o7();
        xt1.t0.nj().add(this);
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (this.L) {
            i7();
        }
        this.f94721w.getClass();
        this.f94722x.f275899b = null;
        this.f94723y.getClass();
        this.f94724z.getClass();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.webview.x.CTRL_INDEX, this);
        xt1.t0.mj().d(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardDataMgr", "delelteAllIllegalStatusCard()");
        s75.d.b(new eu1.e(), "delelteAllIllegalStatusCard");
        xt1.t0.nj().remove(this);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.N;
        if (android.text.TextUtils.isEmpty(this.A)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13219, "ShareCardListUI", 1, "", "", java.lang.Long.valueOf(currentTimeMillis));
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13219, "ShareCardListUI", 0, "", "", java.lang.Long.valueOf(currentTimeMillis));
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        o7();
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("KEY_CARD_TP_ID");
            this.A = stringExtra;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            this.C = true;
        }
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        this.B = true;
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.B = false;
        this.C = true;
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        n7(true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.M;
        if (j17 != 0) {
            int i17 = (int) (currentTimeMillis - j17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
            iDKey.SetID(281);
            iDKey.SetKey(56);
            iDKey.SetValue(1L);
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
            iDKey2.SetID(281);
            iDKey2.SetKey(57);
            iDKey2.SetValue(i17);
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
            this.M = 0L;
        }
        super.onResume();
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        super.onSceneEnd(i17, i18, str, m1Var);
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof fu1.b) {
                if (this.S) {
                    this.S = false;
                    this.f94722x.f275901d.setVisibility(8);
                    this.f94631d.setEmptyView(this.f94633f);
                    this.f94631d.invalidate();
                }
                this.F = false;
                this.E = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardListUI", "share card list ui, onSceneEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        if (m1Var instanceof fu1.b) {
            fu1.b bVar = (fu1.b) m1Var;
            this.F = false;
            this.G = bVar.f266820g;
            this.f94724z.q(bVar.f266819f, this.D);
            if (!this.f94724z.k() || !this.f94724z.l()) {
                this.D = false;
            }
            this.E = this.f94724z.k() && this.f94724z.l();
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardListUI", "NetSceneGetShareCardsLayout() >> updateView()");
            p7();
        }
    }

    public final void p7() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.Q;
        if (!this.R || currentTimeMillis >= 1000) {
            this.R = true;
            if (currentTimeMillis < 500) {
                com.tencent.mm.sdk.platformtools.u3.i(new gu1.r(this), 500L);
                return;
            }
            int i17 = this.K;
            if (i17 == 0 || i17 == 4 || ((i17 == 2 && (!eu1.f.b() || !eu1.f.c())) || ((this.K == 1 && (!eu1.f.b() || eu1.f.c())) || (this.K == 3 && (!eu1.f.c() || eu1.f.b()))))) {
                this.K = eu1.f.b() ? 1 : eu1.f.c() ? eu1.f.f256752c ? 3 : 4 : 0;
            }
            xt1.t0.Di().b("key_share_card_show_type", java.lang.Integer.valueOf(this.K));
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardListUI", "updateView() currentType is %s, canShowLocalCity %s, canShowOtherCity %s", java.lang.Integer.valueOf(this.K), java.lang.Boolean.valueOf(eu1.f.b()), java.lang.Boolean.valueOf(eu1.f.c()));
            gu1.n nVar = this.f94721w;
            nVar.f275907d.setVisibility(0);
            android.widget.ImageView imageView = nVar.f275906c;
            com.tencent.mm.ui.MMActivity mMActivity = nVar.f275905b;
            imageView.setImageDrawable(mMActivity.getResources().getDrawable(com.tencent.mm.R.drawable.byq));
            nVar.f275907d.setText(com.tencent.mm.R.string.auy);
            nVar.f275908e.setText(com.tencent.mm.R.string.auw);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) nVar.f275906c.getLayoutParams();
            layoutParams.topMargin = mMActivity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480197r3);
            nVar.f275906c.setLayoutParams(layoutParams);
            nVar.f275906c.invalidate();
            if (eu1.f.b() || eu1.f.c()) {
                this.f94722x.a();
                this.f94723y.a();
                if (this.K == 4 && this.f94631d.getEmptyView() != null) {
                    this.f94631d.setEmptyView(null);
                    this.f94631d.invalidate();
                }
            } else {
                gu1.m mVar = this.f94722x;
                mVar.f275901d.setVisibility(8);
                mVar.f275902e.setVisibility(8);
                mVar.f275903f.setVisibility(8);
                android.view.View view = this.f94723y.f275914b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "hideItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "hideItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View emptyView = this.f94631d.getEmptyView();
                android.widget.RelativeLayout relativeLayout = this.f94633f;
                if (emptyView != relativeLayout) {
                    this.f94631d.setEmptyView(relativeLayout);
                    this.f94631d.invalidate();
                }
            }
            android.widget.BaseAdapter baseAdapter = this.f94632e;
            if (baseAdapter instanceof gu1.k) {
                gu1.k kVar = (gu1.k) baseAdapter;
                kVar.f275894q = this.K;
                kVar.f();
            }
            this.Q = java.lang.System.currentTimeMillis();
            this.R = false;
        }
    }
}

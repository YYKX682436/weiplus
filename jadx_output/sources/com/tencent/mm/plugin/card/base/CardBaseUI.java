package com.tencent.mm.plugin.card.base;

/* loaded from: classes15.dex */
public abstract class CardBaseUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, com.tencent.mm.ui.da {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f94630v = 0;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f94635h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f94636i;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.card.model.CardInfo f94640p;

    /* renamed from: q, reason: collision with root package name */
    public i11.e f94641q;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f94631d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.BaseAdapter f94632e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RelativeLayout f94633f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f94634g = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f94637m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f94638n = true;

    /* renamed from: o, reason: collision with root package name */
    public tt1.i f94639o = null;

    /* renamed from: r, reason: collision with root package name */
    public float f94642r = -85.0f;

    /* renamed from: s, reason: collision with root package name */
    public float f94643s = -1000.0f;

    /* renamed from: t, reason: collision with root package name */
    public boolean f94644t = false;

    /* renamed from: u, reason: collision with root package name */
    public final i11.c f94645u = new tt1.g(this);

    public android.widget.BaseAdapter T6() {
        return new com.tencent.mm.plugin.card.ui.k(this, U6());
    }

    public xt1.r U6() {
        return xt1.r.NORMAL_TYPE;
    }

    public abstract void V6();

    public void W6() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f94641q = i11.h.e();
    }

    public boolean X6() {
        return true;
    }

    public boolean Y6() {
        return !(this instanceof com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI);
    }

    public void Z6() {
    }

    public void a7(com.tencent.mm.plugin.card.model.CardInfo cardInfo) {
        this.f94640p = cardInfo;
        lu1.d.a(this, 0, this);
    }

    public void b7(tt1.j jVar, int i17) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardDetailUI.class);
        intent.putExtra("key_card_id", jVar.g());
        intent.addFlags(131072);
        intent.putExtra("key_from_scene", 3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/card/base/CardBaseUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/card/base/CardBaseUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (U6() == xt1.r.HOME_MEMBER_CARD_TYPE) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(11324, "ClickMemberCard", 0, "", "", 0, 0, "", 0, 0);
            g0Var.d(15767, java.lang.Integer.valueOf(((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_HOME_PAGE_CARD_NUM_INT_SYNC, 3)).intValue()), java.lang.Integer.valueOf(i17 + 1));
        } else if (U6() == xt1.r.MEMBER_CARD_TYPE) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "ClickMemberCard", 0, "", "", 0, 1, "", 0, 0);
        }
    }

    public void c7() {
    }

    public void d7(tt1.j jVar, int i17) {
        if (!X6()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseUI", "isItemClickable return false");
            return;
        }
        if (jVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseUI", "onListItemClick  item == null");
            return;
        }
        if (jVar.g().equals("PRIVATE_TICKET_TITLE") || jVar.g().equals("PRIVATE_INVOICE_TITLE")) {
            return;
        }
        if (jVar.c()) {
            b7(jVar, i17);
        } else {
            if (android.text.TextUtils.isEmpty(jVar.s0().A)) {
                return;
            }
            lu1.d.j(this, jVar.s0().A, 0);
        }
    }

    public void e7(tt1.j jVar) {
        if (!Y6()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseUI", "isItemClickable return false");
            return;
        }
        if (jVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseUI", "onListItemLongClick  item == null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jVar.u()) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(jVar.s0().f388572z1)) {
                arrayList.add(jVar.s0().f388572z1);
            } else if (jVar.m0()) {
                arrayList.add(getResources().getString(com.tencent.mm.R.string.au_));
            } else {
                arrayList.add(getResources().getString(com.tencent.mm.R.string.au9));
            }
        }
        arrayList.add(getResources().getString(com.tencent.mm.R.string.f490367t0));
        db5.e1.e(this, jVar.s0().f388568y, (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), null, new tt1.e(this, jVar, jVar.g()));
    }

    public void f7() {
    }

    public void g7() {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488328qa;
    }

    public void h7() {
    }

    public void i7() {
        i11.e eVar = this.f94641q;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f94645u);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new tt1.a(this));
        this.f94631d = (android.widget.ListView) findViewById(android.R.id.list);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.cho);
        this.f94633f = relativeLayout;
        if (relativeLayout != null) {
            this.f94631d.setEmptyView(relativeLayout);
        }
        this.f94635h = (android.widget.LinearLayout) android.view.View.inflate(getBaseContext(), com.tencent.mm.R.layout.f488337qj, null);
        this.f94636i = (android.widget.LinearLayout) android.view.View.inflate(getBaseContext(), com.tencent.mm.R.layout.f488334qg, null);
        this.f94631d.addHeaderView(this.f94635h);
        this.f94631d.addFooterView(this.f94636i);
        android.widget.BaseAdapter T6 = T6();
        this.f94632e = T6;
        boolean z17 = T6 instanceof com.tencent.mm.plugin.card.ui.r4;
        this.f94631d.setAdapter((android.widget.ListAdapter) T6);
        this.f94631d.setOnItemClickListener(new tt1.b(this));
        this.f94631d.setOnItemLongClickListener(new tt1.c(this));
        gm0.j1.n().f273288b.a(mc1.l.CTRL_INDEX, this);
        gm0.j1.n().f273288b.a(1046, this);
        android.widget.BaseAdapter baseAdapter = this.f94632e;
        tt1.i lVar = baseAdapter instanceof com.tencent.mm.plugin.card.ui.k ? new com.tencent.mm.plugin.card.ui.l((com.tencent.mm.plugin.card.ui.k) baseAdapter) : baseAdapter instanceof gu1.k ? new gu1.l((gu1.k) baseAdapter) : new com.tencent.mm.plugin.card.ui.t2((com.tencent.mm.plugin.card.ui.s2) baseAdapter);
        this.f94639o = lVar;
        lVar.onCreate();
        V6();
    }

    public void j7(boolean z17) {
        if (z17) {
            this.f94634g = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.f490604zq), true, 0, null);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f94634g;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f94634g.dismiss();
        this.f94634g = null;
    }

    public void k7(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.card.model.CardInfo cardInfo = this.f94640p;
        if (cardInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseUI", "showGiftConfirmDialog mCardInfo == null");
            return;
        }
        if (cardInfo.s0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseUI", "showGiftConfirmDialog mCardInfo.getCardTpInfo() == null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (i17 == 0) {
            if (android.text.TextUtils.isEmpty(this.f94640p.Y().f377580d) || this.f94640p.m0()) {
                sb6.append(getString(com.tencent.mm.R.string.jdx));
            } else {
                sb6.append(this.f94640p.Y().f377580d);
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f94640p.s0().f388550i);
            com.tencent.mm.plugin.card.model.CardInfo cardInfo2 = this.f94640p;
            g0Var.d(11582, "OperGift", 2, valueOf, cardInfo2.field_card_tp_id, cardInfo2.field_card_id, str);
        } else if (i17 == 1) {
            sb6.append(getString(com.tencent.mm.R.string.asi, this.f94640p.s0().f388568y));
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f94640p.s0().f388550i);
            com.tencent.mm.plugin.card.model.CardInfo cardInfo3 = this.f94640p;
            g0Var2.d(11582, "OperGift", 3, valueOf2, cardInfo3.field_card_tp_id, cardInfo3.field_card_id, str);
        }
        java.lang.String str2 = this.f94640p.s0().f388553n + "\n" + this.f94640p.s0().f388552m;
        r35.u3 u3Var = r35.t3.f369263a;
        com.tencent.mm.ui.ga controller = getController();
        java.lang.String sb7 = sb6.toString();
        java.lang.String str3 = this.f94640p.s0().f388546e;
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.f490551ya);
        tt1.f fVar = new tt1.f(this, str, z17);
        ((ez.z0) u3Var).getClass();
        r35.j1.j(controller, sb7, str3, str2, null, false, string, fVar);
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 0 && i18 == -1) {
            k7(intent.getStringExtra("Select_Conv_User"), 0, false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f273288b.q(mc1.l.CTRL_INDEX, this);
        gm0.j1.n().f273288b.q(1046, this);
        tt1.i iVar = this.f94639o;
        if (iVar != null) {
            iVar.onDestroy();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f94638n = false;
        gm0.j1.n().f273288b.q(1045, this);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardBaseUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardBaseUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 69) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.baz), false, new tt1.h(this), null);
        } else {
            h7();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f94638n = true;
        gm0.j1.n().f273288b.a(1045, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            j7(false);
            if (m1Var instanceof xt1.m0) {
                xt1.m0 m0Var = (xt1.m0) m1Var;
                int i19 = m0Var.f456527h;
                java.lang.String str2 = m0Var.f456526g;
                if (i19 == 10000) {
                    if (android.text.TextUtils.isEmpty(str2)) {
                        str2 = getString(com.tencent.mm.R.string.asj);
                    }
                    str = str2;
                }
            }
            if ((m1Var instanceof xt1.k0) || (m1Var instanceof fu1.b) || !this.f94638n) {
                return;
            }
            lu1.r.d(this, str, i18);
            return;
        }
        if (m1Var instanceof xt1.z) {
            j7(false);
            db5.e1.T(this, getResources().getString(com.tencent.mm.R.string.as6));
            xt1.t0.wi().a(4);
            this.f94639o.onNotify();
            Z6();
            return;
        }
        if (m1Var instanceof xt1.m0) {
            j7(false);
            xt1.m0 m0Var2 = (xt1.m0) m1Var;
            int i27 = m0Var2.f456527h;
            java.lang.String str3 = m0Var2.f456526g;
            if (i27 == 10000) {
                if (android.text.TextUtils.isEmpty(str3)) {
                    str3 = getString(com.tencent.mm.R.string.asj);
                }
                lu1.r.d(this, str3, i27);
                return;
            }
            com.tencent.mm.plugin.card.model.CardInfo cardInfo = this.f94640p;
            if (cardInfo != null) {
                r45.rt i07 = cardInfo.i0();
                i07.f385181d = 3;
                this.f94640p.G(i07);
                if (!xt1.t0.cj().update(this.f94640p, new java.lang.String[0])) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseUI", "update newSerial fail, cardId = %s", this.f94640p.field_card_id);
                }
            }
            this.f94639o.onNotify();
            Z6();
        }
    }
}

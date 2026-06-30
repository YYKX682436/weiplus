package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class CardIndexUI extends com.tencent.mm.plugin.card.base.CardBaseUI {
    public android.widget.ImageView A;
    public android.widget.LinearLayout B;
    public long C = 0;
    public int D = -1;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f94867w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f94868x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f94869y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f94870z;

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public android.widget.BaseAdapter T6() {
        return 3 == this.D ? new com.tencent.mm.plugin.card.ui.j4(this, U6()) : new com.tencent.mm.plugin.card.ui.k(this, U6());
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public xt1.r U6() {
        int i17 = this.D;
        return 1 == i17 ? xt1.r.MEMBER_CARD_TYPE : 3 == i17 ? ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_HOME_PAGE_HAS_LOAD_NEW_ENTRANCE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue() ? xt1.r.GENERAL_WITHOUT_INVOICE_TYPE : xt1.r.GENERAL_TYPE : xt1.r.NORMAL_TYPE;
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void V6() {
        int i17 = this.D;
        if (1 == i17) {
            setMMTitle(com.tencent.mm.R.string.f490798au2);
        } else if (3 == i17) {
            setMMTitle(com.tencent.mm.R.string.f490811aw3);
        } else {
            setMMTitle(com.tencent.mm.R.string.aub);
        }
        this.f94869y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kby);
        this.f94870z = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kbz);
        this.A = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.kbw);
        this.f94867w = findViewById(com.tencent.mm.R.id.b9v);
        this.f94868x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.b9w);
        this.B = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.kbx);
        android.view.View view = this.f94867w;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardIndexUI", "initBaseUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardIndexUI", "initBaseUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f94870z.setVisibility(0);
        this.f94869y.setVisibility(0);
        this.A.setVisibility(8);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.B.getLayoutParams();
        layoutParams.topMargin = com.tencent.mm.sdk.platformtools.j.d(this, 100.0f);
        this.B.setLayoutParams(layoutParams);
        int i18 = this.D;
        if (1 == i18) {
            this.f94870z.setText(getString(com.tencent.mm.R.string.atp));
            this.f94869y.setText(getString(com.tencent.mm.R.string.ato));
        } else if (3 == i18) {
            this.f94870z.setText(getString(com.tencent.mm.R.string.atw));
            this.f94869y.setText(getString(com.tencent.mm.R.string.atv));
        } else {
            this.f94870z.setText(getString(com.tencent.mm.R.string.auq));
            this.f94869y.setText(getString(com.tencent.mm.R.string.f490804av2));
        }
        if (this.D == 3) {
            this.f94631d.setEmptyView(null);
            this.f94633f.setVisibility(8);
        }
        this.f94868x.setOnClickListener(new com.tencent.mm.plugin.card.ui.o2(this));
        if (this.D == 3 && ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_HOME_PAGE_HAS_LOAD_NEW_ENTRANCE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardIndexUI", "has load new entrance");
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_HOME_PAGE_SECOND_ENTRANCE_STRING_SYNC, null);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            try {
                r45.ay5 ay5Var = new r45.ay5();
                ay5Var.parseFrom(str.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
                l7(ay5Var.f370371d);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardIndexUI", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        if (getIntent() != null) {
            this.D = getIntent().getIntExtra("key_card_type", -1);
        }
        super.initView();
    }

    public final void l7(java.util.List list) {
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.zx5 zx5Var = (r45.zx5) it.next();
                if (zx5Var.f392459d == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardIndexUI", "should update new invoice");
                    java.util.LinkedList<r45.mu> linkedList = zx5Var.f392460e;
                    this.f94635h.removeAllViews();
                    this.f94635h.setPadding(0, 0, 0, 0);
                    if (linkedList != null && !linkedList.isEmpty()) {
                        int i17 = 0;
                        for (r45.mu muVar : linkedList) {
                            android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488332qe, null);
                            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.byp);
                            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.byr);
                            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.byo);
                            cdnImageView.setUrl(muVar.f380826e);
                            textView.setText(muVar.f380825d);
                            textView2.setText(muVar.f380827f);
                            if (muVar.f380828g > 0) {
                                inflate.setOnClickListener(new com.tencent.mm.plugin.card.ui.p2(this, muVar));
                            }
                            this.f94635h.addView(inflate);
                            if (i17 == 0) {
                                this.f94635h.setPadding(0, i65.a.b(this, 13), 0, 0);
                            } else {
                                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) inflate.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.topMargin = i65.a.b(this, 6);
                                    inflate.setLayoutParams(layoutParams);
                                }
                            }
                            i17++;
                        }
                    }
                }
            }
        }
        if (this.f94635h.getChildCount() == 0 && this.f94632e.getCount() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardIndexUI", "show empty view");
            this.f94633f.setVisibility(0);
            this.f94631d.setVisibility(8);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardIndexUI", "hide empty view");
            this.f94633f.setVisibility(8);
            this.f94631d.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardIndexUI", "oncreate");
        this.C = java.lang.System.currentTimeMillis();
        initView();
        gm0.j1.n().f273288b.a(1054, this);
        xt1.t0.wi().a(1);
        int i17 = xt1.t0.Ui().f449268c;
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        if (bk0.a.g().e(262152, 266256) || i17 > 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardPackageListView", 0, "", "", 1, 0, "", 0, "");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardPackageListView", 0, "", "", 0, 0, "", 0, "");
        }
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f273288b.q(1054, this);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13219, "CardPackageListView", 0, "", "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.C));
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ay5 ay5Var;
        super.onSceneEnd(i17, i18, str, m1Var);
        if (i17 == 0 && i18 == 0 && (m1Var instanceof xt1.k0)) {
            xt1.k0 k0Var = (xt1.k0) m1Var;
            if (k0Var.f456513f) {
                android.widget.BaseAdapter baseAdapter = this.f94632e;
                if (baseAdapter instanceof com.tencent.mm.plugin.card.ui.k) {
                    ((com.tencent.mm.plugin.card.ui.k) baseAdapter).r(false);
                    ((com.tencent.mm.plugin.card.ui.k) this.f94632e).r(true);
                    ((com.tencent.mm.plugin.card.ui.k) this.f94632e).q();
                }
            }
            if (!((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_HOME_PAGE_HAS_LOAD_NEW_ENTRANCE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue() || (ay5Var = k0Var.f456515h) == null) {
                return;
            }
            l7(ay5Var.f370371d);
            android.widget.BaseAdapter baseAdapter2 = this.f94632e;
            if (baseAdapter2 instanceof com.tencent.mm.plugin.card.ui.k) {
                ((com.tencent.mm.plugin.card.ui.k) baseAdapter2).r(false);
                ((com.tencent.mm.plugin.card.ui.k) this.f94632e).r(true);
                ((com.tencent.mm.plugin.card.ui.k) this.f94632e).q();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}

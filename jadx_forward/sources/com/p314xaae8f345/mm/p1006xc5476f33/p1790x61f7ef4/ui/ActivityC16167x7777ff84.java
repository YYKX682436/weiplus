package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/label/ui/ContactLabelCreateUI;", "Lcom/tencent/mm/plugin/label/ui/ContactLabelBaseUI;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelCreateUI */
/* loaded from: classes11.dex */
public final class ActivityC16167x7777ff84 extends com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16166xa7327119 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f224745o = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 f224746e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f224747f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f224748g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f224749h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f224750i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f224751m;

    /* renamed from: n, reason: collision with root package name */
    public final int f224752n = 36;

    public final void W6() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f224746e;
        if (c21486x59d05a04 != null) {
            android.text.Editable text = c21486x59d05a04.getText();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactLabelCreateUI", "updateCanSaveStatus " + r26.n0.u0(text).toString());
            if (!r26.n0.N(r0)) {
                android.widget.Button button = this.f224748g;
                if (button != null) {
                    button.setEnabled(true);
                    return;
                }
                return;
            }
            android.widget.Button button2 = this.f224748g;
            if (button2 != null) {
                button2.setEnabled(false);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16166xa7327119, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e3o;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37
    /* renamed from: onClickDialogSpaceOnHalfScreenMode */
    public boolean mo55426xe0085496() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "onClickDialogSpaceOnHalfScreenMode");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16166xa7327119, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f224749h = getIntent().getStringExtra("Contact_ReportSessionId");
        this.f224750i = getIntent().getStringExtra("label_username");
        this.f224746e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04) findViewById(com.p314xaae8f345.mm.R.id.f565435sz1);
        this.f224747f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dhl);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f224746e;
        if (c21486x59d05a04 != null) {
            c21486x59d05a04.setFilters(new f93.x0[]{new f93.x0(this)});
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a042 = this.f224746e;
        if (c21486x59d05a042 != null) {
            c21486x59d05a042.addTextChangedListener(new f93.y0(this));
        }
        java.lang.String stringExtra = getIntent().getStringExtra("create_label_from_search");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactLabelCreateUI", "createLabelFromSearch: " + stringExtra);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a043 = this.f224746e;
        if (c21486x59d05a043 != null) {
            c21486x59d05a043.setText(stringExtra);
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f565434sz0);
        this.f224748g = button;
        if (button != null) {
            button.setEnabled(false);
        }
        android.widget.Button button2 = this.f224748g;
        if (button2 != null) {
            button2.setOnClickListener(new f93.z0(this));
        }
        W6();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.g9h);
        mo74406x9c8c0d33(new f93.a1(this), 0);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        c01.d9.e().q(kd1.c.f72435x366c91de, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16166xa7327119, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        c01.d9.e().a(kd1.c.f72435x366c91de, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactLabelCreateUI", "onSceneEnd: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null;
        if (valueOf != null && valueOf.intValue() == 635) {
            if (i17 != 0 || i18 != 0) {
                m65194xce38d9a();
                setResult(0);
                db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571360cv), "", new f93.w0(this));
                return;
            }
            m65194xce38d9a();
            if (m1Var instanceof e93.a) {
                java.util.LinkedList linkedList = ((e93.a) m1Var).f331884g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactLabelCreateUI", "createdLabelPairList: " + linkedList.size());
                if (!linkedList.isEmpty()) {
                    int i19 = ((r45.f54) linkedList.get(0)).f455555e;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("create_label_by_half_screen_create", i19);
                    setResult(-1, intent);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactLabelCreateUI", "save new label success id=" + i19 + ", label=" + ((r45.f54) linkedList.get(0)).f455554d);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactLabelCreateUI", "createdLabelPairList is empty");
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518214g, vg3.b.f518179f, vg3.c.f518201w, i18, kz5.b0.c(this.f224750i)));
            } else {
                setResult(0);
            }
            finish();
        }
    }
}

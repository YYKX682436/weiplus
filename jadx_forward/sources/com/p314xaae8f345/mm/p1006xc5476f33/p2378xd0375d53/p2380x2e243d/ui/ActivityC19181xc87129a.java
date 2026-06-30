package com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI */
/* loaded from: classes9.dex */
public class ActivityC19181xc87129a extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements qp5.i0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f262766d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f262767e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f262768f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f262769g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f262770h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f262771i;

    /* renamed from: m, reason: collision with root package name */
    public st4.g f262772m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f262773n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f262774o = false;

    /* renamed from: p, reason: collision with root package name */
    public java.util.HashMap f262775p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.util.HashSet f262776q = null;

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.ui.ActivityC19181xc87129a activityC19181xc87129a, android.view.View view, android.text.Editable editable) {
        if (editable != null) {
            activityC19181xc87129a.getClass();
            if (editable.length() != 0) {
                if (view.getId() == activityC19181xc87129a.f262766d.getId()) {
                    activityC19181xc87129a.f262773n = true;
                } else if (view.getId() == activityC19181xc87129a.f262768f.getId()) {
                    activityC19181xc87129a.f262774o = true;
                } else {
                    view.getId();
                    activityC19181xc87129a.f262767e.getId();
                }
            }
        }
        activityC19181xc87129a.f262772m.a();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570890c94;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f262772m = new st4.g(this);
        this.f262775p = new java.util.HashMap();
        this.f262776q = new java.util.HashSet();
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f565113bb3);
        this.f262766d = viewOnFocusChangeListenerC22907xe18534c2;
        qp5.p.a(viewOnFocusChangeListenerC22907xe18534c2);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c22 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.cqm);
        this.f262767e = viewOnFocusChangeListenerC22907xe18534c22;
        qp5.p.d(this, viewOnFocusChangeListenerC22907xe18534c22);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c23 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.cpz);
        this.f262768f = viewOnFocusChangeListenerC22907xe18534c23;
        qp5.p.c(this, viewOnFocusChangeListenerC22907xe18534c23);
        this.f262769g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pbh);
        this.f262770h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pb7);
        this.f262771i = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        m83125x8f91b80(this.f262766d, 0, false);
        m83125x8f91b80(this.f262768f, 0, false);
        this.f262766d.m83211x749e7e77(this);
        this.f262768f.m83211x749e7e77(this);
        this.f262767e.m83211x749e7e77(this);
        this.f262766d.m83195x853d357d(0);
        this.f262768f.b(new st4.b(this));
        this.f262767e.b(new st4.c(this));
        this.f262766d.b(new st4.d(this));
        this.f262771i.setOnClickListener(new st4.e(this));
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pek)).setText(c01.z1.I() ? com.p314xaae8f345.mm.R.C30867xcad56011.kwm : com.p314xaae8f345.mm.R.C30867xcad56011.kwn);
        vt4.c.a(this, (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ngo));
    }

    @Override // qp5.i0
    /* renamed from: onInputValidChange */
    public void mo9068x194c4a1(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f262772m.a();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof rt4.b) {
            rt4.b bVar = (rt4.b) m1Var;
            this.f262775p.put(bVar.f481074d, (com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.p2381x633fb29.C19178xda56ba87) m83105x7498fe14().getParcelable("key_card_element"));
            this.f262772m.a();
            this.f262776q.remove(bVar.f481074d);
            return true;
        }
        if ((m1Var instanceof rt4.a) && (i17 != 0 || i18 != 0)) {
            this.f262766d.m83195x853d357d(0);
        }
        return false;
    }
}

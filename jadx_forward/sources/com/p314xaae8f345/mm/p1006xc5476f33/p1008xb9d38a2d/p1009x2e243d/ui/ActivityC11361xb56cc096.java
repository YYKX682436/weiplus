package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactStatusUI */
/* loaded from: classes5.dex */
public class ActivityC11361xb56cc096 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f154512i = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f154513e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f154514f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f154515g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f154516h;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569736kd;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f154513e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564915ai2);
        this.f154514f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564913ai0);
        this.f154515g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ahy);
        this.f154516h = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f564914ai1);
        if (r61.q0.b() == js.x0.SUCC) {
            this.f154513e.setImageResource(com.p314xaae8f345.mm.R.raw.f80629x28b80d1f);
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
            if (str == null || str.equals("")) {
                str = (java.lang.String) gm0.j1.u().c().l(4097, null);
            }
            this.f154515g.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.agz));
            this.f154514f.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahl, str));
        } else {
            this.f154513e.setImageResource(com.p314xaae8f345.mm.R.raw.f80631xeb6948a5);
            this.f154515g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ah_);
            this.f154514f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ah_);
            this.f154515g.setVisibility(8);
        }
        this.f154516h.setOnClickListener(new p61.m1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572251ah3);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        if (!getIntent().getBooleanExtra("intent_back_launcherui", false)) {
            W6(1);
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.u(intent, this);
        return true;
    }
}

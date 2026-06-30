package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.SelectDateUI */
/* loaded from: classes14.dex */
public class ActivityC10368x68cc8efe extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements gn.a {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f145491o = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.C10341xc7527cef f145492d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145493e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f145494f;

    /* renamed from: g, reason: collision with root package name */
    public long f145495g = -1;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f145496h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f145497i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f145498m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f145499n;

    public final int[] T6() {
        com.p314xaae8f345.mm.p648x55baa833.ui.le leVar = (com.p314xaae8f345.mm.p648x55baa833.ui.le) this.f145492d.getChildAt(0);
        if (leVar != null) {
            return new int[]{leVar.I, leVar.D + 1};
        }
        return null;
    }

    public void U6(kn.a aVar) {
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectDateUI", "null == calendarDay");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectDateUI", "Day Selected timestamp:%s day:%s month:%s year:%s", java.lang.Long.valueOf(aVar.f390907e), java.lang.Integer.valueOf(aVar.f390904b), java.lang.Integer.valueOf(aVar.f390905c), java.lang.Integer.valueOf(aVar.f390906d));
        long j17 = aVar.f390908f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectDateUI", "[goToChattingUI] msgLocalId:%s", java.lang.Long.valueOf(j17));
        j45.l.u(this, ".ui.chatting.ChattingUI", new android.content.Intent().putExtra("Chat_User", this.f145493e).putExtra("finish_direct", true).putExtra("from_date_search", true).putExtra("msg_local_id", j17), null);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S4(this.f145493e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27229, 1, 4, "", 0, 0, java.lang.Long.valueOf(aVar.f390907e / 1000));
        }
    }

    public void V6(int i17, int i18) {
        this.f145498m.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ndc, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cjn;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.f563968ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ic9);
        this.f145499n = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.vgl);
        this.f145492d = (com.p314xaae8f345.mm.p648x55baa833.ui.C10341xc7527cef) findViewById(com.p314xaae8f345.mm.R.id.kvr);
        this.f145498m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.uh8);
        this.f145497i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mf6);
        this.f145494f = new java.util.HashMap();
        this.f145496h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(getMainLooper());
        this.f145493e = getIntent().getStringExtra("detail_username");
        this.f145492d.m43527xb4820913(new com.p314xaae8f345.mm.p648x55baa833.ui.jc(this));
        s75.d.b(new com.p314xaae8f345.mm.p648x55baa833.ui.lc(this), "prepare_data");
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.mc(this));
        this.f145499n.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.nc(this));
    }
}

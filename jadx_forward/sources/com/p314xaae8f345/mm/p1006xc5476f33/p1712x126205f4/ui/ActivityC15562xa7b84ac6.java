package com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI;", "Lcom/tencent/mm/ui/MMActivity;", "Ll75/q0;", "<init>", "()V", "k13/s", "k13/x", "plugin-force-notify_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI */
/* loaded from: classes8.dex */
public final class ActivityC15562xa7b84ac6 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements l75.q0 {

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f218869e;

    /* renamed from: f, reason: collision with root package name */
    public k13.s f218870f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f218871g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f218872h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f218868d = "MicroMsg.ForceNotifyListUI";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f218873i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final int[] f218874m = new int[2];

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bbg;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        j13.a.f378710d.add(this);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.feh);
        mo54448x9c8c0d33(new k13.y(this));
        this.f218871g = findViewById(com.p314xaae8f345.mm.R.id.ilp);
        this.f218872h = findViewById(com.p314xaae8f345.mm.R.id.dft);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.i38);
        this.f218869e = c1163xf1deaba4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba4);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179()));
        this.f218870f = new k13.s(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f218869e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba42);
        c1163xf1deaba42.mo7960x6cab2c8d(this.f218870f);
        ((ku5.t0) ku5.t0.f394148d).g(new k13.a0(this));
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Bi("", 1, c01.id.c() / 1000);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        j13.a.f378710d.mo49775xc84af884(this);
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Bi("", 2, c01.id.c() / 1000);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f218868d, "[onNotifyChange] event:%s", str);
        ((ku5.t0) ku5.t0.f394148d).g(new k13.c0(this));
    }
}

package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI */
/* loaded from: classes12.dex */
public class ActivityC10374x1787784b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f145521d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f145522e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f145523f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.C10371xec3c2bd0 f145524g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.wd f145525h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145526i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f145527m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f145528n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f145529o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f145530p = new java.util.ArrayList();

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cjx;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String str = this.f145526i;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        mo54450xbf7c1df6(str);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f567413jf5);
        this.f145521d = listView;
        listView.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744);
        this.f145523f = findViewById(com.p314xaae8f345.mm.R.id.mjl);
        this.f145529o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565761dg2);
        this.f145525h = new com.p314xaae8f345.mm.p648x55baa833.ui.wd(this, this);
        new java.util.HashSet().add(c01.z1.r());
        this.f145521d.setAdapter((android.widget.ListAdapter) this.f145525h);
        com.p314xaae8f345.mm.p648x55baa833.ui.C10371xec3c2bd0 c10371xec3c2bd0 = (com.p314xaae8f345.mm.p648x55baa833.ui.C10371xec3c2bd0) findViewById(com.p314xaae8f345.mm.R.id.jft);
        this.f145524g = c10371xec3c2bd0;
        c10371xec3c2bd0.m79298x40d747ee(new com.p314xaae8f345.mm.p648x55baa833.ui.nd(this));
        this.f145524g.setVisibility(0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.mjh);
        this.f145522e = c22621x7603e017;
        c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p648x55baa833.ui.pd(this));
        com.p314xaae8f345.mm.p648x55baa833.ui.wd wdVar = this.f145525h;
        android.view.View view = wdVar.f146166n.f145523f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter", "loadData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter", "loadData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        gm0.j1.e().j(new com.p314xaae8f345.mm.p648x55baa833.ui.sd(wdVar));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.qd(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectServiceNotifySenderUI", "[onCreate]");
        getIntent().getIntExtra("from_scene", 0);
        this.f145526i = getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        this.f145527m = getIntent().getBooleanExtra("is_show_owner", true);
        this.f145528n = getIntent().getStringExtra("service_notify_session_id");
        mo43517x10010bd5();
    }
}

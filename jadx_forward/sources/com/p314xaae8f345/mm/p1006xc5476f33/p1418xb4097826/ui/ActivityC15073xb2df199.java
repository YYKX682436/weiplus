package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingProtectUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI */
/* loaded from: classes8.dex */
public final class ActivityC15073xb2df199 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f210282w = 0;

    /* renamed from: t, reason: collision with root package name */
    public az2.f f210283t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f210284u = "";

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.wh f210285v = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.wh(this);

    public final void c7() {
        r45.h23 h23Var;
        if (!hc2.s.g()) {
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.tuu)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.o07));
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.tul)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573546o04));
            android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.tuk);
            button.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572041x2));
            button.setTextColor(button.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
            button.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk);
            return;
        }
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.tuu)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.nzz));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.tul);
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String string = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl);
        long j17 = 1000;
        g92.b bVar = g92.b.f351302e;
        m92.b j37 = g92.a.j3(bVar, bVar.U(), false, 2, null);
        objArr[0] = android.text.format.DateFormat.format(string, j17 * ((j37 == null || (h23Var = (r45.h23) j37.u0().m75936x14adae67(52)) == null) ? 0L : h23Var.m75942xfb822ef2(0)));
        textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573547o05, objArr));
        android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.tuk);
        button2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.nzx));
        com.p314xaae8f345.mm.ui.fk.b(button2);
        button2.setTextColor(button2.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aax));
        button2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562601jy);
    }

    public final void d7() {
        az2.f fVar = this.f210283t;
        if (fVar != null) {
            fVar.b();
        }
        az2.c cVar = az2.f.f97658d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        az2.f a17 = az2.c.a(cVar, mo55332x76847179, mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), 0L, null, 8, null);
        this.f210283t = a17;
        a17.a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eeb;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f210284u = stringExtra;
        if (stringExtra.length() == 0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            this.f210284u = xy2.c.e(mo55332x76847179);
        }
        c7();
        mo54450xbf7c1df6("");
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c, null));
        mo78514x143f1b92().p0(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c, null));
        mo78530x8b45058f();
        findViewById(com.p314xaae8f345.mm.R.id.tuk).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.xh(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.yh(this));
    }
}

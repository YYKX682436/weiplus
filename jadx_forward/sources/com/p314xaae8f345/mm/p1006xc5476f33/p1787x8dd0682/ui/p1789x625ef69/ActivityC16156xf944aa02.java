package com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69;

@db5.a(m123858x6ac9171 = 35)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI */
/* loaded from: classes14.dex */
public final class ActivityC16156xf944aa02 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f224644o = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f224645d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f224646e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f224647f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f224648g;

    /* renamed from: h, reason: collision with root package name */
    public int f224649h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f224650i;

    /* renamed from: m, reason: collision with root package name */
    public r45.u44 f224651m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f224652n = jz5.h.b(new y83.j(this));

    public final w83.c T6() {
        return (w83.c) ((jz5.n) this.f224652n).mo141623x754a37bb();
    }

    public final void U6(r45.u44 u44Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KidsWatchLoginCardChooseUI", "reLogin:" + u44Var + ", userName:" + u44Var.f468553d);
        gm0.j1.d().a(972, this);
        java.lang.String str = this.f224645d;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
            throw null;
        }
        gm0.j1.d().g(new x83.k(str, this.f224647f, false, 2, u44Var));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bmv;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KidsWatchLoginCardChooseUI", "initView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb c16155xa1f2bfdb = T6().f525498d;
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g7l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        c16155xa1f2bfdb.m65191x53bfe316(string);
        T6().f525498d.m65189x5018364b(new y83.e(this));
        java.lang.String stringExtra = getIntent().getStringExtra("intent.key.login.url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        this.f224645d = stringExtra;
        this.f224646e = getIntent().getStringExtra("intent.key.device.name");
        this.f224648g = getIntent().getBooleanExtra("intent.key.ok.reg.btn", false);
        this.f224647f = getIntent().getStringExtra("intent.key.ok.session.list");
        this.f224650i = getIntent().getBooleanExtra("intent.key.need.show.syncmsg.btn", false);
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("intent.key.kids.list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(parcelableArrayListExtra);
        this.f224649h = parcelableArrayListExtra.size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("intent:<");
        java.lang.String str = this.f224645d;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
            throw null;
        }
        sb6.append(str);
        sb6.append(", ");
        sb6.append(this.f224646e);
        sb6.append(", ");
        sb6.append(this.f224648g);
        sb6.append(", ");
        sb6.append(this.f224647f);
        sb6.append(", ");
        sb6.append(this.f224649h);
        sb6.append('>');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KidsWatchLoginCardChooseUI", sb6.toString());
        int i17 = this.f224649h;
        for (int i18 = 0; i18 < i17; i18++) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16153xf0d27e3c c16153xf0d27e3c = new com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16153xf0d27e3c(mo55332x76847179, null, 0);
            c16153xf0d27e3c.setId(i18);
            java.lang.Object obj = parcelableArrayListExtra.get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            c16153xf0d27e3c.m65187x76491f2c((com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.p1788x633fb29.C16152x604567c3) obj);
            if (i18 == this.f224649h - 1) {
                w83.a aVar = c16153xf0d27e3c.f224637f;
                android.view.ViewGroup.LayoutParams layoutParams = aVar.f525486c.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                int b17 = com.p314xaae8f345.mm.ui.zk.b(c16153xf0d27e3c.getContext(), i65.a.B(c16153xf0d27e3c.getContext()));
                int a17 = com.p314xaae8f345.mm.ui.zk.a(c16153xf0d27e3c.getContext(), 8);
                if (b17 >= 375) {
                    a17 = com.p314xaae8f345.mm.ui.zk.a(c16153xf0d27e3c.getContext(), 24);
                }
                layoutParams2.setMargins(a17, 0, a17, 0);
                aVar.f525486c.setLayoutParams(layoutParams2);
            }
            c16153xf0d27e3c.setOnClickListener(new y83.g(this, parcelableArrayListExtra, i18));
            T6().f525497c.addView(c16153xf0d27e3c);
        }
        T6().f525500f.setOnClickListener(new y83.h(this));
        T6().f525499e.post(new y83.i(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        r45.u44 u44Var;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 30846) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KidsWatchLoginCardChooseUI", "onActivityResult, " + i17 + ", " + i18);
            if (i18 != -1 || (u44Var = this.f224651m) == null) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u44Var);
            U6(u44Var);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
        mo2533x106ab264.o();
        m78583x85ccfe01(8);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77921x1688c237));
        mo78578x8b18f126(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77921x1688c237));
        mo43517x10010bd5();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KidsWatchLoginCardChooseUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var instanceof x83.k) {
            gm0.j1.d().q(972, this);
            a93.a aVar = a93.a.f83962a;
            x83.g gVar = x83.g.f534101a;
            if (i17 == 0) {
                v83.a[] aVarArr = v83.a.f515612d;
                if (i18 == 0) {
                    db5.t7.h(mo55332x76847179(), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573897g81));
                    x83.c cVar = x83.c.f534086f;
                    java.lang.String str2 = this.f224645d;
                    if (str2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
                        throw null;
                    }
                    gVar.a(cVar, str2, x83.e.f534095e, x83.d.f534089e, this.f224649h, i18);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                    aVar.a(mo55332x76847179, "", true);
                    return;
                }
            }
            if (i17 == 4) {
                v83.a[] aVarArr2 = v83.a.f515612d;
                if (i18 == -9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KidsWatchLoginCardChooseUI", i17 + ", " + i18 + ", showBlockBySpam");
                    ((is.o1) ((js.c1) i95.n0.c(js.c1.class))).getClass();
                    x51.i1.c(this, str, 30846);
                    return;
                }
            }
            x83.c cVar2 = x83.c.f534086f;
            java.lang.String str3 = this.f224645d;
            if (str3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
                throw null;
            }
            gVar.a(cVar2, str3, x83.e.f534095e, x83.d.f534092h, this.f224649h, i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KidsWatchLoginCardChooseUI", i17 + ", " + i18 + ", showAlertWhenError");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
            aVar.d(mo55332x768471792, i18, str);
        }
    }
}

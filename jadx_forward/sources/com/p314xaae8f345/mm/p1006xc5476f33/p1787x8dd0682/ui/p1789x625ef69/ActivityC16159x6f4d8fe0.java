package com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69;

@db5.a(m123858x6ac9171 = 35)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI */
/* loaded from: classes14.dex */
public final class ActivityC16159x6f4d8fe0 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public int f224664f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f224665g;

    /* renamed from: h, reason: collision with root package name */
    public int f224666h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f224667i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f224668m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f224669n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.CheckBox f224670o;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f224662d = "MicroMsg.KidsWatchLoginFirstChooseSceneUI";

    /* renamed from: e, reason: collision with root package name */
    public final int f224663e = com.p314xaae8f345.mm.ui.zk.a(mo55332x76847179(), 16);

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f224671p = jz5.h.b(new y83.y(this));

    public final boolean T6(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f224662d, "doLoginOK, login:" + str + ", okSession:" + str2 + ", scene:" + i17);
        gm0.j1.d().a(972, this);
        android.widget.CheckBox checkBox = this.f224670o;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("syncMsgCb");
            throw null;
        }
        gm0.j1.d().g(new x83.k(str, str2, checkBox.isChecked(), i17, null));
        return true;
    }

    public final w83.g U6() {
        return (w83.g) ((jz5.n) this.f224671p).mo141623x754a37bb();
    }

    public final void V6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = U6().f525519g;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(this.f224664f == 0 ? 0 : 8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = U6().f525521i;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(this.f224664f == 1 ? 0 : 8);
        }
        android.widget.RelativeLayout relativeLayout = this.f224669n;
        if (relativeLayout != null) {
            relativeLayout.setVisibility((this.f224668m && this.f224664f == 0) ? 0 : 8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("syncMsgRl");
            throw null;
        }
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
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bmz;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f224665g = getIntent().getStringExtra("intent.key.login.url");
        this.f224666h = getIntent().getIntExtra("intent.key.kids.cnt", 0);
        getIntent().getStringExtra("intent.key.device.name");
        this.f224667i = getIntent().getStringExtra("intent.key.ok.session.list");
        this.f224668m = getIntent().getBooleanExtra("intent.key.need.show.syncmsg.btn", false);
        U6().f525518f.m65190x6c2a7ecc(com.p314xaae8f345.mm.R.C30861xcebc809e.bu7);
        U6().f525518f.m65189x5018364b(new y83.s(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.nuf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f224669n = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.nue);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f224670o = (android.widget.CheckBox) findViewById2;
        java.lang.String r17 = c01.z1.r();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d c22643xbdaadc7d = U6().f525514b;
        int i17 = this.f224663e;
        c22643xbdaadc7d.f292939f = i17;
        c22643xbdaadc7d.f292940g = i17;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(r17);
        if (a17 == null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            a17 = com.p314xaae8f345.mm.p943x351df9c2.z.h(com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().j(r17, false), r17, false);
        }
        if (a17 != null) {
            U6().f525514b.setImageBitmap(a17);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = U6().f525519g;
        java.lang.Object parent = c22699x3dcdb352 != null ? c22699x3dcdb352.getParent() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setOnClickListener(new y83.t(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = U6().f525521i;
        java.lang.Object parent2 = c22699x3dcdb3522 != null ? c22699x3dcdb3522.getParent() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent2, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent2).setOnClickListener(new y83.u(this));
        V6();
        android.widget.LinearLayout linearLayout = U6().f525517e;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new y83.v(this));
        }
        U6().f525520h.setOnClickListener(new y83.w(this));
        a93.a aVar = a93.a.f83962a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        aVar.c(mo55332x76847179, U6().f525516d, U6().f525515c);
        android.widget.RelativeLayout relativeLayout = this.f224669n;
        if (relativeLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("syncMsgRl");
            throw null;
        }
        relativeLayout.setVisibility((this.f224668m && this.f224664f == 0) ? 0 : 8);
        android.widget.CheckBox checkBox = this.f224670o;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("syncMsgCb");
            throw null;
        }
        checkBox.setChecked(true);
        android.widget.RelativeLayout relativeLayout2 = this.f224669n;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new y83.x(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("syncMsgRl");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 30846) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f224662d, "onActivityResult, " + i17 + ", " + i18);
            if (i18 == -1) {
                java.lang.String str = this.f224665g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                T6(str, this.f224667i, this.f224664f);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
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
        mo54450xbf7c1df6("");
        mo43517x10010bd5();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        java.lang.String str2 = this.f224662d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var instanceof x83.k) {
            ((x83.k) m1Var).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onSceneEnd type[%d]", 972);
            gm0.j1.d().q(972, this);
            a93.a aVar = a93.a.f83962a;
            x83.g gVar = x83.g.f534101a;
            if (i17 != 0 || i18 != 0) {
                if (i17 == 4) {
                    v83.a[] aVarArr = v83.a.f515612d;
                    if (i18 == -9) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "showBlockBySpam");
                        ((is.o1) ((js.c1) i95.n0.c(js.c1.class))).getClass();
                        x51.i1.c(this, str, 30846);
                        return;
                    }
                }
                x83.c cVar = x83.c.f534085e;
                java.lang.String str3 = this.f224665g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                gVar.a(cVar, str3, this.f224664f == 0 ? x83.e.f534096f : x83.e.f534097g, x83.d.f534092h, this.f224666h, i18);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                aVar.d(mo55332x76847179, i18, str);
                return;
            }
            if (this.f224664f == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "top");
                x83.c cVar2 = x83.c.f534085e;
                java.lang.String str4 = this.f224665g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                gVar.a(cVar2, str4, x83.e.f534096f, x83.d.f534089e, this.f224666h, i18);
                i19 = com.p314xaae8f345.mm.R.C30867xcad56011.f573896g80;
            } else {
                x83.c cVar3 = x83.c.f534085e;
                java.lang.String str5 = this.f224665g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
                gVar.a(cVar3, str5, x83.e.f534097g, x83.d.f534089e, this.f224666h, i18);
                i19 = com.p314xaae8f345.mm.R.C30867xcad56011.f573897g81;
            }
            java.lang.String string = mo55332x76847179().getString(i19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "Tips: ".concat(string));
            db5.t7.h(mo55332x76847179(), string);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
            aVar.a(mo55332x768471792, "", true);
        }
    }
}

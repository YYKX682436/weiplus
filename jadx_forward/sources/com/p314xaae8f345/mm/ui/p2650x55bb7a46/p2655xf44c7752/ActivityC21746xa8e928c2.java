package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/chatting/gallery/FinderFeedHistoryListUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lzb5/e;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI */
/* loaded from: classes9.dex */
public final class ActivityC21746xa8e928c2 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements zb5.e {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f282094i = 0;

    /* renamed from: d, reason: collision with root package name */
    public zb5.d f282095d;

    /* renamed from: f, reason: collision with root package name */
    public q40.e f282097f;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f282096e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f282098g = "";

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f282099h = jz5.h.b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.w0.f283061d);

    public final a31.v T6() {
        return (a31.v) ((jz5.n) this.f282099h).mo141623x754a37bb();
    }

    public void U6(boolean z17, java.util.List dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        q40.e eVar = this.f282097f;
        if (eVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10 c15104x4e0baa10 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10) eVar;
            if (c15104x4e0baa10.f210539w) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.l lVar = c15104x4e0baa10.A;
                if (lVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                lVar.d();
            }
        }
        q40.e eVar2 = this.f282097f;
        if (eVar2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10) eVar2).y0(this.f282098g, dataList);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ahl;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.b
    public void l2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z zVar) {
        this.f282095d = (zb5.d) zVar;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        inflateTransition.excludeTarget(decorView.findViewById(com.p314xaae8f345.mm.R.id.f563968ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        android.content.Intent intent = getIntent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent, "getIntent(...)");
        java.lang.String stringExtra = intent.getStringExtra("kintent_talker");
        java.lang.String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f282096e = stringExtra;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1 o1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1(mo55332x76847179, this.f282096e);
        o1Var.f283926i = this;
        this.f282095d = o1Var;
        mo64405x4dab7448(b3.l.m9702x7444d5ad(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        mo78530x8b45058f();
        getIntent().getBooleanExtra("detail_user_dismiss", false);
        T6().c(false);
        a31.v T6 = T6();
        zb5.d dVar = this.f282095d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h1 h1Var = dVar != null ? new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h1((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1) dVar) : null;
        T6.f82532u = h1Var;
        T6.f291857i = h1Var;
        T6().f82529r = false;
        q40.f fVar = (q40.f) i95.n0.c(q40.f.class);
        java.lang.String conversation = this.f282096e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.y2) fVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10 c15104x4e0baa10 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10(conversation);
        this.f282097f = c15104x4e0baa10;
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.eh8, c15104x4e0baa10, null);
        m7630xb2c12e75.f();
        q40.e eVar = this.f282097f;
        if (eVar != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.v0 v0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.v0(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10 c15104x4e0baa102 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10) eVar;
            c15104x4e0baa102.B = 40;
            c15104x4e0baa102.C = v0Var;
        }
        zb5.d dVar2 = this.f282095d;
        if (dVar2 != null) {
            str = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1) dVar2).f283921d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571521ho);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        mo54450xbf7c1df6(str);
        o1Var.a(true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        T6().j(this, menu);
        a31.v T6 = T6();
        zb5.d dVar = this.f282095d;
        if (dVar != null) {
            str = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1) dVar).f283921d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571521ho);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        } else {
            str = "";
        }
        if (T6.f291856h != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            T6.f291856h.mo81062x7d60453d(str);
        }
        m78513xc2a54588().postDelayed(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.u0(this), 200L);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q40.e eVar = this.f282097f;
        if (eVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10 c15104x4e0baa10 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10) eVar;
            c15104x4e0baa10.B = 0;
            c15104x4e0baa10.C = null;
        }
        zb5.d dVar = this.f282095d;
        if (dVar != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1) dVar).mo79813x3f5eee52();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event.getAction() != 4) {
            return super.onKeyDown(i17, event);
        }
        finish();
        overridePendingTransition(0, 0);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onKeyboardStateChanged */
    public void mo54561x62d1e2e9() {
        super.mo54561x62d1e2e9();
        if (mo70705x8200b8ea() == 2) {
            T6().a();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        T6().m(this, menu);
        return true;
    }
}

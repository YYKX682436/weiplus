package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/chatting/gallery/EmojiHistoryListUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lzb5/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.gallery.EmojiHistoryListUI */
/* loaded from: classes9.dex */
public final class ActivityC21745xdfe2aae0 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements zb5.b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f282089h = 0;

    /* renamed from: d, reason: collision with root package name */
    public zb5.a f282090d;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc f282092f;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f282091e = "";

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f282093g = jz5.h.b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.n0.f282741d);

    public final a31.v T6() {
        return (a31.v) ((jz5.n) this.f282093g).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e4w;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.b
    public void l2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z zVar) {
        this.f282090d = (zb5.a) zVar;
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
        this.f282091e = stringExtra;
        this.f282092f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc(this.f282091e, true);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0 h0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0(mo55332x76847179, this.f282091e);
        this.f282090d = h0Var;
        h0Var.f283770f = this;
        this.f282090d = h0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc c21744x29417dbc = this.f282092f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21744x29417dbc);
        h0Var.f283771g = c21744x29417dbc;
        c21744x29417dbc.f282083s = h0Var;
        mo64405x4dab7448(b3.l.m9702x7444d5ad(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        mo78530x8b45058f();
        T6().c(false);
        a31.v T6 = T6();
        zb5.a aVar = this.f282090d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.d0 d0Var = aVar != null ? new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.d0((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0) aVar) : null;
        T6.f82532u = d0Var;
        T6.f291857i = d0Var;
        T6().f82529r = false;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc c21744x29417dbc2 = this.f282092f;
        if (c21744x29417dbc2 != null) {
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
            m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.t7m, c21744x29417dbc2, null);
            m7630xb2c12e75.f();
        }
        zb5.a aVar2 = this.f282090d;
        if (aVar2 != null) {
            str = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0) aVar2).f283768d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n7a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        mo54450xbf7c1df6(str);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        T6().j(this, menu);
        a31.v T6 = T6();
        zb5.a aVar = this.f282090d;
        if (aVar != null) {
            str = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0) aVar).f283768d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n7a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        } else {
            str = "";
        }
        if (T6.f291856h != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            T6.f291856h.mo81062x7d60453d(str);
        }
        m78513xc2a54588().postDelayed(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.o0(this), 200L);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zb5.a aVar = this.f282090d;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0) aVar).mo79813x3f5eee52();
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

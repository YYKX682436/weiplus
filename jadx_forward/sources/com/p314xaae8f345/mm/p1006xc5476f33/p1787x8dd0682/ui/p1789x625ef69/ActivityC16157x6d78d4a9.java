package com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69;

@db5.a(m123858x6ac9171 = 35)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst */
/* loaded from: classes14.dex */
public final class ActivityC16157x6d78d4a9 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f224653d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f224654e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f224655f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f224656g;

    /* renamed from: h, reason: collision with root package name */
    public int f224657h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f224658i;

    /* renamed from: m, reason: collision with root package name */
    public v83.b f224659m = v83.b.f515613d;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f224660n = jz5.h.b(new y83.p(this));

    public final w83.e T6() {
        return (w83.e) ((jz5.n) this.f224660n).mo141623x754a37bb();
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
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bmx;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchLoginFirst", "initView");
        mo54450xbf7c1df6("");
        java.lang.String stringExtra = getIntent().getStringExtra("intent.key.login.url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        this.f224653d = stringExtra;
        this.f224657h = getIntent().getIntExtra("intent.key.kids.cnt", 0);
        this.f224654e = getIntent().getStringExtra("intent.key.device.name");
        this.f224655f = getIntent().getStringExtra("intent.key.ok.session.list");
        this.f224656g = getIntent().getBooleanExtra("intent.key.ok.reg.btn", false);
        this.f224658i = getIntent().getBooleanExtra("intent.key.need.show.syncmsg.btn", false);
        T6().f525505b.m65189x5018364b(new y83.l(this));
        T6().f525505b.f224643e.f525493c.setVisibility(0);
        android.widget.Button button = T6().f525506c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(button);
        button.setOnClickListener(new y83.m(this));
        android.widget.LinearLayout linearLayout = T6().f525507d;
        if (linearLayout != null) {
            linearLayout.setVisibility(this.f224656g ? 0 : 4);
        }
        android.widget.TextView textView = T6().f525508e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        textView.setOnClickListener(new y83.o(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
        mo2533x106ab264.o();
        mo43517x10010bd5();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KidsWatchUtil", "setWindowStyle, activity:" + this + ", isShowStatusBar:true, isShowNavigationBar: false");
            getWindow().getDecorView().setSystemUiVisibility(5890);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(0);
            getWindow().setFormat(-3);
        }
    }
}

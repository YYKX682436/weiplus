package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI */
/* loaded from: classes5.dex */
public final class ActivityC12862xdeb2e81d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f174300t = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f174301d = "MicroMsg.NewPcDeviceUI";

    /* renamed from: e, reason: collision with root package name */
    public final long f174302e = 2000;

    /* renamed from: f, reason: collision with root package name */
    public boolean f174303f;

    /* renamed from: g, reason: collision with root package name */
    public po1.d f174304g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f174305h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f174306i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f174307m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f174308n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f174309o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f174310p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f174311q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f174312r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f174313s;

    public final void T6() {
        c01.d9.e().g(new ug3.i(gm0.j1.b().f354782l, 1, new fo1.b(new xo1.h(new java.lang.ref.WeakReference(this)))));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AutoBindHelper", "post NetSceneGetOnlineInfo into NetSceneQueue");
    }

    public final void U6(po1.d dVar) {
        int i17;
        boolean z17 = this.f174303f;
        java.lang.String str = this.f174301d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "update view statue to binding.");
            android.widget.ProgressBar progressBar = this.f174305h;
            if (progressBar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingPb");
                throw null;
            }
            progressBar.setVisibility(0);
            android.widget.TextView textView = this.f174309o;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                throw null;
            }
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.n0h);
            android.widget.TextView textView2 = this.f174310p;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hintTv");
                throw null;
            }
            textView2.setVisibility(8);
            android.widget.ImageView imageView = this.f174306i;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceIcon");
                throw null;
            }
            imageView.setVisibility(8);
            android.widget.ImageView imageView2 = this.f174307m;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoIcon");
                throw null;
            }
            imageView2.setVisibility(8);
            android.widget.TextView textView3 = this.f174308n;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceNameTv");
                throw null;
            }
            textView3.setVisibility(8);
            android.widget.Button button = this.f174311q;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("greenBtn");
                throw null;
            }
            button.setVisibility(8);
            android.widget.Button button2 = this.f174312r;
            if (button2 != null) {
                button2.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("greyBtn");
                throw null;
            }
        }
        android.widget.ProgressBar progressBar2 = this.f174305h;
        if (progressBar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingPb");
            throw null;
        }
        progressBar2.setVisibility(8);
        android.widget.ImageView imageView3 = this.f174306i;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceIcon");
            throw null;
        }
        imageView3.setVisibility(0);
        android.widget.ImageView imageView4 = this.f174307m;
        if (imageView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoIcon");
            throw null;
        }
        imageView4.setVisibility(8);
        android.widget.TextView textView4 = this.f174308n;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceNameTv");
            throw null;
        }
        textView4.setVisibility(8);
        android.widget.TextView textView5 = this.f174310p;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hintTv");
            throw null;
        }
        textView5.setVisibility(8);
        android.widget.Button button3 = this.f174312r;
        if (button3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("greyBtn");
            throw null;
        }
        button3.setVisibility(8);
        android.widget.Button button4 = this.f174311q;
        if (button4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("greenBtn");
            throw null;
        }
        button4.setVisibility(0);
        long j17 = this.f174302e;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "online device is null, need login before auto bind.");
            android.widget.TextView textView6 = this.f174308n;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceNameTv");
                throw null;
            }
            textView6.setVisibility(8);
            android.widget.TextView textView7 = this.f174309o;
            if (textView7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                throw null;
            }
            textView7.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mxn);
            android.widget.Button button5 = this.f174311q;
            if (button5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("greenBtn");
                throw null;
            }
            button5.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mxm);
            android.widget.Button button6 = this.f174311q;
            if (button6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("greenBtn");
                throw null;
            }
            button6.setOnClickListener(new xo1.l(this));
        } else {
            fo1.d dVar2 = fo1.d.f346391a;
            if (!dVar2.b(dVar) || dVar2.c(dVar)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "online device is ready to bind automatically.");
                android.widget.TextView textView8 = this.f174308n;
                if (textView8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceNameTv");
                    throw null;
                }
                textView8.setVisibility(0);
                android.widget.TextView textView9 = this.f174308n;
                if (textView9 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceNameTv");
                    throw null;
                }
                textView9.setText(dVar.b());
                android.widget.TextView textView10 = this.f174309o;
                if (textView10 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                    throw null;
                }
                textView10.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mxo);
                android.widget.Button button7 = this.f174311q;
                if (button7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("greenBtn");
                    throw null;
                }
                button7.setText(com.p314xaae8f345.mm.R.C30867xcad56011.acg);
                android.widget.Button button8 = this.f174311q;
                if (button8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("greenBtn");
                    throw null;
                }
                button8.setOnClickListener(new xo1.n(this, dVar));
                i17 = 5;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "client version of online device is not satisfied, need upgrade before auto bind. deviceId=%s", dVar.f438828a);
                android.widget.ImageView imageView5 = this.f174306i;
                if (imageView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceIcon");
                    throw null;
                }
                imageView5.setVisibility(8);
                android.widget.ImageView imageView6 = this.f174307m;
                if (imageView6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoIcon");
                    throw null;
                }
                imageView6.setVisibility(0);
                android.widget.TextView textView11 = this.f174310p;
                if (textView11 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hintTv");
                    throw null;
                }
                textView11.setVisibility(0);
                if (dVar.f438829b == po1.g.f438842g) {
                    android.widget.TextView textView12 = this.f174309o;
                    if (textView12 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                        throw null;
                    }
                    textView12.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ofg);
                    android.widget.TextView textView13 = this.f174310p;
                    if (textView13 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hintTv");
                        throw null;
                    }
                    textView13.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ofd);
                } else {
                    android.widget.TextView textView14 = this.f174309o;
                    if (textView14 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                        throw null;
                    }
                    textView14.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ofh);
                    android.widget.TextView textView15 = this.f174310p;
                    if (textView15 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hintTv");
                        throw null;
                    }
                    textView15.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ofe);
                }
                android.widget.Button button9 = this.f174311q;
                if (button9 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("greenBtn");
                    throw null;
                }
                button9.setVisibility(8);
                android.widget.Button button10 = this.f174312r;
                if (button10 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("greyBtn");
                    throw null;
                }
                button10.setVisibility(0);
                android.widget.Button button11 = this.f174312r;
                if (button11 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("greyBtn");
                    throw null;
                }
                button11.setOnClickListener(new xo1.m(this));
                i17 = 3;
            }
            j17 *= i17;
        }
        this.f174304g = dVar;
        if (this.f174313s || mo78538xecd98af8()) {
            return;
        }
        android.widget.TextView textView16 = this.f174309o;
        if (textView16 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        textView16.postDelayed(new xo1.k(this), j17);
        this.f174313s = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dxi;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int color = getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        mo64405x4dab7448(color);
        mo78578x8b18f126(color);
        mo54450xbf7c1df6("");
        mo54448x9c8c0d33(new xo1.f(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.imb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f174305h = (android.widget.ProgressBar) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ria);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f174306i = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.rrp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f174307m = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.ric);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f174308n = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.odf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f174309o = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.h0h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f174310p = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.rqq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f174311q = (android.widget.Button) findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.rqr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f174312r = (android.widget.Button) findViewById8;
        java.lang.String stringExtra = getIntent().getStringExtra("deviceInfo");
        if (stringExtra != null) {
            this.f174304g = po1.d.f438827i.b(stringExtra);
        }
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        U6(this.f174304g);
    }
}

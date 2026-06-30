package com.tencent.mm.plugin.backup.roambackup.ui.device;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NewPcDeviceUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f92767t = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f92768d = "MicroMsg.NewPcDeviceUI";

    /* renamed from: e, reason: collision with root package name */
    public final long f92769e = 2000;

    /* renamed from: f, reason: collision with root package name */
    public boolean f92770f;

    /* renamed from: g, reason: collision with root package name */
    public po1.d f92771g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f92772h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f92773i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f92774m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f92775n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f92776o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f92777p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f92778q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f92779r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f92780s;

    public final void T6() {
        c01.d9.e().g(new ug3.i(gm0.j1.b().f273249l, 1, new fo1.b(new xo1.h(new java.lang.ref.WeakReference(this)))));
        com.tencent.mars.xlog.Log.i("AutoBindHelper", "post NetSceneGetOnlineInfo into NetSceneQueue");
    }

    public final void U6(po1.d dVar) {
        int i17;
        boolean z17 = this.f92770f;
        java.lang.String str = this.f92768d;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "update view statue to binding.");
            android.widget.ProgressBar progressBar = this.f92772h;
            if (progressBar == null) {
                kotlin.jvm.internal.o.o("loadingPb");
                throw null;
            }
            progressBar.setVisibility(0);
            android.widget.TextView textView = this.f92776o;
            if (textView == null) {
                kotlin.jvm.internal.o.o("titleTv");
                throw null;
            }
            textView.setText(com.tencent.mm.R.string.n0h);
            android.widget.TextView textView2 = this.f92777p;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("hintTv");
                throw null;
            }
            textView2.setVisibility(8);
            android.widget.ImageView imageView = this.f92773i;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("deviceIcon");
                throw null;
            }
            imageView.setVisibility(8);
            android.widget.ImageView imageView2 = this.f92774m;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("infoIcon");
                throw null;
            }
            imageView2.setVisibility(8);
            android.widget.TextView textView3 = this.f92775n;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("deviceNameTv");
                throw null;
            }
            textView3.setVisibility(8);
            android.widget.Button button = this.f92778q;
            if (button == null) {
                kotlin.jvm.internal.o.o("greenBtn");
                throw null;
            }
            button.setVisibility(8);
            android.widget.Button button2 = this.f92779r;
            if (button2 != null) {
                button2.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("greyBtn");
                throw null;
            }
        }
        android.widget.ProgressBar progressBar2 = this.f92772h;
        if (progressBar2 == null) {
            kotlin.jvm.internal.o.o("loadingPb");
            throw null;
        }
        progressBar2.setVisibility(8);
        android.widget.ImageView imageView3 = this.f92773i;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("deviceIcon");
            throw null;
        }
        imageView3.setVisibility(0);
        android.widget.ImageView imageView4 = this.f92774m;
        if (imageView4 == null) {
            kotlin.jvm.internal.o.o("infoIcon");
            throw null;
        }
        imageView4.setVisibility(8);
        android.widget.TextView textView4 = this.f92775n;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("deviceNameTv");
            throw null;
        }
        textView4.setVisibility(8);
        android.widget.TextView textView5 = this.f92777p;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("hintTv");
            throw null;
        }
        textView5.setVisibility(8);
        android.widget.Button button3 = this.f92779r;
        if (button3 == null) {
            kotlin.jvm.internal.o.o("greyBtn");
            throw null;
        }
        button3.setVisibility(8);
        android.widget.Button button4 = this.f92778q;
        if (button4 == null) {
            kotlin.jvm.internal.o.o("greenBtn");
            throw null;
        }
        button4.setVisibility(0);
        long j17 = this.f92769e;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.i(str, "online device is null, need login before auto bind.");
            android.widget.TextView textView6 = this.f92775n;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("deviceNameTv");
                throw null;
            }
            textView6.setVisibility(8);
            android.widget.TextView textView7 = this.f92776o;
            if (textView7 == null) {
                kotlin.jvm.internal.o.o("titleTv");
                throw null;
            }
            textView7.setText(com.tencent.mm.R.string.mxn);
            android.widget.Button button5 = this.f92778q;
            if (button5 == null) {
                kotlin.jvm.internal.o.o("greenBtn");
                throw null;
            }
            button5.setText(com.tencent.mm.R.string.mxm);
            android.widget.Button button6 = this.f92778q;
            if (button6 == null) {
                kotlin.jvm.internal.o.o("greenBtn");
                throw null;
            }
            button6.setOnClickListener(new xo1.l(this));
        } else {
            fo1.d dVar2 = fo1.d.f264858a;
            if (!dVar2.b(dVar) || dVar2.c(dVar)) {
                com.tencent.mars.xlog.Log.w(str, "online device is ready to bind automatically.");
                android.widget.TextView textView8 = this.f92775n;
                if (textView8 == null) {
                    kotlin.jvm.internal.o.o("deviceNameTv");
                    throw null;
                }
                textView8.setVisibility(0);
                android.widget.TextView textView9 = this.f92775n;
                if (textView9 == null) {
                    kotlin.jvm.internal.o.o("deviceNameTv");
                    throw null;
                }
                textView9.setText(dVar.b());
                android.widget.TextView textView10 = this.f92776o;
                if (textView10 == null) {
                    kotlin.jvm.internal.o.o("titleTv");
                    throw null;
                }
                textView10.setText(com.tencent.mm.R.string.mxo);
                android.widget.Button button7 = this.f92778q;
                if (button7 == null) {
                    kotlin.jvm.internal.o.o("greenBtn");
                    throw null;
                }
                button7.setText(com.tencent.mm.R.string.acg);
                android.widget.Button button8 = this.f92778q;
                if (button8 == null) {
                    kotlin.jvm.internal.o.o("greenBtn");
                    throw null;
                }
                button8.setOnClickListener(new xo1.n(this, dVar));
                i17 = 5;
            } else {
                com.tencent.mars.xlog.Log.w(str, "client version of online device is not satisfied, need upgrade before auto bind. deviceId=%s", dVar.f357295a);
                android.widget.ImageView imageView5 = this.f92773i;
                if (imageView5 == null) {
                    kotlin.jvm.internal.o.o("deviceIcon");
                    throw null;
                }
                imageView5.setVisibility(8);
                android.widget.ImageView imageView6 = this.f92774m;
                if (imageView6 == null) {
                    kotlin.jvm.internal.o.o("infoIcon");
                    throw null;
                }
                imageView6.setVisibility(0);
                android.widget.TextView textView11 = this.f92777p;
                if (textView11 == null) {
                    kotlin.jvm.internal.o.o("hintTv");
                    throw null;
                }
                textView11.setVisibility(0);
                if (dVar.f357296b == po1.g.f357309g) {
                    android.widget.TextView textView12 = this.f92776o;
                    if (textView12 == null) {
                        kotlin.jvm.internal.o.o("titleTv");
                        throw null;
                    }
                    textView12.setText(com.tencent.mm.R.string.ofg);
                    android.widget.TextView textView13 = this.f92777p;
                    if (textView13 == null) {
                        kotlin.jvm.internal.o.o("hintTv");
                        throw null;
                    }
                    textView13.setText(com.tencent.mm.R.string.ofd);
                } else {
                    android.widget.TextView textView14 = this.f92776o;
                    if (textView14 == null) {
                        kotlin.jvm.internal.o.o("titleTv");
                        throw null;
                    }
                    textView14.setText(com.tencent.mm.R.string.ofh);
                    android.widget.TextView textView15 = this.f92777p;
                    if (textView15 == null) {
                        kotlin.jvm.internal.o.o("hintTv");
                        throw null;
                    }
                    textView15.setText(com.tencent.mm.R.string.ofe);
                }
                android.widget.Button button9 = this.f92778q;
                if (button9 == null) {
                    kotlin.jvm.internal.o.o("greenBtn");
                    throw null;
                }
                button9.setVisibility(8);
                android.widget.Button button10 = this.f92779r;
                if (button10 == null) {
                    kotlin.jvm.internal.o.o("greyBtn");
                    throw null;
                }
                button10.setVisibility(0);
                android.widget.Button button11 = this.f92779r;
                if (button11 == null) {
                    kotlin.jvm.internal.o.o("greyBtn");
                    throw null;
                }
                button11.setOnClickListener(new xo1.m(this));
                i17 = 3;
            }
            j17 *= i17;
        }
        this.f92771g = dVar;
        if (this.f92780s || isPaused()) {
            return;
        }
        android.widget.TextView textView16 = this.f92776o;
        if (textView16 == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        textView16.postDelayed(new xo1.k(this), j17);
        this.f92780s = true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dxi;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int color = getColor(com.tencent.mm.R.color.f478491c);
        setActionbarColor(color);
        setNavigationbarColor(color);
        setMMTitle("");
        setBackBtn(new xo1.f(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.imb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f92772h = (android.widget.ProgressBar) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ria);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f92773i = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.rrp);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f92774m = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ric);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f92775n = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f92776o = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.h0h);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f92777p = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.rqq);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f92778q = (android.widget.Button) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.rqr);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f92779r = (android.widget.Button) findViewById8;
        java.lang.String stringExtra = getIntent().getStringExtra("deviceInfo");
        if (stringExtra != null) {
            this.f92771g = po1.d.f357294i.b(stringExtra);
        }
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        U6(this.f92771g);
    }
}

package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class AppBrandOpenWeRunSettingUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f89370d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f89371e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f89372f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f89373g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f89374h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f89375i = null;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f89376m;

    public final void T6() {
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f89370d, this.f89375i.d1(), null);
        this.f89371e.setText(this.f89375i.g2());
        if (!this.f89375i.r2()) {
            this.f89372f.setTextColor(com.tencent.mm.ui.tools.gd.a(getContext()));
            this.f89372f.setText(com.tencent.mm.R.string.iwu);
            this.f89372f.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.drawable.bnh, 0, 0, 0);
            this.f89374h.setText(com.tencent.mm.R.string.iwn);
            this.f89374h.setClickable(true);
            return;
        }
        android.widget.TextView textView = this.f89372f;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        iz5.a.g(null, context != null);
        textView.setTextColor(new com.tencent.mm.ui.tools.gd(context).f210448a[0]);
        this.f89372f.setText(com.tencent.mm.R.string.iwo);
        this.f89372f.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.drawable.bni, 0, 0, 0);
        this.f89374h.setText(com.tencent.mm.R.string.iwo);
        this.f89374h.setClickable(false);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488056fn;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(getString(com.tencent.mm.R.string.f490212o3));
        this.f89370d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.kj_);
        this.f89371e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kja);
        this.f89372f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kjc);
        this.f89373g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kje);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kjb);
        this.f89374h = textView;
        textView.setOnClickListener(new com.tencent.mm.plugin.appbrand.ui.z5(this));
        setBackBtn(new com.tencent.mm.plugin.appbrand.ui.a6(this));
        java.lang.String stringExtra = getIntent().getStringExtra("OpenWeRunSettingName");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_43f2581f6fd6", true);
        this.f89375i = n17;
        if (n17 == null || ((int) n17.E2) == 0) {
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, null);
            this.f89376m = Q;
            Q.show();
            ((c01.k7) c01.n8.a()).b("gh_43f2581f6fd6", 21, new com.tencent.mm.plugin.appbrand.ui.b6(this));
        }
        this.f89373g.setText(getString(com.tencent.mm.R.string.f490214o5, stringExtra));
        T6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        qk.o oVar;
        if (m1Var instanceof ns.l) {
            gm0.j1.n().f273288b.q(30, this);
            if (i17 == 0 && i18 == 0) {
                java.lang.String J2 = ((com.tencent.mm.pluginsdk.model.m3) ((ns.l) m1Var)).J();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenWeRunSettingUI", "bind fitness contact %s success", J2);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_43f2581f6fd6", true);
                this.f89375i = n17;
                if (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(J2)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandOpenWeRunSettingUI", "respUsername == " + J2 + ", contact = " + n17);
                } else {
                    if (com.tencent.mm.storage.z3.E4(n17.d1())) {
                        java.lang.String d17 = n17.d1();
                        if (d17 == null) {
                            d17 = "";
                        }
                        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).getClass();
                        oVar = r01.z.b(d17);
                        if (oVar != null) {
                            oVar.field_username = J2;
                        }
                        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).wi(d17);
                        n17.K1(d17);
                    } else {
                        oVar = null;
                    }
                    n17.X1(J2);
                    if (((int) n17.E2) == 0) {
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(n17);
                    }
                    if (((int) n17.E2) <= 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandOpenWeRunSettingUI", "addContact : insert contact failed");
                    } else {
                        c01.e2.m0(n17);
                        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n17.d1(), true);
                        if (oVar != null) {
                            ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Bi(oVar);
                        } else {
                            rv.v2 v2Var = (rv.v2) i95.n0.c(rv.v2.class);
                            java.lang.String d18 = n18.d1();
                            ((qv.q) v2Var).getClass();
                            qk.o b17 = r01.z.b(d18);
                            if (b17 == null || b17.U0()) {
                                c01.n8.a().c(n18.d1(), 19);
                                ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            } else if (n18.X4()) {
                                c01.n8.a().c(n18.d1(), 19);
                                ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            }
                        }
                    }
                }
                ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Di(((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Ai(this.f89375i.d1()));
                gm0.j1.u().c().w(327825, java.lang.Boolean.TRUE);
                setResult(-1);
                com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.appbrand.ui.c6(this), 1500L);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandOpenWeRunSettingUI", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                if (i17 == 4 && i18 == -24 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
                }
                setResult(1);
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f89376m;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            T6();
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI */
/* loaded from: classes9.dex */
public class ActivityC19047xd92a1b55 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements qp5.i0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f260400t = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f260403f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.m0 f260404g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f260405h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f260406i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f260407m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260408n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260409o;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260412r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260413s;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f260401d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f260402e = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public boolean f260410p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f260411q = false;

    public ActivityC19047xd92a1b55() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f260412r = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94>(a0Var) { // from class: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.7
            {
                this.f39173x3fe91575 = 96068484;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94 c5961x66a09f94) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94 c5961x66a09f942 = c5961x66a09f94;
                if (!(c5961x66a09f942 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.WalletForgotPwdUI", "mismatched ScanBankCardResultEvent event");
                    return false;
                }
                com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
                java.lang.String m121807xce19d7e6 = c28013x36bca45.m121807xce19d7e6();
                java.lang.String m121800xea62cd8a = c28013x36bca45.m121800xea62cd8a(c5961x66a09f942.f136260g.f89274a, m121807xce19d7e6);
                android.graphics.Bitmap bitmap = c5961x66a09f942.f136260g.f89275b;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19047xd92a1b55.f260400t;
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19047xd92a1b55 activityC19047xd92a1b55 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19047xd92a1b55.this;
                activityC19047xd92a1b55.getClass();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("key_bankcard_id", m121800xea62cd8a);
                bundle.putString("key_bankcard_des", m121807xce19d7e6);
                bundle.putParcelable("key_bankcard_cropimg", bitmap);
                bundle.putBoolean("key_is_reset_with_new_card", true);
                com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(activityC19047xd92a1b55);
                if (g17 != null) {
                    g17.E(activityC19047xd92a1b55, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19113xc67f5986.class, bundle, 1);
                }
                return true;
            }
        };
        this.f260413s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6239x3d383f6>(this, a0Var) { // from class: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.8
            {
                this.f39173x3fe91575 = 92672998;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public /* bridge */ /* synthetic */ boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6239x3d383f6 c6239x3d383f6) {
                return false;
            }
        };
    }

    public final boolean U6() {
        if (this.f260405h.getVisibility() == 0 || (this.f260409o.n() && this.f260408n.n())) {
            this.f260406i.setEnabled(true);
            this.f260406i.setClickable(true);
            return true;
        }
        this.f260406i.setEnabled(false);
        this.f260406i.setClickable(false);
        return false;
    }

    public final void V6() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_is_reset_with_new_card", m83105x7498fe14().getBoolean("key_is_reset_with_new_card", false));
        W6();
        if (this.f260403f == null && !this.f260410p) {
            m83098x5406100e(new ss4.z(null, this.f260408n.m83183xfb85ada3(), null));
            return;
        }
        if (this.f260410p) {
            at4.v1 y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f67043xcbe8ad4f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdUI", "hy: not support bind new bankcard. start to url");
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this, y07.f67043xcbe8ad4f, false);
                return;
            }
            bundle.putBoolean("key_is_force_bind", true);
            bundle.putBoolean("key_is_reset_with_new_card", true);
            if (m83108x2b5a5a39() != null) {
                m83108x2b5a5a39().o(this, 0, bundle);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
        bundle.putParcelable("key_bankcard", this.f260403f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c();
        java.util.Iterator it = this.f260402e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdUI", "helios:::" + c19097xe6dc5b4c2.f261192s);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19097xe6dc5b4c2.f261192s) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260403f.f69223x58802fcb) && c19097xe6dc5b4c2.f261192s.trim().equals(this.f260403f.f69223x58802fcb.trim())) {
                c19097xe6dc5b4c = c19097xe6dc5b4c2;
                break;
            }
        }
        bundle.putParcelable("elemt_query", c19097xe6dc5b4c);
        if (g17 != null) {
            g17.o(this, 0, bundle);
        }
    }

    public final void W6() {
        m83105x7498fe14().remove("elemt_query");
        m83105x7498fe14().remove("key_bankcard");
        m83105x7498fe14().remove("bank_name");
        m83105x7498fe14().remove("key_card_id");
    }

    public final void X6() {
        java.util.ArrayList h17 = vr4.f1.wi().Ai().h();
        this.f260401d = h17;
        if (h17 == null || h17.size() == 0 || this.f260411q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdUI", "No bound bankcard process %s", java.lang.Boolean.valueOf(this.f260411q));
            this.f260401d = new java.util.ArrayList();
            this.f260407m.setVisibility(0);
            this.f260405h.setVisibility(8);
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.klf);
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pcc)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ktj));
            this.f260409o.m83213x765074af(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f0(vr4.f1.wi().Ai().q()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdUI", "domestic process!");
        if (com.p314xaae8f345.mm.p2802xd031a825.a.g(this) != null) {
            m83096xe7b1ccf7(new ss4.z(3, null, null, null, null, -1, -1, 0));
        }
        this.f260407m.setVisibility(8);
        this.f260406i.setVisibility(8);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.jqw);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletForgotPwdUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/pwd/ui/WalletForgotPwdUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.m0(this, this);
        this.f260404g = m0Var;
        this.f260405h.setAdapter((android.widget.ListAdapter) m0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.m0 m0Var2 = this.f260404g;
        m0Var2.f260567e = this.f260401d;
        m0Var2.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: checkProcLife */
    public boolean mo66577x53f7ec9a() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: getCancelable */
    public boolean mo73849x5ed8aeca() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d6l;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f260405h = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mpu);
        this.f260407m = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.gcq);
        this.f260409o = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.k3n);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.b9t);
        this.f260408n = viewOnFocusChangeListenerC22907xe18534c2;
        qp5.p.a(viewOnFocusChangeListenerC22907xe18534c2);
        if (m83105x7498fe14().getBoolean("key_is_paymanager", false)) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c22 = this.f260409o;
            if (viewOnFocusChangeListenerC22907xe18534c22 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
            } else {
                viewOnFocusChangeListenerC22907xe18534c22.m83210x25bc1800(new qp5.k(this));
                viewOnFocusChangeListenerC22907xe18534c22.m83197xbfcb5cf0("\\x20\\t\\r\\n".toCharArray());
            }
        } else {
            qp5.p.h(this, this.f260409o);
        }
        this.f260409o.m83211x749e7e77(this);
        this.f260408n.m83211x749e7e77(this);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.f260406i = button;
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.e0(this));
        this.f260410p = false;
        this.f260401d = vr4.f1.wi().Ai().h();
        X6();
        findViewById(com.p314xaae8f345.mm.R.id.jqw).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.f0(this));
        U6();
        mo48633x8f91b80(this.f260408n, 0, false, false);
        this.f260408n.m83210x25bc1800(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.g0(this));
        this.f260408n.m83173x1e821d71().setClickable(true);
        this.f260408n.m83173x1e821d71().setImageResource(com.p314xaae8f345.mm.R.raw.f81361x88cfa7e1);
        this.f260408n.m83173x1e821d71().setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: isTransparent */
    public boolean mo63463x4510f9c8() {
        java.util.ArrayList arrayList = this.f260401d;
        if (arrayList != null && arrayList.size() != 0) {
            return false;
        }
        at4.v1 y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f67043xcbe8ad4f) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f67044xaf3d15db)) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19045x633b9f6);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i17, intent);
        if (i18 == -1 && 1 == i17) {
            this.f260408n.m83188x9ef8cf1(intent.getStringExtra("key_bankcard_id"));
            V6();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kui);
        boolean z17 = m83105x7498fe14().getBoolean("key_is_force_bind", false);
        this.f260411q = z17;
        if (!z17) {
            m83098x5406100e(new ss4.e0(null, 6));
            mo67598xf0aced2e(4);
        }
        mo43517x10010bd5();
        this.f260412r.mo48813x58998cd();
        this.f260413s.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f260412r.mo48814x2efc64();
        this.f260413s.mo48814x2efc64();
        super.onDestroy();
    }

    @Override // qp5.i0
    /* renamed from: onInputValidChange */
    public void mo9068x194c4a1(boolean z17) {
        U6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onProgressFinish */
    public boolean mo63464xa6efccdf() {
        mo67598xf0aced2e(mo63463x4510f9c8() ? 4 : 0);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        X6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdUI", " errCode: %s errMsg :  scene: ", java.lang.Integer.valueOf(i18), str, m1Var);
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof ss4.z) {
                ss4.z zVar = (ss4.z) m1Var;
                android.os.Bundle bundle = new android.os.Bundle();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f493682f)) {
                    this.f260402e = zVar.f493680d;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdUI", "scene case 1 mCardId is null");
                    return true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = zVar.f493681e;
                if (c19097xe6dc5b4c == null) {
                    bundle.putString("bank_name", "");
                    bundle.putParcelable("elemt_query", new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c());
                    bundle.putString("key_card_id", this.f260408n.m83183xfb85ada3());
                    bundle.putBoolean("key_is_reset_with_new_card", true);
                    com.p314xaae8f345.mm.p2802xd031a825.a.d(this, bundle);
                } else {
                    if (c19097xe6dc5b4c.c()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdUI", "scene case 2 mTargetElement is error");
                        db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.kfs, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                        return true;
                    }
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    java.util.ArrayList arrayList = this.f260401d;
                    objArr[0] = java.lang.Integer.valueOf(arrayList == null ? 0 : arrayList.size());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdUI", "scene case 3 bankcards size %d", objArr);
                    java.util.ArrayList arrayList2 = this.f260401d;
                    if (arrayList2 == null || arrayList2.size() == 0) {
                        W6();
                        bundle.putString("bank_name", zVar.f493681e.f261181e);
                        bundle.putParcelable("elemt_query", zVar.f493681e);
                        bundle.putString("key_card_id", this.f260408n.m83183xfb85ada3());
                        bundle.putBoolean("key_is_reset_with_new_card", true);
                        com.p314xaae8f345.mm.p2802xd031a825.a.d(this, bundle);
                        return true;
                    }
                }
            } else if (m1Var instanceof ss4.e0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                objArr2[0] = java.lang.Boolean.valueOf(this.f260404g == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdUI", "scene case queryBound adapter is null ? %s", objArr2);
                if (this.f260404g != null) {
                    java.util.ArrayList h17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj() != null ? ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().h() : null;
                    com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
                    if (g17 != null) {
                        g17.f295334c.getInt("key_support_bankcard", 1);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.util.Iterator it = h17.iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
                            int i19 = c19091x9511676c.f69221x3ca948e9;
                            if (i19 == 1) {
                                arrayList3.add(c19091x9511676c);
                            } else if (i19 == 2) {
                                arrayList4.add(c19091x9511676c);
                            }
                        }
                        if (arrayList3.size() > 0) {
                            this.f260401d = arrayList3;
                        } else {
                            this.f260401d = arrayList4;
                        }
                    }
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    java.util.ArrayList arrayList5 = this.f260401d;
                    objArr3[0] = java.lang.Integer.valueOf(arrayList5 == null ? 0 : arrayList5.size());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdUI", "scene case queryBound adapter update bankcardsize:  %d", objArr3);
                    this.f260404g.f260567e = this.f260401d;
                    new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.h0(this));
                }
            }
        }
        return false;
    }
}

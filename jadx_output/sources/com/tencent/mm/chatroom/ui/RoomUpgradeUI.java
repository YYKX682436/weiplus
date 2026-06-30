package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class RoomUpgradeUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f63890x = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63891d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f63892e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f63893f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f63894g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f63895h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f63896i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f63897m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f63898n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f63899o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f63900p;

    /* renamed from: q, reason: collision with root package name */
    public kn.t f63901q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f63902r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f63903s;

    /* renamed from: t, reason: collision with root package name */
    public int f63904t;

    /* renamed from: u, reason: collision with root package name */
    public int f63905u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f63906v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f63907w;

    public final void T6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.chatroom.ui.RoomAlphaProcessUI.class);
        intent.addFlags(67108864);
        intent.addFlags(65536);
        intent.putExtra("RoomInfo_Id", this.f63891d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/chatroom/ui/RoomUpgradeUI", "doUpgrade", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/chatroom/ui/RoomUpgradeUI", "doUpgrade", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void U6() {
        java.lang.String stringExtra = getIntent().getStringExtra("room_name");
        this.f63891d = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomUpgradeProductsUI", "the roomName is %s", stringExtra);
        gm0.j1.n().f273288b.a(md1.e1.CTRL_INDEX, this);
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f63891d);
        this.f63902r = z07;
        if (z07 == null) {
            finish();
        } else {
            this.f63906v = c01.z1.r().equals(this.f63902r.field_roomowner);
            this.f63907w = !com.tencent.mm.sdk.platformtools.m2.m();
        }
    }

    public final void V6(java.lang.String str) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        java.lang.String w07 = (n17 == null || ((int) n17.E2) <= 0) ? null : n17.w0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(w07)) {
            com.tencent.mm.storage.a3 a3Var = this.f63902r;
            w07 = a3Var == null ? null : a3Var.z0(str);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(w07) && n17 != null && ((int) n17.E2) > 0) {
            w07 = n17.f2();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(w07)) {
            w07 = str;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f63896i, str, null);
        this.f63897m.setVisibility(0);
        this.f63897m.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(this, w07, (int) this.f63897m.getTextSize()));
    }

    public final void W6() {
        java.lang.String str = this.f63902r.field_roomowner;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) > 0) {
            V6(str);
        } else {
            ((c01.k7) c01.n8.a()).g(str, this.f63891d, 30, new com.tencent.mm.chatroom.ui.na(this, str));
        }
        int w07 = this.f63902r.w0();
        this.f63898n.setVisibility(0);
        if (w07 <= 40) {
            this.f63898n.setText(getString(com.tencent.mm.R.string.f492906i71, getString(com.tencent.mm.R.string.i6v)));
        } else {
            this.f63898n.setText(getString(com.tencent.mm.R.string.f492906i71, getString(com.tencent.mm.R.string.i6u)));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488418sr;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.i6t);
        setBackBtn(new com.tencent.mm.chatroom.ui.ja(this));
        this.f63894g = findViewById(com.tencent.mm.R.id.otm);
        this.f63895h = findViewById(com.tencent.mm.R.id.oto);
        this.f63896i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.otl);
        this.f63897m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.otn);
        this.f63898n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.otj);
        this.f63900p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.otk);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oti);
        this.f63899o = textView;
        textView.setOnClickListener(new com.tencent.mm.chatroom.ui.ka(this));
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h1y);
        this.f63893f = textView2;
        textView2.setOnClickListener(new com.tencent.mm.chatroom.ui.la(this));
        if (this.f63906v) {
            this.f63892e = db5.e1.Q(this, null, getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.chatroom.ui.oa(this));
            this.f63901q = new kn.t(this.f63891d);
            gm0.j1.n().f273288b.g(this.f63901q);
        } else {
            W6();
            if (!this.f63907w) {
                this.f63893f.setVisibility(0);
            }
            this.f63893f.setText(com.tencent.mm.R.string.i6w);
            this.f63899o.setVisibility(8);
            this.f63900p.setVisibility(8);
        }
        if (this.f63907w) {
            this.f63893f.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 400) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RoomUpgradeProductsUI", "onActivityResult unknow request");
        } else {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        U6();
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f273288b.d(this.f63901q);
        gm0.j1.n().f273288b.q(md1.e1.CTRL_INDEX, this);
        android.app.ProgressDialog progressDialog = this.f63892e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        boolean z17;
        if (intent.hasExtra("upgrade_success")) {
            z17 = intent.getBooleanExtra("upgrade_success", false);
        } else {
            if (intent.hasExtra("wizard_activity_result_code") && intent.getIntExtra("wizard_activity_result_code", -1) == -1) {
                T6();
            }
            if (intent.hasExtra("announce_ok")) {
                T6();
            }
            z17 = false;
        }
        if (z17) {
            U6();
            int intExtra = intent.getIntExtra("left_quota", 0);
            W6();
            this.f63899o.setVisibility(8);
            this.f63904t = intExtra;
            if (intExtra > 0) {
                this.f63900p.setText(getString(com.tencent.mm.R.string.i6z, java.lang.Integer.valueOf(intExtra)));
            } else {
                this.f63900p.setText(getString(com.tencent.mm.R.string.f492905i70));
            }
            if (!this.f63907w) {
                this.f63893f.setVisibility(0);
            }
            this.f63893f.setText(com.tencent.mm.R.string.i6w);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.app.ProgressDialog progressDialog = this.f63892e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            db5.e1.G(this, getString(com.tencent.mm.R.string.i6y), getString(com.tencent.mm.R.string.f490573yv), false, new com.tencent.mm.chatroom.ui.pa(this));
            return;
        }
        if (i17 == 0 && i18 == 0 && m1Var.getType() == 519) {
            kn.t tVar = (kn.t) m1Var;
            this.f63905u = tVar.f309463f;
            this.f63904t = tVar.f309464g;
            W6();
            this.f63900p.setVisibility(0);
            this.f63899o.setText(getString(com.tencent.mm.R.string.i6s));
            int i19 = this.f63904t;
            if (i19 > 0) {
                this.f63900p.setText(getString(com.tencent.mm.R.string.i6z, java.lang.Integer.valueOf(i19)));
            } else {
                this.f63900p.setText(getString(com.tencent.mm.R.string.f492905i70));
            }
            if (!this.f63907w) {
                this.f63893f.setVisibility(0);
            }
            switch (this.f63905u) {
                case 1:
                case 2:
                case 5:
                    this.f63899o.setVisibility(0);
                    this.f63893f.setText(com.tencent.mm.R.string.i6x);
                    return;
                case 3:
                case 4:
                case 6:
                    this.f63899o.setVisibility(0);
                    this.f63899o.setEnabled(false);
                    this.f63893f.setText(com.tencent.mm.R.string.i6x);
                    return;
                case 7:
                    this.f63899o.setVisibility(8);
                    this.f63893f.setText(com.tencent.mm.R.string.i6w);
                    this.f63899o.setEnabled(false);
                    return;
                default:
                    return;
            }
        }
    }
}

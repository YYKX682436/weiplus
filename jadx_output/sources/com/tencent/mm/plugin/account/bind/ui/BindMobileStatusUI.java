package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes5.dex */
public class BindMobileStatusUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f73012z = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f73013e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f73014f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f73015g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f73016h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f73017i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f73018m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f73019n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Boolean f73020o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f73021p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.RelativeLayout f73022q;

    /* renamed from: r, reason: collision with root package name */
    public int f73023r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.modelsimple.BindWordingContent f73024s;

    /* renamed from: t, reason: collision with root package name */
    public int f73025t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f73026u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f73027v;

    /* renamed from: w, reason: collision with root package name */
    public android.content.SharedPreferences f73028w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.HashMap f73029x;

    /* renamed from: y, reason: collision with root package name */
    public final android.util.SparseArray f73030y;

    public BindMobileStatusUI() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.f73019n = bool;
        this.f73020o = bool;
        this.f73029x = new java.util.HashMap();
        this.f73030y = new android.util.SparseArray(3);
    }

    public static void Z6(android.content.Context context, boolean z17, boolean z18) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        sharedPreferences.edit().putBoolean("settings_find_me_by_mobile", z17 ^ true).commit();
        sharedPreferences.edit().putBoolean("settings_recommend_mobilefriends_to_me", z18 ^ true).commit();
        int p17 = c01.z1.p();
        int i17 = z17 ? p17 | 512 : p17 & (-513);
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(z18 ? i17 | 256 : i17 & (-257)));
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 8;
        p53Var.f382762e = z18 ? 1 : 2;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        r45.p53 p53Var2 = new r45.p53();
        p53Var2.f382761d = 7;
        p53Var.f382762e = z17 ? 1 : 2;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var2));
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
    }

    public final boolean a7(boolean z17, int i17, int i18) {
        if (z17) {
            this.f73023r = i17 | this.f73023r;
        } else {
            this.f73023r = (~i17) & this.f73023r;
        }
        this.f73029x.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(z17 ? 1 : 2));
        java.lang.String str = (java.lang.String) this.f73030y.get(i18);
        if (this.f73028w != null && str != null && str.length() > 0) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            if (i18 == 8 || i18 == 7) {
                valueOf = java.lang.Boolean.valueOf(!z17);
            }
            this.f73028w.edit().putBoolean(str, valueOf.booleanValue()).commit();
        }
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488198k8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f73013e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483382ai2);
        this.f73015g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483380ai0);
        this.f73014f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ahz);
        this.f73016h = (android.widget.Button) findViewById(com.tencent.mm.R.id.f483381ai1);
        this.f73017i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.aio);
        this.f73018m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ain);
        this.f73021p = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.ahw);
        this.f73022q = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.ahx);
        int i17 = this.f73025t;
        if (i17 == 0) {
            this.f73021p.setVisibility(8);
            this.f73022q.setVisibility(8);
            a7(!this.f73026u, 512, 8);
            a7(!this.f73027v, 256, 7);
        } else if (i17 == 1) {
            this.f73021p.setVisibility(0);
            this.f73021p.setBackgroundResource(com.tencent.mm.R.drawable.f480960gf);
            this.f73022q.setVisibility(8);
        }
        com.tencent.mm.modelsimple.BindWordingContent bindWordingContent = this.f73024s;
        if (bindWordingContent != null && bindWordingContent.f71278f.intValue() == 2) {
            this.f73014f.setVisibility(8);
        }
        this.f73016h.setVisibility(8);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new p61.g2(this));
        if (r61.q0.b() == js.x0.SUCC || r61.q0.b() == js.x0.SUCC_UNLOAD) {
            this.f73013e.setImageResource(com.tencent.mm.R.drawable.bgj);
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
            if (str == null || str.equals("")) {
            }
        } else {
            this.f73013e.setImageResource(com.tencent.mm.R.drawable.bgg);
            this.f73014f.setVisibility(8);
            this.f73015g.setText(getString(com.tencent.mm.R.string.aft));
        }
        this.f73017i.setOnClickListener(new p61.h2(this));
        this.f73018m.setOnClickListener(new p61.i2(this));
        this.f73016h.setOnClickListener(new p61.j2(this));
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f73028w = getSharedPreferences(getPackageName() + "_preferences", 0);
        this.f73023r = c01.z1.p();
        android.util.SparseArray sparseArray = this.f73030y;
        sparseArray.put(8, "settings_find_me_by_mobile");
        sparseArray.put(7, "settings_recommend_mobilefriends_to_me");
        sparseArray.put(32, "settings_autoadd_mobilefriends");
        a7(false, 512, 8);
        a7(false, 256, 7);
        setMMTitle(com.tencent.mm.R.string.f490717ah2);
        this.f73024s = (com.tencent.mm.modelsimple.BindWordingContent) getIntent().getParcelableExtra("kstyle_bind_wording");
        this.f73025t = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
        this.f73026u = getIntent().getBooleanExtra("Kfind_friend_by_mobile_flag", false);
        this.f73027v = getIntent().getBooleanExtra("Krecom_friends_by_mobile_flag", false);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6(1);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(this.f73023r));
        java.util.HashMap hashMap = this.f73029x;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = intValue;
            p53Var.f382762e = intValue2;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
        super.onPause();
    }
}

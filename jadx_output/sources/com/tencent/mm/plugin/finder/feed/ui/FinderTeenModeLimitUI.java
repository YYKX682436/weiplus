package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderTeenModeLimitUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f109555w = 0;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f109556t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f109557u;

    /* renamed from: v, reason: collision with root package name */
    public int f109558v = -1;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 127;
    }

    public final void c7(java.lang.String str, int i17, boolean z17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (this.f109557u) {
            jSONObject.put("limit_type", "1");
        } else {
            jSONObject.put("limit_type", "2");
        }
        if (z17) {
            jSONObject.put("valid_result", i17);
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 1, str, t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b9z;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String string;
        java.lang.String string2;
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.djn);
        if (button != null) {
            if (this.f109558v == 7) {
                string2 = getResources().getString(com.tencent.mm.R.string.f6q);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
            } else {
                string2 = getResources().getString(com.tencent.mm.R.string.f6r);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
            }
            button.setText(string2);
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.djn);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.sl(this));
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487332ob3);
        if (textView != null) {
            boolean z17 = this.f109557u;
            hy2.g gVar = hy2.g.f286058a;
            if (!z17) {
                string = textView.getResources().getString(this.f109558v == 7 ? com.tencent.mm.R.string.i3d : com.tencent.mm.R.string.f7p, java.lang.Integer.valueOf(gVar.c() / 60));
            } else if (this.f109558v == 7) {
                string = getResources().getString(com.tencent.mm.R.string.i3c, gVar.b() + ":00", gVar.a() + ":00");
                kotlin.jvm.internal.o.d(string);
            } else {
                string = getResources().getString(com.tencent.mm.R.string.f7o, java.lang.Integer.valueOf(gVar.b()), java.lang.Integer.valueOf(gVar.a()));
                kotlin.jvm.internal.o.d(string);
            }
            textView.setText(string);
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.hy_);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.tl(this));
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.hya);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f109556t = findViewById3;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.finder.feed.ui.rl(this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isSupportNavigationSwipeBack */
    public boolean getF65848t() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 12222) {
            if (i18 != -1) {
                if (i18 != 0) {
                    return;
                }
                c7("teenagemode_timelock_pwdvalidation_result", 0, true);
            } else {
                ((com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM.class)).U6(this.f109557u, "VerifyPassword");
                setResult(-1);
                if (!(isFinishing() | isDestroyed())) {
                    finish();
                }
                c7("teenagemode_timelock_pwdvalidation_result", 1, true);
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(11112);
        super.onBackPressed();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f109557u = getIntent().getBooleanExtra("key_is_curfew", false);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (this.f109557u) {
            jSONObject.put("limit_type", "1");
        } else {
            jSONObject.put("limit_type", "2");
        }
        this.f109558v = getIntent().getIntExtra("key_finder_teen_mode_scene", -1);
        getIntent().putExtra("key_udf_kv", jSONObject.toString());
        ((com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM.class)).f136734h = false;
        initView();
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderTeenModeLimitUI)).Rj(this, iy1.a.Finder);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM.class)).f136734h = true;
    }
}

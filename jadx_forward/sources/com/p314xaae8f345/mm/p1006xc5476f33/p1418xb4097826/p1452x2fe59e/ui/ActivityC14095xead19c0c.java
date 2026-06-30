package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI */
/* loaded from: classes.dex */
public final class ActivityC14095xead19c0c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f191088w = 0;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f191089t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f191090u;

    /* renamed from: v, reason: collision with root package name */
    public int f191091v = -1;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return 127;
    }

    public final void c7(java.lang.String str, int i17, boolean z17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (this.f191090u) {
            jSONObject.put("limit_type", "1");
        } else {
            jSONObject.put("limit_type", "2");
        }
        if (z17) {
            jSONObject.put("valid_result", i17);
        }
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = mo55332x76847179 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, 1, str, t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b9z;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String string;
        java.lang.String string2;
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.djn);
        if (button != null) {
            if (this.f191091v == 7) {
                string2 = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f6q);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            } else {
                string2 = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f6r);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            }
            button.setText(string2);
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.djn);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sl(this));
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568865ob3);
        if (textView != null) {
            boolean z17 = this.f191090u;
            hy2.g gVar = hy2.g.f367591a;
            if (!z17) {
                string = textView.getResources().getString(this.f191091v == 7 ? com.p314xaae8f345.mm.R.C30867xcad56011.i3d : com.p314xaae8f345.mm.R.C30867xcad56011.f7p, java.lang.Integer.valueOf(gVar.c() / 60));
            } else if (this.f191091v == 7) {
                string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i3c, gVar.b() + ":00", gVar.a() + ":00");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            } else {
                string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7o, java.lang.Integer.valueOf(gVar.b()), java.lang.Integer.valueOf(gVar.a()));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            }
            textView.setText(string);
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.hy_);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.tl(this));
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.hya);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f191089t = findViewById3;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.rl(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isSupportNavigationSwipeBack */
    public boolean getF147381t() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 12222) {
            if (i18 != -1) {
                if (i18 != 0) {
                    return;
                }
                c7("teenagemode_timelock_pwdvalidation_result", 0, true);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f.class)).U6(this.f191090u, "VerifyPassword");
                setResult(-1);
                if (!(isFinishing() | isDestroyed())) {
                    finish();
                }
                c7("teenagemode_timelock_pwdvalidation_result", 1, true);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        setResult(11112);
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        mo78514x143f1b92().W0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f191090u = getIntent().getBooleanExtra("key_is_curfew", false);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (this.f191090u) {
            jSONObject.put("limit_type", "1");
        } else {
            jSONObject.put("limit_type", "2");
        }
        this.f191091v = getIntent().getIntExtra("key_finder_teen_mode_scene", -1);
        getIntent().putExtra("key_udf_kv", jSONObject.toString());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f.class)).f218267h = false;
        mo43517x10010bd5();
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderTeenModeLimitUI)).Rj(this, iy1.a.Finder);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f.class)).f218267h = true;
    }
}

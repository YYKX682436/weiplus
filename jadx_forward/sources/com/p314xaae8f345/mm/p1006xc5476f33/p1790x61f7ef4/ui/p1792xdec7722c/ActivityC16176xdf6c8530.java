package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c;

/* renamed from: com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI */
/* loaded from: classes11.dex */
public class ActivityC16176xdf6c8530 extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f224918u = 0;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f224919d;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f224923h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f224924i;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f224926n;

    /* renamed from: o, reason: collision with root package name */
    public i93.e f224927o;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f224929q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f224930r;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f224932t;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f224920e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f224921f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public int f224922g = -1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f224925m = false;

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f224928p = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f224931s = true;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bnc;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dg6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f224919d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.hsb);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dg6);
        this.f224924i = textView2;
        textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571431eu);
        this.f224922g = getIntent().getIntExtra("edit_mode_state", -1);
        this.f224928p = b93.r.wi().i1();
        i93.e eVar = new i93.e(mo55332x76847179());
        this.f224927o = eVar;
        eVar.f371272s = true;
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2559xed8e89a9.C20615x8ee66c89()) == 1) {
            this.f224927o.f371273t = getIntent().getBooleanExtra("contact_search_label_show_member_count", true);
        } else {
            this.f224927o.f371273t = getIntent().getBooleanExtra("contact_search_label_show_member_count", false);
        }
        this.f224927o.f371274u = getIntent().getBooleanExtra("contact_search_label_enable_choose_empty_label", true);
        this.f224931s = getIntent().getBooleanExtra("contact_search_label_need_toast_after_choose", true);
        java.lang.String stringExtra = getIntent().getStringExtra("contact_has_choose_label_list");
        if (!android.text.TextUtils.isEmpty(stringExtra)) {
            this.f224920e.clear();
            this.f224920e.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(stringExtra, ","));
            if (!this.f224920e.isEmpty()) {
                this.f224927o.f371264h = this.f224920e;
            }
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("contact_search_label_forbid_select_label_id_list");
        if (!android.text.TextUtils.isEmpty(stringExtra2)) {
            this.f224921f.clear();
            this.f224921f.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(stringExtra2, ","));
            this.f224927o.f371266m = this.f224921f;
        }
        this.f224919d.mo7960x6cab2c8d(this.f224927o);
        this.f224919d.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        this.f224919d.m7963x830bc99d(true);
        this.f224927o.z(this.f224928p);
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9(true, false);
        this.f224923h = c9Var;
        c9Var.c(true);
        this.f224923h.f291851c = true;
        this.f224929q = findViewById(com.p314xaae8f345.mm.R.id.f565684d61);
        this.f224923h.q(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9m));
        this.f224927o.f371269p = this.f224928p;
        android.view.View view = this.f224929q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var2 = this.f224923h;
        c9Var2.f291863o = new i93.C28508x2f5e1a(this);
        c9Var2.f291857i = new i93.h(this);
        m78489xd6d59aa8(true, c9Var2);
        this.f224932t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gx7);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.jbm);
        this.f224926n = button;
        button.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572026wm));
        this.f224932t.setOnClickListener(new i93.i(this));
        this.f224926n.setOnClickListener(new i93.j(this));
        this.f224927o.f371275v = new i93.k(this);
        mo54448x9c8c0d33(new i93.l(this));
        this.f224919d.setVisibility(4);
        android.view.ViewGroup.LayoutParams layoutParams = this.f224919d.getLayoutParams();
        if ((this.f224922g == 0) && (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            this.f224919d.setLayoutParams(layoutParams);
        }
        if (this.f224927o.mo1894x7e414b06() == 0) {
            this.f224924i.setSingleLine(false);
            this.f224924i.setPadding(40, 0, 40, 0);
            this.f224924i.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(this);
        this.f224930r = f5Var;
        f5Var.f291933e = this;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f224930r;
        if (f5Var != null) {
            f5Var.d();
        }
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f224930r;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(i93.d.class);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        android.animation.ObjectAnimator ofFloat;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelSearchUI", "onKeyboardHeightChanged, height:%s", java.lang.Integer.valueOf(i17));
        android.view.View view = this.f224929q;
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelSearchUI", "moveViewUppos, container: isNull");
            return;
        }
        if (i17 > 0) {
            if (view.getTranslationY() != 0.0f) {
                view.setTranslationY(0.0f);
            }
            ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationY", 0.0f, -i17);
        } else {
            ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), 0.0f);
        }
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new y3.b());
        ofFloat.addUpdateListener(new i93.m(this));
        ofFloat.start();
    }
}

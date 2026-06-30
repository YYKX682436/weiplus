package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter */
/* loaded from: classes8.dex */
public final class C19493xb618544c extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public ey4.i f268810d;

    /* renamed from: e, reason: collision with root package name */
    public ey4.g f268811e;

    /* renamed from: f, reason: collision with root package name */
    public ey4.h f268812f;

    /* renamed from: g, reason: collision with root package name */
    public int f268813g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19496x19c2a45a f268814h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f268815i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f268816m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f268817n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f268818o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageButton f268819p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f268820q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f268821r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f268822s;

    /* renamed from: t, reason: collision with root package name */
    public int f268823t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f268824u;

    public C19493xb618544c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f268813g = 0;
        this.f268823t = Integer.MAX_VALUE;
        this.f268824u = true;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.f268821r = abstractActivityC21394xb3d2c0cf;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.d9v, this);
        this.f268820q = (android.widget.LinearLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pi_);
        this.f268816m = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pih);
        this.f268817n = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pid);
        this.f268815i = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pii);
        this.f268818o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pia);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pik);
        this.f268819p = imageButton;
        imageButton.setOnClickListener(new ey4.a(this));
        this.f268818o.setOnTouchListener(new ey4.b(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19496x19c2a45a c19496x19c2a45a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19496x19c2a45a(getContext());
        this.f268814h = c19496x19c2a45a;
        c19496x19c2a45a.setVisibility(8);
        this.f268814h.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bcd);
        this.f268814h.m74846x5e04422d(new ey4.c(this));
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.m7g)).addView(this.f268814h, -1, 0);
        this.f268817n.setOnClickListener(new ey4.e(this));
        this.f268818o.addTextChangedListener(new ey4.f(this));
    }

    public void a() {
        setVisibility(8);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f268821r;
        if (abstractActivityC21394xb3d2c0cf != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f268818o;
            if (c22621x7603e017 != null) {
                abstractActivityC21394xb3d2c0cf.mo53060x36654fab(c22621x7603e017);
            }
            this.f268821r.mo48674x36654fab();
        }
        this.f268813g = 0;
        b();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f268818o;
        if (c22621x7603e0172 != null) {
            c22621x7603e0172.clearFocus();
            this.f268818o.setFocusable(false);
            this.f268818o.setFocusableInTouchMode(false);
        }
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19330x7ca5b1cf c19330x7ca5b1cf;
        ey4.h hVar = this.f268812f;
        if (hVar != null && (c19330x7ca5b1cf = (e0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.i0) hVar).f263753a).f263720u) != null && c19330x7ca5b1cf.m74396xfc829cc4() > 0) {
            int m74396xfc829cc4 = e0Var.f263720u.m74396xfc829cc4();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) e0Var.f263721v.getLayoutParams();
            if (marginLayoutParams.bottomMargin != m74396xfc829cc4) {
                marginLayoutParams.bottomMargin = m74396xfc829cc4;
                e0Var.f263721v.setLayoutParams(marginLayoutParams);
            }
        }
        this.f268814h.getClass();
        this.f268814h.setVisibility(8);
        this.f268819p.setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
        this.f268813g = 0;
    }

    public final int c() {
        ey4.h hVar = this.f268812f;
        if (hVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.i0) hVar).f263753a;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) e0Var.f263721v.getLayoutParams();
            if (marginLayoutParams.bottomMargin != 0) {
                marginLayoutParams.bottomMargin = 0;
                e0Var.f263721v.setLayoutParams(marginLayoutParams);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f268818o;
        if (c22621x7603e017 != null) {
            this.f268821r.mo53060x36654fab(c22621x7603e017);
        }
        this.f268814h.getClass();
        this.f268814h.setVisibility(0);
        android.view.View view = this.f268814h.f268857h;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyPanel", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyPanel", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f268814h.getLayoutParams();
        if (layoutParams != null && this.f268824u) {
            layoutParams.height = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
            this.f268814h.setLayoutParams(layoutParams);
        }
        if (layoutParams != null) {
            return layoutParams.height;
        }
        return 0;
    }

    @Override // android.view.View
    public boolean isShown() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f268818o;
        if (c22621x7603e017 != null) {
            c22621x7603e017.clearFocus();
            this.f268818o.setFocusable(false);
            this.f268818o.setFocusableInTouchMode(false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f268818o;
        if (c22621x7603e0172 != null && (abstractActivityC21394xb3d2c0cf = this.f268821r) != null) {
            abstractActivityC21394xb3d2c0cf.mo53060x36654fab(c22621x7603e0172);
        }
        this.f268818o = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19496x19c2a45a c19496x19c2a45a = this.f268814h;
        ey4.c0 c0Var = c19496x19c2a45a.f268855f;
        c0Var.f339142a = null;
        c0Var.f339143b = null;
        android.view.View view = c19496x19c2a45a.f268857h;
        if (view != null) {
            ((android.view.ViewGroup) view.getParent()).removeView(c19496x19c2a45a.f268857h);
            ((android.view.ViewGroup) c19496x19c2a45a.f268857h).removeAllViews();
            c19496x19c2a45a.f268857h = null;
        }
        c19496x19c2a45a.f268856g = null;
        removeAllViews();
        this.f268821r = null;
        this.f268810d = null;
    }

    /* renamed from: setMaxCount */
    public void m74827x8d59188d(int i17) {
        if (i17 > 0) {
            this.f268823t = i17;
        }
    }

    /* renamed from: setOnSmileyChosenListener */
    public void m74828xc90eaa98(ey4.g gVar) {
        this.f268811e = gVar;
    }

    /* renamed from: setOnSmileyPanelVisibilityChangedListener */
    public void m74829x3b49b4c4(ey4.h hVar) {
        this.f268812f = hVar;
    }

    /* renamed from: setOnTextSendListener */
    public void m74830x6cbdc62a(ey4.i iVar) {
        this.f268810d = iVar;
    }

    /* renamed from: setText */
    public void m74831x765074af(java.lang.String str) {
        this.f268818o.setText("");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            this.f268818o.append(str);
        } catch (java.lang.Exception unused) {
        }
        this.f268818o.getText();
    }
}

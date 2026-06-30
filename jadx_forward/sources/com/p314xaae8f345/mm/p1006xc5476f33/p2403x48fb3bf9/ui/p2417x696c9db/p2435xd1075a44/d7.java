package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class d7 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.f7 f268694d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f268695e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f268696f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f268697g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f268698h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f268699i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f268700m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewTreeObserver f268701n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f268702o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f268703p;

    /* renamed from: q, reason: collision with root package name */
    public int f268704q;

    public d7(android.content.Context context) {
        this.f268703p = false;
        this.f268695e = context;
        if (context instanceof android.app.Activity) {
            this.f268696f = ((android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView()).findViewById(android.R.id.content);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.f7 f7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.f7(context);
        this.f268694d = f7Var;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.eik, null);
        this.f268697g = inflate;
        this.f268698h = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.jhc);
        this.f268699i = (android.widget.ImageView) this.f268697g.findViewById(com.p314xaae8f345.mm.R.id.vk8);
        android.view.View findViewById = this.f268697g.findViewById(com.p314xaae8f345.mm.R.id.uq8);
        this.f268700m = findViewById;
        findViewById.setFocusable(true);
        this.f268700m.setClickable(true);
        this.f268700m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y6(this));
        f7Var.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z6(this));
        this.f268703p = b();
        if (com.p314xaae8f345.mm.ui.bk.p(context) > 0) {
            int a17 = com.p314xaae8f345.mm.ui.zk.a(context, 40);
            this.f268700m.setPadding(a17, com.p314xaae8f345.mm.ui.zk.a(context, 60) - com.p314xaae8f345.mm.ui.bk.p(context), a17, 0);
        }
    }

    public final void a(android.view.View view, java.lang.Runnable runnable) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c7(this, runnable));
        ofFloat.start();
    }

    public final boolean b() {
        android.content.Context context = this.f268695e;
        return context != null && context.getResources().getConfiguration().orientation == 2;
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.f7 f7Var = this.f268694d;
        android.content.Context context = this.f268695e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMenuContainer", "tryHide containerDialog:%s, mContext:%s", f7Var, context);
        if (f7Var != null) {
            if (!(context instanceof android.app.Activity)) {
                a(this.f268697g, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.b7(this));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMenuContainer", " cannot dismiss !");
            if (context == null || ((android.app.Activity) context).isFinishing() || ((android.app.Activity) context).isDestroyed()) {
                return;
            }
            a(this.f268697g, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.a7(this));
        }
    }

    public void d() {
        this.f268703p = b();
        java.lang.Object obj = this.f268695e;
        this.f268704q = obj instanceof android.app.Activity ? ((android.app.Activity) obj).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
        if (this.f268703p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMenuContainer", "not tryShow for Landscape");
        }
        android.view.View view = this.f268696f;
        if (view != null) {
            boolean z17 = this.f268701n == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f268701n = viewTreeObserver;
            if (z17) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                if (obj instanceof p012xc85e97e9.p093xedfae76a.y) {
                    ((p012xc85e97e9.p093xedfae76a.y) obj).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.webview.ui.tools.widget.WebMenuContainer$3
                        @Override // p012xc85e97e9.p093xedfae76a.v
                        /* renamed from: onStateChanged */
                        public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
                            if (mVar == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7 d7Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7.this;
                                android.view.ViewTreeObserver viewTreeObserver2 = d7Var.f268701n;
                                if (viewTreeObserver2 != null) {
                                    if (!viewTreeObserver2.isAlive()) {
                                        d7Var.f268701n = d7Var.f268696f.getViewTreeObserver();
                                    }
                                    d7Var.f268701n.removeGlobalOnLayoutListener(d7Var);
                                    d7Var.f268701n = null;
                                }
                                yVar.mo273xed6858b4().c(this);
                            }
                        }
                    });
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.f7 f7Var = this.f268694d;
        if (f7Var != null) {
            f7Var.getWindow().addFlags(Integer.MIN_VALUE);
            f7Var.getWindow().clearFlags(8);
            f7Var.getWindow().clearFlags(131072);
            f7Var.getWindow().clearFlags(128);
            f7Var.getWindow().getDecorView().setSystemUiVisibility(0);
            if (!(obj instanceof android.app.Activity) || ((android.app.Activity) obj).isFinishing()) {
                return;
            }
            android.widget.ImageView imageView = this.f268699i;
            if (imageView != null) {
                if (this.f268703p) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                }
            }
            f7Var.show();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f268697g, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.f7 f7Var = this.f268694d;
        if (f7Var != null && f7Var.isShowing()) {
            android.view.View view = this.f268696f;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                c();
                return;
            }
            if (f7Var != null && f7Var.isShowing()) {
                if (this.f268703p == b()) {
                    int i17 = this.f268704q;
                    android.content.Context context = this.f268695e;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                c();
            }
        }
    }
}

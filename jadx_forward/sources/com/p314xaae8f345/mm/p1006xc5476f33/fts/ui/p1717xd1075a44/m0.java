package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes8.dex */
public abstract class m0 extends p012xc85e97e9.p016x746ad0e3.app.i0 implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f219827f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f219828g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f219829h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f219830i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f219831m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f219832n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f219833o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.content.Context selfContext) {
        super(selfContext, com.p314xaae8f345.mm.R.C30868x68b1db1.f575765yo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfContext, "selfContext");
        this.f219827f = selfContext;
        jz5.g b17 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.l0(this));
        this.f219832n = b17;
        ((p012xc85e97e9.p093xedfae76a.b0) ((jz5.n) b17).mo141623x754a37bb()).g(p012xc85e97e9.p093xedfae76a.n.INITIALIZED);
    }

    public void D() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
        }
        int i17 = 0;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bj8, (android.view.ViewGroup) null, false);
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f219828g = inflate;
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.f565753df2) : null;
        this.f219829h = findViewById;
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.w0 w0Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.w0) this;
            if (com.p314xaae8f345.mm.ui.b4.c(w0Var.getContext())) {
                android.content.Context context = w0Var.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                if (w0Var.getContext() instanceof android.view.ContextThemeWrapper) {
                    android.content.Context context2 = w0Var.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.view.ContextThemeWrapper");
                    context = ((android.view.ContextThemeWrapper) context2).getBaseContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getBaseContext(...)");
                }
                i17 = com.p314xaae8f345.mm.ui.bl.c(context);
            }
            layoutParams.height = (i65.a.k(w0Var.getContext()) - i65.a.b(w0Var.getContext(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e)) - i17;
            android.view.View view = this.f219829h;
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
        }
        android.view.View view2 = this.f219829h;
        if (view2 != null) {
            view2.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.j0(this));
        }
        android.view.View view3 = this.f219828g;
        this.f219831m = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.ci6) : null;
        android.view.View inflate2 = android.view.LayoutInflater.from(((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.w0) this).getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bd7, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        this.f219830i = inflate2;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(3, com.p314xaae8f345.mm.R.id.f565753df2);
        android.view.View view4 = this.f219828g;
        android.view.ViewGroup viewGroup = view4 instanceof android.view.ViewGroup ? (android.view.ViewGroup) view4 : null;
        if (viewGroup != null) {
            viewGroup.addView(this.f219830i, layoutParams2);
        }
        setCancelable(true);
        super.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.k0(this));
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return (p012xc85e97e9.p093xedfae76a.b0) ((jz5.n) this.f219832n).mo141623x754a37bb();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f219830i != null) {
            int i17 = 0;
            if (android.os.Build.VERSION.SDK_INT < 30) {
                android.content.Context context = this.f219827f;
                if (com.p314xaae8f345.mm.ui.bl.f(context)) {
                    if (!(getContext().getResources().getConfiguration().orientation == 2)) {
                        i17 = com.p314xaae8f345.mm.ui.bl.c(context);
                    }
                }
            }
            android.view.View view = this.f219830i;
            android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i17;
            }
            android.view.View view2 = this.f219830i;
            if (view2 == null) {
                return;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((p012xc85e97e9.p093xedfae76a.b0) ((jz5.n) this.f219832n).mo141623x754a37bb()).g(p012xc85e97e9.p093xedfae76a.n.CREATED);
        D();
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f219833o = onDismissListener;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        com.p314xaae8f345.mm.ui.bk.C();
        ((p012xc85e97e9.p093xedfae76a.b0) ((jz5.n) this.f219832n).mo141623x754a37bb()).g(p012xc85e97e9.p093xedfae76a.n.RESUMED);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }
}

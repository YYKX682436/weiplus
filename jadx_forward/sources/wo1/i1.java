package wo1;

/* loaded from: classes5.dex */
public final class i1 extends y9.i {

    /* renamed from: n, reason: collision with root package name */
    public final android.content.Context f529485n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.FrameLayout f529486o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f529487p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.content.Context ctx) {
        super(ctx, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        this.f529485n = ctx;
        this.f529486o = new android.widget.FrameLayout(ctx);
        this.f529487p = jz5.h.b(new wo1.f1(this));
    }

    public final void E() {
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
        android.widget.FrameLayout frameLayout = this.f529486o;
        frameLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b8p);
        super.setContentView(frameLayout, layoutParams);
        android.view.View findViewById = findViewById(android.R.id.content);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        wo1.h1 h1Var = new wo1.h1(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.u(findViewById, h1Var);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(this.f529485n);
        ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046) ((jz5.n) this.f529487p).mo141623x754a37bb()).C((int) (java.lang.Math.max(b17.y, b17.x) * 0.85d));
    }

    @Override // y9.i, p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void setContentView(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        E();
        android.widget.FrameLayout frameLayout = this.f529486o;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }

    @Override // y9.i, p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void setContentView(int i17) {
        E();
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.f529485n);
        android.widget.FrameLayout frameLayout = this.f529486o;
        android.view.View inflate = from.inflate(i17, (android.view.ViewGroup) frameLayout, false);
        frameLayout.removeAllViews();
        frameLayout.addView(inflate);
    }

    @Override // y9.i, p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        E();
        android.widget.FrameLayout frameLayout = this.f529486o;
        frameLayout.removeAllViews();
        frameLayout.addView(view, layoutParams);
    }
}

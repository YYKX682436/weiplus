package gn5;

/* loaded from: classes14.dex */
public final class p extends gn5.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f355222d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.WindowManager f355223e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f355224f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 f355225g;

    public p(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f355222d = context;
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f355223e = (android.view.WindowManager) systemService;
    }

    @Override // gn5.b
    public boolean a(android.view.View anchor, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        if (!(obj instanceof ir.a1) || !anchor.isEnabled()) {
            return false;
        }
        this.f355224f = anchor;
        d(anchor, obj);
        return true;
    }

    @Override // gn5.b
    public void b(android.view.View anchor, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355224f, anchor)) {
            return;
        }
        this.f355224f = anchor;
        d(anchor, obj);
    }

    @Override // gn5.b
    public void c() {
        this.f355224f = null;
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 abstractC22836x7ad225f4 = this.f355225g;
        if (abstractC22836x7ad225f4 != null) {
            this.f355223e.removeView(abstractC22836x7ad225f4);
        }
        this.f355225g = null;
    }

    public final void d(android.view.View view, java.lang.Object obj) {
        if (!(obj instanceof ir.a1) || !view.isEnabled()) {
            com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 abstractC22836x7ad225f4 = this.f355225g;
            if (abstractC22836x7ad225f4 == null) {
                return;
            }
            abstractC22836x7ad225f4.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 abstractC22836x7ad225f42 = this.f355225g;
        android.view.WindowManager windowManager = this.f355223e;
        if (abstractC22836x7ad225f42 == null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.cb) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x6.class))).getClass();
            com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 a17 = gn5.l.a(this.f355222d, obj);
            this.f355225g = a17;
            windowManager.addView(a17, a17.getF295229n());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 abstractC22836x7ad225f43 = this.f355225g;
        if (abstractC22836x7ad225f43 != null) {
            abstractC22836x7ad225f43.setVisibility(0);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x6 x6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x6.class);
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 abstractC22836x7ad225f44 = this.f355225g;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.cb) x6Var).getClass();
        gn5.l.b(abstractC22836x7ad225f44, obj);
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 abstractC22836x7ad225f45 = this.f355225g;
        if (abstractC22836x7ad225f45 != null) {
            abstractC22836x7ad225f45.d(view);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 abstractC22836x7ad225f46 = this.f355225g;
        windowManager.updateViewLayout(abstractC22836x7ad225f46, abstractC22836x7ad225f46 != null ? abstractC22836x7ad225f46.getF295229n() : null);
    }
}

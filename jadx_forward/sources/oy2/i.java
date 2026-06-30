package oy2;

/* loaded from: classes8.dex */
public abstract class i extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 implements oy2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f431489d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f431490e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca f431491f;

    /* renamed from: g, reason: collision with root package name */
    public final int f431492g;

    /* renamed from: h, reason: collision with root package name */
    public final int f431493h;

    /* renamed from: i, reason: collision with root package name */
    public final int f431494i;

    /* renamed from: m, reason: collision with root package name */
    public final int f431495m;

    /* renamed from: n, reason: collision with root package name */
    public int f431496n;

    /* renamed from: o, reason: collision with root package name */
    public int f431497o;

    /* renamed from: p, reason: collision with root package name */
    public int f431498p;

    /* renamed from: q, reason: collision with root package name */
    public int f431499q;

    /* renamed from: r, reason: collision with root package name */
    public int f431500r;

    /* renamed from: s, reason: collision with root package name */
    public int f431501s;

    /* renamed from: t, reason: collision with root package name */
    public int f431502t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context, int i17) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575633e7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f431489d = context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8 e8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8.f183664a;
        this.f431492g = e8Var.b(context);
        this.f431493h = e8Var.c(null);
        this.f431494i = com.p314xaae8f345.mm.ui.bl.c(context);
        com.p314xaae8f345.mm.ui.bl.h(context);
        this.f431495m = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        this.f431502t = 80;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570314ae2, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f431490e = viewGroup;
        viewGroup.setOnClickListener(new oy2.h(this));
        oy2.g gVar = (oy2.g) this;
        gVar.f431496n = gVar.f431493h;
        int i18 = gVar.f431492g;
        int i19 = (i18 - gVar.f431494i) - gVar.f431495m;
        gVar.f431497o = i19;
        int i27 = (int) (i18 * 0.75d);
        gVar.f431498p = i27;
        gVar.f431499q = i27;
        gVar.f431500r = i19 - i27;
        gVar.f431501s = (int) (i19 * 0.3d);
        gVar.f431502t = 80;
        android.view.View inflate2 = android.view.LayoutInflater.from(gVar.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5x, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout");
        gVar.f431491f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15501xbb059f5) inflate2;
        gVar.c().m63428x14fc72a(gVar.f431501s);
        gVar.c().m63429x5c433911(0);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15501xbb059f5) gVar.c()).m63398x14354464(gVar.f431498p);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, this.f431499q);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.topMargin = this.f431500r;
        layoutParams.bottomMargin = 0;
        android.view.ViewGroup viewGroup2 = this.f431490e;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRootView");
            throw null;
        }
        viewGroup2.addView(c(), layoutParams);
        setCanceledOnTouchOutside(true);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca abstractC15503x81b4b9ca = this.f431491f;
        if (abstractC15503x81b4b9ca != null) {
            return abstractC15503x81b4b9ca;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContentView");
        throw null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (c().isAnimating) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderScrollDialog", "cancel return isAnimating.");
        } else {
            super.cancel();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // oy2.m
    public android.content.Context g() {
        return this.f431489d;
    }

    @Override // oy2.m
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca l() {
        return c();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15501xbb059f5 c15501xbb059f5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15501xbb059f5) ((oy2.g) this).c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca.d(c15501xbb059f5, c15501xbb059f5.peekHeight, false, 0, new oy2.a(c15501xbb059f5), 4, null);
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.ViewGroup viewGroup = this.f431490e;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRootView");
            throw null;
        }
        setContentView(viewGroup);
        android.view.Window window = getWindow();
        if (window != null) {
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = this.f431496n;
            attributes.height = this.f431497o;
            attributes.gravity = this.f431502t;
            window.setAttributes(attributes);
            window.setWindowAnimations(0);
        }
    }
}

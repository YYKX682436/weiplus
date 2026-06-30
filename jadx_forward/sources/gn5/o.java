package gn5;

/* loaded from: classes15.dex */
public final class o extends gn5.b implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f355216d;

    /* renamed from: e, reason: collision with root package name */
    public final int f355217e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f355218f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.WindowManager f355219g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 f355220h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f355221i;

    public o(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f355216d = context;
        this.f355217e = i17;
        this.f355218f = "MicroMsg.PreviewRelativeEmotionPopupHelper";
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f355219g = (android.view.WindowManager) systemService;
    }

    @Override // gn5.b
    public boolean a(android.view.View anchor, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        if (!(obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) || !anchor.isEnabled()) {
            return false;
        }
        this.f355221i = anchor;
        anchor.setPressed(true);
        j(anchor, obj);
        return true;
    }

    @Override // gn5.b
    public void b(android.view.View anchor, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        anchor.setPressed(true);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355221i, anchor)) {
            return;
        }
        android.view.View view = this.f355221i;
        if (view != null) {
            view.setPressed(false);
        }
        this.f355221i = anchor;
        j(anchor, obj);
    }

    @Override // gn5.b
    public void c() {
        android.view.View view = this.f355221i;
        if (view == null) {
            return;
        }
        view.setPressed(false);
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f355218f, "removePopup: " + this.f355220h);
        android.view.View view = this.f355221i;
        if (view != null) {
            view.setPressed(false);
        }
        this.f355221i = null;
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a8190 = this.f355220h;
        if (c22838xaf7a8190 != null) {
            this.f355219g.removeView(c22838xaf7a8190);
        }
        this.f355220h = null;
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        d();
    }

    public final void j(android.view.View view, java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) || !view.isEnabled()) {
            com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a8190 = this.f355220h;
            if (c22838xaf7a8190 == null) {
                return;
            }
            c22838xaf7a8190.setVisibility(8);
            return;
        }
        int i17 = this.f355217e;
        if (i17 == 2 || i17 == 3 || i17 == 4) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6414xc70dde3a c6414xc70dde3a = nr.f.f420578b;
            c6414xc70dde3a.f137567f = c6414xc70dde3a.b("Pid", ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) obj).f68663x861009b5, true);
        }
        nr.f fVar = nr.f.f420577a;
        fVar.b(i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6414xc70dde3a c6414xc70dde3a2 = nr.f.f420578b;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) obj;
        c6414xc70dde3a2.f137568g = c6414xc70dde3a2.b("Md5", c21053xdbf1e5f4.mo42933xb5885648(), true);
        fVar.a(1);
        view.setPressed(true);
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a81902 = this.f355220h;
        android.view.WindowManager windowManager = this.f355219g;
        if (c22838xaf7a81902 == null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a81903 = new com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190(this.f355216d, null);
            this.f355220h = c22838xaf7a81903;
            c22838xaf7a81903.m82877x65fdf0ce(new gn5.m(this));
            com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a81904 = this.f355220h;
            windowManager.addView(c22838xaf7a81904, c22838xaf7a81904 != null ? c22838xaf7a81904.mo82876xd1618356() : null);
            com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a81905 = this.f355220h;
            if (c22838xaf7a81905 != null) {
                c22838xaf7a81905.setVisibility(4);
            }
        } else {
            c22838xaf7a81902.d(view);
            com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a81906 = this.f355220h;
            windowManager.updateViewLayout(c22838xaf7a81906, c22838xaf7a81906 != null ? c22838xaf7a81906.mo82876xd1618356() : null);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a81907 = this.f355220h;
        if (c22838xaf7a81907 != null) {
            c22838xaf7a81907.post(new gn5.n(this, view));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a81908 = this.f355220h;
        if (c22838xaf7a81908 != null) {
            c22838xaf7a81908.m82878xc040f7d2(c21053xdbf1e5f4);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a81909 = this.f355220h;
        if (c22838xaf7a81909 != null) {
            c22838xaf7a81909.m82879x37076fc4(i17);
        }
    }
}

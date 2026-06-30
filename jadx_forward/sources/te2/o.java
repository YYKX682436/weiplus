package te2;

/* loaded from: classes3.dex */
public final class o implements te2.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f499794d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f499795e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f499796f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f499797g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f499798h;

    public o(android.view.View root, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, te2.a aVar, yz5.l setRootVisibleFunction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setRootVisibleFunction, "setRootVisibleFunction");
        this.f499794d = root;
        this.f499795e = activity;
        this.f499796f = setRootVisibleFunction;
        root.setOnClickListener(new te2.m(this));
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) root.findViewById(com.p314xaae8f345.mm.R.id.f564477sh);
        if (this.f499797g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAllowanceGiftBubbleViewCallback", "#initSmallAnim create smallAnim!");
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            android.content.Context context = root.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context);
            this.f499797g = c22789xd23e9a9b;
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.f544861x0));
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(mo0.h.a(activity, 72.0f), mo0.h.a(activity, 172.0f));
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f499797g;
            if (c22789xd23e9a9b2 != null) {
                c22789xd23e9a9b2.setLayoutParams(layoutParams);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = this.f499797g;
            if (c22789xd23e9a9b3 != null) {
                c22789xd23e9a9b3.m82584xebcf33cb(1);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.f499797g);
            }
        }
        setRootVisibleFunction.mo146xb9724478(8);
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAllowanceGiftBubbleViewCallback", "#hideBubbleView");
        this.f499796f.mo146xb9724478(8);
    }

    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAllowanceGiftBubbleViewCallback", "#showBubbleView");
        if (this.f499794d.isShown()) {
            return;
        }
        if (zl2.r4.f555483a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.R;
            ml2.e2[] e2VarArr = ml2.e2.f408907d;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(1), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ((ml2.r0) c18).Yj(ml2.f2.f408956e, "");
        }
        this.f499796f.mo146xb9724478(0);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f499797g;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.n();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f499797g;
        if (c22789xd23e9a9b2 != null) {
            android.content.res.AssetManager assets = this.f499795e.getAssets();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
            c22789xd23e9a9b2.k(assets, "finder_live_allowance_gift_bubble_icon.pag");
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = this.f499797g;
        if (c22789xd23e9a9b3 != null) {
            c22789xd23e9a9b3.m82583xcde73672(1);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = this.f499797g;
        if (c22789xd23e9a9b4 != null) {
            c22789xd23e9a9b4.m82582x3ae760af(0.0d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b5 = this.f499797g;
        if (c22789xd23e9a9b5 != null) {
            c22789xd23e9a9b5.g();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b6 = this.f499797g;
        if (c22789xd23e9a9b6 != null) {
            c22789xd23e9a9b6.d();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b7 = this.f499797g;
        if (c22789xd23e9a9b7 != null) {
            c22789xd23e9a9b7.a(new te2.n(this));
        }
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f499795e;
    }
}

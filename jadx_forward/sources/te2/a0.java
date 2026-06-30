package te2;

/* loaded from: classes2.dex */
public final class a0 implements te2.v {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f499377d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f499378e;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f499379f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f499380g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f499381h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f499382i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f499383m;

    public a0(android.view.View root, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, te2.u uVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f499377d = root;
        this.f499378e = activity;
        this.f499379f = p3325xe03a0797.p3326xc267989b.z0.b();
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) root.findViewById(com.p314xaae8f345.mm.R.id.e__);
        this.f499381h = frameLayout;
        this.f499383m = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.f566960hn2);
        if (this.f499382i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAllowanceGiftPagViewCallback", "#initSmallAnim create smallAnim!");
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            android.content.Context context = root.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context);
            this.f499382i = c22789xd23e9a9b;
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.f544851p0));
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f499382i;
            if (c22789xd23e9a9b2 != null) {
                c22789xd23e9a9b2.m82584xebcf33cb(1);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.f499382i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.lang.String r10, te2.a0 r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.a0.a(java.lang.String, te2.a0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f499378e;
    }
}

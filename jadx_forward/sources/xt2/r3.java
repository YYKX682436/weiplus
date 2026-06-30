package xt2;

/* loaded from: classes2.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f538511a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f538512b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f538513c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f538514d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f538515e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f538516f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f538517g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f538518h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f538519i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f538520j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f538521k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f538522l;

    public r3(android.view.ViewGroup root, android.view.View cartGroup) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cartGroup, "cartGroup");
        this.f538511a = root;
        this.f538512b = cartGroup;
        this.f538513c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f538515e = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f538517g = "";
        this.f538518h = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.l6l);
        this.f538519i = cartGroup.findViewById(com.p314xaae8f345.mm.R.id.fld);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) cartGroup.findViewById(com.p314xaae8f345.mm.R.id.rn_);
        c22789xd23e9a9b2.a(new xt2.f3(c22789xd23e9a9b2, this));
        this.f538520j = c22789xd23e9a9b2;
        this.f538521k = "finder_live_add_cart.pag";
        android.view.ViewParent parent = root.getParent();
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null && (c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.toq)) != null) {
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            c22789xd23e9a9b.a(new xt2.g3(c22789xd23e9a9b, this));
            c22789xd23e9a9b3 = c22789xd23e9a9b;
        }
        this.f538522l = c22789xd23e9a9b3;
    }
}

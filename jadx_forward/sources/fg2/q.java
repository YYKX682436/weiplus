package fg2;

/* loaded from: classes3.dex */
public final class q implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f343780a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f343781b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f343782c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f343783d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f343784e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f343785f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f343786g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f343787h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f343788i;

    public q(android.widget.LinearLayout linearLayout, android.widget.TextView textView, android.widget.LinearLayout linearLayout2, android.widget.TextView textView2, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, android.view.View view, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172, android.widget.FrameLayout frameLayout, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5) {
        this.f343780a = linearLayout;
        this.f343781b = textView;
        this.f343782c = textView2;
        this.f343783d = c22621x7603e017;
        this.f343784e = view;
        this.f343785f = c22621x7603e0172;
        this.f343786g = textView3;
        this.f343787h = textView4;
        this.f343788i = textView5;
    }

    public static fg2.q a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570414aq1, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.p314xaae8f345.mm.R.id.f567096i46;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f567096i46);
        if (textView != null) {
            i17 = com.p314xaae8f345.mm.R.id.i47;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.i47);
            if (linearLayout != null) {
                i17 = com.p314xaae8f345.mm.R.id.u_s;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.u_s);
                if (textView2 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.i48;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.i48);
                    if (c22621x7603e017 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.u_t;
                        android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.u_t);
                        if (a17 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.u_u;
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.u_u);
                            if (c22621x7603e0172 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.i49;
                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.i49);
                                if (frameLayout != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.i4_;
                                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.i4_);
                                    if (textView3 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.u_v;
                                        android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.u_v);
                                        if (textView4 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.i4c;
                                            android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.i4c);
                                            if (textView5 != null) {
                                                return new fg2.q((android.widget.LinearLayout) inflate, textView, linearLayout, textView2, c22621x7603e017, a17, c22621x7603e0172, frameLayout, textView3, textView4, textView5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f343780a;
    }
}

package a63;

/* loaded from: classes8.dex */
public final class b implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f83271a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f83272b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f83273c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f83274d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f83275e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f83276f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f83277g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f83278h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f83279i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f83280j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.ImageView f83281k;

    public b(android.widget.LinearLayout linearLayout, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2, android.view.View view, android.view.View view2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.ImageView imageView2, android.widget.TextView textView6) {
        this.f83271a = linearLayout;
        this.f83272b = imageView;
        this.f83273c = textView;
        this.f83274d = textView2;
        this.f83275e = view;
        this.f83276f = view2;
        this.f83277g = c22699x3dcdb352;
        this.f83278h = textView3;
        this.f83279i = textView4;
        this.f83280j = textView5;
        this.f83281k = imageView2;
    }

    public static a63.b a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bi7, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.p314xaae8f345.mm.R.id.a9o;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.a9o);
        if (imageView != null) {
            i17 = com.p314xaae8f345.mm.R.id.civ;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.civ);
            if (textView != null) {
                i17 = com.p314xaae8f345.mm.R.id.cua;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.cua);
                if (textView2 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.d1d;
                    android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.d1d);
                    if (a17 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.d1e;
                        android.view.View a18 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.d1e);
                        if (a18 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.f568209m35;
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f568209m35);
                            if (c22699x3dcdb352 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.o7m;
                                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o7m);
                                if (textView3 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.o_4;
                                    android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o_4);
                                    if (textView4 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.o_5;
                                        android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o_5);
                                        if (textView5 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.osq;
                                            android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.osq);
                                            if (imageView2 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.osr;
                                                android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.osr);
                                                if (textView6 != null) {
                                                    return new a63.b((android.widget.LinearLayout) inflate, imageView, textView, textView2, a17, a18, c22699x3dcdb352, textView3, textView4, textView5, imageView2, textView6);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f83271a;
    }
}

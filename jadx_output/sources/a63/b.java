package a63;

/* loaded from: classes8.dex */
public final class b implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f1738a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f1739b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f1740c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f1741d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f1742e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f1743f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f1744g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f1745h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f1746i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f1747j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.ImageView f1748k;

    public b(android.widget.LinearLayout linearLayout, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2, android.view.View view, android.view.View view2, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.ImageView imageView2, android.widget.TextView textView6) {
        this.f1738a = linearLayout;
        this.f1739b = imageView;
        this.f1740c = textView;
        this.f1741d = textView2;
        this.f1742e = view;
        this.f1743f = view2;
        this.f1744g = weImageView;
        this.f1745h = textView3;
        this.f1746i = textView4;
        this.f1747j = textView5;
        this.f1748k = imageView2;
    }

    public static a63.b a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.bi7, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.a9o;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.a9o);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.civ;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.civ);
            if (textView != null) {
                i17 = com.tencent.mm.R.id.cua;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.cua);
                if (textView2 != null) {
                    i17 = com.tencent.mm.R.id.d1d;
                    android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.d1d);
                    if (a17 != null) {
                        i17 = com.tencent.mm.R.id.d1e;
                        android.view.View a18 = x4.b.a(inflate, com.tencent.mm.R.id.d1e);
                        if (a18 != null) {
                            i17 = com.tencent.mm.R.id.f486676m35;
                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.f486676m35);
                            if (weImageView != null) {
                                i17 = com.tencent.mm.R.id.o7m;
                                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o7m);
                                if (textView3 != null) {
                                    i17 = com.tencent.mm.R.id.o_4;
                                    android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o_4);
                                    if (textView4 != null) {
                                        i17 = com.tencent.mm.R.id.o_5;
                                        android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o_5);
                                        if (textView5 != null) {
                                            i17 = com.tencent.mm.R.id.osq;
                                            android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.osq);
                                            if (imageView2 != null) {
                                                i17 = com.tencent.mm.R.id.osr;
                                                android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.osr);
                                                if (textView6 != null) {
                                                    return new a63.b((android.widget.LinearLayout) inflate, imageView, textView, textView2, a17, a18, weImageView, textView3, textView4, textView5, imageView2, textView6);
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
        return this.f1738a;
    }
}

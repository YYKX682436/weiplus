package x33;

/* loaded from: classes15.dex */
public final class a implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f533142a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce f533143b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21489xc8bb7d0 f533144c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f533145d;

    public a(android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce c21487xa86ce1ce, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21489xc8bb7d0 c21489xc8bb7d0, android.widget.ImageView imageView) {
        this.f533142a = linearLayout;
        this.f533143b = c21487xa86ce1ce;
        this.f533144c = c21489xc8bb7d0;
        this.f533145d = imageView;
    }

    public static x33.a a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569923s0, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.p314xaae8f345.mm.R.id.bh7;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.bh7);
        if (linearLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.bh8;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce c21487xa86ce1ce = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.bh8);
            if (c21487xa86ce1ce != null) {
                i17 = com.p314xaae8f345.mm.R.id.bh9;
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21489xc8bb7d0 c21489xc8bb7d0 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21489xc8bb7d0) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.bh9);
                if (c21489xc8bb7d0 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.p1b;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.p1b);
                    if (imageView != null) {
                        return new x33.a((android.widget.LinearLayout) inflate, linearLayout, c21487xa86ce1ce, c21489xc8bb7d0, imageView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f533142a;
    }
}

package bm3;

/* loaded from: classes3.dex */
public final class e implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f104044a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f104045b;

    public e(android.widget.FrameLayout frameLayout, android.widget.LinearLayout linearLayout, android.widget.TextView textView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25, android.widget.FrameLayout frameLayout2, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00) {
        this.f104044a = frameLayout;
        this.f104045b = c22849x81a93d25;
    }

    public static bm3.e a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c5a, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.p314xaae8f345.mm.R.id.dfv;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.dfv);
        if (linearLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.iml;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.iml);
            if (textView != null) {
                i17 = com.p314xaae8f345.mm.R.id.jxv;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jxv);
                if (c22849x81a93d25 != null) {
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
                    i17 = com.p314xaae8f345.mm.R.id.nvg;
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.nvg);
                    if (c22801x87cbdc00 != null) {
                        return new bm3.e(frameLayout, linearLayout, textView, c22849x81a93d25, frameLayout, c22801x87cbdc00);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f104044a;
    }
}

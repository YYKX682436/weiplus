package fg2;

/* loaded from: classes5.dex */
public final class v0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f343915a;

    public v0(android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, android.widget.FrameLayout frameLayout) {
        this.f343915a = linearLayout;
    }

    public static fg2.v0 a(android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        int i17 = com.p314xaae8f345.mm.R.id.evh;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) x4.b.a(view, com.p314xaae8f345.mm.R.id.evh);
        if (c22789xd23e9a9b != null) {
            i17 = com.p314xaae8f345.mm.R.id.qrq;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.qrq);
            if (frameLayout != null) {
                return new fg2.v0(linearLayout, linearLayout, c22789xd23e9a9b, frameLayout);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f343915a;
    }
}

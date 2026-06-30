package fg2;

/* loaded from: classes10.dex */
public final class v implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f343914a;

    public v(android.widget.RelativeLayout relativeLayout, android.widget.FrameLayout frameLayout, android.widget.TextView textView, android.widget.FrameLayout frameLayout2, android.widget.RelativeLayout relativeLayout2) {
        this.f343914a = relativeLayout;
    }

    public static fg2.v a(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.R.id.f564579v5;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.f564579v5);
        if (frameLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.cjn;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.cjn);
            if (textView != null) {
                i17 = com.p314xaae8f345.mm.R.id.f566243f84;
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.f566243f84);
                if (frameLayout2 != null) {
                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
                    return new fg2.v(relativeLayout, frameLayout, textView, frameLayout2, relativeLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f343914a;
    }
}

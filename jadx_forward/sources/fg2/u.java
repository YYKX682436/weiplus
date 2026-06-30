package fg2;

/* loaded from: classes10.dex */
public final class u implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f343875a;

    public u(android.widget.RelativeLayout relativeLayout, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.FrameLayout frameLayout2, android.widget.RelativeLayout relativeLayout2, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d) {
        this.f343875a = relativeLayout;
    }

    public static fg2.u a(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.R.id.f564579v5;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.f564579v5);
        if (frameLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.agx;
            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.p314xaae8f345.mm.R.id.agx);
            if (imageView != null) {
                i17 = com.p314xaae8f345.mm.R.id.cjn;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.cjn);
                if (textView != null) {
                    i17 = com.p314xaae8f345.mm.R.id.f566243f84;
                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.f566243f84);
                    if (frameLayout2 != null) {
                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
                        i17 = com.p314xaae8f345.mm.R.id.f567975l75;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) x4.b.a(view, com.p314xaae8f345.mm.R.id.f567975l75);
                        if (c22628xfde5d61d != null) {
                            return new fg2.u(relativeLayout, frameLayout, imageView, textView, frameLayout2, relativeLayout, c22628xfde5d61d);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f343875a;
    }
}

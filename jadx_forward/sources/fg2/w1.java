package fg2;

/* loaded from: classes10.dex */
public final class w1 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f343922a;

    public w1(android.widget.RelativeLayout relativeLayout, android.widget.TextView textView, android.widget.FrameLayout frameLayout, android.widget.RelativeLayout relativeLayout2, android.widget.ImageView imageView) {
        this.f343922a = relativeLayout;
    }

    public static fg2.w1 a(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.R.id.cjn;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.cjn);
        if (textView != null) {
            i17 = com.p314xaae8f345.mm.R.id.fqf;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.fqf);
            if (frameLayout != null) {
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
                i17 = com.p314xaae8f345.mm.R.id.p8g;
                android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.p314xaae8f345.mm.R.id.p8g);
                if (imageView != null) {
                    return new fg2.w1(relativeLayout, textView, frameLayout, relativeLayout, imageView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f343922a;
    }
}

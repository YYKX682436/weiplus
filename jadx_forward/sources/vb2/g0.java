package vb2;

/* loaded from: classes2.dex */
public final class g0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f516143a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f516144b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f516145c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f516146d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f516147e;

    public g0(android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f516143a = frameLayout;
        this.f516144b = frameLayout2;
        this.f516145c = c22699x3dcdb352;
        this.f516146d = textView;
        this.f516147e = textView2;
    }

    public static vb2.g0 a(android.view.View view) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        int i17 = com.p314xaae8f345.mm.R.id.fzh;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(view, com.p314xaae8f345.mm.R.id.fzh);
        if (c22699x3dcdb352 != null) {
            i17 = com.p314xaae8f345.mm.R.id.fzi;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.fzi);
            if (textView != null) {
                i17 = com.p314xaae8f345.mm.R.id.q5x;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.q5x);
                if (textView2 != null) {
                    return new vb2.g0(frameLayout, frameLayout, c22699x3dcdb352, textView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f516143a;
    }
}

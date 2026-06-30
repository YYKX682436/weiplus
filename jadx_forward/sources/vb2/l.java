package vb2;

/* loaded from: classes2.dex */
public final class l implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f516178a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f516179b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f516180c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f516181d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f516182e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f516183f;

    public l(android.widget.LinearLayout linearLayout, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.LinearLayout linearLayout2, android.widget.TextView textView, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.widget.TextView textView2) {
        this.f516178a = linearLayout;
        this.f516179b = imageView;
        this.f516180c = imageView2;
        this.f516181d = textView;
        this.f516182e = c22699x3dcdb352;
        this.f516183f = textView2;
    }

    public static vb2.l a(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.R.id.a9m;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.p314xaae8f345.mm.R.id.a9m);
        if (imageView != null) {
            i17 = com.p314xaae8f345.mm.R.id.cki;
            android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(view, com.p314xaae8f345.mm.R.id.cki);
            if (imageView2 != null) {
                i17 = com.p314xaae8f345.mm.R.id.eig;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.eig);
                if (linearLayout != null) {
                    i17 = com.p314xaae8f345.mm.R.id.i1g;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.i1g);
                    if (textView != null) {
                        i17 = com.p314xaae8f345.mm.R.id.i1n;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(view, com.p314xaae8f345.mm.R.id.i1n);
                        if (c22699x3dcdb352 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.kb7;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.kb7);
                            if (textView2 != null) {
                                return new vb2.l((android.widget.LinearLayout) view, imageView, imageView2, linearLayout, textView, c22699x3dcdb352, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f516178a;
    }
}

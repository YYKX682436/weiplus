package vb2;

/* loaded from: classes2.dex */
public final class q implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f516237a;

    /* renamed from: b, reason: collision with root package name */
    public final vb2.l f516238b;

    /* renamed from: c, reason: collision with root package name */
    public final vb2.l f516239c;

    /* renamed from: d, reason: collision with root package name */
    public final vb2.l f516240d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f516241e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f516242f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f516243g;

    public q(android.widget.LinearLayout linearLayout, vb2.l lVar, vb2.l lVar2, vb2.l lVar3, android.widget.TextView textView, android.widget.LinearLayout linearLayout2, android.widget.TextView textView2) {
        this.f516237a = linearLayout;
        this.f516238b = lVar;
        this.f516239c = lVar2;
        this.f516240d = lVar3;
        this.f516241e = textView;
        this.f516242f = linearLayout2;
        this.f516243g = textView2;
    }

    public static vb2.q a(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.R.id.b6z;
        android.view.View a17 = x4.b.a(view, com.p314xaae8f345.mm.R.id.b6z);
        if (a17 != null) {
            vb2.l a18 = vb2.l.a(a17);
            i17 = com.p314xaae8f345.mm.R.id.f565082b70;
            android.view.View a19 = x4.b.a(view, com.p314xaae8f345.mm.R.id.f565082b70);
            if (a19 != null) {
                vb2.l a27 = vb2.l.a(a19);
                i17 = com.p314xaae8f345.mm.R.id.f565083b71;
                android.view.View a28 = x4.b.a(view, com.p314xaae8f345.mm.R.id.f565083b71);
                if (a28 != null) {
                    vb2.l a29 = vb2.l.a(a28);
                    i17 = com.p314xaae8f345.mm.R.id.i2p;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.i2p);
                    if (textView != null) {
                        i17 = com.p314xaae8f345.mm.R.id.i2q;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.i2q);
                        if (linearLayout != null) {
                            i17 = com.p314xaae8f345.mm.R.id.obc;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.obc);
                            if (textView2 != null) {
                                return new vb2.q((android.widget.LinearLayout) view, a18, a27, a29, textView, linearLayout, textView2);
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
        return this.f516237a;
    }
}

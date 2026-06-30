package fg2;

/* loaded from: classes10.dex */
public final class h1 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 f343596a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f343597b;

    public h1(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x240691592, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.widget.LinearLayout linearLayout, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f343596a = c22645x24069159;
        this.f343597b = textView2;
    }

    public static fg2.h1 a(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) view;
        int i17 = com.p314xaae8f345.mm.R.id.in7;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(view, com.p314xaae8f345.mm.R.id.in7);
        if (c22699x3dcdb352 != null) {
            i17 = com.p314xaae8f345.mm.R.id.rvx;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.rvx);
            if (linearLayout != null) {
                i17 = com.p314xaae8f345.mm.R.id.rvy;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.rvy);
                if (textView != null) {
                    i17 = com.p314xaae8f345.mm.R.id.qx9;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.qx9);
                    if (textView2 != null) {
                        return new fg2.h1(c22645x24069159, c22645x24069159, c22699x3dcdb352, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f343596a;
    }
}

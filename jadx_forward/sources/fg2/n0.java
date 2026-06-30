package fg2;

/* loaded from: classes3.dex */
public final class n0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f343693a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f343694b;

    public n0(p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.view.View view, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f343693a = c1073x7e08a787;
        this.f343694b = view;
    }

    public static fg2.n0 a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eao, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.p314xaae8f345.mm.R.id.h5x;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.h5x);
        if (c22699x3dcdb352 != null) {
            i17 = com.p314xaae8f345.mm.R.id.f566821h62;
            android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566821h62);
            if (a17 != null) {
                i17 = com.p314xaae8f345.mm.R.id.o3b;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o3b);
                if (textView != null) {
                    i17 = com.p314xaae8f345.mm.R.id.ve6;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.ve6);
                    if (textView2 != null) {
                        return new fg2.n0((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate, c22699x3dcdb352, a17, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f343693a;
    }
}

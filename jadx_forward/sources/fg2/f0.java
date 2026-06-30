package fg2;

/* loaded from: classes10.dex */
public final class f0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f343558a;

    /* renamed from: b, reason: collision with root package name */
    public final fg2.h1 f343559b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f343560c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f343561d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f343562e;

    public f0(p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787, fg2.h1 h1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.view.View view, android.widget.TextView textView) {
        this.f343558a = c1073x7e08a787;
        this.f343559b = h1Var;
        this.f343560c = c22699x3dcdb352;
        this.f343561d = view;
        this.f343562e = textView;
    }

    public static fg2.f0 a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dkn, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.p314xaae8f345.mm.R.id.qrl;
        android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.qrl);
        if (a17 != null) {
            fg2.h1 a18 = fg2.h1.a(a17);
            i17 = com.p314xaae8f345.mm.R.id.h5x;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.h5x);
            if (c22699x3dcdb352 != null) {
                i17 = com.p314xaae8f345.mm.R.id.f566821h62;
                android.view.View a19 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566821h62);
                if (a19 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.o3b;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o3b);
                    if (textView != null) {
                        return new fg2.f0((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate, a18, c22699x3dcdb352, a19, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f343558a;
    }
}

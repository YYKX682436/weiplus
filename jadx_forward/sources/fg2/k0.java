package fg2;

/* loaded from: classes10.dex */
public final class k0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f343644a;

    /* renamed from: b, reason: collision with root package name */
    public final fg2.s0 f343645b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f343646c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f343647d;

    public k0(p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787, fg2.s0 s0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.widget.TextView textView) {
        this.f343644a = c1073x7e08a787;
        this.f343645b = s0Var;
        this.f343646c = c22699x3dcdb352;
        this.f343647d = textView;
    }

    public static fg2.k0 a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aup, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.p314xaae8f345.mm.R.id.qrl;
        android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.qrl);
        if (a17 != null) {
            fg2.s0 a18 = fg2.s0.a(a17);
            int i18 = com.p314xaae8f345.mm.R.id.h5x;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.h5x);
            if (c22699x3dcdb352 != null) {
                i18 = com.p314xaae8f345.mm.R.id.o3b;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o3b);
                if (textView != null) {
                    return new fg2.k0((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate, a18, c22699x3dcdb352, textView);
                }
            }
            i17 = i18;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f343644a;
    }
}

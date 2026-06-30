package x92;

/* loaded from: classes2.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad f534251d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad abstractC13643xe024ad) {
        super(0);
        this.f534251d = abstractC13643xe024ad;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View mo144222x4ff8c0f0 = this.f534251d.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.oh9);
        int i17 = com.p314xaae8f345.mm.R.id.dft;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.dft);
        if (textView != null) {
            i17 = com.p314xaae8f345.mm.R.id.f565762dg3;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.f565762dg3);
            if (frameLayout != null) {
                i17 = com.p314xaae8f345.mm.R.id.l9m;
                p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a = (p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.l9m);
                if (c1081xa22a3e5a != null) {
                    i17 = com.p314xaae8f345.mm.R.id.lbi;
                    android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.lbi);
                    if (progressBar != null) {
                        i17 = com.p314xaae8f345.mm.R.id.m2g;
                        android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.m2g);
                        if (textView2 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.m6e;
                            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.m6e);
                            if (c22801x87cbdc00 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.oah;
                                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.oah);
                                if (frameLayout2 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.oh8;
                                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.oh8);
                                    if (c1163xf1deaba4 != null) {
                                        android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) mo144222x4ff8c0f0;
                                        return new vb2.c(frameLayout3, textView, frameLayout, c1081xa22a3e5a, progressBar, textView2, c22801x87cbdc00, frameLayout2, c1163xf1deaba4, frameLayout3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(mo144222x4ff8c0f0.getResources().getResourceName(i17)));
    }
}

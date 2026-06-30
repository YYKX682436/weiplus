package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class ka extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17419x2156b524 f242766d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17419x2156b524 activityC17419x2156b524) {
        super(0);
        this.f242766d = activityC17419x2156b524;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f242766d.findViewById(com.p314xaae8f345.mm.R.id.mpc);
        int i17 = com.p314xaae8f345.mm.R.id.moq;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.moq);
        if (c22628xfde5d61d != null) {
            i17 = com.p314xaae8f345.mm.R.id.mor;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.mor);
            if (linearLayout != null) {
                i17 = com.p314xaae8f345.mm.R.id.mos;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.mos);
                if (c22624x85d69039 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.mot;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.mot);
                    if (textView != null) {
                        i17 = com.p314xaae8f345.mm.R.id.mou;
                        android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.mou);
                        if (button != null) {
                            i17 = com.p314xaae8f345.mm.R.id.mov;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.mov);
                            if (textView2 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.f568397mp0;
                                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f568397mp0);
                                if (c1163xf1deaba4 != null) {
                                    android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById;
                                    return new g14.b(scrollView, c22628xfde5d61d, linearLayout, c22624x85d69039, textView, button, textView2, c1163xf1deaba4, scrollView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}

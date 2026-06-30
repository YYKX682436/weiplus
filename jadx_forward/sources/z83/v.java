package z83;

/* loaded from: classes5.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321 f552289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321 activityC16161xd3ca9321) {
        super(0);
        this.f552289d = activityC16161xd3ca9321;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f552289d.findViewById(com.p314xaae8f345.mm.R.id.hrd);
        int i17 = com.p314xaae8f345.mm.R.id.atb;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.atb);
        if (linearLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.auy;
            android.view.View a17 = x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.auy);
            if (a17 != null) {
                i17 = com.p314xaae8f345.mm.R.id.g66;
                android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.g66);
                if (button != null) {
                    i17 = com.p314xaae8f345.mm.R.id.gxl;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb c16155xa1f2bfdb = (com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.gxl);
                    if (c16155xa1f2bfdb != null) {
                        i17 = com.p314xaae8f345.mm.R.id.had;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.had);
                        if (linearLayout2 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.hdb;
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.hdb);
                            if (c22607x763d2049 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.hdc;
                                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.hdc);
                                if (c21486x59d05a04 != null) {
                                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
                                    i17 = com.p314xaae8f345.mm.R.id.j8d;
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.j8d);
                                    if (linearLayout3 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.jmq;
                                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.jmq);
                                        if (textView != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.f568179m01;
                                            android.widget.Button button2 = (android.widget.Button) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f568179m01);
                                            if (button2 != null) {
                                                return new w83.i(relativeLayout, linearLayout, a17, button, c16155xa1f2bfdb, linearLayout2, c22607x763d2049, c21486x59d05a04, relativeLayout, linearLayout3, textView, button2);
                                            }
                                        }
                                    }
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

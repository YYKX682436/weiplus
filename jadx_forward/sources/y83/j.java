package y83;

/* loaded from: classes14.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16156xf944aa02 f541523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16156xf944aa02 activityC16156xf944aa02) {
        super(0);
        this.f541523d = activityC16156xf944aa02;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f541523d.findViewById(com.p314xaae8f345.mm.R.id.hr7);
        int i17 = com.p314xaae8f345.mm.R.id.atb;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.atb);
        if (linearLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.atc;
            android.view.View a17 = x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.atc);
            if (a17 != null) {
                i17 = com.p314xaae8f345.mm.R.id.f565089b75;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f565089b75);
                if (linearLayout2 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.gxl;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb c16155xa1f2bfdb = (com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.gxl);
                    if (c16155xa1f2bfdb != null) {
                        i17 = com.p314xaae8f345.mm.R.id.hdb;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.hdb);
                        if (c22607x763d2049 != null) {
                            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
                            i17 = com.p314xaae8f345.mm.R.id.f568287mc5;
                            android.widget.ScrollView scrollView = (android.widget.ScrollView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f568287mc5);
                            if (scrollView != null) {
                                i17 = com.p314xaae8f345.mm.R.id.nsx;
                                android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.nsx);
                                if (textView != null) {
                                    return new w83.c(relativeLayout, linearLayout, a17, linearLayout2, c16155xa1f2bfdb, c22607x763d2049, relativeLayout, scrollView, textView);
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

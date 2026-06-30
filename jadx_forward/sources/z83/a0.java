package z83;

/* loaded from: classes5.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16162x32920c96 f552263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16162x32920c96 activityC16162x32920c96) {
        super(0);
        this.f552263d = activityC16162x32920c96;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f552263d.findViewById(com.p314xaae8f345.mm.R.id.hre);
        int i17 = com.p314xaae8f345.mm.R.id.atb;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.atb);
        if (linearLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.f565089b75;
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f565089b75);
            if (linearLayout2 != null) {
                i17 = com.p314xaae8f345.mm.R.id.bei;
                android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.bei);
                if (button != null) {
                    i17 = com.p314xaae8f345.mm.R.id.gxl;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb c16155xa1f2bfdb = (com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.gxl);
                    if (c16155xa1f2bfdb != null) {
                        i17 = com.p314xaae8f345.mm.R.id.hdb;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.hdb);
                        if (c22607x763d2049 != null) {
                            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
                            i17 = com.p314xaae8f345.mm.R.id.f567008ht2;
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d c22643xbdaadc7d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f567008ht2);
                            if (c22643xbdaadc7d != null) {
                                i17 = com.p314xaae8f345.mm.R.id.f567009ht3;
                                android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f567009ht3);
                                if (textView != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.lku;
                                    android.widget.Button button2 = (android.widget.Button) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.lku);
                                    if (button2 != null) {
                                        return new w83.j(relativeLayout, linearLayout, linearLayout2, button, c16155xa1f2bfdb, c22607x763d2049, relativeLayout, c22643xbdaadc7d, textView, button2);
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

package z83;

/* loaded from: classes5.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16163x5c385b05 f552269d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16163x5c385b05 activityC16163x5c385b05) {
        super(0);
        this.f552269d = activityC16163x5c385b05;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f552269d.findViewById(com.p314xaae8f345.mm.R.id.hrf);
        int i17 = com.p314xaae8f345.mm.R.id.atb;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.atb);
        if (linearLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.cu_;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.cu_);
            if (textView != null) {
                i17 = com.p314xaae8f345.mm.R.id.gsf;
                android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.gsf);
                if (button != null) {
                    i17 = com.p314xaae8f345.mm.R.id.gxl;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb c16155xa1f2bfdb = (com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.gxl);
                    if (c16155xa1f2bfdb != null) {
                        i17 = com.p314xaae8f345.mm.R.id.hdb;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.hdb);
                        if (c22607x763d2049 != null) {
                            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
                            i17 = com.p314xaae8f345.mm.R.id.j8d;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.j8d);
                            if (linearLayout2 != null) {
                                return new w83.k(relativeLayout, linearLayout, textView, button, c16155xa1f2bfdb, c22607x763d2049, relativeLayout, linearLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}

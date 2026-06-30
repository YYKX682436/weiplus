package av1;

/* loaded from: classes3.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a f95728d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a activityC13090x679cb21a) {
        super(0);
        this.f95728d = activityC13090x679cb21a;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f95728d.findViewById(com.p314xaae8f345.mm.R.id.bd_);
        int i17 = com.p314xaae8f345.mm.R.id.bd9;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.bd9);
        if (c22699x3dcdb352 != null) {
            android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById;
            i17 = com.p314xaae8f345.mm.R.id.cwk;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.cwk);
            if (textView != null) {
                i17 = com.p314xaae8f345.mm.R.id.f567824kt3;
                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f567824kt3);
                if (progressBar != null) {
                    i17 = com.p314xaae8f345.mm.R.id.f567825kt4;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f567825kt4);
                    if (c22699x3dcdb3522 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.f567832ku5;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f567832ku5);
                        if (c22699x3dcdb3523 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.f568276mb5;
                            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f568276mb5);
                            if (relativeLayout != null) {
                                i17 = com.p314xaae8f345.mm.R.id.mb6;
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.mb6);
                                if (c22699x3dcdb3524 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.ngy;
                                    android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.ngy);
                                    if (button != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.ngz;
                                        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.ngz);
                                        if (relativeLayout2 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.f568632ni1;
                                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f568632ni1);
                                            if (textView2 != null) {
                                                return new qu1.a(scrollView, c22699x3dcdb352, scrollView, textView, progressBar, c22699x3dcdb3522, c22699x3dcdb3523, relativeLayout, c22699x3dcdb3524, button, relativeLayout2, textView2);
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

package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class a8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f f242339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f) {
        super(0);
        this.f242339d = activityC17414x34d8ac5f;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f242339d.findViewById(com.p314xaae8f345.mm.R.id.m7j);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        int i17 = com.p314xaae8f345.mm.R.id.mow;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.mow);
        if (linearLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.mox;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.mox);
            if (textView != null) {
                i17 = com.p314xaae8f345.mm.R.id.mp8;
                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.mp8);
                if (progressBar != null) {
                    i17 = com.p314xaae8f345.mm.R.id.mp9;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.mp9);
                    if (c12808x5de4409f != null) {
                        i17 = com.p314xaae8f345.mm.R.id.mp_;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.mp_);
                        if (c22699x3dcdb352 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.mpa;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.mpa);
                            if (textView2 != null) {
                                return new g14.a(relativeLayout, relativeLayout, linearLayout, textView, progressBar, c12808x5de4409f, c22699x3dcdb352, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}

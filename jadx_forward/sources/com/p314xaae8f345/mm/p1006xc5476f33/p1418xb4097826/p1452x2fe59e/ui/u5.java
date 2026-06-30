package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class u5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13974xf3622848 f192128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13974xf3622848 activityC13974xf3622848) {
        super(0);
        this.f192128d = activityC13974xf3622848;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f192128d.findViewById(com.p314xaae8f345.mm.R.id.cgk);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        int i17 = com.p314xaae8f345.mm.R.id.g4h;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.g4h);
        if (linearLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.im7;
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.im7);
            if (linearLayout2 != null) {
                i17 = com.p314xaae8f345.mm.R.id.kcj;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.kcj);
                if (textView != null) {
                    i17 = com.p314xaae8f345.mm.R.id.lqa;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.lqa);
                    if (c1163xf1deaba4 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.m6e;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.m6e);
                        if (c15343x638a173f != null) {
                            i17 = com.p314xaae8f345.mm.R.id.oh8;
                            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.oh8);
                            if (c22849x81a93d25 != null) {
                                return new vb2.p(relativeLayout, relativeLayout, linearLayout, linearLayout2, textView, c1163xf1deaba4, c15343x638a173f, c22849x81a93d25);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}

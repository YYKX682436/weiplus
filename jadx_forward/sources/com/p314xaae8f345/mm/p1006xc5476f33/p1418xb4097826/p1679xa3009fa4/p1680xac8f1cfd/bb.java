package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes15.dex */
public final class bb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15449xa84711 f215396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15449xa84711 c15449xa84711) {
        super(0);
        this.f215396d = c15449xa84711;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View mo144222x4ff8c0f0 = this.f215396d.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.j8p);
        int i17 = com.p314xaae8f345.mm.R.id.dbv;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.dbv);
        if (frameLayout != null) {
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) mo144222x4ff8c0f0;
            i17 = com.p314xaae8f345.mm.R.id.f567991la3;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.f567991la3);
            if (c22849x81a93d25 != null) {
                i17 = com.p314xaae8f345.mm.R.id.m6g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.m6g);
                if (c15343x638a173f != null) {
                    i17 = com.p314xaae8f345.mm.R.id.oai;
                    android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.oai);
                    if (progressBar != null) {
                        i17 = com.p314xaae8f345.mm.R.id.oao;
                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.oao);
                        if (textView != null) {
                            i17 = com.p314xaae8f345.mm.R.id.oav;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.oav);
                            if (textView2 != null) {
                                return new vb2.k(frameLayout2, frameLayout, frameLayout2, c22849x81a93d25, c15343x638a173f, progressBar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(mo144222x4ff8c0f0.getResources().getResourceName(i17)));
    }
}

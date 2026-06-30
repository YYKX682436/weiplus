package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class qh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca f205694d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca c14905x694027ca) {
        super(0);
        this.f205694d = c14905x694027ca;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View mo144222x4ff8c0f0 = this.f205694d.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.m7g);
        int i17 = com.p314xaae8f345.mm.R.id.dft;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.dft);
        if (textView != null) {
            i17 = com.p314xaae8f345.mm.R.id.f565762dg3;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.f565762dg3);
            if (frameLayout != null) {
                i17 = com.p314xaae8f345.mm.R.id.lbi;
                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.lbi);
                if (progressBar != null) {
                    i17 = com.p314xaae8f345.mm.R.id.lqa;
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.lqa);
                    if (c22849x81a93d25 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.m2g;
                        android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.m2g);
                        if (textView2 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.m6e;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.m6e);
                            if (c15343x638a173f != null) {
                                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) mo144222x4ff8c0f0;
                                return new vb2.m0(c1073x7e08a787, textView, frameLayout, progressBar, c22849x81a93d25, textView2, c15343x638a173f, c1073x7e08a787);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(mo144222x4ff8c0f0.getResources().getResourceName(i17)));
    }
}

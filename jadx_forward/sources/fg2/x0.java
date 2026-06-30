package fg2;

/* loaded from: classes10.dex */
public final class x0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f343924a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.LinearLayout f343925b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 f343926c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f343927d;

    public x0(android.widget.RelativeLayout relativeLayout, p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a60, android.widget.LinearLayout linearLayout, android.widget.RelativeLayout relativeLayout2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a602, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a603, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        this.f343924a = relativeLayout;
        this.f343925b = linearLayout;
        this.f343926c = c14296xe95b9a603;
        this.f343927d = imageView2;
    }

    public static fg2.x0 a(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.R.id.fa7;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(view, com.p314xaae8f345.mm.R.id.fa7);
        if (c1073x7e08a787 != null) {
            i17 = com.p314xaae8f345.mm.R.id.fa8;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a60 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60) x4.b.a(view, com.p314xaae8f345.mm.R.id.fa8);
            if (c14296xe95b9a60 != null) {
                i17 = com.p314xaae8f345.mm.R.id.fa9;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.fa9);
                if (linearLayout != null) {
                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
                    i17 = com.p314xaae8f345.mm.R.id.fap;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a602 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60) x4.b.a(view, com.p314xaae8f345.mm.R.id.fap);
                    if (c14296xe95b9a602 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.qrm;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a603 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60) x4.b.a(view, com.p314xaae8f345.mm.R.id.qrm);
                        if (c14296xe95b9a603 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.qag;
                            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.p314xaae8f345.mm.R.id.qag);
                            if (imageView != null) {
                                i17 = com.p314xaae8f345.mm.R.id.qam;
                                android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(view, com.p314xaae8f345.mm.R.id.qam);
                                if (imageView2 != null) {
                                    return new fg2.x0(relativeLayout, c1073x7e08a787, c14296xe95b9a60, linearLayout, relativeLayout, c14296xe95b9a602, c14296xe95b9a603, imageView, imageView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f343924a;
    }
}

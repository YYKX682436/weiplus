package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes8.dex */
public final class y9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final java.lang.String H;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.FrameLayout f199085J;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y9(android.content.Context r1, java.lang.String r2, zl2.u4 r3, float r4, int r5, p3321xbce91901.jvm.p3324x21ffc6bd.i r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto L6
            zl2.u4 r3 = zl2.u4.f555521d
        L6:
            r5 = r5 & 8
            if (r5 == 0) goto Lc
            r4 = 1061158912(0x3f400000, float:0.75)
        Lc:
            java.lang.String r5 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r5)
            java.lang.String r5 = "url"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r5)
            java.lang.String r5 = "uiMode"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r5)
            android.content.res.Resources r5 = r1.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.orientation
            r6 = 2
            if (r5 != r6) goto L2c
            r5 = 1
            goto L2d
        L2c:
            r5 = 0
        L2d:
            r0.<init>(r1, r5, r3, r4)
            r0.H = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.y9.<init>(android.content.Context, java.lang.String, zl2.u4, float, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ecf;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int J() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initContentView url=");
        java.lang.String str = this.H;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWebViewBottomSheet", sb6.toString());
        this.f199085J = (android.widget.FrameLayout) rootView.findViewById(com.p314xaae8f345.mm.R.id.f569232pi0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 a17 = al5.l2.a(this.f199716e);
        a17.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf999 = a17.mo120153xd15cf999();
        boolean z17 = true;
        mo120153xd15cf999.E(true);
        mo120153xd15cf999.z(true);
        mo120153xd15cf999.N(false);
        mo120153xd15cf999.r(false);
        mo120153xd15cf999.G(true);
        mo120153xd15cf999.P(true);
        mo120153xd15cf999.s(-1);
        mo120153xd15cf999.t(true);
        mo120153xd15cf999.k(true);
        mo120153xd15cf999.K(android.webkit.WebSettings.RenderPriority.HIGH);
        a17.setLayerType(2, null);
        a17.setBackgroundColor(-1);
        a17.mo74800x23d27c02(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.w9());
        a17.mo81410x6fd49b97(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.x9());
        this.I = a17;
        android.widget.FrameLayout frameLayout = this.f199085J;
        if (frameLayout != null) {
            frameLayout.addView(a17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWebViewBottomSheet", "WebView added to container");
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveWebViewBottomSheet", "url is null or empty!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWebViewBottomSheet", "loadUrl: " + str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.I;
        if (c22633x83752a59 != null) {
            c22633x83752a59.mo32265x141096a9(str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean Q() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.I;
        if (c22633x83752a59 != null) {
            c22633x83752a59.mo120194xc77ccada();
            c22633x83752a59.mo32265x141096a9("about:blank");
            android.widget.FrameLayout frameLayout = this.f199085J;
            if (frameLayout != null) {
                frameLayout.removeView(c22633x83752a59);
            }
            c22633x83752a59.mo52095x5cd39ffa();
        }
        this.I = null;
    }
}

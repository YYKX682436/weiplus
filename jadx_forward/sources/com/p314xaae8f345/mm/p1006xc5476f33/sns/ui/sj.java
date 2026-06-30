package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class sj implements al5.b4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 f252007d;

    public sj(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        this.f252007d = c18064xe6e1a3b3;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScale", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScale", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScaleBegin", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f252007d;
        r45.jj4 M = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.M(c18064xe6e1a3b3);
        if (M == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScaleBegin", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
            return true;
        }
        if (M.f459389e == 6 || c18064xe6e1a3b3.T(M)) {
            android.view.View m70755xfdad4e88 = c18064xe6e1a3b3.m70755xfdad4e88();
            if (m70755xfdad4e88 != null) {
                db5.e7 a17 = al5.y3.f87635a.a(m70755xfdad4e88);
                if (a17 != null) {
                    a17.mo70831x49dc7633(true);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.N(c18064xe6e1a3b3).m81477xae17c85(true);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.O(c18064xe6e1a3b3, m70755xfdad4e88);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.N(c18064xe6e1a3b3).m81477xae17c85(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScaleBegin", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f252007d;
        r45.jj4 M = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.M(c18064xe6e1a3b3);
        if (M == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
            return;
        }
        if (M.f459389e == 6 || c18064xe6e1a3b3.T(M) || M.f459389e == 2) {
            ta4.f1.f498276a.a(2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.N(c18064xe6e1a3b3).m81464xb7cf71c7());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class tj implements al5.z3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 f252059a;

    public tj(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        this.f252059a = c18064xe6e1a3b3;
    }

    @Override // al5.z3
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f252059a;
        r45.jj4 M = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.M(c18064xe6e1a3b3);
        if (M == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$5");
            return;
        }
        if (M.f459389e == 6 || c18064xe6e1a3b3.T(M) || M.f459389e == 2) {
            ta4.f1.f498276a.a(1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.N(c18064xe6e1a3b3).m81464xb7cf71c7());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$5");
    }

    @Override // al5.z3
    /* renamed from: onDoubleTap */
    public void mo2317xce1d2af3(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDoubleTap", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f252059a;
        r45.jj4 M = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.M(c18064xe6e1a3b3);
        if (M == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTap", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$5");
            return;
        }
        if (M.f459389e == 6 || c18064xe6e1a3b3.T(M)) {
            android.view.View m70755xfdad4e88 = c18064xe6e1a3b3.m70755xfdad4e88();
            if (m70755xfdad4e88 != null) {
                if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.N(c18064xe6e1a3b3).getAddTouchView()) {
                    db5.e7 a17 = al5.y3.f87635a.a(m70755xfdad4e88);
                    if (a17 != null) {
                        a17.mo70831x49dc7633(true);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.N(c18064xe6e1a3b3).m81477xae17c85(true);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.O(c18064xe6e1a3b3, m70755xfdad4e88);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.N(c18064xe6e1a3b3).e(f17, f18);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.N(c18064xe6e1a3b3).m81477xae17c85(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTap", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$5");
    }
}

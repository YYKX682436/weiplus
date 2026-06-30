package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public final class he implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11458x2418e7d9 f155445d;

    public he(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11458x2418e7d9 activityC11458x2418e7d9) {
        this.f155445d = activityC11458x2418e7d9;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.PrecheckAffiliatedAcctResponse");
            intent.putExtra("rawUrl", ((r45.ub5) fVar).f468737d);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            j45.l.n(this.f155445d.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, 702);
        }
        return 0;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes.dex */
public class zl implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17460x8b5f64b2 f243366d;

    public zl(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17460x8b5f64b2 activityC17460x8b5f64b2) {
        this.f243366d = activityC17460x8b5f64b2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", ((r45.ub5) oVar.f152244b.f152233a).f468737d);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            j45.l.n(this.f243366d.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, 702);
        }
        return 0;
    }
}

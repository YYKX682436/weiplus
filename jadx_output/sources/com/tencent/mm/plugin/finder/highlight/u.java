package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public final class u extends com.tencent.mm.ui.component.UIComponent implements zy2.f8 {

    /* renamed from: d, reason: collision with root package name */
    public in5.s0 f111468d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.highlight.FinderLiveHighlightDrawer f111469e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.highlight.p f111470f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.highlight.l f111471g;

    /* renamed from: h, reason: collision with root package name */
    public cw2.ea f111472h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f111473i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.highlight.p pVar = new com.tencent.mm.plugin.finder.highlight.p(getActivity());
        this.f111470f = pVar;
        this.f111471g = new com.tencent.mm.plugin.finder.highlight.l(pVar);
        this.f111473i = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public final void O6() {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        in5.s0 s0Var = this.f111468d;
        if (s0Var != null && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) != null) {
            cw2.ea eaVar = this.f111472h;
            if (eaVar != null) {
                finderVideoLayout.T(eaVar);
            }
            finderVideoLayout.S();
        }
        this.f111472h = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.plugin.finder.highlight.FinderLiveHighlightDrawer finderLiveHighlightDrawer = this.f111469e;
        boolean z17 = false;
        if (finderLiveHighlightDrawer != null ? finderLiveHighlightDrawer.q() : false) {
            com.tencent.mm.plugin.finder.highlight.FinderLiveHighlightDrawer finderLiveHighlightDrawer2 = this.f111469e;
            z17 = true;
            if (finderLiveHighlightDrawer2 != null && finderLiveHighlightDrawer2.q()) {
                finderLiveHighlightDrawer2.n(true);
            }
        }
        return z17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveHighlightDrawerUIC", "remove highlight progress listener to drawer, on destroy");
        O6();
        this.f111470f.f111455b = null;
        this.f111468d = null;
        com.tencent.mm.plugin.finder.highlight.FinderLiveHighlightDrawer finderLiveHighlightDrawer = this.f111469e;
        if (finderLiveHighlightDrawer != null) {
            finderLiveHighlightDrawer.b();
        }
        this.f111473i.clear();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.finder.highlight.FinderLiveHighlightDrawer finderLiveHighlightDrawer = this.f111469e;
        if (finderLiveHighlightDrawer == null || !finderLiveHighlightDrawer.q()) {
            return;
        }
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Y9).getValue()).r()).intValue() == 1) {
            finderLiveHighlightDrawer.setChangeBackgroundAlpha(false);
            finderLiveHighlightDrawer.setBackgroundColorRes(com.tencent.mm.R.color.a9e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.plugin.finder.highlight.p pVar = new com.tencent.mm.plugin.finder.highlight.p(getActivity());
        this.f111470f = pVar;
        this.f111471g = new com.tencent.mm.plugin.finder.highlight.l(pVar);
        this.f111473i = new java.util.concurrent.CopyOnWriteArrayList();
    }
}

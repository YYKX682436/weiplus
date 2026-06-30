package as3;

/* loaded from: classes11.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView f13506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.xb f13507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f13508f;

    public g0(com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView bizProfileTopicFlowView, zy2.xb xbVar, boolean z17) {
        this.f13506d = bizProfileTopicFlowView;
        this.f13507e = xbVar;
        this.f13508f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = ((com.tencent.mm.plugin.finder.profile.FlowLayoutManager) this.f13507e).f123302m;
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView bizProfileTopicFlowView = this.f13506d;
        bizProfileTopicFlowView.setFoldHeight(i17 + i65.a.b(bizProfileTopicFlowView.getContext(), 8));
        if (this.f13508f) {
            bizProfileTopicFlowView.d(0, bizProfileTopicFlowView.foldHeight, 0.0f, 1.0f);
        } else {
            bizProfileTopicFlowView.d(bizProfileTopicFlowView.foldHeight, 0, 1.0f, 0.0f);
        }
    }
}

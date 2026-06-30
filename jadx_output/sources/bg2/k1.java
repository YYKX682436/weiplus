package bg2;

/* loaded from: classes3.dex */
public final class k1 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveConvertLiveRoomViewController f20242d;

    public k1(com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveConvertLiveRoomViewController liveConvertLiveRoomViewController) {
        this.f20242d = liveConvertLiveRoomViewController;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var;
        com.tencent.mars.xlog.Log.i(this.f20242d.f111623e, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = k0Var2 instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) k0Var2 : null;
        if (!(finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getIsPresentedInTimeLineUI() : false) || (k0Var = dk2.ef.f233380e) == null) {
            return;
        }
        k0Var.keyboardChange(i17 > 0, i17);
    }
}

package t74;

/* loaded from: classes4.dex */
public final class c implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewFirstFrameRenderCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f497650a;

    public c(t74.w1 w1Var) {
        this.f497650a = w1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewFirstFrameRenderCallback
    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readerFirstFrame", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$3");
        t74.w1 w1Var = this.f497650a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.j(), "frontOnlineVideoView firstFrameRender callback");
        android.widget.ImageView V = t74.w1.V(w1Var);
        if (V != null) {
            V.setVisibility(4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readerFirstFrame", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$3");
    }
}

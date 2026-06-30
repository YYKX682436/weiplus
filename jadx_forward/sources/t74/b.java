package t74;

/* loaded from: classes4.dex */
public final class b implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewFirstFrameRenderCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f497636a;

    public b(t74.w1 w1Var) {
        this.f497636a = w1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewFirstFrameRenderCallback
    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readerFirstFrame", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$2");
        t74.w1 w1Var = this.f497636a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.j(), "backOnlineVideoView firstFrameRender callback");
        android.widget.ImageView J2 = t74.w1.J(w1Var);
        if (J2 != null) {
            J2.setVisibility(4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readerFirstFrame", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$2");
    }
}

package n84;

/* loaded from: classes4.dex */
public class o implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 f417218d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a261) {
        this.f417218d = c17785x8a47a261;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInfo", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$6");
        n84.w.e("AdAlphaPlayerView", "onInfo() called with: player = [" + interfaceC26164x73fc6bc6 + "], what = [" + i17 + "], arg1 = [" + j17 + "], arg2 = [" + j18 + "], extraObject = [" + obj + "]");
        com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener iOnInfoListener = this.f417218d.f245022r;
        if (iOnInfoListener != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f0) iOnInfoListener).mo53278xc39adf2d(interfaceC26164x73fc6bc6, i17, j17, j18, obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInfo", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$6");
    }
}

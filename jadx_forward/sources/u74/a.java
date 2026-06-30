package u74;

/* loaded from: classes4.dex */
public class a implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u74.f f506662a;

    public a(u74.f fVar) {
        this.f506662a = fVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FullCardAdWrapper", "online, onStart:" + i17);
        u74.f fVar = this.f506662a;
        if (u74.f.a(fVar) != null) {
            u74.f.a(fVar).b(i17, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
        u74.f fVar = this.f506662a;
        if (u74.f.a(fVar) != null) {
            u74.f.a(fVar).a(i17, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    /* renamed from: onCompletion */
    public void mo70662xa6db431b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FullCardAdWrapper", "online, onCompletion");
        u74.f fVar = this.f506662a;
        if (u74.f.a(fVar) != null) {
            u74.f.a(fVar).d(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
    }
}

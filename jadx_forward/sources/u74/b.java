package u74;

/* loaded from: classes4.dex */
public class b implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u74.f f506663a;

    public b(u74.f fVar) {
        this.f506663a = fVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g7
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FullCardAdWrapper", "offline, onStart:" + i17);
        u74.f fVar = this.f506663a;
        if (u74.f.a(fVar) != null) {
            u74.f.a(fVar).b(i17, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g7
    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
        u74.f fVar = this.f506663a;
        if (u74.f.a(fVar) != null) {
            u74.f.a(fVar).a(i17, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g7
    public boolean d(com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FullCardAdWrapper", "offline, downloadVideo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g7
    /* renamed from: onCompletion */
    public void mo70211xa6db431b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FullCardAdWrapper", "offline, onCompletion");
        u74.f fVar = this.f506663a;
        if (u74.f.a(fVar) != null) {
            u74.f.a(fVar).d(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
    }
}

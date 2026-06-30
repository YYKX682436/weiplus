package sb4;

/* loaded from: classes11.dex */
public class d extends com.p314xaae8f345.mm.ui.p2690x38b72420.f5 {

    /* renamed from: n, reason: collision with root package name */
    public android.view.View.OnClickListener f486986n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f486987o;

    public d(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17) {
        super(abstractActivityC22312xbd689c47, list, z17, 0);
        this.f486986n = null;
        this.f486987o = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, rd0.z0
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createChatroomDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        rd0.a1 a1Var = this.f288237m;
        qd0.n0 n0Var = (qd0.n0) a1Var;
        int i18 = (i17 - n0Var.f443088f) - 1;
        tb4.d dVar = new tb4.d(i17);
        dVar.f288381q = n0Var.f443096n;
        dVar.E = this.f486986n;
        p13.y yVar = (p13.y) ((qd0.n0) ((rd0.c1) a1Var)).f443093k.get(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMatchInfo", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        dVar.F = yVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMatchInfo", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        dVar.f288369e = this.f288611f;
        boolean z17 = this.f486987o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShowMoreBtn", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        dVar.G = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShowMoreBtn", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createChatroomDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        return dVar;
    }
}

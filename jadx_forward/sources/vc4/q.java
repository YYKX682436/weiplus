package vc4;

/* loaded from: classes4.dex */
public final class q implements le0.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 f516834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xc4.p f516835b;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 c18258x7ccfbc06, xc4.p pVar) {
        this.f516834a = c18258x7ccfbc06;
        this.f516835b = pVar;
    }

    @Override // le0.s
    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadItemErrorTipView$4");
        xc4.p pVar = this.f516835b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06.e(this.f516834a, "MicroMsg.Improve.ItemFooter", "click urlLinks ".concat(pVar.W0()));
        if (pVar.m175346x5f660a9a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 currentInfo = pVar.c1();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCurrentSecuritySnsInfo", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentInfo, "currentInfo");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveSnsSecurityPassFooterHelper", "setCurrentSecuritySnsInfo >> " + currentInfo.m70363x51f8f990());
            mc4.c.f407179b = currentInfo;
            mc4.c.f407181d = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCurrentSecuritySnsInfo", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadItemErrorTipView$4");
    }
}

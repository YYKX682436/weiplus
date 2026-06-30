package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class xh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18055x6570dbf7 f253046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lh0 f253047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253048f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f253049g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18055x6570dbf7 c18055x6570dbf7, r45.lh0 lh0Var, java.lang.String str, long j17) {
        super(0);
        this.f253046d = c18055x6570dbf7;
        this.f253047e = lh0Var;
        this.f253048f = str;
        this.f253049g = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$2");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18055x6570dbf7.f248680f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$requestProductCardInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18055x6570dbf7 c18055x6570dbf7 = this.f253046d;
        c18055x6570dbf7.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestProductCardInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
        android.content.Context context = c18055x6570dbf7.getContext();
        ((b00.r) z2Var).getClass();
        r45.lh0 shareInfo = this.f253047e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareInfo, "shareInfo");
        java.lang.String str = this.f253048f;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || r26.i0.q(str, "0", false, 2, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "requestProductCardInfo snsId nil");
        } else {
            java.lang.String Ai = ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).Ai(str, this.f253049g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "requestProductCardInfo productId:" + shareInfo.f461008f + " lastGmsgId:" + shareInfo.f461010h + " gMsgId:" + Ai);
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            p3325xe03a0797.p3326xc267989b.l.d(context instanceof p012xc85e97e9.p093xedfae76a.y ? new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("Ecs.EcsCardMgrService", (p012xc85e97e9.p093xedfae76a.y) context, 0, 4, null) : p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new b00.o(shareInfo, Ai, null), 3, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestProductCardInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$requestProductCardInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$2");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$2");
        return f0Var;
    }
}

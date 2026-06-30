package l74;

/* loaded from: classes4.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l74.m f398430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f398431b;

    public l(l74.m mVar, long j17) {
        this.f398430a = mVar;
        this.f398431b = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        int i17;
        ca4.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("call", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager$requestStatusAndUpdate$1");
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("call", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager$requestStatusAndUpdate$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackVer2PromptManager", "PersonalizedAdSwitchReq, errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b + ", errMsg: " + fVar.f152150c);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("status is ");
        sb6.append(((r45.y75) fVar.f152151d).f472372d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackVer2PromptManager", sb6.toString());
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            if (((r45.y75) fVar.f152151d).f472372d.equals("false")) {
                i17 = 2;
            } else {
                if (!((r45.y75) fVar.f152151d).f472372d.equals("true")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeedbackVer2PromptManager", "PersonalizedAdSwitch invalid status");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("call", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager$requestStatusAndUpdate$1");
                    jz5.f0 f0Var = jz5.f0.f384359a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("call", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager$requestStatusAndUpdate$1");
                    return f0Var;
                }
                i17 = 1;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMFeedbackVer2Displayer$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            l74.m mVar = this.f398430a;
            l74.k kVar = mVar.f398432q;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMFeedbackVer2Displayer$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            kVar.c(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setOriginalStatus$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            mVar.f398435t = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setOriginalStatus$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 179);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMDataSupplier$p$s-226950187", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMDataSupplier$p$s-226950187", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsSnsDetailUI$p$s-226950187", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsSnsDetailUI$p$s-226950187", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            int i18 = (int) (currentTimeMillis - this.f398431b);
            i74.a aVar2 = mVar.f371029i;
            aVar2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdActTypeData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = aVar2.f370989b;
            if (c17933xe8d1b226 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdActTypeData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                aVar = null;
            } else {
                ca4.a aVar3 = new ca4.a(c17933xe8d1b226.m70375x338a8cc7(), mVar.f371032o ? 2 : 1, 1557, java.lang.Integer.valueOf(i18), 1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdActTypeData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                aVar = aVar3;
            }
            a84.t0.a(aVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("call", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager$requestStatusAndUpdate$1");
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("call", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager$requestStatusAndUpdate$1");
        return f0Var2;
    }
}

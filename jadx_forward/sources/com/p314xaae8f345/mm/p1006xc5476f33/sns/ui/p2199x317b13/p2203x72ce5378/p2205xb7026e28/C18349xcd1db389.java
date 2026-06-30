package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemGameShareHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemBizHandle;", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "info", "Landroid/view/View;", "view", "", "oldExposedId", "newExposedId", "", "isExposed", "Ljz5/f0;", "onViewExposed", "", "GAME_SHARE_EXPOSE", "I", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemGameShareHandle */
/* loaded from: classes4.dex */
public final class C18349xcd1db389 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18345x9e6e600f {
    private final int GAME_SHARE_EXPOSE = 1;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18345x9e6e600f
    /* renamed from: onViewExposed */
    public void mo71120xcdf5f75c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 info, android.view.View view, long j17, long j18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemGameShareHandle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (info.m70371x485d7().f39014x86965dde.f451370e == 101 && z17) {
            m63.g gVar = (m63.g) i95.n0.c(m63.g.class);
            java.lang.String str = info.m70371x485d7().Id;
            java.lang.String str2 = info.m70371x485d7().f39012x33e0f24f.f472379d;
            r45.e73 e73Var = info.m70371x485d7().f39025x96ae695c;
            int i17 = e73Var != null ? e73Var.f454600f : 0;
            r45.e73 e73Var2 = info.m70371x485d7().f39025x96ae695c;
            java.lang.String str3 = e73Var2 != null ? e73Var2.f454599e : null;
            if (str3 == null) {
                str3 = "";
            }
            ((l63.h) gVar).Bi(str, str2, i17, str3, this.GAME_SHARE_EXPOSE);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemGameShareHandle");
    }
}

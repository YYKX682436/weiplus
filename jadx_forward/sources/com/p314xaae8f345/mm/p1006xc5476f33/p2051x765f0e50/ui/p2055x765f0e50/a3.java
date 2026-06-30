package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class a3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17390xeb03cc89 f242329a;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17390xeb03cc89 activityC17390xeb03cc89) {
        this.f242329a = activityC17390xeb03cc89;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e());
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17390xeb03cc89 activityC17390xeb03cc89 = this.f242329a;
            M.putBoolean("dark_mode_follow_system", activityC17390xeb03cc89.f241738t);
            com.p314xaae8f345.mm.ui.bk.x0();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("dark_mode", activityC17390xeb03cc89.f241737s);
            if (activityC17390xeb03cc89.f241738t) {
                com.p314xaae8f345.mm.ui.ee.e(2, activityC17390xeb03cc89.getTaskId());
            } else {
                boolean z18 = activityC17390xeb03cc89.f241737s;
                com.p314xaae8f345.mm.ui.ee.e(z18 ? 1 : 0, activityC17390xeb03cc89.getTaskId());
            }
            activityC17390xeb03cc89.Y6();
            if (!activityC17390xeb03cc89.f241738t) {
                com.p314xaae8f345.p3210x3857dc.a3.v(activityC17390xeb03cc89.f241737s);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59.H0(activityC17390xeb03cc89.f241737s);
            }
            ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetSnsPostDescPreloadTextViewConfig", "com.tencent.mm.feature.sns.SnsFeatureService");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h3.f();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetSnsPostDescPreloadTextViewConfig", "com.tencent.mm.feature.sns.SnsFeatureService");
            l01.n nVar = (l01.n) l01.d0.f396294a.f396276e;
            synchronized (nVar.f396314a) {
                ((l01.m) nVar.f396314a).mo143584x5a5b64d();
            }
            if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi() != null) {
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a();
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().n0();
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Intro_Need_Clear_Top ", true);
            intent.addFlags(67108864);
            intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).vk();
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).d(intent, activityC17390xeb03cc89.mo55332x76847179());
        }
    }
}

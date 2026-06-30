package he0;

/* loaded from: classes4.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f362258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362259e;

    public i5(he0.j5 j5Var, java.util.ArrayList arrayList, java.lang.String str) {
        this.f362258d = arrayList;
        this.f362259e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7;
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener$1");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.e6.f245707a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkNeedUpdateSnsContentObjXml", "com.tencent.mm.plugin.sns.model.SnsLogic");
        java.util.ArrayList arrayList = this.f362258d;
        if (arrayList == null || arrayList.size() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkNeedUpdateSnsContentObjXml", "com.tencent.mm.plugin.sns.model.SnsLogic");
        } else {
            java.util.Iterator it = new java.util.ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) it.next(), 0);
                if (P != 0 && (i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(P)) != null && (m70371x485d7 = i17.m70371x485d7()) != null && (a90Var = m70371x485d7.f39014x86965dde) != null && a90Var.f451370e == 26) {
                    a90Var.f451375m = this.f362259e;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().w3(P, i17);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5935xb93dc17d c5935xb93dc17d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5935xb93dc17d();
                    c5935xb93dc17d.f136239g.f89744a = P;
                    c5935xb93dc17d.e();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkNeedUpdateSnsContentObjXml", "com.tencent.mm.plugin.sns.model.SnsLogic");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener$1");
    }
}

package he0;

/* loaded from: classes4.dex */
public class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6130x1c2ecb67 f362260d;

    public i6(he0.j6 j6Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6130x1c2ecb67 c6130x1c2ecb67) {
        this.f362260d = c6130x1c2ecb67;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener$1");
        int i17 = (int) this.f362260d.f136402g.f90147c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1 Aj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj();
        Aj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateToRead", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        java.lang.String str = " update SnsComment set isRead = 1, isReminding = 0 where isRead = 0 and  createTime <= " + i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentStorage", "updateToread " + str);
        boolean A = Aj.f247689d.A("SnsComment", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateToRead", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusNotifyFunctionListener", "update msg read " + A);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3.I();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener$1");
    }
}

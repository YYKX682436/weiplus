package df2;

/* loaded from: classes10.dex */
public final class yr implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f313423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f313424e;

    public yr(java.util.HashMap hashMap, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f313423d = hashMap;
        this.f313424e = countDownLatch;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = (com.p314xaae8f345.mm.p944x882e457a.u0) this.f313423d.get(m1Var);
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i17, i18, str, m1Var);
            java.util.concurrent.CountDownLatch countDownLatch = this.f313424e;
            countDownLatch.countDown();
            java.lang.String str2 = df2.lt.W;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "countdown " + m1Var.hashCode() + ", remain" + countDownLatch.getCount());
        }
    }
}

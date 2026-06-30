package at2;

/* loaded from: classes3.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy f13754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ at2.u1 f13755e;

    public t1(com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy, at2.u1 u1Var) {
        this.f13754d = finderLiveThumbPlayerProxy;
        this.f13755e = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f13754d;
        finderLiveThumbPlayerProxy.getLocationOnScreen(iArr);
        int height = iArr[1] + finderLiveThumbPlayerProxy.getHeight();
        com.tencent.mm.plugin.finder.live.plugin.le0 le0Var = (com.tencent.mm.plugin.finder.live.plugin.le0) this.f13755e.X0(com.tencent.mm.plugin.finder.live.plugin.le0.class);
        if (le0Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.le0.w1(le0Var, height, 0, 2, null);
        }
    }
}

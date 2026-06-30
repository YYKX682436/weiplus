package bs2;

/* loaded from: classes2.dex */
public final class k extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore f23873a;

    public k(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore) {
        this.f23873a = finderStreamTabPreloadCore;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("Finder.StreamTabPreloadCore", "onEnterForeground: ");
        pm0.v.X(new bs2.i(this.f23873a));
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("Finder.StreamTabPreloadCore", "onExitForeground: ");
        pm0.v.X(new bs2.j(this.f23873a));
    }
}

package bs2;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore f23868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore) {
        super(0);
        this.f23868d = finderStreamTabPreloadCore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (bs2.n1 n1Var : this.f23868d.f122543e) {
            if (n1Var.f23912f.compareAndSet(false, true)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("performBackground: tabType=");
                int i17 = n1Var.f23907a;
                sb6.append(i17);
                sb6.append(", isEnableScene=");
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = n1Var.f23913g;
                sb6.append(atomicBoolean);
                sb6.append(", isInFinder=");
                sb6.append(n1Var.f23910d);
                com.tencent.mars.xlog.Log.i(n1Var.f23909c, sb6.toString());
                if (atomicBoolean.get() && !n1Var.f23910d) {
                    n1Var.f23911e.c("performBackground");
                }
                if (i17 == 4) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("clearCache: source=performBackground, cacheMedia=");
                    sb7.append(hc2.b0.g(bs2.f.f23833d, 0, 1, null));
                    sb7.append('.');
                    mn2.g4 g4Var = bs2.f.f23832c;
                    sb7.append(g4Var != null ? g4Var.n() : null);
                    com.tencent.mars.xlog.Log.i("FinderPlayerPreloadCore", sb7.toString());
                    pm0.v.X(bs2.d.f23823d);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

package bs2;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore f23859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore) {
        super(0);
        this.f23859d = finderStreamTabPreloadCore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (bs2.n1 n1Var : this.f23859d.f122543e) {
            boolean n17 = n1Var.n();
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = n1Var.f23913g;
            if (n17) {
                atomicBoolean.set(true);
            }
            if (n1Var.f23912f.compareAndSet(true, false)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("performForeground: tabType=");
                int i17 = n1Var.f23907a;
                sb6.append(i17);
                sb6.append(", isEnableScene=");
                sb6.append(atomicBoolean);
                sb6.append(", isInFinder=");
                sb6.append(n1Var.f23910d);
                java.lang.String sb7 = sb6.toString();
                java.lang.String str = n1Var.f23909c;
                com.tencent.mars.xlog.Log.i(str, sb7);
                if (i17 == 4 && !n1Var.f23910d) {
                    n1Var.d("performForeground");
                }
                boolean z17 = atomicBoolean.get();
                com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore = n1Var.f23908b;
                if (z17 && !n1Var.f23910d) {
                    if (i17 == finderStreamTabPreloadCore.T6()) {
                        long f17 = n1Var.f();
                        if (n1Var.f23917k && n17) {
                            n1Var.f23917k = false;
                            if (f17 < 2000) {
                                f17 = 2000;
                            }
                        }
                        com.tencent.mars.xlog.Log.i(str, "performForeground: post preload delay=" + f17);
                        n1Var.f23911e.a(n1Var.f23921o, f17, "performForeground", (n1Var.f23914h.get() || !n17) ? bs2.a.f23796d : bs2.a.f23797e);
                    }
                }
                if (!n1Var.f23910d && (finderStreamTabPreloadCore.S6().getBoolean(35) || atomicBoolean.get())) {
                    n1Var.s("performForeground");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

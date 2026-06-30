package bs2;

/* loaded from: classes2.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 f105401d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 c14614xb913e379) {
        super(0);
        this.f105401d = c14614xb913e379;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        for (bs2.n1 n1Var : this.f105401d.f204076e) {
            if (n1Var.f105445f.compareAndSet(false, true)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("performBackground: tabType=");
                int i17 = n1Var.f105440a;
                sb6.append(i17);
                sb6.append(", isEnableScene=");
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = n1Var.f105446g;
                sb6.append(atomicBoolean);
                sb6.append(", isInFinder=");
                sb6.append(n1Var.f105443d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n1Var.f105442c, sb6.toString());
                if (atomicBoolean.get() && !n1Var.f105443d) {
                    n1Var.f105444e.c("performBackground");
                }
                if (i17 == 4) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("clearCache: source=performBackground, cacheMedia=");
                    sb7.append(hc2.b0.g(bs2.f.f105366d, 0, 1, null));
                    sb7.append('.');
                    mn2.g4 g4Var = bs2.f.f105365c;
                    sb7.append(g4Var != null ? g4Var.n() : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPlayerPreloadCore", sb7.toString());
                    pm0.v.X(bs2.d.f105356d);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}

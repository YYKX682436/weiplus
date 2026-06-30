package bs2;

/* loaded from: classes2.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 f105392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 c14614xb913e379) {
        super(0);
        this.f105392d = c14614xb913e379;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        for (bs2.n1 n1Var : this.f105392d.f204076e) {
            boolean n17 = n1Var.n();
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = n1Var.f105446g;
            if (n17) {
                atomicBoolean.set(true);
            }
            if (n1Var.f105445f.compareAndSet(true, false)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("performForeground: tabType=");
                int i17 = n1Var.f105440a;
                sb6.append(i17);
                sb6.append(", isEnableScene=");
                sb6.append(atomicBoolean);
                sb6.append(", isInFinder=");
                sb6.append(n1Var.f105443d);
                java.lang.String sb7 = sb6.toString();
                java.lang.String str = n1Var.f105442c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
                if (i17 == 4 && !n1Var.f105443d) {
                    n1Var.d("performForeground");
                }
                boolean z17 = atomicBoolean.get();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 c14614xb913e379 = n1Var.f105441b;
                if (z17 && !n1Var.f105443d) {
                    if (i17 == c14614xb913e379.T6()) {
                        long f17 = n1Var.f();
                        if (n1Var.f105450k && n17) {
                            n1Var.f105450k = false;
                            if (f17 < 2000) {
                                f17 = 2000;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "performForeground: post preload delay=" + f17);
                        n1Var.f105444e.a(n1Var.f105454o, f17, "performForeground", (n1Var.f105447h.get() || !n17) ? bs2.a.f105329d : bs2.a.f105330e);
                    }
                }
                if (!n1Var.f105443d && (c14614xb913e379.S6().m75933x41a8a7f2(35) || atomicBoolean.get())) {
                    n1Var.s("performForeground");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}

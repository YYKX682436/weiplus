package bu2;

/* loaded from: classes10.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ss2 f24558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r45.ss2 ss2Var) {
        super(2);
        this.f24558d = ss2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.ss2 ss2Var;
        java.lang.Throwable ex6 = (java.lang.Throwable) obj2;
        kotlin.jvm.internal.o.g(ex6, "ex");
        r45.ss2 ss2Var2 = this.f24558d;
        if (ss2Var2 == null) {
            ss2Var = new r45.ss2();
            ss2Var.set(1, 0);
            ss2Var.set(0, 0L);
        } else {
            ss2Var = ss2Var2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get crash, isInFinder ");
        sb6.append(((c61.p2) ((c61.l7) i95.n0.c(c61.l7.class)).f39134x0).tj());
        sb6.append(" lastEnterTimeMs:");
        bu2.s0 s0Var = bu2.s0.f24564a;
        sb6.append(bu2.s0.f24565b);
        sb6.append(" pass: ");
        sb6.append(android.os.SystemClock.uptimeMillis() - bu2.s0.f24565b);
        sb6.append(" info: ");
        sb6.append(ss2Var2 != null ? java.lang.Integer.valueOf(ss2Var2.getInteger(1)) : null);
        sb6.append(' ');
        sb6.append(ss2Var2 != null ? java.lang.Long.valueOf(ss2Var2.getLong(0)) : null);
        com.tencent.mars.xlog.Log.i("Finder.PageRecovery", sb6.toString());
        if (((c61.p2) ((c61.l7) i95.n0.c(c61.l7.class)).f39134x0).tj() && android.os.SystemClock.uptimeMillis() - bu2.s0.f24565b <= 5000) {
            if (java.lang.System.currentTimeMillis() - ss2Var.getLong(0) < 300000) {
                ss2Var.set(1, java.lang.Integer.valueOf(ss2Var.getInteger(1) + 1));
            } else {
                ss2Var.set(1, 1);
            }
            ss2Var.set(0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mm.vfs.w6.u(new com.tencent.mm.vfs.r6(s0Var.a()).r());
            com.tencent.mm.vfs.w6.R(s0Var.a(), ss2Var.toByteArray());
            com.tencent.mars.xlog.Log.i("Finder.PageRecovery", "[setup] crash happen =" + com.tencent.mm.vfs.w6.j(s0Var.a()) + " touchFile=" + s0Var.a() + " info: " + java.lang.Integer.valueOf(ss2Var.getInteger(1)) + ' ' + java.lang.Long.valueOf(ss2Var.getLong(0)));
        }
        return jz5.f0.f302826a;
    }
}

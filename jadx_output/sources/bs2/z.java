package bs2;

/* loaded from: classes2.dex */
public final class z implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bs2.a0 f23981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bs2.h0 f23982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f23983c;

    public z(bs2.a0 a0Var, bs2.h0 h0Var, yz5.l lVar) {
        this.f23981a = a0Var;
        this.f23982b = h0Var;
        this.f23983c = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.id1 id1Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        yz5.l lVar = this.f23983c;
        bs2.h0 h0Var = this.f23982b;
        bs2.a0 a0Var = this.f23981a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = a0Var.f23923q;
        java.util.concurrent.locks.Condition condition = a0Var.f23924r;
        bs2.g0 g0Var = a0Var.f23927u;
        reentrantLock.lock();
        try {
            int i17 = fVar.f70615a;
            bs2.b0 b0Var = a0Var.f23925s;
            int i18 = a0Var.f23907a;
            java.lang.String str = a0Var.f23909c;
            if (i17 != 0 || fVar.f70616b != 0) {
                a0Var.e(true, "preloadFail");
                com.tencent.mars.xlog.Log.e(str, "onCgiBack: tabType=" + i18 + " preload fail! errType=" + fVar.f70615a + " errCode=" + fVar.f70616b + " cache=" + b0Var);
            } else if (((r45.b71) fVar.f70618d).getList(1).isEmpty()) {
                com.tencent.mars.xlog.Log.e(str, "onCgiBack: tabType=" + i18 + " preload fail! list is empty! cache=" + b0Var);
            } else {
                bs2.a0.z(a0Var, fVar, h0Var);
                r45.id1 id1Var2 = (r45.id1) ((r45.b71) fVar.f70618d).getCustom(4);
                java.lang.Integer valueOf = id1Var2 != null ? java.lang.Integer.valueOf(id1Var2.getInteger(0)) : null;
                r45.b71 b71Var = (r45.b71) fVar.f70618d;
                if (b71Var != null && (id1Var = (r45.id1) b71Var.getCustom(4)) != null) {
                    int integer = id1Var.getInteger(1);
                    i95.m c17 = i95.n0.c(cq.k.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((cq.k) c17).f221228i = java.lang.Integer.valueOf(integer);
                }
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LBS_SAMECITY_SWITCH_CONFIG_INT_SYNC, java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0));
                com.tencent.mars.xlog.Log.i(str, "onCgiBack: tabType=" + i18 + " preload successfully! cityConfig=" + valueOf + " size=" + ((r45.b71) fVar.f70618d).getList(1).size() + " cache=" + b0Var + " expired time/second=" + a0Var.B);
            }
            a0Var.y(h0Var, fVar.f70615a);
            lVar.invoke(bs2.i0.f23863g);
            g0Var.f23842a = false;
            g0Var.f23843b = h0Var;
            condition.signalAll();
            reentrantLock.unlock();
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            a0Var.y(h0Var, fVar.f70615a);
            lVar.invoke(bs2.i0.f23863g);
            g0Var.f23842a = false;
            g0Var.f23843b = h0Var;
            condition.signalAll();
            reentrantLock.unlock();
            throw th6;
        }
    }
}

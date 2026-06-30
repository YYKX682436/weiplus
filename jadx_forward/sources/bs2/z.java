package bs2;

/* loaded from: classes2.dex */
public final class z implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bs2.a0 f105514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bs2.h0 f105515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f105516c;

    public z(bs2.a0 a0Var, bs2.h0 h0Var, yz5.l lVar) {
        this.f105514a = a0Var;
        this.f105515b = h0Var;
        this.f105516c = lVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.id1 id1Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        yz5.l lVar = this.f105516c;
        bs2.h0 h0Var = this.f105515b;
        bs2.a0 a0Var = this.f105514a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = a0Var.f105456q;
        java.util.concurrent.locks.Condition condition = a0Var.f105457r;
        bs2.g0 g0Var = a0Var.f105460u;
        reentrantLock.lock();
        try {
            int i17 = fVar.f152148a;
            bs2.b0 b0Var = a0Var.f105458s;
            int i18 = a0Var.f105440a;
            java.lang.String str = a0Var.f105442c;
            if (i17 != 0 || fVar.f152149b != 0) {
                a0Var.e(true, "preloadFail");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onCgiBack: tabType=" + i18 + " preload fail! errType=" + fVar.f152148a + " errCode=" + fVar.f152149b + " cache=" + b0Var);
            } else if (((r45.b71) fVar.f152151d).m75941xfb821914(1).isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onCgiBack: tabType=" + i18 + " preload fail! list is empty! cache=" + b0Var);
            } else {
                bs2.a0.z(a0Var, fVar, h0Var);
                r45.id1 id1Var2 = (r45.id1) ((r45.b71) fVar.f152151d).m75936x14adae67(4);
                java.lang.Integer valueOf = id1Var2 != null ? java.lang.Integer.valueOf(id1Var2.m75939xb282bd08(0)) : null;
                r45.b71 b71Var = (r45.b71) fVar.f152151d;
                if (b71Var != null && (id1Var = (r45.id1) b71Var.m75936x14adae67(4)) != null) {
                    int m75939xb282bd08 = id1Var.m75939xb282bd08(1);
                    i95.m c17 = i95.n0.c(cq.k.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ((cq.k) c17).f302761i = java.lang.Integer.valueOf(m75939xb282bd08);
                }
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LBS_SAMECITY_SWITCH_CONFIG_INT_SYNC, java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onCgiBack: tabType=" + i18 + " preload successfully! cityConfig=" + valueOf + " size=" + ((r45.b71) fVar.f152151d).m75941xfb821914(1).size() + " cache=" + b0Var + " expired time/second=" + a0Var.B);
            }
            a0Var.y(h0Var, fVar.f152148a);
            lVar.mo146xb9724478(bs2.i0.f105396g);
            g0Var.f105375a = false;
            g0Var.f105376b = h0Var;
            condition.signalAll();
            reentrantLock.unlock();
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            a0Var.y(h0Var, fVar.f152148a);
            lVar.mo146xb9724478(bs2.i0.f105396g);
            g0Var.f105375a = false;
            g0Var.f105376b = h0Var;
            condition.signalAll();
            reentrantLock.unlock();
            throw th6;
        }
    }
}

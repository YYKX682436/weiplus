package oi1;

/* loaded from: classes7.dex */
public abstract class e implements oi1.j {
    @Override // oi1.j
    public oi1.n a() {
        return oi1.n.f427141e;
    }

    @Override // oi1.j
    public boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, java.lang.String scene, java.lang.Runnable runnable) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = runtime.x0().m52169xfdaa7672();
        oi1.l w17 = m52169xfdaa7672 != null ? m52169xfdaa7672.w(oi1.n.f427141e) : null;
        if (w17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "navigateBackInterceptionInfo is null");
            return false;
        }
        if (!w17.a(scene)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "scene:[" + scene + "] disable");
            return false;
        }
        if (runtime.x0().m52173x328fb10a() <= 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "leave current wxa, can't intercept");
            return false;
        }
        ze.n nVar = (ze.n) runtime;
        if (nVar.u0().f128817z == 7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageNavigateBackInterceptorWC", "fake native wxa, can't intercept");
            z17 = false;
        } else {
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "custom intercept return false");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "show navigate back interception dialog");
        fl1.b bVar = new fl1.b(runtime.r0());
        java.lang.String str = w17.f427136a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = "";
        }
        bVar.t(str);
        bVar.setCanceledOnTouchOutside(false);
        bVar.setCancelable(false);
        bVar.z(com.p314xaae8f345.mm.R.C30867xcad56011.f572182a32, new oi1.c(this, runnable, runtime, bVar));
        bVar.u(com.p314xaae8f345.mm.R.C30867xcad56011.f572183a33, new oi1.d(this, runtime, bVar));
        fl1.g2 m48801x784fb1e3 = runtime.m48801x784fb1e3();
        if (m48801x784fb1e3 != null) {
            ((fl1.c0) m48801x784fb1e3).c(bVar);
        }
        ((oi1.a) this).c(nVar, 1);
        return true;
    }

    @Override // oi1.j
    /* renamed from: priority */
    public oi1.i mo151428xba8879a4() {
        return oi1.h.f427134b;
    }
}

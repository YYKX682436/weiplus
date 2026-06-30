package aw1;

/* loaded from: classes11.dex */
public final class k1 {
    public k1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a() {
        l75.k0 k0Var = gm0.j1.u().f354686f;
        long e17 = k0Var.e();
        long h17 = k0Var.h(e17);
        long k17 = k0Var.k();
        if (h17 > com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.f56078x428b3be8 || e17 < h17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VacuumTask", "Threshold not matched, skip vacuum (freelist: " + e17 + ", remain: " + h17 + ')');
            return 0;
        }
        aw1.m1.f96142a = true;
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.d(25824, "EnMicroMsg.db", k0Var.mo70515xfb83cc9b(), java.lang.Long.valueOf(k17), 0, java.lang.Long.valueOf(e17), "c2-before", 0, java.lang.Long.valueOf(h17), 0, 0, 0, 1, 0);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean u17 = k0Var.u();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        fVar.d(25824, "EnMicroMsg.db", k0Var.mo70515xfb83cc9b(), java.lang.Long.valueOf(k17), 0, java.lang.Long.valueOf(e17), "c2-" + u17, java.lang.Long.valueOf(k0Var.k()), java.lang.Long.valueOf(h17), java.lang.Long.valueOf(k17 - k0Var.k()), java.lang.Long.valueOf(currentTimeMillis2), 0, 1, java.lang.Long.valueOf(h17 / currentTimeMillis2));
        aw1.m1.f96142a = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Vacuum ");
        sb6.append(u17 ? "done" : com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
        sb6.append('.');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VacuumTask", sb6.toString());
        return u17 ? 1 : -1;
    }
}

package kh;

/* loaded from: classes12.dex */
public abstract class d extends rh.g implements kh.e2 {

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f389307k = jz5.h.a(jz5.i.f384362d, new kh.c(this));

    @Override // rh.g, rh.a, rh.e3
    public void c() {
        super.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this.f476827a.d(), "getContext(...)");
        kh.p2.f389418a.a(this);
    }

    @Override // kh.e2
    public void d() {
    }

    @Override // kh.e2
    public void f() {
        ((kh.d2) this.f389307k.mo141623x754a37bb()).a();
    }

    @Override // rh.g
    public boolean t(rh.o2 delta) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delta, "delta");
        kh.d2 d2Var = (kh.d2) this.f389307k.mo141623x754a37bb();
        rh.f fVar = (rh.f) delta.f477019c;
        java.lang.String name = fVar.f476908e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
        java.lang.Number number = fVar.f476910g.f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
        long longValue = number.longValue();
        d2Var.getClass();
        if (kh.d2.f389311c.a()) {
            d2Var.b().m40834x32c52b(new kh.b2(d2Var, name, longValue));
        }
        return super.t(delta);
    }

    @Override // rh.g
    public void u(rh.f bgn, rh.f end) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgn, "bgn");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(end, "end");
        if (end.f476907d != bgn.f476907d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.AbsTaskMonitorFeatureKt", "task tid mismatch: " + bgn + " vs " + end);
            return;
        }
        rh.e eVar = new rh.e(end, bgn, end);
        if (t(eVar)) {
            rh.d3 d3Var = eVar.f477019c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.AbsTaskMonitorFeatureKt", "onTaskReport: %s, jiffies = %s, millis = %s", ((rh.f) d3Var).f476908e, ((rh.f) d3Var).f476910g.f477085a, java.lang.Long.valueOf(eVar.f477020d));
            v(eVar);
            java.util.List list = this.f476923b;
            if (((java.util.ArrayList) list).size() >= this.f476930i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.AbsTaskMonitorFeatureKt", "task list overheat, size = " + ((java.util.ArrayList) list).size());
                k();
            }
        }
    }

    public void w(java.lang.String key, int i17) {
        rh.f m17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        rh.f fVar = (rh.f) ((java.util.concurrent.ConcurrentHashMap) this.f476924c).remove(java.lang.Integer.valueOf(i17));
        if (fVar == null || (m17 = m(key, android.os.Process.myTid())) == null) {
            return;
        }
        m17.f476914k = true;
        u(fVar, m17);
    }

    public void x(java.lang.String key, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        pj.e.f436436a.g("Matrix.battery.AbsTaskMonitorFeatureKt", 100, new kh.a(key, i17));
        rh.f m17 = m(key, android.os.Process.myTid());
        if (m17 != null) {
            java.util.Map mTaskJiffiesTrace = this.f476924c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mTaskJiffiesTrace, "mTaskJiffiesTrace");
            ((java.util.concurrent.ConcurrentHashMap) mTaskJiffiesTrace).put(java.lang.Integer.valueOf(i17), m17);
        }
    }
}

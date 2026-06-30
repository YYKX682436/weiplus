package ph;

/* loaded from: classes12.dex */
public class u extends qi.b {

    /* renamed from: h, reason: collision with root package name */
    public final qh.f0 f435829h;

    public u(qh.a0 a0Var) {
        this.f435829h = new qh.f0(a0Var);
        oj.j.c("Matrix.battery.BatteryMonitorPlugin", "setUp battery monitor plugin with configs: " + a0Var, new java.lang.Object[0]);
    }

    @Override // qi.b, ei.a
    public void a(boolean z17) {
        qh.d0 d0Var;
        boolean c17 = ih.d.c();
        qh.f0 f0Var = this.f435829h;
        if (!c17) {
            f0Var.getClass();
            oj.j.b("Matrix.battery.BatteryMonitorCore", "Matrix was not installed yet, just ignore the event", new java.lang.Object[0]);
            return;
        }
        f0Var.f444876o = z17;
        if (ph.t.o()) {
            ph.t k17 = ph.t.k();
            k17.f435823e = z17;
            jz5.g gVar = k17.f435822d;
            if (z17) {
                ph.t.f435817l = 0L;
                k17.m().removeCallbacks((ph.b) ((jz5.n) gVar).mo141623x754a37bb());
            } else {
                ph.t.f435817l = android.os.SystemClock.uptimeMillis();
                android.os.Handler m17 = k17.m();
                ph.b bVar = (ph.b) ((jz5.n) gVar).mo141623x754a37bb();
                long j17 = 0 + 300000;
                ((ph.b) ((jz5.n) gVar).mo141623x754a37bb()).f435786d = j17;
                m17.postDelayed(bVar, j17);
            }
        }
        android.os.Handler handler = f0Var.f444869e;
        if (!z17) {
            handler.removeCallbacksAndMessages(null);
            android.os.Message obtain = android.os.Message.obtain(handler);
            obtain.what = 1;
            handler.sendMessageDelayed(obtain, f0Var.f444879r);
            if (f0Var.f444878q) {
                qh.c0 c0Var = f0Var.f444872h;
                if (c0Var != null) {
                    handler.removeCallbacks(c0Var);
                    f0Var.f444872h = null;
                }
                qh.c0 c0Var2 = new qh.c0(f0Var, null);
                f0Var.f444872h = c0Var2;
                handler.postDelayed(c0Var2, f0Var.f444881t);
            }
        } else if (!handler.hasMessages(1)) {
            qh.c0 c0Var3 = f0Var.f444872h;
            if (c0Var3 != null) {
                handler.removeCallbacks(c0Var3);
                f0Var.f444872h = null;
            }
            android.os.Message obtain2 = android.os.Message.obtain(handler);
            obtain2.what = 2;
            handler.sendMessageAtFrontOfQueue(obtain2);
            if (f0Var.f444877p && (d0Var = f0Var.f444871g) != null) {
                handler.removeCallbacks(d0Var);
                qh.d0 d0Var2 = f0Var.f444871g;
                d0Var2.f444864d = 1;
                handler.post(d0Var2);
            }
        }
        java.util.Iterator it = ((java.util.ArrayList) f0Var.f444868d.f444839y).iterator();
        while (it.hasNext()) {
            ((rh.e3) it.next()).a(z17);
        }
    }

    @Override // qi.b
    public java.lang.String b() {
        return "BatteryMonitorPlugin";
    }

    @Override // qi.b
    public void c(android.app.Application application, qi.c cVar) {
        super.c(application, cVar);
        if (this.f435829h.f444868d.f444828n) {
            return;
        }
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        java.util.HashSet hashSet = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134271t;
        synchronized (hashSet) {
            hashSet.remove(this);
        }
    }

    @Override // qi.b
    public void e() {
        super.e();
        qh.f0 f0Var = this.f435829h;
        f0Var.getClass();
        synchronized (qh.f0.class) {
            if (!f0Var.f444874m) {
                java.util.Iterator it = ((java.util.ArrayList) f0Var.f444868d.f444839y).iterator();
                while (it.hasNext()) {
                    ((rh.e3) it.next()).c();
                }
                f0Var.f444874m = true;
            }
            if (ph.t.o()) {
                ph.t k17 = ph.t.k();
                k17.f435828j = f0Var;
                k17.q();
            }
        }
    }

    public qh.f0 f() {
        return this.f435829h;
    }
}

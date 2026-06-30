package rh;

/* loaded from: classes12.dex */
public class q3 implements wh.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.z3 f477032a;

    public q3(rh.z3 z3Var) {
        this.f477032a = z3Var;
    }

    public void a(android.os.IBinder iBinder, int i17, java.lang.String str, java.lang.String str2, android.os.WorkSource workSource, java.lang.String str3) {
        rh.z3 z3Var = this.f477032a;
        java.lang.String b17 = z3Var.l(str) ? z3Var.f476827a.f444868d.A.b() : "";
        oj.j.c("Matrix.battery.WakeLockMonitorFeature", "[onAcquireWakeLock] token=%s flags=%s tag=%s historyTag=%s packageName=%s workSource=%s stack=%s", java.lang.String.valueOf(iBinder), java.lang.Integer.valueOf(i17), str, str3, str2, workSource, b17);
        java.util.Map map = z3Var.f477108c;
        rh.x3 x3Var = (rh.x3) ((java.util.concurrent.ConcurrentHashMap) map).get(iBinder);
        if (x3Var != null) {
            x3Var.a(z3Var.f476827a.f444870f);
        }
        rh.x3 x3Var2 = new rh.x3(iBinder, str, i17, str2, b17);
        x3Var2.f477090e = new rh.p3(this, x3Var2);
        android.os.Handler handler = z3Var.f476827a.f444870f;
        long j17 = z3Var.f477107b;
        java.lang.Runnable runnable = x3Var2.f477089d;
        rh.w3 w3Var = x3Var2.f477087b;
        if (runnable == null) {
            if (!(w3Var.f477077f >= w3Var.f477076e)) {
                x3Var2.f477088c = 0;
                rh.u3 u3Var = new rh.u3(x3Var2, handler, j17);
                x3Var2.f477089d = u3Var;
                handler.postDelayed(u3Var, j17);
                ((java.util.concurrent.ConcurrentHashMap) map).put(iBinder, x3Var2);
                rh.z3.k(z3Var, w3Var.f477073b);
            }
        }
        oj.j.f("Matrix.battery.WakeLockMonitorFeature", "cant not start tracing of wakelock, target = " + w3Var, new java.lang.Object[0]);
        ((java.util.concurrent.ConcurrentHashMap) map).put(iBinder, x3Var2);
        rh.z3.k(z3Var, w3Var.f477073b);
    }

    public void b(android.os.IBinder iBinder, int i17) {
        rh.x3 x3Var;
        oj.j.c("Matrix.battery.WakeLockMonitorFeature", "[onReleaseWakeLock] token=%s flags=%s", java.lang.Integer.valueOf(iBinder.hashCode()), java.lang.Integer.valueOf(i17));
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f477032a.f477108c).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                x3Var = null;
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (entry.getKey() == iBinder) {
                x3Var = (rh.x3) entry.getValue();
                it.remove();
                break;
            }
        }
        if (x3Var == null) {
            oj.j.f("Matrix.battery.WakeLockMonitorFeature", "missing tracking, token = " + iBinder, new java.lang.Object[0]);
            return;
        }
        x3Var.a(this.f477032a.f476827a.f444870f);
        rh.y3 y3Var = this.f477032a.f477109d;
        rh.w3 w3Var = x3Var.f477087b;
        synchronized (y3Var.f477094a) {
            y3Var.f477095b++;
            y3Var.f477096c += w3Var.a();
        }
        java.lang.String str = x3Var.f477087b.f477073b;
        oj.j.c("Matrix.battery.WakeLockMonitorFeature", "[onReleaseWakeLock] tag = " + str + ", stack = " + (this.f477032a.l(str) ? this.f477032a.f476827a.f444868d.A.b() : ""), new java.lang.Object[0]);
        rh.z3.k(this.f477032a, str);
    }
}

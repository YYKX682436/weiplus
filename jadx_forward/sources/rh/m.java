package rh;

/* loaded from: classes12.dex */
public final class m extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public android.os.Handler f476983b;

    /* renamed from: c, reason: collision with root package name */
    public final rh.l f476984c = new rh.l();

    /* renamed from: d, reason: collision with root package name */
    public wh.c f476985d;

    @Override // rh.e3
    public int b() {
        return Integer.MIN_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
        if (this.f476827a.f444868d.f444831q) {
            rh.h hVar = new rh.h(this);
            this.f476985d = hVar;
            boolean z17 = wh.e.f527296a;
            synchronized (wh.e.class) {
                java.util.List list = wh.e.f527298c;
                if (((java.util.ArrayList) list).contains(hVar)) {
                    return;
                }
                ((java.util.ArrayList) list).add(hVar);
                if (!wh.e.f527296a && !((java.util.ArrayList) list).isEmpty()) {
                    oj.j.c("Matrix.battery.AlarmHooker", "checkHook hookRet:%b", java.lang.Boolean.valueOf(wh.e.f527297b.a()));
                    wh.e.f527296a = true;
                }
            }
        }
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        wh.c cVar = this.f476985d;
        boolean z17 = wh.e.f527296a;
        synchronized (wh.e.class) {
            if (cVar != null) {
                java.util.List list = wh.e.f527298c;
                ((java.util.ArrayList) list).remove(cVar);
                if (wh.e.f527296a && ((java.util.ArrayList) list).isEmpty()) {
                    oj.j.c("Matrix.battery.AlarmHooker", "checkUnHook unHookRet:%b", java.lang.Boolean.valueOf(wh.e.f527297b.b()));
                    wh.e.f527296a = false;
                }
            }
        }
        this.f476983b.removeCallbacksAndMessages(null);
        rh.l lVar = this.f476984c;
        lVar.f476972b = 0;
        lVar.f476973c = 0;
    }

    @Override // rh.a, rh.e3
    public void h(qh.f0 f0Var) {
        super.h(f0Var);
        this.f476983b = f0Var.f444870f;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.AlarmMonitorFeature";
    }
}

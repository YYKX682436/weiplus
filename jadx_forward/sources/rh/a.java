package rh;

/* loaded from: classes12.dex */
public abstract class a implements rh.e3 {

    /* renamed from: a, reason: collision with root package name */
    public qh.f0 f476827a;

    @Override // rh.e3
    public void a(boolean z17) {
        oj.j.c(i(), "#onForeground, foreground = " + z17, new java.lang.Object[0]);
    }

    @Override // rh.e3
    public void c() {
        oj.j.c(i(), "#onTurnOn", new java.lang.Object[0]);
    }

    @Override // rh.e3
    public void e() {
        oj.j.c(i(), "#onTurnOff", new java.lang.Object[0]);
    }

    @Override // rh.e3
    public void g(long j17) {
        oj.j.c(i(), "#onBackgroundCheck, since background started millis = " + j17, new java.lang.Object[0]);
    }

    @Override // rh.e3
    public void h(qh.f0 f0Var) {
        oj.j.c(i(), "#configure", new java.lang.Object[0]);
        this.f476827a = f0Var;
    }

    public java.lang.String i() {
        return "Matrix.battery.MonitorFeature";
    }

    public boolean j() {
        qh.f0 f0Var = this.f476827a;
        return f0Var.f444868d.f444833s || (f0Var.d().getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: toString */
    public java.lang.String m162364x9616526c() {
        return i();
    }
}

package kf1;

/* loaded from: classes15.dex */
public class k extends kf1.d {

    /* renamed from: m, reason: collision with root package name */
    public kf1.j f388722m = kf1.j.IDLE;

    @Override // kf1.a
    public void a() {
        super.a();
        kf1.j jVar = kf1.j.PAUSE;
        synchronized (this) {
            this.f388722m = jVar;
        }
    }

    @Override // kf1.a
    public void b() {
        super.b();
        kf1.j jVar = kf1.j.START;
        synchronized (this) {
            this.f388722m = jVar;
        }
    }

    @Override // kf1.a
    public void c(java.lang.String str, int i17, int i18) {
        super.c(str, i17, i18);
        kf1.j jVar = kf1.j.STOP;
        synchronized (this) {
            this.f388722m = jVar;
        }
    }

    @Override // kf1.d
    public synchronized jf1.c d() {
        if (this.f388722m.ordinal() == 1) {
            return super.d();
        }
        return new jf1.c("can not pause", new java.lang.Object[0]);
    }

    @Override // kf1.d
    public synchronized jf1.c e(kf1.g gVar) {
        if (this.f388722m.ordinal() == 0) {
            return super.e(gVar);
        }
        return new jf1.c("can not start", new java.lang.Object[0]);
    }

    @Override // kf1.d
    public synchronized jf1.c f() {
        int ordinal = this.f388722m.ordinal();
        boolean z17 = true;
        if (ordinal != 1 && ordinal != 2) {
            z17 = false;
        }
        if (z17) {
            return super.f();
        }
        return new jf1.c("can not stop", new java.lang.Object[0]);
    }

    @Override // kf1.d
    /* renamed from: release */
    public synchronized void mo142548x41012807() {
        super.mo142548x41012807();
        kf1.j jVar = kf1.j.IDLE;
        synchronized (this) {
            this.f388722m = jVar;
        }
    }
}

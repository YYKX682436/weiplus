package ju5;

/* loaded from: classes15.dex */
public class q0 extends ju5.d {

    /* renamed from: c, reason: collision with root package name */
    public final iu5.e f383675c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f383676d;

    public q0(iu5.e eVar, boolean z17) {
        this.f383675c = null;
        this.f383676d = false;
        this.f383675c = eVar;
        this.f383676d = z17;
    }

    @Override // ju5.f
    public void c() {
        h(zt5.j.a().f557137a, 1);
        ju5.o.a().c(new hu5.b(new hu5.c(1, "", this.f383676d, false, new ju5.o0(this), null)));
    }

    @Override // ju5.f
    public boolean d() {
        return true;
    }

    @Override // ju5.f
    public void f() {
        zt5.h.f("Soter.TaskPrepareAppSecureKey", "soter: cancelled prepare ask", new java.lang.Object[0]);
        wt5.a.r();
    }

    @Override // ju5.f
    public boolean g() {
        if (!fu5.d.b().d()) {
            zt5.h.f("Soter.TaskPrepareAppSecureKey", "soter: not initialized yet", new java.lang.Object[0]);
            b(new eu5.c(1008));
            return true;
        }
        if (!fu5.d.b().e()) {
            zt5.h.f("Soter.TaskPrepareAppSecureKey", "soter: not support soter", new java.lang.Object[0]);
            b(new eu5.c(2));
            return true;
        }
        if (!wt5.a.j() || this.f383676d) {
            if (this.f383675c == null) {
                zt5.h.f("Soter.TaskPrepareAppSecureKey", "soter: it is strongly recommended that you provide a net wrapper to check and upload ASK validation from server! Please make sure you upload it later", new java.lang.Object[0]);
            }
            return false;
        }
        zt5.h.c("Soter.TaskPrepareAppSecureKey", "soter: already has ask. do not need generate again", new java.lang.Object[0]);
        b(new eu5.c(0, wt5.a.c()));
        return true;
    }
}

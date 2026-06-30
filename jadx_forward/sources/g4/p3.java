package g4;

/* loaded from: classes5.dex */
public final class p3 implements g4.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g4.q3 f350023a;

    public p3(g4.q3 q3Var) {
        this.f350023a = q3Var;
    }

    public void a(int i17, int i18) {
        p012xc85e97e9.p098xc4a6178c.p099x38a77192.c cVar = (p012xc85e97e9.p098xc4a6178c.p099x38a77192.c) this.f350023a.f350053j;
        if (i18 > 0) {
            p012xc85e97e9.p098xc4a6178c.p099x38a77192.e.a(cVar.f93247a);
        } else {
            cVar.getClass();
        }
    }

    public void b(int i17, int i18) {
        p012xc85e97e9.p098xc4a6178c.p099x38a77192.c cVar = (p012xc85e97e9.p098xc4a6178c.p099x38a77192.c) this.f350023a.f350053j;
        if (i18 > 0) {
            p012xc85e97e9.p098xc4a6178c.p099x38a77192.e.a(cVar.f93247a);
        } else {
            cVar.getClass();
        }
    }

    public void c(int i17, int i18) {
        p012xc85e97e9.p098xc4a6178c.p099x38a77192.c cVar = (p012xc85e97e9.p098xc4a6178c.p099x38a77192.c) this.f350023a.f350053j;
        if (i18 > 0) {
            p012xc85e97e9.p098xc4a6178c.p099x38a77192.e.a(cVar.f93247a);
        } else {
            cVar.getClass();
        }
    }

    public void d(g4.a1 loadType, boolean z17, g4.y0 loadState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadType, "loadType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadState, "loadState");
        g4.q3 q3Var = this.f350023a;
        g4.e1 e1Var = q3Var.f350046c;
        e1Var.getClass();
        g4.z0 z0Var = z17 ? e1Var.f349798e : e1Var.f349797d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z0Var != null ? z0Var.b(loadType) : null, loadState)) {
            return;
        }
        q3Var.f350046c.b(loadType, z17, loadState);
        g4.a0 c17 = q3Var.f350046c.c();
        java.util.Iterator it = q3Var.f350047d.iterator();
        while (it.hasNext()) {
            ((yz5.l) it.next()).mo146xb9724478(c17);
        }
    }
}

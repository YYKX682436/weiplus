package p012xc85e97e9.p098xc4a6178c.p099x38a77192;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j f93249a;

    /* renamed from: b, reason: collision with root package name */
    public final n0.v2 f93250b;

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p098xc4a6178c.p099x38a77192.d f93251c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f93252d;

    public e(p3325xe03a0797.p3326xc267989b.p3328x30012e.j flow) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flow, "flow");
        this.f93249a = flow;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        this.f93250b = n0.s4.c(new g4.u0(0, 0, kz5.p0.f395529d), null, 2, null);
        this.f93251c = new p012xc85e97e9.p098xc4a6178c.p099x38a77192.d(this, new p012xc85e97e9.p098xc4a6178c.p099x38a77192.c(this), g3Var);
        g4.z0 z0Var = p012xc85e97e9.p098xc4a6178c.p099x38a77192.j.f93261a;
        this.f93252d = n0.s4.c(new g4.a0(z0Var.f350178a, z0Var.f350179b, z0Var.f350180c, z0Var, null, 16, null), null, 2, null);
    }

    public static final void a(p012xc85e97e9.p098xc4a6178c.p099x38a77192.e eVar) {
        g4.f3 f3Var = eVar.f93251c.f350044a;
        int i17 = f3Var.f349827c;
        int i18 = f3Var.f349828d;
        java.util.List list = f3Var.f349825a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, ((g4.x4) it.next()).f350153b);
        }
        ((n0.q4) eVar.f93250b).mo148714x53d8522f(new g4.u0(i17, i18, arrayList));
    }

    public final java.lang.Object b(int i17) {
        p012xc85e97e9.p098xc4a6178c.p099x38a77192.d dVar = this.f93251c;
        dVar.f350049f = true;
        dVar.f350050g = i17;
        g4.y4 y4Var = dVar.f350045b;
        if (y4Var != null) {
            y4Var.b(dVar.f350044a.a(i17));
        }
        g4.f3 f3Var = dVar.f350044a;
        if (i17 < 0) {
            f3Var.getClass();
        } else if (i17 < f3Var.d()) {
            int i18 = i17 - f3Var.f349827c;
            if (i18 >= 0 && i18 < f3Var.f349826b) {
                f3Var.c(i18);
            }
            return ((g4.u0) ((n0.q4) this.f93250b).mo128745x754a37bb()).get(i17);
        }
        throw new java.lang.IndexOutOfBoundsException("Index: " + i17 + ", Size: " + f3Var.d());
    }

    public final int c() {
        return ((g4.u0) ((n0.q4) this.f93250b).mo128745x754a37bb()).d();
    }

    public final g4.a0 d() {
        return (g4.a0) this.f93252d.mo128745x754a37bb();
    }
}

package dh2;

/* loaded from: classes10.dex */
public final class w implements ah2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dh2.x f313999a;

    public w(dh2.x xVar) {
        this.f313999a = xVar;
    }

    public int a() {
        return ((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) this.f313999a.f314001e.a(om2.e.class)).f427825h).mo144003x754a37bb()).intValue();
    }

    public int b() {
        return ((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) this.f313999a.f314001e.a(om2.e.class)).f427824g).mo144003x754a37bb()).intValue();
    }

    public boolean c() {
        dh2.x xVar = this.f313999a;
        return ((mm2.c1) xVar.f314001e.a(mm2.c1.class)).O4 || ((mm2.o4) xVar.f314001e.a(mm2.o4.class)).C7();
    }

    public boolean d() {
        dh2.x xVar = this.f313999a;
        int ordinal = xVar.f314005i.ordinal();
        if (ordinal == 0) {
            return ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) xVar.f314001e.a(om2.e.class)).f427823f).mo144003x754a37bb()).booleanValue();
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        mm2.m6 m6Var = (mm2.m6) xVar.f314001e.a(mm2.m6.class);
        java.lang.Object mo144003x754a37bb = ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) m6Var.f410784s).mo144003x754a37bb();
        mm2.i6 i6Var = mo144003x754a37bb instanceof mm2.i6 ? (mm2.i6) mo144003x754a37bb : null;
        return ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) m6Var.f410789x).mo144003x754a37bb()).booleanValue() && (i6Var != null ? i6Var.f410676c : true);
    }
}

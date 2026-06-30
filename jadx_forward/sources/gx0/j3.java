package gx0;

/* loaded from: classes5.dex */
public final class j3 implements fy0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.y3 f358100a;

    public j3(gx0.y3 y3Var) {
        this.f358100a = y3Var;
    }

    @Override // fy0.b
    public void a(double d17, fy0.q source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        gx0.y3 y3Var = this.f358100a;
        ex0.a0 A7 = y3Var.A7();
        if (A7 == null) {
            return;
        }
        int ordinal = source.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            p3325xe03a0797.p3326xc267989b.l.d(y3Var.m158345xefc66565(), null, null, new gx0.h3(this.f358100a, d17, A7, null), 3, null);
        } else {
            if (ordinal != 3) {
                return;
            }
            p3325xe03a0797.p3326xc267989b.l.d(y3Var.m158345xefc66565(), null, null, new gx0.i3(d17, A7, this.f358100a, null), 3, null);
        }
    }
}

package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class w2 extends p3325xe03a0797.p3326xc267989b.g0 implements p3325xe03a0797.p3326xc267989b.s1, p3325xe03a0797.p3326xc267989b.k2 {

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.c3 f392223g;

    @Override // p3325xe03a0797.p3326xc267989b.k2
    public boolean a() {
        return true;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t, p3325xe03a0797.p3326xc267989b.s1
    /* renamed from: dispose */
    public void mo144008x63a5261f() {
        boolean z17;
        p3325xe03a0797.p3326xc267989b.c3 w17 = w();
        do {
            java.lang.Object P = w17.P();
            if (!(P instanceof p3325xe03a0797.p3326xc267989b.w2)) {
                if (!(P instanceof p3325xe03a0797.p3326xc267989b.k2) || ((p3325xe03a0797.p3326xc267989b.k2) P).f() == null) {
                    return;
                }
                q();
                return;
            }
            if (P != this) {
                return;
            }
            p3325xe03a0797.p3326xc267989b.v1 v1Var = p3325xe03a0797.p3326xc267989b.d3.f391700g;
            while (true) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p3325xe03a0797.p3326xc267989b.c3.f391682d;
                if (atomicReferenceFieldUpdater.compareAndSet(w17, P, v1Var)) {
                    z17 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(w17) != P) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
    }

    @Override // p3325xe03a0797.p3326xc267989b.k2
    public p3325xe03a0797.p3326xc267989b.h3 f() {
        return null;
    }

    /* renamed from: getParent */
    public p3325xe03a0797.p3326xc267989b.r2 m144123x29c22ba0() {
        return w();
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t
    /* renamed from: toString */
    public java.lang.String mo144017x9616526c() {
        return getClass().getSimpleName() + '@' + p3325xe03a0797.p3326xc267989b.c1.a(this) + "[job@" + p3325xe03a0797.p3326xc267989b.c1.a(w()) + ']';
    }

    public final p3325xe03a0797.p3326xc267989b.c3 w() {
        p3325xe03a0797.p3326xc267989b.c3 c3Var = this.f392223g;
        if (c3Var != null) {
            return c3Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("job");
        throw null;
    }
}

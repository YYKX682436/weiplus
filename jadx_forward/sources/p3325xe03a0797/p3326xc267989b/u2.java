package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public class u2 extends p3325xe03a0797.p3326xc267989b.c3 implements p3325xe03a0797.p3326xc267989b.c0 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f392214e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(p3325xe03a0797.p3326xc267989b.r2 r2Var) {
        super(true);
        boolean z17 = true;
        S(r2Var);
        p3325xe03a0797.p3326xc267989b.w O = O();
        p3325xe03a0797.p3326xc267989b.x xVar = O instanceof p3325xe03a0797.p3326xc267989b.x ? (p3325xe03a0797.p3326xc267989b.x) O : null;
        if (xVar != null) {
            p3325xe03a0797.p3326xc267989b.c3 w17 = xVar.w();
            while (!w17.L()) {
                p3325xe03a0797.p3326xc267989b.w O2 = w17.O();
                p3325xe03a0797.p3326xc267989b.x xVar2 = O2 instanceof p3325xe03a0797.p3326xc267989b.x ? (p3325xe03a0797.p3326xc267989b.x) O2 : null;
                if (xVar2 != null) {
                    w17 = xVar2.w();
                }
            }
            this.f392214e = z17;
        }
        z17 = false;
        this.f392214e = z17;
    }

    @Override // p3325xe03a0797.p3326xc267989b.c3
    public boolean L() {
        return this.f392214e;
    }

    @Override // p3325xe03a0797.p3326xc267989b.c3
    public boolean M() {
        return true;
    }
}

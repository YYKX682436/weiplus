package mm1;

/* loaded from: classes3.dex */
public final class o extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 implements jm4.i1 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f410216e;

    /* renamed from: d, reason: collision with root package name */
    public static final mm1.o f410215d = new mm1.o();

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f410217f = true;

    @Override // jm4.i1
    public void Dd(long j17, yz5.a aVar) {
        if (f410217f) {
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } else {
            try {
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), null, null, new mm1.n(j17, aVar, null), 3, null);
            } catch (p3325xe03a0797.p3326xc267989b.x3 unused) {
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
            }
        }
    }

    @Override // jm4.i1
    public void o2(boolean z17) {
        f410217f = z17;
    }

    @Override // jm4.i1
    public boolean yd() {
        return f410217f;
    }
}

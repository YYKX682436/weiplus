package gr5;

/* loaded from: classes15.dex */
public final class l implements gr5.n {
    @Override // gr5.n
    public long a(long j17, long j18) {
        if (zq5.t.b(j17) <= zq5.t.b(j18) && zq5.t.a(j17) <= zq5.t.a(j18)) {
            return zq5.s.a(1.0f, 1.0f);
        }
        float min = java.lang.Math.min(zq5.t.b(j18) / zq5.t.b(j17), zq5.t.a(j18) / zq5.t.a(j17));
        return zq5.s.a(min, min);
    }
}

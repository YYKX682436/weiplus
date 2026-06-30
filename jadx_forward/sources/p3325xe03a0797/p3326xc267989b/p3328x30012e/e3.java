package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes10.dex */
public final class e3 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.w2 {

    /* renamed from: b, reason: collision with root package name */
    public final long f391776b;

    /* renamed from: c, reason: collision with root package name */
    public final long f391777c;

    public e3(long j17, long j18) {
        this.f391776b = j17;
        this.f391777c = j18;
        if (!(j17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("stopTimeout(" + j17 + " ms) cannot be negative").toString());
        }
        if (j18 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("replayExpiration(" + j18 + " ms) cannot be negative").toString());
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.w2
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.c3 c3Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.c3(this, null);
        int i17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i1.f391828a;
        return p3325xe03a0797.p3326xc267989b.p3328x30012e.l.i(new p3325xe03a0797.p3326xc267989b.p3328x30012e.s0(new v26.t(c3Var, f3Var, oz5.m.f431862d, -2, u26.u.SUSPEND), new p3325xe03a0797.p3326xc267989b.p3328x30012e.d3(null)));
    }

    /* renamed from: equals */
    public boolean m143999xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p3325xe03a0797.p3326xc267989b.p3328x30012e.e3) {
            p3325xe03a0797.p3326xc267989b.p3328x30012e.e3 e3Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.e3) obj;
            if (this.f391776b == e3Var.f391776b && this.f391777c == e3Var.f391777c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m144000x8cdac1b() {
        return (java.lang.Long.hashCode(this.f391776b) * 31) + java.lang.Long.hashCode(this.f391777c);
    }

    /* renamed from: toString */
    public java.lang.String m144001x9616526c() {
        lz5.e eVar = new lz5.e(2);
        long j17 = this.f391776b;
        if (j17 > 0) {
            eVar.add("stopTimeout=" + j17 + "ms");
        }
        long j18 = this.f391777c;
        if (j18 < com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            eVar.add("replayExpiration=" + j18 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + kz5.n0.g0(kz5.b0.a(eVar), null, null, null, 0, null, null, 63, null) + ')';
    }
}

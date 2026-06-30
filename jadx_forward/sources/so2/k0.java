package so2;

/* loaded from: classes2.dex */
public final class k0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f491985d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f491985d = draftItem;
    }

    public final long a() {
        java.lang.Long l17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f491985d;
        if (x80Var.u0()) {
            ni0.h hVar = x80Var.M;
            return ((hVar == null || (l17 = hVar.f418757b) == null) ? c01.id.a() : l17.longValue()) / 1000;
        }
        long m59220x3fdd41df = x80Var.t0().m59220x3fdd41df();
        return m59220x3fdd41df <= 0 ? x80Var.f66231xac3be4e : m59220x3fdd41df;
    }

    public final java.lang.String b() {
        r45.ef2 m76971x25b90ced;
        boolean c17 = c();
        r45.hf2 hf2Var = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f491985d;
        if (!c17) {
            if (x80Var.u0()) {
                ni0.h hVar = x80Var.M;
                if (hVar != null) {
                    return hVar.f418758c;
                }
                return null;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = x80Var.t0().getFeedObject().m76802x2dd01666();
            if (m76802x2dd01666 != null) {
                return m76802x2dd01666.m76944x730bcac6();
            }
            return null;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = x80Var.t0().getFeedObject().m76802x2dd01666();
        if (m76802x2dd016662 != null && (m76971x25b90ced = m76802x2dd016662.m76971x25b90ced()) != null) {
            hf2Var = (r45.hf2) m76971x25b90ced.m75936x14adae67(1);
        }
        if (hf2Var == null) {
            return "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hf2Var.m75945x2fec8307(1))) {
            java.lang.String m75945x2fec8307 = hf2Var.m75945x2fec8307(0);
            return m75945x2fec8307 == null ? "" : m75945x2fec8307;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hf2Var.m75945x2fec8307(0))) {
            return java.lang.String.valueOf(hf2Var.m75945x2fec8307(1));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String m75945x2fec83072 = hf2Var.m75945x2fec8307(0);
        sb6.append(m75945x2fec83072 != null ? m75945x2fec83072 : "");
        sb6.append('-');
        sb6.append(hf2Var.m75945x2fec8307(1));
        return sb6.toString();
    }

    public final boolean c() {
        return this.f491985d.f66239xf8be237e == 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        so2.k0 k0Var = obj instanceof so2.k0 ? (so2.k0) obj : null;
        if (k0Var == null) {
            return -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = k0Var.f491985d;
        long j17 = x80Var.f66236x88be67a1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var2 = this.f491985d;
        if (j17 > 0) {
            long j18 = x80Var2.f66236x88be67a1;
            if (j18 > 0 && j17 == j18) {
                return 0;
            }
        }
        long j19 = x80Var2.f66238x2327e25f;
        if (j19 == 0) {
            return -1;
        }
        long j27 = x80Var.f66238x2327e25f;
        return (j27 == 0 || j19 != j27) ? -1 : 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f491985d;
        long j17 = x80Var.f66236x88be67a1;
        return j17 != 0 ? j17 : x80Var.f66238x2327e25f;
    }

    @Override // in5.c
    public int h() {
        return this.f491985d.f66239xf8be237e;
    }
}

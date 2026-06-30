package so2;

/* loaded from: classes.dex */
public final class w2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final int f492222d;

    /* renamed from: e, reason: collision with root package name */
    public final long f492223e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.a82 f492224f;

    public w2(int i17, long j17, r45.a82 wecoinHotInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wecoinHotInfo, "wecoinHotInfo");
        this.f492222d = i17;
        this.f492223e = j17;
        this.f492224f = wecoinHotInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        java.lang.String str = null;
        r45.pe2 pe2Var = obj instanceof r45.pe2 ? (r45.pe2) obj : null;
        if (pe2Var != null) {
            java.lang.String m75945x2fec8307 = pe2Var.m75945x2fec8307(0);
            r45.xn1 xn1Var = (r45.xn1) this.f492224f.m75936x14adae67(0);
            if (xn1Var != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null) {
                str = c19782x23db1cfa.m76197x6c03c64c();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(m75945x2fec8307, str)) {
                return 0;
            }
        }
        return -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.w2.class.hashCode();
    }
}

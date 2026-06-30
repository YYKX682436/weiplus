package db2;

/* loaded from: classes2.dex */
public final class y5 extends az2.u implements db2.d5 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f309779g;

    /* renamed from: h, reason: collision with root package name */
    public final int f309780h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f309781i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f309782m;

    /* renamed from: n, reason: collision with root package name */
    public final int f309783n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f309784o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309785p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309786q;

    /* renamed from: r, reason: collision with root package name */
    public r45.tu2 f309787r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y5(java.lang.String r17, int r18, java.lang.String r19, com.p314xaae8f345.mm.p2495xc50a8b8b.g r20, int r21, r45.qt2 r22, com.p314xaae8f345.mm.p2495xc50a8b8b.g r23, com.p314xaae8f345.mm.p2495xc50a8b8b.g r24, com.p314xaae8f345.mm.p2495xc50a8b8b.g r25, com.p314xaae8f345.mm.p2495xc50a8b8b.g r26, boolean r27, int r28, p3321xbce91901.jvm.p3324x21ffc6bd.i r29) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.y5.<init>(java.lang.String, int, java.lang.String, com.tencent.mm.protobuf.g, int, r45.qt2, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309784o, "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309785p.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchResponse");
        this.f309787r = (r45.tu2) fVar;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309786q;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        r45.qt2 qt2Var = this.f97687d;
        if (qt2Var != null) {
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = this.f309787r.m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObjectList(...)");
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
                if (c19792x256d2725.m76829x97edf6c0() != null) {
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(c19792x256d2725, qt2Var.m75939xb282bd08(5), null);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309786q = u0Var;
        return mo9409x10f9447a(sVar, this.f309785p, this);
    }

    /* renamed from: equals */
    public boolean m123854xb2c87fbf(java.lang.Object obj) {
        return m123855x8cdac1b() == (obj != null ? obj.hashCode() : 0);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3820;
    }

    /* renamed from: hashCode */
    public int m123855x8cdac1b() {
        return (this.f309779g + '_' + this.f309780h + '_' + this.f309781i + '_' + this.f309782m + '_' + this.f309783n).hashCode();
    }
}

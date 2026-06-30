package bq;

/* loaded from: classes2.dex */
public final class o1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f105035o;

    /* renamed from: p, reason: collision with root package name */
    public final int f105036p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f105037q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f105038r;

    /* renamed from: s, reason: collision with root package name */
    public final int f105039s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f105040t;

    /* renamed from: u, reason: collision with root package name */
    public final int f105041u;

    /* renamed from: v, reason: collision with root package name */
    public int f105042v;

    /* renamed from: w, reason: collision with root package name */
    public r45.lu2 f105043w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f105044x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o1(java.lang.String r17, int r18, java.lang.String r19, com.p314xaae8f345.mm.p2495xc50a8b8b.g r20, int r21, r45.qt2 r22, com.p314xaae8f345.mm.p2495xc50a8b8b.g r23, com.p314xaae8f345.mm.p2495xc50a8b8b.g r24, com.p314xaae8f345.mm.p2495xc50a8b8b.g r25, com.p314xaae8f345.mm.p2495xc50a8b8b.g r26, boolean r27, int r28, int r29, p3321xbce91901.jvm.p3324x21ffc6bd.i r30) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.o1.<init>(java.lang.String, int, java.lang.String, com.tencent.mm.protobuf.g, int, r45.qt2, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, boolean, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914;
        r45.tu2 resp = (r45.tu2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSearchCGI", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        r45.qt2 qt2Var = this.f105016m;
        if (qt2Var == null || (m75941xfb821914 = resp.m75941xfb821914(4)) == null) {
            return;
        }
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
            if (c19792x256d2725.m76829x97edf6c0() != null) {
                ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Fj(c19792x256d2725, qt2Var.m75939xb282bd08(5));
            }
        }
    }

    public final java.lang.String t() {
        return this.f105035o + '_' + this.f105036p + '_' + this.f105037q + '_' + this.f105038r + '_' + this.f105039s;
    }
}

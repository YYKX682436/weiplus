package bq;

/* loaded from: classes2.dex */
public final class o1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f23502o;

    /* renamed from: p, reason: collision with root package name */
    public final int f23503p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f23504q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f23505r;

    /* renamed from: s, reason: collision with root package name */
    public final int f23506s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f23507t;

    /* renamed from: u, reason: collision with root package name */
    public final int f23508u;

    /* renamed from: v, reason: collision with root package name */
    public int f23509v;

    /* renamed from: w, reason: collision with root package name */
    public r45.lu2 f23510w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f23511x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o1(java.lang.String r17, int r18, java.lang.String r19, com.tencent.mm.protobuf.g r20, int r21, r45.qt2 r22, com.tencent.mm.protobuf.g r23, com.tencent.mm.protobuf.g r24, com.tencent.mm.protobuf.g r25, com.tencent.mm.protobuf.g r26, boolean r27, int r28, int r29, kotlin.jvm.internal.i r30) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.o1.<init>(java.lang.String, int, java.lang.String, com.tencent.mm.protobuf.g, int, r45.qt2, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, boolean, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list;
        r45.tu2 resp = (r45.tu2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderSearchCGI", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        r45.qt2 qt2Var = this.f23483m;
        if (qt2Var == null || (list = resp.getList(4)) == null) {
            return;
        }
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            if (finderObject.getSessionBuffer() != null) {
                ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Fj(finderObject, qt2Var.getInteger(5));
            }
        }
    }

    public final java.lang.String t() {
        return this.f23502o + '_' + this.f23503p + '_' + this.f23504q + '_' + this.f23505r + '_' + this.f23506s;
    }
}

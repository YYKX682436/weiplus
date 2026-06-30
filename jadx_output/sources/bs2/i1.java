package bs2;

/* loaded from: classes2.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f23865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ey2.i2 f23866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23867f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(kotlin.jvm.internal.h0 h0Var, ey2.i2 i2Var, bs2.n1 n1Var) {
        super(1);
        this.f23865d = h0Var;
        this.f23866e = i2Var;
        this.f23867f = n1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            com.tencent.mm.protocal.protobuf.FinderObject r10 = (com.tencent.mm.protocal.protobuf.FinderObject) r10
            kotlin.jvm.internal.h0 r0 = r9.f23865d
            java.lang.Object r1 = r0.f310123d
            db2.c3 r1 = (db2.c3) r1
            r2 = 1
            r3 = 12
            r4 = 0
            if (r1 == 0) goto L20
            db2.b3 r1 = r1.d()
            long r5 = r10.getId()
            long r7 = r1.getLong(r3)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L20
            r1 = r2
            goto L21
        L20:
            r1 = r4
        L21:
            if (r1 != 0) goto L30
            ey2.i2 r1 = r9.f23866e
            long r5 = r10.getId()
            boolean r1 = r1.O6(r5)
            if (r1 == 0) goto L30
            goto L31
        L30:
            r2 = r4
        L31:
            if (r2 == 0) goto L6d
            bs2.n1 r1 = r9.f23867f
            java.lang.String r1 = r1.f23909c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "requestCache: remove read feed, id = "
            r4.<init>(r5)
            long r5 = r10.getId()
            java.lang.String r10 = pm0.v.u(r5)
            r4.append(r10)
            java.lang.String r10 = " tabTipsObjectId="
            r4.append(r10)
            java.lang.Object r10 = r0.f310123d
            db2.c3 r10 = (db2.c3) r10
            if (r10 == 0) goto L5d
            db2.b3 r10 = r10.d()
            long r5 = r10.getLong(r3)
            goto L5f
        L5d:
            r5 = 0
        L5f:
            java.lang.String r10 = pm0.v.u(r5)
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            com.tencent.mars.xlog.Log.i(r1, r10)
        L6d:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bs2.i1.invoke(java.lang.Object):java.lang.Object");
    }
}

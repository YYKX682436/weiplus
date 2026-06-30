package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes7.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.r1 f276765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.p314xaae8f345.mm.p2621x8fb0427b.r1 r1Var) {
        super(0);
        this.f276765d = r1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        if (r7 != null) goto L14;
     */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r10 = this;
            long r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()
            r2 = 2592000(0x278d00, float:3.632166E-39)
            long r2 = (long) r2
            long r0 = r0 - r2
            com.tencent.mm.storage.r1 r2 = r10.f276765d
            r2.getClass()
            p75.n0 r3 = dm.k1.f319483o
            r3.getClass()
            p75.d r4 = dm.k1.f319485q
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            p75.m0 r4 = r4.x(r5)
            boolean r5 = r3 instanceof p75.z
            if (r5 != 0) goto L98
            java.lang.String r3 = r3.b()
            p75.h r4 = (p75.h) r4
            java.lang.String r5 = r4.b()
            java.lang.String[] r4 = r4.e()
            java.lang.String r6 = "table"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "deleteLastModifiedEarlierThan, sql: "
            r6.<init>(r7)
            if (r5 == 0) goto L53
            boolean r7 = r26.n0.N(r5)
            r7 = r7 ^ 1
            if (r7 == 0) goto L48
            r7 = r5
            goto L49
        L48:
            r7 = 0
        L49:
            if (r7 == 0) goto L53
            java.lang.String r7 = " WHERE "
            java.lang.String r7 = r7.concat(r5)
            if (r7 != 0) goto L55
        L53:
            java.lang.String r7 = ""
        L55:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "DELETE FROM "
            r8.<init>(r9)
            r8.append(r3)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.append(r7)
            java.lang.String r7 = ", timeMs: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "MicroMsg.BizScreenshotInfoStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            l75.k0 r0 = r2.f276796d
            if (r0 == 0) goto L83
            int r0 = r0.mo70514xb06685ab(r3, r5, r4)
            goto L84
        L83:
            r0 = -1
        L84:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "deleteAllExpired, deleteCount: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        L98:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Not support multi table delete"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.q1.mo152xb9724478():java.lang.Object");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class ea {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f189366d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f189367e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f189368f;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f189369a;

    /* renamed from: b, reason: collision with root package name */
    public long f189370b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f189371c = new java.util.concurrent.ConcurrentHashMap();

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ca(null);
        f189366d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ba.f189273d);
        f189367e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.aa.f189239d);
        f189368f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.z9.f190054d);
    }

    public static /* synthetic */ void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea eaVar, long j17, java.lang.String str, r45.qt2 qt2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, yz5.l lVar, int i17, java.lang.Object obj) {
        eaVar.a(j17, str, (i17 & 4) != 0 ? null : qt2Var, (i17 & 8) != 0 ? null : gVar, (i17 & 16) != 0 ? null : gVar2, (i17 & 32) != 0 ? null : lVar);
    }

    public final void a(long j17, java.lang.String str, r45.qt2 qt2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, yz5.l lVar) {
        if (this.f189370b == j17) {
            ot5.g.c("MicroMsg.MegaVideoAutoPlayLoader", "try fetchAutoPlayFeed, itemId:" + j17 + " call back with cache");
            r45.aa1 aa1Var = (r45.aa1) this.f189371c.get(java.lang.Long.valueOf(j17));
            if (aa1Var == null || lVar == null) {
                return;
            }
            lVar.mo146xb9724478(aa1Var);
            return;
        }
        ot5.g.c("MicroMsg.MegaVideoAutoPlayLoader", "try fetchAutoPlayFeed, itemId:" + j17);
        this.f189370b = j17;
        r45.z91 z91Var = new r45.z91();
        db2.t4 t4Var = db2.t4.f309704a;
        z91Var.set(1, t4Var.b(3688, qt2Var));
        if (gVar == null) {
            gVar = this.f189369a;
        }
        z91Var.set(2, gVar);
        z91Var.set(9, 47);
        z91Var.set(3, java.lang.Long.valueOf(j17));
        z91Var.set(7, str);
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        java.lang.Object obj = P6.f384366d;
        if (!(((java.lang.Number) obj).floatValue() == 0.0f)) {
            z91Var.set(5, java.lang.Float.valueOf(((java.lang.Number) obj).floatValue()));
        }
        java.lang.Object obj2 = P6.f384367e;
        if (!(((java.lang.Number) obj2).floatValue() == 0.0f)) {
            z91Var.set(6, java.lang.Float.valueOf(((java.lang.Number) obj2).floatValue()));
        }
        z91Var.set(14, t4Var.n());
        z91Var.set(33, gVar2);
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152197a = z91Var;
        lVar2.f152198b = new r45.aa1();
        lVar2.f152199c = "/cgi-bin/micromsg-bin/findergetrelatedlist";
        lVar2.f152200d = 3688;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar2.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.da(this, j17, lVar), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c(long r9) {
        /*
            r8 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r8.f189371c
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            java.lang.Object r0 = r0.get(r1)
            r45.aa1 r0 = (r45.aa1) r0
            r1 = 0
            if (r0 == 0) goto L6d
            r2 = 1
            java.util.LinkedList r0 = r0.m75941xfb821914(r2)
            if (r0 == 0) goto L6d
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.tencent.mm.protocal.protobuf.FinderObject r4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) r4
            long r5 = r4.m76784x5db1b11()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L68
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r4.m76802x2dd01666()
            r7 = 4
            if (r5 == 0) goto L3f
            int r5 = r5.m76964x7f025288()
            if (r5 != r7) goto L3f
            r5 = r2
            goto L40
        L3f:
            r5 = r6
        L40:
            if (r5 != 0) goto L64
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.m76802x2dd01666()
            if (r4 == 0) goto L5e
            java.util.LinkedList r4 = r4.m76962x74cd162e()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = kz5.n0.Z(r4)
            com.tencent.mm.protocal.protobuf.FinderMedia r4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) r4
            if (r4 == 0) goto L5e
            int r4 = r4.m76613x7f025288()
            if (r4 != r7) goto L5e
            r4 = r2
            goto L5f
        L5e:
            r4 = r6
        L5f:
            if (r4 == 0) goto L62
            goto L64
        L62:
            r4 = r6
            goto L65
        L64:
            r4 = r2
        L65:
            if (r4 == 0) goto L68
            r6 = r2
        L68:
            if (r6 == 0) goto L1a
            r1 = r3
        L6b:
            com.tencent.mm.protocal.protobuf.FinderObject r1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) r1
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea.c(long):com.tencent.mm.protocal.protobuf.FinderObject");
    }
}

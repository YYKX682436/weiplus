package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class ea {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f107833d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f107834e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f107835f;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f107836a;

    /* renamed from: b, reason: collision with root package name */
    public long f107837b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f107838c = new java.util.concurrent.ConcurrentHashMap();

    static {
        new com.tencent.mm.plugin.finder.feed.model.ca(null);
        f107833d = jz5.h.b(com.tencent.mm.plugin.finder.feed.model.ba.f107740d);
        f107834e = jz5.h.b(com.tencent.mm.plugin.finder.feed.model.aa.f107706d);
        f107835f = jz5.h.b(com.tencent.mm.plugin.finder.feed.model.z9.f108521d);
    }

    public static /* synthetic */ void b(com.tencent.mm.plugin.finder.feed.model.ea eaVar, long j17, java.lang.String str, r45.qt2 qt2Var, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, yz5.l lVar, int i17, java.lang.Object obj) {
        eaVar.a(j17, str, (i17 & 4) != 0 ? null : qt2Var, (i17 & 8) != 0 ? null : gVar, (i17 & 16) != 0 ? null : gVar2, (i17 & 32) != 0 ? null : lVar);
    }

    public final void a(long j17, java.lang.String str, r45.qt2 qt2Var, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, yz5.l lVar) {
        if (this.f107837b == j17) {
            ot5.g.c("MicroMsg.MegaVideoAutoPlayLoader", "try fetchAutoPlayFeed, itemId:" + j17 + " call back with cache");
            r45.aa1 aa1Var = (r45.aa1) this.f107838c.get(java.lang.Long.valueOf(j17));
            if (aa1Var == null || lVar == null) {
                return;
            }
            lVar.invoke(aa1Var);
            return;
        }
        ot5.g.c("MicroMsg.MegaVideoAutoPlayLoader", "try fetchAutoPlayFeed, itemId:" + j17);
        this.f107837b = j17;
        r45.z91 z91Var = new r45.z91();
        db2.t4 t4Var = db2.t4.f228171a;
        z91Var.set(1, t4Var.b(3688, qt2Var));
        if (gVar == null) {
            gVar = this.f107836a;
        }
        z91Var.set(2, gVar);
        z91Var.set(9, 47);
        z91Var.set(3, java.lang.Long.valueOf(j17));
        z91Var.set(7, str);
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        java.lang.Object obj = P6.f302833d;
        if (!(((java.lang.Number) obj).floatValue() == 0.0f)) {
            z91Var.set(5, java.lang.Float.valueOf(((java.lang.Number) obj).floatValue()));
        }
        java.lang.Object obj2 = P6.f302834e;
        if (!(((java.lang.Number) obj2).floatValue() == 0.0f)) {
            z91Var.set(6, java.lang.Float.valueOf(((java.lang.Number) obj2).floatValue()));
        }
        z91Var.set(14, t4Var.n());
        z91Var.set(33, gVar2);
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70664a = z91Var;
        lVar2.f70665b = new r45.aa1();
        lVar2.f70666c = "/cgi-bin/micromsg-bin/findergetrelatedlist";
        lVar2.f70667d = 3688;
        com.tencent.mm.modelbase.z2.d(lVar2.a(), new com.tencent.mm.plugin.finder.feed.model.da(this, j17, lVar), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.protocal.protobuf.FinderObject c(long r9) {
        /*
            r8 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r8.f107838c
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            java.lang.Object r0 = r0.get(r1)
            r45.aa1 r0 = (r45.aa1) r0
            r1 = 0
            if (r0 == 0) goto L6d
            r2 = 1
            java.util.LinkedList r0 = r0.getList(r2)
            if (r0 == 0) goto L6d
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.tencent.mm.protocal.protobuf.FinderObject r4 = (com.tencent.mm.protocal.protobuf.FinderObject) r4
            long r5 = r4.getId()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L68
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r4.getObjectDesc()
            r7 = 4
            if (r5 == 0) goto L3f
            int r5 = r5.getMediaType()
            if (r5 != r7) goto L3f
            r5 = r2
            goto L40
        L3f:
            r5 = r6
        L40:
            if (r5 != 0) goto L64
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.getObjectDesc()
            if (r4 == 0) goto L5e
            java.util.LinkedList r4 = r4.getMedia()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = kz5.n0.Z(r4)
            com.tencent.mm.protocal.protobuf.FinderMedia r4 = (com.tencent.mm.protocal.protobuf.FinderMedia) r4
            if (r4 == 0) goto L5e
            int r4 = r4.getMediaType()
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
            com.tencent.mm.protocal.protobuf.FinderObject r1 = (com.tencent.mm.protocal.protobuf.FinderObject) r1
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.ea.c(long):com.tencent.mm.protocal.protobuf.FinderObject");
    }
}

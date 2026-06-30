package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class u5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.z5 f66959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f66960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v65.n f66961c;

    public u5(com.tencent.mm.feature.finder.live.z5 z5Var, long j17, v65.n nVar) {
        this.f66959a = z5Var;
        this.f66960b = j17;
        this.f66961c = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.tencent.mm.protobuf.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // gm5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call(java.lang.Object r9) {
        /*
            r8 = this;
            com.tencent.mm.modelbase.f r9 = (com.tencent.mm.modelbase.f) r9
            r0 = 1
            r1 = 0
            if (r9 == 0) goto Lc
            int r2 = r9.f70615a
            if (r2 != 0) goto Lc
            r2 = r0
            goto Ld
        Lc:
            r2 = r1
        Ld:
            long r3 = r8.f66960b
            java.lang.String r5 = "get carouselInfo for product "
            com.tencent.mm.feature.finder.live.z5 r6 = r8.f66959a
            r7 = 0
            if (r2 == 0) goto L64
            int r2 = r9.f70616b
            if (r2 != 0) goto L64
            r45.s42 r2 = new r45.s42
            r2.<init>()
            com.tencent.mm.protobuf.f r9 = r9.f70618d
            r45.nd2 r9 = (r45.nd2) r9
            com.tencent.mm.protobuf.g r9 = r9.getByteString(r0)
            if (r9 == 0) goto L2e
            byte[] r9 = r9.g()
            goto L2f
        L2e:
            r9 = r7
        L2f:
            if (r9 != 0) goto L32
            goto L42
        L32:
            r2.parseFrom(r9)     // Catch: java.lang.Exception -> L36
            goto L43
        L36:
            r9 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r0 = "safeParser"
            java.lang.String r2 = ""
            com.tencent.mm.sdk.platformtools.Log.a(r0, r2, r9)
        L42:
            r2 = r7
        L43:
            java.lang.String r9 = r6.f67057d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r3)
            java.lang.String r3 = ", items = "
            r0.append(r3)
            if (r2 == 0) goto L58
            java.util.LinkedList r7 = r2.getList(r1)
        L58:
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r9, r0)
            r7 = r2
            goto L89
        L64:
            java.lang.String r0 = r6.f67057d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r3)
            java.lang.String r2 = " failed, errtype = "
            r1.append(r2)
            int r2 = r9.f70615a
            r1.append(r2)
            java.lang.String r2 = ", errcode = "
            r1.append(r2)
            int r9 = r9.f70616b
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.tencent.mars.xlog.Log.e(r0, r9)
        L89:
            v65.n r9 = r8.f66961c
            r9.a(r7)
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.u5.call(java.lang.Object):java.lang.Object");
    }
}

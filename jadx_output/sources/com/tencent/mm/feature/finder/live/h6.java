package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class h6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f66751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f66752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.t6 f66753f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.feature.finder.live.t6 t6Var) {
        super(2, continuation);
        this.f66751d = hVar;
        this.f66752e = h0Var;
        this.f66753f = t6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.finder.live.h6(this.f66751d, continuation, this.f66752e, this.f66753f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.feature.finder.live.h6 h6Var = (com.tencent.mm.feature.finder.live.h6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            pz5.a r0 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r4)
            xg2.h r4 = r3.f66751d
            xg2.i r4 = (xg2.i) r4
            java.lang.Object r4 = r4.f454393b
            r45.nd2 r4 = (r45.nd2) r4
            r45.t51 r0 = new r45.t51
            r0.<init>()
            r1 = 1
            com.tencent.mm.protobuf.g r4 = r4.getByteString(r1)
            r1 = 0
            if (r4 == 0) goto L1f
            byte[] r4 = r4.g()
            goto L20
        L1f:
            r4 = r1
        L20:
            java.lang.String r2 = ""
            if (r4 != 0) goto L26
        L24:
            r0 = r1
            goto L35
        L26:
            r0.parseFrom(r4)     // Catch: java.lang.Exception -> L2a
            goto L35
        L2a:
            r4 = move-exception
            java.lang.String r0 = "safeParser"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            com.tencent.mm.sdk.platformtools.Log.a(r0, r2, r4)
            goto L24
        L35:
            if (r0 == 0) goto L3c
            r4 = 0
            java.lang.String r1 = r0.getString(r4)
        L3c:
            if (r1 != 0) goto L3f
            goto L40
        L3f:
            r2 = r1
        L40:
            kotlin.jvm.internal.h0 r4 = r3.f66752e
            r4.f310123d = r2
            com.tencent.mm.feature.finder.live.t6 r0 = r3.f66753f
            java.lang.String r0 = r0.f66944d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getEcSource result:"
            r1.<init>(r2)
            java.lang.Object r4 = r4.f310123d
            java.lang.String r4 = (java.lang.String) r4
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r4)
            jz5.f0 r4 = jz5.f0.f302826a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.h6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class i8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f101172d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f101173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101175g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y8 f101176h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101177i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f101178m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.fav.ui.y8 y8Var, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f101174f = str;
        this.f101175g = str2;
        this.f101176h = y8Var;
        this.f101177i = i17;
        this.f101178m = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.fav.ui.i8 i8Var = new com.tencent.mm.plugin.fav.ui.i8(this.f101174f, this.f101175g, this.f101176h, this.f101177i, this.f101178m, continuation);
        i8Var.f101173e = obj;
        return i8Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.fav.ui.i8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c7 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f101172d
            jz5.f0 r2 = jz5.f0.f302826a
            java.lang.String r3 = r12.f101175g
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            kotlin.ResultKt.throwOnFailure(r13)
            goto Lc8
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L9b
        L22:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.f101173e
            kotlinx.coroutines.y0 r13 = (kotlinx.coroutines.y0) r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "[editTag] start, current thread = "
            r13.<init>(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            int r1 = rl.b.f397143a
            java.lang.String r1 = "MicroMsg.FavTopMenu"
            r6 = 0
            com.tencent.mars.xlog.Log.i(r1, r13, r6)
            t72.b r13 = t72.b.f416040a
            java.lang.String r7 = r12.f101174f
            t72.a r13 = r13.f(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r13 == 0) goto L65
            r45.xo5 r1 = new r45.xo5
            r1.<init>()
            int r13 = r13.field_id
            r1.f390295d = r13
            r1.f390296e = r3
            r8.add(r1)
            goto L7b
        L65:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r9 = "[editTag] name = "
            r13.<init>(r9)
            r13.append(r7)
            java.lang.String r7 = ", can not find id"
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            com.tencent.mars.xlog.Log.e(r1, r13, r6)
        L7b:
            boolean r13 = r8.isEmpty()
            r13 = r13 ^ r5
            if (r13 == 0) goto Lc8
            java.lang.Class<o72.f5> r13 = o72.f5.class
            i95.m r13 = i95.n0.c(r13)
            o72.f5 r13 = (o72.f5) r13
            com.tencent.mm.plugin.fav.o r13 = (com.tencent.mm.plugin.fav.o) r13
            o72.z4 r13 = r13.uj()
            r12.f101172d = r5
            t72.l r13 = (t72.l) r13
            java.lang.Object r13 = r13.X6(r8, r12)
            if (r13 != r0) goto L9b
            return r0
        L9b:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            t72.b r1 = t72.b.f416040a
            t72.a r8 = r1.f(r3)
            if (r13 == 0) goto Lc8
            if (r8 != 0) goto Lac
            goto Lc8
        Lac:
            kotlinx.coroutines.p0 r13 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r13 = kotlinx.coroutines.internal.b0.f310484a
            com.tencent.mm.plugin.fav.ui.h8 r1 = new com.tencent.mm.plugin.fav.ui.h8
            com.tencent.mm.plugin.fav.ui.y8 r6 = r12.f101176h
            int r7 = r12.f101177i
            java.lang.String r9 = r12.f101175g
            int r10 = r12.f101178m
            r11 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.f101172d = r4
            java.lang.Object r13 = kotlinx.coroutines.l.g(r13, r1, r12)
            if (r13 != r0) goto Lc8
            return r0
        Lc8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.i8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

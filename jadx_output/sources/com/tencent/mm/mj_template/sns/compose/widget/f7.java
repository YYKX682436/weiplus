package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class f7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f69958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m7 f69959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m5 f69960f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var, com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f69959e = m7Var;
        this.f69960f = m5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.mj_template.sns.compose.widget.f7(this.f69959e, this.f69960f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.mj_template.sns.compose.widget.f7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r9 == r0) goto L29;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f69958d
            jz5.f0 r2 = jz5.f0.f302826a
            com.tencent.mm.mj_template.sns.compose.widget.m5 r3 = r8.f69960f
            r4 = 1
            com.tencent.mm.mj_template.sns.compose.widget.m7 r5 = r8.f69959e
            if (r1 == 0) goto L1b
            if (r1 != r4) goto L13
            kotlin.ResultKt.throwOnFailure(r9)
            goto L72
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            kotlin.ResultKt.throwOnFailure(r9)
            az0.d r9 = r5.f70094l
            if (r9 == 0) goto L29
            java.lang.String r1 = r3.f70077a
            dz0.k0 r9 = (dz0.k0) r9
            r9.d(r1)
        L29:
            az0.d r9 = r5.f70094l
            if (r9 == 0) goto L72
            java.lang.String r1 = r3.f70077a
            r8.f69958d = r4
            dz0.k0 r9 = (dz0.k0) r9
            kotlinx.coroutines.r2 r6 = r9.f244903b
            if (r6 == 0) goto L6e
            r7 = r6
            kotlinx.coroutines.a r7 = (kotlinx.coroutines.a) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L49
            java.lang.String r7 = r9.f244906e
            boolean r1 = kotlin.jvm.internal.o.b(r1, r7)
            if (r1 == 0) goto L49
            goto L4a
        L49:
            r4 = 0
        L4a:
            if (r4 == 0) goto L4d
            goto L4e
        L4d:
            r6 = 0
        L4e:
            if (r6 == 0) goto L6e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "awaitActiveSelectTemplateJob "
            r1.<init>(r4)
            java.lang.String r9 = r9.f244906e
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            java.lang.String r1 = "MaasMultiTemplate.MaasSdkUIC"
            com.tencent.mars.xlog.Log.i(r1, r9)
            kotlinx.coroutines.c3 r6 = (kotlinx.coroutines.c3) r6
            java.lang.Object r9 = r6.C(r8)
            if (r9 != r0) goto L6e
            goto L6f
        L6e:
            r9 = r2
        L6f:
            if (r9 != r0) goto L72
            return r0
        L72:
            com.tencent.mm.mj_template.sns.compose.widget.b7 r9 = r5.f70101s
            if (r9 == 0) goto L7b
            java.lang.String r0 = r3.f70077a
            r9.d(r0)
        L7b:
            yz5.l r9 = r5.f70092j
            java.lang.String r0 = r5.a()
            r9.invoke(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.compose.widget.f7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

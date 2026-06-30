package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f88566d;

    /* renamed from: e, reason: collision with root package name */
    public int f88567e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f88568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.w f88569g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f88570h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88571i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.v f88572m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f88573n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88574o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88575p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f88576q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.appbrand.screenshot.w wVar, com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.String str, com.tencent.mm.plugin.appbrand.screenshot.v vVar, android.content.Context context, java.lang.String str2, java.lang.String str3, com.tencent.mm.vfs.r6 r6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f88569g = wVar;
        this.f88570h = o6Var;
        this.f88571i = str;
        this.f88572m = vVar;
        this.f88573n = context;
        this.f88574o = str2;
        this.f88575p = str3;
        this.f88576q = r6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.appbrand.screenshot.u uVar = new com.tencent.mm.plugin.appbrand.screenshot.u(this.f88569g, this.f88570h, this.f88571i, this.f88572m, this.f88573n, this.f88574o, this.f88575p, this.f88576q, continuation);
        uVar.f88568f = obj;
        return uVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.screenshot.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a6  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f88567e
            java.lang.String r3 = "MicroMsg.AppBrandScreenshotComponentHelper"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L2f
            if (r2 == r5) goto L20
            if (r2 != r4) goto L18
            kotlin.ResultKt.throwOnFailure(r22)
            r2 = r22
            goto La2
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L20:
            java.lang.Object r2 = r0.f88566d
            kotlinx.coroutines.f1 r2 = (kotlinx.coroutines.f1) r2
            java.lang.Object r5 = r0.f88568f
            kotlinx.coroutines.y0 r5 = (kotlinx.coroutines.y0) r5
            kotlin.ResultKt.throwOnFailure(r22)
            r7 = r2
            r2 = r22
            goto L8c
        L2f:
            kotlin.ResultKt.throwOnFailure(r22)
            java.lang.Object r2 = r0.f88568f
            kotlinx.coroutines.y0 r2 = (kotlinx.coroutines.y0) r2
            r8 = 0
            r9 = 0
            com.tencent.mm.plugin.appbrand.screenshot.r r10 = new com.tencent.mm.plugin.appbrand.screenshot.r
            com.tencent.mm.plugin.appbrand.o6 r7 = r0.f88570h
            java.lang.String r11 = r0.f88571i
            r10.<init>(r7, r11, r6)
            r11 = 3
            r12 = 0
            r7 = r2
            kotlinx.coroutines.f1 r14 = kotlinx.coroutines.l.b(r7, r8, r9, r10, r11, r12)
            com.tencent.mm.plugin.appbrand.screenshot.s r10 = new com.tencent.mm.plugin.appbrand.screenshot.s
            com.tencent.mm.plugin.appbrand.screenshot.v r7 = r0.f88572m
            android.content.Context r11 = r0.f88573n
            java.lang.String r12 = r0.f88574o
            java.lang.String r13 = r0.f88575p
            r20 = 0
            r15 = r10
            r16 = r7
            r17 = r11
            r18 = r12
            r19 = r13
            r15.<init>(r16, r17, r18, r19, r20)
            r11 = 3
            r12 = 0
            r7 = r2
            kotlinx.coroutines.f1 r7 = kotlinx.coroutines.l.b(r7, r8, r9, r10, r11, r12)
            java.lang.String r8 = "getGenImgPath: waiting for results with 4s timeout"
            com.tencent.mars.xlog.Log.i(r3, r8)
            com.tencent.mm.plugin.appbrand.screenshot.t r8 = new com.tencent.mm.plugin.appbrand.screenshot.t
            com.tencent.mm.vfs.r6 r9 = r0.f88576q
            java.lang.String r10 = r0.f88571i
            r18 = 0
            r13 = r8
            r15 = r7
            r16 = r9
            r17 = r10
            r13.<init>(r14, r15, r16, r17, r18)
            r0.f88568f = r2
            r0.f88566d = r7
            r0.f88567e = r5
            r9 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r2 = kotlinx.coroutines.a4.c(r9, r8, r0)
            if (r2 != r1) goto L8c
            return r1
        L8c:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto La4
            java.lang.String r2 = "Custom poster generation timeout, waiting for default poster result"
            com.tencent.mars.xlog.Log.w(r3, r2)
            r0.f88568f = r6
            r0.f88566d = r6
            r0.f88567e = r4
            java.lang.Object r2 = r7.k(r0)
            if (r2 != r1) goto La2
            return r1
        La2:
            java.lang.String r2 = (java.lang.String) r2
        La4:
            if (r2 != 0) goto La9
            java.lang.String r1 = ""
            goto Laa
        La9:
            r1 = r2
        Laa:
            com.tencent.mm.plugin.appbrand.screenshot.w r3 = r0.f88569g
            r3.f88587b = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.screenshot.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

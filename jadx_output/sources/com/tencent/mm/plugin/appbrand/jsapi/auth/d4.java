package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class d4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f79434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.j4 f79435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.ff f79436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.o0 f79437g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.o f79438h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.tencent.mm.plugin.appbrand.jsapi.auth.j4 j4Var, com.tencent.mm.plugin.appbrand.jsapi.ff ffVar, com.tencent.mm.plugin.appbrand.jsapi.auth.o0 o0Var, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f79435e = j4Var;
        this.f79436f = ffVar;
        this.f79437g = o0Var;
        this.f79438h = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.d4(this.f79435e, this.f79436f, this.f79437g, this.f79438h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.auth.d4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0037 -> B:5:0x003a). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f79434d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            kotlin.ResultKt.throwOnFailure(r7)
            r1 = r6
            goto L3a
        Le:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L16:
            kotlin.ResultKt.throwOnFailure(r7)
            com.tencent.mm.plugin.appbrand.jsapi.auth.t3 r7 = new com.tencent.mm.plugin.appbrand.jsapi.auth.t3
            com.tencent.mm.plugin.appbrand.jsapi.auth.h4 r1 = new com.tencent.mm.plugin.appbrand.jsapi.auth.h4
            com.tencent.mm.plugin.appbrand.jsapi.ff r3 = r6.f79436f
            com.tencent.mm.plugin.appbrand.jsapi.auth.o0 r4 = r6.f79437g
            com.tencent.mm.plugin.appbrand.jsapi.auth.j4 r5 = r6.f79435e
            r1.<init>(r5, r3, r4)
            r7.<init>(r1)
            r1 = r6
        L2a:
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData2.InvokeAction"
            kotlin.jvm.internal.o.e(r7, r3)
            com.tencent.mm.plugin.appbrand.jsapi.auth.f4 r7 = (com.tencent.mm.plugin.appbrand.jsapi.auth.f4) r7
            r1.f79434d = r2
            java.lang.Object r7 = r7.a(r1)
            if (r7 != r0) goto L3a
            return r0
        L3a:
            com.tencent.mm.plugin.appbrand.jsapi.auth.g4 r7 = (com.tencent.mm.plugin.appbrand.jsapi.auth.g4) r7
            com.tencent.mm.plugin.appbrand.jsapi.auth.e4 r3 = com.tencent.mm.plugin.appbrand.jsapi.auth.e4.f79449d
            boolean r3 = kotlin.jvm.internal.o.b(r7, r3)
            if (r3 == 0) goto L2a
            com.tencent.mm.plugin.appbrand.jsapi.auth.o r7 = r1.f79438h
            if (r7 == 0) goto L4b
            r7.a()
        L4b:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.auth.d4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f66674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.z2 f66675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.ne0 f66676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f66677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66678h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f66679i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c00.z2 z2Var, bw5.ne0 ne0Var, int i17, java.lang.String str, com.tencent.mm.ipcinvoker.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f66675e = z2Var;
        this.f66676f = ne0Var;
        this.f66677g = i17;
        this.f66678h = str;
        this.f66679i = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.finder.live.e(this.f66675e, this.f66676f, this.f66677g, this.f66678h, this.f66679i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.finder.live.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f66674d;
        com.tencent.mm.ipcinvoker.r rVar = this.f66679i;
        boolean z18 = true;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                c00.z2 z2Var = this.f66675e;
                bw5.ne0 ne0Var = this.f66676f;
                int i18 = this.f66677g;
                this.f66674d = 1;
                obj = ((b00.r) z2Var).vj(ne0Var, i18, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            bw5.qe0 qe0Var = (bw5.qe0) obj;
            if (qe0Var != null) {
                z17 = qe0Var.b() != null && qe0Var.b().f31595f == 1 && qe0Var.b().f31594e == 1;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Check result: productId=");
                sb6.append(this.f66678h);
                sb6.append(", isLiving=");
                sb6.append(qe0Var.b().f31595f);
                sb6.append(", isProductInLivingRoom=");
                sb6.append(qe0Var.b().f31594e);
                sb6.append(", displayable=");
                sb6.append(z17);
                com.tencent.mars.xlog.Log.i("CheckEcsProductWxaCoverWidgetDisplayableTask", sb6.toString());
            } else {
                com.tencent.mars.xlog.Log.w("CheckEcsProductWxaCoverWidgetDisplayableTask", "requestProductCardInfo returned null");
                z17 = false;
            }
            if (!z17) {
                z18 = false;
            }
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(java.lang.String.valueOf(z18)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("CheckEcsProductWxaCoverWidgetDisplayableTask", th6, "Check exception in coroutine", new java.lang.Object[0]);
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString("false"));
        }
        return jz5.f0.f302826a;
    }
}

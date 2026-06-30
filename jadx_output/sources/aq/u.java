package aq;

/* loaded from: classes4.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f12970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.nio.Buffer f12971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12972f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12973g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.QueryImageData f12974h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.nio.Buffer buffer, int i17, int i18, com.tencent.mm.api.QueryImageData queryImageData, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12971e = buffer;
        this.f12972f = i17;
        this.f12973g = i18;
        this.f12974h = queryImageData;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq.u(this.f12971e, this.f12972f, this.f12973g, this.f12974h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList<java.lang.String> arrayList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f12970d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQuerySDKCore", java.lang.Thread.currentThread().getName() + ", label start");
            ny4.e eVar = aq.r0.f12942c;
            if (eVar != null) {
                java.nio.Buffer dataBuffer = this.f12971e;
                kotlin.jvm.internal.o.g(dataBuffer, "dataBuffer");
                long j17 = eVar.f341457a;
                if (j17 == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WeChatClsManager", "applyReq >> weChatClsHandle no init");
                    arrayList = new java.util.ArrayList<>();
                } else {
                    arrayList = com.tencent.mm.xeffect.WeChatCls.nApply(j17, dataBuffer, this.f12972f, this.f12973g);
                }
            } else {
                arrayList = null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(", applyLabel result: ");
            sb6.append(arrayList != null ? new java.lang.Integer(arrayList.size()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQuerySDKCore", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append("#");
            com.tencent.mm.api.QueryImageData queryImageData = this.f12974h;
            boolean z17 = false;
            if (arrayList != null) {
                for (java.lang.String str : arrayList) {
                    java.lang.String str2 = (java.lang.String) kz5.n0.i0(r26.n0.f0(str, new java.lang.String[]{"#"}, false, 0, 6, null));
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageQuerySDKCore", str + "||" + queryImageData.f53206g + "||" + str2);
                    sb7.append(str2);
                    sb7.append("#");
                    if (aq.r0.f12941b.contains(str2)) {
                        z17 = true;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQuerySDKCore", sb7.toString());
            if (z17) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                aq.s sVar = new aq.s(queryImageData, sb7, null);
                this.f12970d = 1;
                if (kotlinx.coroutines.l.g(g3Var, sVar, this) == aVar) {
                    return aVar;
                }
            } else {
                kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
                aq.t tVar = new aq.t(queryImageData, sb7, null);
                this.f12970d = 2;
                if (kotlinx.coroutines.l.g(g3Var2, tVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}

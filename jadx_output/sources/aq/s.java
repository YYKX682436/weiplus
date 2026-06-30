package aq;

/* loaded from: classes4.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f12957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.QueryImageData f12958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f12959f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.api.QueryImageData queryImageData, java.lang.StringBuilder sb6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12958e = queryImageData;
        this.f12959f = sb6;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq.s(this.f12958e, this.f12959f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f12957d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.ArrayList arrayList = aq.r0.f12948i;
            com.tencent.mm.api.QueryImageData queryImageData = this.f12958e;
            arrayList.add(queryImageData);
            java.util.HashMap hashMap = aq.r0.f12945f;
            java.lang.String str = queryImageData.f53206g;
            kotlin.jvm.internal.o.f(str, "getScanImagePath(...)");
            queryImageData.f53207h = this.f12959f.toString();
            queryImageData.f53208i = "#";
            hashMap.put(str, queryImageData);
            if (arrayList.size() >= 2 && !aq.r0.f12947h) {
                aq.r0.f12947h = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageQuerySDKCore", java.lang.Thread.currentThread().getName() + ", cluster start");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.addAll(arrayList);
                arrayList.clear();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "setClusterPerStartTimeStamp >> timeStamp: " + currentTimeMillis);
                f65.m.f259904i = currentTimeMillis;
                aq.r0 r0Var = aq.r0.f12940a;
                this.f12957d = 1;
                java.lang.Object g17 = kotlinx.coroutines.l.g(lu5.a.f321457f, new aq.r(arrayList2, null), this);
                if (g17 != aVar) {
                    g17 = f0Var;
                }
                if (g17 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}

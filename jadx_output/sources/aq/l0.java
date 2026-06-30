package aq;

/* loaded from: classes4.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f12898d;

    public l0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq.l0(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new aq.l0((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f12898d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(", if need do last cluster, ");
            java.util.ArrayList arrayList = aq.r0.f12948i;
            sb6.append(arrayList.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQuerySDKCore", sb6.toString());
            if (arrayList.size() <= 0 || aq.r0.f12947h) {
                aq.c cVar = aq.c.f12845g;
                aq.r0.f12953n = cVar;
                aq.n nVar = aq.o.f12922c;
                if (nVar != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", "postFinishType");
                    nVar.f12912g.postValue(cVar);
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageQuerySDKCore", "all image identify is finish >> timeStamp: " + currentTimeMillis);
                f65.p.f259934a.a(4, aq.r0.f12954o, currentTimeMillis);
                f65.m.f259896a.a(4);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageQuerySDKCore", "need to do last cluster");
                aq.r0.f12947h = true;
                aq.r0.f12953n = aq.c.f12844f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.addAll(arrayList);
                arrayList.clear();
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "setClusterPerStartTimeStamp >> timeStamp: " + currentTimeMillis2);
                f65.m.f259904i = currentTimeMillis2;
                aq.r0 r0Var = aq.r0.f12940a;
                this.f12898d = 1;
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

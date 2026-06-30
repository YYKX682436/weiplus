package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f94323d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f94325f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94326g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 f94327h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(long j17, java.lang.String str, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 t2Var) {
        super(2, continuation);
        this.f94325f = j17;
        this.f94326g = str;
        this.f94327h = t2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.j2 j2Var = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.j2(this.f94325f, this.f94326g, continuation, this.f94327h);
        j2Var.f94324e = obj;
        return j2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.j2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f94323d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f94324e;
            long j17 = this.f94325f;
            this.f94324e = y0Var2;
            this.f94323d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f94324e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!kotlinx.coroutines.z0.h(y0Var)) {
            return jz5.f0.f302826a;
        }
        com.tencent.mm.sdk.platformtools.ca caVar = com.tencent.mm.sdk.platformtools.ca.f192506a;
        java.lang.String str = this.f94326g;
        synchronized (caVar) {
            java.util.HashMap hashMap = com.tencent.mm.sdk.platformtools.ca.f192508c;
            java.lang.Object obj2 = hashMap.get(str);
            java.util.Queue queue = obj2 instanceof java.util.Queue ? (java.util.Queue) obj2 : null;
            if (queue != null) {
                hashMap.remove(str);
                arrayList = new java.util.ArrayList(queue);
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 t2Var = this.f94327h;
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 t2Var2 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94445a;
            t2Var.o(arrayList, 0L, null);
        }
        com.tencent.mm.sdk.platformtools.ca.f192507b.remove(this.f94326g);
        return jz5.f0.f302826a;
    }
}

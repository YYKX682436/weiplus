package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes4.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f86142d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f86143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f86144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f86145g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.util.List list, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f86144f = list;
        this.f86145g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.appbrand.networking.w0 w0Var = new com.tencent.mm.plugin.appbrand.networking.w0(this.f86144f, this.f86145g, continuation);
        w0Var.f86143e = obj;
        return w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.networking.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f86142d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f86143e;
            java.util.List list = this.f86144f;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlinx.coroutines.l.b(y0Var, null, null, new com.tencent.mm.plugin.appbrand.networking.v0((java.lang.String) it.next(), this.f86145g, null), 3, null));
            }
            this.f86142d = 1;
            obj = kotlinx.coroutines.h.a(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : (java.lang.Iterable) obj) {
            if (((jz5.l) obj2).f302834e != null) {
                arrayList2.add(obj2);
            }
        }
        return kz5.c1.q(arrayList2);
    }
}

package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes2.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f86136d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f86137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f86138f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f86138f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.appbrand.networking.u0 u0Var = new com.tencent.mm.plugin.appbrand.networking.u0(this.f86138f, continuation);
        u0Var.f86137e = obj;
        return u0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.networking.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f86136d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f86137e;
            java.util.List list = this.f86138f;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList.add(kotlinx.coroutines.l.b(y0Var, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.appbrand.networking.t0((java.lang.String) it6.next(), null), 2, null));
            }
            it = arrayList.iterator();
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.f86137e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            kotlinx.coroutines.f1 f1Var = (kotlinx.coroutines.f1) it.next();
            this.f86137e = it;
            this.f86136d = 1;
            if (f1Var.k(this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}

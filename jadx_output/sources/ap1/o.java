package ap1;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.f f12708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.w f12709e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.wechat.aff.affroam.f fVar, ap1.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12708d = fVar;
        this.f12709e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ap1.o(this.f12708d, this.f12709e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ap1.o oVar = (ap1.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        oVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.wechat.aff.affroam.f fVar = this.f12708d;
        java.util.ArrayList arrayList = new java.util.ArrayList(fVar.f215824d.size());
        java.util.LinkedList linkedList = fVar.f215824d;
        kotlin.jvm.internal.o.f(linkedList, "getConversationId(...)");
        int i17 = 0;
        for (java.lang.Object obj2 : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str = (java.lang.String) obj2;
            kotlin.jvm.internal.o.d(str);
            java.lang.Object obj3 = fVar.f215825e.get(i17);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            arrayList.add(new ap1.a0(str, 0L, ((java.lang.Number) obj3).longValue()));
            i17 = i18;
        }
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "loadDataImpl done, size=" + arrayList.size());
        j75.f U6 = this.f12709e.U6();
        kotlin.jvm.internal.o.d(U6);
        U6.B3(new ap1.b(null, 1, null));
        U6.B3(new ap1.a(arrayList, null, 2, null));
        return jz5.f0.f302826a;
    }
}

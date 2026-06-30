package ah3;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f4945d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f4947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ah3.v f4948g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f4949h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f4950i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ah3.n f4951m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.List list, ah3.v vVar, kotlinx.coroutines.y0 y0Var, yz5.l lVar, ah3.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4947f = list;
        this.f4948g = vVar;
        this.f4949h = y0Var;
        this.f4950i = lVar;
        this.f4951m = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ah3.s sVar = new ah3.s(this.f4947f, this.f4948g, this.f4949h, this.f4950i, this.f4951m, continuation);
        sVar.f4946e = obj;
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ah3.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f4945d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f4946e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleRetryUsernames retryUsernames:");
            java.util.List list = this.f4947f;
            sb6.append(list);
            sb6.append(' ');
            com.tencent.mars.xlog.Log.i("MicroMsg.InitBatchGetContactHelperV3", sb6.toString());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add((java.lang.String) it.next());
                if (arrayList2.size() >= 100) {
                    java.util.List S0 = kz5.n0.S0(arrayList2);
                    arrayList2.clear();
                    arrayList4.add(ah3.v.a(this.f4948g, y0Var, S0, this.f4949h, this.f4950i, this.f4951m));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList4.add(ah3.v.a(this.f4948g, y0Var, kz5.n0.S0(arrayList2), this.f4949h, this.f4950i, this.f4951m));
            }
            this.f4946e = arrayList3;
            this.f4945d = 1;
            a17 = kotlinx.coroutines.h.a(arrayList4, this);
            if (a17 == aVar) {
                return aVar;
            }
            arrayList = arrayList3;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return f0Var;
            }
            ?? r27 = (java.util.List) this.f4946e;
            kotlin.ResultKt.throwOnFailure(obj);
            arrayList = r27;
            a17 = obj;
        }
        java.util.Iterator it6 = ((java.lang.Iterable) a17).iterator();
        while (it6.hasNext()) {
            arrayList.addAll((java.util.List) it6.next());
        }
        if (!arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.InitBatchGetContactHelperV3", "handleRetryUsernames retryUsernames.isNotEmpty() ");
            kotlinx.coroutines.y0 y0Var2 = this.f4949h;
            yz5.l lVar = this.f4950i;
            ah3.n nVar = this.f4951m;
            this.f4946e = null;
            this.f4945d = 2;
            ah3.v vVar = this.f4948g;
            vVar.getClass();
            java.lang.Object f17 = kotlinx.coroutines.z0.f(new ah3.s(arrayList, vVar, y0Var2, lVar, nVar, null), this);
            if (f17 != pz5.a.f359186d) {
                f17 = f0Var;
            }
            if (f17 == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}

package b00;

/* loaded from: classes9.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.e0 f16664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f16665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b00.r f16666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f16667g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e00.e0 e0Var, java.util.List list, b00.r rVar, kotlinx.coroutines.q qVar) {
        super(1);
        this.f16664d = e0Var;
        this.f16665e = list;
        this.f16666f = rVar;
        this.f16667g = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        e00.e0 e0Var = this.f16664d;
        e0Var.f245759d = null;
        java.util.List list2 = this.f16665e;
        boolean z17 = list != null && list.size() == list2.size();
        b00.r rVar = this.f16666f;
        if (z17) {
            int size = list2.size();
            for (int i17 = 0; i17 < size; i17++) {
                bw5.se0 reqInfo = (bw5.se0) list2.get(i17);
                bw5.ue0 shopCard = (bw5.ue0) list.get(i17);
                e00.e eVar = (e00.e) rVar.f16758e;
                eVar.getClass();
                kotlin.jvm.internal.o.g(shopCard, "shopCard");
                kotlin.jvm.internal.o.g(reqInfo, "reqInfo");
                java.lang.String b17 = shopCard.b();
                e00.d dVar = new e00.d(shopCard, java.lang.System.currentTimeMillis() / 1000);
                eVar.f245754b.put(b17, dVar);
                com.tencent.mars.xlog.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", "update shopCard cache for key" + b17 + " when:" + dVar.f245751b);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("batchRequestShopCardInfo done for key:");
        sb6.append(e0Var.getKey());
        sb6.append(", pending size: ");
        java.util.List list3 = (java.util.List) rVar.f16760g.get(e0Var.getKey());
        sb6.append(list3 != null ? java.lang.Integer.valueOf(list3.size()) : null);
        com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", sb6.toString());
        b00.r.wi(rVar, e0Var);
        ((kotlinx.coroutines.r) this.f16667g).resumeWith(kotlin.Result.m521constructorimpl(list));
        return jz5.f0.f302826a;
    }
}

package cj5;

/* loaded from: classes.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f42247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f42248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(java.util.List list, cj5.l2 l2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42247d = list;
        this.f42248e = l2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cj5.u1(this.f42247d, this.f42248e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cj5.u1 u1Var = (cj5.u1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        wi5.n0 n0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactMainRecycleViewUIC", "handleMsgFoldClick() lifecycleScope launchUI submitInsert");
        java.util.List list = this.f42247d;
        if (list != null) {
            cj5.l2 l2Var = this.f42248e;
            j75.f Q6 = l2Var.Q6();
            if (Q6 != null && (n0Var = (wi5.n0) Q6.getState()) != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ri5.j) it.next()).f396127x = n0Var.e();
                }
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = l2Var.Y6().k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (a17 != null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList.p(a17, list, false, 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}

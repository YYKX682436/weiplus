package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@qz5.f(c = "com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$fetchFirstHotFeedForGuide$1", f = "FinderProfileFeedLoader.kt", l = {}, m = "invokeSuspend")
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$fetchFirstHotFeedForGuide$1 */
/* loaded from: classes2.dex */
public final class C13894x3a55ad85 extends qz5.l implements yz5.p {

    /* renamed from: $callback */
    final /* synthetic */ yz5.l f35695xcf5bbc69;
    private /* synthetic */ java.lang.Object L$0;

    /* renamed from: label */
    int f35696x61f7ef4;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 f35697xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13894x3a55ad85(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 c13888xeed42a34, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13894x3a55ad85> interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f35697xcbdd23aa = c13888xeed42a34;
        this.f35695xcf5bbc69 = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<jz5.f0> mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<?> interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13894x3a55ad85 c13894x3a55ad85 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13894x3a55ad85(this.f35697xcbdd23aa, this.f35695xcf5bbc69, interfaceC29045xdcb5ca57);
        c13894x3a55ad85.L$0 = obj;
        return c13894x3a55ad85;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        bs2.b0 b0Var;
        db2.c3 c3Var;
        java.util.LinkedList m75941xfb821914;
        java.util.List list = kz5.p0.f395529d;
        pz5.a aVar = pz5.a.f440719d;
        if (this.f35696x61f7ef4 != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            bs2.n1 R6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) a17).R6(4);
            java.util.List S0 = (R6 == null || (b0Var = R6.f105458s) == null || (c3Var = b0Var.f105339b) == null || (m75941xfb821914 = c3Var.m75941xfb821914(1)) == null) ? list : kz5.n0.S0(m75941xfb821914);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f35697xcbdd23aa.getF204960d(), "fetchFirstHotFeedForGuide: cached feeds size=" + S0.size());
            list = this.f35697xcbdd23aa.m56169xb2ed194c(S0);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f35697xcbdd23aa.getF204960d(), th6, "fetchFirstHotFeedForGuide build backup error", new java.lang.Object[0]);
        }
        this.f35697xcbdd23aa.m56176x37c39ee1(list, this.f35695xcf5bbc69);
        return jz5.f0.f384359a;
    }

    @Override // yz5.p
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object mo149xb9724478(p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super jz5.f0> interfaceC29045xdcb5ca57) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13894x3a55ad85) mo148xaf65a0fc(y0Var, interfaceC29045xdcb5ca57)).mo150x989b7ca4(jz5.f0.f384359a);
    }
}

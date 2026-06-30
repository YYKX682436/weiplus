package ab2;

/* loaded from: classes2.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f2778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment f2779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2780f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment finderBizProfileFragment, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2778d = iResponse;
        this.f2779e = finderBizProfileFragment;
        this.f2780f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ab2.j(this.f2778d, this.f2779e, this.f2780f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ab2.j jVar = (ab2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = this.f2778d;
        kotlin.jvm.internal.o.e(iResponse, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader.BizProfileResponse");
        if (!((ab2.a0) iResponse).getHasMore()) {
            com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment finderBizProfileFragment = this.f2779e;
            ab2.g gVar = finderBizProfileFragment.A;
            if (gVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            gVar.f106180m.setEnableLoadMore(finderBizProfileFragment.H0().getSize() > 5);
            ab2.g gVar2 = finderBizProfileFragment.A;
            if (gVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x = gVar2.f106180m.getF213435x();
            if (f213435x != null && (textView2 = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView2.setText(com.tencent.mm.R.string.f491896el3);
            }
            ab2.g gVar3 = finderBizProfileFragment.A;
            if (gVar3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x2 = gVar3.f106180m.getF213435x();
            if (f213435x2 != null && (textView = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setTextColor(this.f2780f);
            }
            ab2.g gVar4 = finderBizProfileFragment.A;
            if (gVar4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x3 = gVar4.f106180m.getF213435x();
            android.widget.TextView textView3 = f213435x3 != null ? (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            ab2.g gVar5 = finderBizProfileFragment.A;
            if (gVar5 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x4 = gVar5.f106180m.getF213435x();
            android.view.View findViewById = f213435x4 != null ? f213435x4.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$1$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$1$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}

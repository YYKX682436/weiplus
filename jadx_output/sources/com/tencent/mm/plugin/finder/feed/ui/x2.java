package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class x2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f110716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI f110717e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI finderFollowAggregationUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110717e = finderFollowAggregationUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.feed.ui.x2 x2Var = new com.tencent.mm.plugin.finder.feed.ui.x2(this.f110717e, continuation);
        x2Var.f110716d = obj;
        return x2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.ui.x2 x2Var = (com.tencent.mm.plugin.finder.feed.ui.x2) create((jz5.l) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.l lVar = (jz5.l) this.f110716d;
        dv2.n nVar = (dv2.n) lVar.f302833d;
        dv2.i iVar = (dv2.i) lVar.f302834e;
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI.f109245y;
        com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI finderFollowAggregationUI = this.f110717e;
        finderFollowAggregationUI.getClass();
        java.lang.String str = nVar.f243904a ? null : iVar == dv2.i.f243865e ? nVar.f243906c : nVar.f243907d;
        if (str != null) {
            android.widget.TextView textView = finderFollowAggregationUI.f109250x;
            if (textView == null) {
                kotlin.jvm.internal.o.o("subtitleTv");
                throw null;
            }
            textView.setText(str);
            android.widget.TextView textView2 = finderFollowAggregationUI.f109250x;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("subtitleTv");
                throw null;
            }
            textView2.setVisibility(0);
        } else {
            android.widget.TextView textView3 = finderFollowAggregationUI.f109250x;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("subtitleTv");
                throw null;
            }
            textView3.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}

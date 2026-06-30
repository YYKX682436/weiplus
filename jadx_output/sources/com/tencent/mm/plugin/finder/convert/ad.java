package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ad implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f102874f;

    public ad(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.convert.qe qeVar) {
        this.f102872d = s0Var;
        this.f102873e = baseFinderFeed;
        this.f102874f = qeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNickname$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f102872d;
        int adapterPosition = s0Var.getAdapterPosition();
        android.content.Context context = s0Var.f293121e;
        if (adapterPosition == 0) {
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zu2.q qVar = ((zu2.a0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(zu2.a0.class)).f475694f;
            if (qVar != null) {
                qVar.a();
                qVar.d("nickname");
            }
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f102873e;
        if (!hc2.g0.f(baseFinderFeed.getFeedObject().getFeedObject(), s0Var, null)) {
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.tdv);
            com.tencent.mm.plugin.finder.convert.qe.B(this.f102874f, this.f102872d, 0, p17 != null && p17.getVisibility() == 0, 2, 2, null);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNickname$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).tj(baseFinderFeed, s0Var.getAdapterPosition(), java.lang.String.valueOf(nyVar != null ? nyVar.f135380n : 0));
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ni(s0Var, baseFinderFeed.getItemId(), baseFinderFeed.getFeedObject());
            com.tencent.mm.plugin.finder.convert.t8 t8Var = com.tencent.mm.plugin.finder.convert.qe.U;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            t8Var.c((com.tencent.mm.ui.MMActivity) context, baseFinderFeed, true);
        }
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Sk(baseFinderFeed, nyVar2 != null ? nyVar2.V6() : null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNickname$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

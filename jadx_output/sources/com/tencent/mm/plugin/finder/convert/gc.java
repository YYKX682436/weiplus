package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class gc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103473f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103474g;

    public gc(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.view.View view) {
        this.f103471d = qeVar;
        this.f103472e = s0Var;
        this.f103473f = baseFinderFeed;
        this.f103474g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshCommentLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f103471d;
        in5.s0 s0Var = this.f103472e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f103473f;
        boolean i07 = qeVar.i0();
        com.tencent.mm.plugin.finder.convert.qe qeVar2 = this.f103471d;
        in5.s0 s0Var2 = this.f103472e;
        com.tencent.mm.plugin.finder.convert.qe.E0(qeVar, s0Var, baseFinderFeed, false, 0L, null, 0, 0, i07, 0L, qeVar2.R(s0Var2), 2, 376, null);
        if (s0Var2.getAdapterPosition() == 0) {
            android.content.Context context = s0Var2.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zu2.q qVar = ((zu2.a0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(zu2.a0.class)).f475694f;
            if (qVar != null) {
                qVar.a();
                qVar.d(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
            }
        }
        d92.s sVar = d92.k0.f227486e;
        kotlin.jvm.internal.o.d(view);
        this.f103474g.announceForAccessibility(sVar.b(view));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshCommentLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

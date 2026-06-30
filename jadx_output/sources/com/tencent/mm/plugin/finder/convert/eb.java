package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class eb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103246e;

    public eb(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.qe qeVar) {
        this.f103245d = s0Var;
        this.f103246e = qeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zy2.m7 feedTipsStatus;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f103245d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ed2.i iVar = (ed2.i) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(ed2.i.class);
        boolean z17 = false;
        if (iVar != null) {
            if (iVar.f251269e == ed2.a.f251253e) {
                z17 = true;
            }
        }
        if (z17) {
            zy2.l7 l7Var = (baseFinderFeed == null || (feedTipsStatus = baseFinderFeed.getFeedTipsStatus()) == null) ? null : feedTipsStatus.f477476b;
            if (l7Var != null) {
                l7Var.f477455a = true;
            }
        }
        kotlin.jvm.internal.o.d(baseFinderFeed);
        kotlin.jvm.internal.o.d(view);
        this.f103246e.n0(s0Var, baseFinderFeed, view, 1);
        view.announceForAccessibility(d92.k0.f227486e.c(view));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

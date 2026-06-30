package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class gg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qg f103481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f103482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPopupBubbleView f103483f;

    public gg(com.tencent.mm.plugin.finder.convert.qg qgVar, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView) {
        this.f103481d = qgVar;
        this.f103482e = jbVar;
        this.f103483f = finderPopupBubbleView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$handleFinderPopupBubble$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.qg qgVar = this.f103481d;
        com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView = qgVar.f104392t;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f103482e;
        if (finderPopupBubbleView != null) {
            com.tencent.mm.ui.MMActivity context = qgVar.f104380e.f108755g;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            finderPopupBubbleView.t(nyVar != null ? nyVar.W6(qgVar.f104380e.f108762p) : null, jbVar, qgVar.f104380e.W0());
        }
        com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView2 = this.f103483f;
        android.content.Context context2 = finderPopupBubbleView2.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.nu) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.nu.class)).U6(com.tencent.mm.plugin.finder.view.ag.f131638f, jbVar);
        android.content.Context context3 = finderPopupBubbleView2.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.nu.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar = (com.tencent.mm.plugin.finder.viewmodel.component.nu) a17;
        androidx.appcompat.app.AppCompatActivity activity = nuVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        nuVar.S6("click_popup", ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).S6(), true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$handleFinderPopupBubble$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

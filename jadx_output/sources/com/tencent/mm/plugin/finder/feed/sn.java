package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class sn extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tn f108999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(com.tencent.mm.plugin.finder.feed.tn tnVar) {
        super(1);
        this.f108999d = tnVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.tn tnVar = this.f108999d;
        boolean z17 = tnVar.f107156e.getSize() == 0;
        com.tencent.mars.xlog.Log.i("Finder.FinderPoiRelateUIContract", "[fetchEndCallback], " + z17);
        com.tencent.mm.plugin.finder.feed.a1 a1Var = tnVar.f107157f;
        com.tencent.mm.plugin.finder.feed.co coVar = a1Var instanceof com.tencent.mm.plugin.finder.feed.co ? (com.tencent.mm.plugin.finder.feed.co) a1Var : null;
        if (coVar != null && !z17 && !coVar.f106490z) {
            coVar.f106490z = true;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) coVar.l(com.tencent.mm.R.id.g7l);
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            coVar.f106487w = (android.widget.TextView) coVar.l(com.tencent.mm.R.id.ooz);
            coVar.f106488x = (android.widget.TextView) coVar.l(com.tencent.mm.R.id.f487453op0);
            android.widget.TextView textView = coVar.f106487w;
            if (textView != null) {
                textView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.xn(coVar));
            }
            android.widget.TextView textView2 = coVar.f106488x;
            if (textView2 != null) {
                textView2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.yn(coVar));
            }
        }
        if (z17) {
            com.tencent.mm.plugin.finder.feed.a1 a1Var2 = tnVar.f107157f;
            com.tencent.mm.plugin.finder.feed.co coVar2 = a1Var2 instanceof com.tencent.mm.plugin.finder.feed.co ? (com.tencent.mm.plugin.finder.feed.co) a1Var2 : null;
            if (coVar2 != null) {
                coVar2.W();
            }
        } else {
            com.tencent.mm.plugin.finder.feed.a1 a1Var3 = tnVar.f107157f;
            android.view.View t17 = a1Var3 != null ? a1Var3.t() : null;
            if (t17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                android.view.View view = t17;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelatePresenter$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelatePresenter$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class d8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizPrepareUI f109936d;

    public d8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizPrepareUI finderLiveBizPrepareUI) {
        this.f109936d = finderLiveBizPrepareUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizPrepareUI$initBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zg0.c3 c3Var = (zg0.c3) i95.n0.c(zg0.c3.class);
        if (c3Var != null) {
            ((yg0.u3) c3Var).wi();
        }
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizPrepareUI finderLiveBizPrepareUI = this.f109936d;
        intent.putExtra("finder_biz_live_article_url", finderLiveBizPrepareUI.f109346v);
        finderLiveBizPrepareUI.setResult(-1, intent);
        finderLiveBizPrepareUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizPrepareUI$initBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

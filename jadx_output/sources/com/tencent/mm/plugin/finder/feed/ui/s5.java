package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class s5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderHotSearchUI f110524d;

    public s5(com.tencent.mm.plugin.finder.feed.ui.FinderHotSearchUI finderHotSearchUI) {
        this.f110524d = finderHotSearchUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderHotSearchUI$initSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderHotSearchUI.f109298v;
        com.tencent.mm.plugin.finder.feed.ui.FinderHotSearchUI finderHotSearchUI = this.f110524d;
        finderHotSearchUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, finderHotSearchUI, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        androidx.appcompat.app.AppCompatActivity context = finderHotSearchUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.Vj(context, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderHotSearchUI$initSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

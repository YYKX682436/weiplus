package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.x1 f103878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f103879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103880f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f103881g;

    public l1(com.tencent.mm.plugin.finder.convert.x1 x1Var, java.util.LinkedList linkedList, in5.s0 s0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f103878d = x1Var;
        this.f103879e = linkedList;
        this.f103880f = s0Var;
        this.f103881g = finderItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderCommentConvert$refreshRealNameRecommendAvatarLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.x1.n(this.f103878d);
        java.util.LinkedList linkedList = this.f103879e;
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "click recommendAvatarLayout:%d", java.lang.Integer.valueOf(linkedList.size()));
        android.content.Context context = this.f103880f.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.v6 v6Var = (com.tencent.mm.plugin.finder.viewmodel.component.v6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.v6.class);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f103881g;
        v6Var.getClass();
        if (v6Var.f136212d == null) {
            v6Var.P6();
        }
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = v6Var.f136212d;
        if (finderLikeDrawer != null) {
            finderLikeDrawer.v(null, finderItem, null, 0, "", linkedList);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$refreshRealNameRecommendAvatarLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

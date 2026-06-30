package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class e7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.z7 f100835d;

    public e7(com.tencent.mm.plugin.fav.ui.z7 z7Var) {
        this.f100835d = z7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fav.ui.z7 z7Var = this.f100835d;
        com.tencent.mm.plugin.fav.ui.MaxHeightFrameLayout maxHeightFrameLayout = z7Var.f101667m;
        if (maxHeightFrameLayout == null) {
            kotlin.jvm.internal.o.o("mFlRvContains");
            throw null;
        }
        maxHeightFrameLayout.startAnimation(com.tencent.mm.plugin.fav.ui.z7.b(z7Var));
        z7Var.f101661g.f();
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

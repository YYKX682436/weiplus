package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class m8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y8 f101275d;

    public m8(com.tencent.mm.plugin.fav.ui.y8 y8Var) {
        this.f101275d = y8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fav.ui.f8 f8Var = this.f101275d.f101628g;
        if (f8Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "click menu close button, try to close menu window");
            com.tencent.mm.plugin.fav.ui.z7 z7Var = ((com.tencent.mm.plugin.fav.ui.g7) f8Var).f100865a;
            if (z7Var.f101665k.getVisibility() == 0) {
                com.tencent.mm.plugin.fav.ui.MaxHeightFrameLayout maxHeightFrameLayout = z7Var.f101667m;
                if (maxHeightFrameLayout == null) {
                    kotlin.jvm.internal.o.o("mFlRvContains");
                    throw null;
                }
                maxHeightFrameLayout.startAnimation(com.tencent.mm.plugin.fav.ui.z7.b(z7Var));
                z7Var.f101661g.f();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

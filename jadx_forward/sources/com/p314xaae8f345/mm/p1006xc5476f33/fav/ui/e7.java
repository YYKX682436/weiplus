package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public final class e7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 f182368d;

    public e7(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var) {
        this.f182368d = z7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = this.f182368d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13582xd706766c c13582xd706766c = z7Var.f183200m;
        if (c13582xd706766c == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFlRvContains");
            throw null;
        }
        c13582xd706766c.startAnimation(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7.b(z7Var));
        z7Var.f183194g.f();
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f101951d;

    public u(com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f101951d = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityParticipateUIC$showAccountBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f101951d.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityParticipateUIC$showAccountBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

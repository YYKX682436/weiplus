package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.c1 f101941d;

    public q0(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var) {
        this.f101941d = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.uic.c1 c1Var = this.f101941d;
        java.lang.Object clone = c1Var.getIntent().clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type android.content.Intent");
        com.tencent.mars.xlog.Log.i("FinderActivityPostUIC", "cancelActivity");
        androidx.appcompat.app.AppCompatActivity activity = c1Var.getActivity();
        activity.setResult(-1, (android.content.Intent) clone);
        if (!activity.isFinishing()) {
            activity.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class wa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f292750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f292751f;

    public wa(com.p314xaae8f345.mm.ui.ga gaVar, java.lang.String str, int i17) {
        this.f292751f = gaVar;
        this.f292749d = str;
        this.f292750e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMActivityController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5206xdf10b679 c5206xdf10b679 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5206xdf10b679();
        am.c1 c1Var = c5206xdf10b679.f135545g;
        c1Var.f87831a = 1;
        c1Var.f87832b = this.f292749d;
        c1Var.f87833c = this.f292750e;
        c5206xdf10b679.e();
        android.view.View view2 = this.f292751f.f290173e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/MMActivityController$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/MMActivityController$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/ui/MMActivityController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

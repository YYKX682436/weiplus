package sr2;

/* loaded from: classes.dex */
public final class a5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493047d;

    public a5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6) {
        this.f493047d = c14609xb4d6eef6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostMainUIC$setPostTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View f76 = this.f493047d.f7();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(f76, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC$setPostTip$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f76.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(f76, "com/tencent/mm/plugin/finder/post/PostMainUIC$setPostTip$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostMainUIC$setPostTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

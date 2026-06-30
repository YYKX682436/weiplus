package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class l5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.n f289377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f289378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.a5 f289379f;

    public l5(yf5.n nVar, android.view.ViewGroup.LayoutParams layoutParams, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.a5 a5Var) {
        this.f289377d = nVar;
        this.f289378e = layoutParams;
        this.f289379f = a5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yf5.n nVar = this.f289377d;
        android.view.View view = nVar.f543464r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        nVar.f543462p = 0;
        nVar.f543463q.setLayoutParams(this.f289378e);
        android.view.View view2 = nVar.f543463q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        nVar.f543463q.requestLayout();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.a5 a5Var = this.f289379f;
        if (a5Var != null) {
            ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i5) a5Var).a(nVar);
        }
    }
}

package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class j5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.n f289308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 f289309e;

    public j5(yf5.n nVar, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var) {
        this.f289308d = nVar;
        this.f289309e = o5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yf5.j0 j0Var;
        yf5.n nVar = this.f289308d;
        android.view.View view = nVar.f543464r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = nVar.f543463q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this.f289309e;
        if (o5Var.K.getAndSet(true) || (j0Var = o5Var.f289457d) == null) {
            return;
        }
        ((yf5.w0) j0Var).a();
    }
}

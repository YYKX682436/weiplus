package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2 f284582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd5.b f284583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284584f;

    public p1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2 e2Var, qd5.b bVar, android.view.View view) {
        this.f284582d = e2Var;
        this.f284583e = bVar;
        this.f284584f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2 e2Var = this.f284582d;
        java.util.LinkedHashMap linkedHashMap = e2Var.f284446j;
        qd5.b bVar = this.f284583e;
        jz5.l lVar = (jz5.l) linkedHashMap.get(bVar.f443436b);
        boolean z17 = (lVar != null ? (android.view.View) lVar.f384366d : null) == this.f284584f;
        boolean e17 = e2Var.f284449m.e(e2Var.f284444h);
        if (!z17 || e17) {
            return;
        }
        android.view.View view = this.f284584f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$collectExpandedTargetForExpand$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$collectExpandedTargetForExpand$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        e2Var.f284446j.remove(bVar.f443436b);
        e2Var.J();
    }
}

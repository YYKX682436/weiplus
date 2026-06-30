package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class q6 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.r6 f135274d;

    public q6(com.p314xaae8f345.mm.app.r6 r6Var) {
        this.f135274d = r6Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.app.r6 r6Var = this.f135274d;
        android.view.View view = r6Var.f135287a;
        if (view == null) {
            return;
        }
        r6Var.a();
        r6Var.getClass();
        r6Var.f135289c.f135360d.postAtFrontOfQueue(new com.p314xaae8f345.mm.app.p6(this, view));
    }
}

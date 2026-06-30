package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class q6 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.r6 f53741d;

    public q6(com.tencent.mm.app.r6 r6Var) {
        this.f53741d = r6Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.app.r6 r6Var = this.f53741d;
        android.view.View view = r6Var.f53754a;
        if (view == null) {
            return;
        }
        r6Var.a();
        r6Var.getClass();
        r6Var.f53756c.f53827d.postAtFrontOfQueue(new com.tencent.mm.app.p6(this, view));
    }
}

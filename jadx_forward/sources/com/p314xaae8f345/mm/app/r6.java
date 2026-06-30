package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public abstract class r6 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f135287a = null;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f135288b = new com.p314xaae8f345.mm.app.q6(this);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.u6 f135289c;

    public r6(com.p314xaae8f345.mm.app.u6 u6Var, com.p314xaae8f345.mm.app.g6 g6Var) {
        this.f135289c = u6Var;
    }

    public void a() {
        android.view.View view = this.f135287a;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f135288b);
            this.f135287a = null;
        }
    }
}

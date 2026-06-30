package com.tencent.mm.app;

/* loaded from: classes12.dex */
public abstract class r6 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f53754a = null;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f53755b = new com.tencent.mm.app.q6(this);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.u6 f53756c;

    public r6(com.tencent.mm.app.u6 u6Var, com.tencent.mm.app.g6 g6Var) {
        this.f53756c = u6Var;
    }

    public void a() {
        android.view.View view = this.f53754a;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f53755b);
            this.f53754a = null;
        }
    }
}

package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes3.dex */
public final class r implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f87641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f87642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f87643f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f87644g;

    public r(kotlin.jvm.internal.f0 f0Var, int i17, android.view.View view, yz5.a aVar) {
        this.f87641d = f0Var;
        this.f87642e = i17;
        this.f87643f = view;
        this.f87644g = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        kotlin.jvm.internal.f0 f0Var = this.f87641d;
        int i17 = f0Var.f310116d + 1;
        f0Var.f310116d = i17;
        if (i17 < this.f87642e) {
            return;
        }
        this.f87643f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f87644g.invoke();
    }
}

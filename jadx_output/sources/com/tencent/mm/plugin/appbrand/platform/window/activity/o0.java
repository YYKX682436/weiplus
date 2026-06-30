package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public class o0 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f87627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f87628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.qk f87629f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.platform.window.activity.n0 f87630g;

    public o0(com.tencent.mm.plugin.appbrand.platform.window.activity.n0 n0Var, int i17, android.view.View view, com.tencent.mm.ui.qk qkVar) {
        this.f87630g = n0Var;
        this.f87627d = i17;
        this.f87628e = view;
        this.f87629f = qkVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        synchronized (this.f87630g.f87608b) {
            this.f87630g.f87612f[this.f87627d] = this.f87628e.getRootWindowInsets();
            this.f87630g.f87611e = com.tencent.mm.plugin.appbrand.platform.window.activity.n0.e(windowInsets);
        }
        this.f87629f.d(this);
        return windowInsets;
    }
}

package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class k0 implements ym5.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.n0 f103790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f103791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103792c;

    public k0(com.tencent.mm.plugin.finder.convert.n0 n0Var, int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f103790a = n0Var;
        this.f103791b = i17;
        this.f103792c = baseFinderFeed;
    }

    @Override // ym5.i1
    public void a(android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.convert.i0 i0Var = this.f103790a.f104053h;
        if (i0Var != null) {
            i0Var.a(this.f103791b, this.f103792c, view);
        }
    }
}

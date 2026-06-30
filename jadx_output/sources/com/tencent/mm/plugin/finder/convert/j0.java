package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class j0 implements com.tencent.mm.plugin.finder.view.js {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.n0 f103705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f103706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103707c;

    public j0(com.tencent.mm.plugin.finder.convert.n0 n0Var, int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f103705a = n0Var;
        this.f103706b = i17;
        this.f103707c = baseFinderFeed;
    }

    @Override // com.tencent.mm.plugin.finder.view.js
    public boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(view, "view");
        if (motionEvent == null) {
            return false;
        }
        com.tencent.mm.plugin.finder.convert.i0 i0Var = this.f103705a.f104053h;
        if (i0Var == null) {
            return true;
        }
        i0Var.a(this.f103706b, this.f103707c, view);
        return true;
    }
}

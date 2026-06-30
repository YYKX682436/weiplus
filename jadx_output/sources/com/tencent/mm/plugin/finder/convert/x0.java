package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class x0 implements com.tencent.mm.plugin.finder.view.js {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.b1 f104918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f104919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f104920c;

    public x0(com.tencent.mm.plugin.finder.convert.b1 b1Var, int i17, so2.u1 u1Var) {
        this.f104918a = b1Var;
        this.f104919b = i17;
        this.f104920c = u1Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.js
    public boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(view, "view");
        if (motionEvent == null) {
            return false;
        }
        com.tencent.mm.plugin.finder.convert.i0 i0Var = this.f104918a.f102916t;
        if (i0Var == null) {
            return true;
        }
        i0Var.a(this.f104919b, this.f104920c, view);
        return true;
    }
}

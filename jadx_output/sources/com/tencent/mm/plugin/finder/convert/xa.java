package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class xa implements ym5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f104940c;

    public xa(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, int i17) {
        this.f104938a = qeVar;
        this.f104939b = s0Var;
        this.f104940c = i17;
    }

    @Override // ym5.d1
    public void a(android.view.View view, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(e17, "e");
        this.f104938a.t0(this.f104939b, view, e17, this.f104940c);
    }
}

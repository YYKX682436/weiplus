package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class h3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f103549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(in5.s0 s0Var, so2.y0 y0Var) {
        super(0);
        this.f103548d = s0Var;
        this.f103549e = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f103548d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.report.u.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        so2.y0 y0Var = this.f103549e;
        ((com.tencent.mm.plugin.finder.report.u) a17).R6(y0Var.f410703d.field_feedId, y0Var);
        return jz5.f0.f302826a;
    }
}

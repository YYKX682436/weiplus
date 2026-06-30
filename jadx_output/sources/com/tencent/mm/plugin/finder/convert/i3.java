package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f103634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f103636f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(kotlin.jvm.internal.c0 c0Var, in5.s0 s0Var, so2.y0 y0Var) {
        super(2);
        this.f103634d = c0Var;
        this.f103635e = s0Var;
        this.f103636f = y0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).longValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        kotlin.jvm.internal.c0 c0Var = this.f103634d;
        if (!c0Var.f310112d) {
            c0Var.f310112d = true;
            android.content.Context context = this.f103635e.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.report.u.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            so2.y0 y0Var = this.f103636f;
            ((com.tencent.mm.plugin.finder.report.u) a17).X6(y0Var.f410703d.field_feedId, y0Var, longValue);
        }
        return jz5.f0.f302826a;
    }
}

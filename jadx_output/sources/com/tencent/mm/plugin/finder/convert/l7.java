package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class l7 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f103899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f103900c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f103901d;

    public l7(in5.s0 s0Var, so2.y0 y0Var, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.f0 f0Var) {
        this.f103898a = s0Var;
        this.f103899b = y0Var;
        this.f103900c = c0Var;
        this.f103901d = f0Var;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return this.f103899b.getItemId();
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = this.f103898a.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c17).Gk(context, this.f103899b.f410703d.field_feedId, (r18 & 4) != 0 ? false : false, (r18 & 8) != 0 ? false : this.f103900c.f310112d, this.f103901d.f310116d, (r18 & 32) != 0 ? false : false);
        }
    }
}

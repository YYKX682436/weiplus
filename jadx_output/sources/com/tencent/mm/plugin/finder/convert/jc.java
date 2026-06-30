package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class jc extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103741b;

    public jc(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f103740a = baseFinderFeed;
        this.f103741b = s0Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17 && ((java.lang.Number) ae2.in.f3688a.u().r()).intValue() == 1) {
            so2.k2 k2Var = so2.o2.f410517f;
            so2.o2 a17 = k2Var.a();
            so2.o2 a18 = k2Var.a();
            long id6 = this.f103740a.getFeedObject().getId();
            android.content.Context context = this.f103741b.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            a17.h(0, a18.c(id6, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n), null, null, view);
        }
    }
}

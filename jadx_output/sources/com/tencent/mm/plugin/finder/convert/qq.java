package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class qq extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dm.pd f104416a;

    public qq(dm.pd pdVar) {
        this.f104416a = pdVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        dm.pd pdVar = this.f104416a;
        if (z17) {
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.uo) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.uo.class)).R6(view, "[Firecracker]", pdVar.field_id, true);
            return;
        }
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.uo uoVar = (com.tencent.mm.plugin.finder.viewmodel.component.uo) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.uo.class);
        kz5.h0.B(uoVar.f136149e, new com.tencent.mm.plugin.finder.viewmodel.component.to(uoVar, pdVar.field_id));
    }
}

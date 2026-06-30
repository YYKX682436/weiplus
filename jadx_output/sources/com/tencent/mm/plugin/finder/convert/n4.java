package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class n4 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public so2.y0 f104074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f104076c;

    public n4(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.u4 u4Var) {
        this.f104075b = s0Var;
        this.f104076c = u4Var;
    }

    @Override // ym5.n0
    public boolean getAdditionalCondition(android.view.View target) {
        kotlin.jvm.internal.o.g(target, "target");
        android.content.Context context = target.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ha haVar = (com.tencent.mm.plugin.finder.viewmodel.component.ha) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
        int O6 = haVar != null ? haVar.O6() : -1;
        android.content.Context context2 = this.f104075b.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.report.u.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (O6 == -1 || O6 == 1) && ((com.tencent.mm.plugin.finder.report.u) a17).f125374f;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return ((so2.y0) this.f104075b.f293125i).getItemId();
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        so2.y0 y0Var;
        kotlin.jvm.internal.o.g(view, "view");
        in5.s0 s0Var = this.f104075b;
        so2.y0 y0Var2 = (so2.y0) s0Var.f293125i;
        if (!y0Var2.f410703d.a1()) {
            if (!z17 || (y0Var = this.f104074a) == null) {
                return;
            }
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.report.u.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ((com.tencent.mm.plugin.finder.report.u) a17).U6(context2, y0Var, y0Var2.f410707h);
            this.f104074a = null;
            return;
        }
        if (!z17) {
            this.f104074a = null;
            android.content.Context context3 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a18 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.report.u.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            android.content.Context context4 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context4, "getContext(...)");
            ((com.tencent.mm.plugin.finder.report.u) a18).U6(context4, y0Var2, y0Var2.f410707h);
            return;
        }
        this.f104074a = y0Var2;
        this.f104076c.getClass();
        android.graphics.Rect rect = new android.graphics.Rect();
        s0Var.itemView.getLocalVisibleRect(rect);
        y0Var2.f410707h = rect.height() > s0Var.o().computeVerticalScrollOffset();
        android.content.Context context5 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context5, "getContext(...)");
        pf5.z zVar3 = pf5.z.f353948a;
        if (!(context5 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a19 = zVar3.a((androidx.appcompat.app.AppCompatActivity) context5).a(com.tencent.mm.plugin.finder.report.u.class);
        kotlin.jvm.internal.o.f(a19, "get(...)");
        android.content.Context context6 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context6, "getContext(...)");
        ((com.tencent.mm.plugin.finder.report.u) a19).S6(context6, y0Var2, y0Var2.f410707h);
    }
}

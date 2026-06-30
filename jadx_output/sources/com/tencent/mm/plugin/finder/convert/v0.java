package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class v0 extends com.tencent.mm.plugin.finder.view.is {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.SimpleTouchableLayout f104755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.b1 f104756c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f104757d;

    public v0(in5.s0 s0Var, com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout, com.tencent.mm.plugin.finder.convert.b1 b1Var, long j17) {
        this.f104754a = s0Var;
        this.f104755b = simpleTouchableLayout;
        this.f104756c = b1Var;
        this.f104757d = j17;
    }

    @Override // com.tencent.mm.plugin.finder.view.is
    public boolean a(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = this.f104755b;
        return new android.graphics.Rect(0, 0, simpleTouchableLayout.getWidth(), simpleTouchableLayout.getBottom()).contains((int) e17.getX(), (int) e17.getY());
    }

    @Override // com.tencent.mm.plugin.finder.view.is
    public void b(android.view.View view, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(e17, "e");
        in5.s0 s0Var = this.f104754a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) a17;
        finderSpeedControlUIC.c7(s0Var, e17, -1);
        com.tencent.mm.plugin.finder.convert.b1 b1Var = this.f104756c;
        long j17 = this.f104757d;
        b1Var.B = j17;
        b1Var.f102920x.invoke(view, java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.finder.convert.b1.v(b1Var, s0Var, true);
        if (finderSpeedControlUIC.f133650u) {
            androidx.recyclerview.widget.RecyclerView o17 = s0Var.o();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = o17 != null ? o17.getLayoutManager() : null;
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
            if (finderLinearLayoutManager != null) {
                finderLinearLayoutManager.D = false;
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.is
    public java.lang.Integer c(android.view.MotionEvent motionEvent) {
        android.view.ViewConfiguration viewConfiguration;
        in5.s0 s0Var = this.f104754a;
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
        int i17 = 4;
        if ((motionEvent == null || finderFullSeekBarLayout == null || !finderFullSeekBarLayout.m(this.f104755b, motionEvent)) && (viewConfiguration = android.view.ViewConfiguration.get(s0Var.f293121e)) != null) {
            i17 = viewConfiguration.getScaledTouchSlop();
        }
        return java.lang.Integer.valueOf(i17);
    }
}

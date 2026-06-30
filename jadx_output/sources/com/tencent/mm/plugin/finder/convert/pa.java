package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class pa extends com.tencent.mm.plugin.finder.view.is {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.SimpleTouchableLayout f104248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f104249c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout f104250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104251e;

    public pa(in5.s0 s0Var, com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout, android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout, com.tencent.mm.plugin.finder.convert.qe qeVar) {
        this.f104247a = s0Var;
        this.f104248b = simpleTouchableLayout;
        this.f104249c = viewGroup;
        this.f104250d = finderFeedNewSeekBarLayout;
        this.f104251e = qeVar;
    }

    @Override // com.tencent.mm.plugin.finder.view.is
    public boolean a(android.view.MotionEvent ev6) {
        boolean z17;
        vx2.k fastSeekHelper;
        boolean contains;
        kotlin.jvm.internal.o.g(ev6, "ev");
        com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = this.f104248b;
        int i17 = pm0.v.s(simpleTouchableLayout)[1];
        android.view.ViewGroup footerLayout = this.f104249c;
        kotlin.jvm.internal.o.f(footerLayout, "$footerLayout");
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, simpleTouchableLayout.getWidth(), (pm0.v.s(footerLayout)[1] - 50) - i17);
        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout = this.f104250d;
        if (finderFeedNewSeekBarLayout != null && (fastSeekHelper = finderFeedNewSeekBarLayout.getFastSeekHelper()) != null) {
            if (fastSeekHelper.h()) {
                android.graphics.Rect rect2 = new android.graphics.Rect();
                android.view.ViewGroup viewGroup = fastSeekHelper.f441255g;
                if (viewGroup != null) {
                    viewGroup.getGlobalVisibleRect(rect2);
                }
                contains = rect2.contains((int) ev6.getX(), (int) ev6.getY());
            } else {
                contains = false;
            }
            if (contains) {
                z17 = true;
                return (rect.contains((int) ev6.getX(), (int) ev6.getY()) || z17) ? false : true;
            }
        }
        z17 = false;
        if (rect.contains((int) ev6.getX(), (int) ev6.getY())) {
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.is
    public void b(android.view.View view, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(e17, "e");
        in5.s0 s0Var = this.f104247a;
        java.lang.Object obj = s0Var.f293125i;
        kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
        this.f104251e.u0(s0Var, view, (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj, e17);
    }

    @Override // com.tencent.mm.plugin.finder.view.is
    public java.lang.Integer c(android.view.MotionEvent motionEvent) {
        android.view.ViewConfiguration viewConfiguration;
        in5.s0 s0Var = this.f104247a;
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
        int i17 = 4;
        if ((motionEvent == null || finderFullSeekBarLayout == null || !finderFullSeekBarLayout.m(this.f104248b, motionEvent)) && (viewConfiguration = android.view.ViewConfiguration.get(s0Var.f293121e)) != null) {
            i17 = viewConfiguration.getScaledTouchSlop();
        }
        return java.lang.Integer.valueOf(i17);
    }
}

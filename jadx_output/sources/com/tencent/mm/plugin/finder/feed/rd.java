package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class rd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f108903d;

    public rd(com.tencent.mm.plugin.finder.feed.af afVar) {
        this.f108903d = afVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.af afVar = this.f108903d;
        android.widget.ScrollView scrollView = afVar.H;
        if (scrollView == null) {
            kotlin.jvm.internal.o.o("sv");
            throw null;
        }
        int height = scrollView.getHeight();
        android.widget.ScrollView scrollView2 = afVar.H;
        if (scrollView2 == null) {
            kotlin.jvm.internal.o.o("sv");
            throw null;
        }
        int width = scrollView2.getWidth();
        java.lang.String str = afVar.f106255d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#fixContentLayoutSize realSpace=");
        sb6.append(height);
        sb6.append(" height=");
        com.tencent.mm.view.RCConstraintLayout rCConstraintLayout = afVar.f106260i;
        if (rCConstraintLayout == null) {
            kotlin.jvm.internal.o.o("concertTicketViewRoot");
            throw null;
        }
        sb6.append(rCConstraintLayout.getHeight());
        sb6.append(" realWidthSpace=");
        sb6.append(width);
        sb6.append(" width=");
        com.tencent.mm.view.RCConstraintLayout rCConstraintLayout2 = afVar.f106260i;
        if (rCConstraintLayout2 == null) {
            kotlin.jvm.internal.o.o("concertTicketViewRoot");
            throw null;
        }
        sb6.append(rCConstraintLayout2.getWidth());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (height > 0) {
            android.view.View view = afVar.f106259h;
            if (view == null) {
                kotlin.jvm.internal.o.o("ticketAndBottomJumpArea");
                throw null;
            }
            if (view.getHeight() <= 0 || width <= 0) {
                return;
            }
            android.view.View view2 = afVar.f106259h;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("ticketAndBottomJumpArea");
                throw null;
            }
            if (view2.getWidth() > 0) {
                float f17 = height;
                if (afVar.f106259h == null) {
                    kotlin.jvm.internal.o.o("ticketAndBottomJumpArea");
                    throw null;
                }
                float height2 = f17 / r4.getHeight();
                float f18 = width;
                if (afVar.f106259h == null) {
                    kotlin.jvm.internal.o.o("ticketAndBottomJumpArea");
                    throw null;
                }
                float min = java.lang.Math.min(height2, f18 / r4.getWidth());
                com.tencent.mars.xlog.Log.i(afVar.f106255d, "#fixContentLayoutScale " + min);
                if (min >= 1.0f) {
                    android.view.View view3 = afVar.f106259h;
                    if (view3 == null) {
                        kotlin.jvm.internal.o.o("ticketAndBottomJumpArea");
                        throw null;
                    }
                    view3.setScaleX(1.0f);
                    android.view.View view4 = afVar.f106259h;
                    if (view4 != null) {
                        view4.setScaleY(1.0f);
                        return;
                    } else {
                        kotlin.jvm.internal.o.o("ticketAndBottomJumpArea");
                        throw null;
                    }
                }
                android.view.View view5 = afVar.f106259h;
                if (view5 == null) {
                    kotlin.jvm.internal.o.o("ticketAndBottomJumpArea");
                    throw null;
                }
                view5.setPivotY(0.0f);
                android.view.View view6 = afVar.f106259h;
                if (view6 == null) {
                    kotlin.jvm.internal.o.o("ticketAndBottomJumpArea");
                    throw null;
                }
                view6.setScaleX(min);
                android.view.View view7 = afVar.f106259h;
                if (view7 != null) {
                    view7.setScaleY(min);
                } else {
                    kotlin.jvm.internal.o.o("ticketAndBottomJumpArea");
                    throw null;
                }
            }
        }
    }
}

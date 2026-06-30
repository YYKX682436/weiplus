package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class rd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af f190436d;

    public rd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar) {
        this.f190436d = afVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar = this.f190436d;
        android.widget.ScrollView scrollView = afVar.H;
        if (scrollView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sv");
            throw null;
        }
        int height = scrollView.getHeight();
        android.widget.ScrollView scrollView2 = afVar.H;
        if (scrollView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sv");
            throw null;
        }
        int width = scrollView2.getWidth();
        java.lang.String str = afVar.f187788d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#fixContentLayoutSize realSpace=");
        sb6.append(height);
        sb6.append(" height=");
        com.p314xaae8f345.mm.p2776x373aa5.C22797x91382fb8 c22797x91382fb8 = afVar.f187793i;
        if (c22797x91382fb8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("concertTicketViewRoot");
            throw null;
        }
        sb6.append(c22797x91382fb8.getHeight());
        sb6.append(" realWidthSpace=");
        sb6.append(width);
        sb6.append(" width=");
        com.p314xaae8f345.mm.p2776x373aa5.C22797x91382fb8 c22797x91382fb82 = afVar.f187793i;
        if (c22797x91382fb82 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("concertTicketViewRoot");
            throw null;
        }
        sb6.append(c22797x91382fb82.getWidth());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (height > 0) {
            android.view.View view = afVar.f187792h;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ticketAndBottomJumpArea");
                throw null;
            }
            if (view.getHeight() <= 0 || width <= 0) {
                return;
            }
            android.view.View view2 = afVar.f187792h;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ticketAndBottomJumpArea");
                throw null;
            }
            if (view2.getWidth() > 0) {
                float f17 = height;
                if (afVar.f187792h == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ticketAndBottomJumpArea");
                    throw null;
                }
                float height2 = f17 / r4.getHeight();
                float f18 = width;
                if (afVar.f187792h == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ticketAndBottomJumpArea");
                    throw null;
                }
                float min = java.lang.Math.min(height2, f18 / r4.getWidth());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(afVar.f187788d, "#fixContentLayoutScale " + min);
                if (min >= 1.0f) {
                    android.view.View view3 = afVar.f187792h;
                    if (view3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ticketAndBottomJumpArea");
                        throw null;
                    }
                    view3.setScaleX(1.0f);
                    android.view.View view4 = afVar.f187792h;
                    if (view4 != null) {
                        view4.setScaleY(1.0f);
                        return;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ticketAndBottomJumpArea");
                        throw null;
                    }
                }
                android.view.View view5 = afVar.f187792h;
                if (view5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ticketAndBottomJumpArea");
                    throw null;
                }
                view5.setPivotY(0.0f);
                android.view.View view6 = afVar.f187792h;
                if (view6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ticketAndBottomJumpArea");
                    throw null;
                }
                view6.setScaleX(min);
                android.view.View view7 = afVar.f187792h;
                if (view7 != null) {
                    view7.setScaleY(min);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ticketAndBottomJumpArea");
                    throw null;
                }
            }
        }
    }
}

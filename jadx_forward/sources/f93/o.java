package f93;

/* loaded from: classes3.dex */
public final class o extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f341937d;

    /* renamed from: e, reason: collision with root package name */
    public final int f341938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455 f341939f;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455 dialogC16164x43fb9455) {
        this.f341939f = dialogC16164x43fb9455;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f341937d = paint;
        this.f341938e = 1;
        paint.setColor(i65.a.d(dialogC16164x43fb9455.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(c17, parent, state);
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            int u07 = parent.u0(childAt);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
            if (!(mo7946xf939df19 != null && mo7946xf939df19.mo863xcdaf1228(u07) == 1)) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = parent.mo7946xf939df19();
                if (!(mo7946xf939df192 != null && mo7946xf939df192.mo863xcdaf1228(u07) == 3)) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df193 = parent.mo7946xf939df19();
                    if (!(mo7946xf939df193 != null && mo7946xf939df193.mo863xcdaf1228(u07) == 4)) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df194 = parent.mo7946xf939df19();
                        if (!(mo7946xf939df194 != null && mo7946xf939df194.mo863xcdaf1228(u07) == 6)) {
                            int bottom = childAt.getBottom() - this.f341938e;
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df195 = parent.mo7946xf939df19();
                            boolean z17 = mo7946xf939df195 != null && mo7946xf939df195.mo863xcdaf1228(u07) == 2;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455 dialogC16164x43fb9455 = this.f341939f;
                            c17.drawRect(parent.getPaddingLeft() + (z17 ? i65.a.h(dialogC16164x43fb9455.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) : i65.a.h(dialogC16164x43fb9455.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561265dp)), bottom, parent.getWidth() - parent.getPaddingRight(), childAt.getBottom(), this.f341937d);
                        }
                    }
                }
            }
        }
    }
}

package f12;

/* loaded from: classes4.dex */
public final class v implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 f340206d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79) {
        this.f340206d = activityC13254xf536ee79;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79 = this.f340206d;
        f12.c0 c0Var = activityC13254xf536ee79.f178973f;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var.f340105a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int a17 = fp.j0.a(activityC13254xf536ee79.mo55332x76847179(), 0);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13254xf536ee79.mo55332x76847179();
        f12.c0 c0Var2 = activityC13254xf536ee79.f178973f;
        if (c0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        int c17 = i65.a.c(mo55332x76847179, c0Var2.f340105a.getMeasuredHeight() + a17);
        if (c17 > 812) {
            f12.c0 c0Var3 = activityC13254xf536ee79.f178973f;
            if (c0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = c0Var3.f340115k.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = i65.a.b(activityC13254xf536ee79.mo55332x76847179(), ((c17 - gd1.l.f69803x366c91de) / 2) + 94) - a17;
            f12.c0 c0Var4 = activityC13254xf536ee79.f178973f;
            if (c0Var4 != null) {
                c0Var4.f340115k.requestLayout();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
        }
    }
}

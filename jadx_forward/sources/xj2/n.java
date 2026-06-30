package xj2;

/* loaded from: classes3.dex */
public class n extends lj2.j implements android.view.View.OnClickListener {

    /* renamed from: i, reason: collision with root package name */
    public final lj2.x0 f536384i;

    /* renamed from: m, reason: collision with root package name */
    public final fg2.f1 f536385m;

    /* renamed from: n, reason: collision with root package name */
    public final float f536386n;

    /* renamed from: o, reason: collision with root package name */
    public int f536387o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f536388p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, lj2.x0 x0Var) {
        super(context);
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f536384i = x0Var;
        fg2.f1 a17 = fg2.f1.a(com.p314xaae8f345.mm.ui.id.b(context), this, false);
        this.f536385m = a17;
        com.p314xaae8f345.mm.ui.ah a18 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i18 = a18.f278668a;
        if (!z17 && i18 > (i17 = a18.f278669b)) {
            i18 = i17;
        }
        this.f536386n = i18 / 4.0f;
        addView(a17.f343563a);
        a17.f343565c.setVisibility(8);
    }

    /* renamed from: getService */
    public final lj2.x0 m175625xb411027f() {
        return this.f536384i;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "GrabRequestWidget";
    }

    /* renamed from: getViewBinding */
    public final fg2.f1 m175626xd2d0feea() {
        return this.f536385m;
    }

    @Override // lj2.j
    public void l(pm2.a widgetMode, xh2.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widgetMode, "widgetMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.l(widgetMode, data);
        this.f536385m.f343563a.setBackground(p() ? getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cq6) : getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563335cq5));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveVisitorTeamPkGrabPreviewWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveVisitorTeamPkGrabPreviewWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = i19 - i17;
        if (!this.f536388p || this.f536387o == i28) {
            return;
        }
        setAlpha(0.0f);
        this.f536387o = i28;
        m175628x53aeca08(i28 / this.f536386n);
    }

    /* renamed from: setNeedAutoAdjust */
    public final void m175627x505f1856(boolean z17) {
        this.f536388p = z17;
    }

    /* renamed from: setScale */
    public final void m175628x53aeca08(float f17) {
        if (f17 < 0.2f) {
            f17 = 0.3f;
        }
        post(new xj2.m(this, f17));
    }

    public final void v(int i17, float f17) {
        fg2.f1 f1Var = this.f536385m;
        f1Var.f343565c.setTextSize(1, f17);
        android.view.ViewGroup.LayoutParams layoutParams = f1Var.f343564b.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i17;
            layoutParams.height = i17;
        }
        setAlpha(1.0f);
        f1Var.f343564b.requestLayout();
    }
}

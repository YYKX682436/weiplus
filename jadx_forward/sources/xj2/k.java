package xj2;

/* loaded from: classes3.dex */
public final class k extends lj2.j implements android.view.View.OnClickListener {

    /* renamed from: i, reason: collision with root package name */
    public final lj2.x0 f536376i;

    /* renamed from: m, reason: collision with root package name */
    public final fg2.e1 f536377m;

    /* renamed from: n, reason: collision with root package name */
    public final float f536378n;

    /* renamed from: o, reason: collision with root package name */
    public int f536379o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f536380p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, lj2.x0 x0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(context);
        int i18;
        x0Var = (i17 & 2) != 0 ? null : x0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f536376i = x0Var;
        fg2.e1 a17 = fg2.e1.a(com.p314xaae8f345.mm.ui.id.b(context), this, false);
        this.f536377m = a17;
        com.p314xaae8f345.mm.ui.ah a18 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i19 = a18.f278668a;
        if (!z17 && i19 > (i18 = a18.f278669b)) {
            i19 = i18;
        }
        this.f536378n = i19 / 3.0f;
        addView(a17.f343551a);
        a17.f343552b.f343827b.setVisibility(8);
        a17.f343554d.setVisibility(8);
    }

    /* renamed from: getService */
    public final lj2.x0 m175622xb411027f() {
        return this.f536376i;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "VisitorSinglePkGrabPreviewWidget";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        lj2.x0 x0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveVisitorSinglePkGrabPreviewWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.f536377m.f343551a.getId();
        if (valueOf != null && valueOf.intValue() == id6 && (x0Var = this.f536376i) != null) {
            x0Var.S(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveVisitorSinglePkGrabPreviewWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = i19 - i17;
        if (!this.f536380p || this.f536379o == i28) {
            return;
        }
        m175624x53aeca08(i28 / this.f536378n);
        this.f536379o = i28;
    }

    /* renamed from: setNeedAutoAdjust */
    public final void m175623x505f1856(boolean z17) {
        this.f536380p = z17;
    }

    /* renamed from: setScale */
    public final void m175624x53aeca08(float f17) {
        if (f17 < 0.2f) {
            f17 = 0.3f;
        }
        int b17 = (int) (i65.a.b(getContext(), 24) * f17);
        float f18 = 14 * f17;
        fg2.e1 e1Var = this.f536377m;
        e1Var.f343554d.setTextSize(1, f18);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = e1Var.f343553c;
        android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = b17;
            layoutParams.height = b17;
        }
        c22699x3dcdb352.requestLayout();
    }
}

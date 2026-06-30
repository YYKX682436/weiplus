package wj2;

/* loaded from: classes10.dex */
public final class g0 extends lj2.j implements android.view.View.OnClickListener {

    /* renamed from: i, reason: collision with root package name */
    public final lj2.x0 f528210i;

    /* renamed from: m, reason: collision with root package name */
    public int f528211m;

    /* renamed from: n, reason: collision with root package name */
    public final fg2.k0 f528212n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f528213o;

    /* renamed from: p, reason: collision with root package name */
    public int f528214p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f528215q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.content.Context context, lj2.x0 x0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(context);
        x0Var = (i17 & 2) != 0 ? null : x0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f528210i = x0Var;
        fg2.k0 a17 = fg2.k0.a(com.p314xaae8f345.mm.ui.id.b(context), this, false);
        this.f528212n = a17;
        android.widget.TextView tagTextView = a17.f343645b.f343827b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tagTextView, "tagTextView");
        this.f528213o = tagTextView;
        com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q()) {
            com.p314xaae8f345.mm.ui.bk.A();
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = a17.f343644a;
        addView(c1073x7e08a787);
        if (zl2.r4.f555483a.w1() || x0Var == null) {
            return;
        }
        c1073x7e08a787.setOnClickListener(this);
    }

    /* renamed from: getEndViewSize */
    private final float m174002xc57bdd0b() {
        boolean z17;
        float f17;
        float f18;
        int i17;
        int i18;
        if (m145851x309290b1() == pm2.a.f438390m) {
            com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.lang.System.nanoTime();
            z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            int i19 = a17.f278668a;
            if (!z17 && i19 > (i18 = a17.f278669b)) {
                i19 = i18;
            }
            f17 = i19;
            f18 = 3.0f;
        } else {
            com.p314xaae8f345.mm.ui.ah a18 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.lang.System.nanoTime();
            z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            int i27 = a18.f278668a;
            if (!z17 && i27 > (i17 = a18.f278669b)) {
                i27 = i17;
            }
            f17 = i27;
            f18 = 4.0f;
        }
        return f17 / f18;
    }

    /* renamed from: getService */
    public final lj2.x0 m174003xb411027f() {
        return this.f528210i;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "GrabRequestWidget";
    }

    @Override // lj2.j
    public void l(pm2.a widgetMode, xh2.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widgetMode, "widgetMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.l(widgetMode, data);
        this.f528211m = data.f536054b.f536086e;
        this.f528212n.f343647d.setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dw8));
        s(this.f528213o);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        lj2.x0 x0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicGrabRequestWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.f528212n.f343644a.getId();
        if (valueOf != null && valueOf.intValue() == id6 && (x0Var = this.f528210i) != null) {
            x0Var.S(this.f528211m);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicGrabRequestWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = i19 - i17;
        if (!this.f528215q || this.f528214p == i28) {
            return;
        }
        this.f528214p = i28;
        setAlpha(0.0f);
        m174005x53aeca08(i28 / m174002xc57bdd0b());
    }

    /* renamed from: setNeedAutoAdjust */
    public final void m174004x505f1856(boolean z17) {
        this.f528215q = z17;
    }

    /* renamed from: setScale */
    public final void m174005x53aeca08(float f17) {
        if (f17 < 0.2f) {
            f17 = 0.3f;
        }
        post(new wj2.f0(this, f17));
    }

    public final void v(int i17, float f17) {
        fg2.k0 k0Var = this.f528212n;
        k0Var.f343647d.setTextSize(1, f17);
        android.view.ViewGroup.LayoutParams layoutParams = k0Var.f343646c.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i17;
            layoutParams.height = i17;
        }
        setAlpha(1.0f);
        k0Var.f343644a.requestLayout();
    }
}

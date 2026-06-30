package lp1;

/* loaded from: classes14.dex */
public final class b extends in5.s0 {

    /* renamed from: v, reason: collision with root package name */
    public static final int f401801v = qp1.e0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2791xca247920.p2792xbddafb2a.C22856x436a4cd0 f401802n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.FrameLayout f401803o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 f401804p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12927xb2f1d9af f401805q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f401806r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.RelativeLayout f401807s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f401808t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Boolean f401809u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f564870sh2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.p2791xca247920.p2792xbddafb2a.C22856x436a4cd0 c22856x436a4cd0 = (com.p314xaae8f345.mm.p2776x373aa5.p2791xca247920.p2792xbddafb2a.C22856x436a4cd0) findViewById;
        this.f401802n = c22856x436a4cd0;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f564867ad3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.acy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f401803o = (android.widget.FrameLayout) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.sgz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f401804p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) findViewById4;
        android.view.View findViewById5 = view.findViewById(com.p314xaae8f345.mm.R.id.f564866sh0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f401805q = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12927xb2f1d9af) findViewById5;
        android.view.View findViewById6 = view.findViewById(com.p314xaae8f345.mm.R.id.f564864ad1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById6;
        this.f401806r = c22699x3dcdb352;
        android.view.View findViewById7 = view.findViewById(com.p314xaae8f345.mm.R.id.f564865ad2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById7;
        this.f401807s = relativeLayout;
        android.view.View findViewById8 = view.findViewById(com.p314xaae8f345.mm.R.id.f564869sh1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f401808t = findViewById8;
        c22856x436a4cd0.m82952xc74465db(pp1.b.f438928d);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12927xb2f1d9af) findViewById2).m54164x205ac394(pp1.b.f438932h);
        android.content.Context context = view.getContext();
        qp1.g0.e(c22699x3dcdb352, qp1.e0.a(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9)), qp1.e0.a(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz)));
        y();
        qp1.g0.e(relativeLayout, qp1.c0.f447233i, qp1.c0.f447234j);
        c22856x436a4cd0.a(false);
    }

    public final void x() {
        android.widget.RelativeLayout relativeLayout = this.f401807s;
        if (relativeLayout.getVisibility() != 8) {
            relativeLayout.setVisibility(8);
        }
        relativeLayout.setAlpha(0.0f);
    }

    public final void y() {
        int i17 = f401801v;
        this.f401804p.m81436x205ac394(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12927xb2f1d9af c12927xb2f1d9af = this.f401805q;
        c12927xb2f1d9af.m54164x205ac394(i17);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12914xc9f89b34.f174918q;
        c12927xb2f1d9af.a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12914xc9f89b34.f174920s, this.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aku));
    }

    public final void z(android.view.View view, boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = null;
        } else if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            if (z17) {
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.removeRule(20);
                layoutParams2.addRule(21);
            } else {
                android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                layoutParams3.removeRule(21);
                layoutParams3.addRule(20);
            }
        }
        view.setLayoutParams(layoutParams);
    }
}

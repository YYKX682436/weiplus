package k23;

/* loaded from: classes12.dex */
public final class x extends k23.q {

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f385276o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f385277p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f385278q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(k23.d0 params, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity) {
        super(params, activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.widget.RelativeLayout b17 = m141837x5db1ca2().b();
        b17.setPadding(b17.getPaddingLeft(), (int) b17.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.ajr), b17.getPaddingRight(), b17.getPaddingBottom());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c17 = m141837x5db1ca2().c();
        int dimension = (int) c17.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.ajw);
        c17.setPadding(dimension, c17.getPaddingTop(), dimension, c17.getPaddingBottom());
        g();
        float dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        android.view.View a17 = m141837x5db1ca2().a();
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(i65.a.d(a17.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        gradientDrawable.setCornerRadii(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f, 0.0f, 0.0f});
        a17.setBackground(gradientDrawable);
        m141837x5db1ca2().f().setTextSize(0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz) * z50.i.f551699a.b());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c18 = m141837x5db1ca2().c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getRecognizedText(...)");
        c18.setTextSize(0, i65.a.f(c18.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561387h3) * i65.a.m(c18.getContext()));
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        m141837x5db1ca2().c().setHint((java.lang.String) ((jz5.n) new k23.c(context).f385068c).mo141623x754a37bb());
        this.f385276o = jz5.h.b(new k23.s(this));
        this.f385277p = jz5.h.b(new k23.w(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.tyr);
        this.f385278q = findViewById;
        findViewById.setOnClickListener(k23.r.f385209d);
    }

    /* renamed from: getNavigationBarColorInPanel */
    private final int m141856x14a0b45() {
        return ((java.lang.Number) ((jz5.n) this.f385276o).mo141623x754a37bb()).intValue();
    }

    /* renamed from: getStatusBarColorInPanel */
    private final int m141857xd50442a7() {
        return ((java.lang.Number) ((jz5.n) this.f385277p).mo141623x754a37bb()).intValue();
    }

    @Override // k23.q
    public void b(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        k23.d0 m141835x29c21c7c = m141835x29c21c7c();
        m141835x29c21c7c.getClass();
        k23.w0 w0Var = k23.w0.f385269f;
        k23.w0 w0Var2 = m141835x29c21c7c.f385081e;
        if ((w0Var2 == w0Var || w0Var2 == k23.w0.f385268e) ? false : true) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ofFloat);
            ofFloat.addListener(new k23.u(this));
            ofFloat.addUpdateListener(new k23.t(this, ofFloat));
            ofFloat.setDuration(300L);
            list.add(ofFloat);
        }
    }

    @Override // k23.q
    public void c() {
        em.i0 i0Var = this.f385190f;
        android.view.View[] viewArr = {i0Var.a(), i0Var.b()};
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            android.view.View view = viewArr[i17];
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView", "resetUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView", "resetUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setTranslationY(0.0f);
            i17++;
        }
        m141841x765082ba(false);
        f();
        m141838x6fea3ce5("");
        m141841x765082ba(false);
        i0Var.e().d();
        android.view.View view2 = this.f385278q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelViewHalfScreen", "resetUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelViewHalfScreen", "resetUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f385278q;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelViewHalfScreen", "resetUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelViewHalfScreen", "resetUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void g() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById(com.p314xaae8f345.mm.R.id.tys);
        if (c1073x7e08a787 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = c1073x7e08a787.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = (int) (m141836xe946cf29() * m141835x29c21c7c().f385088l);
            c1073x7e08a787.setLayoutParams(layoutParams2);
        }
    }

    @Override // k23.q
    /* renamed from: getLayoutId */
    public int mo141834x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ef_;
    }

    /* renamed from: getTargetActivityBarColor */
    public final java.lang.Integer[] m141858x53a819e6() {
        return m141835x29c21c7c().f385081e == k23.w0.f385269f ? new java.lang.Integer[]{null, java.lang.Integer.valueOf(m141856x14a0b45())} : new java.lang.Integer[]{java.lang.Integer.valueOf(m141857xd50442a7()), java.lang.Integer.valueOf(m141856x14a0b45())};
    }
}

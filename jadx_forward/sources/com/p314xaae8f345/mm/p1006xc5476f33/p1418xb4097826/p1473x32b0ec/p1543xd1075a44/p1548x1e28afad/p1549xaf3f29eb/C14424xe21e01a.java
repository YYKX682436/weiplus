package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\r¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveSongInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lhn2/l;", "Lhn2/m;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "Ljz5/f0;", "setScene", "Landroid/view/View;", "getAuditionPlayView", "getAuditionProgressView", "Lcom/tencent/mm/view/MMPAGView;", "getAuditionPlayingAnim", "getAuditionBackgroundView", "Landroid/widget/TextView;", "getMusicNameView", "getMusicDurationView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView */
/* loaded from: classes10.dex */
public final class C14424xe21e01a extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 implements hn2.l {
    public final android.widget.TextView A;
    public final android.widget.TextView B;
    public final android.widget.TextView C;
    public final android.widget.TextView D;
    public hn2.m E;
    public boolean F;
    public p3325xe03a0797.p3326xc267989b.r2 G;
    public final p3325xe03a0797.p3326xc267989b.y0 H;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f201313v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f201314w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f201315x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f201316y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 f201317z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14424xe21e01a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void A(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, boolean z17) {
        if (str == null) {
            str = "";
        }
        this.A.setText(str);
        if (str2 == null) {
            str2 = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append(' ');
        java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / 60), java.lang.Integer.valueOf(i17 % 60)}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        sb6.append(format);
        this.C.setText(sb6.toString());
        this.B.setVisibility(z17 ? 0 : 8);
        boolean z18 = str3 == null || str3.length() == 0;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = this.f201313v;
        if (z18) {
            c22628xfde5d61d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.co_);
            return;
        }
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
        mn2.q3 q3Var = new mn2.q3(str3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        yo0.f fVar = new yo0.f();
        fVar.f545616g = com.p314xaae8f345.mm.R.C30861xcebc809e.co_;
        d1Var.b(q3Var, fVar.a()).b(c22628xfde5d61d, true);
    }

    public final void B() {
        if (this.F) {
            return;
        }
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        this.f201317z.m82583xcde73672(-1);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.G;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.G = p3325xe03a0797.p3326xc267989b.l.d(this.H, null, null, new hn2.j(this, null), 3, null);
    }

    @Override // hn2.l
    /* renamed from: getAuditionBackgroundView, reason: from getter */
    public android.view.View getF201314w() {
        return this.f201314w;
    }

    @Override // hn2.l
    /* renamed from: getAuditionPlayView */
    public android.view.View mo10748xe32858dc() {
        return this.f201315x;
    }

    @Override // hn2.l
    /* renamed from: getAuditionPlayingAnim */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b mo10749x89e0979c() {
        return this.f201317z;
    }

    @Override // hn2.l
    /* renamed from: getAuditionProgressView, reason: from getter */
    public android.view.View getF201316y() {
        return this.f201316y;
    }

    /* renamed from: getMusicDurationView, reason: from getter */
    public final android.widget.TextView getC() {
        return this.C;
    }

    /* renamed from: getMusicNameView, reason: from getter */
    public final android.widget.TextView getA() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.G;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.G = null;
    }

    /* renamed from: setScene */
    public final void m58158x53aed94a(hn2.m scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.E = scene;
        float f17 = getResources().getDisplayMetrics().density;
        int ordinal = this.E.ordinal();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = this.f201313v;
        if (ordinal == 0) {
            int i17 = (int) (60 * f17);
            c22628xfde5d61d.getLayoutParams().width = i17;
            c22628xfde5d61d.getLayoutParams().height = i17;
        } else if (ordinal == 1) {
            int i18 = (int) (90 * f17);
            c22628xfde5d61d.getLayoutParams().width = i18;
            c22628xfde5d61d.getLayoutParams().height = i18;
        } else if (ordinal == 2) {
            int i19 = (int) (60 * f17);
            c22628xfde5d61d.getLayoutParams().width = i19;
            c22628xfde5d61d.getLayoutParams().height = i19;
            this.f201315x.setVisibility(8);
            android.view.View view = this.f201316y;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveSongInfoView", "applySceneConfig", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveSongInfoView", "applySceneConfig", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c22628xfde5d61d.requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14424xe21e01a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.E = hn2.m.f364068d;
        this.H = p3325xe03a0797.p3326xc267989b.z0.b();
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570523ec1, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.v9c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f201313v = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.v9j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f201314w = findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.v9d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f201315x = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.v9e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f201316y = findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.v9k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f201317z = (com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.v9h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.A = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.v9i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.B = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.v9f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.C = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.v9g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.D = (android.widget.TextView) findViewById9;
    }
}

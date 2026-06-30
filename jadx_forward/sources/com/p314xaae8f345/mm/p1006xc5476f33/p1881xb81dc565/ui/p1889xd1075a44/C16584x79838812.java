package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44;

/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.CollapseView */
/* loaded from: classes14.dex */
public class C16584x79838812 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f231841d;

    /* renamed from: e, reason: collision with root package name */
    public final long f231842e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f231843f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f231844g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f231845h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f231846i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f231847m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f231848n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f231849o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f231850p;

    /* renamed from: q, reason: collision with root package name */
    public final float f231851q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f231852r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageButton f231853s;

    /* renamed from: t, reason: collision with root package name */
    public float f231854t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f231855u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f231856v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f231857w;

    /* renamed from: x, reason: collision with root package name */
    public float f231858x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f231859y;

    public C16584x79838812(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f231842e = 200L;
        this.f231851q = 0.7f;
        this.f231855u = false;
        this.f231856v = false;
        this.f231857w = false;
        this.f231858x = 0.0f;
        this.f231859y = true;
        this.f231841d = context;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c39, this);
        this.f231847m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569155p80);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.i2s);
        this.f231848n = imageView;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.raw.f79634x412ce3f1, -1));
        this.f231846i = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.cgn);
        this.f231845h = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.gwx);
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.jqn);
        this.f231843f = imageView2;
        imageView2.setBackground(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79634x412ce3f1, -1));
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.jqx);
        this.f231844g = relativeLayout;
        int i17 = sj3.i1.f490099k;
        android.view.View view = (android.view.View) relativeLayout.getParent();
        view.post(new sj3.l(relativeLayout, i17, view));
        this.f231844g.setOnClickListener(new sj3.k(this));
        this.f231843f.setRotation(270.0f);
        this.f231846i.setVisibility(4);
    }

    public final void a(android.view.View view) {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(com.p314xaae8f345.mm.ui.bk.h(this.f231841d).x, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        int measuredHeight = view.getMeasuredHeight();
        android.view.View view2 = this.f231849o;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "collapse", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "collapse", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        sj3.r rVar = new sj3.r(this, view, measuredHeight);
        rVar.setDuration(this.f231842e);
        view.startAnimation(rVar);
    }

    public void b(android.view.View view) {
        int i17 = sj3.i1.f490103o;
        int i18 = sj3.i1.f490099k + ((int) ((i17 - r1) * this.f231858x));
        view.getLayoutParams().height = i18;
        view.getLayoutParams().width = i18;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        int i19 = sj3.i1.f490095g;
        layoutParams.bottomMargin = ((int) ((sj3.i1.f490096h - i19) * this.f231858x)) + i19;
        ((android.widget.RelativeLayout.LayoutParams) view.getLayoutParams()).topMargin = (int) (i19 * (1.0f - this.f231858x));
        view.requestLayout();
        this.f231853s.setTag(java.lang.Boolean.valueOf(i18 != i17));
    }

    public final void c(android.view.View view, float f17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f231849o;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(com.p314xaae8f345.mm.ui.bk.h(this.f231841d).x, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        float f18 = view.getLayoutParams().height + f17;
        float measuredHeight = view.getMeasuredHeight();
        if (f18 >= measuredHeight) {
            f18 = measuredHeight;
        } else if (f18 <= 0.0f) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f18 = 0.0f;
        }
        float f19 = f18 / measuredHeight;
        this.f231858x = f19;
        float f27 = this.f231851q;
        if (f19 >= f27) {
            android.view.View view3 = this.f231849o;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f231849o;
            float f28 = this.f231858x;
            float f29 = (((double) (f28 - f27)) + 0.1d) * 2.5d >= 1.0d ? 1.0f : 2.5f * ((f28 - f27) + 0.1f);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(java.lang.Float.valueOf(f29));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        ((android.widget.LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = (int) (this.f231858x * sj3.i1.f490098j);
        ((android.widget.LinearLayout.LayoutParams) view.getLayoutParams()).bottomMargin = (int) (this.f231858x * sj3.i1.f490093e);
        view.getLayoutParams().height = (int) f18;
        view.requestLayout();
    }

    public void d(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f231855u) {
                return;
            }
            this.f231854t = motionEvent.getRawY();
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            float rawY = motionEvent.getRawY() - this.f231854t;
            if (this.f231855u || java.lang.Math.abs(rawY) >= 5.0f) {
                this.f231854t = motionEvent.getRawY();
                if (java.lang.Math.abs(rawY) > 1.0f) {
                    c(this.f231846i, -rawY);
                    b(this.f231853s);
                    h();
                    if (rawY > 0.0f) {
                        this.f231855u = true;
                        this.f231857w = true;
                        this.f231856v = false;
                        return;
                    } else {
                        if (rawY < 0.0f) {
                            this.f231855u = true;
                            this.f231856v = true;
                            this.f231857w = false;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        float f17 = this.f231858x;
        float f18 = this.f231851q;
        if (f17 > f18 && f17 < 1.0f) {
            this.f231856v = true;
            this.f231857w = false;
        } else if (f17 < 1.0f - f18 && f17 > 0.0f) {
            this.f231856v = false;
            this.f231857w = true;
        } else if (f17 != 0.0f && f17 != 1.0f) {
            this.f231856v = !this.f231856v;
            this.f231857w = !this.f231857w;
        }
        if (this.f231856v && this.f231855u) {
            this.f231856v = false;
            c(this.f231846i, 9999.0f);
            b(this.f231853s);
            h();
        } else if (this.f231857w && this.f231855u) {
            this.f231857w = false;
            c(this.f231846i, -9999.0f);
            b(this.f231853s);
            h();
        }
        this.f231855u = false;
    }

    public void e() {
        if (this.f231853s.getTag() == null || this.f231853s.getTag().equals(java.lang.Boolean.TRUE)) {
            f();
        }
        if (this.f231843f.getTag() == null || this.f231843f.getTag().equals(java.lang.Boolean.TRUE)) {
            g();
        }
    }

    public final void f() {
        android.widget.ImageButton imageButton = this.f231853s;
        if (imageButton != null) {
            java.lang.Object tag = imageButton.getTag();
            long j17 = this.f231842e;
            if (tag != null) {
                java.lang.Object tag2 = this.f231853s.getTag();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (!tag2.equals(bool)) {
                    this.f231853s.setTag(bool);
                    android.widget.ImageButton imageButton2 = this.f231853s;
                    sj3.p pVar = new sj3.p(this, imageButton2, sj3.i1.f490103o - sj3.i1.f490099k);
                    pVar.setDuration(j17);
                    imageButton2.startAnimation(pVar);
                    return;
                }
            }
            this.f231853s.setTag(java.lang.Boolean.FALSE);
            android.widget.ImageButton imageButton3 = this.f231853s;
            int i17 = sj3.i1.f490103o;
            imageButton3.measure(i17, i17);
            sj3.o oVar = new sj3.o(this, imageButton3, i17 - sj3.i1.f490099k);
            oVar.setDuration(j17);
            imageButton3.startAnimation(oVar);
        }
    }

    public void g() {
        int i17;
        java.lang.Object tag = this.f231843f.getTag();
        long j17 = this.f231842e;
        if (tag != null) {
            java.lang.Object tag2 = this.f231843f.getTag();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (!tag2.equals(bool)) {
                this.f231843f.setTag(bool);
                a(this.f231846i);
                java.lang.String str = this.f231852r;
                if (str != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.g(2, str, 2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(220L, 31L, 1L, false);
                i17 = 270;
                this.f231843f.animate().setDuration(j17).rotation(i17);
            }
        }
        this.f231843f.setTag(java.lang.Boolean.FALSE);
        android.widget.RelativeLayout relativeLayout = this.f231846i;
        relativeLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(com.p314xaae8f345.mm.ui.bk.h(this.f231841d).x, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        int measuredHeight = relativeLayout.getMeasuredHeight();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(relativeLayout, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        relativeLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(relativeLayout, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = this.f231849o;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        sj3.q qVar = new sj3.q(this, relativeLayout, measuredHeight);
        qVar.setDuration(j17);
        relativeLayout.startAnimation(qVar);
        java.lang.String str2 = this.f231852r;
        if (str2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.g(2, str2, 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(220L, 30L, 1L, false);
        i17 = 90;
        this.f231843f.animate().setDuration(j17).rotation(i17);
    }

    public void h() {
        this.f231843f.setRotation((int) (270 + (this.f231858x * 180.0f)));
        this.f231843f.setTag(java.lang.Boolean.valueOf(this.f231858x == 0.0f));
        this.f231843f.requestLayout();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        d(motionEvent);
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        motionEvent.getAction();
        d(motionEvent);
        return true;
    }

    /* renamed from: setLinkToAutoMobileListener */
    public void m67072x1188427c(sj3.t tVar) {
        if (findViewById(com.p314xaae8f345.mm.R.id.k6o) != null) {
            findViewById(com.p314xaae8f345.mm.R.id.k6o).setOnClickListener(new sj3.s(this, tVar));
        }
    }

    /* renamed from: setRoomKey */
    public void m67073x37dbcc2(java.lang.String str) {
        this.f231852r = str;
    }
}

package xt2;

/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f538459a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f538460b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f538461c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f538462d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f538463e;

    /* renamed from: f, reason: collision with root package name */
    public int f538464f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f538465g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f538466h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f538467i;

    /* renamed from: j, reason: collision with root package name */
    public int f538468j;

    /* renamed from: k, reason: collision with root package name */
    public int f538469k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f538470l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f538471m;

    public p0(android.content.Context context, android.view.ViewGroup parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f538459a = parent;
        this.f538460b = "FinderLiveShopDiscountView";
        this.f538461c = jz5.h.b(new xt2.l0(context, this));
        this.f538462d = jz5.h.b(new xt2.k0(this));
        this.f538463e = jz5.h.b(new xt2.j0(this));
        this.f538465g = jz5.h.b(new xt2.m0(this));
        this.f538466h = jz5.h.b(new xt2.n0(this));
        this.f538470l = jz5.h.b(new xt2.i0(this));
        this.f538471m = jz5.h.b(new xt2.o0(this));
    }

    public final void a(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f538460b, "attachToParent " + i17 + '}');
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), 0);
        if (parent.indexOfChild(d()) == -1) {
            if (i17 <= parent.getChildCount()) {
                parent.addView(d(), i17, layoutParams);
            } else {
                parent.addView(d(), 0, layoutParams);
            }
        }
    }

    public final void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f538460b, "detach " + this.f538468j + " source:" + i17);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.f538471m).mo141623x754a37bb()).d();
        this.f538467i = null;
        this.f538464f = 0;
        this.f538468j = 0;
        this.f538469k = 0;
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.view.View d17 = d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "<get-discountView>(...)");
        r4Var.Q2(d17);
    }

    public final android.widget.TextView c() {
        return (android.widget.TextView) ((jz5.n) this.f538463e).mo141623x754a37bb();
    }

    public final android.view.View d() {
        return (android.view.View) ((jz5.n) this.f538461c).mo141623x754a37bb();
    }

    public final android.widget.TextView e() {
        return (android.widget.TextView) ((jz5.n) this.f538466h).mo141623x754a37bb();
    }

    public final int f() {
        float f17;
        int i17;
        int measuredWidth = d().getMeasuredWidth();
        if (measuredWidth > 0) {
            return measuredWidth;
        }
        jz5.g gVar = this.f538462d;
        float desiredWidth = android.text.Layout.getDesiredWidth(((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).getText().toString(), ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).getPaint());
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        float desiredWidth2 = android.text.Layout.getDesiredWidth(c().getText().toString(), c().getPaint());
        android.view.ViewGroup.LayoutParams layoutParams2 = c().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
        float desiredWidth3 = android.text.Layout.getDesiredWidth(e().getText().toString(), e().getPaint());
        android.view.ViewGroup.LayoutParams layoutParams3 = e().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
        android.view.ViewGroup.LayoutParams layoutParams4 = ((android.view.View) ((jz5.n) this.f538465g).mo141623x754a37bb()).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = (android.view.ViewGroup.MarginLayoutParams) layoutParams4;
        if (this.f538468j > 0) {
            f17 = desiredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + desiredWidth2 + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + desiredWidth3 + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin + marginLayoutParams4.leftMargin;
            i17 = marginLayoutParams4.rightMargin;
        } else {
            f17 = desiredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + desiredWidth3 + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin + marginLayoutParams4.leftMargin;
            i17 = marginLayoutParams4.rightMargin;
        }
        return (int) (f17 + i17);
    }

    public final void g(java.lang.String str, int i17) {
        android.widget.TextView c17 = c();
        if (i17 > 0) {
            str = c().getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.edr, java.lang.Integer.valueOf(i17), str);
        }
        c17.setText(str);
        if (this.f538464f <= 0) {
            float desiredWidth = android.text.Layout.getDesiredWidth(c().getText().toString(), c().getPaint());
            if (desiredWidth > 0.0f) {
                c().getLayoutParams().width = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) + desiredWidth);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f538460b, hashCode() + " countDownTvWidth:" + this.f538464f + " to " + desiredWidth + '(' + c().getLayoutParams().width + ')');
            this.f538464f = (int) desiredWidth;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r11, r45.y64 r12, boolean r13, yz5.a r14) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.p0.h(java.lang.String, r45.y64, boolean, yz5.a):void");
    }
}

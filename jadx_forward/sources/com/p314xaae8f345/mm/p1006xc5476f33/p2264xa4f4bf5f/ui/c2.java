package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 f255292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 f255293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f255294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f255295g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f255296h;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var, java.util.List list, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2) {
        this.f255292d = w1Var;
        this.f255293e = j2Var;
        this.f255294f = list;
        this.f255295g = linearLayout;
        this.f255296h = linearLayout2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var = this.f255292d;
        android.view.ViewGroup.LayoutParams layoutParams = w1Var.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            android.widget.LinearLayout linearLayout = this.f255296h;
            layoutParams2.width = linearLayout.getWidth();
            layoutParams2.height = linearLayout.getHeight();
            w1Var.setLayoutParams(layoutParams2);
            linearLayout.getWidth();
            linearLayout.getHeight();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var = this.f255293e;
        j2Var.f255529f.getClass();
        if (((java.lang.Boolean) ((jz5.n) di4.i.f314320f).mo141623x754a37bb()).booleanValue()) {
            mj4.h hVar = (mj4.h) kz5.n0.Z(this.f255294f);
            java.lang.String l17 = hVar != null ? ((mj4.k) hVar).l() : "";
            android.widget.LinearLayout linearLayout2 = this.f255295g;
            if (linearLayout2 == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18622xe469ff12 c18622xe469ff12 = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18622xe469ff12(j2Var.f255528e, null, 0, 6, null);
            bi4.h1 h1Var = j2Var.f255529f;
            int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h1Var.f102582a, en1.a.a()) ? com.p314xaae8f345.mm.R.C30867xcad56011.pin : com.p314xaae8f345.mm.R.C30867xcad56011.pim;
            android.content.Context context = j2Var.f255528e;
            java.lang.String string = context.getString(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            c18622xe469ff12.m71790x53bfe316(string);
            int applyDimension = (int) android.util.TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics());
            c18622xe469ff12.setPadding(c18622xe469ff12.getPaddingLeft(), applyDimension, c18622xe469ff12.getPaddingRight(), applyDimension);
            c18622xe469ff12.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.x1(j2Var, l17));
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 1;
            layoutParams3.topMargin = (int) android.util.TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
            linearLayout2.addView(c18622xe469ff12, layoutParams3);
            j2Var.f255530g = c18622xe469ff12;
            qj4.s.f445491a.a(j2Var.f255530g, new qj4.l(h1Var.f102582a, true, h1Var.f102584c, l17, null, null, null, 48, null));
        }
    }
}

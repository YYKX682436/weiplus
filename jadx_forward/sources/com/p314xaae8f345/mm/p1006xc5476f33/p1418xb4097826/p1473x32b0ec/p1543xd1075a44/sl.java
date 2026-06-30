package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class sl extends android.widget.PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f201330a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f201331b;

    /* renamed from: c, reason: collision with root package name */
    public long f201332c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f201333d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f201334e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f201335f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f201336g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f201337h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f201338i;

    /* renamed from: j, reason: collision with root package name */
    public int f201339j;

    /* renamed from: k, reason: collision with root package name */
    public int f201340k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kl f201341l;

    /* renamed from: m, reason: collision with root package name */
    public int f201342m;

    /* renamed from: n, reason: collision with root package name */
    public int f201343n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f201344o;

    /* renamed from: p, reason: collision with root package name */
    public int f201345p;

    /* renamed from: q, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f201346q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f201332c = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f201334e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ol.f200840d;
        this.f201335f = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ml.f200613d;
        this.f201336g = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nl.f200725d;
        this.f201337h = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ll.f200483d;
        this.f201339j = context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0);
        this.f201340k = context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96);
        this.f201341l = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kl.f200378e;
        this.f201345p = -1;
        java.lang.Object systemService = context.getSystemService("layout_inflater");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        android.view.View inflate = ((android.view.LayoutInflater) systemService).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.do9, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.r9g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f201330a = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.r1i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f201331b = (android.widget.TextView) findViewById2;
        setBackgroundDrawable(null);
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        update();
    }

    public final jz5.l a(android.view.View view, int[] location) {
        int height;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        int i17 = this.f201342m + 4;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context, i17);
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i18 = location[0];
        int i19 = location[1];
        int ordinal = this.f201341l.ordinal();
        android.widget.TextView textView = this.f201331b;
        android.view.View view2 = this.f201330a;
        if (ordinal == 0) {
            view2.setRotation(0.0f);
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
            layoutParams2.f92426h = 0;
            layoutParams2.f92439q = 0;
            textView.setLayoutParams(layoutParams2);
            if (this.f201344o) {
                getContentView().measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = getContentView().getMeasuredWidth();
                int i27 = view.getContext().getResources().getDisplayMetrics().widthPixels;
                int i28 = this.f201345p;
                if (i28 < 0) {
                    i28 = (i27 - measuredWidth) / 2;
                }
                int width = location[0] + (view.getWidth() / 2);
                android.content.Context context2 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                int a18 = (width - i28) - com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context2, 4);
                int i29 = a18 >= 0 ? a18 : 0;
                android.view.ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams4 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams3;
                layoutParams4.setMarginStart(i29);
                layoutParams4.f92428i = com.p314xaae8f345.mm.R.id.r1i;
                layoutParams4.f92439q = com.p314xaae8f345.mm.R.id.r1i;
                view2.setLayoutParams(layoutParams4);
                i18 = i28;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams6 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams5;
                android.content.Context context3 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                layoutParams6.setMarginStart(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context3, this.f201342m + this.f201343n));
                layoutParams6.f92428i = com.p314xaae8f345.mm.R.id.r1i;
                layoutParams6.f92439q = com.p314xaae8f345.mm.R.id.r1i;
                view2.setLayoutParams(layoutParams6);
                android.view.ViewGroup.LayoutParams layoutParams7 = textView.getLayoutParams();
                if (layoutParams7 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                android.content.Context context4 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
                this.f201343n = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context4, this.f201343n);
                textView.setLayoutParams((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams7);
                i18 -= (this.f201343n + a17) - (view.getWidth() / 2);
            }
            getContentView().measure(makeMeasureSpec, makeMeasureSpec);
            i19 -= getContentView().getMeasuredHeight();
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                android.view.ViewGroup.LayoutParams layoutParams8 = view2.getLayoutParams();
                if (layoutParams8 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams9 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams8;
                android.content.Context context5 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams9).topMargin = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context5, this.f201342m);
                layoutParams9.f92438p = com.p314xaae8f345.mm.R.id.r1i;
                layoutParams9.f92426h = com.p314xaae8f345.mm.R.id.r1i;
                view2.setLayoutParams(layoutParams9);
                view2.setRotation(270.0f);
                android.view.ViewGroup.LayoutParams layoutParams10 = textView.getLayoutParams();
                if (layoutParams10 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams11 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams10;
                layoutParams11.f92426h = 0;
                layoutParams11.f92439q = 0;
                textView.setLayoutParams(layoutParams11);
                getContentView().measure(makeMeasureSpec, makeMeasureSpec);
                i18 -= getContentView().getMeasuredWidth();
                height = view.getHeight() / 2;
            } else if (ordinal == 3) {
                android.view.ViewGroup.LayoutParams layoutParams12 = view2.getLayoutParams();
                if (layoutParams12 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams13 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams12;
                android.content.Context context6 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context6, "getContext(...)");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams13).topMargin = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context6, this.f201342m);
                layoutParams13.f92439q = 0;
                layoutParams13.f92426h = com.p314xaae8f345.mm.R.id.r1i;
                view2.setLayoutParams(layoutParams13);
                view2.setRotation(90.0f);
                android.view.ViewGroup.LayoutParams layoutParams14 = textView.getLayoutParams();
                if (layoutParams14 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams15 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams14;
                layoutParams15.f92426h = 0;
                layoutParams15.f92438p = com.p314xaae8f345.mm.R.id.r9g;
                textView.setLayoutParams(layoutParams15);
                i18 += view.getWidth();
                height = view.getHeight() / 2;
            }
            i19 -= a17 - height;
        } else {
            view2.setRotation(180.0f);
            android.view.ViewGroup.LayoutParams layoutParams16 = textView.getLayoutParams();
            if (layoutParams16 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams17 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams16;
            layoutParams17.f92428i = com.p314xaae8f345.mm.R.id.r9g;
            layoutParams17.f92439q = 0;
            textView.setLayoutParams(layoutParams17);
            if (this.f201344o) {
                getContentView().measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth2 = getContentView().getMeasuredWidth();
                int i37 = view.getContext().getResources().getDisplayMetrics().widthPixels;
                i18 = this.f201345p;
                if (i18 < 0) {
                    i18 = (i37 - measuredWidth2) / 2;
                }
                int width2 = location[0] + (view.getWidth() / 2);
                android.content.Context context7 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context7, "getContext(...)");
                int a19 = (width2 - i18) - com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context7, 4);
                if (a19 < 0) {
                    a19 = 0;
                }
                android.view.ViewGroup.LayoutParams layoutParams18 = view2.getLayoutParams();
                if (layoutParams18 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams19 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams18;
                layoutParams19.setMarginStart(a19);
                layoutParams19.f92426h = 0;
                layoutParams19.f92439q = com.p314xaae8f345.mm.R.id.r1i;
                view2.setLayoutParams(layoutParams19);
            } else {
                android.view.ViewGroup.LayoutParams layoutParams20 = view2.getLayoutParams();
                if (layoutParams20 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams21 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams20;
                android.content.Context context8 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context8, "getContext(...)");
                layoutParams21.setMarginStart(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context8, this.f201342m + this.f201343n));
                layoutParams21.f92426h = 0;
                layoutParams21.f92439q = com.p314xaae8f345.mm.R.id.r1i;
                view2.setLayoutParams(layoutParams21);
                android.view.ViewGroup.LayoutParams layoutParams22 = textView.getLayoutParams();
                if (layoutParams22 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                android.content.Context context9 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context9, "getContext(...)");
                this.f201343n = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context9, this.f201343n);
                textView.setLayoutParams((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams22);
                i18 -= (this.f201343n + a17) - (view.getWidth() / 2);
            }
            i19 += view.getHeight();
        }
        return new jz5.l(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl b() {
        int i17 = this.f201339j;
        android.widget.TextView textView = this.f201331b;
        android.graphics.drawable.Drawable drawable = textView.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563226v2);
        android.graphics.drawable.GradientDrawable gradientDrawable = drawable instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) drawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i17);
        }
        textView.setBackground(gradientDrawable);
        android.view.View view = this.f201330a;
        android.graphics.drawable.Drawable drawable2 = view.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563225v1);
        android.graphics.drawable.RotateDrawable rotateDrawable = drawable2 instanceof android.graphics.drawable.RotateDrawable ? (android.graphics.drawable.RotateDrawable) drawable2 : null;
        if (rotateDrawable != null) {
            android.graphics.drawable.Drawable drawable3 = rotateDrawable.getDrawable();
            android.graphics.drawable.GradientDrawable gradientDrawable2 = drawable3 instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) drawable3 : null;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColor(i17);
            }
            view.setBackground(rotateDrawable);
        }
        textView.setTextColor(this.f201340k);
        return this;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl c(java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        this.f201331b.setText(message);
        return this;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl d(p3325xe03a0797.p3326xc267989b.y0 scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        android.view.View view = this.f201333d;
        if (view != null) {
            if (!view.isAttachedToWindow()) {
                view = null;
            }
            if (view != null) {
                android.content.Context context = view.getContext();
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if ((activity == null) || activity.isFinishing() || activity.isDestroyed()) {
                    this.f201336g.mo152xb9724478();
                    return this;
                }
                p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f201346q;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                this.f201346q = p3325xe03a0797.p3326xc267989b.l.d(scope, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rl(view, this, null), 3, null);
                return this;
            }
        }
        this.f201336g.mo152xb9724478();
        return this;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f201346q;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        super.dismiss();
    }
}

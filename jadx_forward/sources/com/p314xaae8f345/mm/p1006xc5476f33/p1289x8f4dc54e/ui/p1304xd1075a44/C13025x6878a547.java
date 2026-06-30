package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/widget/MPCollapseTextLayout;", "Landroid/widget/RelativeLayout;", "", "maxLines", "Ljz5/f0;", "setMaxLines", "", "hide", "setCollapseButtonHideWhenExpanded", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "getContextTextView", "Landroid/widget/TextView;", "getCollapseButton", "", "collapseText", "setCollapseText", "expandText", "setExpandText", "enableExpand", "setEnableExpand", "", "content", "setContent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ss1/e", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout */
/* loaded from: classes15.dex */
public final class C13025x6878a547 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f176118d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f176119e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f176120f;

    /* renamed from: g, reason: collision with root package name */
    public int f176121g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f176122h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f176123i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f176124m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f176125n;

    /* renamed from: o, reason: collision with root package name */
    public int f176126o;

    /* renamed from: p, reason: collision with root package name */
    public int f176127p;

    /* renamed from: q, reason: collision with root package name */
    public int f176128q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f176129r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f176130s;

    /* renamed from: t, reason: collision with root package name */
    public int f176131t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f176132u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f176133v;

    /* renamed from: w, reason: collision with root package name */
    public int f176134w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f176135x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13025x6878a547(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f176118d = "";
        this.f176121g = 5;
        this.f176132u = "";
        this.f176133v = "";
        this.f176122h = context;
        e(attributeSet);
    }

    public final void a(int i17) {
        if (this.f176130s) {
            android.widget.TextView textView = this.f176124m;
            if (textView == null) {
                return;
            }
            textView.setMaxLines(i17);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f176123i;
        if (c22624x85d69039 != null) {
            c22624x85d69039.m84175x8dd5167d(i17);
        }
    }

    public final void b(int i17) {
        if (this.f176123i == null) {
            return;
        }
        this.f176119e = false;
        android.widget.TextView textView = this.f176125n;
        if (textView != null) {
            textView.setText(this.f176133v);
        }
        boolean z17 = this.f176130s;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f176123i;
        ks5.a i18 = c22624x85d69039 != null ? c22624x85d69039.i(i17, Integer.MAX_VALUE) : null;
        float i19 = i18 != null ? ((ks5.c) i18).i(this.f176121g - 1) : 0.0f;
        if (c(i19, i17)) {
            if (z17) {
                post(new ss1.f(this));
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = this.f176123i;
                if (c22624x85d690392 != null) {
                    c22624x85d690392.j(android.text.TextUtils.TruncateAt.END, 0.0f);
                }
            }
        } else {
            if (z17) {
                post(new ss1.h(this));
                return;
            }
            float max = (this.f176126o + this.f176128q) - java.lang.Math.max(i17 - i19, 0.0f);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690393 = this.f176123i;
            if (c22624x85d690393 != null) {
                c22624x85d690393.j(android.text.TextUtils.TruncateAt.END, max);
            }
            post(new ss1.g(this));
        }
        android.widget.TextView textView2 = this.f176125n;
        android.view.ViewGroup.LayoutParams layoutParams = textView2 != null ? textView2.getLayoutParams() : null;
        if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(3);
            layoutParams2.addRule(12);
        }
    }

    public final boolean c(float f17, int i17) {
        android.widget.TextView textView = this.f176125n;
        int measuredWidth = textView != null ? textView.getMeasuredWidth() : this.f176127p;
        this.f176126o = measuredWidth;
        float f18 = i17 - measuredWidth;
        if (this.f176130s) {
            f18 = (i17 * 3.0f) / 4.0f;
        }
        return f17 < f18;
    }

    public final void d(ks5.a aVar, int i17, int i18) {
        if (this.f176129r) {
            android.widget.TextView textView = this.f176125n;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        if (aVar == null) {
            return;
        }
        this.f176119e = true;
        android.widget.TextView textView2 = this.f176125n;
        if (textView2 != null) {
            textView2.setText(this.f176132u);
        }
        android.widget.TextView textView3 = this.f176125n;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        float i19 = aVar.i(i18 - 1);
        android.widget.TextView textView4 = this.f176125n;
        android.view.ViewGroup.LayoutParams layoutParams = textView4 != null ? textView4.getLayoutParams() : null;
        boolean z17 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams;
        if (z17 && !c(i19, i17)) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(12);
            layoutParams2.removeRule(3);
            layoutParams2.addRule(3, this.f176130s ? com.p314xaae8f345.mm.R.id.f565465ci3 : com.p314xaae8f345.mm.R.id.f565464ci2);
            return;
        }
        if (z17) {
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams3.removeRule(3);
            layoutParams3.addRule(12);
        }
    }

    public final void e(android.util.AttributeSet attributeSet) {
        setClipChildren(false);
        setClipToPadding(false);
        android.content.Context context = this.f176122h;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bob, this);
        this.f176123i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2);
        this.f176125n = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c19);
        this.f176124m = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565465ci3);
        android.widget.TextView textView = this.f176125n;
        if (textView != null) {
            textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int b17 = i65.a.b(context, 30);
        this.f176127p = b17;
        android.widget.TextView textView2 = this.f176125n;
        if (textView2 != null) {
            b17 = textView2.getMeasuredWidth();
        }
        this.f176126o = b17;
        this.f176131t = (int) (i65.a.g(context) * 2.5f);
        this.f176128q = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.j_);
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.al8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f176132u = string;
        java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.al_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        this.f176133v = string2;
    }

    public final void f(java.lang.CharSequence charSequence, boolean z17, boolean z18, ss1.e eVar) {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f176123i;
        ks5.a i17 = c22624x85d69039 != null ? c22624x85d69039.i(this.f176134w, Integer.MAX_VALUE) : null;
        if (eVar != null) {
            eVar.a(i17);
        }
        int i18 = i17 != null ? ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2839xbddafb2a.C23000xc9450414) i17).L : 0;
        if (this.f176130s) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = this.f176123i;
            if (c22624x85d690392 != null) {
                c22624x85d690392.setVisibility(8);
            }
            android.widget.TextView textView2 = this.f176124m;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.widget.TextView textView3 = this.f176125n;
            if (textView3 != null) {
                textView3.setPadding(0, 0, 0, 0);
            }
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690393 = this.f176123i;
            if (c22624x85d690393 != null) {
                c22624x85d690393.setVisibility(0);
            }
            android.widget.TextView textView4 = this.f176124m;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            android.widget.TextView textView5 = this.f176125n;
            if (textView5 != null) {
                textView5.setPadding(0, 0, 0, this.f176131t);
            }
        }
        int i19 = this.f176121g;
        if (i18 <= i19) {
            a(Integer.MAX_VALUE);
            android.widget.TextView textView6 = this.f176125n;
            if (textView6 == null) {
                return;
            }
            textView6.setVisibility(8);
            return;
        }
        if (!z17) {
            a(i19);
        }
        android.widget.TextView textView7 = this.f176125n;
        if (textView7 != null) {
            textView7.setVisibility(0);
        }
        if (z17) {
            d(i17, this.f176134w, i18);
        } else {
            b(this.f176134w);
        }
        if (!z18 || (textView = this.f176125n) == null) {
            return;
        }
        textView.setOnClickListener(new ss1.i(this, i18, eVar));
    }

    /* renamed from: getCollapseButton, reason: from getter */
    public final android.widget.TextView getF176125n() {
        return this.f176125n;
    }

    /* renamed from: getContextTextView, reason: from getter */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 getF176123i() {
        return this.f176123i;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        getMeasuredWidth();
        if (this.f176134w != getMeasuredWidth()) {
            this.f176134w = getMeasuredWidth();
            if (this.f176135x) {
                this.f176135x = false;
                f(this.f176118d, this.f176119e, this.f176120f, null);
            }
        }
    }

    /* renamed from: setCollapseButtonHideWhenExpanded */
    public final void m54424x78d618d6(boolean z17) {
        this.f176129r = z17;
    }

    /* renamed from: setCollapseText */
    public final void m54425x6f2cbfc(java.lang.String collapseText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collapseText, "collapseText");
        this.f176132u = collapseText;
    }

    /* renamed from: setContent */
    public final void m54426xe9f5bdb7(java.lang.CharSequence content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        if (!this.f176118d.equals(content) || this.f176119e || this.f176120f) {
            this.f176118d = content.toString();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f176123i;
            if (c22624x85d69039 != null) {
                c22624x85d69039.m84175x8dd5167d(this.f176121g);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = this.f176123i;
            if (c22624x85d690392 != null) {
                c22624x85d690392.b(content);
            }
            android.widget.TextView textView = this.f176124m;
            if (textView != null) {
                textView.setMaxLines(this.f176121g);
            }
            android.widget.TextView textView2 = this.f176124m;
            if (textView2 != null) {
                textView2.setText(content);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690393 = this.f176123i;
            this.f176130s = c22624x85d690393 != null ? c22624x85d690393.f296711e : false;
            this.f176119e = false;
            this.f176120f = false;
            if (this.f176134w == 0) {
                this.f176135x = true;
            } else {
                this.f176135x = false;
                f(content, false, false, null);
            }
        }
    }

    /* renamed from: setEnableExpand */
    public final void m54427x1aff0f7f(boolean z17) {
        this.f176120f = z17;
    }

    /* renamed from: setExpandText */
    public final void m54428x3c90c0e9(java.lang.String expandText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expandText, "expandText");
        this.f176133v = expandText;
    }

    /* renamed from: setMaxLines */
    public final void m54429x8dd5167d(int i17) {
        this.f176121g = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13025x6878a547(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f176118d = "";
        this.f176121g = 5;
        this.f176132u = "";
        this.f176133v = "";
        this.f176122h = context;
        e(attributeSet);
    }
}

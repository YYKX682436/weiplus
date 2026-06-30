package com.tencent.mm.plugin.brandservice.ui.widget;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/widget/MPCollapseTextLayout;", "Landroid/widget/RelativeLayout;", "", "maxLines", "Ljz5/f0;", "setMaxLines", "", "hide", "setCollapseButtonHideWhenExpanded", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "getContextTextView", "Landroid/widget/TextView;", "getCollapseButton", "", "collapseText", "setCollapseText", "expandText", "setExpandText", "enableExpand", "setEnableExpand", "", "content", "setContent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ss1/e", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class MPCollapseTextLayout extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f94585d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f94586e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f94587f;

    /* renamed from: g, reason: collision with root package name */
    public int f94588g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f94589h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f94590i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f94591m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f94592n;

    /* renamed from: o, reason: collision with root package name */
    public int f94593o;

    /* renamed from: p, reason: collision with root package name */
    public int f94594p;

    /* renamed from: q, reason: collision with root package name */
    public int f94595q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f94596r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f94597s;

    /* renamed from: t, reason: collision with root package name */
    public int f94598t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f94599u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f94600v;

    /* renamed from: w, reason: collision with root package name */
    public int f94601w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f94602x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPCollapseTextLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f94585d = "";
        this.f94588g = 5;
        this.f94599u = "";
        this.f94600v = "";
        this.f94589h = context;
        e(attributeSet);
    }

    public final void a(int i17) {
        if (this.f94597s) {
            android.widget.TextView textView = this.f94591m;
            if (textView == null) {
                return;
            }
            textView.setMaxLines(i17);
            return;
        }
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f94590i;
        if (mMNeat7extView != null) {
            mMNeat7extView.setMaxLines(i17);
        }
    }

    public final void b(int i17) {
        if (this.f94590i == null) {
            return;
        }
        this.f94586e = false;
        android.widget.TextView textView = this.f94592n;
        if (textView != null) {
            textView.setText(this.f94600v);
        }
        boolean z17 = this.f94597s;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f94590i;
        ks5.a i18 = mMNeat7extView != null ? mMNeat7extView.i(i17, Integer.MAX_VALUE) : null;
        float i19 = i18 != null ? ((ks5.c) i18).i(this.f94588g - 1) : 0.0f;
        if (c(i19, i17)) {
            if (z17) {
                post(new ss1.f(this));
            } else {
                com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = this.f94590i;
                if (mMNeat7extView2 != null) {
                    mMNeat7extView2.j(android.text.TextUtils.TruncateAt.END, 0.0f);
                }
            }
        } else {
            if (z17) {
                post(new ss1.h(this));
                return;
            }
            float max = (this.f94593o + this.f94595q) - java.lang.Math.max(i17 - i19, 0.0f);
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView3 = this.f94590i;
            if (mMNeat7extView3 != null) {
                mMNeat7extView3.j(android.text.TextUtils.TruncateAt.END, max);
            }
            post(new ss1.g(this));
        }
        android.widget.TextView textView2 = this.f94592n;
        android.view.ViewGroup.LayoutParams layoutParams = textView2 != null ? textView2.getLayoutParams() : null;
        if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(3);
            layoutParams2.addRule(12);
        }
    }

    public final boolean c(float f17, int i17) {
        android.widget.TextView textView = this.f94592n;
        int measuredWidth = textView != null ? textView.getMeasuredWidth() : this.f94594p;
        this.f94593o = measuredWidth;
        float f18 = i17 - measuredWidth;
        if (this.f94597s) {
            f18 = (i17 * 3.0f) / 4.0f;
        }
        return f17 < f18;
    }

    public final void d(ks5.a aVar, int i17, int i18) {
        if (this.f94596r) {
            android.widget.TextView textView = this.f94592n;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        if (aVar == null) {
            return;
        }
        this.f94586e = true;
        android.widget.TextView textView2 = this.f94592n;
        if (textView2 != null) {
            textView2.setText(this.f94599u);
        }
        android.widget.TextView textView3 = this.f94592n;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        float i19 = aVar.i(i18 - 1);
        android.widget.TextView textView4 = this.f94592n;
        android.view.ViewGroup.LayoutParams layoutParams = textView4 != null ? textView4.getLayoutParams() : null;
        boolean z17 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams;
        if (z17 && !c(i19, i17)) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(12);
            layoutParams2.removeRule(3);
            layoutParams2.addRule(3, this.f94597s ? com.tencent.mm.R.id.f483932ci3 : com.tencent.mm.R.id.f483931ci2);
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
        android.content.Context context = this.f94589h;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.bob, this);
        this.f94590i = (com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.f483931ci2);
        this.f94592n = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c19);
        this.f94591m = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483932ci3);
        android.widget.TextView textView = this.f94592n;
        if (textView != null) {
            textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int b17 = i65.a.b(context, 30);
        this.f94594p = b17;
        android.widget.TextView textView2 = this.f94592n;
        if (textView2 != null) {
            b17 = textView2.getMeasuredWidth();
        }
        this.f94593o = b17;
        this.f94598t = (int) (i65.a.g(context) * 2.5f);
        this.f94595q = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.j_);
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.al8);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f94599u = string;
        java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.al_);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        this.f94600v = string2;
    }

    public final void f(java.lang.CharSequence charSequence, boolean z17, boolean z18, ss1.e eVar) {
        android.widget.TextView textView;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f94590i;
        ks5.a i17 = mMNeat7extView != null ? mMNeat7extView.i(this.f94601w, Integer.MAX_VALUE) : null;
        if (eVar != null) {
            eVar.a(i17);
        }
        int i18 = i17 != null ? ((com.tencent.neattextview.textview.layout.NeatLayout) i17).L : 0;
        if (this.f94597s) {
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = this.f94590i;
            if (mMNeat7extView2 != null) {
                mMNeat7extView2.setVisibility(8);
            }
            android.widget.TextView textView2 = this.f94591m;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.widget.TextView textView3 = this.f94592n;
            if (textView3 != null) {
                textView3.setPadding(0, 0, 0, 0);
            }
        } else {
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView3 = this.f94590i;
            if (mMNeat7extView3 != null) {
                mMNeat7extView3.setVisibility(0);
            }
            android.widget.TextView textView4 = this.f94591m;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            android.widget.TextView textView5 = this.f94592n;
            if (textView5 != null) {
                textView5.setPadding(0, 0, 0, this.f94598t);
            }
        }
        int i19 = this.f94588g;
        if (i18 <= i19) {
            a(Integer.MAX_VALUE);
            android.widget.TextView textView6 = this.f94592n;
            if (textView6 == null) {
                return;
            }
            textView6.setVisibility(8);
            return;
        }
        if (!z17) {
            a(i19);
        }
        android.widget.TextView textView7 = this.f94592n;
        if (textView7 != null) {
            textView7.setVisibility(0);
        }
        if (z17) {
            d(i17, this.f94601w, i18);
        } else {
            b(this.f94601w);
        }
        if (!z18 || (textView = this.f94592n) == null) {
            return;
        }
        textView.setOnClickListener(new ss1.i(this, i18, eVar));
    }

    /* renamed from: getCollapseButton, reason: from getter */
    public final android.widget.TextView getF94592n() {
        return this.f94592n;
    }

    /* renamed from: getContextTextView, reason: from getter */
    public final com.tencent.mm.ui.widget.MMNeat7extView getF94590i() {
        return this.f94590i;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        getMeasuredWidth();
        if (this.f94601w != getMeasuredWidth()) {
            this.f94601w = getMeasuredWidth();
            if (this.f94602x) {
                this.f94602x = false;
                f(this.f94585d, this.f94586e, this.f94587f, null);
            }
        }
    }

    public final void setCollapseButtonHideWhenExpanded(boolean z17) {
        this.f94596r = z17;
    }

    public final void setCollapseText(java.lang.String collapseText) {
        kotlin.jvm.internal.o.g(collapseText, "collapseText");
        this.f94599u = collapseText;
    }

    public final void setContent(java.lang.CharSequence content) {
        kotlin.jvm.internal.o.g(content, "content");
        if (!this.f94585d.equals(content) || this.f94586e || this.f94587f) {
            this.f94585d = content.toString();
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f94590i;
            if (mMNeat7extView != null) {
                mMNeat7extView.setMaxLines(this.f94588g);
            }
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = this.f94590i;
            if (mMNeat7extView2 != null) {
                mMNeat7extView2.b(content);
            }
            android.widget.TextView textView = this.f94591m;
            if (textView != null) {
                textView.setMaxLines(this.f94588g);
            }
            android.widget.TextView textView2 = this.f94591m;
            if (textView2 != null) {
                textView2.setText(content);
            }
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView3 = this.f94590i;
            this.f94597s = mMNeat7extView3 != null ? mMNeat7extView3.f215178e : false;
            this.f94586e = false;
            this.f94587f = false;
            if (this.f94601w == 0) {
                this.f94602x = true;
            } else {
                this.f94602x = false;
                f(content, false, false, null);
            }
        }
    }

    public final void setEnableExpand(boolean z17) {
        this.f94587f = z17;
    }

    public final void setExpandText(java.lang.String expandText) {
        kotlin.jvm.internal.o.g(expandText, "expandText");
        this.f94600v = expandText;
    }

    public final void setMaxLines(int i17) {
        this.f94588g = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPCollapseTextLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f94585d = "";
        this.f94588g = 5;
        this.f94599u = "";
        this.f94600v = "";
        this.f94589h = context;
        e(attributeSet);
    }
}

package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf;

/* renamed from: com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout */
/* loaded from: classes5.dex */
public class C10962x80d4584e extends android.widget.HorizontalScrollView implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {
    public static final /* synthetic */ int N = 0;
    public float A;
    public float B;
    public int C;
    public boolean D;
    public float E;
    public int F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f150914J;
    public boolean K;
    public float L;
    public jx0.m M;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f150915d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f150916e;

    /* renamed from: f, reason: collision with root package name */
    public final jx0.n f150917f;

    /* renamed from: g, reason: collision with root package name */
    public int f150918g;

    /* renamed from: h, reason: collision with root package name */
    public float f150919h;

    /* renamed from: i, reason: collision with root package name */
    public int f150920i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f150921m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Rect f150922n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f150923o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f150924p;

    /* renamed from: q, reason: collision with root package name */
    public float f150925q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f150926r;

    /* renamed from: s, reason: collision with root package name */
    public float f150927s;

    /* renamed from: t, reason: collision with root package name */
    public float f150928t;

    /* renamed from: u, reason: collision with root package name */
    public int f150929u;

    /* renamed from: v, reason: collision with root package name */
    public float f150930v;

    /* renamed from: w, reason: collision with root package name */
    public float f150931w;

    /* renamed from: x, reason: collision with root package name */
    public float f150932x;

    /* renamed from: y, reason: collision with root package name */
    public float f150933y;

    /* renamed from: z, reason: collision with root package name */
    public float f150934z;

    public C10962x80d4584e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        android.view.View c17 = c(this.f150918g);
        float left = c17.getLeft();
        float right = c17.getRight();
        boolean z17 = this.D;
        android.graphics.Paint paint = this.f150924p;
        jx0.n nVar = this.f150917f;
        if (z17) {
            android.widget.TextView textView = ((jx0.o) ((java.util.ArrayList) nVar.f383919d).get(this.f150918g)).f383921b;
            paint.setTextSize(this.E);
            this.L = ((right - left) - paint.measureText(textView.getText().toString())) / 2.0f;
        }
        int i17 = this.f150918g;
        if (i17 < this.f150920i - 1) {
            android.view.View c18 = c(i17 + 1);
            float left2 = c18.getLeft();
            float right2 = c18.getRight();
            float f17 = this.f150919h;
            left += (left2 - left) * f17;
            right += f17 * (right2 - right);
            if (this.D) {
                android.widget.TextView textView2 = ((jx0.o) ((java.util.ArrayList) nVar.f383919d).get(this.f150918g + 1)).f383921b;
                paint.setTextSize(this.E);
                float measureText = ((right2 - left2) - paint.measureText(textView2.getText().toString())) / 2.0f;
                float f18 = this.L;
                this.L = f18 + (this.f150919h * (measureText - f18));
            }
        }
        int i18 = (int) left;
        android.graphics.Rect rect = this.f150921m;
        rect.left = i18;
        int i19 = (int) right;
        rect.right = i19;
        if (this.D) {
            float f19 = this.L;
            rect.left = (int) ((left + f19) - 1.0f);
            rect.right = (int) ((right - f19) - 1.0f);
        }
        android.graphics.Rect rect2 = this.f150922n;
        rect2.left = i18;
        rect2.right = i19;
        if (this.f150931w >= 0.0f) {
            float left3 = c17.getLeft() + ((c17.getWidth() - this.f150931w) / 2.0f);
            if (this.f150918g < this.f150920i - 1) {
                left3 += this.f150919h * ((c17.getWidth() / 2.0f) + (c(r2 + 1).getWidth() / 2.0f));
            }
            int i27 = (int) left3;
            rect.left = i27;
            rect.right = (int) (i27 + this.f150931w);
        }
    }

    public int b(float f17) {
        return (int) ((f17 * this.f150915d.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final android.view.View c(int i17) {
        return ((jx0.o) ((java.util.ArrayList) this.f150917f.f383919d).get(i17)).f383920a;
    }

    public final void d() {
        if (this.f150920i <= 0) {
            return;
        }
        int width = (int) (this.f150919h * c(this.f150918g).getWidth());
        int left = c(this.f150918g).getLeft() + width;
        if (this.f150918g > 0 || width > 0) {
            int width2 = left - ((getWidth() / 2) - getPaddingLeft());
            a();
            android.graphics.Rect rect = this.f150922n;
            left = width2 + ((rect.right - rect.left) / 2);
        }
        if (left != this.f150914J) {
            this.f150914J = left;
            scrollTo(left, 0);
        }
    }

    public void e(int i17, boolean z17) {
        if (this.f150918g == -1 && i17 == 0) {
            mo8333x510f45c9(i17);
        }
        this.f150918g = i17;
        this.f150916e.m8317x940d026a(i17, z17);
        jx0.m mVar = this.M;
        if (mVar != null) {
            mVar.a(i17);
        }
    }

    public final void f(int i17) {
        int i18 = 0;
        while (i18 < this.f150920i) {
            boolean z17 = i18 == i17;
            android.widget.TextView textView = ((jx0.o) ((java.util.ArrayList) this.f150917f.f383919d).get(i18)).f383921b;
            if (textView != null) {
                textView.setTextColor(z17 ? this.F : this.G);
                if (this.H == 1) {
                    textView.getPaint().setFakeBoldText(z17);
                }
            }
            i18++;
        }
    }

    public final void g() {
        int i17 = 0;
        while (i17 < this.f150920i) {
            android.widget.TextView textView = ((jx0.o) ((java.util.ArrayList) this.f150917f.f383919d).get(i17)).f383921b;
            if (textView != null) {
                textView.setTextColor(i17 == this.f150918g ? this.F : this.G);
                textView.setTextSize(0, this.E);
                int i18 = (int) this.f150925q;
                textView.setPadding(i18, 0, i18, 0);
                ((android.widget.LinearLayout.LayoutParams) c(i17).getLayoutParams()).setMarginStart((int) this.f150928t);
                if (this.I) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                int i19 = this.H;
                if (i19 == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (i19 == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
            }
            i17++;
        }
    }

    /* renamed from: getCurrentTab */
    public int m47188xad582352() {
        return this.f150918g;
    }

    /* renamed from: getIndicatorColor */
    public int m47189x90abbf8a() {
        return this.f150929u;
    }

    /* renamed from: getIndicatorCornerRadius */
    public float m47190x67d03d40() {
        return this.f150932x;
    }

    /* renamed from: getIndicatorHeight */
    public float m47191x8cc605e0() {
        return this.f150930v;
    }

    /* renamed from: getIndicatorMarginBottom */
    public float m47192x33cad772() {
        return this.B;
    }

    /* renamed from: getIndicatorMarginLeft */
    public float m47193x295c830e() {
        return this.f150933y;
    }

    /* renamed from: getIndicatorMarginRight */
    public float m47194x28a3ff5() {
        return this.A;
    }

    /* renamed from: getIndicatorMarginTop */
    public float m47195x1a1be16e() {
        return this.f150934z;
    }

    /* renamed from: getIndicatorWidth */
    public float m47196x91c2bded() {
        return this.f150931w;
    }

    /* renamed from: getTabCount */
    public int m47197x443e53f0() {
        return this.f150920i;
    }

    /* renamed from: getTabPadding */
    public float m47198xc4d20ab2() {
        return this.f150925q;
    }

    /* renamed from: getTabWidth */
    public float m47199x455530a7() {
        return this.f150927s;
    }

    /* renamed from: getTextBold */
    public int m47200x3fffd2c8() {
        return this.H;
    }

    /* renamed from: getTextSelectColor */
    public int m47201x70ecee24() {
        return this.F;
    }

    /* renamed from: getTextSize */
    public float m47202x40077844() {
        return this.E;
    }

    /* renamed from: getTextUnselectColor */
    public int m47203xe133d2ab() {
        return this.G;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f150920i <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        a();
        if (this.f150930v > 0.0f) {
            android.graphics.drawable.GradientDrawable gradientDrawable = this.f150923o;
            gradientDrawable.setColor(this.f150929u);
            int i17 = this.C;
            android.graphics.Rect rect = this.f150921m;
            if (i17 == 80) {
                int i18 = ((int) this.f150933y) + paddingLeft + rect.left;
                int i19 = height - ((int) this.f150930v);
                float f17 = this.B;
                gradientDrawable.setBounds(i18, i19 - ((int) f17), (paddingLeft + rect.right) - ((int) this.A), height - ((int) f17));
            } else {
                int i27 = ((int) this.f150933y) + paddingLeft + rect.left;
                float f18 = this.f150934z;
                gradientDrawable.setBounds(i27, (int) f18, (paddingLeft + rect.right) - ((int) this.A), ((int) this.f150930v) + ((int) f18));
            }
            gradientDrawable.setCornerRadius(this.f150932x);
            gradientDrawable.draw(canvas);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        this.f150918g = i17;
        this.f150919h = f17;
        d();
        invalidate();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        f(i17);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            this.f150918g = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f150918g != 0 && ((java.util.ArrayList) this.f150917f.f383919d).size() > 0) {
                f(this.f150918g);
                d();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f150918g);
        return bundle;
    }

    /* renamed from: setCurrentTab */
    public void m47204xdb7c715e(int i17) {
        this.f150918g = i17;
        this.f150916e.m8316x940d026a(i17);
        jx0.m mVar = this.M;
        if (mVar != null) {
            mVar.a(i17);
        }
    }

    /* renamed from: setIndicatorColor */
    public void m47205x58a22796(int i17) {
        this.f150929u = i17;
        invalidate();
    }

    /* renamed from: setIndicatorCornerRadius */
    public void m47206x37e2efb4(float f17) {
        this.f150932x = b(f17);
        invalidate();
    }

    /* renamed from: setIndicatorGravity */
    public void m47207x90d629c1(int i17) {
        this.C = i17;
        invalidate();
    }

    /* renamed from: setIndicatorHeight */
    public void m47208xc39c9f54(float f17) {
        this.f150930v = b(f17);
        invalidate();
    }

    /* renamed from: setIndicatorWidth */
    public void m47209x59b925f9(float f17) {
        this.f150931w = b(f17);
        invalidate();
    }

    /* renamed from: setIndicatorWidthEqualTitle */
    public void m47210xb303ca5d(boolean z17) {
        this.D = z17;
        invalidate();
    }

    /* renamed from: setOnTabSelectListener */
    public void m47211xed4b2ce4(jx0.m mVar) {
        this.M = mVar;
    }

    /* renamed from: setSnapOnTabClick */
    public void m47212x9c28fa5e(boolean z17) {
        this.K = z17;
    }

    /* renamed from: setTabPadding */
    public void m47213xf2f658be(float f17) {
        this.f150925q = b(f17);
        g();
    }

    /* renamed from: setTabSpaceEqual */
    public void m47214xe0e74201(boolean z17) {
        this.f150926r = z17;
        g();
    }

    /* renamed from: setTabWidth */
    public void m47215x400d91b3(float f17) {
        this.f150927s = b(f17);
        g();
    }

    /* renamed from: setTextAllCaps */
    public void m47216x7c50073(boolean z17) {
        this.I = z17;
        g();
    }

    /* renamed from: setTextBold */
    public void m47217x3ab833d4(int i17) {
        this.H = i17;
        g();
    }

    /* renamed from: setTextSelectColor */
    public void m47218xa7c38798(int i17) {
        this.F = i17;
        g();
    }

    /* renamed from: setTextSize */
    public void m47219x3abfd950(float f17) {
        this.E = (int) ((f17 * this.f150915d.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        g();
    }

    /* renamed from: setTextUnselectColor */
    public void m47220xbcc9df1f(int i17) {
        this.G = i17;
        g();
    }

    /* renamed from: setViewPager */
    public void m47221xfd22d5dc(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe) {
        if (c1190x18d3c3fe == null || c1190x18d3c3fe.m8299xf939df19() == null) {
            throw new java.lang.IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        this.f150916e = c1190x18d3c3fe;
        c1190x18d3c3fe.m8314x7cd807d6(this);
        this.f150916e.m8289xa5a25773(this);
        jx0.n nVar = this.f150917f;
        nVar.removeAllViews();
        this.f150920i = this.f150916e.m8299xf939df19().mo8338x7444f759();
        for (int i17 = 0; i17 < this.f150920i; i17++) {
            jx0.o oVar = new jx0.o(this);
            java.lang.String charSequence = this.f150916e.m8299xf939df19().mo8340x337c8253(i17).toString();
            android.widget.TextView textView = oVar.f383921b;
            if (textView != null && charSequence != null) {
                textView.setText(charSequence);
            }
            android.widget.RelativeLayout relativeLayout = oVar.f383920a;
            relativeLayout.setOnClickListener(new android.view.View.OnClickListener() { // from class: jx0.l$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i18 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e.N;
                    com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e c10962x80d4584e = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e.this;
                    c10962x80d4584e.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJSlidingTabLayout", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", c10962x80d4584e, array);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJSlidingTabLayout", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", c10962x80d4584e, array2);
                    int indexOfChild = c10962x80d4584e.f150917f.indexOfChild(view);
                    if (indexOfChild != -1) {
                        if (c10962x80d4584e.f150916e.m8300xfda78ef6() != indexOfChild) {
                            if (c10962x80d4584e.K) {
                                c10962x80d4584e.f150916e.m8317x940d026a(indexOfChild, false);
                            } else {
                                c10962x80d4584e.f150916e.m8316x940d026a(indexOfChild);
                            }
                            jx0.m mVar = c10962x80d4584e.M;
                            if (mVar != null) {
                                mVar.a(indexOfChild);
                            }
                        } else {
                            jx0.m mVar2 = c10962x80d4584e.M;
                            if (mVar2 != null) {
                                mVar2.b(indexOfChild);
                            }
                        }
                    }
                    yj0.a.h(c10962x80d4584e, "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJSlidingTabLayout", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(c10962x80d4584e, "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJSlidingTabLayout", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            android.widget.LinearLayout.LayoutParams layoutParams = this.f150926r ? new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f) : new android.widget.LinearLayout.LayoutParams(-2, -1);
            if (this.f150927s > 0.0f) {
                layoutParams = new android.widget.LinearLayout.LayoutParams((int) this.f150927s, -1);
            }
            ((java.util.ArrayList) nVar.f383919d).add(oVar);
            nVar.addView(relativeLayout, i17, layoutParams);
        }
        g();
    }

    public C10962x80d4584e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f150918g = -1;
        this.f150921m = new android.graphics.Rect();
        this.f150922n = new android.graphics.Rect();
        this.f150923o = new android.graphics.drawable.GradientDrawable();
        this.f150924p = new android.graphics.Paint(1);
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f150915d = context;
        jx0.n nVar = new jx0.n(this, context);
        this.f150917f = nVar;
        addView(nVar);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ez0.l.f339352f);
        this.f150929u = obtainStyledAttributes.getColor(3, android.graphics.Color.parseColor("#ffffff"));
        this.f150930v = obtainStyledAttributes.getDimension(6, b(2.0f));
        this.f150931w = obtainStyledAttributes.getDimension(11, b(-1.0f));
        this.f150932x = obtainStyledAttributes.getDimension(4, b(0.0f));
        this.f150933y = obtainStyledAttributes.getDimension(8, b(0.0f));
        this.f150934z = obtainStyledAttributes.getDimension(10, b(0.0f));
        this.A = obtainStyledAttributes.getDimension(9, b(0.0f));
        this.B = obtainStyledAttributes.getDimension(7, b(0.0f));
        this.C = obtainStyledAttributes.getInt(5, 80);
        this.D = obtainStyledAttributes.getBoolean(12, false);
        this.E = obtainStyledAttributes.getDimension(20, (int) ((14.0f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f));
        this.F = obtainStyledAttributes.getColor(19, android.graphics.Color.parseColor("#ffffff"));
        this.G = obtainStyledAttributes.getColor(21, android.graphics.Color.parseColor("#AAffffff"));
        this.H = obtainStyledAttributes.getInt(18, 0);
        this.I = obtainStyledAttributes.getBoolean(17, false);
        this.f150926r = obtainStyledAttributes.getBoolean(15, false);
        float dimension = obtainStyledAttributes.getDimension(16, b(-1.0f));
        this.f150927s = dimension;
        this.f150925q = obtainStyledAttributes.getDimension(14, (this.f150926r || dimension > 0.0f) ? b(0.0f) : b(20.0f));
        this.f150928t = obtainStyledAttributes.getDimension(13, b(0.0f));
        obtainStyledAttributes.recycle();
    }
}

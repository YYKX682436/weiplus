package com.tencent.mm.mj_publisher.finder.movie_composing.widgets;

/* loaded from: classes5.dex */
public class MJSlidingTabLayout extends android.widget.HorizontalScrollView implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
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
    public int f69381J;
    public boolean K;
    public float L;
    public jx0.m M;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f69382d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f69383e;

    /* renamed from: f, reason: collision with root package name */
    public final jx0.n f69384f;

    /* renamed from: g, reason: collision with root package name */
    public int f69385g;

    /* renamed from: h, reason: collision with root package name */
    public float f69386h;

    /* renamed from: i, reason: collision with root package name */
    public int f69387i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f69388m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Rect f69389n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f69390o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f69391p;

    /* renamed from: q, reason: collision with root package name */
    public float f69392q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f69393r;

    /* renamed from: s, reason: collision with root package name */
    public float f69394s;

    /* renamed from: t, reason: collision with root package name */
    public float f69395t;

    /* renamed from: u, reason: collision with root package name */
    public int f69396u;

    /* renamed from: v, reason: collision with root package name */
    public float f69397v;

    /* renamed from: w, reason: collision with root package name */
    public float f69398w;

    /* renamed from: x, reason: collision with root package name */
    public float f69399x;

    /* renamed from: y, reason: collision with root package name */
    public float f69400y;

    /* renamed from: z, reason: collision with root package name */
    public float f69401z;

    public MJSlidingTabLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        android.view.View c17 = c(this.f69385g);
        float left = c17.getLeft();
        float right = c17.getRight();
        boolean z17 = this.D;
        android.graphics.Paint paint = this.f69391p;
        jx0.n nVar = this.f69384f;
        if (z17) {
            android.widget.TextView textView = ((jx0.o) ((java.util.ArrayList) nVar.f302386d).get(this.f69385g)).f302388b;
            paint.setTextSize(this.E);
            this.L = ((right - left) - paint.measureText(textView.getText().toString())) / 2.0f;
        }
        int i17 = this.f69385g;
        if (i17 < this.f69387i - 1) {
            android.view.View c18 = c(i17 + 1);
            float left2 = c18.getLeft();
            float right2 = c18.getRight();
            float f17 = this.f69386h;
            left += (left2 - left) * f17;
            right += f17 * (right2 - right);
            if (this.D) {
                android.widget.TextView textView2 = ((jx0.o) ((java.util.ArrayList) nVar.f302386d).get(this.f69385g + 1)).f302388b;
                paint.setTextSize(this.E);
                float measureText = ((right2 - left2) - paint.measureText(textView2.getText().toString())) / 2.0f;
                float f18 = this.L;
                this.L = f18 + (this.f69386h * (measureText - f18));
            }
        }
        int i18 = (int) left;
        android.graphics.Rect rect = this.f69388m;
        rect.left = i18;
        int i19 = (int) right;
        rect.right = i19;
        if (this.D) {
            float f19 = this.L;
            rect.left = (int) ((left + f19) - 1.0f);
            rect.right = (int) ((right - f19) - 1.0f);
        }
        android.graphics.Rect rect2 = this.f69389n;
        rect2.left = i18;
        rect2.right = i19;
        if (this.f69398w >= 0.0f) {
            float left3 = c17.getLeft() + ((c17.getWidth() - this.f69398w) / 2.0f);
            if (this.f69385g < this.f69387i - 1) {
                left3 += this.f69386h * ((c17.getWidth() / 2.0f) + (c(r2 + 1).getWidth() / 2.0f));
            }
            int i27 = (int) left3;
            rect.left = i27;
            rect.right = (int) (i27 + this.f69398w);
        }
    }

    public int b(float f17) {
        return (int) ((f17 * this.f69382d.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final android.view.View c(int i17) {
        return ((jx0.o) ((java.util.ArrayList) this.f69384f.f302386d).get(i17)).f302387a;
    }

    public final void d() {
        if (this.f69387i <= 0) {
            return;
        }
        int width = (int) (this.f69386h * c(this.f69385g).getWidth());
        int left = c(this.f69385g).getLeft() + width;
        if (this.f69385g > 0 || width > 0) {
            int width2 = left - ((getWidth() / 2) - getPaddingLeft());
            a();
            android.graphics.Rect rect = this.f69389n;
            left = width2 + ((rect.right - rect.left) / 2);
        }
        if (left != this.f69381J) {
            this.f69381J = left;
            scrollTo(left, 0);
        }
    }

    public void e(int i17, boolean z17) {
        if (this.f69385g == -1 && i17 == 0) {
            onPageSelected(i17);
        }
        this.f69385g = i17;
        this.f69383e.setCurrentItem(i17, z17);
        jx0.m mVar = this.M;
        if (mVar != null) {
            mVar.a(i17);
        }
    }

    public final void f(int i17) {
        int i18 = 0;
        while (i18 < this.f69387i) {
            boolean z17 = i18 == i17;
            android.widget.TextView textView = ((jx0.o) ((java.util.ArrayList) this.f69384f.f302386d).get(i18)).f302388b;
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
        while (i17 < this.f69387i) {
            android.widget.TextView textView = ((jx0.o) ((java.util.ArrayList) this.f69384f.f302386d).get(i17)).f302388b;
            if (textView != null) {
                textView.setTextColor(i17 == this.f69385g ? this.F : this.G);
                textView.setTextSize(0, this.E);
                int i18 = (int) this.f69392q;
                textView.setPadding(i18, 0, i18, 0);
                ((android.widget.LinearLayout.LayoutParams) c(i17).getLayoutParams()).setMarginStart((int) this.f69395t);
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

    public int getCurrentTab() {
        return this.f69385g;
    }

    public int getIndicatorColor() {
        return this.f69396u;
    }

    public float getIndicatorCornerRadius() {
        return this.f69399x;
    }

    public float getIndicatorHeight() {
        return this.f69397v;
    }

    public float getIndicatorMarginBottom() {
        return this.B;
    }

    public float getIndicatorMarginLeft() {
        return this.f69400y;
    }

    public float getIndicatorMarginRight() {
        return this.A;
    }

    public float getIndicatorMarginTop() {
        return this.f69401z;
    }

    public float getIndicatorWidth() {
        return this.f69398w;
    }

    public int getTabCount() {
        return this.f69387i;
    }

    public float getTabPadding() {
        return this.f69392q;
    }

    public float getTabWidth() {
        return this.f69394s;
    }

    public int getTextBold() {
        return this.H;
    }

    public int getTextSelectColor() {
        return this.F;
    }

    public float getTextSize() {
        return this.E;
    }

    public int getTextUnselectColor() {
        return this.G;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f69387i <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        a();
        if (this.f69397v > 0.0f) {
            android.graphics.drawable.GradientDrawable gradientDrawable = this.f69390o;
            gradientDrawable.setColor(this.f69396u);
            int i17 = this.C;
            android.graphics.Rect rect = this.f69388m;
            if (i17 == 80) {
                int i18 = ((int) this.f69400y) + paddingLeft + rect.left;
                int i19 = height - ((int) this.f69397v);
                float f17 = this.B;
                gradientDrawable.setBounds(i18, i19 - ((int) f17), (paddingLeft + rect.right) - ((int) this.A), height - ((int) f17));
            } else {
                int i27 = ((int) this.f69400y) + paddingLeft + rect.left;
                float f18 = this.f69401z;
                gradientDrawable.setBounds(i27, (int) f18, (paddingLeft + rect.right) - ((int) this.A), ((int) this.f69397v) + ((int) f18));
            }
            gradientDrawable.setCornerRadius(this.f69399x);
            gradientDrawable.draw(canvas);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        this.f69385g = i17;
        this.f69386h = f17;
        d();
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        f(i17);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            this.f69385g = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f69385g != 0 && ((java.util.ArrayList) this.f69384f.f302386d).size() > 0) {
                f(this.f69385g);
                d();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f69385g);
        return bundle;
    }

    public void setCurrentTab(int i17) {
        this.f69385g = i17;
        this.f69383e.setCurrentItem(i17);
        jx0.m mVar = this.M;
        if (mVar != null) {
            mVar.a(i17);
        }
    }

    public void setIndicatorColor(int i17) {
        this.f69396u = i17;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f17) {
        this.f69399x = b(f17);
        invalidate();
    }

    public void setIndicatorGravity(int i17) {
        this.C = i17;
        invalidate();
    }

    public void setIndicatorHeight(float f17) {
        this.f69397v = b(f17);
        invalidate();
    }

    public void setIndicatorWidth(float f17) {
        this.f69398w = b(f17);
        invalidate();
    }

    public void setIndicatorWidthEqualTitle(boolean z17) {
        this.D = z17;
        invalidate();
    }

    public void setOnTabSelectListener(jx0.m mVar) {
        this.M = mVar;
    }

    public void setSnapOnTabClick(boolean z17) {
        this.K = z17;
    }

    public void setTabPadding(float f17) {
        this.f69392q = b(f17);
        g();
    }

    public void setTabSpaceEqual(boolean z17) {
        this.f69393r = z17;
        g();
    }

    public void setTabWidth(float f17) {
        this.f69394s = b(f17);
        g();
    }

    public void setTextAllCaps(boolean z17) {
        this.I = z17;
        g();
    }

    public void setTextBold(int i17) {
        this.H = i17;
        g();
    }

    public void setTextSelectColor(int i17) {
        this.F = i17;
        g();
    }

    public void setTextSize(float f17) {
        this.E = (int) ((f17 * this.f69382d.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        g();
    }

    public void setTextUnselectColor(int i17) {
        this.G = i17;
        g();
    }

    public void setViewPager(androidx.viewpager.widget.ViewPager viewPager) {
        if (viewPager == null || viewPager.getAdapter() == null) {
            throw new java.lang.IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        this.f69383e = viewPager;
        viewPager.removeOnPageChangeListener(this);
        this.f69383e.addOnPageChangeListener(this);
        jx0.n nVar = this.f69384f;
        nVar.removeAllViews();
        this.f69387i = this.f69383e.getAdapter().getCount();
        for (int i17 = 0; i17 < this.f69387i; i17++) {
            jx0.o oVar = new jx0.o(this);
            java.lang.String charSequence = this.f69383e.getAdapter().getPageTitle(i17).toString();
            android.widget.TextView textView = oVar.f302388b;
            if (textView != null && charSequence != null) {
                textView.setText(charSequence);
            }
            android.widget.RelativeLayout relativeLayout = oVar.f302387a;
            relativeLayout.setOnClickListener(new android.view.View.OnClickListener() { // from class: jx0.l$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i18 = com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout.N;
                    com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout mJSlidingTabLayout = com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout.this;
                    mJSlidingTabLayout.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJSlidingTabLayout", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", mJSlidingTabLayout, array);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJSlidingTabLayout", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", mJSlidingTabLayout, array2);
                    int indexOfChild = mJSlidingTabLayout.f69384f.indexOfChild(view);
                    if (indexOfChild != -1) {
                        if (mJSlidingTabLayout.f69383e.getCurrentItem() != indexOfChild) {
                            if (mJSlidingTabLayout.K) {
                                mJSlidingTabLayout.f69383e.setCurrentItem(indexOfChild, false);
                            } else {
                                mJSlidingTabLayout.f69383e.setCurrentItem(indexOfChild);
                            }
                            jx0.m mVar = mJSlidingTabLayout.M;
                            if (mVar != null) {
                                mVar.a(indexOfChild);
                            }
                        } else {
                            jx0.m mVar2 = mJSlidingTabLayout.M;
                            if (mVar2 != null) {
                                mVar2.b(indexOfChild);
                            }
                        }
                    }
                    yj0.a.h(mJSlidingTabLayout, "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJSlidingTabLayout", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(mJSlidingTabLayout, "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJSlidingTabLayout", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            android.widget.LinearLayout.LayoutParams layoutParams = this.f69393r ? new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f) : new android.widget.LinearLayout.LayoutParams(-2, -1);
            if (this.f69394s > 0.0f) {
                layoutParams = new android.widget.LinearLayout.LayoutParams((int) this.f69394s, -1);
            }
            ((java.util.ArrayList) nVar.f302386d).add(oVar);
            nVar.addView(relativeLayout, i17, layoutParams);
        }
        g();
    }

    public MJSlidingTabLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f69385g = -1;
        this.f69388m = new android.graphics.Rect();
        this.f69389n = new android.graphics.Rect();
        this.f69390o = new android.graphics.drawable.GradientDrawable();
        this.f69391p = new android.graphics.Paint(1);
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f69382d = context;
        jx0.n nVar = new jx0.n(this, context);
        this.f69384f = nVar;
        addView(nVar);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ez0.l.f257819f);
        this.f69396u = obtainStyledAttributes.getColor(3, android.graphics.Color.parseColor("#ffffff"));
        this.f69397v = obtainStyledAttributes.getDimension(6, b(2.0f));
        this.f69398w = obtainStyledAttributes.getDimension(11, b(-1.0f));
        this.f69399x = obtainStyledAttributes.getDimension(4, b(0.0f));
        this.f69400y = obtainStyledAttributes.getDimension(8, b(0.0f));
        this.f69401z = obtainStyledAttributes.getDimension(10, b(0.0f));
        this.A = obtainStyledAttributes.getDimension(9, b(0.0f));
        this.B = obtainStyledAttributes.getDimension(7, b(0.0f));
        this.C = obtainStyledAttributes.getInt(5, 80);
        this.D = obtainStyledAttributes.getBoolean(12, false);
        this.E = obtainStyledAttributes.getDimension(20, (int) ((14.0f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f));
        this.F = obtainStyledAttributes.getColor(19, android.graphics.Color.parseColor("#ffffff"));
        this.G = obtainStyledAttributes.getColor(21, android.graphics.Color.parseColor("#AAffffff"));
        this.H = obtainStyledAttributes.getInt(18, 0);
        this.I = obtainStyledAttributes.getBoolean(17, false);
        this.f69393r = obtainStyledAttributes.getBoolean(15, false);
        float dimension = obtainStyledAttributes.getDimension(16, b(-1.0f));
        this.f69394s = dimension;
        this.f69392q = obtainStyledAttributes.getDimension(14, (this.f69393r || dimension > 0.0f) ? b(0.0f) : b(20.0f));
        this.f69395t = obtainStyledAttributes.getDimension(13, b(0.0f));
        obtainStyledAttributes.recycle();
    }
}

package androidx.viewpager.widget;

/* loaded from: classes15.dex */
public class PagerTabStrip extends androidx.viewpager.widget.PagerTitleStrip {
    public final int A;
    public final int B;
    public final android.graphics.Paint C;
    public final android.graphics.Rect D;
    public int E;
    public boolean F;
    public boolean G;
    public final int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public float f12402J;
    public float K;
    public final int L;

    /* renamed from: w, reason: collision with root package name */
    public int f12403w;

    /* renamed from: x, reason: collision with root package name */
    public final int f12404x;

    /* renamed from: y, reason: collision with root package name */
    public final int f12405y;

    /* renamed from: z, reason: collision with root package name */
    public final int f12406z;

    public PagerTabStrip(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.C = paint;
        this.D = new android.graphics.Rect();
        this.E = 255;
        this.F = false;
        this.G = false;
        int i17 = this.f12422t;
        this.f12403w = i17;
        paint.setColor(i17);
        float f17 = context.getResources().getDisplayMetrics().density;
        this.f12404x = (int) ((3.0f * f17) + 0.5f);
        this.f12405y = (int) ((6.0f * f17) + 0.5f);
        this.f12406z = (int) (64.0f * f17);
        this.B = (int) ((16.0f * f17) + 0.5f);
        this.H = (int) ((1.0f * f17) + 0.5f);
        this.A = (int) ((f17 * 32.0f) + 0.5f);
        this.L = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f12410e.setFocusable(true);
        this.f12410e.setOnClickListener(new androidx.viewpager.widget.b(this));
        this.f12412g.setFocusable(true);
        this.f12412g.setOnClickListener(new androidx.viewpager.widget.c(this));
        if (getBackground() == null) {
            this.F = true;
        }
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void c(int i17, float f17, boolean z17) {
        int height = getHeight();
        android.widget.TextView textView = this.f12411f;
        int left = textView.getLeft();
        int i18 = this.B;
        int right = textView.getRight() + i18;
        int i19 = height - this.f12404x;
        android.graphics.Rect rect = this.D;
        rect.set(left - i18, i19, right, height);
        super.c(i17, f17, z17);
        this.E = (int) (java.lang.Math.abs(f17 - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i18, i19, textView.getRight() + i18, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.F;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return java.lang.Math.max(super.getMinHeight(), this.A);
    }

    public int getTabIndicatorColor() {
        return this.f12403w;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        android.widget.TextView textView = this.f12411f;
        int left = textView.getLeft();
        int i17 = this.B;
        int i18 = left - i17;
        int right = textView.getRight() + i17;
        int i19 = height - this.f12404x;
        android.graphics.Paint paint = this.C;
        paint.setColor((this.E << 24) | (this.f12403w & 16777215));
        float f17 = right;
        float f18 = height;
        canvas.drawRect(i18, i19, f17, f18, paint);
        if (this.F) {
            paint.setColor((this.f12403w & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.H, getWidth() - getPaddingRight(), f18, paint);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.I) {
            return false;
        }
        float x17 = motionEvent.getX();
        float y17 = motionEvent.getY();
        if (action == 0) {
            this.f12402J = x17;
            this.K = y17;
            this.I = false;
        } else if (action == 1) {
            int left = this.f12411f.getLeft();
            int i17 = this.B;
            if (x17 < left - i17) {
                androidx.viewpager.widget.ViewPager viewPager = this.f12409d;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            } else if (x17 > r5.getRight() + i17) {
                androidx.viewpager.widget.ViewPager viewPager2 = this.f12409d;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else if (action == 2) {
            float abs = java.lang.Math.abs(x17 - this.f12402J);
            int i18 = this.L;
            if (abs > i18 || java.lang.Math.abs(y17 - this.K) > i18) {
                this.I = true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        super.setBackgroundColor(i17);
        if (this.G) {
            return;
        }
        this.F = (i17 & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.G) {
            return;
        }
        this.F = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        super.setBackgroundResource(i17);
        if (this.G) {
            return;
        }
        this.F = i17 == 0;
    }

    public void setDrawFullUnderline(boolean z17) {
        this.F = z17;
        this.G = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        int i28 = this.f12405y;
        if (i27 < i28) {
            i27 = i28;
        }
        super.setPadding(i17, i18, i19, i27);
    }

    public void setTabIndicatorColor(int i17) {
        this.f12403w = i17;
        this.C.setColor(i17);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i17) {
        setTabIndicatorColor(b3.l.getColor(getContext(), i17));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i17) {
        int i18 = this.f12406z;
        if (i17 < i18) {
            i17 = i18;
        }
        super.setTextSpacing(i17);
    }
}

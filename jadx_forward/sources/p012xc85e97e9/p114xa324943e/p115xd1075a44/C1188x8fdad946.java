package p012xc85e97e9.p114xa324943e.p115xd1075a44;

/* renamed from: androidx.viewpager.widget.PagerTabStrip */
/* loaded from: classes15.dex */
public class C1188x8fdad946 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.C1189x3b593a3 {
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
    public float f93935J;
    public float K;
    public final int L;

    /* renamed from: w, reason: collision with root package name */
    public int f93936w;

    /* renamed from: x, reason: collision with root package name */
    public final int f93937x;

    /* renamed from: y, reason: collision with root package name */
    public final int f93938y;

    /* renamed from: z, reason: collision with root package name */
    public final int f93939z;

    public C1188x8fdad946(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.C = paint;
        this.D = new android.graphics.Rect();
        this.E = 255;
        this.F = false;
        this.G = false;
        int i17 = this.f93955t;
        this.f93936w = i17;
        paint.setColor(i17);
        float f17 = context.getResources().getDisplayMetrics().density;
        this.f93937x = (int) ((3.0f * f17) + 0.5f);
        this.f93938y = (int) ((6.0f * f17) + 0.5f);
        this.f93939z = (int) (64.0f * f17);
        this.B = (int) ((16.0f * f17) + 0.5f);
        this.H = (int) ((1.0f * f17) + 0.5f);
        this.A = (int) ((f17 * 32.0f) + 0.5f);
        this.L = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        mo8277xc63c3494(m8280x2fd6c120());
        setWillNotDraw(false);
        this.f93943e.setFocusable(true);
        this.f93943e.setOnClickListener(new p012xc85e97e9.p114xa324943e.p115xd1075a44.b(this));
        this.f93945g.setFocusable(true);
        this.f93945g.setOnClickListener(new p012xc85e97e9.p114xa324943e.p115xd1075a44.c(this));
        if (getBackground() == null) {
            this.F = true;
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1189x3b593a3
    public void c(int i17, float f17, boolean z17) {
        int height = getHeight();
        android.widget.TextView textView = this.f93944f;
        int left = textView.getLeft();
        int i18 = this.B;
        int right = textView.getRight() + i18;
        int i19 = height - this.f93937x;
        android.graphics.Rect rect = this.D;
        rect.set(left - i18, i19, right, height);
        super.c(i17, f17, z17);
        this.E = (int) (java.lang.Math.abs(f17 - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i18, i19, textView.getRight() + i18, height);
        invalidate(rect);
    }

    /* renamed from: getDrawFullUnderline */
    public boolean m8271x28776d63() {
        return this.F;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1189x3b593a3
    /* renamed from: getMinHeight */
    public int mo8272xf7770f63() {
        return java.lang.Math.max(super.mo8272xf7770f63(), this.A);
    }

    /* renamed from: getTabIndicatorColor */
    public int m8273x24cb9cd3() {
        return this.f93936w;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        android.widget.TextView textView = this.f93944f;
        int left = textView.getLeft();
        int i17 = this.B;
        int i18 = left - i17;
        int right = textView.getRight() + i17;
        int i19 = height - this.f93937x;
        android.graphics.Paint paint = this.C;
        paint.setColor((this.E << 24) | (this.f93936w & 16777215));
        float f17 = right;
        float f18 = height;
        canvas.drawRect(i18, i19, f17, f18, paint);
        if (this.F) {
            paint.setColor((this.f93936w & 16777215) | (-16777216));
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
            this.f93935J = x17;
            this.K = y17;
            this.I = false;
        } else if (action == 1) {
            int left = this.f93944f.getLeft();
            int i17 = this.B;
            if (x17 < left - i17) {
                p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f93942d;
                c1190x18d3c3fe.m8316x940d026a(c1190x18d3c3fe.m8300xfda78ef6() - 1);
            } else if (x17 > r5.getRight() + i17) {
                p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe2 = this.f93942d;
                c1190x18d3c3fe2.m8316x940d026a(c1190x18d3c3fe2.m8300xfda78ef6() + 1);
            }
        } else if (action == 2) {
            float abs = java.lang.Math.abs(x17 - this.f93935J);
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

    /* renamed from: setDrawFullUnderline */
    public void m8274x40d79d7(boolean z17) {
        this.F = z17;
        this.G = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        int i28 = this.f93938y;
        if (i27 < i28) {
            i27 = i28;
        }
        super.setPadding(i17, i18, i19, i27);
    }

    /* renamed from: setTabIndicatorColor */
    public void m8275x61a947(int i17) {
        this.f93936w = i17;
        this.C.setColor(i17);
        invalidate();
    }

    /* renamed from: setTabIndicatorColorResource */
    public void m8276x4b299a75(int i17) {
        m8275x61a947(b3.l.m9702x7444d5ad(getContext(), i17));
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1189x3b593a3
    /* renamed from: setTextSpacing */
    public void mo8277xc63c3494(int i17) {
        int i18 = this.f93939z;
        if (i17 < i18) {
            i17 = i18;
        }
        super.mo8277xc63c3494(i17);
    }
}

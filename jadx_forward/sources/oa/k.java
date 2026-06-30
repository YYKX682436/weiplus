package oa;

/* loaded from: classes15.dex */
public class k extends android.widget.LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f425322p = 0;

    /* renamed from: d, reason: collision with root package name */
    public oa.i f425323d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f425324e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f425325f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f425326g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f425327h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f425328i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f425329m;

    /* renamed from: n, reason: collision with root package name */
    public int f425330n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f425331o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff, android.content.Context context) {
        super(context);
        this.f425331o = c2718xca2902ff;
        this.f425330n = 2;
        b(context);
        int i17 = c2718xca2902ff.f126078h;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.v0.k(this, i17, c2718xca2902ff.f126079i, c2718xca2902ff.f126080m, c2718xca2902ff.f126081n);
        setGravity(17);
        setOrientation(!c2718xca2902ff.G ? 1 : 0);
        setClickable(true);
        n3.c1.d(this, n3.n0.b(getContext(), 1002));
    }

    public final void a() {
        android.graphics.drawable.Drawable drawable;
        oa.i iVar = this.f425323d;
        android.graphics.drawable.Drawable drawable2 = null;
        android.view.View view = iVar != null ? iVar.f425316f : null;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((android.view.ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.f425326g = view;
            android.widget.TextView textView = this.f425324e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.ImageView imageView = this.f425325f;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f425325f.setImageDrawable(null);
            }
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(android.R.id.text1);
            this.f425327h = textView2;
            if (textView2 != null) {
                this.f425330n = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.t.b(textView2);
            }
            this.f425328i = (android.widget.ImageView) view.findViewById(android.R.id.icon);
        } else {
            android.view.View view2 = this.f425326g;
            if (view2 != null) {
                removeView(view2);
                this.f425326g = null;
            }
            this.f425327h = null;
            this.f425328i = null;
        }
        boolean z17 = false;
        if (this.f425326g == null) {
            if (this.f425325f == null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a3t, (android.view.ViewGroup) this, false);
                addView(imageView2, 0);
                this.f425325f = imageView2;
            }
            if (iVar != null && (drawable = iVar.f425312b) != null) {
                drawable2 = drawable.mutate();
            }
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f425331o;
            if (drawable2 != null) {
                f3.b.h(drawable2, c2718xca2902ff.f126084q);
                android.graphics.PorterDuff.Mode mode = c2718xca2902ff.f126087t;
                if (mode != null) {
                    f3.b.i(drawable2, mode);
                }
            }
            if (this.f425324e == null) {
                android.widget.TextView textView3 = (android.widget.TextView) android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a3u, (android.view.ViewGroup) this, false);
                addView(textView3);
                this.f425324e = textView3;
                this.f425330n = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.t.b(textView3);
            }
            this.f425324e.setTextAppearance(c2718xca2902ff.f126082o);
            android.content.res.ColorStateList colorStateList = c2718xca2902ff.f126083p;
            if (colorStateList != null) {
                this.f425324e.setTextColor(colorStateList);
            }
            c(this.f425324e, this.f425325f);
        } else {
            android.widget.TextView textView4 = this.f425327h;
            if (textView4 != null || this.f425328i != null) {
                c(textView4, this.f425328i);
            }
        }
        if (iVar != null && !android.text.TextUtils.isEmpty(iVar.f425314d)) {
            setContentDescription(iVar.f425314d);
        }
        if (iVar != null && iVar.a()) {
            z17 = true;
        }
        setSelected(z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
    public final void b(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f425331o;
        int i17 = c2718xca2902ff.f126090w;
        if (i17 != 0) {
            android.graphics.drawable.Drawable a17 = k.a.a(context, i17);
            this.f425329m = a17;
            if (a17 != null && a17.isStateful()) {
                this.f425329m.setState(getDrawableState());
            }
        } else {
            this.f425329m = null;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(0);
        if (c2718xca2902ff.f126085r != null) {
            android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            android.content.res.ColorStateList a18 = ja.a.a(c2718xca2902ff.f126085r);
            boolean z17 = c2718xca2902ff.I;
            if (z17) {
                gradientDrawable = null;
            }
            gradientDrawable = new android.graphics.drawable.RippleDrawable(a18, gradientDrawable, z17 ? null : gradientDrawable2);
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.q(this, gradientDrawable);
        c2718xca2902ff.invalidate();
    }

    public final void c(android.widget.TextView textView, android.widget.ImageView imageView) {
        android.graphics.drawable.Drawable drawable;
        oa.i iVar = this.f425323d;
        android.graphics.drawable.Drawable mutate = (iVar == null || (drawable = iVar.f425312b) == null) ? null : drawable.mutate();
        oa.i iVar2 = this.f425323d;
        java.lang.CharSequence charSequence = iVar2 != null ? iVar2.f425313c : null;
        if (imageView != null) {
            if (mutate != null) {
                imageView.setImageDrawable(mutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean z17 = !android.text.TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z17) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                setVisibility(0);
            } else {
                textView.setVisibility(8);
                textView.setText((java.lang.CharSequence) null);
            }
        }
        if (imageView != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f425331o;
            int i17 = (z17 && imageView.getVisibility() == 0) ? c2718xca2902ff.i(8) : 0;
            if (c2718xca2902ff.G) {
                if (i17 != n3.u.b(marginLayoutParams)) {
                    n3.u.g(marginLayoutParams, i17);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (i17 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i17;
                n3.u.g(marginLayoutParams, 0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        oa.i iVar3 = this.f425323d;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a3.a(this, z17 ? null : iVar3 != null ? iVar3.f425314d : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.f425329m;
        boolean z17 = false;
        if (drawable != null && drawable.isStateful()) {
            z17 = false | this.f425329m.setState(drawableState);
        }
        if (z17) {
            invalidate();
            this.f425331o.invalidate();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(p012xc85e97e9.p016x746ad0e3.app.a.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(p012xc85e97e9.p016x746ad0e3.app.a.class.getName());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        android.text.Layout layout;
        int size = android.view.View.MeasureSpec.getSize(i17);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f425331o;
        int m20357xbf355c41 = c2718xca2902ff.m20357xbf355c41();
        if (m20357xbf355c41 > 0 && (mode == 0 || size > m20357xbf355c41)) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(c2718xca2902ff.f126091x, Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
        if (this.f425324e != null) {
            float f17 = c2718xca2902ff.f126088u;
            int i19 = this.f425330n;
            android.widget.ImageView imageView = this.f425325f;
            boolean z17 = true;
            if (imageView == null || imageView.getVisibility() != 0) {
                android.widget.TextView textView = this.f425324e;
                if (textView != null && textView.getLineCount() > 1) {
                    f17 = c2718xca2902ff.f126089v;
                }
            } else {
                i19 = 1;
            }
            float textSize = this.f425324e.getTextSize();
            int lineCount = this.f425324e.getLineCount();
            int b17 = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.t.b(this.f425324e);
            if (f17 != textSize || (b17 >= 0 && i19 != b17)) {
                if (c2718xca2902ff.F == 1 && f17 > textSize && lineCount == 1 && ((layout = this.f425324e.getLayout()) == null || layout.getLineWidth(0) * (f17 / layout.getPaint().getTextSize()) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    z17 = false;
                }
                if (z17) {
                    this.f425324e.setTextSize(0, f17);
                    this.f425324e.setMaxLines(i19);
                    super.onMeasure(i17, i18);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f425323d == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.f425323d.b();
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        if (isSelected() != z17) {
        }
        super.setSelected(z17);
        android.widget.TextView textView = this.f425324e;
        if (textView != null) {
            textView.setSelected(z17);
        }
        android.widget.ImageView imageView = this.f425325f;
        if (imageView != null) {
            imageView.setSelected(z17);
        }
        android.view.View view = this.f425326g;
        if (view != null) {
            view.setSelected(z17);
        }
    }
}

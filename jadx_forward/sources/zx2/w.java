package zx2;

/* loaded from: classes15.dex */
public class w extends android.widget.LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f558625p = 0;

    /* renamed from: d, reason: collision with root package name */
    public zx2.u f558626d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f558627e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f558628f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f558629g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f558630h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f558631i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f558632m;

    /* renamed from: n, reason: collision with root package name */
    public int f558633n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 f558634o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79, android.content.Context context) {
        super(context);
        this.f558634o = c15436x4c00d79;
        this.f558633n = 2;
        c(context);
        int i17 = c15436x4c00d79.f214637h;
        int i18 = c15436x4c00d79.f214638i;
        int i19 = c15436x4c00d79.f214639m;
        int i27 = c15436x4c00d79.f214640n;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.v0.k(this, i17, i18, i19, i27);
        setGravity(17);
        setOrientation(!c15436x4c00d79.G ? 1 : 0);
        setClickable(true);
        n3.c1.d(this, n3.n0.b(getContext(), 1002));
        setClipChildren(c15436x4c00d79.W);
        setClipToPadding(c15436x4c00d79.f214643p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getContentWidth */
    public int m179859x92117f43() {
        android.view.View[] viewArr = {this.f558627e, this.f558628f, this.f558629g};
        int i17 = 0;
        int i18 = 0;
        boolean z17 = false;
        for (int i19 = 0; i19 < 3; i19++) {
            android.view.View view = viewArr[i19];
            if (view != null && view.getVisibility() == 0) {
                i18 = z17 ? java.lang.Math.min(i18, view.getLeft()) : view.getLeft();
                i17 = z17 ? java.lang.Math.max(i17, view.getRight()) : view.getRight();
                z17 = true;
            }
        }
        return i17 - i18;
    }

    public final void b() {
        android.graphics.drawable.Drawable drawable;
        zx2.u uVar = this.f558626d;
        android.graphics.drawable.Drawable drawable2 = null;
        android.view.View view = uVar != null ? uVar.f558619f : null;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((android.view.ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.f558629g = view;
            android.widget.TextView textView = this.f558627e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.ImageView imageView = this.f558628f;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f558628f.setImageDrawable(null);
            }
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(android.R.id.text1);
            this.f558630h = textView2;
            if (textView2 != null) {
                this.f558633n = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.t.b(textView2);
            }
            this.f558631i = (android.widget.ImageView) view.findViewById(android.R.id.icon);
        } else {
            android.view.View view2 = this.f558629g;
            if (view2 != null) {
                removeView(view2);
                this.f558629g = null;
            }
            this.f558630h = null;
            this.f558631i = null;
        }
        boolean z17 = false;
        if (this.f558629g == null) {
            if (this.f558628f == null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a3t, (android.view.ViewGroup) this, false);
                addView(imageView2, 0);
                this.f558628f = imageView2;
            }
            if (uVar != null && (drawable = uVar.f558615b) != null) {
                drawable2 = drawable.mutate();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558634o;
            if (drawable2 != null) {
                f3.b.h(drawable2, c15436x4c00d79.f214644q);
                android.graphics.PorterDuff.Mode mode = c15436x4c00d79.f214647t;
                if (mode != null) {
                    f3.b.i(drawable2, mode);
                }
            }
            if (this.f558627e == null) {
                android.widget.TextView textView3 = (android.widget.TextView) android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a3u, (android.view.ViewGroup) this, false);
                addView(textView3);
                this.f558627e = textView3;
                this.f558633n = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.t.b(textView3);
            }
            this.f558627e.setTextAppearance(c15436x4c00d79.f214641o);
            android.content.res.ColorStateList colorStateList = c15436x4c00d79.f214642p;
            if (colorStateList != null) {
                this.f558627e.setTextColor(colorStateList);
            }
            d(this.f558627e, this.f558628f);
        } else {
            android.widget.TextView textView4 = this.f558630h;
            if (textView4 != null || this.f558631i != null) {
                d(textView4, this.f558631i);
            }
        }
        if (uVar != null && !android.text.TextUtils.isEmpty(uVar.f558617d)) {
            setContentDescription(uVar.f558617d);
        }
        if (uVar != null && uVar.a()) {
            z17 = true;
        }
        setSelected(z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.graphics.drawable.RippleDrawable] */
    public final void c(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558634o;
        int i17 = c15436x4c00d79.f214650w;
        if (i17 != 0) {
            android.graphics.drawable.Drawable a17 = k.a.a(context, i17);
            this.f558632m = a17;
            if (a17 != null && a17.isStateful()) {
                this.f558632m.setState(getDrawableState());
            }
        } else {
            this.f558632m = null;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(0);
        if (c15436x4c00d79.f214645r != null) {
            android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            android.content.res.ColorStateList colorStateList = c15436x4c00d79.f214645r;
            android.content.res.ColorStateList colorStateList2 = new android.content.res.ColorStateList(new int[][]{zx2.c0.f558566c, android.util.StateSet.NOTHING}, new int[]{zx2.c0.a(colorStateList, zx2.c0.f558565b), zx2.c0.a(colorStateList, zx2.c0.f558564a)});
            boolean z17 = c15436x4c00d79.I;
            if (z17) {
                gradientDrawable = null;
            }
            gradientDrawable = new android.graphics.drawable.RippleDrawable(colorStateList2, gradientDrawable, z17 ? null : gradientDrawable2);
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.q(this, gradientDrawable);
        c15436x4c00d79.invalidate();
    }

    public final void d(android.widget.TextView textView, android.widget.ImageView imageView) {
        android.graphics.drawable.Drawable drawable;
        zx2.u uVar = this.f558626d;
        android.graphics.drawable.Drawable mutate = (uVar == null || (drawable = uVar.f558615b) == null) ? null : drawable.mutate();
        zx2.u uVar2 = this.f558626d;
        java.lang.CharSequence charSequence = uVar2 != null ? uVar2.f558616c : null;
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
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558634o;
            int g17 = (z17 && imageView.getVisibility() == 0) ? c15436x4c00d79.g(8) : 0;
            if (c15436x4c00d79.G) {
                if (g17 != n3.u.b(marginLayoutParams)) {
                    n3.u.g(marginLayoutParams, g17);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (g17 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = g17;
                n3.u.g(marginLayoutParams, 0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        zx2.u uVar3 = this.f558626d;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a3.a(this, z17 ? null : uVar3 != null ? uVar3.f558617d : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.f558632m;
        boolean z17 = false;
        if (drawable != null && drawable.isStateful()) {
            z17 = false | this.f558632m.setState(drawableState);
        }
        if (z17) {
            invalidate();
            this.f558634o.invalidate();
        }
    }

    /* renamed from: getTab */
    public zx2.u m179860xb588705f() {
        return this.f558626d;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558634o;
        int m62982xbf355c41 = c15436x4c00d79.m62982xbf355c41();
        if (m62982xbf355c41 > 0 && (mode == 0 || size > m62982xbf355c41)) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(c15436x4c00d79.f214651x, Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
        if (this.f558627e != null) {
            float f17 = c15436x4c00d79.f214648u;
            int i19 = this.f558633n;
            android.widget.ImageView imageView = this.f558628f;
            boolean z17 = true;
            if (imageView == null || imageView.getVisibility() != 0) {
                android.widget.TextView textView = this.f558627e;
                if (textView != null && textView.getLineCount() > 1) {
                    f17 = c15436x4c00d79.f214649v;
                }
            } else {
                i19 = 1;
            }
            float textSize = this.f558627e.getTextSize();
            int lineCount = this.f558627e.getLineCount();
            int b17 = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.t.b(this.f558627e);
            if (f17 != textSize || (b17 >= 0 && i19 != b17)) {
                if (c15436x4c00d79.F == 1 && f17 > textSize && lineCount == 1 && ((layout = this.f558627e.getLayout()) == null || layout.getLineWidth(0) * (f17 / layout.getPaint().getTextSize()) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    z17 = false;
                }
                if (z17) {
                    this.f558627e.setTextSize(0, f17);
                    this.f558627e.setMaxLines(i19);
                    super.onMeasure(i17, i18);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f558626d == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.f558626d.b();
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        if (isSelected() != z17) {
        }
        super.setSelected(z17);
        android.widget.TextView textView = this.f558627e;
        if (textView != null) {
            textView.setSelected(z17);
        }
        android.widget.ImageView imageView = this.f558628f;
        if (imageView != null) {
            imageView.setSelected(z17);
        }
        android.view.View view = this.f558629g;
        if (view != null) {
            view.setSelected(z17);
        }
    }

    /* renamed from: setTab */
    public void m179861xca0297d3(zx2.u uVar) {
        if (uVar != this.f558626d) {
            this.f558626d = uVar;
            b();
        }
    }
}

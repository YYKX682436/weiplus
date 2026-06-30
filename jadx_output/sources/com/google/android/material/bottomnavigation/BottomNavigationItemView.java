package com.google.android.material.bottomnavigation;

/* loaded from: classes15.dex */
public class BottomNavigationItemView extends android.widget.FrameLayout implements o.h0 {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f44389s = {android.R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public final int f44390d;

    /* renamed from: e, reason: collision with root package name */
    public float f44391e;

    /* renamed from: f, reason: collision with root package name */
    public float f44392f;

    /* renamed from: g, reason: collision with root package name */
    public float f44393g;

    /* renamed from: h, reason: collision with root package name */
    public int f44394h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f44395i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f44396m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f44397n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f44398o;

    /* renamed from: p, reason: collision with root package name */
    public int f44399p;

    /* renamed from: q, reason: collision with root package name */
    public o.u f44400q;

    /* renamed from: r, reason: collision with root package name */
    public android.content.res.ColorStateList f44401r;

    public BottomNavigationItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // o.h0
    public void a(o.u uVar, int i17) {
        this.f44400q = uVar;
        setCheckable(uVar.isCheckable());
        setChecked(uVar.isChecked());
        setEnabled(uVar.isEnabled());
        setIcon(uVar.getIcon());
        setTitle(uVar.f341808h);
        setId(uVar.f341804d);
        if (!android.text.TextUtils.isEmpty(uVar.f341820w)) {
            setContentDescription(uVar.f341820w);
        }
        androidx.appcompat.widget.a3.a(this, uVar.f341821x);
        setVisibility(uVar.isVisible() ? 0 : 8);
    }

    public final void b(android.view.View view, int i17, int i18) {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i17;
        layoutParams.gravity = i18;
        view.setLayoutParams(layoutParams);
    }

    public final void c(android.view.View view, float f17, float f18, int i17) {
        view.setScaleX(f17);
        view.setScaleY(f18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/google/android/material/bottomnavigation/BottomNavigationItemView", "setViewValues", "(Landroid/view/View;FFI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/google/android/material/bottomnavigation/BottomNavigationItemView", "setViewValues", "(Landroid/view/View;FFI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // o.h0
    public o.u getItemData() {
        return this.f44400q;
    }

    public int getItemPosition() {
        return this.f44399p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i17) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i17 + 1);
        o.u uVar = this.f44400q;
        if (uVar != null && uVar.isCheckable() && this.f44400q.isChecked()) {
            android.view.View.mergeDrawableStates(onCreateDrawableState, f44389s);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z17) {
        refreshDrawableState();
    }

    public void setChecked(boolean z17) {
        android.widget.TextView textView = this.f44398o;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        android.widget.TextView textView2 = this.f44397n;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        int i17 = this.f44394h;
        int i18 = this.f44390d;
        android.view.View view = this.f44396m;
        if (i17 != -1) {
            if (i17 == 0) {
                if (z17) {
                    b(view, i18, 49);
                    c(textView, 1.0f, 1.0f, 0);
                } else {
                    b(view, i18, 17);
                    c(textView, 0.5f, 0.5f, 4);
                }
                textView2.setVisibility(4);
            } else if (i17 != 1) {
                if (i17 == 2) {
                    b(view, i18, 17);
                    textView.setVisibility(8);
                    textView2.setVisibility(8);
                }
            } else if (z17) {
                b(view, (int) (i18 + this.f44391e), 49);
                c(textView, 1.0f, 1.0f, 0);
                float f17 = this.f44392f;
                c(textView2, f17, f17, 4);
            } else {
                b(view, i18, 49);
                float f18 = this.f44393g;
                c(textView, f18, f18, 4);
                c(textView2, 1.0f, 1.0f, 0);
            }
        } else if (this.f44395i) {
            if (z17) {
                b(view, i18, 49);
                c(textView, 1.0f, 1.0f, 0);
            } else {
                b(view, i18, 17);
                c(textView, 0.5f, 0.5f, 4);
            }
            textView2.setVisibility(4);
        } else if (z17) {
            b(view, (int) (i18 + this.f44391e), 49);
            c(textView, 1.0f, 1.0f, 0);
            float f19 = this.f44392f;
            c(textView2, f19, f19, 4);
        } else {
            b(view, i18, 49);
            float f27 = this.f44393g;
            c(textView, f27, f27, 4);
            c(textView2, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z17);
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        this.f44397n.setEnabled(z17);
        this.f44398o.setEnabled(z17);
        this.f44396m.setEnabled(z17);
        if (!z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.c1.d(this, null);
        } else {
            android.view.PointerIcon b17 = n3.n0.b(getContext(), 1002);
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            n3.c1.d(this, b17);
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            f3.b.h(drawable, this.f44401r);
        }
        this.f44396m.setImageDrawable(drawable);
    }

    public void setIconSize(int i17) {
        android.widget.ImageView imageView = this.f44396m;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i17;
        layoutParams.height = i17;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f44401r = colorStateList;
        o.u uVar = this.f44400q;
        if (uVar != null) {
            setIcon(uVar.getIcon());
        }
    }

    public void setItemBackground(int i17) {
        setItemBackground(i17 == 0 ? null : b3.l.getDrawable(getContext(), i17));
    }

    public void setItemPosition(int i17) {
        this.f44399p = i17;
    }

    public void setLabelVisibilityMode(int i17) {
        if (this.f44394h != i17) {
            this.f44394h = i17;
            o.u uVar = this.f44400q;
            if (uVar != null) {
                setChecked(uVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z17) {
        if (this.f44395i != z17) {
            this.f44395i = z17;
            o.u uVar = this.f44400q;
            if (uVar != null) {
                setChecked(uVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i17) {
        android.widget.TextView textView = this.f44398o;
        textView.setTextAppearance(i17);
        float textSize = this.f44397n.getTextSize();
        float textSize2 = textView.getTextSize();
        this.f44391e = textSize - textSize2;
        this.f44392f = (textSize2 * 1.0f) / textSize;
        this.f44393g = (textSize * 1.0f) / textSize2;
    }

    public void setTextAppearanceInactive(int i17) {
        android.widget.TextView textView = this.f44397n;
        textView.setTextAppearance(i17);
        float textSize = textView.getTextSize();
        float textSize2 = this.f44398o.getTextSize();
        this.f44391e = textSize - textSize2;
        this.f44392f = (textSize2 * 1.0f) / textSize;
        this.f44393g = (textSize * 1.0f) / textSize2;
    }

    public void setTextColor(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f44397n.setTextColor(colorStateList);
            this.f44398o.setTextColor(colorStateList);
        }
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.f44397n.setText(charSequence);
        this.f44398o.setText(charSequence);
        o.u uVar = this.f44400q;
        if (uVar == null || android.text.TextUtils.isEmpty(uVar.f341820w)) {
            setContentDescription(charSequence);
        }
    }

    public BottomNavigationItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f44399p = -1;
        android.content.res.Resources resources = getResources();
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a3r, (android.view.ViewGroup) this, true);
        setBackgroundResource(com.tencent.mm.R.drawable.f481349r2);
        this.f44390d = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480275t8);
        this.f44396m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.h5n);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.n09);
        this.f44397n = textView;
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hsy);
        this.f44398o = textView2;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.s(textView, 2);
        n3.u0.s(textView2, 2);
        setFocusable(true);
        float textSize = textView.getTextSize();
        float textSize2 = textView2.getTextSize();
        this.f44391e = textSize - textSize2;
        this.f44392f = (textSize2 * 1.0f) / textSize;
        this.f44393g = (textSize * 1.0f) / textSize2;
    }

    public void setItemBackground(android.graphics.drawable.Drawable drawable) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.q(this, drawable);
    }
}

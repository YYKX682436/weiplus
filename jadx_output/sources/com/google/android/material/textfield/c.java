package com.google.android.material.textfield;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f44600a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.material.textfield.TextInputLayout f44601b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f44602c;

    /* renamed from: d, reason: collision with root package name */
    public int f44603d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f44604e;

    /* renamed from: f, reason: collision with root package name */
    public int f44605f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.Animator f44606g;

    /* renamed from: h, reason: collision with root package name */
    public final float f44607h;

    /* renamed from: i, reason: collision with root package name */
    public int f44608i;

    /* renamed from: j, reason: collision with root package name */
    public int f44609j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.CharSequence f44610k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f44611l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f44612m;

    /* renamed from: n, reason: collision with root package name */
    public int f44613n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.CharSequence f44614o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f44615p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f44616q;

    /* renamed from: r, reason: collision with root package name */
    public int f44617r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Typeface f44618s;

    public c(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        this.f44600a = textInputLayout.getContext();
        this.f44601b = textInputLayout;
        this.f44607h = r0.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480299tw);
    }

    public void a(android.widget.TextView textView, int i17) {
        if (this.f44602c == null && this.f44604e == null) {
            android.content.Context context = this.f44600a;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            this.f44602c = linearLayout;
            linearLayout.setOrientation(0);
            android.widget.LinearLayout linearLayout2 = this.f44602c;
            com.google.android.material.textfield.TextInputLayout textInputLayout = this.f44601b;
            textInputLayout.addView(linearLayout2, -1, -2);
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
            this.f44604e = frameLayout;
            this.f44602c.addView(frameLayout, -1, new android.widget.FrameLayout.LayoutParams(-2, -2));
            this.f44602c.addView(new androidx.legacy.widget.Space(context, null), new android.widget.LinearLayout.LayoutParams(0, 0, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i17 == 0 || i17 == 1) {
            this.f44604e.setVisibility(0);
            this.f44604e.addView(textView);
            this.f44605f++;
        } else {
            this.f44602c.addView(textView, i17);
        }
        this.f44602c.setVisibility(0);
        this.f44603d++;
    }

    public void b() {
        android.widget.LinearLayout linearLayout = this.f44602c;
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.f44601b;
        if ((linearLayout == null || textInputLayout.getEditText() == null) ? false : true) {
            android.widget.LinearLayout linearLayout2 = this.f44602c;
            android.widget.EditText editText = textInputLayout.getEditText();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.v0.k(linearLayout2, n3.v0.f(editText), 0, n3.v0.e(textInputLayout.getEditText()), 0);
        }
    }

    public void c() {
        android.animation.Animator animator = this.f44606g;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(java.util.List list, boolean z17, android.widget.TextView textView, int i17, int i18, int i19) {
        if (textView == null || !z17) {
            return;
        }
        if (i17 == i19 || i17 == i18) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, i19 == i17 ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(w9.a.f444034a);
            list.add(ofFloat);
            if (i19 == i17) {
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.TRANSLATION_Y, -this.f44607h, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(w9.a.f444037d);
                list.add(ofFloat2);
            }
        }
    }

    public boolean e() {
        return (this.f44609j != 1 || this.f44612m == null || android.text.TextUtils.isEmpty(this.f44610k)) ? false : true;
    }

    public final android.widget.TextView f(int i17) {
        if (i17 == 1) {
            return this.f44612m;
        }
        if (i17 != 2) {
            return null;
        }
        return this.f44616q;
    }

    public void g() {
        this.f44610k = null;
        c();
        if (this.f44608i == 1) {
            if (!this.f44615p || android.text.TextUtils.isEmpty(this.f44614o)) {
                this.f44609j = 0;
            } else {
                this.f44609j = 2;
            }
        }
        j(this.f44608i, this.f44609j, i(this.f44612m, null));
    }

    public void h(android.widget.TextView textView, int i17) {
        android.widget.FrameLayout frameLayout;
        android.widget.LinearLayout linearLayout = this.f44602c;
        if (linearLayout == null) {
            return;
        }
        boolean z17 = true;
        if (i17 != 0 && i17 != 1) {
            z17 = false;
        }
        if (!z17 || (frameLayout = this.f44604e) == null) {
            linearLayout.removeView(textView);
        } else {
            int i18 = this.f44605f - 1;
            this.f44605f = i18;
            if (i18 == 0) {
                frameLayout.setVisibility(8);
            }
            this.f44604e.removeView(textView);
        }
        int i19 = this.f44603d - 1;
        this.f44603d = i19;
        android.widget.LinearLayout linearLayout2 = this.f44602c;
        if (i19 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean i(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.f44601b;
        return n3.x0.c(textInputLayout) && textInputLayout.isEnabled() && !(this.f44609j == this.f44608i && textView != null && android.text.TextUtils.equals(textView.getText(), charSequence));
    }

    public final void j(int i17, int i18, boolean z17) {
        android.widget.TextView f17;
        android.widget.TextView f18;
        if (z17) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f44606g = animatorSet;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            d(arrayList, this.f44615p, this.f44616q, 2, i17, i18);
            d(arrayList, this.f44611l, this.f44612m, 1, i17, i18);
            w9.b.a(animatorSet, arrayList);
            animatorSet.addListener(new com.google.android.material.textfield.b(this, i18, f(i17), i17, f(i18)));
            animatorSet.start();
        } else if (i17 != i18) {
            if (i18 != 0 && (f18 = f(i18)) != null) {
                f18.setVisibility(0);
                f18.setAlpha(1.0f);
            }
            if (i17 != 0 && (f17 = f(i17)) != null) {
                f17.setVisibility(4);
                if (i17 == 1) {
                    f17.setText((java.lang.CharSequence) null);
                }
            }
            this.f44608i = i18;
        }
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.f44601b;
        textInputLayout.l();
        textInputLayout.n(z17, false);
        textInputLayout.q();
    }
}

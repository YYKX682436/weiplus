package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f126133a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 f126134b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f126135c;

    /* renamed from: d, reason: collision with root package name */
    public int f126136d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f126137e;

    /* renamed from: f, reason: collision with root package name */
    public int f126138f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.Animator f126139g;

    /* renamed from: h, reason: collision with root package name */
    public final float f126140h;

    /* renamed from: i, reason: collision with root package name */
    public int f126141i;

    /* renamed from: j, reason: collision with root package name */
    public int f126142j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.CharSequence f126143k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f126144l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f126145m;

    /* renamed from: n, reason: collision with root package name */
    public int f126146n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.CharSequence f126147o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f126148p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f126149q;

    /* renamed from: r, reason: collision with root package name */
    public int f126150r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Typeface f126151s;

    public c(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 c2720x269bcc07) {
        this.f126133a = c2720x269bcc07.getContext();
        this.f126134b = c2720x269bcc07;
        this.f126140h = r0.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561832tw);
    }

    public void a(android.widget.TextView textView, int i17) {
        if (this.f126135c == null && this.f126137e == null) {
            android.content.Context context = this.f126133a;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            this.f126135c = linearLayout;
            linearLayout.setOrientation(0);
            android.widget.LinearLayout linearLayout2 = this.f126135c;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 c2720x269bcc07 = this.f126134b;
            c2720x269bcc07.addView(linearLayout2, -1, -2);
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
            this.f126137e = frameLayout;
            this.f126135c.addView(frameLayout, -1, new android.widget.FrameLayout.LayoutParams(-2, -2));
            this.f126135c.addView(new p012xc85e97e9.p090xbe0af3c9.p092xd1075a44.C1112x4c600e6(context, null), new android.widget.LinearLayout.LayoutParams(0, 0, 1.0f));
            if (c2720x269bcc07.m20398xdb574fcd() != null) {
                b();
            }
        }
        if (i17 == 0 || i17 == 1) {
            this.f126137e.setVisibility(0);
            this.f126137e.addView(textView);
            this.f126138f++;
        } else {
            this.f126135c.addView(textView, i17);
        }
        this.f126135c.setVisibility(0);
        this.f126136d++;
    }

    public void b() {
        android.widget.LinearLayout linearLayout = this.f126135c;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 c2720x269bcc07 = this.f126134b;
        if ((linearLayout == null || c2720x269bcc07.m20398xdb574fcd() == null) ? false : true) {
            android.widget.LinearLayout linearLayout2 = this.f126135c;
            android.widget.EditText m20398xdb574fcd = c2720x269bcc07.m20398xdb574fcd();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.v0.k(linearLayout2, n3.v0.f(m20398xdb574fcd), 0, n3.v0.e(c2720x269bcc07.m20398xdb574fcd()), 0);
        }
    }

    public void c() {
        android.animation.Animator animator = this.f126139g;
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
            ofFloat.setInterpolator(w9.a.f525567a);
            list.add(ofFloat);
            if (i19 == i17) {
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.TRANSLATION_Y, -this.f126140h, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(w9.a.f525570d);
                list.add(ofFloat2);
            }
        }
    }

    public boolean e() {
        return (this.f126142j != 1 || this.f126145m == null || android.text.TextUtils.isEmpty(this.f126143k)) ? false : true;
    }

    public final android.widget.TextView f(int i17) {
        if (i17 == 1) {
            return this.f126145m;
        }
        if (i17 != 2) {
            return null;
        }
        return this.f126149q;
    }

    public void g() {
        this.f126143k = null;
        c();
        if (this.f126141i == 1) {
            if (!this.f126148p || android.text.TextUtils.isEmpty(this.f126147o)) {
                this.f126142j = 0;
            } else {
                this.f126142j = 2;
            }
        }
        j(this.f126141i, this.f126142j, i(this.f126145m, null));
    }

    public void h(android.widget.TextView textView, int i17) {
        android.widget.FrameLayout frameLayout;
        android.widget.LinearLayout linearLayout = this.f126135c;
        if (linearLayout == null) {
            return;
        }
        boolean z17 = true;
        if (i17 != 0 && i17 != 1) {
            z17 = false;
        }
        if (!z17 || (frameLayout = this.f126137e) == null) {
            linearLayout.removeView(textView);
        } else {
            int i18 = this.f126138f - 1;
            this.f126138f = i18;
            if (i18 == 0) {
                frameLayout.setVisibility(8);
            }
            this.f126137e.removeView(textView);
        }
        int i19 = this.f126136d - 1;
        this.f126136d = i19;
        android.widget.LinearLayout linearLayout2 = this.f126135c;
        if (i19 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean i(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 c2720x269bcc07 = this.f126134b;
        return n3.x0.c(c2720x269bcc07) && c2720x269bcc07.isEnabled() && !(this.f126142j == this.f126141i && textView != null && android.text.TextUtils.equals(textView.getText(), charSequence));
    }

    public final void j(int i17, int i18, boolean z17) {
        android.widget.TextView f17;
        android.widget.TextView f18;
        if (z17) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f126139g = animatorSet;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            d(arrayList, this.f126148p, this.f126149q, 2, i17, i18);
            d(arrayList, this.f126144l, this.f126145m, 1, i17, i18);
            w9.b.a(animatorSet, arrayList);
            animatorSet.addListener(new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.b(this, i18, f(i17), i17, f(i18)));
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
            this.f126141i = i18;
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 c2720x269bcc07 = this.f126134b;
        c2720x269bcc07.l();
        c2720x269bcc07.n(z17, false);
        c2720x269bcc07.q();
    }
}

package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.Preference */
/* loaded from: classes11.dex */
public class C21560x1fce98fb implements java.lang.Comparable<com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb> {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public android.text.TextUtils.TruncateAt E;
    public final boolean F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final int f279302J;
    public int K;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f279303d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 f279304e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0 f279305f;

    /* renamed from: g, reason: collision with root package name */
    public final int f279306g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f279307h;

    /* renamed from: i, reason: collision with root package name */
    public int f279308i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f279309m;

    /* renamed from: n, reason: collision with root package name */
    public int f279310n;

    /* renamed from: o, reason: collision with root package name */
    public final int f279311o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.drawable.Drawable f279312p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f279313q;

    /* renamed from: r, reason: collision with root package name */
    public android.os.Bundle f279314r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f279315s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f279316t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f279317u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f279318v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f279319w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f279320x;

    /* renamed from: y, reason: collision with root package name */
    public int f279321y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f279322z;

    /* renamed from: com.tencent.mm.ui.base.preference.Preference$BaseSavedState */
    /* loaded from: classes13.dex */
    public static class BaseSavedState extends android.view.AbsSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb.BaseSavedState> f39412x681a0c0c = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.p0();

        public BaseSavedState(android.os.Parcel parcel) {
            super(parcel);
        }
    }

    public C21560x1fce98fb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this.f279306g = Integer.MAX_VALUE;
        this.f279311o = 0;
        this.f279315s = true;
        this.f279316t = true;
        this.f279318v = true;
        this.f279320x = true;
        this.f279321y = -1;
        this.f279322z = null;
        this.A = 0;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = null;
        this.F = true;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
        this.I = false;
        this.f279302J = 0;
        this.K = 0;
        this.f279303d = context;
        this.f279302J = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561408ho);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528735t, i17, 0);
        for (int indexCount = obtainStyledAttributes.getIndexCount(); indexCount >= 0; indexCount--) {
            int index = obtainStyledAttributes.getIndex(indexCount);
            if (index == 4) {
                this.f279310n = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 5) {
                this.f279311o = obtainStyledAttributes.getColor(index, 0);
            } else if (index == 6) {
                this.f279313q = obtainStyledAttributes.getString(index);
            } else if (index == 13) {
                this.f279308i = obtainStyledAttributes.getResourceId(index, 0);
                this.f279307h = obtainStyledAttributes.getString(index);
                int i18 = this.f279308i;
                if (i18 != 0) {
                    this.f279307h = context.getString(i18);
                }
            } else if (index == 12) {
                this.f279309m = obtainStyledAttributes.getString(index);
                int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                if (resourceId != 0) {
                    this.f279309m = context.getString(resourceId);
                }
            } else if (index == 8) {
                this.f279306g = obtainStyledAttributes.getInt(index, this.f279306g);
            } else if (index == 3) {
                obtainStyledAttributes.getString(index);
            } else if (index == 7) {
                this.G = obtainStyledAttributes.getResourceId(index, this.G);
            } else if (index == 14) {
                this.H = obtainStyledAttributes.getResourceId(index, this.H);
            } else if (index == 2) {
                this.f279315s = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 10) {
                this.f279316t = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 9) {
                this.f279318v = obtainStyledAttributes.getBoolean(index, this.f279318v);
            } else if (index == 1) {
                this.f279319w = obtainStyledAttributes.getString(index);
            } else if (index != 0 && index == 11) {
                this.F = obtainStyledAttributes.getBoolean(index, this.F);
            }
        }
        obtainStyledAttributes.recycle();
        getClass().getName().startsWith("android.preference");
    }

    private void A(android.view.View view, boolean z17) {
        view.setEnabled(z17);
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                A(viewGroup.getChildAt(childCount), z17);
            }
        }
    }

    public void B(int i17) {
        this.f279310n = i17;
        android.graphics.drawable.Drawable drawable = this.f279303d.getResources().getDrawable(i17);
        if ((drawable != null || this.f279312p == null) && (drawable == null || this.f279312p == drawable)) {
            return;
        }
        this.f279312p = drawable;
        s();
    }

    public void C(java.lang.String str) {
        this.f279313q = str;
        if (!this.f279317u || (!android.text.TextUtils.isEmpty(str))) {
            return;
        }
        if (this.f279313q == null) {
            throw new java.lang.IllegalStateException("Preference does not have a key assigned.");
        }
        this.f279317u = true;
    }

    public void D(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 q0Var) {
        this.f279304e = q0Var;
    }

    public void E(int i17) {
        this.A = i17;
        android.widget.ImageView imageView = this.f279322z;
        if (imageView != null) {
            imageView.setVisibility(i17);
        }
    }

    public void G(int i17) {
        H(this.f279303d.getString(i17));
    }

    public void H(java.lang.CharSequence charSequence) {
        if ((charSequence != null || this.f279309m == null) && (charSequence == null || charSequence.equals(this.f279309m))) {
            return;
        }
        this.f279309m = charSequence;
        s();
    }

    public void I(int i17) {
        this.f279321y = i17;
    }

    public void J(int i17) {
        L(this.f279303d.getString(i17));
        this.f279308i = i17;
    }

    public void L(java.lang.CharSequence charSequence) {
        if ((charSequence != null || this.f279307h == null) && (charSequence == null || charSequence.equals(this.f279307h))) {
            return;
        }
        this.f279308i = 0;
        this.f279307h = charSequence;
        s();
    }

    @Override // java.lang.Comparable
    public int compareTo(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb2 = c21560x1fce98fb;
        int i17 = this.f279306g;
        if (i17 != Integer.MAX_VALUE || (i17 == Integer.MAX_VALUE && c21560x1fce98fb2.f279306g != Integer.MAX_VALUE)) {
            return i17 - c21560x1fce98fb2.f279306g;
        }
        java.lang.CharSequence charSequence = this.f279307h;
        if (charSequence == null) {
            return 1;
        }
        java.lang.CharSequence charSequence2 = c21560x1fce98fb2.f279307h;
        if (charSequence2 == null) {
            return -1;
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i18 = length < length2 ? length : length2;
        int i19 = 0;
        int i27 = 0;
        while (i19 < i18) {
            int i28 = i19 + 1;
            int i29 = i27 + 1;
            int lowerCase = java.lang.Character.toLowerCase(charSequence.charAt(i19)) - java.lang.Character.toLowerCase(charSequence2.charAt(i27));
            if (lowerCase != 0) {
                return lowerCase;
            }
            i19 = i28;
            i27 = i29;
        }
        return length - length2;
    }

    public android.os.Bundle i() {
        if (this.f279314r == null) {
            this.f279314r = new android.os.Bundle();
        }
        return this.f279314r;
    }

    public java.lang.String j() {
        return this.f279313q;
    }

    public int k() {
        return this.G;
    }

    public java.lang.String l() {
        java.lang.CharSequence charSequence = this.f279309m;
        return charSequence != null ? charSequence.toString() : "";
    }

    public int m() {
        return this.K;
    }

    public java.lang.CharSequence n() {
        return this.f279309m;
    }

    public java.lang.CharSequence o() {
        return this.f279307h;
    }

    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = u(viewGroup);
        }
        t(view);
        return view;
    }

    public boolean r() {
        return this.f279315s && this.f279320x;
    }

    public void s() {
    }

    public void t(android.view.View view) {
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        android.content.Context context = this.f279303d;
        if (findViewById != null) {
            int i17 = this.f279302J;
            if (i17 > 0) {
                findViewById.setMinimumHeight((int) (i17 * i65.a.A(context)));
            }
            if (this.I) {
                findViewById.setPadding(0, findViewById.getPaddingTop(), findViewById.getPaddingRight(), findViewById.getPaddingBottom());
            }
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        if (textView != null) {
            java.lang.CharSequence o17 = o();
            if (o17 == null || !(o17 instanceof android.text.Spannable)) {
                textView.setMovementMethod(null);
            } else {
                if (this.C) {
                    textView.setClickable(true);
                }
                if (textView.isClickable()) {
                    textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                }
            }
            textView.setText(o17);
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(android.R.id.summary);
        if (textView2 != null) {
            if (!android.text.TextUtils.isEmpty(n())) {
                if (textView2.getVisibility() != 0) {
                    textView2.setVisibility(0);
                }
                if (this.B) {
                    textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                    textView2.setClickable(true);
                    textView2.setText(n(), android.widget.TextView.BufferType.SPANNABLE);
                } else {
                    textView2.setText(n());
                }
                int i18 = this.f279321y;
                if (i18 != -1) {
                    textView2.setTextColor(i18);
                }
                if (this.D) {
                    textView2.setSingleLine();
                }
                android.text.TextUtils.TruncateAt truncateAt = this.E;
                if (truncateAt != null) {
                    textView2.setEllipsize(truncateAt);
                }
            } else if (textView2.getVisibility() != 8) {
                textView2.setVisibility(8);
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(android.R.id.icon);
        if (imageView != null) {
            if (this.f279310n != 0 || this.f279312p != null) {
                if (this.f279312p == null) {
                    this.f279312p = context.getResources().getDrawable(this.f279310n);
                }
                android.graphics.drawable.Drawable drawable = this.f279312p;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    int i19 = this.f279311o;
                    if (i19 != 0) {
                        imageView.getDrawable().setColorFilter(i19, android.graphics.PorterDuff.Mode.SRC_ATOP);
                    }
                }
            }
            imageView.setVisibility(this.f279312p == null ? 8 : 0);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.m38);
        this.f279322z = imageView2;
        if (imageView2 != null) {
            imageView2.setVisibility(this.A);
        }
        if (this.F) {
            A(view, r());
        }
    }

    /* renamed from: toString */
    public java.lang.String m79345x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.CharSequence o17 = o();
        if (!android.text.TextUtils.isEmpty(o17)) {
            sb6.append(o17);
            sb6.append(' ');
        }
        java.lang.CharSequence n17 = n();
        if (!android.text.TextUtils.isEmpty(n17)) {
            sb6.append(n17);
            sb6.append(' ');
        }
        if (sb6.length() > 0) {
            sb6.setLength(sb6.length() - 1);
        }
        return sb6.toString();
    }

    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(this.f279303d);
        android.view.View inflate = b17.inflate(this.G, viewGroup, false);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i17 = this.H;
            if (i17 != 0) {
                b17.inflate(i17, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return inflate;
    }

    public void w(boolean z17) {
        if (this.f279315s != z17) {
            this.f279315s = z17;
            s();
        }
    }

    public C21560x1fce98fb(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.preferenceStyle);
    }

    public C21560x1fce98fb(android.content.Context context) {
        this(context, null);
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* renamed from: com.google.android.gms.common.SignInButton */
/* loaded from: classes13.dex */
public final class ViewOnClickListenerC1723x60c479b4 extends android.widget.FrameLayout implements android.view.View.OnClickListener {

    /* renamed from: COLOR_AUTO */
    public static final int f5861x6b83692b = 2;

    /* renamed from: COLOR_DARK */
    public static final int f5862x6b847af2 = 0;

    /* renamed from: COLOR_LIGHT */
    public static final int f5863x57f18fa = 1;

    /* renamed from: SIZE_ICON_ONLY */
    public static final int f5864x109704f4 = 2;

    /* renamed from: SIZE_STANDARD */
    public static final int f5865x389dd93b = 0;

    /* renamed from: SIZE_WIDE */
    public static final int f5866xc5786051 = 1;
    private int zaa;
    private int zab;
    private android.view.View zac;
    private android.view.View.OnClickListener zad;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.common.SignInButton$ButtonSize */
    /* loaded from: classes6.dex */
    public @interface ButtonSize {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.common.SignInButton$ColorScheme */
    /* loaded from: classes6.dex */
    public @interface ColorScheme {
    }

    public ViewOnClickListenerC1723x60c479b4(android.content.Context context) {
        this(context, null);
    }

    private final void zaa(android.content.Context context) {
        android.view.View view = this.zac;
        if (view != null) {
            removeView(view);
        }
        try {
            this.zac = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zaz.zaa(context, this.zaa, this.zab);
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.AbstractC2033x8ba694e6.RemoteCreatorException unused) {
            int i17 = this.zaa;
            int i18 = this.zab;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1943x38ed87 c1943x38ed87 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1943x38ed87(context, null);
            c1943x38ed87.zaa(context.getResources(), i17, i18);
            this.zac = c1943x38ed87;
        }
        addView(this.zac);
        this.zac.setEnabled(isEnabled());
        this.zac.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener = this.zad;
        if (onClickListener == null || view != this.zac) {
            return;
        }
        onClickListener.onClick(this);
    }

    /* renamed from: setColorScheme */
    public void m17694xa9d2b526(int i17) {
        m17697x53b6de6f(this.zaa, i17);
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        this.zac.setEnabled(z17);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.zad = onClickListener;
        android.view.View view = this.zac;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @java.lang.Deprecated
    /* renamed from: setScopes */
    public void m17695x2230e3a1(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[] c1762x4c04e34Arr) {
        m17697x53b6de6f(this.zaa, this.zab);
    }

    /* renamed from: setSize */
    public void m17696x76500f83(int i17) {
        m17697x53b6de6f(i17, this.zab);
    }

    /* renamed from: setStyle */
    public void m17697x53b6de6f(int i17, int i18) {
        this.zaa = i17;
        this.zab = i18;
        zaa(getContext());
    }

    public ViewOnClickListenerC1723x60c479b4(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @java.lang.Deprecated
    /* renamed from: setStyle */
    public void m17698x53b6de6f(int i17, int i18, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[] c1762x4c04e34Arr) {
        m17697x53b6de6f(i17, i18);
    }

    public ViewOnClickListenerC1723x60c479b4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.zad = null;
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1697x6ba0728b.f5791x60c479b4, 0, 0);
        try {
            this.zaa = obtainStyledAttributes.getInt(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1697x6ba0728b.f5792xf30b15be, 0);
            this.zab = obtainStyledAttributes.getInt(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1697x6ba0728b.f5793x117ae4dd, 2);
            obtainStyledAttributes.recycle();
            m17697x53b6de6f(this.zaa, this.zab);
        } catch (java.lang.Throwable th6) {
            obtainStyledAttributes.recycle();
            throw th6;
        }
    }
}

package com.google.android.gms.common;

/* loaded from: classes13.dex */
public final class SignInButton extends android.widget.FrameLayout implements android.view.View.OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int zaa;
    private int zab;
    private android.view.View zac;
    private android.view.View.OnClickListener zad;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface ButtonSize {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface ColorScheme {
    }

    public SignInButton(android.content.Context context) {
        this(context, null);
    }

    private final void zaa(android.content.Context context) {
        android.view.View view = this.zac;
        if (view != null) {
            removeView(view);
        }
        try {
            this.zac = com.google.android.gms.common.internal.zaz.zaa(context, this.zaa, this.zab);
        } catch (com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException unused) {
            int i17 = this.zaa;
            int i18 = this.zab;
            com.google.android.gms.common.internal.zaaa zaaaVar = new com.google.android.gms.common.internal.zaaa(context, null);
            zaaaVar.zaa(context.getResources(), i17, i18);
            this.zac = zaaaVar;
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

    public void setColorScheme(int i17) {
        setStyle(this.zaa, i17);
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
    public void setScopes(com.google.android.gms.common.api.Scope[] scopeArr) {
        setStyle(this.zaa, this.zab);
    }

    public void setSize(int i17) {
        setStyle(i17, this.zab);
    }

    public void setStyle(int i17, int i18) {
        this.zaa = i17;
        this.zab = i18;
        zaa(getContext());
    }

    public SignInButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @java.lang.Deprecated
    public void setStyle(int i17, int i18, com.google.android.gms.common.api.Scope[] scopeArr) {
        setStyle(i17, i18);
    }

    public SignInButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.zad = null;
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.google.android.gms.base.R.styleable.SignInButton, 0, 0);
        try {
            this.zaa = obtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.SignInButton_buttonSize, 0);
            this.zab = obtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            setStyle(this.zaa, this.zab);
        } catch (java.lang.Throwable th6) {
            obtainStyledAttributes.recycle();
            throw th6;
        }
    }
}

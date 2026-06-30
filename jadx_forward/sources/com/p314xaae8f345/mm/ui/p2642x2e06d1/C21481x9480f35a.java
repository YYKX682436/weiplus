package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMAutoCompleteTextView */
/* loaded from: classes9.dex */
public class C21481x9480f35a extends android.widget.AutoCompleteTextView {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f278842e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f278843d;

    public C21481x9480f35a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563446aj3);
        this.f278843d = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        a();
        if (android.os.Build.VERSION.SDK_INT >= 35 && com.p314xaae8f345.mm.ui.b4.b(getContext())) {
            setLocalePreferredLineHeightForMinimumUsed(false);
        }
        setOnTouchListener(new db5.f1(this));
        addTextChangedListener(new db5.g1(this));
        setOnFocusChangeListener(new db5.h1(this));
    }

    public final void a() {
        if (getText().toString().equals("") || !isFocused()) {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
            return;
        }
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f278843d, getCompoundDrawables()[3]);
    }

    /* renamed from: setSpilter */
    public void m78906x39c4691f(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        addTextChangedListener(new db5.i1(this, str));
    }
}

package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMClearEditText */
/* loaded from: classes5.dex */
public class C21486x59d05a04 extends android.widget.EditText {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f278857i = 0;

    /* renamed from: d, reason: collision with root package name */
    public db5.u1 f278858d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f278859e;

    /* renamed from: f, reason: collision with root package name */
    public int f278860f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f278861g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnTouchListener f278862h;

    public C21486x59d05a04(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278859e = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.c6x, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
        this.f278860f = 0;
        this.f278861g = null;
        this.f278862h = new db5.t1(this);
        a(context);
    }

    public final void a(android.content.Context context) {
        if (this.f278859e == null) {
            this.f278859e = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.c6x, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
        }
        if (android.os.Build.VERSION.SDK_INT >= 35 && com.p314xaae8f345.mm.ui.b4.b(getContext())) {
            setLocalePreferredLineHeightForMinimumUsed(false);
        }
        android.graphics.drawable.Drawable drawable = this.f278859e;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f278859e.getIntrinsicHeight());
        com.p314xaae8f345.mm.ui.yk.a("MicroMsg.MMClearEditText", "imgX width %d height %d", java.lang.Integer.valueOf(this.f278859e.getIntrinsicWidth()), java.lang.Integer.valueOf(this.f278859e.getIntrinsicHeight()));
        b();
        setHeight(this.f278859e.getIntrinsicHeight() + (getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561431ib) * 5));
        setOnTouchListener(this.f278862h);
        addTextChangedListener(new db5.r1(this));
        super.setOnFocusChangeListener(new db5.s1(this));
    }

    public final void b() {
        if (getText().toString().equals("") || !isFocused()) {
            d();
            return;
        }
        db5.u1 u1Var = this.f278858d;
        if (u1Var != null) {
            ((db5.i2) u1Var).a(true);
        }
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f278859e, getCompoundDrawables()[3]);
    }

    public void c(java.lang.String str) {
        int selectionStart = getSelectionStart();
        setText(pg5.d.a(getContext(), str));
        int length = getText().length() - str.length();
        if (length <= 0) {
            setSelection(selectionStart);
            return;
        }
        int i17 = selectionStart + length;
        if (i17 <= getText().length()) {
            setSelection(i17);
        }
    }

    public final void d() {
        db5.u1 u1Var = this.f278858d;
        if (u1Var != null) {
            ((db5.i2) u1Var).a(false);
        }
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
    }

    /* renamed from: getDefaultOnTouchListener */
    public android.view.View.OnTouchListener m78915xb0b52be9() {
        return this.f278862h;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.widget.TextView.SavedState) {
            super.onRestoreInstanceState(android.view.View.BaseSavedState.EMPTY_STATE);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i17);
        if (i17 == 16908322) {
            this.f278860f = 0;
            java.lang.String obj = getText().toString();
            try {
                c(obj);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                com.p314xaae8f345.mm.ui.yk.b("MicroMsg.MMClearEditText", "!!MMClearEditText Exception %d", java.lang.Integer.valueOf(this.f278860f));
                if (this.f278860f < 3) {
                    this.f278860f++;
                    c(" " + obj);
                } else {
                    com.p314xaae8f345.mm.ui.yk.b("MicroMsg.MMClearEditText", "!!MMClearEditText, IndexOutOfBoundsException cannot fix", new java.lang.Object[0]);
                }
            }
        }
        return onTextContextMenuItem;
    }

    /* renamed from: setClearBtnCallBcakListener */
    public void m78916xcc19bcee(db5.u1 u1Var) {
        this.f278858d = u1Var;
    }

    /* renamed from: setClearBtnListener */
    public void m78917x76cc7725(db5.v1 v1Var) {
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f278861g = onFocusChangeListener;
    }

    public C21486x59d05a04(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278859e = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.c6x, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
        this.f278860f = 0;
        this.f278861g = null;
        this.f278862h = new db5.t1(this);
        a(context);
    }
}

package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* renamed from: com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText */
/* loaded from: classes8.dex */
public class C19641xd487040e extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22669xa5de5760 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f271309m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f271310d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.r1 f271311e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f271312f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f271313g;

    /* renamed from: h, reason: collision with root package name */
    public int f271314h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f271315i;

    public C19641xd487040e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f271313g = false;
        this.f271314h = 0;
        this.f271315i = null;
        a();
    }

    public final void a() {
        android.graphics.drawable.Drawable d17 = com.p314xaae8f345.mm.ui.zk.d(getContext(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f_);
        this.f271310d = d17;
        d17.setBounds(0, 0, d17.getIntrinsicWidth(), this.f271310d.getIntrinsicHeight());
        this.f271310d.getIntrinsicWidth();
        this.f271310d.getIntrinsicHeight();
        b();
        setHeight(this.f271310d.getIntrinsicHeight() + (getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561431ib) * 5));
        clearFocus();
        setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.o1(this));
        addTextChangedListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p1(this));
        super.setOnFocusChangeListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.q1(this));
    }

    public final void b() {
        if (getText().toString().equals("") || !(this.f271312f || hasFocus())) {
            setCompoundDrawablesWithIntrinsicBounds(getCompoundDrawables()[0], getCompoundDrawables()[1], (android.graphics.drawable.Drawable) null, getCompoundDrawables()[3]);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f271310d, getCompoundDrawables()[3]);
        }
    }

    public void c(java.lang.String str) {
        int selectionStart = getSelectionStart();
        com.p314xaae8f345.mm.p2614xca6eae71.x1 Di = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di();
        getContext();
        setText(Di.Ri(str, true));
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
            this.f271314h = 0;
            java.lang.String obj = getText().toString();
            try {
                c(obj);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMClearEditText", "!!MMClearEditText Exception %d", java.lang.Integer.valueOf(this.f271314h));
                if (this.f271314h < 3) {
                    this.f271314h++;
                    c(" " + obj);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMClearEditText", "!!MMClearEditText, IndexOutOfBoundsException cannot fix");
                }
            }
        }
        return onTextContextMenuItem;
    }

    /* renamed from: setCallback */
    public void m75361x6c4ebec7(com.p314xaae8f345.mm.p2470x93e71c27.ui.r1 r1Var) {
        this.f271311e = r1Var;
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f271315i = onFocusChangeListener;
    }

    public C19641xd487040e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f271313g = false;
        this.f271314h = 0;
        this.f271315i = null;
        a();
    }
}
